package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class nv1 extends tt1 {

    /* renamed from: a, reason: collision with root package name */
    public final dt1 f7523a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7524b;

    /* renamed from: c, reason: collision with root package name */
    public final eu1 f7525c;

    /* renamed from: d, reason: collision with root package name */
    public final tt1 f7526d;

    public /* synthetic */ nv1(dt1 dt1Var, String str, eu1 eu1Var, tt1 tt1Var) {
        this.f7523a = dt1Var;
        this.f7524b = str;
        this.f7525c = eu1Var;
        this.f7526d = tt1Var;
    }

    @Override // com.google.android.gms.internal.ads.lt1
    public final boolean a() {
        return this.f7523a != dt1.f4024y;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nv1)) {
            return false;
        }
        nv1 nv1Var = (nv1) obj;
        return nv1Var.f7525c.equals(this.f7525c) && nv1Var.f7526d.equals(this.f7526d) && nv1Var.f7524b.equals(this.f7524b) && nv1Var.f7523a.equals(this.f7523a);
    }

    public final int hashCode() {
        return Objects.hash(nv1.class, this.f7524b, this.f7525c, this.f7526d, this.f7523a);
    }

    public final String toString() {
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.f7524b + ", dekParsingStrategy: " + String.valueOf(this.f7525c) + ", dekParametersForNewKeys: " + String.valueOf(this.f7526d) + ", variant: " + String.valueOf(this.f7523a) + ")";
    }
}
