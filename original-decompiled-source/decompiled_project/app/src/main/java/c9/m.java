package c9;

import x8.g5;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements eh.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5133a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5134b;

    public /* synthetic */ m(Object obj, int i10, int i11) {
        this.f5133a = i11;
        this.f5134b = obj;
    }

    @Override // eh.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5133a) {
            case 0:
                ((Integer) obj2).getClass();
                r0.b((String) this.f5134b, (x0.j) obj, f3.i.n(1));
                break;
            default:
                ((Integer) obj2).getClass();
                g5.c((androidx.compose.ui.d) this.f5134b, (x0.j) obj, f3.i.n(7));
                break;
        }
        return pg.f0.f21461a;
    }
}
