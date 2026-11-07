package t0;

import androidx.compose.ui.d;
import x0.j;

/* loaded from: classes.dex */
public final class ye extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1.b f27498a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f27499b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.b f27500c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye(f1.b bVar, eh.p pVar, f1.b bVar2) {
        super(2);
        this.f27498a = bVar;
        this.f27499b = pVar;
        this.f27500c = bVar2;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f);
            f1.b bVar = this.f27498a;
            boolean zK = jVar2.K(bVar);
            eh.p<x0.j, Integer, pg.f0> pVar = this.f27499b;
            boolean zK2 = zK | jVar2.K(pVar);
            f1.b bVar2 = this.f27500c;
            boolean zK3 = zK2 | jVar2.K(bVar2);
            Object objG = jVar2.g();
            if (zK3 || objG == j.a.f31715a) {
                objG = new xe(bVar, pVar, bVar2);
                jVar2.C(objG);
            }
            g2.p1.a(dVarD, (eh.p) objG, jVar2, 6, 0);
        }
        return pg.f0.f21461a;
    }
}
