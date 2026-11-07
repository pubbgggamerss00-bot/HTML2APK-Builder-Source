package fa;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;

/* loaded from: classes2.dex */
public final class a extends qa.a {
    public static final Parcelable.Creator<a> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    public final int f11110a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11111b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11112c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11113d;

    public a(int i10, boolean z10, long j10, boolean z11) {
        this.f11110a = i10;
        this.f11111b = z10;
        this.f11112c = j10;
        this.f11113d = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.s(parcel, 1, 4);
        parcel.writeInt(this.f11110a);
        c1.s(parcel, 2, 4);
        parcel.writeInt(this.f11111b ? 1 : 0);
        c1.s(parcel, 3, 8);
        parcel.writeLong(this.f11112c);
        c1.s(parcel, 4, 4);
        parcel.writeInt(this.f11113d ? 1 : 0);
        c1.r(iQ, parcel);
    }
}
