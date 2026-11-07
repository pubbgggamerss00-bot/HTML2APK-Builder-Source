package c9;

import t8.b3;
import t8.m3;
import t8.v2;

/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5127a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f5128b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.w0 f5129c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5130d;

    public /* synthetic */ l0(s1 s1Var, eh.a aVar, x0.n1 n1Var) {
        this.f5129c = s1Var;
        this.f5130d = aVar;
        this.f5128b = n1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f5127a;
        Object obj = this.f5130d;
        x0.n1 n1Var = this.f5128b;
        androidx.lifecycle.w0 w0Var = this.f5129c;
        switch (i10) {
            case 0:
                eh.a aVar = (eh.a) obj;
                if (((s1) w0Var).i()) {
                    r0.m(n1Var, true);
                } else {
                    aVar.invoke();
                }
                break;
            default:
                m3 m3Var = (m3) w0Var;
                x0.n1 n1Var2 = (x0.n1) obj;
                mh.k kVar = v2.f28495e;
                String prompt = mh.x.W((String) n1Var2.getValue()).toString();
                sh.z0 z0Var = m3Var.f28312g;
                kotlin.jvm.internal.r.e(prompt, "prompt");
                if (!mh.x.A(prompt) && !((b3) z0Var.getValue()).f28115e) {
                    if (((b3) z0Var.getValue()).f28112b == null) {
                        m3Var.m(prompt, false);
                    } else {
                        m3Var.m(prompt, true);
                    }
                }
                n1Var2.setValue("");
                n1Var.setValue(Boolean.TRUE);
                break;
        }
        return pg.f0.f21461a;
    }

    public /* synthetic */ l0(m3 m3Var, x0.n1 n1Var, x0.n1 n1Var2) {
        this.f5129c = m3Var;
        this.f5128b = n1Var;
        this.f5130d = n1Var2;
    }
}
