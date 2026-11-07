package b9;

import android.webkit.WebView;
import t0.s4;
import x0.j;

/* loaded from: classes.dex */
public final class s3 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p5.x f4096a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<WebView> f4097b;

    public s3(p5.x xVar, x0.n1<WebView> n1Var) {
        this.f4096a = xVar;
        this.f4097b = n1Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(311091622);
            p5.x xVar = this.f4096a;
            boolean zL = jVar2.l(xVar);
            Object objG = jVar2.g();
            if (zL || objG == j.a.f31715a) {
                objG = new r3(0, xVar, this.f4097b);
                jVar2.C(objG);
            }
            jVar2.B();
            s4.c((eh.a) objG, null, false, null, b.f3738a, jVar2, 196608, 30);
        }
        return pg.f0.f21461a;
    }
}
