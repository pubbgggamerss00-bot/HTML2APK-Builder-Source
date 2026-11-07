package androidx.compose.foundation.layout;

import g2.t1;
import j1.d;
import j2.c3;
import kotlin.jvm.internal.r;
import z.i;
import z.n;

/* loaded from: classes.dex */
public final class c implements n, i {

    /* renamed from: a, reason: collision with root package name */
    public final f3.d f962a;

    /* renamed from: b, reason: collision with root package name */
    public final long f963b;

    public c(t1 t1Var, long j10) {
        this.f962a = t1Var;
        this.f963b = j10;
    }

    @Override // z.n
    public final float a() {
        long j10 = this.f963b;
        if (!f3.b.e(j10)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.f962a.u(f3.b.i(j10));
    }

    @Override // z.i
    public final androidx.compose.ui.d b(androidx.compose.ui.d dVar, j1.f fVar) {
        return dVar.h(new BoxChildDataElement(fVar, false, c3.f14686a));
    }

    @Override // z.n
    public final long c() {
        return this.f963b;
    }

    @Override // z.n
    public final float d() {
        long j10 = this.f963b;
        if (!f3.b.d(j10)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.f962a.u(f3.b.h(j10));
    }

    @Override // z.i
    public final androidx.compose.ui.d e() {
        return new BoxChildDataElement(d.a.f14606e, true, c3.f14686a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return r.a(this.f962a, cVar.f962a) && f3.b.c(this.f963b, cVar.f963b);
    }

    public final int hashCode() {
        return Long.hashCode(this.f963b) + (this.f962a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f962a + ", constraints=" + ((Object) f3.b.m(this.f963b)) + ')';
    }
}
