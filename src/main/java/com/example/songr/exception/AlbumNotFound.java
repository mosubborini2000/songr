package com.example.songr.exception;

public class AlbumNotFound extends RuntimeException {
    public AlbumNotFound(String message) {
        super(message);
    }
    public AlbumNotFound(Throwable cause) {
        super(cause);
    }
}
