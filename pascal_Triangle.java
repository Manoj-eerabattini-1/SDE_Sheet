// https://leetcode.com/problems/pascals-triangle/description/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 1; i <= numRows; i++) {
            list.add(generateRow(i));
        }
        return list;
    }
    public static List<Integer> generateRow(int row) {
        List<Integer> li = new ArrayList<>();
        int ans = 1;
        li.add(ans);
        for(int i = 1; i < row; i++) {
            ans *= (row - i);
            ans /= i;
            li.add(ans);
        }
        return li;
    }
}
