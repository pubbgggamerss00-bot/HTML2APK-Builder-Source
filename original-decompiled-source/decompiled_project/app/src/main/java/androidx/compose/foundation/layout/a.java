package androidx.compose.foundation.layout;

import j2.c3;

/* loaded from: classes.dex */
public final class a {
    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, float f10, boolean z10) {
        return dVar.h(new AspectRatioElement(f10, z10, c3.f14686a));
    }

    public static final boolean b(int i10, int i11, long j10) {
        int iK = f3.b.k(j10);
        if (i10 > f3.b.i(j10) || iK > i10) {
            return false;
        }
        return i11 <= f3.b.h(j10) && f3.b.j(j10) <= i11;
    }
}
