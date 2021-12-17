import java.util.HashMap;

public class Question1 {
	public static void main(String[] args) {
		
		int[] num = {2, 7, 11, 15};
		twoSum(num,9);
		}
	
	public static int[] twoSum(int[]num ,int target) {
		for(int i = 0; i < num.length; i++) {
			for(int j=i+1; j < num.length; j++) {
				if(num[i]+num[j] == target) {
					System.out.println("FirstIndex is :- "+ i + "\t secondIndex is  :-" + j);
					System.out.println("Becuase num [0]+num[1] ==9, we return [0,1]");
					return new int[] {i,j};
				}
			}
		}
		return new int[] {};
	}	
	
		
		}