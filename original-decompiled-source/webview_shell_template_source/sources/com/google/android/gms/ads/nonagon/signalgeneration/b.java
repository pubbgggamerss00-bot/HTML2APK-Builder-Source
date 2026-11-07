package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.f20;
import com.google.android.gms.internal.ads.zn;
import com.google.android.gms.internal.ads.zr1;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b implements zr1 {
    public final /* synthetic */ f20 s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f2380t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ zzau f2381u;

    public b(zzau zzauVar, f20 f20Var, boolean z6) {
        this.s = f20Var;
        this.f2380t = z6;
        this.f2381u = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2a(Object obj) {
        zzau zzauVar = this.f2381u;
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.s.W(arrayList);
            if (!zzauVar.zzr && !this.f2380t) {
                return;
            }
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj2 = arrayList.get(i6);
                i6++;
                Uri uri = (Uri) obj2;
                if (zzauVar.zzP(uri)) {
                    zzauVar.zzq.a(zzau.zzZ(uri, zzauVar.zzA, "1").toString(), null, null);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.m7)).booleanValue()) {
                        zzauVar.zzq.a(uri.toString(), null, null);
                    }
                }
            }
        } catch (RemoteException e6) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public final void j(Throwable th) {
        try {
            this.s.zze("Internal error: " + th.getMessage());
        } catch (RemoteException e6) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
    }
}
