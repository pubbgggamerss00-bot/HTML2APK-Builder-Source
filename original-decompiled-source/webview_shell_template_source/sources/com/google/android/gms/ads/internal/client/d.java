package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.gy;
import com.google.android.gms.internal.ads.m60;
import com.google.android.gms.internal.ads.n60;
import com.google.android.gms.internal.ads.o60;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d extends p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2275b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gy f2276c;

    public d(Context context, gy gyVar) {
        this.f2275b = context;
        this.f2276c = gyVar;
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final Object b(zzcp zzcpVar) {
        return zzcpVar.zzq(new k3.b(this.f2275b), this.f2276c, 244410000);
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final Object c() {
        Context context = this.f2275b;
        try {
            return ((o60) com.google.android.gms.ads.internal.util.client.zzs.zzb(context, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzag
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    int i6 = n60.s;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
                    return iInterfaceQueryLocalInterface instanceof o60 ? (o60) iInterfaceQueryLocalInterface : new m60(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
                }
            })).q(new k3.b(context), this.f2276c);
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException unused) {
            return null;
        }
    }
}
