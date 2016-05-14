package com.cascau.hodor.service;

import com.cascau.hodor.DAO.ChordsEnum;
import com.cascau.hodor.DAO.PositionEnum;
import com.cascau.hodor.contract.Note;
import com.cascau.hodor.contract.PrepareSongAS;
import com.cascau.hodor.contract.SongPart;
import com.cascau.hodor.contract.SongRepresentaionResponse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cascau_neinvinsu
 */
public class PrepareSongASImpl implements PrepareSongAS {

    @Override
    public SongRepresentaionResponse prepareSong() {
        return buildMockedJSON();
    }

    private SongRepresentaionResponse buildMockedJSON() {
        
        SongRepresentaionResponse response = new SongRepresentaionResponse();
        
        List<SongPart> songParts = new ArrayList<>();
        
        SongPart part = new SongPart();
        part.setBpm(120);
        part.setNotesNumber(8);
        List<Note> notes = new ArrayList<>();
        Note note = new Note();
        
        note.setName("A0");
        note.setChord(ChordsEnum.A.getChord());
        note.setPosition(PositionEnum.ZERO.getPosition());
        notes.add(note);
        
        note.setName("E3");
        note.setChord(ChordsEnum.E.getChord());
        note.setPosition(PositionEnum.THREE.getPosition());
        notes.add(note);
        
        note.setName("E3");
        note.setChord(ChordsEnum.E.getChord());
        note.setPosition(PositionEnum.THREE.getPosition());
        notes.add(note);
        
        note.setName("");
        note.setChord(ChordsEnum.EMPTY.getChord());
        note.setPosition(PositionEnum.EMPTY.getPosition());
        notes.add(note);
        
        note.setName("D5");
        note.setChord(ChordsEnum.D.getChord());
        note.setPosition(PositionEnum.FIVE.getPosition());
        notes.add(note);
        
        note.setName("A0");
        note.setChord(ChordsEnum.A.getChord());
        note.setPosition(PositionEnum.ZERO.getPosition());
        notes.add(note);
        
        note.setName("");
        note.setChord(ChordsEnum.EMPTY.getChord());
        note.setPosition(PositionEnum.EMPTY.getPosition());
        notes.add(note);
        
        note.setName("E0");
        note.setChord(ChordsEnum.E.getChord());
        note.setPosition(PositionEnum.ZERO.getPosition());
        notes.add(note);
        
        part.setNotes(notes);   
        songParts.add(part);
               
        part = new SongPart();
        part.setBpm(120);
        part.setNotesNumber(8);
        notes = new ArrayList<>();
        note = new Note();
        
        note.setName("A0");
        note.setChord(ChordsEnum.A.getChord());
        note.setPosition(PositionEnum.ZERO.getPosition());
        notes.add(note);
        
        note.setName("E3");
        note.setChord(ChordsEnum.E.getChord());
        note.setPosition(PositionEnum.THREE.getPosition());
        notes.add(note);
        
        note.setName("E3");
        note.setChord(ChordsEnum.E.getChord());
        note.setPosition(PositionEnum.THREE.getPosition());
        notes.add(note);
        
        note.setName("");
        note.setChord(ChordsEnum.EMPTY.getChord());
        note.setPosition(PositionEnum.EMPTY.getPosition());
        notes.add(note);
        
        note.setName("D5");
        note.setChord(ChordsEnum.D.getChord());
        note.setPosition(PositionEnum.FIVE.getPosition());
        notes.add(note);
        
        note.setName("A0");
        note.setChord(ChordsEnum.A.getChord());
        note.setPosition(PositionEnum.ZERO.getPosition());
        notes.add(note);
        
        note.setName("");
        note.setChord(ChordsEnum.EMPTY.getChord());
        note.setPosition(PositionEnum.EMPTY.getPosition());
        notes.add(note);
        
        note.setName("E0");
        note.setChord(ChordsEnum.E.getChord());
        note.setPosition(PositionEnum.ZERO.getPosition());
        notes.add(note);
        
        part.setNotes(notes);   
        songParts.add(part);
        
        response.setSongParts(songParts);
        
        return response;
    }
}
