package f9;

/* loaded from: classes.dex */
public final /* synthetic */ class be implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9130a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f9131b;

    public /* synthetic */ be(x0.n1 n1Var, int i10) {
        this.f9130a = i10;
        this.f9131b = n1Var;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        int i10 = this.f9130a;
        x0.n1 n1Var = this.f9131b;
        switch (i10) {
            case 0:
                String it = (String) obj;
                kotlin.jvm.internal.r.e(it, "it");
                StringBuilder sb = new StringBuilder();
                int length = it.length();
                for (int i11 = 0; i11 < length; i11++) {
                    char cCharAt = it.charAt(i11);
                    if (Character.isLetterOrDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                n1Var.setValue(mh.y.b0(8, sb.toString()));
                break;
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                mh.k kVar = q8.n2.f22323a;
                n1Var.setValue(bool);
                break;
        }
        return pg.f0.f21461a;
    }
}
