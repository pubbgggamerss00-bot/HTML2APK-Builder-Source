package androidx.room;

import s8.b2;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3007a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3008b;

    public /* synthetic */ l(Object obj, int i10) {
        this.f3007a = i10;
        this.f3008b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f3007a) {
            case 0:
                m mVar = (m) this.f3008b;
                break;
            case 1:
                bi.g gVar = (bi.g) this.f3008b;
                break;
            case 2:
                ((eh.a) this.f3008b).invoke();
                break;
            default:
                b2.e((p5.x) this.f3008b);
                break;
        }
        return pg.f0.f21461a;
    }
}
