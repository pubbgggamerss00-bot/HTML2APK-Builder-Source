package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k6 implements q6 {
    public long A;
    public long B;
    public long C;
    public long D;
    public final p6 s;

    /* renamed from: t, reason: collision with root package name */
    public final long f6259t;

    /* renamed from: u, reason: collision with root package name */
    public final long f6260u;

    /* renamed from: v, reason: collision with root package name */
    public final s6 f6261v;

    /* renamed from: w, reason: collision with root package name */
    public int f6262w;

    /* renamed from: x, reason: collision with root package name */
    public long f6263x;

    /* renamed from: y, reason: collision with root package name */
    public long f6264y;

    /* renamed from: z, reason: collision with root package name */
    public long f6265z;

    public k6(s6 s6Var, long j6, long j7, long j8, long j9, boolean z6) {
        y5.n(j6 >= 0 && j7 > j6);
        this.f6261v = s6Var;
        this.f6259t = j6;
        this.f6260u = j7;
        if (j8 == j7 - j6 || z6) {
            this.f6263x = j9;
            this.f6262w = 4;
        } else {
            this.f6262w = 0;
        }
        this.s = new p6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.q6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(y0 y0Var) throws IOException {
        long j6;
        ?? r22;
        long j7;
        long j8;
        long jMax;
        long j9;
        int i6 = this.f6262w;
        long j10 = this.f6260u;
        p6 p6Var = this.s;
        if (i6 == 0) {
            j6 = 0;
            long jZzf = y0Var.zzf();
            this.f6264y = jZzf;
            this.f6262w = 1;
            long j11 = (-65307) + j10;
            if (j11 > jZzf) {
                return j11;
            }
            r22 = 0;
        } else if (i6 != 1) {
            if (i6 == 2) {
                long j12 = this.A;
                long j13 = this.B;
                if (j12 == j13) {
                    jMax = -1;
                    j8 = -1;
                } else {
                    long jZzf2 = y0Var.zzf();
                    if (p6Var.b(y0Var, j13)) {
                        p6Var.a(y0Var, false);
                        y0Var.zzj();
                        long j14 = this.f6265z;
                        long j15 = p6Var.f7950b;
                        long j16 = j14 - j15;
                        j7 = 2;
                        int i7 = p6Var.f7952d + p6Var.f7953e;
                        if (j16 < 0 || j16 >= 72000) {
                            if (j16 < 0) {
                                this.B = jZzf2;
                                this.D = j15;
                            } else {
                                this.A = y0Var.zzf() + i7;
                                this.C = j15;
                            }
                            long j17 = this.B;
                            long j18 = this.A;
                            long j19 = j17 - j18;
                            if (j19 < 100000) {
                                this.B = j18;
                                j8 = -1;
                                jMax = j18;
                            } else {
                                j8 = -1;
                                jMax = Math.max(j18, Math.min(((j16 * j19) / (this.D - this.C)) + (y0Var.zzf() - (i7 * (j16 <= 0 ? 2L : 1L))), j17 - 1));
                            }
                        } else {
                            jMax = -1;
                            j8 = -1;
                        }
                        if (jMax == j8) {
                            return jMax;
                        }
                        this.f6262w = 3;
                        j9 = j8;
                    } else {
                        jMax = this.A;
                        if (jMax == jZzf2) {
                            throw new IOException("No ogg page can be found.");
                        }
                        j8 = -1;
                    }
                }
                j7 = 2;
                if (jMax == j8) {
                }
            } else {
                if (i6 != 3) {
                    return -1L;
                }
                j9 = -1;
                j7 = 2;
            }
            while (true) {
                p6Var.b(y0Var, j9);
                p6Var.a(y0Var, false);
                if (p6Var.f7950b > this.f6265z) {
                    y0Var.zzj();
                    this.f6262w = 4;
                    return -(this.C + j7);
                }
                y0Var.b(p6Var.f7952d + p6Var.f7953e);
                this.A = y0Var.zzf();
                this.C = p6Var.f7950b;
                j9 = -1;
            }
        } else {
            j6 = 0;
            r22 = 0;
        }
        p6Var.f7949a = r22;
        p6Var.f7950b = j6;
        p6Var.f7951c = r22;
        p6Var.f7952d = r22;
        p6Var.f7953e = r22;
        if (!p6Var.b(y0Var, -1L)) {
            throw new EOFException();
        }
        p6Var.a(y0Var, r22);
        y0Var.b(p6Var.f7952d + p6Var.f7953e);
        long j20 = p6Var.f7950b;
        while ((p6Var.f7949a & 4) != 4 && p6Var.b(y0Var, -1L) && y0Var.zzf() < j10 && p6Var.a(y0Var, true)) {
            try {
                y0Var.b(p6Var.f7952d + p6Var.f7953e);
                j20 = p6Var.f7950b;
            } catch (EOFException unused) {
            }
        }
        this.f6263x = j20;
        this.f6262w = 4;
        return this.f6264y;
    }

    @Override // com.google.android.gms.internal.ads.q6
    public final void b(long j6) {
        this.f6265z = Math.max(0L, Math.min(j6, this.f6263x - 1));
        this.f6262w = 2;
        this.A = this.f6259t;
        this.B = this.f6260u;
        this.C = 0L;
        this.D = this.f6263x;
    }

    @Override // com.google.android.gms.internal.ads.q6
    public final /* bridge */ /* synthetic */ m1 zze() {
        if (this.f6263x != 0) {
            return new j6(this);
        }
        return null;
    }
}
