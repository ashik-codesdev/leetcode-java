
package Hard;

public class P0042_TrappingRainWater {

    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int totalWater = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    totalWater += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    totalWater += rightMax - height[right];
                }
                right--;
            }
        }

        return totalWater;
    }

    public static void main(String[] args) {
        P0042_TrappingRainWater solution = new P0042_TrappingRainWater();

        int[] height1 = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println("Test 1 Result: " + solution.trap(height1) + " (Expected: 6)");

        int[] height2 = { 4, 2, 0, 3, 2, 5 };
        System.out.println("Test 2 Result: " + solution.trap(height2) + " (Expected: 9)");
    }
}
