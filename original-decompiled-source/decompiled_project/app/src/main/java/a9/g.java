package a9;

import f9.fg;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.w0 f206b;

    public /* synthetic */ g(androidx.lifecycle.w0 w0Var, int i10) {
        this.f205a = i10;
        this.f206b = w0Var;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f205a) {
            case 0:
                g8.u uVar = (g8.u) this.f206b;
                h5.i LifecycleResumeEffect = (h5.i) obj;
                kotlin.jvm.internal.r.e(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
                uVar.f11633b.l();
                return new q();
            default:
                fg fgVar = (fg) this.f206b;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                sh.z0 z0Var = fgVar.f9597w0;
                z0Var.getClass();
                z0Var.j(null, bool);
                return pg.f0.f21461a;
        }
    }
}
