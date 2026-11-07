package androidx.compose.foundation.selection;

import androidx.compose.ui.d;
import i2.a1;
import i2.k;
import kotlin.jvm.internal.r;
import pg.f0;
import q2.i;
import r.o2;
import t.y0;
import x.m;

/* loaded from: classes.dex */
final class SelectableElement extends a1<g0.c> {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1021b;

    /* renamed from: c, reason: collision with root package name */
    public final m f1022c;

    /* renamed from: d, reason: collision with root package name */
    public final y0 f1023d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1024e;

    /* renamed from: f, reason: collision with root package name */
    public final i f1025f;

    /* renamed from: g, reason: collision with root package name */
    public final eh.a<f0> f1026g;

    public SelectableElement() {
        throw null;
    }

    public SelectableElement(boolean z10, m mVar, y0 y0Var, boolean z11, i iVar, eh.a aVar) {
        this.f1021b = z10;
        this.f1022c = mVar;
        this.f1023d = y0Var;
        this.f1024e = z11;
        this.f1025f = iVar;
        this.f1026g = aVar;
    }

    @Override // i2.a1
    public final d.c a() {
        g0.c cVar = new g0.c(this.f1022c, this.f1023d, this.f1024e, null, this.f1025f, this.f1026g);
        cVar.L = this.f1021b;
        return cVar;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        g0.c cVar2 = (g0.c) cVar;
        boolean z10 = cVar2.L;
        boolean z11 = this.f1021b;
        if (z10 != z11) {
            cVar2.L = z11;
            k.f(cVar2).P();
        }
        cVar2.d2(this.f1022c, this.f1023d, this.f1024e, null, this.f1025f, this.f1026g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectableElement.class != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        return this.f1021b == selectableElement.f1021b && r.a(this.f1022c, selectableElement.f1022c) && r.a(this.f1023d, selectableElement.f1023d) && this.f1024e == selectableElement.f1024e && r.a(this.f1025f, selectableElement.f1025f) && this.f1026g == selectableElement.f1026g;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f1021b) * 31;
        m mVar = this.f1022c;
        int iHashCode2 = (iHashCode + (mVar != null ? mVar.hashCode() : 0)) * 31;
        y0 y0Var = this.f1023d;
        int iA = o2.a((iHashCode2 + (y0Var != null ? y0Var.hashCode() : 0)) * 31, 31, this.f1024e);
        i iVar = this.f1025f;
        return this.f1026g.hashCode() + ((iA + (iVar != null ? Integer.hashCode(iVar.f21770a) : 0)) * 31);
    }
}
