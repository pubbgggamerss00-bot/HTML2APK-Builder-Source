package t0;

import x0.j;

/* loaded from: classes.dex */
public final class hd extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ic f26031a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd(ic icVar) {
        super(2);
        this.f26031a = icVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            ic icVar = this.f26031a;
            boolean zK = jVar2.K(icVar);
            Object objG = jVar2.g();
            if (zK || objG == j.a.f31715a) {
                objG = new gd(icVar);
                jVar2.C(objG);
            }
            s4.c((eh.a) objG, null, false, null, n2.f26490a, jVar2, 196608, 30);
        }
        return pg.f0.f21461a;
    }
}
