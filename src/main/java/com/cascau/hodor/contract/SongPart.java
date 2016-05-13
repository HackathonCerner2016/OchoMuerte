package com.cascau.hodor.contract;

import java.util.List;

/**
 *
 * @author cascau_neinvinsu
 */
public class SongPart {

    private Integer bpm;
    private Integer notesNumber;
    private List<Note> notes;

    public Integer getBpm() {
        return bpm;
    }

    public void setBpm(Integer bpm) {
        this.bpm = bpm;
    }

    public Integer getNotesNumber() {
        return notesNumber;
    }

    public void setNotesNumber(Integer notesNumber) {
        this.notesNumber = notesNumber;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }
}
