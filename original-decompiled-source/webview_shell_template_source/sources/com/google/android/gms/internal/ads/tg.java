package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class tg extends lh {
    public final long h;

    public tg(dg dgVar, kd kdVar, long j6, int i6) {
        super(dgVar, "y3qsDqWUxj+0NW9GzaLLQcml0WYfJuDlvc/LrtwTbAkNDXLpsSYbwYlOmoW50beE", "vyPJQ44Cs+DiV597MU4yHYF5mAH0rpjmfJE+rEowUe0=", kdVar, i6, 25);
        this.h = j6;
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void a() {
        long jLongValue = ((Long) this.f6728e.invoke(null, null)).longValue();
        synchronized (this.f6727d) {
            try {
                kd kdVar = this.f6727d;
                kdVar.i();
                yd.C((yd) kdVar.f4126t, jLongValue);
                long j6 = this.h;
                if (j6 != 0) {
                    kd kdVar2 = this.f6727d;
                    kdVar2.i();
                    yd.d0((yd) kdVar2.f4126t, jLongValue - j6);
                    kd kdVar3 = this.f6727d;
                    long j7 = this.h;
                    kdVar3.i();
                    yd.e0((yd) kdVar3.f4126t, j7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
