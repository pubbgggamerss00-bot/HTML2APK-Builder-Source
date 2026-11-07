package d9;

import androidx.lifecycle.w0;
import f9.fg;
import pg.f0;
import sh.z0;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7599a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f7600b;

    public /* synthetic */ e(w0 w0Var, int i10) {
        this.f7599a = i10;
        this.f7600b = w0Var;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f7599a) {
            case 0:
                g8.u uVar = (g8.u) this.f7600b;
                h5.i LifecycleResumeEffect = (h5.i) obj;
                kotlin.jvm.internal.r.e(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
                uVar.f11633b.l();
                return new b0();
            default:
                fg fgVar = (fg) this.f7600b;
                String it = (String) obj;
                kotlin.jvm.internal.r.e(it, "it");
                z0 z0Var = fgVar.Q0;
                Integer numValueOf = Integer.valueOf(Integer.parseInt(it));
                z0Var.getClass();
                z0Var.j(null, numValueOf);
                return f0.f21461a;
        }
    }
}
