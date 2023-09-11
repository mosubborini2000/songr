package com.example.songr;

import com.example.songr.models.Album;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
class SongrApplicationTests {

	Album test = new Album();
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

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldReturnDefaultMessage() throws Exception {
		this.mockMvc.perform(get("/hello")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("hello")));
	}


	@Test
	void contextLoads() {


	}


}
