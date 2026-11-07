package db;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import db.q;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class i extends j {
    public static final Parcelable.Creator<i> CREATOR = new x1();

    /* renamed from: a, reason: collision with root package name */
    public final q f7730a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7731b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7732c;

    public i(int i10, String str, int i11) {
        try {
            this.f7730a = q.a(i10);
            this.f7731b = str;
            this.f7732c = i11;
        } catch (q.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return com.google.android.gms.common.internal.o.a(this.f7730a, iVar.f7730a) && com.google.android.gms.common.internal.o.a(this.f7731b, iVar.f7731b) && com.google.android.gms.common.internal.o.a(Integer.valueOf(this.f7732c), Integer.valueOf(iVar.f7732c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7730a, this.f7731b, Integer.valueOf(this.f7732c)});
    }

    public final String toString() {
        zzbi zzbiVarZza = zzbj.zza(this);
        zzbiVarZza.zza("errorCode", this.f7730a.f7763a);
        String str = this.f7731b;
        if (str != null) {
            zzbiVarZza.zzb("errorMessage", str);
        }
        return zzbiVarZza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        int i11 = this.f7730a.f7763a;
        androidx.lifecycle.c1.s(parcel, 2, 4);
        parcel.writeInt(i11);
        androidx.lifecycle.c1.m(parcel, 3, this.f7731b, false);
        androidx.lifecycle.c1.s(parcel, 4, 4);
        parcel.writeInt(this.f7732c);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
