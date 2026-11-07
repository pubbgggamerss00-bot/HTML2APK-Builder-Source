package d9;

import pg.f0;
import x0.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7661a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f7662b;

    public /* synthetic */ w(n1 n1Var, int i10) {
        this.f7661a = i10;
        this.f7662b = n1Var;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f7661a;
        n1 n1Var = this.f7662b;
        switch (i10) {
            case 0:
                h0.e eVar = m.f7624a;
                n1Var.setValue(Boolean.FALSE);
                break;
            default:
                n1Var.setValue("");
                break;
        }
        return f0.f21461a;
    }
}
