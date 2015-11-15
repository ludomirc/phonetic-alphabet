package qbit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import qbit.org.qbit.phonetic.alphabet.api.Alphabet;
import qbit.org.qbit.phonetic.alphabet.api.Pair;
import qbit.org.qbit.phonetic.alphabet.api.imp.PhoneticAlphabetPolishImp;

import java.util.List;

/**
 * Created by Benek on 2015-11-01.
 */
public class Main {

    private static Logger logger = LogManager.getLogger(Main.class.getName());


    public static void main(String[] args){


            Alphabet alphabet  = new PhoneticAlphabetPolishImp();


            Pair pair =  alphabet.transcriptChar('w');

            printTranscript(pair);


            List<Pair> wordTranscript = alphabet.transcriptWord("Ala Ma kota");
            for (Pair pEl: wordTranscript){
                printTranscript(pEl);
            }
        }

    private static void printTranscript(Pair pair) {
        logger.info("character : " + pair.getCharacter() + " get polish transcription: " + pair.getTranscript());
    }
}
