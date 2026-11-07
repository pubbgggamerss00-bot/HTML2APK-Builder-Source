package f9;

import s8.e2;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10820a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10821b;

    public /* synthetic */ w(Object obj, int i10) {
        this.f10820a = i10;
        this.f10821b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f10820a) {
            case 0:
                ((x0.n1) this.f10821b).setValue(Boolean.FALSE);
                break;
            default:
                p5.x.c(e2.r.f24648c.f24627a, (p5.x) this.f10821b);
                break;
        }
        return pg.f0.f21461a;
    }
}
