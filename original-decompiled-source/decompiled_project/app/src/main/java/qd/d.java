package qd;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.lifecycle.c1;

/* loaded from: classes2.dex */
public final class d extends c {
    public static final Parcelable.Creator<d> CREATOR = new z0();

    /* renamed from: a, reason: collision with root package name */
    public final String f22665a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22666b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22667c;

    /* renamed from: d, reason: collision with root package name */
    public String f22668d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22669e;

    public d(String str, String str2, String str3, String str4, boolean z10) {
        com.google.android.gms.common.internal.p.d(str);
        this.f22665a = str;
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.f22666b = str2;
        this.f22667c = str3;
        this.f22668d = str4;
        this.f22669e = z10;
    }

    @Override // qd.c
    public final String d() {
        return "password";
    }

    @Override // qd.c
    public final c e() {
        return new d(this.f22665a, this.f22666b, this.f22667c, this.f22668d, this.f22669e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.m(parcel, 1, this.f22665a, false);
        c1.m(parcel, 2, this.f22666b, false);
        c1.m(parcel, 3, this.f22667c, false);
        c1.m(parcel, 4, this.f22668d, false);
        boolean z10 = this.f22669e;
        c1.s(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        c1.r(iQ, parcel);
    }
}
