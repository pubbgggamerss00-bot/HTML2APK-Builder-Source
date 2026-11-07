package f9;

/* loaded from: classes.dex */
public final /* synthetic */ class v8 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10803a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10804b;

    public /* synthetic */ v8(Object obj, int i10) {
        this.f10803a = i10;
        this.f10804b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f10803a) {
            case 0:
                String str = (String) this.f10804b;
                q2.d0 semantics = (q2.d0) obj;
                kotlin.jvm.internal.r.e(semantics, "$this$semantics");
                q2.a0.d(semantics, str);
                break;
            default:
                x8.n8 n8Var = (x8.n8) this.f10804b;
                s.b animateTo = (s.b) obj;
                kotlin.jvm.internal.r.e(animateTo, "$this$animateTo");
                n8Var.f32997j.setValue(new p1.c(((p1.c) animateTo.d()).f21129a));
                break;
        }
        return pg.f0.f21461a;
    }
}
