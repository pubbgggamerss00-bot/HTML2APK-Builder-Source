package db;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class l extends n {
    public static final Parcelable.Creator<l> CREATOR = new z1();

    /* renamed from: a, reason: collision with root package name */
    public final u f7739a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f7740b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f7741c;

    public l(u uVar, Uri uri, byte[] bArr) {
        com.google.android.gms.common.internal.p.f(uVar);
        this.f7739a = uVar;
        com.google.android.gms.common.internal.p.f(uri);
        com.google.android.gms.common.internal.p.a("origin scheme must be non-empty", uri.getScheme() != null);
        com.google.android.gms.common.internal.p.a("origin authority must be non-empty", uri.getAuthority() != null);
        this.f7740b = uri;
        com.google.android.gms.common.internal.p.a("clientDataHash must be 32 bytes long", bArr == null || bArr.length == 32);
        this.f7741c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return com.google.android.gms.common.internal.o.a(this.f7739a, lVar.f7739a) && com.google.android.gms.common.internal.o.a(this.f7740b, lVar.f7740b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7739a, this.f7740b});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f7739a);
        String strValueOf2 = String.valueOf(this.f7740b);
        return b.o.a(androidx.room.y0.a("BrowserPublicKeyCredentialCreationOptions{\n publicKeyCredentialCreationOptions=", strValueOf, ", \n origin=", strValueOf2, ", \n clientDataHash="), p9.d.c(this.f7741c), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.l(parcel, 2, this.f7739a, i10, false);
        androidx.lifecycle.c1.l(parcel, 3, this.f7740b, i10, false);
        androidx.lifecycle.c1.f(parcel, 4, this.f7741c, false);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
