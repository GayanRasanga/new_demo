/*public class GetSmallestAndLargest {

    public static void main(String[] args) {
        String smallest = "";
        String largest = "";
        char[] sChars = s.toCharArray();
        String[] ssStrList = new String[s.length()- (k -1)];
        int i = 0;
        while( i+k -1 < s.length() ){
            char[] ssChars= new char[k];
            for( int j =0; j < k ; j++){
                ssChars[j] = sChars[i+j];
            }
            String newItem = new String(ssChars);
            ssStrList[i] = newItem;
            i++;
        }
        java.util.Arrays.sort(ssStrList);
        // System.err.println(java.util.Arrays.toString(ssStrList));
        smallest = ssStrList[0];
        largest = ssStrList[ssStrList.length-1];

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }

}*/
