package j3;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f1.b f15027a = new f1.b(-1131826196, false, a.f15028a);

    public static final class a extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15028a = new a(2);

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
