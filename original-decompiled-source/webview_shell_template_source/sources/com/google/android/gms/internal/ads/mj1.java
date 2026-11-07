package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class mj1 extends pj1 {

    /* renamed from: c, reason: collision with root package name */
    public final int f7168c;

    /* renamed from: b, reason: collision with root package name */
    public final String f7167b = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* renamed from: d, reason: collision with root package name */
    public final int f7169d = 1;

    public mj1(int i6) {
        this.f7168c = i6;
    }

    @Override // com.google.android.gms.internal.ads.pj1
    public final String a() {
        return this.f7167b;
    }

    @Override // com.google.android.gms.internal.ads.pj1
    public final int b() {
        return this.f7168c;
    }

    @Override // com.google.android.gms.internal.ads.pj1
    public final int c() {
        return this.f7169d;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof pj1)) {
                return false;
            }
            pj1 pj1Var = (pj1) obj;
            if (!this.f7167b.equals(pj1Var.a())) {
                return false;
            }
            int iB = pj1Var.b();
            int i6 = this.f7168c;
            if (i6 == 0) {
                throw null;
            }
            if (i6 != iB) {
                return false;
            }
            int iC = pj1Var.c();
            if (this.f7169d == 0) {
                throw null;
            }
            if (iC != 1) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.f7167b.hashCode() ^ 1000003;
        int i6 = this.f7168c;
        if (i6 == 0) {
            throw null;
        }
        int i7 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i6;
        if (this.f7169d != 0) {
            return (i7 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i6 = this.f7168c;
        return androidx.activity.m.e(androidx.camera.camera2.internal.i0.a("FileComplianceOptions{fileOwner=", this.f7167b, ", hasDifferentDmaOwner=false, fileChecks=", i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS", ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose="), this.f7169d == 1 ? "READ_AND_WRITE" : "null", "}");
    }
}
