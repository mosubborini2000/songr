package com.example.songr.controller;

import com.example.songr.exception.AlbumNotFound;
import com.example.songr.models.Album;
import com.example.songr.models.Song;
import com.example.songr.repositres.AlbumJpa;
import com.example.songr.repositres.SongRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongController {
    @Autowired
    SongRepo songRepo;
    @Autowired
    AlbumJpa albumJpa;
    @GetMapping("/songs")
    public String getSongs(Model model){
        List<Song> songs=songRepo.findAll();
        model.addAttribute("songs",songs);
        return "songs.html";
    }

    @PostMapping("/add_song")
    public RedirectView addSong(String title, int length, int trackNumber,Long albumId){
        Album album=albumJpa.findById(albumId).orElseThrow(() -> new AlbumNotFound("Could not find album  for this song in db!"));
Song song=new Song(title,length,trackNumber,album);
songRepo.save(song);
return new  RedirectView("/albums");

    }





}
