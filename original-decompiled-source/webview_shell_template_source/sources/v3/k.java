package v3;

import com.google.android.gms.internal.ads.ow;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k implements n {
    public final Executor s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f14809t = new Object();

    /* renamed from: u, reason: collision with root package name */
    public final c f14810u;

    public k(Executor executor, c cVar) {
        this.s = executor;
        this.f14810u = cVar;
    }

    @Override // v3.n
    public final void a(p pVar) {
        synchronized (this.f14809t) {
        }
        this.s.execute(new ow(this, pVar, 8, false));
    }
}
