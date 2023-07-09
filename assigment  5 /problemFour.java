class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
           List<Integer> distinctNums1 = new ArrayList<>();
        List<Integer> distinctNums2 = new ArrayList<>();

        // Find distinct integers in nums1 not present in nums2
        for (int i = 0; i < nums1.length; i++) {
            boolean present = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    present = true;
                    break;
                }
            }
            if (!present && !distinctNums1.contains(nums1[i])) {
                distinctNums1.add(nums1[i]);
            }
        }

        // Find distinct integers in nums2 not present in nums1
        for (int i = 0; i < nums2.length; i++) {
            boolean present = false;
            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    present = true;
                    break;
                }
            }
            if (!present && !distinctNums2.contains(nums2[i])) {
                distinctNums2.add(nums2[i]);
            }
        }

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(distinctNums1);
        answer.add(distinctNums2);

        return answer;
    }
}
