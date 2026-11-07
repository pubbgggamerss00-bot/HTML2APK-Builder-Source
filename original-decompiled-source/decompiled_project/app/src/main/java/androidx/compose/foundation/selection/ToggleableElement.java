package androidx.compose.foundation.selection;

import androidx.compose.ui.d;
import eh.l;
import g0.e;
import i2.a1;
import i2.k;
import kotlin.jvm.internal.r;
import pg.f0;
import q2.i;
import r.o2;
import t.y0;
import x.m;

/* loaded from: classes.dex */
final class ToggleableElement extends a1<e> {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1027b;

    /* renamed from: c, reason: collision with root package name */
    public final m f1028c;

    /* renamed from: d, reason: collision with root package name */
    public final y0 f1029d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1030e;

    /* renamed from: f, reason: collision with root package name */
    public final i f1031f;

    /* renamed from: g, reason: collision with root package name */
    public final l<Boolean, f0> f1032g;

    public ToggleableElement() {
        throw null;
    }

    public ToggleableElement(boolean z10, m mVar, y0 y0Var, boolean z11, i iVar, l lVar) {
        this.f1027b = z10;
        this.f1028c = mVar;
        this.f1029d = y0Var;
        this.f1030e = z11;
        this.f1031f = iVar;
        this.f1032g = lVar;
    }

    @Override // i2.a1
    public final d.c a() {
        return new e(this.f1027b, this.f1028c, this.f1029d, this.f1030e, this.f1031f, this.f1032g);
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        e eVar = (e) cVar;
        boolean z10 = eVar.L;
        boolean z11 = this.f1027b;
        if (z10 != z11) {
            eVar.L = z11;
            k.f(eVar).P();
        }
        eVar.M = this.f1032g;
        eVar.d2(this.f1028c, this.f1029d, this.f1030e, null, this.f1031f, eVar.N);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ToggleableElement.class != obj.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) obj;
        return this.f1027b == toggleableElement.f1027b && r.a(this.f1028c, toggleableElement.f1028c) && r.a(this.f1029d, toggleableElement.f1029d) && this.f1030e == toggleableElement.f1030e && r.a(this.f1031f, toggleableElement.f1031f) && this.f1032g == toggleableElement.f1032g;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f1027b) * 31;
        m mVar = this.f1028c;
        int iHashCode2 = (iHashCode + (mVar != null ? mVar.hashCode() : 0)) * 31;
        y0 y0Var = this.f1029d;
        int iA = o2.a((iHashCode2 + (y0Var != null ? y0Var.hashCode() : 0)) * 31, 31, this.f1030e);
        i iVar = this.f1031f;
        return this.f1032g.hashCode() + ((iA + (iVar != null ? Integer.hashCode(iVar.f21770a) : 0)) * 31);
    }
}
