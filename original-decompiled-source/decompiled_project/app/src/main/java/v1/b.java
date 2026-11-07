package v1;

import q1.b1;
import q1.c1;
import s1.e;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: f, reason: collision with root package name */
    public final long f30538f;

    /* renamed from: h, reason: collision with root package name */
    public c1 f30540h;

    /* renamed from: g, reason: collision with root package name */
    public float f30539g = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    public final long f30541j = 9205357640488583168L;

    public b(long j10) {
        this.f30538f = j10;
    }

    @Override // v1.c
    public final boolean a(float f10) {
        this.f30539g = f10;
        return true;
    }

    @Override // v1.c
    public final boolean e(c1 c1Var) {
        this.f30540h = c1Var;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return b1.d(this.f30538f, ((b) obj).f30538f);
        }
        return false;
    }

    @Override // v1.c
    public final long h() {
        return this.f30541j;
    }

    public final int hashCode() {
        int i10 = b1.f21655i;
        return Long.hashCode(this.f30538f);
    }

    @Override // v1.c
    public final void i(e eVar) {
        e.X0(eVar, this.f30538f, 0L, 0L, this.f30539g, this.f30540h, 86);
    }

    public final String toString() {
        return "ColorPainter(color=" + ((Object) b1.j(this.f30538f)) + ')';
    }
}
