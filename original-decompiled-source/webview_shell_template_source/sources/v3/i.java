package v3;

import com.google.android.gms.internal.ads.o30;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i<TResult, TContinuationResult> implements d, n {
    public final Executor s;

    /* renamed from: t, reason: collision with root package name */
    public final com.google.android.gms.ads.internal.overlay.i f14805t;

    /* renamed from: u, reason: collision with root package name */
    public final p f14806u;

    public i(Executor executor, com.google.android.gms.ads.internal.overlay.i iVar, p pVar) {
        this.s = executor;
        this.f14805t = iVar;
        this.f14806u = pVar;
    }

    @Override // v3.n
    public final void a(p pVar) {
        this.s.execute(new o30(this, pVar));
    }

    @Override // v3.d
    public final void k(Exception exc) {
        this.f14806u.i(exc);
    }
}
