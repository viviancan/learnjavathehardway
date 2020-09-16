import java.util.*;
import java.text.SimpleDateFormat;  


public class FirstProg{
	public static void main(String[] args){
		System.out.println("I am learning code");
		
		SimpleDateFormat formatter = new SimpleDateFormat("EEEE, MMMM d, y");
		Date today = new Date();

		System.out.println("Today's date is " + formatter.format(today));
	}
}
