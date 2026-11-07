package ia;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.protobuf.DescriptorProtos;

/* loaded from: classes2.dex */
public final class a extends qa.a {
    public static final Parcelable.Creator<a> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    public final String f14424a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14425b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14426c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f14427d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14428e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f14429f;

    public a(int i10, String str, int i11, long j10, byte[] bArr, Bundle bundle) {
        this.f14428e = i10;
        this.f14424a = str;
        this.f14425b = i11;
        this.f14426c = j10;
        this.f14427d = bArr;
        this.f14429f = bundle;
    }

    public final String toString() {
        return "ProxyRequest[ url: " + this.f14424a + ", method: " + this.f14425b + " ]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.m(parcel, 1, this.f14424a, false);
        c1.s(parcel, 2, 4);
        parcel.writeInt(this.f14425b);
        c1.s(parcel, 3, 8);
        parcel.writeLong(this.f14426c);
        c1.f(parcel, 4, this.f14427d, false);
        c1.e(parcel, 5, this.f14429f, false);
        c1.s(parcel, DescriptorProtos.Edition.EDITION_2023_VALUE, 4);
        parcel.writeInt(this.f14428e);
        c1.r(iQ, parcel);
    }
}
