//jQuery(document).ready(function($) {
//
//$('#pageWrapper').append("o propozitie");
//	//$('#msg').html("This is updated by jQuery")
//        // might use it 
//        
//});

function buildSongPartArray(jsString) {
    var song = JSON.parse(jsString);
    var songParts = song.songParts;
    var bpm = 0;
    var noteNr = 0;
    
    console.log(song);                              // debug
    
    $.each(songParts, function(i, i_val) 
    { 
        $('#pageWrapper').append('<div class="songPart" id="songPart'+i+'"></div>');
        $('#songPart'+i).append('<div class="bpmDisplay" id="bpmDisplay'+i+'">' + "BPM:" + i_val.bpm + '</div>');
        $('#songPart'+i).append('<div class="actualPartWrapper" id="actualPartWrapper'+i+'"></div>');
        $('#actualPartWrapper'+i).append('<div class="notesContainer" id="notesContainer'+i+'"></div>');
        
        var division = 'style = "width:'+(100/i_val.notes)+'%;"';
        
        $('#notesContainer'+i).append('<div class="row" id="rowG'+i+'"></div>');
        $('#notesContainer'+i).append('<div class="row" id="rowD'+i+'"></div>');
        $('#notesContainer'+i).append('<div class="row" id="rowA'+i+'"></div>');
        $('#notesContainer'+i).append('<div class="row" id="rowE'+i+'"></div>');
        
        var notes = i_val.values;
        $.each(notes, function(j, j_val) 
        {
            switch(j_val.chord) 
            {
                case 'G':
                    
                    $('#rowG'+i).append('<div class="column" '+division+' id="columnG'+i+j+'"></div>');
                    $('#rowD'+i).append('<div class="column" '+division+' id="columnD'+i+j+'"></div>');
                    $('#rowA'+i).append('<div class="column" '+division+' id="columnA'+i+j+'"></div>');
                    $('#rowE'+i).append('<div class="column" '+division+' id="columnE'+i+j+'"></div>');
                    
                    $('#columnG'+i+j).append('<div class="note">'+j_val.position+'</div>');
                    
                    break;
                case 'D':
                    
                    $('#rowG'+i).append('<div class="column" '+division+' id="columnG'+i+j+'"></div>');
                    $('#rowD'+i).append('<div class="column" '+division+' id="columnD'+i+j+'"></div>');
                    $('#rowA'+i).append('<div class="column" '+division+' id="columnA'+i+j+'"></div>');
                    $('#rowE'+i).append('<div class="column" '+division+' id="columnE'+i+j+'"></div>');
                    
                    $('#columnD'+i+j).append('<div class="note">'+j_val.position+'</div>');
                    
                    break;
                case 'A':
                    
                    $('#rowG'+i).append('<div class="column" '+division+' id="columnG'+i+j+'"></div>');
                    $('#rowD'+i).append('<div class="column" '+division+' id="columnD'+i+j+'"></div>');
                    $('#rowA'+i).append('<div class="column" '+division+' id="columnA'+i+j+'"></div>');
                    $('#rowE'+i).append('<div class="column" '+division+' id="columnE'+i+j+'"></div>');
                    
                    $('#columnA'+i+j).append('<div class="note">'+j_val.position+'</div>');
                    
                    break;
                case 'E':
                    
                    $('#rowG'+i).append('<div class="column" '+division+' id="columnG'+i+j+'"></div>');
                    $('#rowD'+i).append('<div class="column" '+division+' id="columnD'+i+j+'"></div>');
                    $('#rowA'+i).append('<div class="column" '+division+' id="columnA'+i+j+'"></div>');
                    $('#rowE'+i).append('<div class="column" '+division+' id="columnE'+i+j+'"></div>');
                    
                    $('#columnE'+i+j).append('<div class="note">'+j_val.position+'</div>');
                    
                    break;
                default:
                    
                    $('#rowG'+i).append('<div class="column" '+division+' id="columnG'+i+j+'"></div>');
                    $('#rowD'+i).append('<div class="column" '+division+' id="columnD'+i+j+'"></div>');
                    $('#rowA'+i).append('<div class="column" '+division+' id="columnA'+i+j+'"></div>');
                    $('#rowE'+i).append('<div class="column" '+division+' id="columnE'+i+j+'"></div>');
                    
            }
            
            
            
            //j_val.chord
            //'+j_val.position+'
            //j_val.name
        });
        
        //$('#pageWrapper').append('<li>' + value.bpm + '</li>');
    });
    
}