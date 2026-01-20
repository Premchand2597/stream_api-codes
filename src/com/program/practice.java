package com.program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class practice {
	
	Scanner sc = new Scanner(System.in);

	/*public static int countNumberOfCharacters(String s, char c) {
		int count = 0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == c) {
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String s = sc.nextLine();
		System.out.println("Enter a char");
		char c = sc.nextLine().charAt(0);

		int count = practice.countNumberOfCharacters(s, c);
		
		System.out.println(count);
	}*/
	
//	public static void main(String[] args) {
//		String s = "prem";
//		String s1 = "";
//		for(int i=0; i<s.length(); i++) {
//			char c = s.charAt(i);
//			s1 = c + s1;
//		}
//		
////		for(int i=s.length()-1; i>=0; i--) {
////			s1 += s.charAt(i);
////		}
//		
//		System.out.println(s1);
//	}
	
   public static void main(String[] args) {
	   practice obj = new practice();
//	int a[] = {20, 30, 12, 6, 45, 22, 78, 65, 34};
	
//	Arrays.sort(a);
//	
//	for(int i=0; i<a.length; i++) {
//		System.out.println(a[i]);
//	}
	   
//	   System.out.println("Enter a size of an array");
//	   int n  = obj.sc.nextInt();
//	   int a[] = new int[n];
//	   System.out.println("Enter elements of an array");
//	   for(int i=0; i<a.length; i++) {
//		   a[i] = obj.sc.nextInt();
//	   }
//	   obj.sc.nextLine();
//	   System.out.println("Enter ordering of an array: asc or desc?");
//	   String order = obj.sc.nextLine();
//	   
//	   if(order != null) {
//		   if("asc".equals(order)) {
//			   for(int i=0; i<a.length; i++) {
//				   for(int j=i+1; j<a.length; j++) {
//					   if(a[i]>a[j]) {
//						   int t = a[i];
//						   a[i] = a[j];
//						   a[j] = t;
//					   }
//				   }
//			   }
//			   
//			   for(int k=0; k<a.length; k++) {
//				   System.out.print(a[k]+" ");
//			   }
//		   }else {
//			   for(int i=0; i<a.length; i++) {
//				   for(int j=i+1; j<a.length; j++) {
//					   if(a[i]<a[j]) {
//						   int t = a[i];
//						   a[i] = a[j];
//						   a[j] = t;
//					   }
//				   }
//			   }
//			   
//			   for(int k=0; k<a.length; k++) {
//				   System.out.print(a[k]+" ");
//			   }
//		   }
//	   }
	   
//	   int t = 0;
//	   System.out.println("Enter a number");
//	   int n = obj.sc.nextInt();
//	   for(int i=2; i<=n; i++) {
//		   if(n%i==0) {
//			   t++;
//		   }
//	   }
//	   
//	   if(t == 1) {
//		   System.out.println("prime");
//	   }else {
//		   System.out.println("Not a prime");
//	   }
	   
	   
//	   System.out.println("Enter a string 1");
//	   String s1 = obj.sc.nextLine();
//	   System.out.println("Enter a string 2");
//	   String s2 = obj.sc.nextLine();
//	
//	   s1 = s1.toLowerCase();
//	   s2  = s2.toLowerCase();
//	   
//	   char c1[] = s1.toCharArray();
//	   char c2[] = s2.toCharArray();
//	   
//	   System.out.println(c1.toString()+" "+c2.toString());
//	   
//	   Arrays.sort(c1);
//	   Arrays.sort(c2);
//	   
//	   if(Arrays.equals(c1, c2)) {
//		   System.out.println("Anagram");
//	   }else {
//		   System.out.println("Not");
//	   }
	   
	   
//	   String a[] = {"Prem", "prem", "hola", "India", "india"};
//	   Set<String> s = new HashSet<String>();
//	   for(String data : a) {
//		   s.add(data.toLowerCase());
//	   }
//	   
//	   System.out.println(s);
	   
//	   String s = "aaaaaaabbbbbccccc";
//	   Set<String> hs = new HashSet<String>();
//	   for(int i=0; i<s.length(); i++) {
//		   char c = s.charAt(i);
//		   hs.add(String.valueOf(c));
//	   }
//	   
//	   for(String data : hs) {
//		   System.out.print(data+"");
//	   }
//	   int a[] = new int[256]; //ASCII range
//	   System.out.println("Enter a string to check frequency");
//	   String str = obj.sc.nextLine();
//	   String s = str.toLowerCase();
//	   
//	   for(int i=0; i<s.length(); i++) {
//		   char c = s.charAt(i);
//		   if(c != ' ') {
//			   a[c]++;
//		   }
//	   }
//	   
//	   for(int i=0; i<a.length; i++) {
//		   if(a[i]!=0) {
//			   System.out.println((char)i+" : "+a[i]);
//		   }
//	   }
	   
//	   System.out.println("Enter a number to give prime number range");
//	   int n = obj.sc.nextInt();
//	   for(int i=2; i<=n; i++) {
//		   int count = 0;
//		   for(int j=2; j<=i; j++) {
//			   if(i%j == 0) {
//				   count++;
//			   }
//		   }
//		   if(count == 1) {
//			   System.out.print(i+" ");
//		   }
//	   }
	   
//	   int f=1, i=1;
//	   System.out.println("ENter a number for factorial");
//	   int n = obj.sc.nextInt();
//	   while(i<n) {
//		   f=f*i;
//		   i++;
//	   }
//	   System.out.println(f);
	   
//	   System.out.println("Enter first string");
//	   String s1 = obj.sc.nextLine().toLowerCase();
//	   System.out.println("Enter second string");
//	   String s2 = obj.sc.nextLine().toLowerCase();
//	   char[] str1 = s1.toCharArray();
//	   char[] str2 = s2.toCharArray();
//	   Arrays.sort(str2);
//	   Arrays.sort(str1);
//	   if(Arrays.equals(str1, str2)) {
//		   System.out.println("Anagram");
//	   }else {
//		   System.out.println("Not anagram");
//	   }
	   
//	   String str = "Premchand", rev="";
//	   for(int i=str.length()-1; i>=0; i--) {
//		   rev = rev + str.charAt(i);
//	   }
//	   System.out.println(rev);
}

}
