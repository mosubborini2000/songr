package com.example.songr.repositres;

import com.example.songr.models.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepo extends JpaRepository<Song,Long> {

}
