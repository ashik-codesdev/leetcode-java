/*
LeetCode 11 - Container With Most Water

Difficulty: Medium

Approach:
- Use a Two-Pointer strategy placing `left` pointer at start (0) and `right` pointer at end (n - 1).
- At each step, calculate `currentArea = min(height[left], height[right]) * (right - left)`.
- Update `maxArea` if `currentArea` is larger.
- Shift the pointer with the smaller height inward (since width decreases, area can only increase if height increases).

Time Complexity: O(n) - Single pass with two pointers.
Space Complexity: O(1) - Constant space utilized.
*/

package Medium;

public class P0011_ContainerWithMostWater {

    /**
     * Calculates the maximum area of water a container can hold.
     *
     * @param height Array of non-negative integers representing vertical lines.
     * @return Maximum water container volume.
     */
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int width = right - left;
            int currentArea = h * width;

            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer corresponding to the shorter bar
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    // Driver main method for local testing
    public static void main(String[] args) {
        P0011_ContainerWithMostWater solution = new P0011_ContainerWithMostWater();

        int[] height1 = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println("Test 1 Result: " + solution.maxArea(height1) + " (Expected: 49)");

        int[] height2 = { 1, 1 };
        System.out.println("Test 2 Result: " + solution.maxArea(height2) + " (Expected: 1)");
    }
}
