package h1;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.s implements eh.l<Object, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public static final a f12084a = new a(1);

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // eh.l
    public final pg.f0 invoke(Object obj) {
        synchronized (n.f12160c) {
            ?? r12 = n.f12166i;
            int size = r12.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((eh.l) r12.get(i10)).invoke(obj);
            }
        }
        return pg.f0.f21461a;
    }
}
