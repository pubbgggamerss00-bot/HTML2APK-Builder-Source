package c6;

import b6.w;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2241a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f2242b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f2243c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f2244d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f2245e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f2246f;

    /* renamed from: g, reason: collision with root package name */
    public static final h f2247g;
    public static final h h;

    static {
        String property;
        int i6 = w.f2050a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f2241a = property;
        f2242b = b6.a.a("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i7 = w.f2050a;
        if (i7 < 2) {
            i7 = 2;
        }
        f2243c = b6.a.b(i7, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f2244d = b6.a.b(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f2245e = TimeUnit.SECONDS.toNanos(b6.a.a("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f2246f = e.s;
        f2247g = new h(0);
        h = new h(1);
    }
}
