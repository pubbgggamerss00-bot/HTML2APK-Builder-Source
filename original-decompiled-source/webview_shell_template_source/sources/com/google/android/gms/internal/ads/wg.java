package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class wg extends lh {
    public final eg h;

    public wg(dg dgVar, kd kdVar, int i6, eg egVar) {
        super(dgVar, "e9GN1ULeRXoIWzbGPleyg0VqwusIk+Y8UB0jj4l1lcVfEVgEFoeRxD7pvq3YAOeu", "j+KOJWcuW5eAeYurIvI/WDWaxjjVmMhwZuok18XlZ7Q=", kdVar, i6, 85);
        this.h = egVar;
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void a() {
        long[] jArr = (long[]) this.f6728e.invoke(null, Long.valueOf(this.h.f4274c), Long.valueOf(this.h.f4275d), Long.valueOf(this.h.f4276e), Long.valueOf(this.h.f4277f));
        synchronized (this.f6727d) {
            kd kdVar = this.f6727d;
            long j6 = jArr[0];
            kdVar.i();
            yd.E((yd) kdVar.f4126t, j6);
            kd kdVar2 = this.f6727d;
            long j7 = jArr[1];
            kdVar2.i();
            yd.D((yd) kdVar2.f4126t, j7);
        }
    }
}
