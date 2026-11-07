package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.gy;
import com.google.android.gms.internal.ads.o10;
import com.google.android.gms.internal.ads.p10;
import com.google.android.gms.internal.ads.q10;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e extends p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2277b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gy f2278c;

    public e(Context context, gy gyVar) {
        this.f2277b = context;
        this.f2278c = gyVar;
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final Object b(zzcp zzcpVar) {
        return zzcpVar.zzm(new k3.b(this.f2277b), this.f2278c, 244410000);
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final Object c() {
        Context context = this.f2277b;
        try {
            return ((q10) com.google.android.gms.ads.internal.util.client.zzs.zzb(context, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzai
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    int i6 = p10.s;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
                    return iInterfaceQueryLocalInterface instanceof q10 ? (q10) iInterfaceQueryLocalInterface : new o10(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
                }
            })).q(new k3.b(context), this.f2278c);
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException unused) {
            return null;
        }
    }
}
