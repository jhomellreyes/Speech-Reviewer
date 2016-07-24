package speech.reviewer;
import com.sun.speech.freetts.*;
public class SpeechReviewer 
{
    private static final String VOICENAME="kevin16";
    public static void main(String[] args) 
    {
        Voice voice;
         VoiceManager vm = VoiceManager.getInstance();
         voice=vm.getVoice(VOICENAME);
         voice.allocate();
         try{
             voice.speak("This is a sample");
         }catch(Exception e){
             System.out.print(e);
         }
             
         
    }
    
}
