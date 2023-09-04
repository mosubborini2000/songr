package com.example.songr.controller;

import com.example.songr.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.AttributedString;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class AlbumController {



    @GetMapping("/albums")
    public String albums(Model model) {

        List<Album> albums = new ArrayList<>();
        albums.add(new Album("Album 1", "sintara", 10, 3600, "https://wikiimg.tojsiabtv.com/wikipedia/en/thumb/b/b2/My_Way_-_Frank_Sinatra.jpg/1280px-My_Way_-_Frank_Sinatra.jpg"));
        albums.add(new Album("Album 3", "leonard cohen", 12, 4200, "https://images.genius.com/8c656d9d4459e272aad62ec1a38a78bc.600x600x1.jpg"));
        albums.add(new Album("Album 3", "Dean Martin", 8, 3000, "https://i.kfs.io/album/global/146838483,0v1/fit/500x500.jpg"));

        model.addAttribute("albums", albums);
        return "albums.html";

    }
}
