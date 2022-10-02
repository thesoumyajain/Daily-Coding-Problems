package com.easycode.dailycodingproblems;
import java.util.*;

public class DCP1 {
	static void pairSum(int nums[], int k)
	{
		int n = nums.length;
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<n;i++)
		{
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		for(int i=0;i<n;i++)
		{
			int num = nums[i];
			if(map.containsKey(k-num) == true) {
				System.out.println(num+" "+(k-num));
				return;	//10 and 7 will be returned
			}
		}
	}
	public static void main(String[] args) {
		int nums[] = new int[] {10, 15, 3, 7};
		int k = 17;
		pairSum(nums, k);
	}

}
