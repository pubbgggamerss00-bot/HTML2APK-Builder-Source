package i0;

import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: classes.dex */
public final class h2 {

    /* renamed from: c, reason: collision with root package name */
    public static final h2 f13315c = new h2(0, 0, CertificateBody.profileType);

    /* renamed from: a, reason: collision with root package name */
    public final int f13316a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13317b;

    public h2(int i10, int i11, int i12) {
        i10 = (i12 & 4) != 0 ? 0 : i10;
        i11 = (i12 & 8) != 0 ? -1 : i11;
        this.f13316a = i10;
        this.f13317b = i11;
    }

    public final y2.o a(boolean z10) {
        y2.n nVar;
        int i10 = this.f13316a;
        y2.r rVar = new y2.r(i10);
        if (i10 == 0) {
            rVar = null;
            nVar = null;
        } else {
            nVar = null;
        }
        int i11 = rVar != null ? rVar.f33766a : 1;
        int i12 = this.f13317b;
        y2.n nVar2 = new y2.n(i12);
        if (i12 == -1) {
            nVar2 = nVar;
        }
        return new y2.o(z10, 0, true, i11, nVar2 != null ? nVar2.f33749a : 1, a3.c.f24c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return this.f13316a == h2Var.f13316a && this.f13317b == h2Var.f13317b;
    }

    public final int hashCode() {
        return androidx.datastore.preferences.protobuf.a1.a(this.f13317b, androidx.datastore.preferences.protobuf.a1.a(this.f13316a, Integer.hashCode(-1) * 961, 31), 29791);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) "Unspecified") + ", autoCorrectEnabled=null, keyboardType=" + ((Object) y2.r.a(this.f13316a)) + ", imeAction=" + ((Object) y2.n.a(this.f13317b)) + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }
}
