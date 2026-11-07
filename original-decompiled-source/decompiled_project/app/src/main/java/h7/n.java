package h7;

import q1.c0;
import s1.a;

/* loaded from: classes.dex */
public final class n extends v1.c {

    /* renamed from: f, reason: collision with root package name */
    public final g7.l f12339f;

    public n(g7.l lVar) {
        this.f12339f = lVar;
    }

    @Override // v1.c
    public final long h() {
        g7.l lVar = this.f12339f;
        int iA = lVar.a();
        float f10 = iA > 0 ? iA : Float.NaN;
        int height = lVar.getHeight();
        return d0.h.a(f10, height > 0 ? height : Float.NaN);
    }

    @Override // v1.c
    public final void i(s1.e eVar) {
        g7.l lVar = this.f12339f;
        int iA = lVar.a();
        float fD = iA > 0 ? p1.h.d(eVar.i()) / iA : 1.0f;
        int height = lVar.getHeight();
        float fB = height > 0 ? p1.h.b(eVar.i()) / height : 1.0f;
        a.b bVarQ0 = eVar.Q0();
        long jD = bVarQ0.d();
        bVarQ0.a().d();
        try {
            bVarQ0.f24180a.e(fD, fB, 0L);
            lVar.c(c0.a(eVar.Q0().a()));
        } finally {
            t.r.a(bVarQ0, jD);
        }
    }
}
