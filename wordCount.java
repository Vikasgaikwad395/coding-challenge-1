
public class wordCount {
	static int wordCount(String str, String word){
			int count = 0;
			String a[] = str.split("");
			
 			for(int i = 0; i < a.length; i++) {
			if(word.equals(a[i]))
				count++;
			}
		return count;
	}
	public static void main(String[] args) {
		String str = "Java is Fun";
		String word = "Portal";
		System.out.println(wordCount(str, word)+"\t Java:-"+wordCount(str, word)+"\t is:-"+wordCount(str, word)+"\t Fun:-"+wordCount(str, word));
	}

}
