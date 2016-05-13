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
        bpm = i_val.bpm;
        noteNr = i_val.notes;
        
        $('#pageWrapper').append('<div class="songPart"></div>');
        $('#songPart').append('<div class="bpmDisplay">' + "BPM:" + value.bpm + '</div>');
        $('#songPart').append('<div class="actualPartWrapper"></div>');
        $('#actualPartWrapper').append('<div class="notesContainer"></div>');
        
        var notes = i_val.values;
        $.each(notes, function(j, j_val) 
        {
            switch(j_val.chord) 
            {
                case 'n':
                    code block
                    break;
                case n:
                    code block
                    break;
                default:
                    default code block
            }
            
            
            
            //j_val.chord
            //j_val.position
            //j_val.name
        });
        
        //$('#pageWrapper').append('<li>' + value.bpm + '</li>');
    });
    
}