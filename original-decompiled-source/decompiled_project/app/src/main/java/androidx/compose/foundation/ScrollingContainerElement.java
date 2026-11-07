package androidx.compose.foundation;

import androidx.compose.ui.d;
import i2.a1;
import kotlin.jvm.internal.r;
import r.o2;
import t.i1;
import t.v1;
import v.l1;
import v.t0;
import v.z;
import x.m;

/* loaded from: classes.dex */
final class ScrollingContainerElement extends a1<v1> {

    /* renamed from: b, reason: collision with root package name */
    public final l1 f801b;

    /* renamed from: c, reason: collision with root package name */
    public final t0 f802c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f803d;

    /* renamed from: e, reason: collision with root package name */
    public final z f804e;

    /* renamed from: f, reason: collision with root package name */
    public final m f805f;

    /* renamed from: g, reason: collision with root package name */
    public final v.d f806g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f807h;

    /* renamed from: i, reason: collision with root package name */
    public final i1 f808i;

    public ScrollingContainerElement(i1 i1Var, v.d dVar, z zVar, t0 t0Var, l1 l1Var, m mVar, boolean z10, boolean z11) {
        this.f801b = l1Var;
        this.f802c = t0Var;
        this.f803d = z10;
        this.f804e = zVar;
        this.f805f = mVar;
        this.f806g = dVar;
        this.f807h = z11;
        this.f808i = i1Var;
    }

    @Override // i2.a1
    public final d.c a() {
        v1 v1Var = new v1();
        v1Var.f25391s = this.f801b;
        v1Var.f25392t = this.f802c;
        v1Var.f25393v = this.f803d;
        v1Var.f25394w = this.f804e;
        v1Var.f25395x = this.f805f;
        v1Var.f25396y = this.f806g;
        v1Var.f25397z = this.f807h;
        v1Var.A = this.f808i;
        return v1Var;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        m mVar = this.f805f;
        ((v1) cVar).Y1(this.f808i, this.f806g, this.f804e, this.f802c, this.f801b, mVar, this.f807h, this.f803d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScrollingContainerElement.class != obj.getClass()) {
            return false;
        }
        ScrollingContainerElement scrollingContainerElement = (ScrollingContainerElement) obj;
        return r.a(this.f801b, scrollingContainerElement.f801b) && this.f802c == scrollingContainerElement.f802c && this.f803d == scrollingContainerElement.f803d && r.a(this.f804e, scrollingContainerElement.f804e) && r.a(this.f805f, scrollingContainerElement.f805f) && r.a(this.f806g, scrollingContainerElement.f806g) && this.f807h == scrollingContainerElement.f807h && r.a(this.f808i, scrollingContainerElement.f808i);
    }

    public final int hashCode() {
        int iA = o2.a(o2.a((this.f802c.hashCode() + (this.f801b.hashCode() * 31)) * 31, 31, this.f803d), 31, false);
        z zVar = this.f804e;
        int iHashCode = (iA + (zVar != null ? zVar.hashCode() : 0)) * 31;
        m mVar = this.f805f;
        int iHashCode2 = (iHashCode + (mVar != null ? mVar.hashCode() : 0)) * 31;
        v.d dVar = this.f806g;
        int iA2 = o2.a((iHashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31, 31, this.f807h);
        i1 i1Var = this.f808i;
        return iA2 + (i1Var != null ? i1Var.hashCode() : 0);
    }
}
