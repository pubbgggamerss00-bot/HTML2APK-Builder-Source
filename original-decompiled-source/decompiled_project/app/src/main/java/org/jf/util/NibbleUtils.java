package org.jf.util;

/* loaded from: classes3.dex */
public abstract class NibbleUtils {
    public static int extractHighSignedNibble(int i10) {
        return (i10 << 24) >> 28;
    }

    public static int extractHighUnsignedNibble(int i10) {
        return (i10 & 240) >>> 4;
    }

    public static int extractLowSignedNibble(int i10) {
        return (i10 << 28) >> 28;
    }

    public static int extractLowUnsignedNibble(int i10) {
        return i10 & 15;
    }
}
