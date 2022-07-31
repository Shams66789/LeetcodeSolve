class Solution {
    public static char[] reverseString(char[] s) {
        return (reverse(s,0,s.length - 1));
    }

    public static char[] reverse(char[] array, int inital, int end) {
        if (inital >= end){
            return array;
        }
        char s = array[inital];
        array[inital] = array[end];
        array[end] = s;
        inital += 1; end -= 1;
        return reverse(array, inital, end);
    }
}