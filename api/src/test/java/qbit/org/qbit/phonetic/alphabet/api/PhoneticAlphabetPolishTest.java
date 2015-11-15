package qbit.org.qbit.phonetic.alphabet.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import qbit.org.qbit.phonetic.alphabet.api.imp.PhoneticAlphabetPolishImp;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Benek on 2015-11-15.
 */
public class PhoneticAlphabetPolishTest {

    private Logger logger = LogManager.getLogger(PhoneticAlphabetPolishTest.class.getName());
    protected Alphabet alphabet;

    @BeforeClass
    public void beforeClass() {
        alphabet = new PhoneticAlphabetPolishImp();
    }

    @DataProvider(name = "wordDataProvider")
    public Object[][] getWordData() {
        return new Object[][]{
                {"A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, !",
                        new Object[][]{
                                {'A', "Alpha", "alfa"},
                                {',', null, null},
                                {' ', null, null},
                                {'B', "Bravo", "brawo"},
                                {',', null, null},
                                {' ', null, null},
                                {'C', "Charlie", "czarli"},
                                {',', null, null},
                                {' ', null, null},
                                {'D', "Delta", "delta"},
                                {',', null, null},
                                {' ', null, null},
                                {'E', "Echo", "eko"},
                                {',', null, null},
                                {' ', null, null},
                                {'F', "Foxtrot", "fokstrot"},
                                {',', null, null},
                                {' ', null, null},
                                {'G', "Golf", "golf"},
                                {',', null, null},
                                {' ', null, null},
                                {'H', "Hotel", "hotel"},
                                {',', null, null},
                                {' ', null, null},
                                {'I', "India", "india"},
                                {',', null, null},
                                {' ', null, null},
                                {'J', "Juliett", "dżuliet"},
                                {',', null, null},
                                {' ', null, null},
                                {'K', "Kilo", "kilo"},
                                {',', null, null},
                                {' ', null, null},
                                {'L', "Lima", "lima"},
                                {',', null, null},
                                {' ', null, null},
                                {'M', "Mike", "majk"},
                                {',', null, null},
                                {' ', null, null},
                                {'N', "November", "nowember"},
                                {',', null, null},
                                {' ', null, null},
                                {'O', "Oscar", "oskar"},
                                {',', null, null},
                                {' ', null, null},
                                {'P', "Papa", "papa"},
                                {',', null, null},
                                {' ', null, null},
                                {'Q', "Quebec", "kebek"},
                                {',', null, null},
                                {' ', null, null},
                                {'R', "Romeo", "romijo"},
                                {',', null, null},
                                {' ', null, null},
                                {'S', "Sierra", "sjera"},
                                {',', null, null},
                                {' ', null, null},
                                {'T', "Tango", "tango"},
                                {',', null, null},
                                {' ', null, null},
                                {'U', "Uniform", "juniform"},
                                {',', null, null},
                                {' ', null, null},
                                {'V', "Victor", "wiktor"},
                                {',', null, null},
                                {' ', null, null},
                                {'W', "Whiskey", "łyski"},
                                {',', null, null},
                                {' ', null, null},
                                {'X', "X-Ray", "eks-rej"},
                                {',', null, null},
                                {' ', null, null},
                                {'Y', "Yankee", "janki"},
                                {',', null, null},
                                {' ', null, null},
                                {'Z', "Zulu", "zulu"},
                                {',', null, null},
                                {' ', null, null},
                                {'!', null, null}}},};
    }

    @DataProvider(name = "characterDataProvider")
    public Object[][] getCharData() {
        return new Object[][]{
                {'A', "Alpha", "alfa"},
                {'B', "Bravo", "brawo"},
                {'C', "Charlie", "czarli"},
                {'D', "Delta", "delta"},
                {'E', "Echo", "eko"},
                {'F', "Foxtrot", "fokstrot"},
                {'G', "Golf", "golf"},
                {'H', "Hotel", "hotel"},
                {'I', "India", "india"},
                {'J', "Juliett", "dżuliet"},
                {'K', "Kilo", "kilo"},
                {'L', "Lima", "lima"},
                {'M', "Mike", "majk"},
                {'N', "November", "nowember"},
                {'O', "Oscar", "oskar"},
                {'P', "Papa", "papa"},
                {'Q', "Quebec", "kebek"},
                {'R', "Romeo", "romijo"},
                {'S', "Sierra", "sjera"},
                {'T', "Tango", "tango"},
                {'U', "Uniform", "juniform"},
                {'V', "Victor", "wiktor"},
                {'W', "Whiskey", "łyski"},
                {'X', "X-Ray", "eks-rej"},
                {'Y', "Yankee", "janki"},
                {'Z', "Zulu", "zulu"},
                {'\0', null, null}};
    }


    @Test(dataProvider = "characterDataProvider")
    public void transcriptCharacterTest(Character inputChar, String exEnglish, String exPolish) {

        Pair pair = alphabet.transcriptChar(inputChar);
        Character exChar = inputChar;

        Assert.assertEquals(pair.getCharacter(), exChar, "must be equal");
        Assert.assertEquals(pair.getOrigin(), exEnglish, "must be equal");
        Assert.assertEquals(pair.getTranscript(), exPolish, "must be equal");
    }

    @Test(dataProvider = "wordDataProvider")
    public void transcriptWordTest(String inputWord, Object[][] expectedArr) {

        List<Pair> wordTranscript = alphabet.transcriptWord(inputWord);

        Object[][] currentArr = new Object[wordTranscript.size()][3];
        Pair elPair = null;
        Iterator<Pair> listIterator = (Iterator<Pair>) wordTranscript.iterator();

        logger.info("array size:" + wordTranscript.size());
        for (int row = 0; row < wordTranscript.size(); row++) {
            elPair = listIterator.next();
            currentArr[row][0] = elPair.getCharacter();
            currentArr[row][1] = elPair.getOrigin();
            currentArr[row][2] = elPair.getTranscript();

            logger.debug("input char: "+ elPair.getCharacter() + " expected char: " + expectedArr[row][0]);

            Assert.assertEquals(elPair.getCharacter(),expectedArr[row][0], "must be equal");
            Assert.assertEquals(elPair.getOrigin(), expectedArr[row][1], "must be equal");
            Assert.assertEquals(elPair.getTranscript(), expectedArr[row][2], "must be equal");
        }
    }


}
