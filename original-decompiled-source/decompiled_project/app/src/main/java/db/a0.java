package db;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzgx;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class a0 extends qa.a {
    public static final Parcelable.Creator<a0> CREATOR = new c1();

    /* renamed from: a, reason: collision with root package name */
    public final zzgx f7671a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7672b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7673c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7674d;

    public a0(byte[] bArr, String str, String str2, String str3) {
        com.google.android.gms.common.internal.p.f(bArr);
        zzgx zzgxVarZzl = zzgx.zzl(bArr, 0, bArr.length);
        com.google.android.gms.common.internal.p.f(zzgxVarZzl);
        this.f7671a = zzgxVarZzl;
        com.google.android.gms.common.internal.p.f(str);
        this.f7672b = str;
        this.f7673c = str2;
        com.google.android.gms.common.internal.p.f(str3);
        this.f7674d = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return com.google.android.gms.common.internal.o.a(this.f7671a, a0Var.f7671a) && com.google.android.gms.common.internal.o.a(this.f7672b, a0Var.f7672b) && com.google.android.gms.common.internal.o.a(this.f7673c, a0Var.f7673c) && com.google.android.gms.common.internal.o.a(this.f7674d, a0Var.f7674d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7671a, this.f7672b, this.f7673c, this.f7674d});
    }

    public final String toString() {
        StringBuilder sbA = e.e.a("PublicKeyCredentialUserEntity{\n id=", p9.d.c(this.f7671a.zzm()), ", \n name='");
        sbA.append(this.f7672b);
        sbA.append("', \n icon='");
        sbA.append(this.f7673c);
        sbA.append("', \n displayName='");
        return b.o.a(sbA, this.f7674d, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.f(parcel, 2, this.f7671a.zzm(), false);
        androidx.lifecycle.c1.m(parcel, 3, this.f7672b, false);
        androidx.lifecycle.c1.m(parcel, 4, this.f7673c, false);
        androidx.lifecycle.c1.m(parcel, 5, this.f7674d, false);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
