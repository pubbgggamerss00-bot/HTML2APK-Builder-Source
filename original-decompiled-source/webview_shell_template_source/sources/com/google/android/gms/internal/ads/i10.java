package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzfd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i10 implements NativeCustomFormatAd {

    /* renamed from: a, reason: collision with root package name */
    public final tr f5533a;

    /* renamed from: b, reason: collision with root package name */
    public c10 f5534b;

    public i10(tr trVar) {
        this.f5533a = trVar;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void destroy() {
        try {
            this.f5533a.zzl();
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final List<String> getAvailableAssetNames() {
        try {
            return this.f5533a.zzk();
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final String getCustomFormatId() {
        try {
            return this.f5533a.zzi();
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final NativeCustomFormatAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        tr trVar = this.f5533a;
        try {
            if (this.f5534b == null && trVar.zzq()) {
                this.f5534b = new c10(trVar);
            }
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
        return this.f5534b;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final NativeAd.Image getImage(String str) {
        try {
            yq yqVarZzg = this.f5533a.zzg(str);
            if (yqVarZzg != null) {
                return new d10(yqVarZzg);
            }
            return null;
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final MediaContent getMediaContent() {
        tr trVar = this.f5533a;
        try {
            if (trVar.zzf() != null) {
                return new zzfd(trVar.zzf(), trVar);
            }
            return null;
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final CharSequence getText(String str) {
        try {
            return this.f5533a.zzj(str);
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void performClick(String str) {
        try {
            this.f5533a.p0(str);
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void recordImpression() {
        try {
            this.f5533a.zzo();
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
    }
}
