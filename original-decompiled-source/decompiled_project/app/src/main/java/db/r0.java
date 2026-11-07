package db;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzhp;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class r0 extends qa.a {
    public static final Parcelable.Creator<r0> CREATOR = new s0();

    /* renamed from: a, reason: collision with root package name */
    public final zzgx f7765a;

    /* renamed from: b, reason: collision with root package name */
    public final zzgx f7766b;

    /* renamed from: c, reason: collision with root package name */
    public final zzgx f7767c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7768d;

    static {
        zzhp.zzg(1L);
        zzhp.zzg(2L);
        zzhp.zzg(3L);
        zzhp.zzg(4L);
    }

    public r0(zzgx zzgxVar, zzgx zzgxVar2, zzgx zzgxVar3, int i10) {
        this.f7765a = zzgxVar;
        this.f7766b = zzgxVar2;
        this.f7767c = zzgxVar3;
        this.f7768d = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return com.google.android.gms.common.internal.o.a(this.f7765a, r0Var.f7765a) && com.google.android.gms.common.internal.o.a(this.f7766b, r0Var.f7766b) && com.google.android.gms.common.internal.o.a(this.f7767c, r0Var.f7767c) && this.f7768d == r0Var.f7768d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7765a, this.f7766b, this.f7767c, Integer.valueOf(this.f7768d)});
    }

    public final String toString() {
        zzgx zzgxVar = this.f7765a;
        String strC = p9.d.c(zzgxVar == null ? null : zzgxVar.zzm());
        zzgx zzgxVar2 = this.f7766b;
        String strC2 = p9.d.c(zzgxVar2 == null ? null : zzgxVar2.zzm());
        zzgx zzgxVar3 = this.f7767c;
        String strC3 = p9.d.c(zzgxVar3 != null ? zzgxVar3.zzm() : null);
        StringBuilder sbA = androidx.room.y0.a("HmacSecretExtension{coseKeyAgreement=", strC, ", saltEnc=", strC2, ", saltAuth=");
        sbA.append(strC3);
        sbA.append(", getPinUvAuthProtocol=");
        return x0.a.a(sbA, this.f7768d, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        zzgx zzgxVar = this.f7765a;
        androidx.lifecycle.c1.f(parcel, 1, zzgxVar == null ? null : zzgxVar.zzm(), false);
        zzgx zzgxVar2 = this.f7766b;
        androidx.lifecycle.c1.f(parcel, 2, zzgxVar2 == null ? null : zzgxVar2.zzm(), false);
        zzgx zzgxVar3 = this.f7767c;
        androidx.lifecycle.c1.f(parcel, 3, zzgxVar3 != null ? zzgxVar3.zzm() : null, false);
        androidx.lifecycle.c1.s(parcel, 4, 4);
        parcel.writeInt(this.f7768d);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
