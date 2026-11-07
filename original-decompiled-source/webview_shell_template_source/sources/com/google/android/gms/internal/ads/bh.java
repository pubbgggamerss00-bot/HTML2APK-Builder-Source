package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class bh extends lh {
    public final sf h;

    /* renamed from: i, reason: collision with root package name */
    public final long f3170i;

    /* renamed from: j, reason: collision with root package name */
    public final long f3171j;

    public bh(dg dgVar, kd kdVar, int i6, sf sfVar, long j6, long j7) {
        super(dgVar, "zUKUGG1J4yK7pnB9K1G7a+rMPaRfdLvCWmWciVr52bCNv8jFIuRDvr12EhyQDayB", "c80TveimhHTg47yq+ca1w6vXt+JXULmGO8Nz62+yMN8=", kdVar, i6, 11);
        this.h = sfVar;
        this.f3170i = j6;
        this.f3171j = j7;
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void a() {
        sf sfVar = this.h;
        if (sfVar != null) {
            String str = (String) this.f6728e.invoke(null, sfVar.f8914a, Long.valueOf(this.f3170i), Long.valueOf(this.f3171j));
            qf qfVar = new qf(0);
            HashMap mapD = me.d(str);
            if (mapD != null) {
                qfVar.f8363t = (Long) mapD.get(0);
                qfVar.f8364u = (Long) mapD.get(1);
                qfVar.f8365v = (Long) mapD.get(2);
            }
            synchronized (this.f6727d) {
                try {
                    kd kdVar = this.f6727d;
                    long jLongValue = qfVar.f8363t.longValue();
                    kdVar.i();
                    yd.I((yd) kdVar.f4126t, jLongValue);
                    if (qfVar.f8364u.longValue() >= 0) {
                        kd kdVar2 = this.f6727d;
                        long jLongValue2 = qfVar.f8364u.longValue();
                        kdVar2.i();
                        yd.Z((yd) kdVar2.f4126t, jLongValue2);
                    }
                    if (qfVar.f8365v.longValue() >= 0) {
                        kd kdVar3 = this.f6727d;
                        long jLongValue3 = qfVar.f8365v.longValue();
                        kdVar3.i();
                        yd.F0((yd) kdVar3.f4126t, jLongValue3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
