package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.consent_sdk.f2;
import com.google.android.ump.a;
import e3.b0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class x implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2321t;

    public /* synthetic */ x(int i6, Object obj) {
        this.s = i6;
        this.f2321t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                zzfk zzfkVar = (zzfk) this.f2321t;
                if (zzfkVar.zza != null) {
                    try {
                        zzfkVar.zza.zze(1);
                        return;
                    } catch (RemoteException e6) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not notify onAdFailedToLoad event.", e6);
                        return;
                    }
                }
                return;
            case 1:
                ((a.InterfaceC0040a) this.f2321t).a(new f2(3, "Privacy options form is being loading. Please try again later.").a());
                return;
            case 2:
                ((b0) this.f2321t).f12864y.b(new c3.b(4, null, null));
                return;
            default:
                synchronized (((v3.j) this.f2321t).f14807t) {
                    ((v3.j) this.f2321t).f14808u.f14806u.k();
                }
                return;
        }
    }
}
