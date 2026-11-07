package androidx.compose.animation;

import androidx.compose.ui.d;
import f3.m;
import f3.p;
import i2.a1;
import kotlin.jvm.internal.r;
import r.c2;
import r.t1;
import r.u0;
import r.u1;
import r.w1;
import s.y1;

/* loaded from: classes.dex */
final class EnterExitTransitionElement extends a1<t1> {

    /* renamed from: b, reason: collision with root package name */
    public final y1<u0> f746b;

    /* renamed from: c, reason: collision with root package name */
    public final y1<u0>.a<p, s.p> f747c;

    /* renamed from: d, reason: collision with root package name */
    public final y1<u0>.a<m, s.p> f748d;

    /* renamed from: e, reason: collision with root package name */
    public final y1<u0>.a<m, s.p> f749e;

    /* renamed from: f, reason: collision with root package name */
    public final u1 f750f;

    /* renamed from: g, reason: collision with root package name */
    public final w1 f751g;

    /* renamed from: h, reason: collision with root package name */
    public final eh.a<Boolean> f752h;

    /* renamed from: i, reason: collision with root package name */
    public final c2 f753i;

    public EnterExitTransitionElement(y1<u0> y1Var, y1<u0>.a<p, s.p> aVar, y1<u0>.a<m, s.p> aVar2, y1<u0>.a<m, s.p> aVar3, u1 u1Var, w1 w1Var, eh.a<Boolean> aVar4, c2 c2Var) {
        this.f746b = y1Var;
        this.f747c = aVar;
        this.f748d = aVar2;
        this.f749e = aVar3;
        this.f750f = u1Var;
        this.f751g = w1Var;
        this.f752h = aVar4;
        this.f753i = c2Var;
    }

    @Override // i2.a1
    public final d.c a() {
        return new t1(this.f746b, this.f747c, this.f748d, this.f749e, this.f750f, this.f751g, this.f752h, this.f753i);
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        t1 t1Var = (t1) cVar;
        t1Var.f22928q = this.f746b;
        t1Var.f22929r = this.f747c;
        t1Var.f22930s = this.f748d;
        t1Var.f22931t = this.f749e;
        t1Var.f22932v = this.f750f;
        t1Var.f22933w = this.f751g;
        t1Var.f22934x = this.f752h;
        t1Var.f22935y = this.f753i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return r.a(this.f746b, enterExitTransitionElement.f746b) && r.a(this.f747c, enterExitTransitionElement.f747c) && r.a(this.f748d, enterExitTransitionElement.f748d) && r.a(this.f749e, enterExitTransitionElement.f749e) && r.a(this.f750f, enterExitTransitionElement.f750f) && r.a(this.f751g, enterExitTransitionElement.f751g) && r.a(this.f752h, enterExitTransitionElement.f752h) && r.a(this.f753i, enterExitTransitionElement.f753i);
    }

    public final int hashCode() {
        int iHashCode = this.f746b.hashCode() * 31;
        y1<u0>.a<p, s.p> aVar = this.f747c;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        y1<u0>.a<m, s.p> aVar2 = this.f748d;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        y1<u0>.a<m, s.p> aVar3 = this.f749e;
        return this.f753i.hashCode() + ((this.f752h.hashCode() + ((this.f751g.hashCode() + ((this.f750f.hashCode() + ((iHashCode3 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.f746b + ", sizeAnimation=" + this.f747c + ", offsetAnimation=" + this.f748d + ", slideAnimation=" + this.f749e + ", enter=" + this.f750f + ", exit=" + this.f751g + ", isEnabled=" + this.f752h + ", graphicsLayerBlock=" + this.f753i + ')';
    }
}
