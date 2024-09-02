package com.nandhababuks.javaCodingPractice;

public class ApplyOperationstoanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 847, 847, 0, 0, 0, 399, 416, 416, 879, 879, 206, 206, 206, 272 };

		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] == nums[i + 1]) {

				nums[i] = 2 * nums[i];
				nums[i + 1] = 0;

			}

		}

		int number = 1;
		int k = 0;
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {

				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				j++;
			}
			
		}

	}
}
