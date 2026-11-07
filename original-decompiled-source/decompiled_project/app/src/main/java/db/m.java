package db;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class m extends n {
    public static final Parcelable.Creator<m> CREATOR = new a2();

    /* renamed from: a, reason: collision with root package name */
    public final x f7742a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f7743b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f7744c;

    public m(x xVar, Uri uri, byte[] bArr) {
        com.google.android.gms.common.internal.p.f(xVar);
        this.f7742a = xVar;
        com.google.android.gms.common.internal.p.f(uri);
        com.google.android.gms.common.internal.p.a("origin scheme must be non-empty", uri.getScheme() != null);
        com.google.android.gms.common.internal.p.a("origin authority must be non-empty", uri.getAuthority() != null);
        this.f7743b = uri;
        com.google.android.gms.common.internal.p.a("clientDataHash must be 32 bytes long", bArr == null || bArr.length == 32);
        this.f7744c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return com.google.android.gms.common.internal.o.a(this.f7742a, mVar.f7742a) && com.google.android.gms.common.internal.o.a(this.f7743b, mVar.f7743b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7742a, this.f7743b});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f7742a);
        String strValueOf2 = String.valueOf(this.f7743b);
        return b.o.a(androidx.room.y0.a("BrowserPublicKeyCredentialRequestOptions{\n publicKeyCredentialRequestOptions=", strValueOf, ", \n origin=", strValueOf2, ", \n clientDataHash="), p9.d.c(this.f7744c), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.l(parcel, 2, this.f7742a, i10, false);
        androidx.lifecycle.c1.l(parcel, 3, this.f7743b, i10, false);
        androidx.lifecycle.c1.f(parcel, 4, this.f7744c, false);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
