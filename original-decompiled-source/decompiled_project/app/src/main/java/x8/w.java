package x8;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33302a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f33303b;

    public /* synthetic */ w(x0.n1 n1Var, int i10) {
        this.f33302a = i10;
        this.f33303b = n1Var;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        int i10 = this.f33302a;
        x0.n1 n1Var = this.f33303b;
        switch (i10) {
            case 0:
                String it = (String) obj;
                kotlin.jvm.internal.r.e(it, "it");
                String strB0 = mh.y.b0(40, it);
                float f10 = s.f33139a;
                n1Var.setValue(strB0);
                return pg.f0.f21461a;
            default:
                return (Long) ((eh.l) n1Var.getValue()).invoke((p1.c) obj);
        }
    }
}
