package f9;

import s8.e2;

/* loaded from: classes.dex */
public final /* synthetic */ class tb implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10590a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10591b;

    public /* synthetic */ tb(Object obj, int i10) {
        this.f10590a = i10;
        this.f10591b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f10590a) {
            case 0:
                p5.x.c(e2.r.f24648c.f24627a, (p5.x) this.f10591b);
                break;
            case 1:
                s8.b2.e((p5.x) this.f10591b);
                break;
            default:
                ((x0.n1) this.f10591b).setValue(Boolean.FALSE);
                break;
        }
        return pg.f0.f21461a;
    }
}
