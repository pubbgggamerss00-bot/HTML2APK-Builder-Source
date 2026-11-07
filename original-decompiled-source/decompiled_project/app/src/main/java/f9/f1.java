package f9;

import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class f1 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9516a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.a f9517b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f9518c;

    public /* synthetic */ f1(eh.a aVar, x0.n1 n1Var, int i10) {
        this.f9516a = i10;
        this.f9517b = aVar;
        this.f9518c = n1Var;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f9516a;
        x0.n1 n1Var = this.f9518c;
        eh.a aVar = this.f9517b;
        switch (i10) {
            case 0:
                List<String> list = d1.f9265a;
                n1Var.setValue(Boolean.FALSE);
                aVar.invoke();
                break;
            default:
                aVar.invoke();
                n1Var.setValue(Boolean.FALSE);
                break;
        }
        return pg.f0.f21461a;
    }
}
