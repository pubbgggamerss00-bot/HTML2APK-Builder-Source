package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class la implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public z0 f6631a;

    /* renamed from: b, reason: collision with root package name */
    public s1 f6632b;

    /* renamed from: c, reason: collision with root package name */
    public int f6633c;

    /* renamed from: d, reason: collision with root package name */
    public long f6634d;

    /* renamed from: e, reason: collision with root package name */
    public ja f6635e;

    /* renamed from: f, reason: collision with root package name */
    public int f6636f;

    /* renamed from: g, reason: collision with root package name */
    public long f6637g;

    @Override // com.google.android.gms.internal.ads.x0
    public final void c(long j6, long j7) {
        this.f6633c = j6 == 0 ? 0 : 4;
        ja jaVar = this.f6635e;
        if (jaVar != null) {
            jaVar.a(j7);
        }
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final boolean d(y0 y0Var) {
        return oa.a(y0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0170, code lost:
    
        if (r13 != 65534) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0199  */
    @Override // com.google.android.gms.internal.ads.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(y0 y0Var, b1 b1Var) throws rn {
        byte[] bArr;
        int i6;
        y5.k(this.f6632b);
        int i7 = j31.f5914a;
        int i8 = this.f6633c;
        int iQ = 4;
        if (i8 == 0) {
            y5.r(y0Var.zzf() == 0);
            int i9 = this.f6636f;
            if (i9 != -1) {
                y0Var.b(i9);
                this.f6633c = 4;
                return 0;
            }
            if (!oa.a(y0Var)) {
                throw rn.a(null, "Unsupported or unrecognized wav file type.");
            }
            y0Var.b((int) (y0Var.zze() - y0Var.zzf()));
            this.f6633c = 1;
            return 0;
        }
        long jA = -1;
        if (i8 == 1) {
            ex0 ex0Var = new ex0(8);
            na naVarA = na.a(y0Var, ex0Var);
            if (naVarA.f7361a != 1685272116) {
                y0Var.zzj();
            } else {
                y0Var.a(8);
                ex0Var.j(0);
                y0Var.h(0, 8, ex0Var.f4416a);
                jA = ex0Var.A();
                y0Var.b(((int) naVarA.f7362b) + 8);
            }
            this.f6634d = jA;
            this.f6633c = 2;
            return 0;
        }
        if (i8 != 2) {
            if (i8 != 3) {
                y5.r(this.f6637g != -1);
                long jZzf = this.f6637g - y0Var.zzf();
                ja jaVar = this.f6635e;
                jaVar.getClass();
                return jaVar.d(y0Var, jZzf) ? -1 : 0;
            }
            y0Var.zzj();
            na naVarB = oa.b(1684108385, y0Var, new ex0(8));
            y0Var.b(8);
            Pair pairCreate = Pair.create(Long.valueOf(y0Var.zzf()), Long.valueOf(naVarB.f7362b));
            this.f6636f = ((Long) pairCreate.first).intValue();
            long jLongValue = ((Long) pairCreate.second).longValue();
            long j6 = this.f6634d;
            if (j6 != -1 && jLongValue == 4294967295L) {
                jLongValue = j6;
            }
            long j7 = this.f6636f + jLongValue;
            this.f6637g = j7;
            long jZzd = y0Var.zzd();
            if (jZzd != -1 && j7 > jZzd) {
                qs0.f("WavExtractor", "Data exceeds input length: " + j7 + ", " + jZzd);
                this.f6637g = jZzd;
                j7 = jZzd;
            }
            ja jaVar2 = this.f6635e;
            jaVar2.getClass();
            jaVar2.c(this.f6636f, j7);
            this.f6633c = 4;
            return 0;
        }
        ex0 ex0Var2 = new ex0(16);
        long j8 = oa.b(1718449184, y0Var, ex0Var2).f7362b;
        y5.r(j8 >= 16);
        y0Var.h(0, 16, ex0Var2.f4416a);
        ex0Var2.j(0);
        int iT = ex0Var2.t();
        int iT2 = ex0Var2.t();
        int iS = ex0Var2.s();
        ex0Var2.s();
        int iT3 = ex0Var2.t();
        int iT4 = ex0Var2.t();
        int i10 = ((int) j8) - 16;
        if (i10 > 0) {
            bArr = new byte[i10];
            y0Var.h(0, i10, bArr);
        } else {
            bArr = j31.f5919f;
        }
        byte[] bArr2 = bArr;
        y0Var.b((int) (y0Var.zze() - y0Var.zzf()));
        ma maVar = new ma(iT, iT2, iS, iT3, iT4, bArr2);
        if (iT == 17) {
            this.f6635e = new ia(this.f6631a, this.f6632b, maVar);
        } else if (iT == 6) {
            this.f6635e = new ka(this.f6631a, this.f6632b, maVar, "audio/g711-alaw", -1);
        } else if (iT == 7) {
            this.f6635e = new ka(this.f6631a, this.f6632b, maVar, "audio/g711-mlaw", -1);
        } else if (iT == 1) {
            iQ = j31.q(iT4);
            i6 = iQ;
            if (i6 == 0) {
                throw rn.b("Unsupported WAV format type: " + iT);
            }
            this.f6635e = new ka(this.f6631a, this.f6632b, maVar, "audio/raw", i6);
        } else {
            if (iT == 3) {
                if (iT4 == 32) {
                    i6 = iQ;
                }
                if (i6 == 0) {
                }
            }
            i6 = 0;
            if (i6 == 0) {
            }
        }
        this.f6633c = 3;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final void f(z0 z0Var) {
        this.f6631a = z0Var;
        this.f6632b = z0Var.g(0, 1);
        z0Var.d();
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final List zzd() {
        zn1 zn1Var = bo1.f3236t;
        return cp1.f3636w;
    }
}
