package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class u80 implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ z80 f9490t;

    public /* synthetic */ u80(z80 z80Var, int i6) {
        this.s = i6;
        this.f9490t = z80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                f80 f80Var = this.f9490t.f11216x;
                if (f80Var != null) {
                    f80Var.f();
                    break;
                }
                break;
            default:
                f80 f80Var2 = this.f9490t.f11216x;
                if (f80Var2 != null) {
                    f80Var2.e();
                    break;
                }
                break;
        }
    }
}
