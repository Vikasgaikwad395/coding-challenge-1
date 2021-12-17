
class  StringFormat{
	public static String reverseString(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}
}
public class StringReverse {
	public static void main(String[] args) {
		 
		System.out.println(StringFormat.reverseString("Python Java"));
	}
}
