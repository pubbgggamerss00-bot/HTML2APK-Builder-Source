package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class mk1 extends al1 {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f7180a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7181b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7182c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7183d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7184e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7185f;

    public mk1(IBinder iBinder, String str, int i6, float f6, int i7, String str2) {
        this.f7180a = iBinder;
        this.f7181b = str;
        this.f7182c = i6;
        this.f7183d = f6;
        this.f7184e = i7;
        this.f7185f = str2;
    }

    @Override // com.google.android.gms.internal.ads.al1
    public final float a() {
        return this.f7183d;
    }

    @Override // com.google.android.gms.internal.ads.al1
    public final int b() {
        return this.f7182c;
    }

    @Override // com.google.android.gms.internal.ads.al1
    public final int c() {
        return this.f7184e;
    }

    @Override // com.google.android.gms.internal.ads.al1
    public final IBinder d() {
        return this.f7180a;
    }

    @Override // com.google.android.gms.internal.ads.al1
    public final String e() {
        return this.f7185f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof al1)) {
            return false;
        }
        al1 al1Var = (al1) obj;
        if (!this.f7180a.equals(al1Var.d())) {
            return false;
        }
        String str = this.f7181b;
        if (str == null) {
            if (al1Var.f() != null) {
                return false;
            }
        } else if (!str.equals(al1Var.f())) {
            return false;
        }
        if (this.f7182c != al1Var.b() || Float.floatToIntBits(this.f7183d) != Float.floatToIntBits(al1Var.a()) || this.f7184e != al1Var.c()) {
            return false;
        }
        String str2 = this.f7185f;
        return str2 == null ? al1Var.e() == null : str2.equals(al1Var.e());
    }

    @Override // com.google.android.gms.internal.ads.al1
    public final String f() {
        return this.f7181b;
    }

    public final int hashCode() {
        int iHashCode = this.f7180a.hashCode() ^ 1000003;
        String str = this.f7181b;
        int iHashCode2 = (((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f7182c) * 1000003) ^ Float.floatToIntBits(this.f7183d);
        String str2 = this.f7185f;
        return ((((iHashCode2 * 1525764945) ^ this.f7184e) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        String string = this.f7180a.toString();
        StringBuilder sb = new StringBuilder("OverlayDisplayShowRequest{windowToken=");
        sb.append(string);
        sb.append(", appId=");
        sb.append(this.f7181b);
        sb.append(", layoutGravity=");
        sb.append(this.f7182c);
        sb.append(", layoutVerticalMargin=");
        sb.append(this.f7183d);
        sb.append(", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=");
        sb.append(this.f7184e);
        sb.append(", deeplinkUrl=null, adFieldEnifd=");
        return androidx.activity.m.e(sb, this.f7185f, ", thirdPartyAuthCallerId=null}");
    }
}
