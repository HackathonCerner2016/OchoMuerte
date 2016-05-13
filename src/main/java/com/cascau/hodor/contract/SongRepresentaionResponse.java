package com.cascau.hodor.contract;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author cascau_neinvinsu
 */
public class SongRepresentaionResponse implements Serializable {

    public static final Long serialVersionUID = 123456789L;
    
    private List<SongPart> songParts;

    public List<SongPart> getSongParts() {
        return songParts;
    }

    public void setSongParts(List<SongPart> songParts) {
        this.songParts = songParts;
    }
}
