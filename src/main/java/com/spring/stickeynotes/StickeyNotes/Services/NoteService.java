package com.spring.stickeynotes.StickeyNotes.Services;

import com.spring.stickeynotes.StickeyNotes.Entities.Note;

import java.util.List;
import java.util.Map;

public interface NoteService {

    public List<Note> getAllNotes();

    public Note getNote(long id);

    public void addNote(Note note);

    public boolean deleteNote(long id);
}

