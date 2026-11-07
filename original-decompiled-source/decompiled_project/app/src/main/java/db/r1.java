package db;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzgx;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class r1 extends qa.a {
    public static final Parcelable.Creator<r1> CREATOR = new s1();

    /* renamed from: a, reason: collision with root package name */
    public final zzgx f7769a;

    /* renamed from: b, reason: collision with root package name */
    public final zzgx f7770b;

    public r1(zzgx zzgxVar, zzgx zzgxVar2) {
        this.f7769a = zzgxVar;
        this.f7770b = zzgxVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return com.google.android.gms.common.internal.o.a(this.f7769a, r1Var.f7769a) && com.google.android.gms.common.internal.o.a(this.f7770b, r1Var.f7770b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7769a, this.f7770b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        zzgx zzgxVar = this.f7769a;
        androidx.lifecycle.c1.f(parcel, 1, zzgxVar == null ? null : zzgxVar.zzm(), false);
        zzgx zzgxVar2 = this.f7770b;
        androidx.lifecycle.c1.f(parcel, 2, zzgxVar2 != null ? zzgxVar2.zzm() : null, false);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
