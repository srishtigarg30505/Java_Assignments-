public class Q5_GCD {
    public static void main(String[] args){
        int a = 6;
        int b = 3; 
        while(b!= 0){
            int c = a%b ; 
            a = b ; 
            b = c ; 
        }
        System.out.print(a);
    }
}
