import java.util.HashMap;

public class Problem2 {
	public static void main(String[] args) {
		
		int[] num = {3, 2, 4};
		twoSum(num,6);
		}
	
	public static int[] twoSum(int[]num ,int target) {
		for(int i = 0; i < num.length; i++) {
			for(int j = i + 1; j < num.length; j++) {
				if(num[i]+num[j] == target) {
					System.out.println("FirstIndex is :- "+ i + "\t secondIndex is  :-" + j);
							return new int[] {i,j};
				}
			}
		}
		return new int[] {};
	}	
	
		
		}