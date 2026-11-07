package androidx.lifecycle;

import x0.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2338a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2339b;

    public /* synthetic */ p0(Object obj, int i10) {
        this.f2338a = i10;
        this.f2339b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f2338a) {
            case 0:
                break;
            case 1:
                ((n1) this.f2339b).setValue(Boolean.FALSE);
                break;
            default:
                ((eh.a) this.f2339b).invoke();
                break;
        }
        return pg.f0.f21461a;
    }
}
