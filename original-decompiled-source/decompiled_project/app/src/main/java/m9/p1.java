package m9;

/* loaded from: classes.dex */
public final /* synthetic */ class p1 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17882a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17883b;

    public /* synthetic */ p1(Object obj, int i10) {
        this.f17882a = i10;
        this.f17883b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.a
    public final Object invoke() {
        switch (this.f17882a) {
            case 0:
                return s1.a((s1) this.f17883b);
            default:
                ((x0.n1) this.f17883b).setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return pg.f0.f21461a;
        }
    }
}
