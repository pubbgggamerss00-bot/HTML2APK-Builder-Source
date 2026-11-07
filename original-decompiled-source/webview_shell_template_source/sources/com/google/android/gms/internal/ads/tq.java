package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class tq extends NativeAd.AdChoicesInfo {

    /* renamed from: a, reason: collision with root package name */
    public final sq f9365a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9366b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final String f9367c;

    public tq(sq sqVar) {
        yq xqVar;
        this.f9365a = sqVar;
        try {
            this.f9367c = sqVar.zzg();
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
            this.f9367c = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        try {
            ArrayList arrayListZzh = sqVar.zzh();
            int size = arrayListZzh.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayListZzh.get(i6);
                i6++;
                if (obj instanceof IBinder) {
                    IBinder iBinder = (IBinder) obj;
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    xqVar = iInterfaceQueryLocalInterface instanceof yq ? (yq) iInterfaceQueryLocalInterface : new xq(iBinder);
                } else {
                    xqVar = null;
                }
                if (xqVar != null) {
                    this.f9366b.add(new zq(xqVar));
                }
            }
        } catch (RemoteException e7) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e7);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.f9366b;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.f9367c;
    }
}
