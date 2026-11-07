package s8;

/* loaded from: classes.dex */
public final class a2 implements eh.r<r.n, p5.s, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1.b f24607a;

    public a2(f1.b bVar) {
        this.f24607a = bVar;
    }

    @Override // eh.r
    public final pg.f0 f(r.n nVar, p5.s sVar, x0.j jVar, Integer num) {
        r.n composable = nVar;
        p5.s entry = sVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(composable, "$this$composable");
        kotlin.jvm.internal.r.e(entry, "entry");
        q8.p0.a(composable, f1.c.b(1460239309, new z1(this.f24607a, composable, entry), jVar2), jVar2, (iIntValue & 14) | 48);
        return pg.f0.f21461a;
    }
}
