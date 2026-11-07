package s2;

import androidx.work.impl.WorkDatabase;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final u2.a f14382a;

    /* renamed from: b, reason: collision with root package name */
    public final q2.a f14383b;

    /* renamed from: c, reason: collision with root package name */
    public final r2.m f14384c;

    static {
        androidx.work.k.e("WMFgUpdater");
    }

    public p(WorkDatabase workDatabase, j2.d dVar, u2.b bVar) {
        this.f14383b = dVar;
        this.f14382a = bVar;
        this.f14384c = workDatabase.n();
    }
}
