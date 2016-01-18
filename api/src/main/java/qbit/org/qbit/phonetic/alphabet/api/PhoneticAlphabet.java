package qbit.org.qbit.phonetic.alphabet.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Benek on 2015-11-01.
 * Class transcribe char or word to phonetic form.
 */
public abstract class PhoneticAlphabet implements Alphabet {

    private Logger logger = LogManager.getLogger(PhoneticAlphabet.class.getName());

    protected static final int CHAR_OFFSET = 65;
    protected static final int CHAR_NUMBER = AlphabetEnum.CHARACTER_NUMBER;
    protected Pair[] alphabetPairArr;

    abstract protected Pair[] loadAlphabet();

    @Override
    public Pair transcriptChar(char character) {
        Pair pair = null;
        int localCharValue = isInAlphabet(character);

        logger.debug("local character value: " + localCharValue);

        if (localCharValue >= 0 && localCharValue < alphabetPairArr.length) {
            try {
                pair = getLocalAlphabetPair(character, localCharValue);
            } catch (IndexOutOfBoundsException ex) {
                logger.error("character overflow character border: " + character + ", character number:" + localCharValue);
            }
        } else if ((pair = isNationalSymbol(character)) != null) {
            logger.debug("found national character. replace char:\"" + character + "\" to\"" + pair.getCharacter() + "\"");
        } else {
            pair = new Pair();
            pair.setCharacter(character);
            pair.setAlphabetEnum(AlphabetEnum._NON_);
        }
        return pair;
    }

    protected Pair getLocalAlphabetPair(char character, int localCharValue) {
        Pair pair;
        pair = alphabetPairArr[localCharValue];
        pair.setCharacter(character);
        return pair;
    }

    /**
     * Method to manual replace national symbol to letter form alphabet
     *
     * @param character
     * @return
     */
    protected abstract Pair isNationalSymbol(char character);

    /**
     * method transcribed word to to phonetic form
     *
     * @param word to transcript
     * @return word transcription as list of pair
     */
    @Override
    public List<Pair> transcriptWord(String word) {
        char[] chars = word.toCharArray();
        List<Pair> transcriptChar = new ArrayList<Pair>();

        for (char chEl : chars) {
            transcriptChar.add(transcriptChar(chEl));
        }

        return transcriptChar;
    }

    @Override
    public Pair[] getAlphabet() {
        return alphabetPairArr;
    }

    /**
     * method looking for character in the predefined alphabet, if character is in alphabet, return position in @alphabetPairArr array
     * else return -1
     *
     * @param character
     * @return position in @alphabetPairArr or -1
     */
    protected int isInAlphabet(char character) {
        int numValue = Character.valueOf(Character.toUpperCase(character));
        numValue = numValue - CHAR_OFFSET;
        if (numValue >= 0 || numValue <= CHAR_NUMBER) {
            return numValue;
        }
        return -1;
    }

    /**
     * Helper method to load alphabet
     *
     * @param e       - Alphabetic enumerator
     * @param english - origin word
     * @param polish  - transcript transcription
     */
    private void putToArr(AlphabetEnum e, String english, String polish) {
        alphabetPairArr[e.getCharacter() - CHAR_OFFSET] = new Pair(e, english, polish);
    }
}
