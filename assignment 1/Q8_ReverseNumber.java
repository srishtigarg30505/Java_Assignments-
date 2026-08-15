public class Q8_ReverseNumber {
    public static void main(String[] args){
        int a = 59;
        int rem = a % 10 ;
        int q = a/10;
        int rev = rem*10 + q;
        System.out.print("Reversed: " + rev);
    }
}
