package i0;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class e4 {
    public static final p1.e a(f3.d dVar, int i10, y2.o0 o0Var, t2.h0 h0Var, boolean z10, int i11) {
        p1.e eVarC = h0Var != null ? h0Var.c(o0Var.f33760b.b(i10)) : p1.e.f21130e;
        float f10 = eVarC.f21131a;
        int iB1 = dVar.b1(f3.f13279a);
        return p1.e.b(eVarC, z10 ? (i11 - f10) - iB1 : f10, z10 ? i11 - f10 : iB1 + f10, CropImageView.DEFAULT_ASPECT_RATIO, 10);
    }

    public static final s.s b(s.s sVar) {
        s.s sVarC = sVar.c();
        int iB = sVarC.b();
        for (int i10 = 0; i10 < iB; i10++) {
            sVarC.e(sVar.a(i10), i10);
        }
        return sVarC;
    }

    public static final double c(long j10) {
        return ((j10 >>> 11) * 2048) + (j10 & 2047);
    }

    public static final String d(int i10, long j10) {
        if (j10 >= 0) {
            g8.w.h(i10);
            String string = Long.toString(j10, i10);
            kotlin.jvm.internal.r.d(string, "toString(...)");
            return string;
        }
        long j11 = i10;
        long j12 = ((j10 >>> 1) / j11) << 1;
        long j13 = j10 - (j12 * j11);
        if (j13 >= j11) {
            j13 -= j11;
            j12++;
        }
        g8.w.h(i10);
        String string2 = Long.toString(j12, i10);
        kotlin.jvm.internal.r.d(string2, "toString(...)");
        g8.w.h(i10);
        String string3 = Long.toString(j13, i10);
        kotlin.jvm.internal.r.d(string3, "toString(...)");
        return string2.concat(string3);
    }
}
