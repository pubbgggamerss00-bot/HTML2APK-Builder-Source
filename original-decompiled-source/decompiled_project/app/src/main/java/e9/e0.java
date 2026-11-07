package e9;

import s8.e2;

/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8422a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p5.x f8423b;

    public /* synthetic */ e0(p5.x xVar, int i10) {
        this.f8422a = i10;
        this.f8423b = xVar;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f8422a) {
            case 0:
                p5.x.c(e2.f.f24636c.f24627a, this.f8423b);
                break;
            default:
                p5.x.c(e2.r.f24648c.f24627a, this.f8423b);
                break;
        }
        return pg.f0.f21461a;
    }
}
