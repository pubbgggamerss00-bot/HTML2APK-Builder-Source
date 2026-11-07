package i0;

import i0.e;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b implements Runnable {
    public final /* synthetic */ e.a s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f13288t;

    public b(e.a aVar, Object obj) {
        this.s = aVar;
        this.f13288t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.s.s = this.f13288t;
    }
}
