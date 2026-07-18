import java.util.*;

public class Anagram {
    public static void main(String[] args){
        String str1 = "Amanjha";
        String str2 = "Jamahan";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() != str2.length()){
            System.out.println("not annagram");
            return;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("yes annagram");
        }else{
            System.out.println("not annagram");
        }

    }
}
