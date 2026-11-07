package d9;

import pg.f0;
import s8.e2;
import x0.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7642b;

    public /* synthetic */ p(Object obj, int i10) {
        this.f7641a = i10;
        this.f7642b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f7641a) {
            case 0:
                p5.x.c(e2.b.f24631c.f24627a, (p5.x) this.f7642b);
                break;
            default:
                ((n1) this.f7642b).setValue(null);
                break;
        }
        return f0.f21461a;
    }
}
