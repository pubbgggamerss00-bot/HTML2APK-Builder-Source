package i0;

import androidx.compose.ui.d;
import j1.d;
import x0.j;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final float f13306a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f13307b;

    static {
        float f10 = 25;
        f13306a = f10;
        f13307b = (f10 * 2.0f) / 2.4142137f;
    }

    public static final void a(m0.w wVar, androidx.compose.ui.d dVar, long j10, x0.j jVar, int i10) {
        int i11;
        x0.k kVarP = jVar.p(1776202187);
        int i12 = (kVarP.K(wVar) ? 4 : 2) | i10 | (kVarP.K(dVar) ? 32 : 16) | 128;
        if (kVarP.A(i12 & 1, (i12 & 147) != 146)) {
            kVarP.r0();
            if ((i10 & 1) == 0 || kVarP.a0()) {
                i11 = i12 & (-897);
                j10 = 9205357640488583168L;
            } else {
                kVarP.v();
                i11 = i12 & (-897);
            }
            kVarP.U();
            int i13 = i11 & 14;
            boolean z10 = i13 == 4;
            Object objG = kVarP.g();
            if (z10 || objG == j.a.f31715a) {
                objG = new c(wVar);
                kVarP.C(objG);
            }
            m0.g.a(wVar, d.a.f14603b, f1.c.b(-1653527038, new a(j10, q2.q.a(dVar, false, (eh.l) objG)), kVarP), kVarP, i13 | 432);
        } else {
            kVarP.v();
        }
        long j11 = j10;
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new b(wVar, dVar, j11, i10);
        }
    }

    public static final void b(androidx.compose.ui.d dVar, x0.j jVar, int i10, int i11) {
        int i12;
        x0.k kVarP = jVar.p(694251107);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (kVarP.K(dVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if (kVarP.A(i12 & 1, (i12 & 3) != 2)) {
            if (i13 != 0) {
                dVar = d.a.f1143b;
            }
            p1.d.b(androidx.compose.ui.c.a(androidx.compose.foundation.layout.g.o(dVar, f13307b, f13306a), j2.c3.f14686a, g.f13289a), kVarP);
        } else {
            kVarP.v();
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new d(dVar, i10, i11);
        }
    }
}
