package com.example.songr;

import com.example.songr.models.Album;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SongrApplicationTests {


	@Test
	public void testAlbumConstructorAndGetters() {
		Album album = new Album("Test Album", "Test Artist", 10, 3600, "test.jpg");

		assertEquals("Test Album", album.getTitle());
		assertEquals("Test Artist", album.getArtist());
		assertEquals(10, album.getSongCount());
		assertEquals(3600, album.getLength());
		assertEquals("test.jpg", album.getImageUrl());
	}

	@Test
	public void testAlbumSetters() {
		// Create an Album object
		Album album = new Album("Initial Title", "Initial Artist", 5, 1800, "initial.jpg");

		album.setTitle("New Title");
		album.setArtist("New Artist");
		album.setSongCount(8);
		album.setLength(2400);
		album.setImageUrl("new.jpg");

		assertEquals("New Title", album.getTitle());
		assertEquals("New Artist", album.getArtist());
		assertEquals(8, album.getSongCount());
		assertEquals(2400, album.getLength());
		assertEquals("new.jpg", album.getImageUrl());
	}


	@Test
	void contextLoads() {


	}


}
