import java.util.Scanner;

public class TwoSum {
	private static int[] findTwoSum_BruteForce(int[] nums, int target) {
		for(int i = 0; i <nums.length; i++) {
			for(int j = i + 1; j <nums.length; j++) {
				if(nums[i] + nums[j] == target) {
					return new int[] {i,j};
					
				}
			}
		}
		return new int [] {};
		
	}
	public static void main(String[] args) {
		
		
		System.out.println("Enter the number :- ");
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[] nums = new int [n];
		
		for(int i = 0; i < n; i++) {
			nums[i] = in.nextInt();
		}
				System.out.println("Enter a target :- ");
				int target = in.nextInt();
		
		in.close();
		
		int[] indices  = findTwoSum_BruteForce(nums, target);
		if(indices.length == 2) {
			System.out.println("Output :- "+"["+indices[0] + " , "+ indices[1]+"]");
		}else {
			System.out.println("No solution found...............!!");
		}
	}

}
