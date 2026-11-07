package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.ar;
import com.google.android.gms.internal.ads.br;
import com.google.android.gms.internal.ads.dr;
import com.google.android.gms.internal.ads.er;
import com.google.android.gms.internal.ads.fr;
import com.google.android.gms.internal.ads.gr;
import com.google.android.gms.internal.ads.t20;
import com.google.android.gms.internal.ads.xs;
import com.google.android.gms.internal.ads.zn;
import k3.c;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n extends p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f2310b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f2311c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f2312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzba f2313e;

    public n(zzba zzbaVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f2310b = frameLayout;
        this.f2311c = frameLayout2;
        this.f2312d = context;
        this.f2313e = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final /* bridge */ /* synthetic */ Object a() {
        zzba.zzv(this.f2312d, "native_ad_view_delegate");
        return new zzfn();
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final Object b(zzcp zzcpVar) {
        return zzcpVar.zzj(new k3.b(this.f2310b), new k3.b(this.f2311c));
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final Object c() {
        Context context = this.f2312d;
        zn.a(context);
        boolean zBooleanValue = ((Boolean) zzbe.zzc().a(zn.Aa)).booleanValue();
        FrameLayout frameLayout = this.f2311c;
        FrameLayout frameLayout2 = this.f2310b;
        zzba zzbaVar = this.f2313e;
        if (zBooleanValue) {
            try {
                return br.zzdy(((gr) com.google.android.gms.ads.internal.util.client.zzs.zzb(context, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzaw
                    @Override // com.google.android.gms.ads.internal.util.client.zzq
                    public final Object zza(Object obj) {
                        IBinder iBinder = (IBinder) obj;
                        int i6 = fr.s;
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                        return iInterfaceQueryLocalInterface instanceof gr ? (gr) iInterfaceQueryLocalInterface : new er(iBinder);
                    }
                })).v1(new k3.b(context), new k3.b(frameLayout2), new k3.b(frameLayout)));
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e6) {
                zzbaVar.zzg = t20.a(context);
                zzbaVar.zzg.b("ClientApiBroker.createNativeAdViewDelegate", e6);
                return null;
            }
        }
        xs xsVar = zzbaVar.zzd;
        xsVar.getClass();
        try {
            IBinder iBinderV1 = ((gr) xsVar.getRemoteCreatorInstance(context)).v1(new k3.b(context), new k3.b(frameLayout2), new k3.b(frameLayout));
            if (iBinderV1 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderV1.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return iInterfaceQueryLocalInterface instanceof dr ? (dr) iInterfaceQueryLocalInterface : new ar(iBinderV1);
        } catch (RemoteException e7) {
            e = e7;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not create remote NativeAdViewDelegate.", e);
            return null;
        } catch (c.a e8) {
            e = e8;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }
}
