package problems;

public class HammingDistance {

        public int hammingDistance(int x, int y) {
            String xStr = Integer.toBinaryString(x);
            String yStr = Integer.toBinaryString(y);
            int n = Math.max(xStr.length(), yStr.length());
            while(xStr.length() < n){
                xStr = "0" + xStr;
            }

            while(yStr.length() < n){
                yStr = "0" + yStr;
            }

            int ans = 0;
            int i = 0;

            while(i < n){
                if(xStr.charAt(i) != yStr.charAt(i)){
                    ans++;
                }
                i++;
            }
            return ans;
        }

}
