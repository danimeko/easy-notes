package com.danimeko.easynotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.danimeko.easynotes.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long>{

}
