package qbit.org.qbit.phonetic.alphabet.api;

/**
 * Created by Benek on 2015-11-12.
 */
public class Pair {

    AlphabetEnum alphabetEnum;
    String origin;
    String transcript;
    Character character;


    public Pair() {
    }

    public Pair(String origin, String transcript) {
        this.transcript = transcript;
        this.origin = origin;
    }

    public Pair(AlphabetEnum alphabetEnum, String origin, String transcript) {
        this.alphabetEnum = alphabetEnum;
        this.transcript = transcript;
        this.origin = origin;
    }

    public Pair(AlphabetEnum alphabetEnum, String origin, String transcript, Character character) {
        this.alphabetEnum = alphabetEnum;
        this.origin = origin;
        this.transcript = transcript;
        this.character = character;
    }

    public AlphabetEnum getAlphabetEnum() {
        return alphabetEnum;
    }

    public void setAlphabetEnum(AlphabetEnum alphabetEnum) {
        this.alphabetEnum = alphabetEnum;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getTranscript() {
        return transcript;
    }

    public void setTranscript(String transcript) {
        this.transcript = transcript;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }
}
