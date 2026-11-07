package t0;

/* loaded from: classes.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    public static final f1.b f26421a = new f1.b(818736383, false, a.f26422a);

    public static final class a extends kotlin.jvm.internal.s implements eh.q<ic, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f26422a = new a(3);

        @Override // eh.q
        public final pg.f0 b(ic icVar, x0.j jVar, Integer num) {
            ic icVar2 = icVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= jVar2.K(icVar2) ? 4 : 2;
            }
            if ((iIntValue & 19) == 18 && jVar2.s()) {
                jVar2.v();
            } else {
                id.b(icVar2, null, null, 0L, 0L, 0L, 0L, 0L, jVar2, iIntValue & 14);
            }
            return pg.f0.f21461a;
        }
    }
}
