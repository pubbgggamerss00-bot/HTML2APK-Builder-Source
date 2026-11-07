package e3;

import kotlin.jvm.internal.r;
import q1.b1;
import q1.d2;
import q1.u0;

/* loaded from: classes.dex */
public final class b implements l {

    /* renamed from: a, reason: collision with root package name */
    public final d2 f8346a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8347b;

    public b(d2 d2Var, float f10) {
        this.f8346a = d2Var;
        this.f8347b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return r.a(this.f8346a, bVar.f8346a) && Float.compare(this.f8347b, bVar.f8347b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8347b) + (this.f8346a.hashCode() * 31);
    }

    @Override // e3.l
    public final float i() {
        return this.f8347b;
    }

    @Override // e3.l
    public final long j() {
        int i10 = b1.f21655i;
        return b1.f21654h;
    }

    @Override // e3.l
    public final u0 l() {
        return this.f8346a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.f8346a);
        sb.append(", alpha=");
        return org.bouncycastle.jcajce.provider.digest.d.a(sb, this.f8347b, ')');
    }
}
