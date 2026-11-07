package z;

import x0.j;

/* loaded from: classes.dex */
public final class z1 extends kotlin.jvm.internal.s implements eh.q<androidx.compose.ui.d, x0.j, Integer, androidx.compose.ui.d> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.l<u1, pg.f0> f34698a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z1(eh.l<? super u1, pg.f0> lVar) {
        super(3);
        this.f34698a = lVar;
    }

    @Override // eh.q
    public final androidx.compose.ui.d b(androidx.compose.ui.d dVar, x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        num.intValue();
        jVar2.L(-1608161351);
        eh.l<u1, pg.f0> lVar = this.f34698a;
        boolean zK = jVar2.K(lVar);
        Object objG = jVar2.g();
        if (zK || objG == j.a.f31715a) {
            objG = new t(lVar);
            jVar2.C(objG);
        }
        t tVar = (t) objG;
        jVar2.B();
        return tVar;
    }
}
