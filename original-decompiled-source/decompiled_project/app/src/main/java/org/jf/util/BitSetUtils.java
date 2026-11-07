package org.jf.util;

import java.util.BitSet;

/* loaded from: classes3.dex */
public class BitSetUtils {
    public static BitSet bitSetOfIndexes(int... iArr) {
        BitSet bitSet = new BitSet();
        for (int i10 : iArr) {
            bitSet.set(i10);
        }
        return bitSet;
    }
}
