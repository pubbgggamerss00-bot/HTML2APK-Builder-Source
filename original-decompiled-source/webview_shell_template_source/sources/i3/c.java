package i3;

import android.os.SystemClock;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public static final c f13363a = new c();

    @Override // i3.a
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // i3.a
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // i3.a
    public final long c() {
        return System.nanoTime();
    }
}
