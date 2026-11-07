package s;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.s implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23711a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23712b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23713c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, Object obj, Object obj2) {
        super(0);
        this.f23711a = i10;
        this.f23712b = obj;
        this.f23713c = obj2;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f23711a) {
            case 0:
                ((rh.h) this.f23712b).g(this.f23713c);
                break;
            default:
                t.k kVar = (t.k) this.f23712b;
                q1.f2 f2Var = kVar.f25281t;
                i2.h0 h0Var = (i2.h0) this.f23713c;
                kVar.f25286z = f2Var.a(h0Var.f13901a.i(), h0Var.getLayoutDirection(), h0Var);
                break;
        }
        return pg.f0.f21461a;
    }
}
