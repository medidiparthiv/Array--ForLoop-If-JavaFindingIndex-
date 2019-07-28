import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner x = new Scanner(System.in);
	    String[] input = new String[5];
	    
	    for(int i = 0; i<5; i++){
	        System.out.print("Enter Value Here : ");
	        input[i] = x.nextLine();
        }
        System.out.print("Enter Value you want the Index of : ");
        String word = x.nextLine();
        for (int m = 0; m<5; m++){
            if( word.equals(input[m])){
                System.out.println(m);
        }
	}
}
}