package j2;

/* loaded from: classes.dex */
public final class u2 extends kotlin.jvm.internal.s implements eh.l<Object, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.c f14911a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(rh.c cVar) {
        super(1);
        this.f14911a = cVar;
    }

    @Override // eh.l
    public final pg.f0 invoke(Object obj) {
        if (v2.f14929b.compareAndSet(false, true)) {
            this.f14911a.g(pg.f0.f21461a);
        }
        return pg.f0.f21461a;
    }
}
