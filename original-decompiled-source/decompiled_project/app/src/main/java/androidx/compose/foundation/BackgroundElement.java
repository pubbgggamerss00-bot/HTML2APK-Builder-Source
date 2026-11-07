package androidx.compose.foundation;

import androidx.compose.ui.d;
import eh.l;
import i2.a1;
import j2.e3;
import kotlin.jvm.internal.r;
import pg.f0;
import q1.b1;
import q1.d2;
import q1.f2;
import q1.u0;
import r.z1;
import t.k;

/* loaded from: classes.dex */
final class BackgroundElement extends a1<k> {

    /* renamed from: b, reason: collision with root package name */
    public final long f770b;

    /* renamed from: c, reason: collision with root package name */
    public final u0 f771c;

    /* renamed from: d, reason: collision with root package name */
    public final float f772d;

    /* renamed from: e, reason: collision with root package name */
    public final f2 f773e;

    /* renamed from: f, reason: collision with root package name */
    public final l<e3, f0> f774f;

    public BackgroundElement(long j10, d2 d2Var, f2 f2Var, l lVar, int i10) {
        j10 = (i10 & 1) != 0 ? b1.f21654h : j10;
        d2Var = (i10 & 2) != 0 ? null : d2Var;
        this.f770b = j10;
        this.f771c = d2Var;
        this.f772d = 1.0f;
        this.f773e = f2Var;
        this.f774f = lVar;
    }

    @Override // i2.a1
    public final d.c a() {
        k kVar = new k();
        kVar.f25278q = this.f770b;
        kVar.f25279r = this.f771c;
        kVar.f25280s = this.f772d;
        kVar.f25281t = this.f773e;
        kVar.f25282v = 9205357640488583168L;
        return kVar;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        k kVar = (k) cVar;
        kVar.f25278q = this.f770b;
        kVar.f25279r = this.f771c;
        kVar.f25280s = this.f772d;
        kVar.f25281t = this.f773e;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && b1.d(this.f770b, backgroundElement.f770b) && r.a(this.f771c, backgroundElement.f771c) && this.f772d == backgroundElement.f772d && r.a(this.f773e, backgroundElement.f773e);
    }

    public final int hashCode() {
        int i10 = b1.f21655i;
        int iHashCode = Long.hashCode(this.f770b) * 31;
        u0 u0Var = this.f771c;
        return this.f773e.hashCode() + z1.a(this.f772d, (iHashCode + (u0Var != null ? u0Var.hashCode() : 0)) * 31, 31);
    }
}
