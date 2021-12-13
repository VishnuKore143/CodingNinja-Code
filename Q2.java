package practical;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

             String str = sc.nextLine();
            char[] ch = str.toCharArray();
            int letter = 0;
            int space = 0;
            int num = 0;
            int otherchat = 0;
            for(int i = 0; i < str.length(); i++){
                if(Character.isLetter(ch[i])){
                    letter ++ ;
                }
                else if(Character.isDigit(ch[i])){
                    num ++ ;
                }
                else if(Character.isSpaceChar(ch[i])){
                    space ++ ;
                }
                else{
                    otherchat ++;
                }
            }
            System.out.println("letter: " + letter);
            System.out.println("space: " + space);
            System.out.println("number: " + num);
            System.out.println("other: " + otherchat);
        }
    }


