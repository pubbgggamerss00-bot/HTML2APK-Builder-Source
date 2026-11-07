package androidx.compose.ui.draw;

import androidx.compose.ui.d;
import g2.j;
import i2.a1;
import i2.k;
import i2.s;
import j1.d;
import kotlin.jvm.internal.r;
import n1.n;
import p1.h;
import q1.c1;
import r.o2;
import r.z1;
import v1.c;

/* loaded from: classes.dex */
final class PainterElement extends a1<n> {

    /* renamed from: b, reason: collision with root package name */
    public final c f1162b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1163c = true;

    /* renamed from: d, reason: collision with root package name */
    public final d f1164d;

    /* renamed from: e, reason: collision with root package name */
    public final j f1165e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1166f;

    /* renamed from: g, reason: collision with root package name */
    public final c1 f1167g;

    public PainterElement(c cVar, d dVar, j jVar, float f10, c1 c1Var) {
        this.f1162b = cVar;
        this.f1164d = dVar;
        this.f1165e = jVar;
        this.f1166f = f10;
        this.f1167g = c1Var;
    }

    @Override // i2.a1
    public final d.c a() {
        n nVar = new n();
        nVar.f18318q = this.f1162b;
        nVar.f18319r = this.f1163c;
        nVar.f18320s = this.f1164d;
        nVar.f18321t = this.f1165e;
        nVar.f18322v = this.f1166f;
        nVar.f18323w = this.f1167g;
        return nVar;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        n nVar = (n) cVar;
        boolean z10 = nVar.f18319r;
        c cVar2 = this.f1162b;
        boolean z11 = this.f1163c;
        boolean z12 = z10 != z11 || (z11 && !h.a(nVar.f18318q.h(), cVar2.h()));
        nVar.f18318q = cVar2;
        nVar.f18319r = z11;
        nVar.f18320s = this.f1164d;
        nVar.f18321t = this.f1165e;
        nVar.f18322v = this.f1166f;
        nVar.f18323w = this.f1167g;
        if (z12) {
            k.f(nVar).O();
        }
        s.a(nVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return r.a(this.f1162b, painterElement.f1162b) && this.f1163c == painterElement.f1163c && r.a(this.f1164d, painterElement.f1164d) && r.a(this.f1165e, painterElement.f1165e) && Float.compare(this.f1166f, painterElement.f1166f) == 0 && r.a(this.f1167g, painterElement.f1167g);
    }

    public final int hashCode() {
        int iA = z1.a(this.f1166f, (this.f1165e.hashCode() + ((this.f1164d.hashCode() + o2.a(this.f1162b.hashCode() * 31, 31, this.f1163c)) * 31)) * 31, 31);
        c1 c1Var = this.f1167g;
        return iA + (c1Var == null ? 0 : c1Var.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f1162b + ", sizeToIntrinsics=" + this.f1163c + ", alignment=" + this.f1164d + ", contentScale=" + this.f1165e + ", alpha=" + this.f1166f + ", colorFilter=" + this.f1167g + ')';
    }
}
