package t8;

import x0.j;

/* loaded from: classes.dex */
public final class c2 implements eh.q<b0.e, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y3 f28144a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Integer f28145b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f28146c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f28147d;

    public c2(y3 y3Var, Integer num, eh.a<pg.f0> aVar, androidx.compose.ui.d dVar) {
        this.f28144a = y3Var;
        this.f28145b = num;
        this.f28146c = aVar;
        this.f28147d = dVar;
    }

    @Override // eh.q
    public final pg.f0 b(b0.e eVar, x0.j jVar, Integer num) {
        eh.a<pg.f0> aVar;
        b0.e item = eVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(item, "$this$item");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(-1472571446);
            y3 y3Var = this.f28144a;
            int i10 = y3Var.f28581a;
            Integer num2 = this.f28145b;
            if (num2 != null && i10 == num2.intValue()) {
                aVar = this.f28146c;
            } else {
                jVar2.L(-1472570145);
                Object objG = jVar2.g();
                if (objG == j.a.f31715a) {
                    objG = new b2();
                    jVar2.C(objG);
                }
                aVar = (eh.a) objG;
                jVar2.B();
            }
            jVar2.B();
            v2.d(y3Var, aVar, this.f28147d, jVar2, 392);
        }
        return pg.f0.f21461a;
    }
}
