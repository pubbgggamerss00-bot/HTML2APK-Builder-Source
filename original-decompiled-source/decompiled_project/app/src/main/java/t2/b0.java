package t2;

import e3.l;
import q1.b1;
import q1.e2;
import q1.u0;
import t2.b;

/* loaded from: classes.dex */
public final class b0 implements b.a {

    /* renamed from: a, reason: collision with root package name */
    public final e3.l f27775a;

    /* renamed from: b, reason: collision with root package name */
    public final long f27776b;

    /* renamed from: c, reason: collision with root package name */
    public final x2.p f27777c;

    /* renamed from: d, reason: collision with root package name */
    public final x2.n f27778d;

    /* renamed from: e, reason: collision with root package name */
    public final x2.o f27779e;

    /* renamed from: f, reason: collision with root package name */
    public final x2.f f27780f;

    /* renamed from: g, reason: collision with root package name */
    public final String f27781g;

    /* renamed from: h, reason: collision with root package name */
    public final long f27782h;

    /* renamed from: i, reason: collision with root package name */
    public final e3.a f27783i;

    /* renamed from: j, reason: collision with root package name */
    public final e3.m f27784j;

    /* renamed from: k, reason: collision with root package name */
    public final a3.c f27785k;

    /* renamed from: l, reason: collision with root package name */
    public final long f27786l;

    /* renamed from: m, reason: collision with root package name */
    public final e3.i f27787m;

    /* renamed from: n, reason: collision with root package name */
    public final e2 f27788n;

    /* renamed from: o, reason: collision with root package name */
    public final w f27789o;

    /* renamed from: p, reason: collision with root package name */
    public final s1.f f27790p;

    public b0(long j10, long j11, x2.p pVar, x2.n nVar, x2.o oVar, x2.f fVar, String str, long j12, e3.a aVar, e3.m mVar, a3.c cVar, long j13, e3.i iVar, e2 e2Var, w wVar) {
        this(j10 != 16 ? new e3.c(j10) : l.a.f8369a, j11, pVar, nVar, oVar, fVar, str, j12, aVar, mVar, cVar, j13, iVar, e2Var, wVar, null);
    }

    public final boolean a(b0 b0Var) {
        if (this == b0Var) {
            return true;
        }
        return f3.t.a(this.f27776b, b0Var.f27776b) && kotlin.jvm.internal.r.a(this.f27777c, b0Var.f27777c) && kotlin.jvm.internal.r.a(this.f27778d, b0Var.f27778d) && kotlin.jvm.internal.r.a(this.f27779e, b0Var.f27779e) && kotlin.jvm.internal.r.a(this.f27780f, b0Var.f27780f) && kotlin.jvm.internal.r.a(this.f27781g, b0Var.f27781g) && f3.t.a(this.f27782h, b0Var.f27782h) && kotlin.jvm.internal.r.a(this.f27783i, b0Var.f27783i) && kotlin.jvm.internal.r.a(this.f27784j, b0Var.f27784j) && kotlin.jvm.internal.r.a(this.f27785k, b0Var.f27785k) && b1.d(this.f27786l, b0Var.f27786l) && kotlin.jvm.internal.r.a(this.f27789o, b0Var.f27789o);
    }

    public final boolean b(b0 b0Var) {
        return kotlin.jvm.internal.r.a(this.f27775a, b0Var.f27775a) && kotlin.jvm.internal.r.a(this.f27787m, b0Var.f27787m) && kotlin.jvm.internal.r.a(this.f27788n, b0Var.f27788n) && kotlin.jvm.internal.r.a(this.f27790p, b0Var.f27790p);
    }

