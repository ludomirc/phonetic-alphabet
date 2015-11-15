package qbit.org.qbit.phonetic.alphabet.api.imp;

import qbit.org.qbit.phonetic.alphabet.api.AlphabetEnum;
import qbit.org.qbit.phonetic.alphabet.api.Pair;

final class PutToArr {

    private final Pair[] pairArr;
    private int charOffset;

    public PutToArr(Pair[] pairArr, int charOffset) {
        this.pairArr = pairArr;
        this.charOffset = charOffset;
    }

    public void putToArr(AlphabetEnum e, String origin, String transcript) {
        pairArr[e.getCharacter() - charOffset] = new Pair(e, origin, transcript);
    }

}