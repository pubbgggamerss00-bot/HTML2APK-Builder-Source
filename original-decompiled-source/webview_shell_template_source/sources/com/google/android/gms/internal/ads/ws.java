package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdi;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ws extends UnifiedNativeAd {

    /* renamed from: a, reason: collision with root package name */
    public final vs f10258a;

    /* renamed from: c, reason: collision with root package name */
    public final zq f10260c;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f10259b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final VideoController f10261d = new VideoController();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f10262e = new ArrayList();

    public ws(vs vsVar) {
        yq xqVar;
        this.f10258a = vsVar;
        zq zqVar = null;
        try {
            List listZzu = vsVar.zzu();
            if (listZzu != null) {
                for (Object obj : listZzu) {
                    if (obj instanceof IBinder) {
                        IBinder iBinder = (IBinder) obj;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        xqVar = iInterfaceQueryLocalInterface instanceof yq ? (yq) iInterfaceQueryLocalInterface : new xq(iBinder);
                    } else {
                        xqVar = null;
                    }
                    if (xqVar != null) {
                        this.f10259b.add(new zq(xqVar));
                    }
                }
            }
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
        try {
            List listZzv = this.f10258a.zzv();
            if (listZzv != null) {
                for (Object obj2 : listZzv) {
                    zzdh zzdhVarZzb = obj2 instanceof IBinder ? zzdg.zzb((IBinder) obj2) : null;
                    if (zzdhVarZzb != null) {
                        this.f10262e.add(new zzdi(zzdhVarZzb));
                    }
                }
            }
        } catch (RemoteException e7) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e7);
        }
        try {
            yq yqVarZzk = this.f10258a.zzk();
            if (yqVarZzk != null) {
                zqVar = new zq(yqVarZzk);
            }
        } catch (RemoteException e8) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e8);
        }
        this.f10260c = zqVar;
        try {
            if (this.f10258a.zzi() != null) {
                new tq(this.f10258a.zzi());
            }
        } catch (RemoteException e9) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e9);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.f10258a.c2(bundle);
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.f10258a.W0(bundle);
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.f10258a.g0(bundle);
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final VideoController zza() {
        VideoController videoController = this.f10261d;
        vs vsVar = this.f10258a;
        try {
            if (vsVar.zzh() != null) {
                videoController.zzb(vsVar.zzh());
            }
        } catch (RemoteException e6) {
            zzo.zzh("Exception occurred while getting video controller", e6);
        }
        return videoController;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.Image zzb() {
        return this.f10260c;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Double zzc() {
        try {
            double dZze = this.f10258a.zze();
            if (dZze == -1.0d) {
                return null;
            }
            return Double.valueOf(dZze);
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Object zzd() {
        try {
            k3.a aVarZzl = this.f10258a.zzl();
            if (aVarZzl != null) {
                return k3.b.i1(aVarZzl);
            }
            return null;
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zze() {
        try {
            return this.f10258a.zzn();
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzf() {
        try {
            return this.f10258a.zzo();
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzg() {
        try {
            return this.f10258a.zzp();
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzh() {
        try {
            return this.f10258a.zzq();
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzi() {
        try {
            return this.f10258a.zzs();
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzj() {
        try {
            return this.f10258a.zzt();
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List zzk() {
        return this.f10259b;
    }
}
