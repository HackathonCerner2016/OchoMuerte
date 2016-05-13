package com.cascau.hodor.service;

import com.cascau.hodor.contract.PrepareSongAS;
import com.cascau.hodor.contract.SongRepresentaionResponse;

/**
 *
 * @author cascau_neinvinsu
 */
public class PrepareSongASImpl implements PrepareSongAS {

    @Override
    public SongRepresentaionResponse prepareSong() {
        return new SongRepresentaionResponse();
    }

}
