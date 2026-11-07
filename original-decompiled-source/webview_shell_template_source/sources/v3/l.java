package v3;

import com.google.android.gms.internal.ads.as1;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l implements n {
    public final Executor s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f14811t = new Object();

    /* renamed from: u, reason: collision with root package name */
    public final d f14812u;

    public l(Executor executor, d dVar) {
        this.s = executor;
        this.f14812u = dVar;
    }

    @Override // v3.n
    public final void a(p pVar) {
        if (pVar.h() || pVar.f()) {
            return;
        }
        synchronized (this.f14811t) {
        }
        this.s.execute(new as1(this, pVar));
    }
}
