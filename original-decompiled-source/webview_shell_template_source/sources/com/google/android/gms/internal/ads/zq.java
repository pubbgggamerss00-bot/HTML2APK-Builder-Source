package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zq extends NativeAd.Image {

    /* renamed from: a, reason: collision with root package name */
    public final yq f11559a;

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f11560b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f11561c;

    /* renamed from: d, reason: collision with root package name */
    public final double f11562d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11563e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11564f;

    public zq(yq yqVar) {
        double dZzb;
        int iZzd;
        k3.a aVarZzf;
        this.f11559a = yqVar;
        Uri uriZze = null;
        try {
            aVarZzf = yqVar.zzf();
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
        Drawable drawable = aVarZzf != null ? (Drawable) k3.b.i1(aVarZzf) : null;
        this.f11560b = drawable;
        try {
            uriZze = this.f11559a.zze();
        } catch (RemoteException e7) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e7);
        }
        this.f11561c = uriZze;
        try {
            dZzb = this.f11559a.zzb();
        } catch (RemoteException e8) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e8);
            dZzb = 1.0d;
        }
        this.f11562d = dZzb;
        int iZzc = -1;
        try {
            iZzd = this.f11559a.zzd();
        } catch (RemoteException e9) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e9);
            iZzd = -1;
        }
        this.f11563e = iZzd;
        try {
            iZzc = this.f11559a.zzc();
        } catch (RemoteException e10) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
        }
        this.f11564f = iZzc;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Drawable getDrawable() {
        return this.f11560b;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final double getScale() {
        return this.f11562d;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Uri getUri() {
        return this.f11561c;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int zza() {
        return this.f11564f;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int zzb() {
        return this.f11563e;
    }
}
