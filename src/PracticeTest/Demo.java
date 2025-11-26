package PracticeTest;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
        String S = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String temp = "";
            for(int j=start; j<=end; j++){
                temp += S.charAt(j);
            }  
        System.out.println(temp);
    }
}