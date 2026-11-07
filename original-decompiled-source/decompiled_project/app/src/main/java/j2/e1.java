package j2;

/* loaded from: classes.dex */
public final class e1 extends kotlin.jvm.internal.s implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14711a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14712b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(Object obj, int i10) {
        super(0);
        this.f14711a = i10;
        this.f14712b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f14711a) {
            case 0:
                ((f1) this.f14712b).f14720b = null;
                return pg.f0.f21461a;
            default:
                return (Float) ((x0.r3) this.f14712b).getValue();
        }
    }
}
