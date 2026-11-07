package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.d;
import d0.d2;
import eh.l;
import i2.a1;
import i2.k;
import java.util.List;
import kotlin.jvm.internal.r;
import l0.g;
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
public final class SelectableTextAnnotatedStringElement extends a1<a> {

    /* renamed from: b, reason: collision with root package name */
    public final t2.b f1068b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f1069c;

    /* renamed from: d, reason: collision with root package name */
    public final f.a f1070d;

    /* renamed from: e, reason: collision with root package name */
    public final l<h0, f0> f1071e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1072f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1073g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1074h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1075i;

    /* renamed from: j, reason: collision with root package name */
    public final List<b.c<u>> f1076j;

    /* renamed from: k, reason: collision with root package name */
    public final l<List<e>, f0> f1077k;

    /* renamed from: l, reason: collision with root package name */
    public final g f1078l;

    /* renamed from: m, reason: collision with root package name */
    public final e1 f1079m;

    public SelectableTextAnnotatedStringElement(t2.b bVar, l0 l0Var, f.a aVar, l lVar, int i10, boolean z10, int i11, int i12, List list, l lVar2, g gVar, e1 e1Var) {
        this.f1068b = bVar;
        this.f1069c = l0Var;
        this.f1070d = aVar;
        this.f1071e = lVar;
        this.f1072f = i10;
        this.f1073g = z10;
        this.f1074h = i11;
        this.f1075i = i12;
        this.f1076j = list;
        this.f1077k = lVar2;
        this.f1078l = gVar;
        this.f1079m = e1Var;
    }

    @Override // i2.a1
    public final d.c a() {
        return new a(this.f1068b, this.f1069c, this.f1070d, this.f1071e, this.f1072f, this.f1073g, this.f1074h, this.f1075i, this.f1076j, this.f1077k, this.f1078l, this.f1079m);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // i2.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(d.c cVar) {
        boolean z10;
        a aVar = (a) cVar;
        b bVar = aVar.f1101t;
        e1 e1Var = bVar.C;
        e1 e1Var2 = this.f1079m;
        boolean zA = r.a(e1Var2, e1Var);
        bVar.C = e1Var2;
        l0 l0Var = this.f1069c;
        if (zA) {
            l0 l0Var2 = bVar.f1103r;
            if (l0Var == l0Var2) {
                l0Var.getClass();
            } else if (l0Var.f27852a.b(l0Var2.f27852a)) {
            }
            z10 = false;
        } else {
            z10 = true;
        }
        boolean zZ1 = bVar.Z1(this.f1068b);
        boolean zY1 = aVar.f1101t.Y1(l0Var, this.f1076j, this.f1075i, this.f1074h, this.f1073g, this.f1070d, this.f1072f);
        l<h0, f0> lVar = this.f1071e;
        l<List<e>, f0> lVar2 = this.f1077k;
        g gVar = this.f1078l;
        bVar.U1(z10, zZ1, zY1, bVar.X1(lVar, lVar2, gVar, null));
        aVar.f1100s = gVar;
        k.f(aVar).O();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        return r.a(this.f1079m, selectableTextAnnotatedStringElement.f1079m) && r.a(this.f1068b, selectableTextAnnotatedStringElement.f1068b) && r.a(this.f1069c, selectableTextAnnotatedStringElement.f1069c) && r.a(this.f1076j, selectableTextAnnotatedStringElement.f1076j) && r.a(this.f1070d, selectableTextAnnotatedStringElement.f1070d) && this.f1071e == selectableTextAnnotatedStringElement.f1071e && this.f1072f == selectableTextAnnotatedStringElement.f1072f && this.f1073g == selectableTextAnnotatedStringElement.f1073g && this.f1074h == selectableTextAnnotatedStringElement.f1074h && this.f1075i == selectableTextAnnotatedStringElement.f1075i && this.f1077k == selectableTextAnnotatedStringElement.f1077k && r.a(this.f1078l, selectableTextAnnotatedStringElement.f1078l);
    }

    public final int hashCode() {
        int iHashCode = (this.f1070d.hashCode() + ((this.f1069c.hashCode() + (this.f1068b.hashCode() * 31)) * 31)) * 31;
        l<h0, f0> lVar = this.f1071e;
        int iA = (((o2.a(androidx.datastore.preferences.protobuf.a1.a(this.f1072f, (iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31, 31), 31, this.f1073g) + this.f1074h) * 31) + this.f1075i) * 31;
        List<b.c<u>> list = this.f1076j;
        int iHashCode2 = (iA + (list != null ? list.hashCode() : 0)) * 31;
        l<List<e>, f0> lVar2 = this.f1077k;
        int iHashCode3 = (iHashCode2 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        g gVar = this.f1078l;
        int iHashCode4 = (iHashCode3 + (gVar != null ? gVar.hashCode() : 0)) * 961;
        e1 e1Var = this.f1079m;
        return iHashCode4 + (e1Var != null ? e1Var.hashCode() : 0);
    }

    public final String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + ((Object) this.f1068b) + ", style=" + this.f1069c + ", fontFamilyResolver=" + this.f1070d + ", onTextLayout=" + this.f1071e + ", overflow=" + ((Object) d2.d(this.f1072f)) + ", softWrap=" + this.f1073g + ", maxLines=" + this.f1074h + ", minLines=" + this.f1075i + ", placeholders=" + this.f1076j + ", onPlaceholderLayout=" + this.f1077k + ", selectionController=" + this.f1078l + ", color=" + this.f1079m + ", autoSize=null)";
    }
}
