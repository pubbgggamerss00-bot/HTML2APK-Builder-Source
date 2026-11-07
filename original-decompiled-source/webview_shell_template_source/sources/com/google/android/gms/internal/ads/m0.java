package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f6893a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f6894b;

    /* renamed from: c, reason: collision with root package name */
    public i0 f6895c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6896d;

    public m0(j0 j0Var, l0 l0Var, long j6, long j7, long j8, long j9, long j10, int i6) {
        this.f6894b = l0Var;
        this.f6896d = i6;
        this.f6893a = new h0(j0Var, j6, j7, j8, j9, j10);
    }

    public static final int c(y0 y0Var, long j6, b1 b1Var) {
        if (j6 == y0Var.zzf()) {
            return 0;
        }
        b1Var.f2886a = j6;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c2, code lost:
    
        return c(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(y0 y0Var, b1 b1Var) {
        while (true) {
            i0 i0Var = this.f6895c;
            y5.k(i0Var);
            long j6 = i0Var.f5528f;
            long j7 = i0Var.f5529g;
            long j8 = i0Var.h;
            long j9 = j7 - j6;
            long j10 = this.f6896d;
            l0 l0Var = this.f6894b;
            if (j9 <= j10) {
                this.f6895c = null;
                l0Var.zzb();
                return c(y0Var, j6, b1Var);
            }
            long jZzf = j8 - y0Var.zzf();
            if (jZzf < 0 || jZzf > 262144) {
                break;
            }
            y0Var.b((int) jZzf);
            y0Var.zzj();
            k0 k0VarB = l0Var.b(y0Var, i0Var.f5524b);
            int i6 = k0VarB.f6198a;
            long j11 = k0VarB.f6199b;
            long j12 = k0VarB.f6200c;
            if (i6 == -3) {
                this.f6895c = null;
                l0Var.zzb();
                return c(y0Var, j8, b1Var);
            }
            if (i6 == -2) {
                i0Var.f5526d = j11;
                i0Var.f5528f = j12;
                i0Var.h = i0.a(i0Var.f5524b, j11, i0Var.f5527e, j12, i0Var.f5529g, i0Var.f5525c);
            } else {
                if (i6 != -1) {
                    long jZzf2 = j12 - y0Var.zzf();
                    if (jZzf2 >= 0 && jZzf2 <= 262144) {
                        y0Var.b((int) jZzf2);
                    }
                    this.f6895c = null;
                    l0Var.zzb();
                    return c(y0Var, j12, b1Var);
                }
                i0Var.f5527e = j11;
                i0Var.f5529g = j12;
                i0Var.h = i0.a(i0Var.f5524b, i0Var.f5526d, j11, i0Var.f5528f, j12, i0Var.f5525c);
            }
        }
    }

    public final void b(long j6) {
        i0 i0Var = this.f6895c;
        if (i0Var == null || i0Var.f5523a != j6) {
            h0 h0Var = this.f6893a;
            this.f6895c = new i0(j6, h0Var.f5194a.c(j6), h0Var.f5196c, h0Var.f5197d, h0Var.f5198e, h0Var.f5199f);
        }
    }
}
