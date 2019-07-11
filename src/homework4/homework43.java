package homework4;
import java.util.Scanner;
public class homework43 {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Введите текст: ");
	        String text = sc.nextLine();

	        word(text);


	    }

	    public static String word(String str) {

	        int word = 0;
	        if(str.length() != 0){
                word++;}
	      

	        for (int i = 0; i < str.length(); i++) {

	            if (str.charAt(i) == ' ') {
	               word++;

	            }
	        }
	        
	        System.out.println("Текст состоит из " + word + " слов");
	        return str;
	        
	    }
	}

