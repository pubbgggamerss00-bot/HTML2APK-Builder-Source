package androidx.compose.foundation.gestures;

import androidx.compose.ui.d;
import c2.b0;
import eh.l;
import eh.q;
import i2.a1;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import pg.f0;
import ph.i0;
import r.o2;
import v.t0;
import v.x;
import v.y;
import x.m;

/* loaded from: classes.dex */
public final class DraggableElement extends a1<h> {

    /* renamed from: j, reason: collision with root package name */
    public static final a f820j = a.f829a;

    /* renamed from: b, reason: collision with root package name */
    public final y f821b;

    /* renamed from: c, reason: collision with root package name */
    public final t0 f822c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f823d;

    /* renamed from: e, reason: collision with root package name */
    public final m f824e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f825f;

    /* renamed from: g, reason: collision with root package name */
    public final q<i0, p1.c, tg.e<? super f0>, Object> f826g;

    /* renamed from: h, reason: collision with root package name */
    public final q<i0, Float, tg.e<? super f0>, Object> f827h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f828i;

    public static final class a extends s implements l<b0, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f829a = new a(1);

        @Override // eh.l
        public final /* bridge */ /* synthetic */ Boolean invoke(b0 b0Var) {
            return Boolean.TRUE;
        }
    }

    public DraggableElement(y yVar, t0 t0Var, boolean z10, m mVar, boolean z11, x.a aVar, q qVar, boolean z12) {
        this.f821b = yVar;
        this.f822c = t0Var;
        this.f823d = z10;
        this.f824e = mVar;
        this.f825f = z11;
        this.f826g = aVar;
        this.f827h = qVar;
        this.f828i = z12;
    }

    @Override // i2.a1
    public final d.c a() {
        a aVar = f820j;
        boolean z10 = this.f823d;
        m mVar = this.f824e;
        t0 t0Var = this.f822c;
        h hVar = new h(aVar, z10, mVar, t0Var);
        hVar.B = this.f821b;
        hVar.C = t0Var;
        hVar.D = this.f825f;
        hVar.E = this.f826g;
        hVar.F = this.f827h;
        hVar.G = this.f828i;
        return hVar;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        boolean z10;
        boolean z11;
        h hVar = (h) cVar;
        y yVar = hVar.B;
        y yVar2 = this.f821b;
        if (r.a(yVar, yVar2)) {
            z10 = false;
        } else {
            hVar.B = yVar2;
            z10 = true;
        }
        t0 t0Var = hVar.C;
        t0 t0Var2 = this.f822c;
        if (t0Var != t0Var2) {
            hVar.C = t0Var2;
            z10 = true;
        }
        boolean z12 = hVar.G;
        boolean z13 = this.f828i;
        if (z12 != z13) {
            hVar.G = z13;
            z11 = true;
        } else {
            z11 = z10;
        }
        hVar.E = this.f826g;
        hVar.F = this.f827h;
        hVar.D = this.f825f;
        hVar.e2(f820j, this.f823d, this.f824e, t0Var2, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return r.a(this.f821b, draggableElement.f821b) && this.f822c == draggableElement.f822c && this.f823d == draggableElement.f823d && r.a(this.f824e, draggableElement.f824e) && this.f825f == draggableElement.f825f && r.a(this.f826g, draggableElement.f826g) && r.a(this.f827h, draggableElement.f827h) && this.f828i == draggableElement.f828i;
    }

    public final int hashCode() {
        int iA = o2.a((this.f822c.hashCode() + (this.f821b.hashCode() * 31)) * 31, 31, this.f823d);
        m mVar = this.f824e;
        return Boolean.hashCode(this.f828i) + ((this.f827h.hashCode() + ((this.f826g.hashCode() + o2.a((iA + (mVar != null ? mVar.hashCode() : 0)) * 31, 31, this.f825f)) * 31)) * 31);
    }
}
