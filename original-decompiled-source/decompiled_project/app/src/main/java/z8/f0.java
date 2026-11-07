package z8;

import androidx.datastore.preferences.protobuf.a1;
import androidx.room.y0;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f34807a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34808b;

    /* renamed from: c, reason: collision with root package name */
    public final w1.d f34809c;

    /* renamed from: d, reason: collision with root package name */
    public final int f34810d;

    /* renamed from: e, reason: collision with root package name */
    public final int f34811e;

    public f0(String str, String str2, w1.d dVar, int i10, int i11) {
        this.f34807a = str;
        this.f34808b = str2;
        this.f34809c = dVar;
        this.f34810d = i10;
        this.f34811e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return kotlin.jvm.internal.r.a(this.f34807a, f0Var.f34807a) && kotlin.jvm.internal.r.a(this.f34808b, f0Var.f34808b) && kotlin.jvm.internal.r.a(this.f34809c, f0Var.f34809c) && this.f34810d == f0Var.f34810d && this.f34811e == f0Var.f34811e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34811e) + a1.a(this.f34810d, (this.f34809c.hashCode() + l0.k.a(this.f34807a.hashCode() * 31, 31, this.f34808b)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbA = y0.a("UseCaseOption(id=", this.f34807a, ", kind=", this.f34808b, ", icon=");
        sbA.append(this.f34809c);
        sbA.append(", title=");
        sbA.append(this.f34810d);
        sbA.append(", description=");
        return x0.a.a(sbA, this.f34811e, ")");
    }
}
