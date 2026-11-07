package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.hr;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.jr;
import com.google.android.gms.internal.ads.kr;
import com.google.android.gms.internal.ads.lr;
import com.google.android.gms.internal.ads.mr;
import com.google.android.gms.internal.ads.t20;
import com.google.android.gms.internal.ads.ys;
import com.google.android.gms.internal.ads.zn;
import java.util.HashMap;
import k3.c;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o extends p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2314b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HashMap f2315c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HashMap f2316d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzba f2317e;

    public o(zzba zzbaVar, View view, HashMap map, HashMap map2) {
        this.f2314b = view;
        this.f2315c = map;
        this.f2316d = map2;
        this.f2317e = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final /* bridge */ /* synthetic */ Object a() {
        zzba.zzv(this.f2314b.getContext(), "native_ad_view_holder_delegate");
        return new zzfo();
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final Object b(zzcp zzcpVar) {
        return zzcpVar.zzk(new k3.b(this.f2314b), new k3.b(this.f2315c), new k3.b(this.f2316d));
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final Object c() {
        View view = this.f2314b;
        zn.a(view.getContext());
        boolean zBooleanValue = ((Boolean) zzbe.zzc().a(zn.Aa)).booleanValue();
        HashMap map = this.f2316d;
        HashMap map2 = this.f2315c;
        zzba zzbaVar = this.f2317e;
        if (zBooleanValue) {
            try {
                return ir.zze(((mr) com.google.android.gms.ads.internal.util.client.zzs.zzb(view.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzay
                    @Override // com.google.android.gms.ads.internal.util.client.zzq
                    public final Object zza(Object obj) {
                        IBinder iBinder = (IBinder) obj;
                        int i6 = lr.s;
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
                        return iInterfaceQueryLocalInterface instanceof mr ? (mr) iInterfaceQueryLocalInterface : new kr(iBinder);
                    }
                })).c1(new k3.b(view), new k3.b(map2), new k3.b(map)));
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e6) {
                zzbaVar.zzg = t20.a(view.getContext());
                zzbaVar.zzg.b("ClientApiBroker.createNativeAdViewHolderDelegate", e6);
                return null;
            }
        }
        ys ysVar = zzbaVar.zzf;
        ysVar.getClass();
        try {
            IBinder iBinderC1 = ((mr) ysVar.getRemoteCreatorInstance(view.getContext())).c1(new k3.b(view), new k3.b(map2), new k3.b(map));
            if (iBinderC1 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderC1.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            return iInterfaceQueryLocalInterface instanceof jr ? (jr) iInterfaceQueryLocalInterface : new hr(iBinderC1);
        } catch (RemoteException e7) {
            e = e7;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        } catch (c.a e8) {
            e = e8;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        }
    }
}
