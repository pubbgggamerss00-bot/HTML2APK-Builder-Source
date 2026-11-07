package androidx.compose.foundation.selection;

import androidx.compose.ui.d;
import g0.f;
import i2.a1;
import i2.k;
import kotlin.jvm.internal.r;
import pg.f0;
import q2.i;
import r.o2;
import t.y0;
import x.m;

/* loaded from: classes.dex */
final class TriStateToggleableElement extends a1<f> {

    /* renamed from: b, reason: collision with root package name */
    public final s2.a f1033b;

    /* renamed from: c, reason: collision with root package name */
    public final m f1034c;

    /* renamed from: d, reason: collision with root package name */
    public final y0 f1035d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1036e;

    /* renamed from: f, reason: collision with root package name */
    public final i f1037f;

    /* renamed from: g, reason: collision with root package name */
    public final eh.a<f0> f1038g;

    public TriStateToggleableElement() {
        throw null;
    }

    public TriStateToggleableElement(s2.a aVar, m mVar, y0 y0Var, boolean z10, i iVar, eh.a aVar2) {
        this.f1033b = aVar;
        this.f1034c = mVar;
        this.f1035d = y0Var;
        this.f1036e = z10;
        this.f1037f = iVar;
        this.f1038g = aVar2;
    }

    @Override // i2.a1
    public final d.c a() {
        f fVar = new f(this.f1034c, this.f1035d, this.f1036e, null, this.f1037f, this.f1038g);
        fVar.L = this.f1033b;
        return fVar;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        f fVar = (f) cVar;
        s2.a aVar = fVar.L;
        s2.a aVar2 = this.f1033b;
        if (aVar != aVar2) {
            fVar.L = aVar2;
            k.f(fVar).P();
        }
        fVar.d2(this.f1034c, this.f1035d, this.f1036e, null, this.f1037f, this.f1038g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TriStateToggleableElement.class != obj.getClass()) {
            return false;
        }
        TriStateToggleableElement triStateToggleableElement = (TriStateToggleableElement) obj;
        return this.f1033b == triStateToggleableElement.f1033b && r.a(this.f1034c, triStateToggleableElement.f1034c) && r.a(this.f1035d, triStateToggleableElement.f1035d) && this.f1036e == triStateToggleableElement.f1036e && r.a(this.f1037f, triStateToggleableElement.f1037f) && this.f1038g == triStateToggleableElement.f1038g;
    }

    public final int hashCode() {
        int iHashCode = this.f1033b.hashCode() * 31;
        m mVar = this.f1034c;
        int iHashCode2 = (iHashCode + (mVar != null ? mVar.hashCode() : 0)) * 31;
        y0 y0Var = this.f1035d;
        int iA = o2.a((iHashCode2 + (y0Var != null ? y0Var.hashCode() : 0)) * 31, 31, this.f1036e);
        i iVar = this.f1037f;
        return this.f1038g.hashCode() + ((iA + (iVar != null ? Integer.hashCode(iVar.f21770a) : 0)) * 31);
    }
}
