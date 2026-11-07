package a9;

import s8.e2;
import x8.j6;

/* loaded from: classes.dex */
public final /* synthetic */ class m1 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f264a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f265b;

    public /* synthetic */ m1(Object obj, int i10) {
        this.f264a = i10;
        this.f265b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f264a) {
            case 0:
                ((b2) this.f265b).f138b.getClass();
                break;
            case 1:
                p5.x.c(e2.s.f24649c.f24627a, (p5.x) this.f265b);
                break;
            default:
                ((j6) this.f265b).M();
                break;
        }
        return pg.f0.f21461a;
    }
}
