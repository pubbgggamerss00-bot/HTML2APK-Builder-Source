package d9;

import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import j9.x1;
import pg.f0;
import s8.e2;
import sh.z0;
import x0.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7658a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f7659b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7660c;

    public /* synthetic */ v(w0 w0Var, Object obj, int i10) {
        this.f7658a = i10;
        this.f7659b = w0Var;
        this.f7660c = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f7658a) {
            case 0:
                g8.u uVar = (g8.u) this.f7659b;
                w wVar = new w((n1) this.f7660c, 0);
                z0 z0Var = uVar.f11637f;
                if (!((Boolean) z0Var.getValue()).booleanValue()) {
                    z0Var.j(null, Boolean.TRUE);
                    ph.h.c(x0.a(uVar), null, null, new g8.t(uVar, wVar, null), 3);
                }
                break;
            default:
                x1 x1Var = (x1) this.f7659b;
                p5.x xVar = (p5.x) this.f7660c;
                x1Var.h();
                p5.x.c(e2.r.f24648c.f24627a, xVar);
                break;
        }
        return f0.f21461a;
    }
}
