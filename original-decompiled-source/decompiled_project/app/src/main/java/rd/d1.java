package rd;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class d1 implements qa.c {
    public static final Parcelable.Creator<d1> CREATOR = new c1();

    /* renamed from: a, reason: collision with root package name */
    public g f23360a;

    /* renamed from: b, reason: collision with root package name */
    public b1 f23361b;

    /* renamed from: c, reason: collision with root package name */
    public qd.w0 f23362c;

    public d1(g gVar) {
        com.google.android.gms.common.internal.p.f(gVar);
        this.f23360a = gVar;
        ArrayList arrayList = gVar.f23369e;
        this.f23361b = null;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (!TextUtils.isEmpty(((d) arrayList.get(i10)).f23357j)) {
                this.f23361b = new b1(((d) arrayList.get(i10)).f23350b, ((d) arrayList.get(i10)).f23357j, gVar.f23374k);
            }
        }
        if (this.f23361b == null) {
            this.f23361b = new b1(gVar.f23374k);
        }
        this.f23362c = gVar.f23375l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.l(parcel, 1, this.f23360a, i10, false);
        androidx.lifecycle.c1.l(parcel, 2, this.f23361b, i10, false);
        androidx.lifecycle.c1.l(parcel, 3, this.f23362c, i10, false);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
