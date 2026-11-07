package org.jf.dexlib2.util;

/* loaded from: classes3.dex */
public abstract class AlignmentUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public static int alignOffset(int i10, int i11) {
        int i12 = i11 - 1;
        return (i10 + i12) & (~i12);
    }

    public static boolean isAligned(int i10, int i11) {
        return i10 % i11 == 0;
    }
}
