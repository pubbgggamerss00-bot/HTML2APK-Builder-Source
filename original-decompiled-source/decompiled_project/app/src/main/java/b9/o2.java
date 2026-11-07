package b9;

/* loaded from: classes.dex */
public final /* synthetic */ class o2 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4015a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.r3 f4016b;

    public /* synthetic */ o2(x0.r3 r3Var, int i10) {
        this.f4015a = i10;
        this.f4016b = r3Var;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f4015a) {
            case 0:
                return Float.valueOf(((Number) this.f4016b.getValue()).floatValue());
            default:
                ((x0.n1) this.f4016b).setValue(Boolean.FALSE);
                return pg.f0.f21461a;
        }
    }
}
