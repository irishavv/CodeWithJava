package Recursion;

public class ReverseNumber {
    public static void main(String[] args){

    }
    static int reverse(int num){
        if(num%10 == num){
            return num;
        }

        return (num%10) ;
    }
}
