package d0;

/* loaded from: classes.dex */
public final class p0 {
    public static final void a(eh.a aVar, androidx.compose.ui.d dVar, d1 d1Var, eh.p pVar, x0.j jVar, int i10) {
        x0.k kVarP = jVar.p(2002163445);
        int i11 = (kVarP.l(aVar) ? 4 : 2) | i10 | (kVarP.K(dVar) ? 32 : 16) | (kVarP.K(d1Var) ? 256 : 128) | (kVarP.l(pVar) ? 2048 : 1024);
        if (kVarP.A(i11 & 1, (i11 & 1171) != 1170)) {
            z1.a(f1.c.b(-1488997347, new androidx.compose.foundation.lazy.layout.b(d1Var, dVar, pVar, bg.b.k(aVar, kVarP)), kVarP), kVarP, 6);
        } else {
            kVarP.v();
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new o0(aVar, dVar, d1Var, pVar, i10);
        }
    }
}
