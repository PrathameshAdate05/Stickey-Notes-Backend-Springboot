package com.spring.stickeynotes.StickeyNotes.Controller;

import com.spring.stickeynotes.StickeyNotes.Entities.Note;
import com.spring.stickeynotes.StickeyNotes.Services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    NoteService noteService;

    @GetMapping("/notes")
    public List<Note> getAllNotes(){
        return this.noteService.getAllNotes();
    }

    @GetMapping("/notes/{id}")
    public Note getNote(@PathVariable String id){
        return this.noteService.getNote(Long.parseLong(id));
    }

    @PostMapping("/notes")
    public String addNote(@RequestBody Note note){
        this.noteService.addNote(note);
        return "Note Saved Successfully";
    }

    @DeleteMapping("/notes/{id}")
    public String deleteNote(@PathVariable String id){
        boolean status = this.noteService.deleteNote(Long.parseLong(id));
        if (status)
            return "Note Deleted";
        return "Note not Found";
    }
}