    public final b0 c(b0 b0Var) {
        if (b0Var == null) {
            return this;
        }
        e3.l lVar = b0Var.f27775a;
        return d0.a(this, lVar.j(), lVar.l(), lVar.i(), b0Var.f27776b, b0Var.f27777c, b0Var.f27778d, b0Var.f27779e, b0Var.f27780f, b0Var.f27781g, b0Var.f27782h, b0Var.f27783i, b0Var.f27784j, b0Var.f27785k, b0Var.f27786l, b0Var.f27787m, b0Var.f27788n, b0Var.f27789o, b0Var.f27790p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return a(b0Var) && b(b0Var);
    }

    public final int hashCode() {
        e3.l lVar = this.f27775a;
        long j10 = lVar.j();
        int i10 = b1.f21655i;
        int iHashCode = Long.hashCode(j10) * 31;
        u0 u0VarL = lVar.l();
        int iHashCode2 = (Float.hashCode(lVar.i()) + ((iHashCode + (u0VarL != null ? u0VarL.hashCode() : 0)) * 31)) * 31;
        f3.v[] vVarArr = f3.t.f8832b;
        int iA = r.e2.a(iHashCode2, 31, this.f27776b);
        x2.p pVar = this.f27777c;
        int i11 = (iA + (pVar != null ? pVar.f32037a : 0)) * 31;
        x2.n nVar = this.f27778d;
        int iHashCode3 = (i11 + (nVar != null ? Integer.hashCode(nVar.f32027a) : 0)) * 31;
        x2.o oVar = this.f27779e;
        int iHashCode4 = (iHashCode3 + (oVar != null ? Integer.hashCode(oVar.f32028a) : 0)) * 31;
        x2.f fVar = this.f27780f;
        int iHashCode5 = (iHashCode4 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        String str = this.f27781g;
        int iA2 = r.e2.a((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f27782h);
        e3.a aVar = this.f27783i;
        int iHashCode6 = (iA2 + (aVar != null ? Float.hashCode(aVar.f8345a) : 0)) * 31;
        e3.m mVar = this.f27784j;
        int iHashCode7 = (iHashCode6 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        a3.c cVar = this.f27785k;
        int iA3 = r.e2.a((iHashCode7 + (cVar != null ? cVar.f25a.hashCode() : 0)) * 31, 31, this.f27786l);
        e3.i iVar = this.f27787m;
        int i12 = (iA3 + (iVar != null ? iVar.f8367a : 0)) * 31;
        e2 e2Var = this.f27788n;
        int iHashCode8 = (i12 + (e2Var != null ? e2Var.hashCode() : 0)) * 31;
        w wVar = this.f27789o;
        int iHashCode9 = (iHashCode8 + (wVar != null ? wVar.hashCode() : 0)) * 31;
        s1.f fVar2 = this.f27790p;
        return iHashCode9 + (fVar2 != null ? fVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        e3.l lVar = this.f27775a;
        sb.append((Object) b1.j(lVar.j()));
        sb.append(", brush=");
        sb.append(lVar.l());
        sb.append(", alpha=");
        sb.append(lVar.i());
        sb.append(", fontSize=");
        sb.append((Object) f3.t.d(this.f27776b));
        sb.append(", fontWeight=");
        sb.append(this.f27777c);
        sb.append(", fontStyle=");
        sb.append(this.f27778d);
        sb.append(", fontSynthesis=");
        sb.append(this.f27779e);
        sb.append(", fontFamily=");
        sb.append(this.f27780f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.f27781g);
        sb.append(", letterSpacing=");
        sb.append((Object) f3.t.d(this.f27782h));
        sb.append(", baselineShift=");
        sb.append(this.f27783i);
        sb.append(", textGeometricTransform=");
        sb.append(this.f27784j);
        sb.append(", localeList=");
        sb.append(this.f27785k);
        sb.append(", background=");
        ad.f.c(this.f27786l, ", textDecoration=", sb);
        sb.append(this.f27787m);
        sb.append(", shadow=");
        sb.append(this.f27788n);
        sb.append(", platformStyle=");
        sb.append(this.f27789o);
        sb.append(", drawStyle=");
        sb.append(this.f27790p);
        sb.append(')');
        return sb.toString();
    }

    public b0(e3.l lVar, long j10, x2.p pVar, x2.n nVar, x2.o oVar, x2.f fVar, String str, long j11, e3.a aVar, e3.m mVar, a3.c cVar, long j12, e3.i iVar, e2 e2Var, w wVar, s1.f fVar2) {
        this.f27775a = lVar;
        this.f27776b = j10;
        this.f27777c = pVar;
        this.f27778d = nVar;
        this.f27779e = oVar;
        this.f27780f = fVar;
        this.f27781g = str;
        this.f27782h = j11;
        this.f27783i = aVar;
        this.f27784j = mVar;
        this.f27785k = cVar;
        this.f27786l = j12;
        this.f27787m = iVar;
        this.f27788n = e2Var;
        this.f27789o = wVar;
        this.f27790p = fVar2;
    }

    public b0(long j10, long j11, x2.p pVar, x2.n nVar, x2.o oVar, x2.f fVar, String str, long j12, e3.a aVar, e3.m mVar, a3.c cVar, long j13, e3.i iVar, e2 e2Var, int i10) {
        this((i10 & 1) != 0 ? b1.f21654h : j10, (i10 & 2) != 0 ? f3.t.f8833c : j11, (i10 & 4) != 0 ? null : pVar, (i10 & 8) != 0 ? null : nVar, (i10 & 16) != 0 ? null : oVar, (i10 & 32) != 0 ? null : fVar, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? f3.t.f8833c : j12, (i10 & 256) != 0 ? null : aVar, (i10 & 512) != 0 ? null : mVar, (i10 & 1024) != 0 ? null : cVar, (i10 & 2048) != 0 ? b1.f21654h : j13, (i10 & 4096) != 0 ? null : iVar, (i10 & 8192) != 0 ? null : e2Var, (w) null);
    }
}
