package v3;

import com.google.android.gms.internal.ads.bb;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h implements n {
    public final Executor s;

    /* renamed from: t, reason: collision with root package name */
    public final a f14803t;

    /* renamed from: u, reason: collision with root package name */
    public final p f14804u;

    public h(Executor executor, a aVar, p pVar) {
        this.s = executor;
        this.f14803t = aVar;
        this.f14804u = pVar;
    }

    @Override // v3.n
    public final void a(p pVar) {
        this.s.execute(new bb(12, this, pVar));
    }
}
