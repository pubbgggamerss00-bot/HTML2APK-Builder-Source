package db;

import android.os.Parcel;
import android.os.Parcelable;
import db.b;
import db.c0;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class k extends qa.a {
    public static final Parcelable.Creator<k> CREATOR = new y1();

    /* renamed from: a, reason: collision with root package name */
    public final b f7733a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f7734b;

    /* renamed from: c, reason: collision with root package name */
    public final f0 f7735c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f7736d;

    public k(String str, Boolean bool, String str2, String str3) {
        b bVarA;
        c0 c0VarA = null;
        if (str == null) {
            bVarA = null;
        } else {
            try {
                bVarA = b.a(str);
            } catch (b.a | c0.a | l1 e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        this.f7733a = bVarA;
        this.f7734b = bool;
        this.f7735c = str2 == null ? null : f0.a(str2);
        if (str3 != null) {
            c0VarA = c0.a(str3);
        }
        this.f7736d = c0VarA;
    }

    public final c0 d() {
        c0 c0Var = this.f7736d;
        if (c0Var != null) {
            return c0Var;
        }
        Boolean bool = this.f7734b;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return c0.RESIDENT_KEY_REQUIRED;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return com.google.android.gms.common.internal.o.a(this.f7733a, kVar.f7733a) && com.google.android.gms.common.internal.o.a(this.f7734b, kVar.f7734b) && com.google.android.gms.common.internal.o.a(this.f7735c, kVar.f7735c) && com.google.android.gms.common.internal.o.a(d(), kVar.d());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7733a, this.f7734b, this.f7735c, d()});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f7733a);
        String strValueOf2 = String.valueOf(this.f7735c);
        String strValueOf3 = String.valueOf(this.f7736d);
        StringBuilder sbA = e.e.a("AuthenticatorSelectionCriteria{\n attachment=", strValueOf, ", \n requireResidentKey=");
        sbA.append(this.f7734b);
        sbA.append(", \n requireUserVerification=");
        sbA.append(strValueOf2);
        sbA.append(", \n residentKeyRequirement=");
        return b.o.a(sbA, strValueOf3, "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        b bVar = this.f7733a;
        androidx.lifecycle.c1.m(parcel, 2, bVar == null ? null : bVar.f7676a, false);
        Boolean bool = this.f7734b;
        if (bool != null) {
            androidx.lifecycle.c1.s(parcel, 3, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        f0 f0Var = this.f7735c;
        androidx.lifecycle.c1.m(parcel, 4, f0Var == null ? null : f0Var.f7716a, false);
        c0 c0VarD = d();
        androidx.lifecycle.c1.m(parcel, 5, c0VarD != null ? c0VarD.f7685a : null, false);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
