package i0;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f1.b f13369a = new f1.b(997835932, false, a.f13370a);

    public static final class a extends kotlin.jvm.internal.s implements eh.q<eh.p<? super x0.j, ? super Integer, ? extends pg.f0>, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13370a = new a(3);

        @Override // eh.q
        public final pg.f0 b(eh.p<? super x0.j, ? super Integer, ? extends pg.f0> pVar, x0.j jVar, Integer num) {
            eh.p<? super x0.j, ? super Integer, ? extends pg.f0> pVar2 = pVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= jVar2.l(pVar2) ? 4 : 2;
            }
            if (jVar2.A(iIntValue & 1, (iIntValue & 19) != 18)) {
                pVar2.invoke(jVar2, Integer.valueOf(iIntValue & 14));
            } else {
                jVar2.v();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.q<eh.p<? super x0.j, ? super Integer, ? extends pg.f0>, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f13371a = new b(3);

        @Override // eh.q
        public final pg.f0 b(eh.p<? super x0.j, ? super Integer, ? extends pg.f0> pVar, x0.j jVar, Integer num) {
            eh.p<? super x0.j, ? super Integer, ? extends pg.f0> pVar2 = pVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= jVar2.l(pVar2) ? 4 : 2;
            }
            if (jVar2.A(iIntValue & 1, (iIntValue & 19) != 18)) {
                pVar2.invoke(jVar2, Integer.valueOf(iIntValue & 14));
            } else {
                jVar2.v();
            }
            return pg.f0.f21461a;
        }
    }

    static {
        new f1.b(2105616367, false, b.f13371a);
    }
}
