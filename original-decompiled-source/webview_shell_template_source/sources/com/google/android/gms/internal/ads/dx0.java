package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class dx0 extends bx0 {

    /* renamed from: g, reason: collision with root package name */
    public String f4057g;
    public int h;

    @Override // com.google.android.gms.common.internal.b.a
    public final void o(Bundle bundle) {
        synchronized (this.f3318b) {
            try {
                if (!this.f3320d) {
                    this.f3320d = true;
                    try {
                        try {
                            int i6 = this.h;
                            if (i6 == 2) {
                                ((g30) this.f3322f.getService()).J(this.f3321e, ((Boolean) zzbe.zzc().a(zn.Mc)).booleanValue() ? new ax0(this.f3317a, this.f3321e) : new zw0(this));
                            } else if (i6 == 3) {
                                ((g30) this.f3322f.getService()).Q0(this.f4057g, ((Boolean) zzbe.zzc().a(zn.Mc)).booleanValue() ? new ax0(this.f3317a, this.f3321e) : new zw0(this));
                            } else {
                                this.f3317a.b(new ix0(1));
                            }
                        } catch (Throwable th) {
                            zzv.zzp().h("RemoteUrlAndCacheKeyClientTask.onConnected", th);
                            this.f3317a.b(new ix0(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.f3317a.b(new ix0(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.bx0, com.google.android.gms.common.internal.b.InterfaceC0030b
    public final void r(c3.b bVar) {
        zzo.zze("Cannot connect to remote service, fallback to local instance.");
        this.f3317a.b(new ix0(1));
    }
}
