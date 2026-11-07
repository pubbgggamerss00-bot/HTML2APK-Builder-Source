package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ur {

    /* renamed from: a, reason: collision with root package name */
    public final tr f9618a;

    public ur(tr trVar) {
        Context context;
        this.f9618a = trVar;
        try {
            context = (Context) k3.b.i1(trVar.zzh());
        } catch (RemoteException | NullPointerException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
            context = null;
        }
        if (context != null) {
            try {
                this.f9618a.l(new k3.b(new MediaView(context)));
            } catch (RemoteException e7) {
                zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e7);
            }
        }
    }
}
