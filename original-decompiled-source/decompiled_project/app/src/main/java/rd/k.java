package rd;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class k extends db.j {
    public static final Parcelable.Creator<k> CREATOR = new m();

    /* renamed from: a, reason: collision with root package name */
    public final List<qd.b0> f23387a;

    /* renamed from: b, reason: collision with root package name */
    public final l f23388b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23389c;

    /* renamed from: d, reason: collision with root package name */
    public final qd.w0 f23390d;

    /* renamed from: e, reason: collision with root package name */
    public final g f23391e;

    /* renamed from: f, reason: collision with root package name */
    public final List<qd.e0> f23392f;

    public k(ArrayList arrayList, l lVar, String str, qd.w0 w0Var, g gVar, ArrayList arrayList2) {
        com.google.android.gms.common.internal.p.f(arrayList);
        this.f23387a = arrayList;
        com.google.android.gms.common.internal.p.f(lVar);
        this.f23388b = lVar;
        com.google.android.gms.common.internal.p.d(str);
        this.f23389c = str;
        this.f23390d = w0Var;
        this.f23391e = gVar;
        com.google.android.gms.common.internal.p.f(arrayList2);
        this.f23392f = arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.p(parcel, 1, this.f23387a, false);
        androidx.lifecycle.c1.l(parcel, 2, this.f23388b, i10, false);
        androidx.lifecycle.c1.m(parcel, 3, this.f23389c, false);
        androidx.lifecycle.c1.l(parcel, 4, this.f23390d, i10, false);
        androidx.lifecycle.c1.l(parcel, 5, this.f23391e, i10, false);
        androidx.lifecycle.c1.p(parcel, 6, this.f23392f, false);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
