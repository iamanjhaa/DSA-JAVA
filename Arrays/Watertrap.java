public class Array {

    public static int trap(int[] height) {

        int n = height.length;

        // Left Max Array
        int[] leftMax = new int[n];
        leftMax[0] = height[0];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Right Max Array
        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // Calculate Trapped Water
        int trapWater = 0;

        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trapWater += waterLevel - height[i];
        }

        return trapWater;
    }

    public static void main(String[] args) {

        int[] height = {4, 2, 0, 6, 3, 2, 5};

        System.out.println("Trapped Water = " + trap(height));
    }
}


// ==========================
// Explanation
// ==========================

// Step 1:
// LeftMax Array banao.
// leftMax[i] = i tak ki sabse badi height.

// Example:
// Height   = [4, 2, 0, 6, 3, 2, 5]
// LeftMax  = [4, 4, 4, 6, 6, 6, 6]

// --------------------------

// Step 2:
// RightMax Array banao.
// rightMax[i] = i se end tak ki sabse badi height.

// Example:
// Height    = [4, 2, 0, 6, 3, 2, 5]
// RightMax  = [6, 6, 6, 6, 5, 5, 5]

// --------------------------

// Step 3:
// Har index par Water Level nikalo.

// Formula:
// waterLevel = Math.min(leftMax[i], rightMax[i]);

// --------------------------

// Step 4:
// Trapped Water nikalo.

// Formula:
// trappedWater = waterLevel - height[i];

// --------------------------

// Step 5:
// Sabhi index ka trapped water add karo.

// Formula:
// totalWater += trappedWater;

// ==========================
// Formula
// ==========================

// Water[i] = min(LeftMax[i], RightMax[i]) - Height[i]

// Easy Trick:
// Water = Smaller Wall - Current Height

// Time Complexity : O(n)
// Space Complexity : O(n)
