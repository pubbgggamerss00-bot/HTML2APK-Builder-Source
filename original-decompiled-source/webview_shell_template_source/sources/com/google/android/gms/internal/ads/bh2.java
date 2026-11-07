package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class bh2 implements ni2 {
    public final cp1 s;

    /* renamed from: t, reason: collision with root package name */
    public long f3182t;

    public bh2(List list, List list2) {
        yn1 yn1Var = new yn1();
        y5.n(list.size() == list2.size());
        for (int i6 = 0; i6 < list.size(); i6++) {
            yn1Var.q(new ah2((ni2) list.get(i6), (List) list2.get(i6)));
        }
        this.s = yn1Var.t();
        this.f3182t = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final void b(long j6) {
        int i6 = 0;
        while (true) {
            cp1 cp1Var = this.s;
            if (i6 >= cp1Var.f3638v) {
                return;
            }
            ((ah2) cp1Var.get(i6)).b(j6);
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final boolean j(tb2 tb2Var) {
        boolean zJ;
        boolean z6 = false;
        do {
            long jZzc = zzc();
            if (jZzc == Long.MIN_VALUE) {
                break;
            }
            int i6 = 0;
            zJ = false;
            while (true) {
                cp1 cp1Var = this.s;
                if (i6 >= cp1Var.f3638v) {
                    break;
                }
                long jZzc2 = ((ah2) cp1Var.get(i6)).s.zzc();
                boolean z7 = jZzc2 != Long.MIN_VALUE && jZzc2 <= tb2Var.f9219a;
                if (jZzc2 == jZzc || z7) {
                    zJ |= ((ah2) cp1Var.get(i6)).s.j(tb2Var);
                }
                i6++;
            }
            z6 |= zJ;
        } while (zJ);
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final long zzb() {
        int i6 = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            cp1 cp1Var = this.s;
            if (i6 >= cp1Var.f3638v) {
                break;
            }
            ah2 ah2Var = (ah2) cp1Var.get(i6);
            long jZzb = ah2Var.s.zzb();
            bo1 bo1Var = ah2Var.f2763t;
            if ((bo1Var.contains(1) || bo1Var.contains(2) || bo1Var.contains(4)) && jZzb != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzb);
            }
            if (jZzb != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jZzb);
            }
            i6++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.f3182t = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j6 = this.f3182t;
        return j6 != -9223372036854775807L ? j6 : jMin2;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final long zzc() {
        int i6 = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            cp1 cp1Var = this.s;
            if (i6 >= cp1Var.f3638v) {
                break;
            }
            long jZzc = ((ah2) cp1Var.get(i6)).s.zzc();
            if (jZzc != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzc);
            }
            i6++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final boolean zzp() {
        int i6 = 0;
        while (true) {
            cp1 cp1Var = this.s;
            if (i6 >= cp1Var.f3638v) {
                return false;
            }
            if (((ah2) cp1Var.get(i6)).s.zzp()) {
                return true;
            }
            i6++;
        }
    }
}
