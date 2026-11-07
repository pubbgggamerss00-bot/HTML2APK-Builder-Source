package x8;

import x0.j;

/* loaded from: classes.dex */
public final class u implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f33219a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f33220b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f33221c;

    public u(eh.a<pg.f0> aVar, eh.a<pg.f0> aVar2, x0.n1<Boolean> n1Var) {
        this.f33219a = aVar;
        this.f33220b = aVar2;
        this.f33221c = n1Var;
    }

    @Override // eh.q
    public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
        z.r AppDropdownMenu = rVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(AppDropdownMenu, "$this$AppDropdownMenu");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            f1.b bVar = b.f32253e;
            jVar2.L(-1564720044);
            final eh.a<pg.f0> aVar = this.f33219a;
            boolean zK = jVar2.K(aVar);
            Object objG = jVar2.g();
            Object obj = j.a.f31715a;
            final x0.n1<Boolean> n1Var = this.f33221c;
            if (zK || objG == obj) {
                objG = new eh.a() { // from class: x8.t
                    @Override // eh.a
                    public final Object invoke() {
                        float f10 = s.f33139a;
                        n1Var.setValue(Boolean.FALSE);
                        aVar.invoke();
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG);
            }
            jVar2.B();
            q8.g.b(bVar, (eh.a) objG, b.f32254f, jVar2, 390, 0);
            f1.b bVar2 = b.f32255g;
            jVar2.L(-1564705900);
            Object obj2 = this.f33220b;
            boolean zK2 = jVar2.K(obj2);
            Object objG2 = jVar2.g();
            if (zK2 || objG2 == obj) {
                objG2 = new j9.l0(1, obj2, n1Var);
                jVar2.C(objG2);
            }
            jVar2.B();
            q8.g.b(bVar2, (eh.a) objG2, b.f32256h, jVar2, 390, 0);
        }
        return pg.f0.f21461a;
    }
}
