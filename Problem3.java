public class Problem3 {

    public int lengthOfLongestSubstring(String s) {

        String result = "";
        int count = 0;
        int longest_count = 0;

        for(int i = 0; i < s.length() - 1; i++) {

            if(result.contains(s.substring(i,i+1))) {

                longest_count = count;
                count = 0;

            }else {

                result = result + s.charAt(i);
                count++;    

            } 

        }

        return longest_count;
        
    }
    
}
