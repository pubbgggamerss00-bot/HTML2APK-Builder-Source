package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.internal.client.zzex;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class kz implements NativeMediationAdRequest {

    /* renamed from: a, reason: collision with root package name */
    public final Date f6525a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6526b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f6527c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6528d;

    /* renamed from: e, reason: collision with root package name */
    public final Location f6529e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6530f;

    /* renamed from: g, reason: collision with root package name */
    public final oq f6531g;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f6532i;
    public final ArrayList h = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f6533j = new HashMap();

    public kz(Date date, int i6, HashSet hashSet, Location location, boolean z6, int i7, oq oqVar, List list, boolean z7) {
        this.f6525a = date;
        this.f6526b = i6;
        this.f6527c = hashSet;
        this.f6529e = location;
        this.f6528d = z6;
        this.f6530f = i7;
        this.f6531g = oqVar;
        this.f6532i = z7;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str.startsWith("custom:")) {
                    String[] strArrSplit = str.split(":", 3);
                    if (strArrSplit.length == 3) {
                        if ("true".equals(strArrSplit[2])) {
                            this.f6533j.put(strArrSplit[1], Boolean.TRUE);
                        } else if ("false".equals(strArrSplit[2])) {
                            this.f6533j.put(strArrSplit[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.h.add(str);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final float getAdVolume() {
        return zzex.zzf().zza();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final Date getBirthday() {
        return this.f6525a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final int getGender() {
        return this.f6526b;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Set<String> getKeywords() {
        return this.f6527c;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Location getLocation() {
        return this.f6529e;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final NativeAdOptions getNativeAdOptions() {
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        oq oqVar = this.f6531g;
        if (oqVar == null) {
            return builder.build();
        }
        int i6 = oqVar.s;
        if (i6 == 2) {
            builder.setAdChoicesPlacement(oqVar.f7841w);
        } else {
            if (i6 != 3) {
                if (i6 == 4) {
                    builder.setRequestCustomMuteThisAd(oqVar.f7843y);
                    builder.setMediaAspectRatio(oqVar.f7844z);
                }
            }
            zzga zzgaVar = oqVar.f7842x;
            if (zzgaVar != null) {
                builder.setVideoOptions(new VideoOptions(zzgaVar));
            }
            builder.setAdChoicesPlacement(oqVar.f7841w);
        }
        builder.setReturnUrlsForImageAssets(oqVar.f7838t);
        builder.setImageOrientation(oqVar.f7839u);
        builder.setRequestMultipleImages(oqVar.f7840v);
        return builder.build();
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions() {
        return oq.l(this.f6531g);
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isAdMuted() {
        return zzex.zzf().zzy();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.f6532i;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.f6528d;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isUnifiedNativeAdRequested() {
        return this.h.contains("6");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.f6530f;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final Map zza() {
        return this.f6533j;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean zzb() {
        return this.h.contains("3");
    }
}
