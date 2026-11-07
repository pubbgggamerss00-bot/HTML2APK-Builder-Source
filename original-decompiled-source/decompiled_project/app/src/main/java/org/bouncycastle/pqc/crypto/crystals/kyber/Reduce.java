package org.bouncycastle.pqc.crypto.crystals.kyber;

/* loaded from: classes3.dex */
class Reduce {
    public static short barretReduce(short s10) {
        return (short) (s10 - ((short) (((short) ((((short) 20159) * s10) >> 26)) * 3329)));
    }

    public static short conditionalSubQ(short s10) {
        short s11 = (short) (s10 - 3329);
        return (short) (s11 + ((s11 >> 15) & KyberEngine.KyberQ));
    }

    public static short montgomeryReduce(int i10) {
        return (short) ((i10 - (((short) (KyberEngine.KyberQinv * i10)) * 3329)) >> 16);
    }
}
