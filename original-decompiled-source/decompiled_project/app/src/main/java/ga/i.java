package ga;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import java.util.Arrays;

@Deprecated
/* loaded from: classes2.dex */
public final class i extends qa.a {
    public static final Parcelable.Creator<i> CREATOR = new c0();

    /* renamed from: a, reason: collision with root package name */
    public final m f11890a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11891b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11892c;

    public i(m mVar, String str, int i10) {
        com.google.android.gms.common.internal.p.f(mVar);
        this.f11890a = mVar;
        this.f11891b = str;
        this.f11892c = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return com.google.android.gms.common.internal.o.a(this.f11890a, iVar.f11890a) && com.google.android.gms.common.internal.o.a(this.f11891b, iVar.f11891b) && this.f11892c == iVar.f11892c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11890a, this.f11891b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.l(parcel, 1, this.f11890a, i10, false);
        c1.m(parcel, 2, this.f11891b, false);
        c1.s(parcel, 3, 4);
        parcel.writeInt(this.f11892c);
        c1.r(iQ, parcel);
    }
}
