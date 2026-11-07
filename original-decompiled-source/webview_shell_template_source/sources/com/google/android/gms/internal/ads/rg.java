package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class rg extends lh {
    public final /* synthetic */ int h = 0;

    public /* synthetic */ rg(dg dgVar, String str, String str2, kd kdVar, int i6, int i7) {
        super(dgVar, str, str2, kdVar, i6, i7);
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void a() {
        switch (this.h) {
            case 0:
                kd kdVar = this.f6727d;
                kdVar.i();
                yd.M0((yd) kdVar.f4126t, -1L);
                kd kdVar2 = this.f6727d;
                kdVar2.i();
                yd.L0((yd) kdVar2.f4126t, -1L);
                int[] iArr = (int[]) this.f6728e.invoke(null, this.f6724a.f3897a);
                synchronized (this.f6727d) {
                    try {
                        kd kdVar3 = this.f6727d;
                        long j6 = iArr[0];
                        kdVar3.i();
                        yd.M0((yd) kdVar3.f4126t, j6);
                        kd kdVar4 = this.f6727d;
                        long j7 = iArr[1];
                        kdVar4.i();
                        yd.L0((yd) kdVar4.f4126t, j7);
                        int i6 = iArr[2];
                        if (i6 != Integer.MIN_VALUE) {
                            kd kdVar5 = this.f6727d;
                            kdVar5.i();
                            yd.K0((yd) kdVar5.f4126t, i6);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                int i7 = true == ((Boolean) this.f6728e.invoke(null, this.f6724a.f3897a)).booleanValue() ? 2 : 1;
                kd kdVar6 = this.f6727d;
                kdVar6.i();
                yd.r0((yd) kdVar6.f4126t, i7);
                return;
        }
    }

    public rg(dg dgVar, kd kdVar, int i6) {
        super(dgVar, "BI30n3J1CRcYA+VG0+4MYT6iqJe6ygS/jaP36BUmRAco9FZAzOIaWUnrLPPOeEgd", "opDPFauVb4cwnfQzDqDp9yn5NlOrrzIvgPDGrYZmcXE=", kdVar, i6, 5);
    }
}
