package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.av;
import com.google.android.gms.internal.ads.dv;
import com.google.android.gms.internal.ads.gy;
import com.google.android.gms.internal.ads.su;
import com.google.android.gms.internal.ads.yu;
import com.google.android.gms.internal.ads.zu;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f extends p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2279b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gy f2280c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ OnH5AdsEventListener f2281d;

    public f(Context context, gy gyVar, OnH5AdsEventListener onH5AdsEventListener) {
        this.f2279b = context;
        this.f2280c = gyVar;
        this.f2281d = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final Object a() {
        return new dv();
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final Object b(zzcp zzcpVar) {
        return zzcpVar.zzl(new k3.b(this.f2279b), this.f2280c, 244410000, new su(this.f2281d));
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final Object c() {
        Context context = this.f2279b;
        try {
            return ((av) com.google.android.gms.ads.internal.util.client.zzs.zzb(context, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzak
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    int i6 = zu.s;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
                    return iInterfaceQueryLocalInterface instanceof av ? (av) iInterfaceQueryLocalInterface : new yu(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
                }
            })).v(new k3.b(context), this.f2280c, new su(this.f2281d));
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException unused) {
            return null;
        }
    }
}
