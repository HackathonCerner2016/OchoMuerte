package com.cascau.hodor.service;

import com.cascau.hodor.contract.PrepareSongAS;
import com.cascau.hodor.contract.SongRepresentaionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;

/**
 *
 * @author cascau_neinvinsu
 */
public class PrepareSongASImpl implements PrepareSongAS {

    @Override
    public SongRepresentaionResponse prepareSong() {
        return new SongRepresentaionResponse();
    }

    @Autowired
    private ResourceLoader resourceLoader;
}
