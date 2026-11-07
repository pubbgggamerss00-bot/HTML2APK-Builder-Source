package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.zzm;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zy0 extends pz0 {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f11602a;

    /* renamed from: b, reason: collision with root package name */
    public final zzm f11603b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11604c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11605d;

    public /* synthetic */ zy0(Activity activity, zzm zzmVar, String str, String str2) {
        this.f11602a = activity;
        this.f11603b = zzmVar;
        this.f11604c = str;
        this.f11605d = str2;
    }

    @Override // com.google.android.gms.internal.ads.pz0
    public final Activity a() {
        return this.f11602a;
    }

    @Override // com.google.android.gms.internal.ads.pz0
    public final zzm b() {
        return this.f11603b;
    }

    @Override // com.google.android.gms.internal.ads.pz0
    public final String c() {
        return this.f11604c;
    }

    @Override // com.google.android.gms.internal.ads.pz0
    public final String d() {
        return this.f11605d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pz0)) {
            return false;
        }
        pz0 pz0Var = (pz0) obj;
        if (!this.f11602a.equals(pz0Var.a())) {
            return false;
        }
        zzm zzmVar = this.f11603b;
        if (zzmVar == null) {
            if (pz0Var.b() != null) {
                return false;
            }
        } else if (!zzmVar.equals(pz0Var.b())) {
            return false;
        }
        String str = this.f11604c;
        if (str == null) {
            if (pz0Var.c() != null) {
                return false;
            }
        } else if (!str.equals(pz0Var.c())) {
            return false;
        }
        String str2 = this.f11605d;
        return str2 == null ? pz0Var.d() == null : str2.equals(pz0Var.d());
    }

    public final int hashCode() {
        int iHashCode = this.f11602a.hashCode() ^ 1000003;
        zzm zzmVar = this.f11603b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (zzmVar == null ? 0 : zzmVar.hashCode())) * 1000003;
        String str = this.f11604c;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f11605d;
        return iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = androidx.camera.camera2.internal.i0.a("OfflineUtilsParams{activity=", this.f11602a.toString(), ", adOverlay=", String.valueOf(this.f11603b), ", gwsQueryId=");
        sbA.append(this.f11604c);
        sbA.append(", uri=");
        return androidx.activity.m.e(sbA, this.f11605d, "}");
    }
}
