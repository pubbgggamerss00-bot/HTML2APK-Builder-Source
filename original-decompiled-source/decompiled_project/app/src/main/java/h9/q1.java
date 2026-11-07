package h9;

import s8.e2;

/* loaded from: classes.dex */
public final /* synthetic */ class q1 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12763a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12764b;

    public /* synthetic */ q1(Object obj, int i10) {
        this.f12763a = i10;
        this.f12764b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f12763a) {
            case 0:
                p5.x.c(e2.m.f24643c.f24627a, (p5.x) this.f12764b);
                break;
            default:
                ((x0.n1) this.f12764b).setValue(Boolean.TRUE);
                break;
        }
        return pg.f0.f21461a;
    }
}
