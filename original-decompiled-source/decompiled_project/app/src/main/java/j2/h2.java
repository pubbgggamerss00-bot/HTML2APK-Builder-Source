package j2;

/* loaded from: classes.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public static final f1.b f14743a = new f1.b(-1759434350, false, a.f14744a);

    public static final class a extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f14744a = new a(2);

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            if (!jVar2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                jVar2.v();
            }
            return pg.f0.f21461a;
        }
    }
}
