/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cascau.hodor.controller;

import com.cascau.hodor.contract.PrepareSongAS;
import com.cascau.hodor.contract.SongRepresentaionResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author cascau_neinvinsu
 */
@Controller
public class MainController {
    
    private static final String VIEW_NAME = "main";
    
    private PrepareSongAS prepareSongAS;
    
    @RequestMapping("/")
    public ModelAndView prepareSong(HttpServletResponse httpResponse) throws ServletException, IOException {
        
        final ModelAndView response = new ModelAndView();
        ServletOutputStream stream = null;
        
        final SongRepresentaionResponse song = getPrepareSongAS().prepareSong();
        
        //test audio mockup added*********************************************************************
        //get the filename from the "file" parameter
//        String fileName = "C:\\Users\\MI043912\\Documents\\GitHub\\OchoMuerte\\src\\main\\resources\\midi\\1.mp3";
//      
//        // add the .mp3 suffix if it doesn't already exist
//        if (fileName.indexOf(".mp3") == -1)
//           fileName = fileName + ".mp3";
//          
//        BufferedInputStream buf = null;
//        try{
//     
//            stream = httpResponse.getOutputStream();
//            File mp3 = new File(fileName);
//     
//            //set response headers
//            httpResponse.setContentType("audio/mpeg");
//      
//            httpResponse.addHeader(
//            "Content-Disposition","attachment; filename="+"1.mp3" );
//                                                        //^^^^^ HARD CODED!!!!!!!!!1
//            httpResponse.setContentLength( (int) mp3.length() );
//      
//            FileInputStream input = new FileInputStream(mp3);
//            buf = new BufferedInputStream(input);
//            int readBytes = 0;
//
//            
//            //read from the file; write to the ServletOutputStream
//            while((readBytes = buf.read( )) != -1){
//                System.out.println(readBytes);
//                stream.write(readBytes);
//            }
//           // WriteWaveFileHeader(stream, input.getChannel().size(), readBytes, 44100, 2, 176400);
//        } catch (IOException ioe){
//     
//            throw new ServletException(ioe.getMessage( ));
//         
//        } finally {
//     
//            //close the input/output streams
//            if(stream != null)
//                stream.close();
//
//            if(buf != null)
//                buf.close();
//
//          }
        //end of audio added stuff********************************************************************
        
        ObjectMapper mapper = new ObjectMapper();
        //Object to JSON in file
        mapper.writeValue(new File("C:\\Users\\"+ System.getProperty("user.name") + "\\file.json"), song);
        
        response.addObject("song", mapper);
        
        response.setViewName(VIEW_NAME);
        return response;
    }
    
    private void WriteWaveFileHeader(
                    ServletOutputStream out, long totalAudioLen,
                    long totalDataLen, long longSampleRate, int channels,
                    long byteRate) throws IOException {

            byte[] header = new byte[44];

            header[0] = 'R';  // RIFF/WAVE header
            header[1] = 'I';
            header[2] = 'F';
            header[3] = 'F';
            header[4] = (byte) (totalDataLen & 0xff);
            header[5] = (byte) ((totalDataLen >> 8) & 0xff);
            header[6] = (byte) ((totalDataLen >> 16) & 0xff);
            header[7] = (byte) ((totalDataLen >> 24) & 0xff);
            header[8] = 'W';
            header[9] = 'A';
            header[10] = 'V';
            header[11] = 'E';
            header[12] = 'f';  // 'fmt ' chunk
            header[13] = 'm';
            header[14] = 't';
            header[15] = ' ';
            header[16] = 16;  // 4 bytes: size of 'fmt ' chunk
            header[17] = 0;
            header[18] = 0;
            header[19] = 0;
            header[20] = 1;  // format = 1
            header[21] = 0;
            header[22] = (byte) channels;
            header[23] = 0;
            header[24] = (byte) (longSampleRate & 0xff);
            header[25] = (byte) ((longSampleRate >> 8) & 0xff);
            header[26] = (byte) ((longSampleRate >> 16) & 0xff);
            header[27] = (byte) ((longSampleRate >> 24) & 0xff);
            header[28] = (byte) (byteRate & 0xff);
            header[29] = (byte) ((byteRate >> 8) & 0xff);
            header[30] = (byte) ((byteRate >> 16) & 0xff);
            header[31] = (byte) ((byteRate >> 24) & 0xff);
            header[32] = (byte) (2 * 16 / 8);  // block align
            header[33] = 0;
            header[34] = 4;  // bits per sample
            header[35] = 0;
            header[36] = 'd';
            header[37] = 'a';
            header[38] = 't';
            header[39] = 'a';
            header[40] = (byte) (totalAudioLen & 0xff);
            header[41] = (byte) ((totalAudioLen >> 8) & 0xff);
            header[42] = (byte) ((totalAudioLen >> 16) & 0xff);
            header[43] = (byte) ((totalAudioLen >> 24) & 0xff);

            out.write(header, 0, 44);
    }

    public void setPrepareSongAS(PrepareSongAS prepareSongAS) {
        this.prepareSongAS = prepareSongAS;
    }

    public PrepareSongAS getPrepareSongAS() {
        return prepareSongAS;
    }
}
