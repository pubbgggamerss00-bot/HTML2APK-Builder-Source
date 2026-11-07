package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class y70 implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f10877t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f10878u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ b80 f10879v;

    public /* synthetic */ y70(b80 b80Var, int i6, int i7, int i8) {
        this.s = i8;
        this.f10877t = i6;
        this.f10878u = i7;
        this.f10879v = b80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                f80 f80Var = ((z70) this.f10879v).H;
                if (f80Var != null) {
                    f80Var.j(this.f10877t, this.f10878u);
                    break;
                }
                break;
            default:
                f80 f80Var2 = ((z80) this.f10879v).f11216x;
                if (f80Var2 != null) {
                    f80Var2.j(this.f10877t, this.f10878u);
                    break;
                }
                break;
        }
    }
}
