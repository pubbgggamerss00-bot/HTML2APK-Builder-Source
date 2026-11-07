package qd;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.lifecycle.c1;

/* loaded from: classes2.dex */
public final class x extends c implements Cloneable {
    public static final Parcelable.Creator<x> CREATOR = new p0();

    /* renamed from: a, reason: collision with root package name */
    public final String f22703a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22704b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22705c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22706d;

    /* renamed from: e, reason: collision with root package name */
    public final String f22707e;

    public x(String str, String str2, String str3, String str4, boolean z10) {
        com.google.android.gms.common.internal.p.a("Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.", ((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))) ? false : true);
        this.f22703a = str;
        this.f22704b = str2;
        this.f22705c = str3;
        this.f22706d = z10;
        this.f22707e = str4;
    }

    public final Object clone() throws CloneNotSupportedException {
        boolean z10 = this.f22706d;
        return new x(this.f22703a, this.f22704b, this.f22705c, this.f22707e, z10);
    }

    @Override // qd.c
    public final String d() {
        return "phone";
    }

    @Override // qd.c
    public final c e() {
        return (x) clone();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.m(parcel, 1, this.f22703a, false);
        c1.m(parcel, 2, this.f22704b, false);
        c1.m(parcel, 4, this.f22705c, false);
        boolean z10 = this.f22706d;
        c1.s(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        c1.m(parcel, 6, this.f22707e, false);
        c1.r(iQ, parcel);
    }
}
