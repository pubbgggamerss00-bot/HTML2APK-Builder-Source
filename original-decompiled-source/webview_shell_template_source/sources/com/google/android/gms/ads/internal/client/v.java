package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.consent_sdk.f2;
import com.google.android.ump.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class v implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2320t;

    public /* synthetic */ v(int i6, Object obj) {
        this.s = i6;
        this.f2320t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                zzfi zzfiVar = ((w) this.f2320t).s;
                if (zzfiVar.zza != null) {
                    try {
                        zzfiVar.zza.zze(1);
                        break;
                    } catch (RemoteException e6) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not notify onAdFailedToLoad event.", e6);
                        return;
                    }
                }
                break;
            case 1:
                ((a.InterfaceC0040a) this.f2320t).a(new f2(3, "No valid response received yet.").a());
                break;
            default:
                ((e3.r) this.f2320t).e();
                break;
        }
    }
}
