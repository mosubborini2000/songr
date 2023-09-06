package com.example.songr.controller;

import com.example.songr.models.Album;
import com.example.songr.repositres.AlbumJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlbumController {



//    @GetMapping("/albums")
//    public String albums(Model model) {
//
//        List<Album> albums = new ArrayList<>();
//        albums.add(new Album("Album 1", "sintara", 10, 3600, "https://wikiimg.tojsiabtv.com/wikipedia/en/thumb/b/b2/My_Way_-_Frank_Sinatra.jpg/1280px-My_Way_-_Frank_Sinatra.jpg"));
//        albums.add(new Album("Album 3", "leonard cohen", 12, 4200, "https://images.genius.com/8c656d9d4459e272aad62ec1a38a78bc.600x600x1.jpg"));
//        albums.add(new Album("Album 3", "Dean Martin", 8, 3000, "https://i.kfs.io/album/global/146838483,0v1/fit/500x500.jpg"));
//
//        model.addAttribute("albums", albums);
//        return "Albums.html";
//
//    }

    @Autowired
    AlbumJpa albumJpa;
    @GetMapping("/albums")
    public String getAlbums(Model model){
        List <Album> albums=albumJpa.findAll();
        model.addAttribute("albums",albums);
        return "Albums.html";
    }

    @PostMapping("/create-album")
    public RedirectView createAlbum(String title,String artist,int songCount,int length,String imageUrl){
        Album newAlbum=new Album(title,artist,songCount,length,imageUrl);
        albumJpa.save(newAlbum);
        return new RedirectView("albums");

    }
//    @DeleteMapping("/albums/{albumId}")
//    public RedirectView deleteAlbum(@PathVariable Long albumId) {
//        albumJpa.deleteById(albumId);
//        return new RedirectView("/albums");
//    }

}
