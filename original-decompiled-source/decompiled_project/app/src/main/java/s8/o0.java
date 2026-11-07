package s8;

import s8.e2;

/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24700a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p5.x f24701b;

    public /* synthetic */ o0(p5.x xVar, int i10) {
        this.f24700a = i10;
        this.f24701b = xVar;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f24700a) {
            case 0:
                p5.x.c(e2.t.f24650c.f24627a, (p5.s0) this.f24701b);
                break;
            default:
                b2.e(this.f24701b);
                break;
        }
        return pg.f0.f21461a;
    }
}
