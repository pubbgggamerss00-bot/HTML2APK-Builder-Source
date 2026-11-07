package v3;

import com.google.android.gms.ads.internal.client.x;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j implements n {
    public final Executor s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f14807t = new Object();

    /* renamed from: u, reason: collision with root package name */
    public final i f14808u;

    public j(Executor executor, i iVar) {
        this.s = executor;
        this.f14808u = iVar;
    }

    @Override // v3.n
    public final void a(p pVar) {
        if (pVar.f()) {
            synchronized (this.f14807t) {
            }
            this.s.execute(new x(3, this));
        }
    }
}
