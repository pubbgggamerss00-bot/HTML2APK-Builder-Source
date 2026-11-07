package c9;

import x8.g5;

/* loaded from: classes.dex */
public final /* synthetic */ class b1 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5071a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5072b;

    public /* synthetic */ b1(Object obj, int i10) {
        this.f5071a = i10;
        this.f5072b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f5071a;
        Object obj = this.f5072b;
        switch (i10) {
            case 0:
                ((s1) obj).n(-1);
                break;
            default:
                boolean z10 = g5.f32665a;
                ((x0.n1) obj).setValue(Boolean.TRUE);
                break;
        }
        return pg.f0.f21461a;
    }
}
