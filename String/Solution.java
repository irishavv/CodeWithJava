package String;

public class Solution{
    public static void main(String[] args){
    String s = "codeleet";
    int[] indices = {4,5,6,7,0,2,1,3};
    
    System.out.println(restoreString(s,indices));
    }
    
    static String restoreString(String s, int[] indices) {
        char[] Rcomb = new char[s.length()];
        for(int i = 0; i <s.length(); i++){
            System.out.println(Rcomb);
            Rcomb[indices[i]] = s.charAt(i);
        }
        return String.valueOf(Rcomb);
    }
}