package validationemail;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Validationemail {
	public static void main(String[] args) {
		String regex="^(.+)@(.+)$";
		String[]strarray=new String[8];
		Scanner Str=new Scanner(System.in);
		System.out.println("Enter email address");
		String a=Str.nextLine();
		
		
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(a);
		
		if(m.matches()) {
			System.out.println("Entered mail is valid");
		}
		else {
			System.out.println("not valid");
		}
		

	}
	
}


