package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m11 {

    /* renamed from: a, reason: collision with root package name */
    public long f6901a;

    /* renamed from: b, reason: collision with root package name */
    public long f6902b;

    /* renamed from: c, reason: collision with root package name */
    public long f6903c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal f6904d = new ThreadLocal();

    public m11() {
        e(0L);
    }

    public final synchronized long a(long j6) {
        long j7;
        if (j6 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            synchronized (this) {
                if (!(this.f6902b != -9223372036854775807L)) {
                    long jLongValue = this.f6901a;
                    if (jLongValue == 9223372036854775806L) {
                        Long l4 = (Long) this.f6904d.get();
                        if (l4 == null) {
                            throw null;
                        }
                        jLongValue = l4.longValue();
                    }
                    this.f6902b = jLongValue - j6;
                    notifyAll();
                }
                this.f6903c = j6;
                j7 = j6 + this.f6902b;
            }
            return j7;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j6) {
        if (j6 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j7 = this.f6903c;
            if (j7 != -9223372036854775807L) {
                long jU = j31.u(j7, 90000L, 1000000L, RoundingMode.DOWN);
                long j8 = (4294967296L + jU) / 8589934592L;
                long j9 = (((-1) + j8) * 8589934592L) + j6;
                long j10 = (j8 * 8589934592L) + j6;
                j6 = Math.abs(j9 - jU) < Math.abs(j10 - jU) ? j9 : j10;
            }
            return a(j31.u(j6, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c(long j6) {
        if (j6 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j7 = this.f6903c;
            if (j7 != -9223372036854775807L) {
                long jU = j31.u(j7, 90000L, 1000000L, RoundingMode.DOWN);
                long j8 = jU / 8589934592L;
                long j9 = (j8 * 8589934592L) + j6;
                j6 = j9 >= jU ? j9 : ((j8 + 1) * 8589934592L) + j6;
            }
            return a(j31.u(j6, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long d() {
        long j6 = this.f6901a;
        if (j6 == Long.MAX_VALUE || j6 == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j6;
    }

    public final synchronized void e(long j6) {
        this.f6901a = j6;
        this.f6902b = j6 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f6903c = -9223372036854775807L;
    }
}
