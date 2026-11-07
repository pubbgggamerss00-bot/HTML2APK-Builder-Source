package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m2 implements l0, eq0 {
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public Object f6905t;

    /* renamed from: u, reason: collision with root package name */
    public Object f6906u;

    public int a() {
        int i6 = this.s;
        if (i6 == 2) {
            return 2048;
        }
        if (i6 != 3) {
            return 0;
        }
        return AdRequest.MAX_CONTENT_URL_LENGTH;
    }

    @Override // com.google.android.gms.internal.ads.l0
    public k0 b(y0 y0Var, long j6) {
        long jZzf = y0Var.zzf();
        long jC = c(y0Var);
        long jZze = y0Var.zze();
        y0Var.a(Math.max(6, ((d1) this.f6905t).f3711c));
        long jC2 = c(y0Var);
        return (jC > j6 || jC2 <= j6) ? jC2 <= j6 ? new k0(-2, jC2, y0Var.zze()) : new k0(-1, jC, jZzf) : new k0(0, -9223372036854775807L, jZze);
    }

    public long c(y0 y0Var) {
        int iE;
        b1 b1Var = (b1) this.f6906u;
        d1 d1Var = (d1) this.f6905t;
        while (y0Var.zze() < y0Var.zzd() - 6) {
            int i6 = this.s;
            long jZze = y0Var.zze();
            byte[] bArr = new byte[2];
            int i7 = 0;
            y0Var.h(0, 2, bArr);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i6) {
                y0Var.zzj();
                y0Var.a((int) (jZze - y0Var.zzf()));
            } else {
                ex0 ex0Var = new ex0(16);
                System.arraycopy(bArr, 0, ex0Var.f4416a, 0, 2);
                byte[] bArr2 = ex0Var.f4416a;
                while (i7 < 14 && (iE = y0Var.e(2 + i7, 14 - i7, bArr2)) != -1) {
                    i7 += iE;
                }
                ex0Var.i(i7);
                y0Var.zzj();
                y0Var.a((int) (jZze - y0Var.zzf()));
                if (y5.l(ex0Var, d1Var, i6, b1Var)) {
                    break;
                }
            }
            y0Var.a(1);
        }
        if (y0Var.zze() < y0Var.zzd() - 6) {
            return b1Var.f2886a;
        }
        y0Var.a((int) (y0Var.zzd() - y0Var.zze()));
        return d1Var.f3717j;
    }

    @Override // com.google.android.gms.internal.ads.eq0, com.google.android.gms.internal.ads.jm0
    /* renamed from: zza */
    public void mo6zza(Object obj) {
        int i6 = gb2.f4973n0;
        ((bs) obj).k((bt) this.f6905t, (bt) this.f6906u, this.s);
    }

    @Override // com.google.android.gms.internal.ads.l0
    public /* synthetic */ void zzb() {
    }
}
