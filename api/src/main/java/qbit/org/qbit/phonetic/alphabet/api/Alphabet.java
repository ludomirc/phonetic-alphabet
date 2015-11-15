package qbit.org.qbit.phonetic.alphabet.api;

import java.util.List;

/**
 * Created by Benek on 2015-11-01.
 */
public interface Alphabet {


    Pair transcriptChar(char character);

    List<Pair> transcriptWord(String word);

    Pair[] getAlphabet();
}
