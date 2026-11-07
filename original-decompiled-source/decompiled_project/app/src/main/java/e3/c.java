package e3;

import q1.b1;
import q1.u0;

/* loaded from: classes.dex */
public final class c implements l {

    /* renamed from: a, reason: collision with root package name */
    public final long f8348a;

    public c(long j10) {
        this.f8348a = j10;
        if (j10 != 16) {
            return;
        }
        z2.a.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && b1.d(this.f8348a, ((c) obj).f8348a);
    }

    public final int hashCode() {
        int i10 = b1.f21655i;
        return Long.hashCode(this.f8348a);
    }

    @Override // e3.l
    public final float i() {
        return b1.e(this.f8348a);
    }

    @Override // e3.l
    public final long j() {
        return this.f8348a;
    }

    @Override // e3.l
    public final u0 l() {
        return null;
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) b1.j(this.f8348a)) + ')';
    }
}
