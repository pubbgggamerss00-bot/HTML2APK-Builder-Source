package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xr0 implements yt {
    public final cs s;

    /* renamed from: t, reason: collision with root package name */
    public final gs0 f10665t;

    /* renamed from: u, reason: collision with root package name */
    public final u92 f10666u;

    public xr0(pp0 pp0Var, jp0 jp0Var, gs0 gs0Var, u92 u92Var) {
        this.s = (cs) pp0Var.f8131g.get(jp0Var.a());
        this.f10665t = gs0Var;
        this.f10666u = u92Var;
    }

    @Override // com.google.android.gms.internal.ads.yt
    public final void d(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.s.D0((tr) this.f10666u.zzb(), str);
        } catch (RemoteException e6) {
            zzo.zzk("Failed to call onCustomClick for asset " + str + ".", e6);
        }
    }
}
