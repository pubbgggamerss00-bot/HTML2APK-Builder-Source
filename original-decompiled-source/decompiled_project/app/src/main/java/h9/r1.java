package h9;

import s8.e2;

/* loaded from: classes.dex */
public final /* synthetic */ class r1 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12775a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p5.x f12776b;

    public /* synthetic */ r1(p5.x xVar, int i10) {
        this.f12775a = i10;
        this.f12776b = xVar;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f12775a) {
            case 0:
                p5.x.c(e2.m.f24643c.f24627a, this.f12776b);
                break;
            default:
                s8.b2.e(this.f12776b);
                break;
        }
        return pg.f0.f21461a;
    }
}
