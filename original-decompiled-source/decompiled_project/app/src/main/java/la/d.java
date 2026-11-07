package la;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;

/* loaded from: classes2.dex */
public final class d extends qa.a {
    public static final Parcelable.Creator<d> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f16927a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16928b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16929c;

    public d(String str, boolean z10, byte[] bArr) {
        this.f16927a = bArr;
        this.f16928b = z10;
        this.f16929c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.f(parcel, 1, this.f16927a, false);
        c1.s(parcel, 2, 4);
        parcel.writeInt(this.f16928b ? 1 : 0);
        c1.m(parcel, 3, this.f16929c, false);
        c1.r(iQ, parcel);
    }
}
