import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class FileInput {
	public static void main(String[] args) throws Exception {
			File file  = new File("D:\\Workspaces\\Industrial Training Workspace\\Coding Challenge\\src\\abc.txt");
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			String line;
			int wordCount = 0;
			int characterCount = 0;
			int paraCount = 0;
			int sentenceCount = 0;
			
			while((line = br.readLine()) != null) {
				if(line.equals("")) {
					paraCount +=1;
				}else {
					characterCount += line.length();
					String words[] = line.split("\\s+");
					wordCount += words.length;
					String sentence[] = line.split("[!?.:]+");
					sentenceCount += sentence.length;
					
				}
			}
			if(sentenceCount >= 1) {
				paraCount++;				
			}
			System.out.println("Lines:- "+sentenceCount);
			System.out.println("Words:- "+wordCount);
			System.out.println("Character:- "+characterCount);
	
	
	
	}
}