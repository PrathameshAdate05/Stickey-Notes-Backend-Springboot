package com.spring.stickeynotes.StickeyNotes.Dao;

import com.spring.stickeynotes.StickeyNotes.Entities.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteDao extends JpaRepository<Note, Long> {
}
