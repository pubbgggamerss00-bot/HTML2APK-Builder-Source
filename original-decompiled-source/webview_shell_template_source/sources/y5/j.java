package y5;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j extends z0 implements i {

    /* renamed from: w, reason: collision with root package name */
    public final c1 f15351w;

    public j(c1 c1Var) {
        this.f15351w = c1Var;
    }

    @Override // y5.i
    public final boolean b(Throwable th) {
        c1 c1VarK = k();
        if (th instanceof CancellationException) {
            return true;
        }
        return c1VarK.w(th) && c1VarK.C();
    }

    @Override // p5.l
    public final /* bridge */ /* synthetic */ d5.j invoke(Throwable th) {
        j(th);
        return d5.j.f12745a;
    }

    @Override // y5.n
    public final void j(Throwable th) {
        this.f15351w.w(k());
    }
}
