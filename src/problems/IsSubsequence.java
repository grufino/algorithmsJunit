package problems;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int left = 0;
        int right = 0;
        int rightN = t.length();
        int leftN = s.length();
        while(right < rightN && left < leftN){
            char curL = s.charAt(left);
            char curR = t.charAt(right);

            if(curL == curR){
                left++;
                right++;
            } else {
                right++;
            }
        }

        if(left == leftN){
            return true;
        } else return false;
    }
}
