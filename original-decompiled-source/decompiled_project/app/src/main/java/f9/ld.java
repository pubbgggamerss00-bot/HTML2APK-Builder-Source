package f9;

import s8.e2;

/* loaded from: classes.dex */
public final /* synthetic */ class ld implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9993a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9994b;

    public /* synthetic */ ld(Object obj, int i10) {
        this.f9993a = i10;
        this.f9994b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f9993a;
        Object obj = this.f9994b;
        switch (i10) {
            case 0:
                p5.x.c(e2.m.f24643c.f24627a, (p5.x) obj);
                break;
            default:
                boolean z10 = x8.g5.f32665a;
                ((x0.n1) obj).setValue(Boolean.TRUE);
                break;
        }
        return pg.f0.f21461a;
    }
}
