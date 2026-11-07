package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ch extends lh {
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch(dg dgVar, kd kdVar, int i6, int i7) {
        super(dgVar, "P/SJPs6J09HHrsHH3yRlYUs/9QaX+N9sbuXBCqzOk0Vtsso6vN6yQG3sif+Q9+N4", "MRnsFh7aI+oC8kg1+amaEJuIrxjLkR8/37mSauK2nHU=", kdVar, i6, 12);
        this.h = i7;
        switch (i7) {
            case 1:
                super(dgVar, "SB9y9R9TfrBrk/vvw6hLKELaohqG/NwYydNqAtO02nMZ4t1KTWLQTj+uV3qwKJ+5", "zJhT7qghLWaTsmehrEh6IjKTMRAYPpUw83GIeS8cyos=", kdVar, i6, 51);
                break;
            default:
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void a() {
        switch (this.h) {
            case 0:
                kd kdVar = this.f6727d;
                kdVar.i();
                yd.J((yd) kdVar.f4126t, -1L);
                long jLongValue = ((Long) this.f6728e.invoke(null, this.f6724a.f3897a)).longValue();
                kdVar.i();
                yd.J((yd) kdVar.f4126t, jLongValue);
                return;
            default:
                synchronized (this.f6727d) {
                    String str = (String) this.f6728e.invoke(null, null);
                    zf zfVar = new zf(0);
                    HashMap mapD = me.d(str);
                    if (mapD != null) {
                        zfVar.f11271t = (Long) mapD.get(0);
                        zfVar.f11272u = (Long) mapD.get(1);
                    }
                    kd kdVar2 = this.f6727d;
                    long jLongValue2 = zfVar.f11271t.longValue();
                    kdVar2.i();
                    yd.P0((yd) kdVar2.f4126t, jLongValue2);
                    kd kdVar3 = this.f6727d;
                    long jLongValue3 = zfVar.f11272u.longValue();
                    kdVar3.i();
                    yd.Q0((yd) kdVar3.f4126t, jLongValue3);
                }
                return;
        }
    }
}
