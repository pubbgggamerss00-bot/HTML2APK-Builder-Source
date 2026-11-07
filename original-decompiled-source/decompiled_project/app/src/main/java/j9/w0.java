package j9;

import s8.e2;

/* loaded from: classes.dex */
public final /* synthetic */ class w0 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15573a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15574b;

    public /* synthetic */ w0(Object obj, int i10) {
        this.f15573a = i10;
        this.f15574b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f15573a) {
            case 0:
                s8.b2.e((p5.x) this.f15574b);
                break;
            case 1:
                ((m9.x0) this.f15574b).c(true);
                break;
            default:
                p5.x.c(e2.f.f24636c.f24627a, (p5.s0) this.f15574b);
                break;
        }
        return pg.f0.f21461a;
    }
}
