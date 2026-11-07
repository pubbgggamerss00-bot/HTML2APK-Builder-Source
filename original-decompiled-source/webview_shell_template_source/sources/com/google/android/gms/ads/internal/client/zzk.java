package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.gy;
import com.google.android.gms.internal.ads.t20;
import com.google.android.gms.internal.ads.u20;
import com.google.android.gms.internal.ads.zn;
import k3.c;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzk extends k3.c {
    private u20 zza;

    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // k3.c
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof zzbz ? (zzbz) iInterfaceQueryLocalInterface : new zzbz(iBinder);
    }

    public final zzby zza(Context context, zzs zzsVar, String str, gy gyVar, int i6) {
        zn.a(context);
        if (((Boolean) zzbe.zzc().a(zn.Aa)).booleanValue()) {
            try {
                IBinder iBinderZze = ((zzbz) com.google.android.gms.ads.internal.util.client.zzs.zzb(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzj
                    @Override // com.google.android.gms.ads.internal.util.client.zzq
                    public final Object zza(Object obj) {
                        IBinder iBinder = (IBinder) obj;
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                        return iInterfaceQueryLocalInterface instanceof zzbz ? (zzbz) iInterfaceQueryLocalInterface : new zzbz(iBinder);
                    }
                })).zze(new k3.b(context), zzsVar, str, gyVar, 244410000, i6);
                if (iBinderZze != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    return iInterfaceQueryLocalInterface instanceof zzby ? (zzby) iInterfaceQueryLocalInterface : new zzbw(iBinderZze);
                }
            } catch (RemoteException e6) {
                e = e6;
                Throwable th = e;
                u20 u20VarA = t20.a(context);
                this.zza = u20VarA;
                u20VarA.b("AdManagerCreator.newAdManagerByDynamiteLoader", th);
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", th);
                return null;
            } catch (com.google.android.gms.ads.internal.util.client.zzr e7) {
                e = e7;
                Throwable th2 = e;
                u20 u20VarA2 = t20.a(context);
                this.zza = u20VarA2;
                u20VarA2.b("AdManagerCreator.newAdManagerByDynamiteLoader", th2);
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", th2);
                return null;
            } catch (NullPointerException e8) {
                e = e8;
                Throwable th22 = e;
                u20 u20VarA22 = t20.a(context);
                this.zza = u20VarA22;
                u20VarA22.b("AdManagerCreator.newAdManagerByDynamiteLoader", th22);
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", th22);
                return null;
            }
        } else {
            try {
                IBinder iBinderZze2 = ((zzbz) getRemoteCreatorInstance(context)).zze(new k3.b(context), zzsVar, str, gyVar, 244410000, i6);
                if (iBinderZze2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderZze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    return iInterfaceQueryLocalInterface2 instanceof zzby ? (zzby) iInterfaceQueryLocalInterface2 : new zzbw(iBinderZze2);
                }
            } catch (RemoteException e9) {
                e = e9;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Could not create remote AdManager.", e);
                return null;
            } catch (c.a e10) {
                e = e10;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Could not create remote AdManager.", e);
                return null;
            }
        }
        return null;
    }
}
