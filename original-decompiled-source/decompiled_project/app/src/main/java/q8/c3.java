package q8;

import x8.g5;

/* loaded from: classes.dex */
public final /* synthetic */ class c3 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22153a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f22154b;

    public /* synthetic */ c3(x0.n1 n1Var, int i10) {
        this.f22153a = i10;
        this.f22154b = n1Var;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f22153a;
        x0.n1 n1Var = this.f22154b;
        switch (i10) {
            case 0:
                n1Var.setValue(Boolean.FALSE);
                break;
            default:
                boolean z10 = g5.f32665a;
                n1Var.setValue(Boolean.TRUE);
                break;
        }
        return pg.f0.f21461a;
    }
}
