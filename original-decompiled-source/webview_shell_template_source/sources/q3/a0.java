package q3;

import android.os.SystemClock;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class a0 implements Runnable {
    public final long s;

    /* renamed from: t, reason: collision with root package name */
    public final long f14117t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f14118u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e0 f14119v;

    public a0(e0 e0Var, boolean z6) {
        this.f14119v = e0Var;
        e0Var.f14130b.getClass();
        this.s = System.currentTimeMillis();
        e0Var.f14130b.getClass();
        this.f14117t = SystemClock.elapsedRealtime();
        this.f14118u = z6;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        e0 e0Var = this.f14119v;
        if (e0Var.f14134f) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e6) {
            e0Var.a(e6, false, this.f14118u);
            b();
        }
    }

    public void b() {
    }
}
