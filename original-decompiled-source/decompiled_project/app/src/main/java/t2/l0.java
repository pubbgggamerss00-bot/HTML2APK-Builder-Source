package t2;

import e3.l;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import q1.b1;
import q1.e2;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: d, reason: collision with root package name */
    public static final l0 f27851d = new l0(0, 0, null, null, 0, 0, 0, 16777215);

    /* renamed from: a, reason: collision with root package name */
    public final b0 f27852a;

    /* renamed from: b, reason: collision with root package name */
    public final s f27853b;

    /* renamed from: c, reason: collision with root package name */
    public final x f27854c;

    public l0(b0 b0Var, s sVar, x xVar) {
        this.f27852a = b0Var;
        this.f27853b = sVar;
        this.f27854c = xVar;
    }

    public static l0 a(l0 l0Var, long j10, long j11, x2.p pVar, x2.f fVar, long j12, long j13, x xVar, e3.f fVar2, int i10) {
        long j14 = (i10 & 1) != 0 ? l0Var.f27852a.f27775a.j() : j10;
        long j15 = (i10 & 2) != 0 ? l0Var.f27852a.f27776b : j11;
        x2.p pVar2 = (i10 & 4) != 0 ? l0Var.f27852a.f27777c : pVar;
        b0 b0Var = l0Var.f27852a;
        x2.n nVar = b0Var.f27778d;
        x2.o oVar = b0Var.f27779e;
        x2.f fVar3 = (i10 & 32) != 0 ? b0Var.f27780f : fVar;
        String str = b0Var.f27781g;
        long j16 = (i10 & 128) != 0 ? b0Var.f27782h : j12;
        e3.a aVar = b0Var.f27783i;
        e3.m mVar = b0Var.f27784j;
        a3.c cVar = b0Var.f27785k;
        long j17 = b0Var.f27786l;
        e3.i iVar = (i10 & 4096) != 0 ? b0Var.f27787m : e3.i.f8366d;
        e2 e2Var = b0Var.f27788n;
        s1.f fVar4 = b0Var.f27790p;
        int i11 = (i10 & 32768) != 0 ? l0Var.f27853b.f27875a : 3;
        s sVar = l0Var.f27853b;
        int i12 = sVar.f27876b;
        long j18 = (i10 & 131072) != 0 ? sVar.f27877c : j13;
        e3.n nVar2 = sVar.f27878d;
        x xVar2 = (i10 & PKIFailureInfo.signerNotTrusted) != 0 ? l0Var.f27854c : xVar;
        return new l0(new b0(b1.d(j14, b0Var.f27775a.j()) ? b0Var.f27775a : j14 != 16 ? new e3.c(j14) : l.a.f8369a, j15, pVar2, nVar, oVar, fVar3, str, j16, aVar, mVar, cVar, j17, iVar, e2Var, xVar2 != null ? xVar2.f27889a : null, fVar4), new s(i11, i12, j18, nVar2, xVar2 != null ? xVar2.f27890b : null, (i10 & PKIFailureInfo.badCertTemplate) != 0 ? sVar.f27880f : fVar2, sVar.f27881g, sVar.f27882h, sVar.f27883i), xVar2);
    }

    public static l0 e(l0 l0Var, long j10, long j11, x2.p pVar, x2.f fVar, long j12, int i10, long j13, int i11) {
        long j14 = (i11 & 2) != 0 ? f3.t.f8833c : j11;
        x2.p pVar2 = (i11 & 4) != 0 ? null : pVar;
        x2.f fVar2 = (i11 & 32) != 0 ? null : fVar;
        long j15 = (i11 & 128) != 0 ? f3.t.f8833c : j12;
        long j16 = b1.f21654h;
        int i12 = (32768 & i11) != 0 ? PKIFailureInfo.systemUnavail : i10;
        long j17 = (i11 & 131072) != 0 ? f3.t.f8833c : j13;
        b0 b0VarA = d0.a(l0Var.f27852a, j10, null, Float.NaN, j14, pVar2, null, null, fVar2, null, j15, null, null, null, j16, null, null, null, null);
        s sVarA = t.a(l0Var.f27853b, i12, PKIFailureInfo.systemUnavail, j17, null, null, null, 0, PKIFailureInfo.systemUnavail, null);
        return (l0Var.f27852a == b0VarA && l0Var.f27853b == sVarA) ? l0Var : new l0(b0VarA, sVarA);
    }

    public final long b() {
        return this.f27852a.f27775a.j();
    }

    public final boolean c(l0 l0Var) {
        if (this != l0Var) {
            return kotlin.jvm.internal.r.a(this.f27853b, l0Var.f27853b) && this.f27852a.a(l0Var.f27852a);
        }
        return true;
    }

    public final l0 d(l0 l0Var) {
        return (l0Var == null || l0Var.equals(f27851d)) ? this : new l0(this.f27852a.c(l0Var.f27852a), this.f27853b.a(l0Var.f27853b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return kotlin.jvm.internal.r.a(this.f27852a, l0Var.f27852a) && kotlin.jvm.internal.r.a(this.f27853b, l0Var.f27853b) && kotlin.jvm.internal.r.a(this.f27854c, l0Var.f27854c);
    }

    public final int hashCode() {
        int iHashCode = (this.f27853b.hashCode() + (this.f27852a.hashCode() * 31)) * 31;
        x xVar = this.f27854c;
        return iHashCode + (xVar != null ? xVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) b1.j(b()));
        sb.append(", brush=");
        b0 b0Var = this.f27852a;
        sb.append(b0Var.f27775a.l());
        sb.append(", alpha=");
        sb.append(b0Var.f27775a.i());
        sb.append(", fontSize=");
        sb.append((Object) f3.t.d(b0Var.f27776b));
        sb.append(", fontWeight=");
        sb.append(b0Var.f27777c);
        sb.append(", fontStyle=");
        sb.append(b0Var.f27778d);
        sb.append(", fontSynthesis=");
        sb.append(b0Var.f27779e);
        sb.append(", fontFamily=");
        sb.append(b0Var.f27780f);
        sb.append(", fontFeatureSettings=");
        sb.append(b0Var.f27781g);
        sb.append(", letterSpacing=");
        sb.append((Object) f3.t.d(b0Var.f27782h));
        sb.append(", baselineShift=");
        sb.append(b0Var.f27783i);
        sb.append(", textGeometricTransform=");
        sb.append(b0Var.f27784j);
        sb.append(", localeList=");
        sb.append(b0Var.f27785k);
        sb.append(", background=");
        ad.f.c(b0Var.f27786l, ", textDecoration=", sb);
        sb.append(b0Var.f27787m);
        sb.append(", shadow=");
        sb.append(b0Var.f27788n);
        sb.append(", drawStyle=");
        sb.append(b0Var.f27790p);
        sb.append(", textAlign=");
        s sVar = this.f27853b;
        sb.append((Object) e3.h.a(sVar.f27875a));
        sb.append(", textDirection=");
        sb.append((Object) e3.j.a(sVar.f27876b));
        sb.append(", lineHeight=");
        sb.append((Object) f3.t.d(sVar.f27877c));
        sb.append(", textIndent=");
        sb.append(sVar.f27878d);
        sb.append(", platformStyle=");
        sb.append(this.f27854c);
        sb.append(", lineHeightStyle=");
        sb.append(sVar.f27880f);
        sb.append(", lineBreak=");
        sb.append((Object) e3.e.a(sVar.f27881g));
        sb.append(", hyphens=");
        sb.append((Object) e3.d.a(sVar.f27882h));
        sb.append(", textMotion=");
        sb.append(sVar.f27883i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l0(b0 b0Var, s sVar) {
        w wVar = b0Var.f27789o;
        v vVar = sVar.f27879e;
        this(b0Var, sVar, (wVar == null && vVar == null) ? null : new x(wVar, vVar));
    }

    public l0(long j10, long j11, x2.p pVar, x2.f fVar, long j12, int i10, long j13, int i11) {
        this(new b0((i11 & 1) != 0 ? b1.f21654h : j10, (i11 & 2) != 0 ? f3.t.f8833c : j11, (i11 & 4) != 0 ? null : pVar, (x2.n) null, (x2.o) null, (i11 & 32) != 0 ? null : fVar, (String) null, (i11 & 128) != 0 ? f3.t.f8833c : j12, (e3.a) null, (e3.m) null, (a3.c) null, b1.f21654h, (e3.i) null, (e2) null, (w) null), new s((32768 & i11) != 0 ? PKIFailureInfo.systemUnavail : i10, PKIFailureInfo.systemUnavail, (i11 & 131072) != 0 ? f3.t.f8833c : j13, null, null, null, 0, PKIFailureInfo.systemUnavail, null), null);
    }
}
