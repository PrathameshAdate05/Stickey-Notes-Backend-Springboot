package com.spring.stickeynotes.StickeyNotes.Services;

import com.spring.stickeynotes.StickeyNotes.Dao.NoteDao;
import com.spring.stickeynotes.StickeyNotes.Entities.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService{

    @Autowired
    private NoteDao noteDao;

    @Override
    public List<Note> getAllNotes() {
        return noteDao.findAll();
    }

    @Override
    public Note getNote(long id) {
        return noteDao.findById(id).orElse(null);
    }

    @Override
    public void addNote(Note note) {
        noteDao.save(note);
    }

    @Override
    public boolean deleteNote(long id) {
        Note note = noteDao.findById(id).orElse(null);

        if (note == null)
            return false;
        this.noteDao.delete(note);
        return true;
    }
}
