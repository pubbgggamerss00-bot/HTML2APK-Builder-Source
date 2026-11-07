package qd;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;

/* loaded from: classes2.dex */
public final class a extends qa.a {
    public static final Parcelable.Creator<a> CREATOR = new v0();

    /* renamed from: a, reason: collision with root package name */
    public final String f22645a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22646b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22647c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22648d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f22649e;

    /* renamed from: f, reason: collision with root package name */
    public final String f22650f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f22651g;

    /* renamed from: h, reason: collision with root package name */
    public final String f22652h;

    /* renamed from: j, reason: collision with root package name */
    public int f22653j;

    /* renamed from: k, reason: collision with root package name */
    public final String f22654k;

    /* renamed from: l, reason: collision with root package name */
    public final String f22655l;

    public a(String str, String str2, String str3, String str4, boolean z10, String str5, boolean z11, String str6, int i10, String str7, String str8) {
        this.f22645a = str;
        this.f22646b = str2;
        this.f22647c = str3;
        this.f22648d = str4;
        this.f22649e = z10;
        this.f22650f = str5;
        this.f22651g = z11;
        this.f22652h = str6;
        this.f22653j = i10;
        this.f22654k = str7;
        this.f22655l = str8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.m(parcel, 1, this.f22645a, false);
        c1.m(parcel, 2, this.f22646b, false);
        c1.m(parcel, 3, this.f22647c, false);
        c1.m(parcel, 4, this.f22648d, false);
        c1.s(parcel, 5, 4);
        parcel.writeInt(this.f22649e ? 1 : 0);
        c1.m(parcel, 6, this.f22650f, false);
        c1.s(parcel, 7, 4);
        parcel.writeInt(this.f22651g ? 1 : 0);
        c1.m(parcel, 8, this.f22652h, false);
        int i11 = this.f22653j;
        c1.s(parcel, 9, 4);
        parcel.writeInt(i11);
        c1.m(parcel, 10, this.f22654k, false);
        c1.m(parcel, 11, this.f22655l, false);
        c1.r(iQ, parcel);
    }
}
