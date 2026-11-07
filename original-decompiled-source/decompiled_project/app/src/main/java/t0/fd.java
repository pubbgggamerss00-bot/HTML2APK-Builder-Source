package t0;

import x0.j;

/* loaded from: classes.dex */
public final class fd extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f25884a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ic f25885b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f25886c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd(long j10, ic icVar, String str) {
        super(2);
        this.f25884a = j10;
        this.f25885b = icVar;
        this.f25886c = str;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            z.g1 g1Var = m0.f26400a;
            l0 l0VarF = m0.f(0L, this.f25884a, jVar2, 13);
            ic icVar = this.f25885b;
            boolean zK = jVar2.K(icVar);
            Object objG = jVar2.g();
            if (zK || objG == j.a.f31715a) {
                objG = new dd(icVar);
                jVar2.C(objG);
            }
            x0.d((eh.a) objG, null, false, null, l0VarF, null, f1.c.b(521110564, new ed(this.f25886c), jVar2), jVar2, 805306368, 494);
        }
        return pg.f0.f21461a;
    }
}
