package com.Test.Rankmfselenium;

import java.util.LinkedHashSet;

public class removeduplicateelement {

	public static void removeduplicate(int[] a) {
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
		 set.add(a[i]);
			
		}
		System.out.println(set);
				
	
}
	public static void main(String args[])
	{
		int a[]= {5,6,7,5,2,3,5};
		removeduplicate(a);
		
		
	}
}
