package d9;

import pg.f0;
import s8.e2;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7640b;

    public /* synthetic */ o(Object obj, int i10) {
        this.f7639a = i10;
        this.f7640b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f7639a) {
            case 0:
                p5.x.c(e2.s.f24649c.f24627a, (p5.x) this.f7640b);
                return f0.f21461a;
            default:
                return f3.f.e((Object[]) this.f7640b);
        }
    }
}
