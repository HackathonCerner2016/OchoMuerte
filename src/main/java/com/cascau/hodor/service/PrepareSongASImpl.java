package com.cascau.hodor.service;

import com.cascau.hodor.contract.PrepareSongAS;
import com.cascau.hodor.contract.SongRepresentaionResponse;
import java.util.Map;

/**
 *
 * @author cascau_neinvinsu
 */
public class PrepareSongASImpl implements PrepareSongAS {

    private Map notesMap;
    
    @Override
    public SongRepresentaionResponse prepareSong() {
        return mockJson();
    }

    public Map getNotesMap() {
        return notesMap;
    }

    public void setNotesMap(Map notesMap) {
        this.notesMap = notesMap;
    }
    
    private SongRepresentaionResponse mockJson() {
        
        return null;
    }
}
