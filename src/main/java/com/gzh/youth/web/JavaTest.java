package com.gzh.youth.web;

public class JavaTest {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		change(a,b);
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}

	public static void change(int x,int y){
		System.out.println("a="+x*10);
		System.out.println("b="+y*20);
		System.exit(0);
	}
}
