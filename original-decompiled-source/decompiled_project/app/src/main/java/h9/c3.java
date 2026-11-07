package h9;

import s8.e2;

/* loaded from: classes.dex */
public final /* synthetic */ class c3 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12572a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12573b;

    public /* synthetic */ c3(Object obj, int i10) {
        this.f12572a = i10;
        this.f12573b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f12572a) {
            case 0:
                p5.x.c(e2.q.f24647c.f24627a, (p5.x) this.f12573b);
                break;
            default:
                ((cc.b) this.f12573b).a();
                break;
        }
        return pg.f0.f21461a;
    }
}
