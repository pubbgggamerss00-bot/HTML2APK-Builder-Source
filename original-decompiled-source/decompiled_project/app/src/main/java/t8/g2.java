package t8;

/* loaded from: classes.dex */
public final class g2 implements eh.q<b0.e, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f28226a;

    public g2(androidx.compose.ui.d dVar) {
        this.f28226a = dVar;
    }

    @Override // eh.q
    public final pg.f0 b(b0.e eVar, x0.j jVar, Integer num) {
        b0.e item = eVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(item, "$this$item");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            v2.g(this.f28226a, jVar2, 6);
        }
        return pg.f0.f21461a;
    }
}
