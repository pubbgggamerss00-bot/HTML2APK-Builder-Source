package ua;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import ua.a;

/* loaded from: classes2.dex */
public final class g extends qa.a {
    public static final Parcelable.Creator<g> CREATOR = new e();

    /* renamed from: a, reason: collision with root package name */
    public final int f29684a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29685b;

    /* renamed from: c, reason: collision with root package name */
    public final a.C0303a f29686c;

    public g(a.C0303a c0303a, String str, int i10) {
        this.f29684a = i10;
        this.f29685b = str;
        this.f29686c = c0303a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.s(parcel, 1, 4);
        parcel.writeInt(this.f29684a);
        c1.m(parcel, 2, this.f29685b, false);
        c1.l(parcel, 3, this.f29686c, i10, false);
        c1.r(iQ, parcel);
    }

    public g(a.C0303a c0303a, String str) {
        this.f29684a = 1;
        this.f29685b = str;
        this.f29686c = c0303a;
    }
}
