package b9;

import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class d1 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3784a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f3785b;

    public /* synthetic */ d1(x0.n1 n1Var, int i10) {
        this.f3784a = i10;
        this.f3785b = n1Var;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f3784a;
        x0.n1 n1Var = this.f3785b;
        switch (i10) {
            case 0:
                n1Var.setValue(Boolean.FALSE);
                break;
            default:
                List<String> list = f9.d1.f9265a;
                ((x0.l1) n1Var).f(0);
                break;
        }
        return pg.f0.f21461a;
    }
}
