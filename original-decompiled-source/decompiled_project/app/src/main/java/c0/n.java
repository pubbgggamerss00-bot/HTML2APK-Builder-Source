package c0;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.s implements eh.r<v, Integer, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1.b f4455a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(f1.b bVar) {
        super(4);
        this.f4455a = bVar;
    }

    @Override // eh.r
    public final pg.f0 f(v vVar, Integer num, x0.j jVar, Integer num2) {
        v vVar2 = vVar;
        num.intValue();
        x0.j jVar2 = jVar;
        int iIntValue = num2.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= jVar2.K(vVar2) ? 4 : 2;
        }
        if (jVar2.A(iIntValue & 1, (iIntValue & 131) != 130)) {
            this.f4455a.b(vVar2, jVar2, Integer.valueOf(iIntValue & 14));
        } else {
            jVar2.v();
        }
        return pg.f0.f21461a;
    }
}
