package db;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzgx;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class c2 extends qa.a {
    public static final Parcelable.Creator<c2> CREATOR = new d2();

    /* renamed from: a, reason: collision with root package name */
    public final long f7686a;

    /* renamed from: b, reason: collision with root package name */
    public final zzgx f7687b;

    /* renamed from: c, reason: collision with root package name */
    public final zzgx f7688c;

    /* renamed from: d, reason: collision with root package name */
    public final zzgx f7689d;

    public c2(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        com.google.android.gms.common.internal.p.f(bArr);
        zzgx zzgxVarZzl = zzgx.zzl(bArr, 0, bArr.length);
        com.google.android.gms.common.internal.p.f(bArr2);
        zzgx zzgxVarZzl2 = zzgx.zzl(bArr2, 0, bArr2.length);
        com.google.android.gms.common.internal.p.f(bArr3);
        zzgx zzgxVarZzl3 = zzgx.zzl(bArr3, 0, bArr3.length);
        this.f7686a = j10;
        com.google.android.gms.common.internal.p.f(zzgxVarZzl);
        this.f7687b = zzgxVarZzl;
        com.google.android.gms.common.internal.p.f(zzgxVarZzl2);
        this.f7688c = zzgxVarZzl2;
        com.google.android.gms.common.internal.p.f(zzgxVarZzl3);
        this.f7689d = zzgxVarZzl3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        return this.f7686a == c2Var.f7686a && com.google.android.gms.common.internal.o.a(this.f7687b, c2Var.f7687b) && com.google.android.gms.common.internal.o.a(this.f7688c, c2Var.f7688c) && com.google.android.gms.common.internal.o.a(this.f7689d, c2Var.f7689d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f7686a), this.f7687b, this.f7688c, this.f7689d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.s(parcel, 1, 8);
        parcel.writeLong(this.f7686a);
        androidx.lifecycle.c1.f(parcel, 2, this.f7687b.zzm(), false);
        androidx.lifecycle.c1.f(parcel, 3, this.f7688c.zzm(), false);
        androidx.lifecycle.c1.f(parcel, 4, this.f7689d.zzm(), false);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
