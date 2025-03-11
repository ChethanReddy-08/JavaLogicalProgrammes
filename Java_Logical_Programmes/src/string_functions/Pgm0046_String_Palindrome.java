package string_functions;

public class Pgm0046_String_Palindrome {
public static void main(String[] args) {
	String s = "racecar";
	String rev ="";
	char[]ch = s.toCharArray();
	for(int i=ch.length-1; i>=0; i--) {
		rev =rev+ch[i];
	}
	if(s.equals(rev)){
		System.out.println("It is a String Palindrome");
	}
	else {
		System.out.println("It is not a String Palindrome");
	}

	String ಅ = "ಗದಗ";
	String ಕ ="";
	char[]ಚ = ಅ.toCharArray();
	for(int i=ಚ.length-1; i>=0; i--) {
		ಕ =ಕ+ಚ[i];
	}
	if(ಅ.equals(ಕ)){
		System.out.println("ಈ ಪದ ಒಂದು ಸ್ಟ್ರಿಂಗ್ ಪಾಲಿಂಡ್ರೋಮ್");
	}
	else {
		System.out.println("ಈ ಪದ ಸ್ಟ್ರಿಂಗ್ ಪಾಲಿಂಡ್ರೋಮ್ ಅಲ್ಲ");
	}
}
}
