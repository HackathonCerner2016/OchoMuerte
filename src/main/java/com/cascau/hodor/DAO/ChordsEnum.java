/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cascau.hodor.DAO;

/**
 *
 * @author cascau_neinvinsu
 */
public enum ChordsEnum {

    E("E"), A("A"), D("D"), G("G"), EMPTY("");
    
    private final String chord;

    private ChordsEnum(String chord) {
        this.chord = chord;
    }

    public String getChord() {
        return chord;
    }    
}
