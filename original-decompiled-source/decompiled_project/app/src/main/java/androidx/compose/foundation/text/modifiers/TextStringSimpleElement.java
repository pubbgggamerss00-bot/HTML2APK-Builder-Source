package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.d;
import i2.a1;
import i2.k;
import i2.s;
import kotlin.jvm.internal.r;
import l0.l;
import q1.e1;
import r.o2;
import t2.l0;
import x2.f;

/* loaded from: classes.dex */
public final class TextStringSimpleElement extends a1<l> {

    /* renamed from: b, reason: collision with root package name */
    public final String f1092b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f1093c;

    /* renamed from: d, reason: collision with root package name */
    public final f.a f1094d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1095e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1096f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1097g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1098h;

    /* renamed from: i, reason: collision with root package name */
    public final e1 f1099i;

    public TextStringSimpleElement(String str, l0 l0Var, f.a aVar, int i10, boolean z10, int i11, int i12, e1 e1Var) {
        this.f1092b = str;
        this.f1093c = l0Var;
        this.f1094d = aVar;
        this.f1095e = i10;
        this.f1096f = z10;
        this.f1097g = i11;
        this.f1098h = i12;
        this.f1099i = e1Var;
    }

    @Override // i2.a1
    public final d.c a() {
        l lVar = new l();
        lVar.f16629q = this.f1092b;
        lVar.f16630r = this.f1093c;
        lVar.f16631s = this.f1094d;
        lVar.f16632t = this.f1095e;
        lVar.f16633v = this.f1096f;
        lVar.f16634w = this.f1097g;
        lVar.f16635x = this.f1098h;
        lVar.f16636y = this.f1099i;
        return lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // i2.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(d.c cVar) {
        boolean z10;
        l lVar = (l) cVar;
        e1 e1Var = lVar.f16636y;
        e1 e1Var2 = this.f1099i;
        boolean zA = r.a(e1Var2, e1Var);
        lVar.f16636y = e1Var2;
        boolean z11 = false;
        boolean z12 = true;
        l0 l0Var = this.f1093c;
        if (zA) {
            l0 l0Var2 = lVar.f16630r;
            if (l0Var == l0Var2) {
                l0Var.getClass();
            } else if (l0Var.f27852a.b(l0Var2.f27852a)) {
            }
            z10 = false;
        } else {
            z10 = true;
        }
        String str = lVar.f16629q;
        String str2 = this.f1092b;
        if (!r.a(str, str2)) {
            lVar.f16629q = str2;
            lVar.C = null;
            z11 = true;
        }
        boolean z13 = !lVar.f16630r.c(l0Var);
        lVar.f16630r = l0Var;
        int i10 = lVar.f16635x;
        int i11 = this.f1098h;
        if (i10 != i11) {
            lVar.f16635x = i11;
            z13 = true;
        }
        int i12 = lVar.f16634w;
        int i13 = this.f1097g;
        if (i12 != i13) {
            lVar.f16634w = i13;
            z13 = true;
        }
        boolean z14 = lVar.f16633v;
        boolean z15 = this.f1096f;
        if (z14 != z15) {
            lVar.f16633v = z15;
            z13 = true;
        }
        f.a aVar = lVar.f16631s;
        f.a aVar2 = this.f1094d;
        if (!r.a(aVar, aVar2)) {
            lVar.f16631s = aVar2;
            z13 = true;
        }
        int i14 = lVar.f16632t;
        int i15 = this.f1095e;
        if (i14 == i15) {
            z12 = z13;
        } else {
            lVar.f16632t = i15;
        }
        if (z11 || z12) {
            l0.f fVarU1 = lVar.U1();
            String str3 = lVar.f16629q;
            l0 l0Var3 = lVar.f16630r;
            f.a aVar3 = lVar.f16631s;
            int i16 = lVar.f16632t;
            boolean z16 = lVar.f16633v;
            int i17 = lVar.f16634w;
            int i18 = lVar.f16635x;
            fVarU1.f16591a = str3;
            fVarU1.f16592b = l0Var3;
            fVarU1.f16593c = aVar3;
            fVarU1.f16594d = i16;
            fVarU1.f16595e = z16;
            fVarU1.f16596f = i17;
            fVarU1.f16597g = i18;
            fVarU1.b();
        }
        if (lVar.f1157p) {
            if (z11 || (z10 && lVar.B != null)) {
                k.f(lVar).P();
            }
            if (z11 || z12) {
                k.f(lVar).O();
                s.a(lVar);
            }
            if (z10) {
                s.a(lVar);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return r.a(this.f1099i, textStringSimpleElement.f1099i) && r.a(this.f1092b, textStringSimpleElement.f1092b) && r.a(this.f1093c, textStringSimpleElement.f1093c) && r.a(this.f1094d, textStringSimpleElement.f1094d) && this.f1095e == textStringSimpleElement.f1095e && this.f1096f == textStringSimpleElement.f1096f && this.f1097g == textStringSimpleElement.f1097g && this.f1098h == textStringSimpleElement.f1098h;
    }

    public final int hashCode() {
        int iA = (((o2.a(androidx.datastore.preferences.protobuf.a1.a(this.f1095e, (this.f1094d.hashCode() + ((this.f1093c.hashCode() + (this.f1092b.hashCode() * 31)) * 31)) * 31, 31), 31, this.f1096f) + this.f1097g) * 31) + this.f1098h) * 31;
        e1 e1Var = this.f1099i;
        return iA + (e1Var != null ? e1Var.hashCode() : 0);
    }
}
