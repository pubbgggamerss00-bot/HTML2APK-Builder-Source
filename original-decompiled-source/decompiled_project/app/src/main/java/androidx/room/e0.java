package androidx.room;

import x0.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2903a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2904b;

    public /* synthetic */ e0(Object obj, int i10) {
        this.f2903a = i10;
        this.f2904b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f2903a) {
            case 0:
                return g0.createConnectionManager$lambda$1((g0) this.f2904b, (c) obj);
            default:
                n1 n1Var = (n1) this.f2904b;
                String it = (String) obj;
                kotlin.jvm.internal.r.e(it, "it");
                n1Var.setValue(it);
                return pg.f0.f21461a;
        }
    }
}
