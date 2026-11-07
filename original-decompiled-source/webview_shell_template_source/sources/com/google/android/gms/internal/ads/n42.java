package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Locale;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n42 extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n42(long j6, long j7, int i6, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat("Pos: " + j6 + ", limit: " + j7 + ", len: " + i6), indexOutOfBoundsException);
        Locale locale = Locale.US;
    }

    public n42(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
