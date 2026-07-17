import java.util.Scanner;


public class palindrome {

    public static boolean isPlindrome(char[] s){
        int start  = 0;
        int end = s.length-1;

        while(start<end){
            if(s[start] !=s[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter character :");
        String str = sc.nextLine();
        char[] arr = str.toCharArray();

        if(isPlindrome(arr)){
            System.out.println("palindrome");

        }else{
            System.out.println("not palindrome");
        }

        sc.close();
    }
}
