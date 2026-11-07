package androidx.room;

import x0.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3097a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3098b;

    public /* synthetic */ y(Object obj, int i10) {
        this.f3097a = i10;
        this.f3098b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f3097a) {
            case 0:
                z zVar = (z) this.f3098b;
                i6.b db2 = (i6.b) obj;
                kotlin.jvm.internal.r.e(db2, "db");
                zVar.f3103g = db2;
                break;
            default:
                n1 n1Var = (n1) this.f3098b;
                String it = (String) obj;
                kotlin.jvm.internal.r.e(it, "it");
                n1Var.setValue(it);
                break;
        }
        return pg.f0.f21461a;
    }
}
