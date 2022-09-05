package com.masaiQ2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		PlayList list=new PlayList();
		System.out.println("Enter the num of song ");
		int num=sc.nextInt();
		int count=1;
		
		for(int i=0;i<num;i++) {
			System.out.println("Enter MoviName");
			String movie=sc.nextLine();
			System.out.println("Enter song Name");
			String song=sc.nextLine();
			
			Song song1=new Song(movie,song);
			list.addSong(song1);
						
		}
	
		for(int i=0;i<list.songs.size();i++) {
			Song song11=list.songs.get(i);
			song11.play();
		}
		
	}

}
