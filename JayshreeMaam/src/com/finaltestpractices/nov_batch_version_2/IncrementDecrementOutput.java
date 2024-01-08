package com.finaltestpractices.nov_batch_version_2;

public class IncrementDecrementOutput {

	public static void main(String[] args) {
		 int i=10, j= 4;
		System.out.println ((i++ + --j + i%++j*++j - j-- + ++i) > (j++ * 2 +i));	
		}
}

