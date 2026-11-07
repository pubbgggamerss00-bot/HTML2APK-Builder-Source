package s5;

import p5.h0;
import pg.f0;
import x0.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24506a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24507b;

    public /* synthetic */ n(Object obj, int i10) {
        this.f24506a = i10;
        this.f24507b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f24506a) {
            case 0:
                h0 h0Var = (h0) this.f24507b;
                String key = (String) obj;
                kotlin.jvm.internal.r.e(key, "key");
                return Boolean.valueOf(!h0Var.c().contains(key));
            default:
                n1 n1Var = (n1) this.f24507b;
                ((Boolean) obj).getClass();
                n1Var.setValue(Boolean.FALSE);
                return f0.f21461a;
        }
    }
}
