import java.util.HashMap;
import java.util.Set;
public class TrackList{

   public void hash(){
    HashMap <String, String> trackList = new HashMap <String, String>();
    trackList.put("Track: Angels", "Lyrics: blah blah");
    trackList.put("Track: Demons", "Lyrics: yada yada");
    trackList.put("Track: Gods", "Lyrics: yipee");
    trackList.put("Track: whatever", "Lyrics: haha");

    System.out.println(trackList.get("Track: Demons"));

    Set <String> keys = trackList.keySet();
    for (String key : keys){
        System.out.println(key);
        System.out.println(trackList.get(key));
    }
   }

}