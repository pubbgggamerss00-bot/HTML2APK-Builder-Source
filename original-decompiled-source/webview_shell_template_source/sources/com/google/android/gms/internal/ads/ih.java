package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ih extends lh {

    /* renamed from: i, reason: collision with root package name */
    public static volatile Long f5757i;

    /* renamed from: j, reason: collision with root package name */
    public static final Object f5758j = new Object();
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ih(dg dgVar, String str, String str2, kd kdVar, int i6, int i7) {
        super(dgVar, str, str2, kdVar, i6, i7);
        this.h = 0;
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void a() {
        switch (this.h) {
            case 0:
                if (f5757i == null) {
                    synchronized (f5758j) {
                        try {
                            if (f5757i == null) {
                                f5757i = (Long) this.f6728e.invoke(null, null);
                            }
                        } finally {
                        }
                    }
                }
                synchronized (this.f6727d) {
                    kd kdVar = this.f6727d;
                    long jLongValue = f5757i.longValue();
                    kdVar.i();
                    yd.f0((yd) kdVar.f4126t, jLongValue);
                }
                return;
            case 1:
                String str = (String) this.f6728e.invoke(null, null);
                synchronized (this.f6727d) {
                    kd kdVar2 = this.f6727d;
                    kdVar2.i();
                    yd.G0((yd) kdVar2.f4126t, str);
                }
                return;
            default:
                Boolean bool = (Boolean) zzbe.zzc().a(zn.V2);
                bool.getClass();
                String str2 = (String) this.f6728e.invoke(null, this.f6724a.f3897a, bool);
                uf ufVar = new uf(0);
                ufVar.f9546t = -1L;
                ufVar.f9547u = -1L;
                HashMap mapD = me.d(str2);
                if (mapD != null) {
                    ufVar.f9546t = ((Long) mapD.get(0)).longValue();
                    ufVar.f9547u = ((Long) mapD.get(1)).longValue();
                }
                synchronized (this.f6727d) {
                    kd kdVar3 = this.f6727d;
                    long j6 = ufVar.f9546t;
                    kdVar3.i();
                    yd.J0((yd) kdVar3.f4126t, j6);
                    kd kdVar4 = this.f6727d;
                    long j7 = ufVar.f9547u;
                    kdVar4.i();
                    yd.L((yd) kdVar4.f4126t, j7);
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih(dg dgVar, kd kdVar, int i6, int i7) {
        super(dgVar, "3Zd6ToP6YGdtLSvr/9LlH3RQ74jHr5f7QlQE5jiIZQZu/jwK9FxbxcEE4M1niHI2", "5EH0wgVOsOOfycPFtjiDLlWMUl1WsId7lt7tllT9vVA=", kdVar, i6, 89);
        this.h = i7;
        switch (i7) {
            case 2:
                super(dgVar, "GGM8PCgCXWCZ0992hlu+wbFZrEEMwhwHhgONgPT83ZyPiH7oTYURaPK5zfMGe4DG", "nPlMagQmW6RSJqnTQ57SbpssxbOxIap7X2C6yeu+l3U=", kdVar, i6, 3);
                break;
            default:
                break;
        }
    }
}
