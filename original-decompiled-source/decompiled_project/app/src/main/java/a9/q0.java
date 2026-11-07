package a9;

import s8.e2;

/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f294a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f295b;

    public /* synthetic */ q0(Object obj, int i10) {
        this.f294a = i10;
        this.f295b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f294a) {
            case 0:
                p5.x.c(e2.x.f24654c.f24627a, (p5.x) this.f295b);
                break;
            default:
                ((c.k) this.f295b).a(new String[]{"application/pdf"});
                break;
        }
        return pg.f0.f21461a;
    }
}
