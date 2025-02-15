import java.util.Scanner;
public class VowelsOrConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // -> a,e,i,o,u OR A,E,I,O,U are known as Vowels
        // -> Other Alphabetic characters are known as Consonant
        System.out.println("Enter the Character :");
        char ch=sc.next().charAt(0);
        //sc.next() → Reads a String (first word).
        // .charAt(0) → Extracts the first character.
        if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println(ch+" is a Vowel");
        }
        else {
            System.out.println(ch+" is a Consonant");
        }
    }
}
