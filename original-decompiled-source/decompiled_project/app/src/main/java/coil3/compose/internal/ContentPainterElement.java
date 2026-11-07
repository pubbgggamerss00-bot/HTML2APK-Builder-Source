package coil3.compose.internal;

import androidx.compose.ui.d;
import eh.l;
import g2.j;
import g7.p;
import h7.c;
import h7.e;
import h7.i;
import h7.k;
import i2.a1;
import i2.s;
import i7.d;
import kotlin.jvm.internal.r;
import p1.h;
import pg.f0;
import q1.c1;
import r.o2;
import r.z1;
import w7.f;
import x0.s1;

/* loaded from: classes.dex */
public final class ContentPainterElement extends a1<d> {

    /* renamed from: b, reason: collision with root package name */
    public final f f5569b;

    /* renamed from: c, reason: collision with root package name */
    public final p f5570c;

    /* renamed from: d, reason: collision with root package name */
    public final c f5571d;

    /* renamed from: e, reason: collision with root package name */
    public final l<e.b, e.b> f5572e;

    /* renamed from: f, reason: collision with root package name */
    public final l<e.b, f0> f5573f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5574g;

    /* renamed from: h, reason: collision with root package name */
    public final j1.d f5575h;

    /* renamed from: i, reason: collision with root package name */
    public final j f5576i;

    /* renamed from: j, reason: collision with root package name */
    public final float f5577j;

    /* renamed from: k, reason: collision with root package name */
    public final c1 f5578k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f5579l;

    /* renamed from: m, reason: collision with root package name */
    public final i f5580m;

    /* renamed from: n, reason: collision with root package name */
    public final String f5581n;

    public ContentPainterElement(f fVar, p pVar, c cVar, l lVar, l lVar2, int i10, j1.d dVar, j jVar, float f10, c1 c1Var, boolean z10, i iVar, String str) {
        this.f5569b = fVar;
        this.f5570c = pVar;
        this.f5571d = cVar;
        this.f5572e = lVar;
        this.f5573f = lVar2;
        this.f5574g = i10;
        this.f5575h = dVar;
        this.f5576i = jVar;
        this.f5577j = f10;
        this.f5578k = c1Var;
        this.f5579l = z10;
        this.f5580m = iVar;
        this.f5581n = str;
    }

    @Override // i2.a1
    public final d.c a() {
        c cVar = this.f5571d;
        p pVar = this.f5570c;
        f fVar = this.f5569b;
        e.a aVar = new e.a(pVar, fVar, cVar);
        e eVar = new e(aVar);
        eVar.f12289p = this.f5572e;
        eVar.f12290q = this.f5573f;
        eVar.f12291r = this.f5576i;
        eVar.f12292s = this.f5574g;
        eVar.f12293t = this.f5580m;
        eVar.m(aVar);
        x7.i iVar = fVar.f31342o;
        return new i7.d(eVar, this.f5575h, this.f5576i, this.f5577j, this.f5578k, this.f5579l, this.f5581n, iVar instanceof k ? (k) iVar : null);
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        i7.d dVar = (i7.d) cVar;
        long jH = dVar.f14187y.h();
        k kVar = dVar.f14183x;
        c cVar2 = this.f5571d;
        p pVar = this.f5570c;
        f fVar = this.f5569b;
        e.a aVar = new e.a(pVar, fVar, cVar2);
        e eVar = dVar.f14187y;
        eVar.f12289p = this.f5572e;
        eVar.f12290q = this.f5573f;
        j jVar = this.f5576i;
        eVar.f12291r = jVar;
        eVar.f12292s = this.f5574g;
        eVar.f12293t = this.f5580m;
        eVar.m(aVar);
        boolean zA = h.a(jH, eVar.h());
        dVar.f14177q = this.f5575h;
        x7.i iVar = fVar.f31342o;
        dVar.f14183x = iVar instanceof k ? (k) iVar : null;
        dVar.f14178r = jVar;
        dVar.f14179s = this.f5577j;
        dVar.f14180t = this.f5578k;
        dVar.f14181v = this.f5579l;
        String str = dVar.f14182w;
        String str2 = this.f5581n;
        if (!r.a(str, str2)) {
            dVar.f14182w = str2;
            i2.k.f(dVar).P();
        }
        boolean zA2 = r.a(kVar, dVar.f14183x);
        if (!zA || !zA2) {
            i2.k.f(dVar).O();
        }
        s.a(dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPainterElement)) {
            return false;
        }
        ContentPainterElement contentPainterElement = (ContentPainterElement) obj;
        return r.a(this.f5569b, contentPainterElement.f5569b) && r.a(this.f5570c, contentPainterElement.f5570c) && r.a(this.f5571d, contentPainterElement.f5571d) && r.a(this.f5572e, contentPainterElement.f5572e) && r.a(this.f5573f, contentPainterElement.f5573f) && this.f5574g == contentPainterElement.f5574g && r.a(this.f5575h, contentPainterElement.f5575h) && r.a(this.f5576i, contentPainterElement.f5576i) && Float.compare(this.f5577j, contentPainterElement.f5577j) == 0 && r.a(this.f5578k, contentPainterElement.f5578k) && this.f5579l == contentPainterElement.f5579l && r.a(this.f5580m, contentPainterElement.f5580m) && r.a(this.f5581n, contentPainterElement.f5581n);
    }

    public final int hashCode() {
        int iHashCode = (this.f5572e.hashCode() + ((this.f5571d.hashCode() + ((this.f5570c.hashCode() + (this.f5569b.hashCode() * 31)) * 31)) * 31)) * 31;
        l<e.b, f0> lVar = this.f5573f;
        int iA = z1.a(this.f5577j, (this.f5576i.hashCode() + ((this.f5575h.hashCode() + androidx.datastore.preferences.protobuf.a1.a(this.f5574g, (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31, 31)) * 31)) * 31, 31);
        c1 c1Var = this.f5578k;
        int iA2 = o2.a((iA + (c1Var == null ? 0 : c1Var.hashCode())) * 31, 31, this.f5579l);
        i iVar = this.f5580m;
        int iHashCode2 = (iA2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        String str = this.f5581n;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentPainterElement(request=");
        sb.append(this.f5569b);
        sb.append(", imageLoader=");
        sb.append(this.f5570c);
        sb.append(", modelEqualityDelegate=");
        sb.append(this.f5571d);
        sb.append(", transform=");
        sb.append(this.f5572e);
        sb.append(", onState=");
        sb.append(this.f5573f);
        sb.append(", filterQuality=");
        int i10 = this.f5574g;
        sb.append((Object) (i10 == 0 ? "None" : i10 == 1 ? "Low" : i10 == 2 ? "Medium" : i10 == 3 ? "High" : "Unknown"));
        sb.append(", alignment=");
        sb.append(this.f5575h);
        sb.append(", contentScale=");
        sb.append(this.f5576i);
        sb.append(", alpha=");
        sb.append(this.f5577j);
        sb.append(", colorFilter=");
        sb.append(this.f5578k);
        sb.append(", clipToBounds=");
        sb.append(this.f5579l);
        sb.append(", previewHandler=");
        sb.append(this.f5580m);
        sb.append(", contentDescription=");
        return s1.a(sb, this.f5581n, ')');
    }
}
