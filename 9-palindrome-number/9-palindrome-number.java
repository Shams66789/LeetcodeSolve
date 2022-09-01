class Solution {
    public boolean isPalindrome(int x) {
        char[] array = String.valueOf(x).toCharArray();
        int end = array.length -1;
        for (int i = 0; i < array.length; i++) {
            if (i >= end) {
                return true;
            }
            if (array[i] != array[end]){
                return false;
            }
            end--;
        }
        return true;
    }
}