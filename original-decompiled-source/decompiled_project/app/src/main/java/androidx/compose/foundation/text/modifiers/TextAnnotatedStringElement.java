package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.modifiers.b;
import androidx.compose.ui.d;
import eh.l;
import i2.a1;
import java.util.List;
import kotlin.jvm.internal.r;
import p1.e;
import pg.f0;
import q1.e1;
import r.o2;
import t2.b;
import t2.h0;
import t2.l0;
import t2.u;
import x2.f;

/* loaded from: classes.dex */
public final class TextAnnotatedStringElement extends a1<b> {

    /* renamed from: b, reason: collision with root package name */
    public final t2.b f1080b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f1081c;

    /* renamed from: d, reason: collision with root package name */
    public final f.a f1082d;

    /* renamed from: e, reason: collision with root package name */
    public final l<h0, f0> f1083e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1084f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1085g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1086h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1087i;

    /* renamed from: j, reason: collision with root package name */
    public final List<b.c<u>> f1088j;

    /* renamed from: k, reason: collision with root package name */
    public final l<List<e>, f0> f1089k;

    /* renamed from: l, reason: collision with root package name */
    public final e1 f1090l;

    /* renamed from: m, reason: collision with root package name */
    public final l<b.a, f0> f1091m;

    public TextAnnotatedStringElement(t2.b bVar, l0 l0Var, f.a aVar, l lVar, int i10, boolean z10, int i11, int i12, List list, l lVar2, e1 e1Var, l lVar3) {
        this.f1080b = bVar;
        this.f1081c = l0Var;
        this.f1082d = aVar;
        this.f1083e = lVar;
        this.f1084f = i10;
        this.f1085g = z10;
        this.f1086h = i11;
        this.f1087i = i12;
        this.f1088j = list;
        this.f1089k = lVar2;
        this.f1090l = e1Var;
        this.f1091m = lVar3;
    }

    @Override // i2.a1
    public final d.c a() {
        return new b(this.f1080b, this.f1081c, this.f1082d, this.f1083e, this.f1084f, this.f1085g, this.f1086h, this.f1087i, this.f1088j, this.f1089k, null, this.f1090l, this.f1091m);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    @Override // i2.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(d.c cVar) {
        boolean z10;
        b bVar = (b) cVar;
        e1 e1Var = bVar.C;
        e1 e1Var2 = this.f1090l;
        boolean zA = r.a(e1Var2, e1Var);
        bVar.C = e1Var2;
        if (zA) {
            l0 l0Var = bVar.f1103r;
            l0 l0Var2 = this.f1081c;
            if (l0Var2 == l0Var) {
                l0Var2.getClass();
            } else if (l0Var2.f27852a.b(l0Var.f27852a)) {
            }
            z10 = false;
        } else {
            z10 = true;
        }
        bVar.U1(z10, bVar.Z1(this.f1080b), bVar.Y1(this.f1081c, this.f1088j, this.f1087i, this.f1086h, this.f1085g, this.f1082d, this.f1084f), bVar.X1(this.f1083e, this.f1089k, null, this.f1091m));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return r.a(this.f1090l, textAnnotatedStringElement.f1090l) && r.a(this.f1080b, textAnnotatedStringElement.f1080b) && r.a(this.f1081c, textAnnotatedStringElement.f1081c) && r.a(this.f1088j, textAnnotatedStringElement.f1088j) && r.a(this.f1082d, textAnnotatedStringElement.f1082d) && this.f1083e == textAnnotatedStringElement.f1083e && this.f1091m == textAnnotatedStringElement.f1091m && this.f1084f == textAnnotatedStringElement.f1084f && this.f1085g == textAnnotatedStringElement.f1085g && this.f1086h == textAnnotatedStringElement.f1086h && this.f1087i == textAnnotatedStringElement.f1087i && this.f1089k == textAnnotatedStringElement.f1089k;
    }

    public final int hashCode() {
        int iHashCode = (this.f1082d.hashCode() + ((this.f1081c.hashCode() + (this.f1080b.hashCode() * 31)) * 31)) * 31;
        l<h0, f0> lVar = this.f1083e;
        int iA = (((o2.a(androidx.datastore.preferences.protobuf.a1.a(this.f1084f, (iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31, 31), 31, this.f1085g) + this.f1086h) * 31) + this.f1087i) * 31;
        List<b.c<u>> list = this.f1088j;
        int iHashCode2 = (iA + (list != null ? list.hashCode() : 0)) * 31;
        l<List<e>, f0> lVar2 = this.f1089k;
        int iHashCode3 = (iHashCode2 + (lVar2 != null ? lVar2.hashCode() : 0)) * 961;
        e1 e1Var = this.f1090l;
        int iHashCode4 = (iHashCode3 + (e1Var != null ? e1Var.hashCode() : 0)) * 31;
        l<b.a, f0> lVar3 = this.f1091m;
        return iHashCode4 + (lVar3 != null ? lVar3.hashCode() : 0);
    }
}
