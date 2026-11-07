package com.google.android.gms.ads.nativead;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.internal.ads.jr;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import k3.a;
import k3.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class NativeAdViewHolder {
    public static final WeakHashMap zza = new WeakHashMap();
    private jr zzb;
    private WeakReference zzc;

    public NativeAdViewHolder(View view, Map<String, View> map, Map<String, View> map2) {
        l.g("ContainerView must not be null", view);
        if (view instanceof NativeAdView) {
            zzo.zzg("The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.");
            return;
        }
        WeakHashMap weakHashMap = zza;
        if (weakHashMap.get(view) != null) {
            zzo.zzg("The provided containerView is already in use with another NativeAdViewHolder.");
            return;
        }
        weakHashMap.put(view, this);
        this.zzc = new WeakReference(view);
        this.zzb = zzbc.zza().zzk(view, zza(map), zza(map2));
    }

    private static final HashMap zza(Map map) {
        return map == null ? new HashMap() : new HashMap(map);
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.zzb.zzb(new b(view));
        } catch (RemoteException e6) {
            zzo.zzh("Unable to call setClickConfirmingView on delegate", e6);
        }
    }

    public void setNativeAd(NativeAd nativeAd) {
        a aVar = (a) nativeAd.zza();
        WeakReference weakReference = this.zzc;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null) {
            zzo.zzj("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        WeakHashMap weakHashMap = zza;
        if (!weakHashMap.containsKey(view)) {
            weakHashMap.put(view, this);
        }
        jr jrVar = this.zzb;
        if (jrVar != null) {
            try {
                jrVar.zzc(aVar);
            } catch (RemoteException e6) {
                zzo.zzh("Unable to call setNativeAd on delegate", e6);
            }
        }
    }

    public void unregisterNativeAd() {
        jr jrVar = this.zzb;
        if (jrVar != null) {
            try {
                jrVar.zzd();
            } catch (RemoteException e6) {
                zzo.zzh("Unable to call unregisterNativeAd on delegate", e6);
            }
        }
        WeakReference weakReference = this.zzc;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            zza.remove(view);
        }
    }
}
