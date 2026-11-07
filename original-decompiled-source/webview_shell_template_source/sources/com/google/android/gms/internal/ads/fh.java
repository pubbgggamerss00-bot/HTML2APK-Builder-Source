package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fh extends lh {
    public final boolean h;

    public fh(dg dgVar, kd kdVar, int i6) {
        super(dgVar, "dX06Fls5idqgQp2Q0AyXumriu5IrYF5E5esfObgzR5ftEXiNsSl4lbLxJh6DOYsi", "dGJd9fIaxgnbA6Dc4nB6tFRdL3cXJ8ToAbabnjV7KZM=", kdVar, i6, 61);
        this.h = dgVar.f3913r.f11612a;
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void a() {
        long jLongValue = ((Long) this.f6728e.invoke(null, this.f6724a.f3897a, Boolean.valueOf(this.h))).longValue();
        synchronized (this.f6727d) {
            kd kdVar = this.f6727d;
            kdVar.i();
            yd.N((yd) kdVar.f4126t, jLongValue);
        }
    }
}
