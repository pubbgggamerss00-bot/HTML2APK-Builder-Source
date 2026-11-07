package t8;

/* loaded from: classes.dex */
public final class f2 implements eh.r<b0.e, Integer, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y3 f28220a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f28221b;

    public f2(androidx.compose.ui.d dVar, y3 y3Var) {
        this.f28220a = y3Var;
        this.f28221b = dVar;
    }

    @Override // eh.r
    public final pg.f0 f(b0.e eVar, Integer num, x0.j jVar, Integer num2) {
        b0.e items = eVar;
        int iIntValue = num.intValue();
        x0.j jVar2 = jVar;
        int iIntValue2 = num2.intValue();
        kotlin.jvm.internal.r.e(items, "$this$items");
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= jVar2.i(iIntValue) ? 32 : 16;
        }
        if ((iIntValue2 & 145) == 144 && jVar2.s()) {
            jVar2.v();
        } else {
            v2.i(this.f28220a.f28589i.get(iIntValue), this.f28221b, jVar2, 48);
        }
        return pg.f0.f21461a;
    }
}
