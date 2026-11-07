package b;

/* loaded from: classes.dex */
public final class b0 extends kotlin.jvm.internal.s implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3215a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3216b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj, int i10) {
        super(0);
        this.f3215a = i10;
        this.f3216b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f3215a) {
            case 0:
                ((d0) this.f3216b).c();
                return pg.f0.f21461a;
            default:
                return ((l0.g) this.f3216b).f16612d.f16627a;
        }
    }
}
