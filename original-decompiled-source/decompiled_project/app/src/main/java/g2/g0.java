package g2;

import g2.d0;

/* loaded from: classes.dex */
public final class g0 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0.b f11380a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f11381b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g0(d0.b bVar, eh.p<? super x0.j, ? super Integer, pg.f0> pVar) {
        super(2);
        this.f11380a = bVar;
        this.f11381b = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        if (jVar2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            Boolean bool = (Boolean) this.f11380a.f11347f.getValue();
            boolean zBooleanValue = bool.booleanValue();
            jVar2.n(bool);
            boolean zC = jVar2.c(zBooleanValue);
            if (zBooleanValue) {
                this.f11381b.invoke(jVar2, 0);
            } else {
                jVar2.o(zC);
            }
            jVar2.d();
        } else {
            jVar2.v();
        }
        return pg.f0.f21461a;
    }
}
