package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d10 extends NativeAd.Image {

    /* renamed from: a, reason: collision with root package name */
    public final yq f3720a;

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f3721b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f3722c;

    /* renamed from: d, reason: collision with root package name */
    public final double f3723d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3724e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3725f;

    public d10(yq yqVar) {
        double dZzb;
        int iZzd;
        k3.a aVarZzf;
        this.f3720a = yqVar;
        Uri uriZze = null;
        try {
            aVarZzf = yqVar.zzf();
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
        Drawable drawable = aVarZzf != null ? (Drawable) k3.b.i1(aVarZzf) : null;
        this.f3721b = drawable;
        try {
            uriZze = this.f3720a.zze();
        } catch (RemoteException e7) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e7);
        }
        this.f3722c = uriZze;
        try {
            dZzb = this.f3720a.zzb();
        } catch (RemoteException e8) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e8);
            dZzb = 1.0d;
        }
        this.f3723d = dZzb;
        int iZzc = -1;
        try {
            iZzd = this.f3720a.zzd();
        } catch (RemoteException e9) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e9);
            iZzd = -1;
        }
        this.f3724e = iZzd;
        try {
            iZzc = this.f3720a.zzc();
        } catch (RemoteException e10) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
        }
        this.f3725f = iZzc;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final Drawable getDrawable() {
        return this.f3721b;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final double getScale() {
        return this.f3723d;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final Uri getUri() {
        return this.f3722c;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final int zza() {
        return this.f3725f;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final int zzb() {
        return this.f3724e;
    }
}
