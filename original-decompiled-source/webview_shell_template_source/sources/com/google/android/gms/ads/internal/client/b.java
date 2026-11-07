package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.r10;
import com.google.android.gms.internal.ads.s10;
import com.google.android.gms.internal.ads.t10;
import com.google.android.gms.internal.ads.t20;
import com.google.android.gms.internal.ads.u10;
import com.google.android.gms.internal.ads.v10;
import com.google.android.gms.internal.ads.w10;
import com.google.android.gms.internal.ads.x10;
import com.google.android.gms.internal.ads.zn;
import k3.c;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b extends p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f2271b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzba f2272c;

    public b(zzba zzbaVar, Activity activity) {
        this.f2271b = activity;
        this.f2272c = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final /* bridge */ /* synthetic */ Object a() {
        zzba.zzv(this.f2271b, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final Object b(zzcp zzcpVar) {
        return zzcpVar.zzn(new k3.b(this.f2271b));
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final Object c() {
        Activity activity = this.f2271b;
        zn.a(activity);
        boolean zBooleanValue = ((Boolean) zzbe.zzc().a(zn.Aa)).booleanValue();
        zzba zzbaVar = this.f2272c;
        if (zBooleanValue) {
            try {
                return t10.zzI(((x10) com.google.android.gms.ads.internal.util.client.zzs.zzb(activity, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzac
                    @Override // com.google.android.gms.ads.internal.util.client.zzq
                    public final Object zza(Object obj) {
                        IBinder iBinder = (IBinder) obj;
                        int i6 = w10.s;
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                        return iInterfaceQueryLocalInterface instanceof x10 ? (x10) iInterfaceQueryLocalInterface : new v10(iBinder);
                    }
                })).g(new k3.b(activity)));
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e6) {
                zzbaVar.zzg = t20.a(activity.getApplicationContext());
                zzbaVar.zzg.b("ClientApiBroker.createAdOverlay", e6);
                return null;
            }
        }
        r10 r10Var = zzbaVar.zze;
        r10Var.getClass();
        try {
            IBinder iBinderG = ((x10) r10Var.getRemoteCreatorInstance(activity)).g(new k3.b(activity));
            if (iBinderG == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderG.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return iInterfaceQueryLocalInterface instanceof u10 ? (u10) iInterfaceQueryLocalInterface : new s10(iBinderG);
        } catch (RemoteException e7) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not create remote AdOverlay.", e7);
            return null;
        } catch (c.a e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not create remote AdOverlay.", e8);
            return null;
        }
    }
}
