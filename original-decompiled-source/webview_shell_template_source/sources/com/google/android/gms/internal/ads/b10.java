package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b10 extends NativeAd.AdChoicesInfo {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2887a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final String f2888b;

    public b10(sq sqVar) {
        try {
            this.f2888b = sqVar.zzg();
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
            this.f2888b = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        try {
            ArrayList arrayListZzh = sqVar.zzh();
            int size = arrayListZzh.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayListZzh.get(i6);
                i6++;
                yq yqVarI1 = obj instanceof IBinder ? mq.i1((IBinder) obj) : null;
                if (yqVarI1 != null) {
                    this.f2887a.add(new d10(yqVarI1));
                }
            }
        } catch (RemoteException e7) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e7);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.f2887a;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.f2888b;
    }
}
