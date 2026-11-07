package b9;

import x8.g5;

/* loaded from: classes.dex */
public final /* synthetic */ class h3 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3874a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f3875b;

    public /* synthetic */ h3(x0.n1 n1Var, int i10) {
        this.f3874a = i10;
        this.f3875b = n1Var;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f3874a;
        x0.n1 n1Var = this.f3875b;
        switch (i10) {
            case 0:
                n1Var.setValue(Boolean.FALSE);
                break;
            case 1:
                n1Var.setValue(Boolean.TRUE);
                break;
            default:
                boolean z10 = g5.f32665a;
                n1Var.setValue(null);
                break;
        }
        return pg.f0.f21461a;
    }
}
