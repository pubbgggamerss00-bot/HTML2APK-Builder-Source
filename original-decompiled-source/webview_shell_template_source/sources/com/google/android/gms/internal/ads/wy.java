package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class wy implements MediationAdRequest {

    /* renamed from: a, reason: collision with root package name */
    public final Date f10306a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10307b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f10308c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10309d;

    /* renamed from: e, reason: collision with root package name */
    public final Location f10310e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10311f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f10312g;

    public wy(Date date, int i6, HashSet hashSet, Location location, boolean z6, int i7, boolean z7) {
        this.f10306a = date;
        this.f10307b = i6;
        this.f10308c = hashSet;
        this.f10310e = location;
        this.f10309d = z6;
        this.f10311f = i7;
        this.f10312g = z7;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final Date getBirthday() {
        return this.f10306a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final int getGender() {
        return this.f10307b;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Set<String> getKeywords() {
        return this.f10308c;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Location getLocation() {
        return this.f10310e;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.f10312g;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.f10309d;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.f10311f;
    }
}
