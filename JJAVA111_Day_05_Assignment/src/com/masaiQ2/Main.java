package com.masaiQ2;

public class Main {
	
	void main(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			System.out.println(ch+"  is vowel");
		}
		else if((ch>='a'&& ch<='z')||ch>='A'&& ch<='Z') {
			System.out.println(ch+"  is constant");
		}
		else {
			System.out.println("Invalid character");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main q1=new Main();
		q1.main('e');
		q1.main('N');
		q1.main('@');

	}

}
