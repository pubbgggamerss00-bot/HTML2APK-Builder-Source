package qd;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.android.gms.internal.p002firebaseauthapi.zzae;
import com.google.android.gms.internal.p002firebaseauthapi.zzait;

/* loaded from: classes2.dex */
public final class w0 extends w {
    public static final Parcelable.Creator<w0> CREATOR = new y0();

    /* renamed from: a, reason: collision with root package name */
    public final String f22696a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22697b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22698c;

    /* renamed from: d, reason: collision with root package name */
    public final zzait f22699d;

    /* renamed from: e, reason: collision with root package name */
    public final String f22700e;

    /* renamed from: f, reason: collision with root package name */
    public final String f22701f;

    /* renamed from: g, reason: collision with root package name */
    public final String f22702g;

    public w0(String str, String str2, String str3, zzait zzaitVar, String str4, String str5, String str6) {
        this.f22696a = zzae.zzb(str);
        this.f22697b = str2;
        this.f22698c = str3;
        this.f22699d = zzaitVar;
        this.f22700e = str4;
        this.f22701f = str5;
        this.f22702g = str6;
    }

    public static w0 f(zzait zzaitVar) {
        com.google.android.gms.common.internal.p.g(zzaitVar, "Must specify a non-null webSignInCredential");
        return new w0(null, null, null, zzaitVar, null, null, null);
    }

    @Override // qd.c
    public final String d() {
        return this.f22696a;
    }

    @Override // qd.c
    public final c e() {
        return new w0(this.f22696a, this.f22697b, this.f22698c, this.f22699d, this.f22700e, this.f22701f, this.f22702g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.m(parcel, 1, this.f22696a, false);
        c1.m(parcel, 2, this.f22697b, false);
        c1.m(parcel, 3, this.f22698c, false);
        c1.l(parcel, 4, this.f22699d, i10, false);
        c1.m(parcel, 5, this.f22700e, false);
        c1.m(parcel, 6, this.f22701f, false);
        c1.m(parcel, 7, this.f22702g, false);
        c1.r(iQ, parcel);
    }
}
