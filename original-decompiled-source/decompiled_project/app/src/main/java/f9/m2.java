package f9;

import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class m2 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10017a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f10018b;

    public /* synthetic */ m2(x0.n1 n1Var, int i10) {
        this.f10017a = i10;
        this.f10018b = n1Var;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f10017a;
        x0.n1 n1Var = this.f10018b;
        switch (i10) {
            case 0:
                List<String> list = d1.f9265a;
                n1Var.setValue(Boolean.TRUE);
                break;
            default:
                n1Var.setValue(null);
                break;
        }
        return pg.f0.f21461a;
    }
}
