package e9;

import s8.b2;
import s8.e2;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8439a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p5.x f8440b;

    public /* synthetic */ i(p5.x xVar, int i10) {
        this.f8439a = i10;
        this.f8440b = xVar;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f8439a) {
            case 0:
                p5.x.c(e2.f.f24636c.f24627a, this.f8440b);
                break;
            default:
                b2.e(this.f8440b);
                break;
        }
        return pg.f0.f21461a;
    }
}
