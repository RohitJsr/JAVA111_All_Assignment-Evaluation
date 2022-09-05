package com.masaiQ2;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
	public List<Song> songs = new ArrayList<>();
	
	public void addSong(Song song) {
		if(songs.contains(song)) {
			System.out.println("Song already added!");
		}
		else {
			songs.add(song);
			System.out.println("Song added playlist succesfully!");
		}
		
	}

}
