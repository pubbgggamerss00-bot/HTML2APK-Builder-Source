package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.d;
import i0.i2;
import i2.a1;
import i2.k;
import k0.f;
import k0.g;
import k0.h;
import kotlin.jvm.internal.r;
import m0.x2;
import r.o2;
import t2.j0;
import y2.c0;
import y2.o;
import y2.o0;
import y2.v;

/* loaded from: classes.dex */
public final class CoreTextFieldSemanticsModifier extends a1<g> {

    /* renamed from: b, reason: collision with root package name */
    public final o0 f1056b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f1057c;

    /* renamed from: d, reason: collision with root package name */
    public final i2 f1058d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1059e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1060f;

    /* renamed from: g, reason: collision with root package name */
    public final v f1061g;

    /* renamed from: h, reason: collision with root package name */
    public final x2 f1062h;

    /* renamed from: i, reason: collision with root package name */
    public final o f1063i;

    /* renamed from: j, reason: collision with root package name */
    public final o1.c0 f1064j;

    public CoreTextFieldSemanticsModifier(o0 o0Var, c0 c0Var, i2 i2Var, boolean z10, boolean z11, v vVar, x2 x2Var, o oVar, o1.c0 c0Var2) {
        this.f1056b = o0Var;
        this.f1057c = c0Var;
        this.f1058d = i2Var;
        this.f1059e = z10;
        this.f1060f = z11;
        this.f1061g = vVar;
        this.f1062h = x2Var;
        this.f1063i = oVar;
        this.f1064j = c0Var2;
    }

    @Override // i2.a1
    public final d.c a() {
        g gVar = new g();
        gVar.f15826s = this.f1056b;
        gVar.f15827t = this.f1057c;
        gVar.f15828v = this.f1058d;
        gVar.f15829w = this.f1059e;
        gVar.f15830x = this.f1060f;
        gVar.f15831y = this.f1061g;
        x2 x2Var = this.f1062h;
        gVar.f15832z = x2Var;
        gVar.A = this.f1063i;
        gVar.B = this.f1064j;
        x2Var.f17553g = new f(gVar);
        return gVar;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        g gVar = (g) cVar;
        boolean z10 = gVar.f15830x;
        boolean z11 = false;
        boolean z12 = z10 && !gVar.f15829w;
        o oVar = gVar.A;
        x2 x2Var = gVar.f15832z;
        boolean z13 = this.f1059e;
        boolean z14 = this.f1060f;
        if (z14 && !z13) {
            z11 = true;
        }
        gVar.f15826s = this.f1056b;
        c0 c0Var = this.f1057c;
        gVar.f15827t = c0Var;
        gVar.f15828v = this.f1058d;
        gVar.f15829w = z13;
        gVar.f15830x = z14;
        gVar.f15831y = this.f1061g;
        x2 x2Var2 = this.f1062h;
        gVar.f15832z = x2Var2;
        o oVar2 = this.f1063i;
        gVar.A = oVar2;
        gVar.B = this.f1064j;
        if (z14 != z10 || z11 != z12 || !r.a(oVar2, oVar) || !j0.b(c0Var.f33683b)) {
            k.f(gVar).P();
        }
        if (r.a(x2Var2, x2Var)) {
            return;
        }
        x2Var2.f17553g = new h(gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreTextFieldSemanticsModifier)) {
            return false;
        }
        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = (CoreTextFieldSemanticsModifier) obj;
        return r.a(this.f1056b, coreTextFieldSemanticsModifier.f1056b) && r.a(this.f1057c, coreTextFieldSemanticsModifier.f1057c) && r.a(this.f1058d, coreTextFieldSemanticsModifier.f1058d) && this.f1059e == coreTextFieldSemanticsModifier.f1059e && this.f1060f == coreTextFieldSemanticsModifier.f1060f && r.a(this.f1061g, coreTextFieldSemanticsModifier.f1061g) && r.a(this.f1062h, coreTextFieldSemanticsModifier.f1062h) && r.a(this.f1063i, coreTextFieldSemanticsModifier.f1063i) && r.a(this.f1064j, coreTextFieldSemanticsModifier.f1064j);
    }

    public final int hashCode() {
        return this.f1064j.hashCode() + ((this.f1063i.hashCode() + ((this.f1062h.hashCode() + ((this.f1061g.hashCode() + o2.a(o2.a(o2.a((this.f1058d.hashCode() + ((this.f1057c.hashCode() + (this.f1056b.hashCode() * 31)) * 31)) * 31, 31, this.f1059e), 31, this.f1060f), 31, false)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.f1056b + ", value=" + this.f1057c + ", state=" + this.f1058d + ", readOnly=" + this.f1059e + ", enabled=" + this.f1060f + ", isPassword=false, offsetMapping=" + this.f1061g + ", manager=" + this.f1062h + ", imeOptions=" + this.f1063i + ", focusRequester=" + this.f1064j + ')';
    }
}
