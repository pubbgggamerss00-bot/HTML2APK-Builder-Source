package v3;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m implements n {
    public final Executor s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f14813t = new Object();

    /* renamed from: u, reason: collision with root package name */
    public final i f14814u;

    public m(Executor executor, i iVar) {
        this.s = executor;
        this.f14814u = iVar;
    }

    @Override // v3.n
    public final void a(p pVar) {
        if (pVar.h()) {
            synchronized (this.f14813t) {
            }
            this.s.execute(new r0.a(this, pVar));
        }
    }
}
