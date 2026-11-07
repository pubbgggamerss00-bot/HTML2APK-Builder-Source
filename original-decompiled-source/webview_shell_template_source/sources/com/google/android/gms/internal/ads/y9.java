package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class y9 implements l0 {
    public final m11 s;

    /* renamed from: t, reason: collision with root package name */
    public final ex0 f10894t = new ex0();

    /* renamed from: u, reason: collision with root package name */
    public final int f10895u;

    public y9(int i6, m11 m11Var) {
        this.f10895u = i6;
        this.s = m11Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        if (r13 == r16) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ae, code lost:
    
        return new com.google.android.gms.internal.ads.k0(-2, r13, r5 + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b1, code lost:
    
        return com.google.android.gms.internal.ads.k0.f6197d;
     */
    @Override // com.google.android.gms.internal.ads.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k0 b(y0 y0Var, long j6) {
        long j7;
        long jZzf = y0Var.zzf();
        int iMin = (int) Math.min(112800L, y0Var.zzd() - jZzf);
        ex0 ex0Var = this.f10894t;
        ex0Var.g(iMin);
        y0Var.h(0, iMin, ex0Var.f4416a);
        int i6 = ex0Var.f4418c;
        long j8 = -1;
        long j9 = -1;
        long j10 = -9223372036854775807L;
        while (true) {
            if (ex0Var.o() < 188) {
                j7 = -9223372036854775807L;
                break;
            }
            byte[] bArr = ex0Var.f4416a;
            int i7 = ex0Var.f4417b;
            while (true) {
                if (i7 >= i6) {
                    j7 = -9223372036854775807L;
                    break;
                }
                j7 = -9223372036854775807L;
                if (bArr[i7] == 71) {
                    break;
                }
                i7++;
            }
            int i8 = i7 + 188;
            if (i8 > i6) {
                break;
            }
            long jM = ed0.m(ex0Var, i7, this.f10895u);
            if (jM != j7) {
                long jB = this.s.b(jM);
                if (jB > j6) {
                    return j10 == j7 ? new k0(-1, jB, jZzf) : new k0(0, -9223372036854775807L, jZzf + j9);
                }
                j10 = jB;
                long j11 = i7;
                if (100000 + j10 > j6) {
                    return new k0(0, -9223372036854775807L, jZzf + j11);
                }
                j9 = j11;
            }
            ex0Var.j(i8);
            j8 = i8;
        }
    }

    @Override // com.google.android.gms.internal.ads.l0
    public final void zzb() {
        byte[] bArr = j31.f5919f;
        int length = bArr.length;
        this.f10894t.h(0, bArr);
    }
}
