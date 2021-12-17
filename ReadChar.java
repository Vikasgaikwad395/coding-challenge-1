import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadChar {
	public static void main(String[] args) throws Exception {
		String input = "Java is fun";
		
		int wordCount = 0;
		int characterCount = 0;
		{
			characterCount = input.length();
		}
		
		System.out.println(input.length());
		System.out.println(characterCount);
	}

}
