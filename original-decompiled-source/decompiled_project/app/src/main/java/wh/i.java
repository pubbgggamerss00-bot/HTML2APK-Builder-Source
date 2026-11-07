package wh;

import java.util.concurrent.TimeUnit;
import uh.w;
import uh.x;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f31571a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f31572b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f31573c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f31574d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f31575e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f31576f;

    static {
        String property;
        int i10 = x.f29772a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f31571a = property;
        f31572b = w.a("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = x.f29772a;
        if (i11 < 2) {
            i11 = 2;
        }
        f31573c = w.b(i11, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f31574d = w.b(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f31575e = TimeUnit.SECONDS.toNanos(w.a("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f31576f = e.f31566a;
    }
}
