package qbit.org.qbit.phonetic.alphabet.api;

/**
 * Created by Benek on 2015-11-12.
 */
public enum AlphabetEnum {

    A('A'),
    B('B'),
    C('C'),
    D('D'),
    E('E'),
    F('F'),
    G('G'),
    H('H'),
    I('I'),
    J('J'),
    K('K'),
    L('L'),
    M('M'),
    N('N'),
    O('O'),
    P('P'),
    Q('Q'),
    R('R'),
    S('S'),
    T('T'),
    U('U'),
    V('V'),
    W('W'),
    X('X'),
    Y('Y'),
    Z('Z'),
    _NON_('\0');

    AlphabetEnum(char character) {
        this.character = character;
    }

    public static String ALPHABET_NAME = "latin";
    public static int CHARACTER_NUMBER = 26;
    private char character;

    public char getCharacter() {
        return character;
    }

}
