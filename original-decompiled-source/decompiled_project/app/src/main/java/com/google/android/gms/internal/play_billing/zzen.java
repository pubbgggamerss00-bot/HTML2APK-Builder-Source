package com.google.android.gms.internal.play_billing;

import h1.y;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class zzen extends IOException {
    public zzen() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzen(long j10, long j11, int i10, Throwable th2) {
        Locale locale = Locale.US;
        StringBuilder sbA = y.a("Pos: ", ", limit: ", j10);
        sbA.append(j11);
        sbA.append(", len: ");
        sbA.append(i10);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbA.toString()), th2);
    }

    public zzen(Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
    }
}
