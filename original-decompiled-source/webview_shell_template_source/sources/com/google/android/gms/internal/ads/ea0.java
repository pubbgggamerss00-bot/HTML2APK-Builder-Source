package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ea0 implements lo1 {

    /* renamed from: a, reason: collision with root package name */
    public final bl1 f4183a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4184b;

    /* renamed from: c, reason: collision with root package name */
    public final lo1 f4185c;

    /* renamed from: d, reason: collision with root package name */
    public long f4186d;

    /* renamed from: e, reason: collision with root package name */
    public Uri f4187e;

    public ea0(bl1 bl1Var, int i6, lo1 lo1Var) {
        this.f4183a = bl1Var;
        this.f4184b = i6;
        this.f4185c = lo1Var;
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final long c(os1 os1Var) {
        os1 os1Var2;
        Uri uri = os1Var.f7851a;
        long j6 = os1Var.f7854d;
        long j7 = os1Var.f7853c;
        this.f4187e = uri;
        long j8 = this.f4184b;
        os1 os1Var3 = null;
        if (j7 >= j8) {
            os1Var2 = null;
        } else {
            long jMin = j8 - j7;
            if (j6 != -1) {
                jMin = Math.min(j6, jMin);
            }
            os1Var2 = new os1(os1Var.f7851a, j7, jMin);
        }
        if (j6 == -1 || j7 + j6 > j8) {
            os1Var3 = new os1(os1Var.f7851a, Math.max(j8, j7), j6 != -1 ? Math.min(j6, (j7 + j6) - j8) : -1L);
        }
        long jC = os1Var2 != null ? this.f4183a.c(os1Var2) : 0L;
        long jC2 = os1Var3 != null ? this.f4185c.c(os1Var3) : 0L;
        this.f4186d = j7;
        if (jC == -1 || jC2 == -1) {
            return -1L;
        }
        return jC + jC2;
    }

    @Override // com.google.android.gms.internal.ads.gc2
    public final int j(int i6, int i7, byte[] bArr) {
        int i8;
        long j6 = this.f4186d;
        long j7 = this.f4184b;
        if (j6 < j7) {
            int iJ = this.f4183a.j(i6, (int) Math.min(i7, j7 - j6), bArr);
            long j8 = this.f4186d + iJ;
            this.f4186d = j8;
            i8 = iJ;
            j6 = j8;
        } else {
            i8 = 0;
        }
        if (j6 < j7) {
            return i8;
        }
        int iJ2 = this.f4185c.j(i6 + i8, i7 - i8, bArr);
        int i9 = i8 + iJ2;
        this.f4186d += iJ2;
        return i9;
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final Uri zzc() {
        return this.f4187e;
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final void zzd() {
        this.f4183a.zzd();
        this.f4185c.zzd();
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final Map zze() {
        return ip1.f5823y;
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final void d(o52 o52Var) {
    }
}
