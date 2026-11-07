package f9;

import s8.e2;

/* loaded from: classes.dex */
public final /* synthetic */ class y6 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11012a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11013b;

    public /* synthetic */ y6(Object obj, int i10) {
        this.f11012a = i10;
        this.f11013b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f11012a) {
            case 0:
                ((x0.n1) this.f11013b).setValue(Boolean.FALSE);
                break;
            case 1:
                x8.g5.F((x0.n1) this.f11013b, false);
                break;
            default:
                p5.x.c(e2.q.f24647c.f24627a, (p5.x) this.f11013b);
                break;
        }
        return pg.f0.f21461a;
    }
}
