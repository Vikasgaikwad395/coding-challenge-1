package com.vkg.Question2;

import java.util.Scanner;

public class Question3 {
	public static int mostWater(int[] heights) {
       
		int water = 0;
        int i = 0;
        int  j = heights.length - 1;
        while(i < j){
            int w = j - i;
            int h =Math.min(heights[i],heights[j]);
            water = Math.max(water,h*w);
            
            if(heights[i] < heights[j]) {
            	i++;
            }else {
            	j--;
            }
        }
        return water;
    }


    public static void main(String[] args) {
      
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the no of height:- ");
        int n = scn.nextInt();
        System.out.println("Enter the Heights");
        int[] heights = new int[n];
        for(int i = 0; i < n; i++) {
            heights[i] = scn.nextInt();
        }

        int res = mostWater(heights);
        System.out.println(res);
    }

}
