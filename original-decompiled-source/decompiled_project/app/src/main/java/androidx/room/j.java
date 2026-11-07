package androidx.room;

import x0.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3002a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3003b;

    public /* synthetic */ j(Object obj, int i10) {
        this.f3002a = i10;
        this.f3003b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f3002a) {
            case 0:
                ((m) this.f3003b).getClass();
                break;
            default:
                ((n1) this.f3003b).setValue(Boolean.FALSE);
                break;
        }
        return pg.f0.f21461a;
    }
}
