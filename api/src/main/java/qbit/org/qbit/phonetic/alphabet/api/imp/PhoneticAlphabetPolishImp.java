package qbit.org.qbit.phonetic.alphabet.api.imp;

import qbit.org.qbit.phonetic.alphabet.api.Pair;
import qbit.org.qbit.phonetic.alphabet.api.PhoneticAlphabet;

import static qbit.org.qbit.phonetic.alphabet.api.AlphabetEnum.*;

/**
 * Created by Benek on 2015-11-12.
 */
public class PhoneticAlphabetPolishImp extends PhoneticAlphabet {

    public PhoneticAlphabetPolishImp() {
        alphabetPairArr = loadAlphabet();
    }

    @Override
    protected Pair[] loadAlphabet() {
        final Pair[] pairArr = new Pair[26];

        PutToArr toArr = new PutToArr(pairArr, CHAR_OFFSET);

        toArr.putToArr(A, "Alpha", "alfa");
        toArr.putToArr(B, "Bravo", "brawo");
        toArr.putToArr(C, "Charlie", "czarli");
        toArr.putToArr(D, "Delta", "delta");
        toArr.putToArr(E, "Echo", "eko");
        toArr.putToArr(F, "Foxtrot", "fokstrot");
        toArr.putToArr(G, "Golf", "golf");
        toArr.putToArr(H, "Hotel", "hotel");
        toArr.putToArr(I, "India", "india");
        toArr.putToArr(J, "Juliett", "dżuliet");
        toArr.putToArr(K, "Kilo", "kilo");
        toArr.putToArr(L, "Lima", "lima");
        toArr.putToArr(M, "Mike", "majk");
        toArr.putToArr(N, "November", "nowember");
        toArr.putToArr(O, "Oscar", "oskar");
        toArr.putToArr(P, "Papa", "papa");
        toArr.putToArr(Q, "Quebec", "kebek");
        toArr.putToArr(R, "Romeo", "romijo");
        toArr.putToArr(S, "Sierra", "sjera");
        toArr.putToArr(T, "Tango", "tango");
        toArr.putToArr(U, "Uniform", "juniform");
        toArr.putToArr(V, "Victor", "wiktor");
        toArr.putToArr(W, "Whiskey", "łyski");
        toArr.putToArr(X, "X-Ray", "eks-rej");
        toArr.putToArr(Y, "Yankee", "janki");
        toArr.putToArr(Z, "Zulu", "zulu");

        return pairArr;

    }
}
