package com.cascau.hodor.contract;

/**
 *
 * @author cascau_neinvinsu
 */
public class Note {

    private String name;
    private String chord;
    private Integer position;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChord() {
        return chord;
    }

    public void setChord(String chord) {
        this.chord = chord;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }    
}
