package androidx.compose.foundation.gestures;

import androidx.compose.ui.d;
import i2.a1;
import kotlin.jvm.internal.r;
import r.o2;
import v.l1;
import v.t0;
import x.m;

/* loaded from: classes.dex */
final class ScrollableElement extends a1<j> {

    /* renamed from: b, reason: collision with root package name */
    public final l1 f830b;

    /* renamed from: c, reason: collision with root package name */
    public final t0 f831c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f832d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f833e;

    /* renamed from: f, reason: collision with root package name */
    public final m f834f;

    public ScrollableElement(l1 l1Var, t0 t0Var, boolean z10, boolean z11, m mVar) {
        this.f830b = l1Var;
        this.f831c = t0Var;
        this.f832d = z10;
        this.f833e = z11;
        this.f834f = mVar;
    }

    @Override // i2.a1
    public final d.c a() {
        return new j(null, null, null, this.f831c, this.f830b, this.f834f, this.f832d, this.f833e);
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        ((j) cVar).f2(null, null, null, this.f831c, this.f830b, this.f834f, this.f832d, this.f833e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return r.a(this.f830b, scrollableElement.f830b) && this.f831c == scrollableElement.f831c && this.f832d == scrollableElement.f832d && this.f833e == scrollableElement.f833e && r.a(this.f834f, scrollableElement.f834f);
    }

    public final int hashCode() {
        int iA = o2.a(o2.a((this.f831c.hashCode() + (this.f830b.hashCode() * 31)) * 961, 31, this.f832d), 961, this.f833e);
        m mVar = this.f834f;
        return (iA + (mVar != null ? mVar.hashCode() : 0)) * 31;
    }
}
