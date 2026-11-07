package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class z90 extends s90 implements h80 {
    public long A;
    public long B;

    /* renamed from: v, reason: collision with root package name */
    public ja0 f11225v;

    /* renamed from: w, reason: collision with root package name */
    public String f11226w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f11227x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f11228y;

    /* renamed from: z, reason: collision with root package name */
    public j90 f11229z;

    public static String s(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    @Override // com.google.android.gms.internal.ads.h80
    public final void b(final boolean z6, final long j6) {
        final p80 p80Var = (p80) this.f8853u.get();
        if (p80Var != null) {
            i70.f5591f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.y90
                @Override // java.lang.Runnable
                public final void run() {
                    p80Var.k0(z6, j6);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.h80
    public final void c(IOException iOException) {
        zzo.zzk("Precache exception", iOException);
        zzv.zzp().g("VideoStreamExoPlayerCache.onException", iOException);
    }

    @Override // com.google.android.gms.internal.ads.h80
    public final void e(String str, Exception exc) {
        zzo.zzk("Precache error", exc);
        zzv.zzp().g("VideoStreamExoPlayerCache.onError", exc);
    }

    @Override // com.google.android.gms.internal.ads.s90
    public final void i() {
        synchronized (this) {
            this.f11227x = true;
            notify();
            release();
        }
        String str = this.f11226w;
        if (str != null) {
            j(this.f11226w, "cache:".concat(String.valueOf(zzf.zzf(str))), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.s90
    public final void k(int i6) {
        ca0 ca0Var = this.f11225v.f5989v;
        synchronized (ca0Var) {
            ca0Var.f3498d = i6 * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.s90
    public final void l(int i6) {
        ca0 ca0Var = this.f11225v.f5989v;
        synchronized (ca0Var) {
            ca0Var.f3499e = i6 * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.s90
    public final void m(int i6) {
        ca0 ca0Var = this.f11225v.f5989v;
        synchronized (ca0Var) {
            ca0Var.f3497c = i6 * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.s90
    public final void n(int i6) {
        ca0 ca0Var = this.f11225v.f5989v;
        synchronized (ca0Var) {
            ca0Var.f3496b = i6 * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.s90
    public final boolean p(String str) {
        return q(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [android.os.Handler] */
    @Override // com.google.android.gms.internal.ads.s90
    public final boolean q(String str, String[] strArr) throws Throwable {
        boolean z6;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        boolean z7;
        long j14;
        int i6;
        int i7;
        Handler handler;
        long j15;
        long j16;
        z90 z90Var = this;
        String str2 = str;
        z90Var.f11226w = str2;
        String strConcat = "cache:".concat(String.valueOf(zzf.zzf(str2)));
        boolean z8 = false;
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i8 = 0; i8 < strArr.length; i8++) {
                uriArr[i8] = Uri.parse(strArr[i8]);
            }
            ja0 ja0Var = z90Var.f11225v;
            ja0Var.getClass();
            ja0Var.r(uriArr, ByteBuffer.allocate(0), false);
            p80 p80Var = (p80) z90Var.f8853u.get();
            if (p80Var != null) {
                p80Var.b0(strConcat, z90Var);
            }
            i3.a aVarZzC = zzv.zzC();
            long jA = aVarZzC.a();
            long jLongValue = ((Long) zzbe.zzc().a(zn.L)).longValue();
            long jLongValue2 = ((Long) zzbe.zzc().a(zn.K)).longValue() * 1000;
            long jIntValue = ((Integer) zzbe.zzc().a(zn.s)).intValue();
            boolean zBooleanValue = ((Boolean) zzbe.zzc().a(zn.Y1)).booleanValue();
            long j17 = -1;
            z90Var = z90Var;
            while (true) {
                synchronized (this) {
                    try {
                        if (aVarZzC.a() - jA > jLongValue2) {
                            throw new IOException("Timeout reached. Limit: " + jLongValue2 + " ms");
                        }
                        if (z90Var.f11227x) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (z90Var.f11228y) {
                            return true;
                        }
                        uc2 uc2Var = z90Var.f11225v.A;
                        if (!(uc2Var != null ? true : z8)) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long jB = uc2Var.B();
                        if (jB > 0) {
                            long jA2 = z90Var.f11225v.A.A();
                            if (jA2 != j17) {
                                if (jA2 > 0) {
                                    j12 = jLongValue;
                                    j13 = jLongValue2;
                                    j10 = jB;
                                    z7 = true;
                                } else {
                                    j12 = jLongValue;
                                    j13 = jLongValue2;
                                    j10 = jB;
                                    z7 = z8;
                                }
                                if (zBooleanValue) {
                                    try {
                                        ja0 ja0Var2 = z90Var.f11225v;
                                        j14 = (ja0Var2.M == null || !ja0Var2.M.f3815o) ? ja0Var2.E : 0L;
                                    } catch (Throwable th) {
                                        th = th;
                                        z6 = false;
                                    }
                                } else {
                                    j14 = -1;
                                }
                                long jU = zBooleanValue ? z90Var.f11225v.u() : -1L;
                                long jQ = zBooleanValue ? z90Var.f11225v.q() : -1L;
                                try {
                                    i6 = i80.s.get();
                                    i7 = i80.f5598t.get();
                                    handler = zzf.zza;
                                    j9 = j12;
                                    j6 = j13;
                                    j7 = jIntValue;
                                    j15 = jU;
                                    z6 = false;
                                    j16 = j14;
                                    j11 = jA2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    z6 = false;
                                    z90Var = this;
                                    str2 = str;
                                    throw th;
                                }
                                try {
                                    m90 m90Var = new m90(z90Var, str2, strConcat, j11, j10, j16, j15, jQ, z7, i6, i7);
                                    ?? r12 = handler;
                                    r12.post(m90Var);
                                    j17 = j11;
                                    z90Var = r12;
                                } catch (Throwable th3) {
                                    th = th3;
                                    z90Var = this;
                                    str2 = str;
                                    throw th;
                                }
                            } else {
                                z6 = z8;
                                j9 = jLongValue;
                                j6 = jLongValue2;
                                j7 = jIntValue;
                                j10 = jB;
                                j11 = jA2;
                                z90Var = z90Var;
                            }
                            if (j11 >= j10) {
                                zzf.zza.post(new q90(this, str, strConcat, j10));
                                return true;
                            }
                            try {
                                z90 z90Var2 = this;
                                str2 = str;
                                if (z90Var2.f11225v.E >= j7 && j11 > 0) {
                                    return true;
                                }
                                j8 = j9;
                                z90Var = z90Var2;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } else {
                            z6 = z8;
                            j6 = jLongValue2;
                            j7 = jIntValue;
                            j8 = jLongValue;
                            z90Var = z90Var;
                        }
                        try {
                            z90Var.wait(j8);
                        } catch (InterruptedException unused) {
                            throw new IOException("Wait interrupted.");
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        z6 = z8;
                    }
                }
                try {
                    throw th;
                } catch (Exception e6) {
                    e = e6;
                    zzo.zzj("Failed to preload url " + str2 + " Exception: " + e.getMessage());
                    zzv.zzp().g("VideoStreamExoPlayerCache.preload", e);
                    z90Var.release();
                    z90Var.j(str2, strConcat, "error", s("error", e));
                    return z6;
                }
                jLongValue = j8;
                jIntValue = j7;
                z8 = z6;
                jLongValue2 = j6;
                z90Var = z90Var;
            }
        } catch (Exception e7) {
            e = e7;
            z6 = z8;
        }
    }

    @Override // com.google.android.gms.internal.ads.s90
    public final boolean r(String str, String[] strArr, j90 j90Var) {
        this.f11226w = str;
        this.f11229z = j90Var;
        String strConcat = "cache:".concat(String.valueOf(zzf.zzf(str)));
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i6 = 0; i6 < strArr.length; i6++) {
                uriArr[i6] = Uri.parse(strArr[i6]);
            }
            ja0 ja0Var = this.f11225v;
            ja0Var.getClass();
            ja0Var.r(uriArr, ByteBuffer.allocate(0), false);
            p80 p80Var = (p80) this.f8853u.get();
            if (p80Var != null) {
                p80Var.b0(strConcat, this);
            }
            this.A = zzv.zzC().a();
            this.B = -1L;
            zzs.zza.postDelayed(new yh(4, this), 0L);
            return true;
        } catch (Exception e6) {
            zzo.zzj("Failed to preload url " + str + " Exception: " + e6.getMessage());
            zzv.zzp().g("VideoStreamExoPlayerCache.preload", e6);
            release();
            j(str, strConcat, "error", s("error", e6));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.s90, d3.g
    public final void release() {
        ja0 ja0Var = this.f11225v;
        if (ja0Var != null) {
            ja0Var.D = null;
            uc2 uc2Var = ja0Var.A;
            if (uc2Var != null) {
                uc2Var.f9530v.a();
                uc2Var.f9529u.A(ja0Var);
                uc2 uc2Var2 = ja0Var.A;
                uc2Var2.f9530v.a();
                uc2Var2.f9529u.S();
                ja0Var.A = null;
                i80.f5598t.decrementAndGet();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.h80
    public final void zzv() {
        zzo.zzj("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.h80
    public final void a(int i6) {
    }

    @Override // com.google.android.gms.internal.ads.h80
    public final void g(int i6, int i7) {
    }
}
