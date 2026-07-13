class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        // Stack to maintain a decreasing sequence of elements
        Stack<Integer> st = new Stack<>();

        // Stores the next greater element for each value in nums2
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse nums2 from right to left
        for (int i = nums2.length - 1; i >= 0; i--) {

            // Remove all elements smaller than or equal to the current element
            while (!st.isEmpty() && st.peek() <= nums2[i]) {
                st.pop();
            }

            // If stack is empty, no greater element exists
            if (st.isEmpty()) {
                map.put(nums2[i], -1);
            } else {
                // Top of the stack is the next greater element
                map.put(nums2[i], st.peek());
            }

            // Push the current element onto the stack
            st.push(nums2[i]);
        }

        // Build the result for nums1 using the precomputed map
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}

/*
Approach:
1. Traverse nums2 from right to left.
2. Use a monotonic decreasing stack to find the next greater element for every number.
3. Remove all elements from the stack that are smaller than or equal to the current element.
4. If the stack is empty, the current element has no next greater element, so store -1.
5. Otherwise, the top of the stack is the next greater element.
6. Store the result in a HashMap and use it to build the answer for nums1.

Time Complexity:
- O(n + m)
  n = nums2.length
  m = nums1.length

Space Complexity:
- O(n)
  For the stack, HashMap, and result mapping.
*/