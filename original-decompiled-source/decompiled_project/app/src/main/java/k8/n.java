package k8;

import androidx.datastore.preferences.protobuf.a1;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f16166a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16167b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16168c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16169d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16170e;

    public n(String str, int i10, int i11, String str2, int i12) {
        this.f16166a = str;
        this.f16167b = i10;
        this.f16168c = i11;
        this.f16169d = str2;
        this.f16170e = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f16166a.equals(nVar.f16166a) && this.f16167b == nVar.f16167b && this.f16168c == nVar.f16168c && this.f16169d.equals(nVar.f16169d) && this.f16170e == nVar.f16170e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16170e) + l0.k.a(a1.a(this.f16168c, a1.a(this.f16167b, this.f16166a.hashCode() * 31, 31), 31), 31, this.f16169d);
    }

    public final String toString() {
        StringBuilder sbA = androidx.datastore.preferences.protobuf.h.a(this.f16167b, "ZoneDef(id=", this.f16166a, ", nameRes=", ", descRes=");
        sbA.append(this.f16168c);
        sbA.append(", icon=");
        sbA.append(this.f16169d);
        sbA.append(", unlockLevel=");
        return x0.a.a(sbA, this.f16170e, ")");
    }
}
