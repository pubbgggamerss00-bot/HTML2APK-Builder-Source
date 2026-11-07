package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.gy;
import com.google.android.gms.internal.ads.t20;
import com.google.android.gms.internal.ads.zn;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c extends p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2273b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gy f2274c;

    public c(Context context, gy gyVar) {
        this.f2273b = context;
        this.f2274c = gyVar;
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final /* bridge */ /* synthetic */ Object a() {
        zzba.zzv(this.f2273b, "out_of_context_tester");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final Object b(zzcp zzcpVar) {
        Context context = this.f2273b;
        k3.b bVar = new k3.b(context);
        zn.a(context);
        if (((Boolean) zzbe.zzc().a(zn.m9)).booleanValue()) {
            return zzcpVar.zzi(bVar, this.f2274c, 244410000);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final Object c() {
        Context context = this.f2273b;
        k3.b bVar = new k3.b(context);
        zn.a(context);
        if (((Boolean) zzbe.zzc().a(zn.m9)).booleanValue()) {
            try {
                return ((zzdv) com.google.android.gms.ads.internal.util.client.zzs.zzb(context, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzae
                    @Override // com.google.android.gms.ads.internal.util.client.zzq
                    public final Object zza(Object obj) {
                        IBinder iBinder = (IBinder) obj;
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                        return iInterfaceQueryLocalInterface instanceof zzdv ? (zzdv) iInterfaceQueryLocalInterface : new zzdv(iBinder);
                    }
                })).zze(bVar, this.f2274c, 244410000);
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e6) {
                t20.a(context).b("ClientApiBroker.getOutOfContextTester", e6);
            }
        }
        return null;
    }
}
