package i9;

import s8.b2;
import x0.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14322a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14323b;

    public /* synthetic */ f(Object obj, int i10) {
        this.f14322a = i10;
        this.f14323b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f14322a) {
            case 0:
                ((n1) this.f14323b).setValue(Boolean.FALSE);
                break;
            case 1:
                ((n1) this.f14323b).setValue(Boolean.FALSE);
                break;
            default:
                b2.e((p5.x) this.f14323b);
                break;
        }
        return pg.f0.f21461a;
    }
}
