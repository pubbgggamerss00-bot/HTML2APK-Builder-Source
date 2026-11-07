package m0;

import m0.k;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public abstract class k<T extends k<T>> {

    /* renamed from: a, reason: collision with root package name */
    public final t2.b f17378a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17379b;

    /* renamed from: c, reason: collision with root package name */
    public final t2.h0 f17380c;

    /* renamed from: d, reason: collision with root package name */
    public final y2.v f17381d;

    /* renamed from: e, reason: collision with root package name */
    public final p3 f17382e;

    /* renamed from: f, reason: collision with root package name */
    public long f17383f;

    /* renamed from: g, reason: collision with root package name */
    public final t2.b f17384g;

    public k(t2.b bVar, long j10, t2.h0 h0Var, y2.v vVar, p3 p3Var) {
        this.f17378a = bVar;
        this.f17379b = j10;
        this.f17380c = h0Var;
        this.f17381d = vVar;
        this.f17382e = p3Var;
        this.f17383f = j10;
        this.f17384g = bVar;
    }

    public final Integer a() {
        t2.h0 h0Var = this.f17380c;
        if (h0Var == null) {
            return null;
        }
        t2.l lVar = h0Var.f27820b;
        int iD = t2.j0.d(this.f17383f);
        y2.v vVar = this.f17381d;
        return Integer.valueOf(vVar.a(lVar.c(lVar.d(vVar.b(iD)), true)));
    }

    public final Integer b() {
        t2.h0 h0Var = this.f17380c;
        if (h0Var == null) {
            return null;
        }
        int iE = t2.j0.e(this.f17383f);
        y2.v vVar = this.f17381d;
        return Integer.valueOf(vVar.a(h0Var.g(h0Var.f27820b.d(vVar.b(iE)))));
    }

    public final Integer c() {
        int length;
        t2.h0 h0Var = this.f17380c;
        if (h0Var == null) {
            return null;
        }
        int iM = m();
        while (true) {
            t2.b bVar = this.f17378a;
            if (iM < bVar.f27761b.length()) {
                int length2 = this.f17384g.f27761b.length() - 1;
                if (iM <= length2) {
                    length2 = iM;
                }
                long j10 = h0Var.j(length2);
                int i10 = t2.j0.f27838c;
                int i11 = (int) (j10 & BodyPartID.bodyIdMax);
                if (i11 > iM) {
                    length = this.f17381d.a(i11);
                    break;
                }
                iM++;
            } else {
                length = bVar.f27761b.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer d() {
        int iA;
        t2.h0 h0Var = this.f17380c;
        if (h0Var == null) {
            return null;
        }
        int iM = m();
        while (true) {
            if (iM <= 0) {
                iA = 0;
                break;
            }
            int length = this.f17384g.f27761b.length() - 1;
            if (iM <= length) {
                length = iM;
            }
            long j10 = h0Var.j(length);
            int i10 = t2.j0.f27838c;
            int i11 = (int) (j10 >> 32);
            if (i11 < iM) {
                iA = this.f17381d.a(i11);
                break;
            }
            iM--;
        }
        return Integer.valueOf(iA);
    }

    public final boolean e() {
        t2.h0 h0Var = this.f17380c;
        return (h0Var != null ? h0Var.h(m()) : null) != e3.g.f8361b;
    }

    public final int f(t2.h0 h0Var, int i10) {
        int iM = m();
        p3 p3Var = this.f17382e;
        if (p3Var.f17457a == null) {
            p3Var.f17457a = Float.valueOf(h0Var.c(iM).f21131a);
        }
        t2.l lVar = h0Var.f27820b;
        int iD = lVar.d(iM) + i10;
        if (iD < 0) {
            return 0;
        }
        if (iD >= lVar.f27848f) {
            return this.f17384g.f27761b.length();
        }
        float fB = lVar.b(iD) - 1;
        Float f10 = p3Var.f17457a;
        kotlin.jvm.internal.r.b(f10);
        float fFloatValue = f10.floatValue();
        if ((e() && fFloatValue >= h0Var.f(iD)) || (!e() && fFloatValue <= h0Var.e(iD))) {
            return lVar.c(iD, true);
        }
        return this.f17381d.a(lVar.g((Float.floatToRawIntBits(fB) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f10.floatValue()) << 32)));
    }

    public final void g() {
        this.f17382e.f17457a = null;
        t2.b bVar = this.f17384g;
        String str = bVar.f27761b;
        String str2 = bVar.f27761b;
        if (str.length() > 0) {
            int iG = i0.u2.g(str2, t2.j0.d(this.f17383f));
            if (iG == t2.j0.d(this.f17383f) && iG != str2.length()) {
                iG = i0.u2.g(str2, iG + 1);
            }
            l(iG, iG);
        }
    }

    public final void h() {
        this.f17382e.f17457a = null;
        t2.b bVar = this.f17384g;
        String str = bVar.f27761b;
        String str2 = bVar.f27761b;
        if (str.length() > 0) {
            int iH = i0.u2.h(str2, t2.j0.e(this.f17383f));
            if (iH == t2.j0.e(this.f17383f) && iH != 0) {
                iH = i0.u2.h(str2, iH - 1);
            }
            l(iH, iH);
        }
    }

    public final void i() {
        Integer numA;
        this.f17382e.f17457a = null;
        if (this.f17384g.f27761b.length() <= 0 || (numA = a()) == null) {
            return;
        }
        int iIntValue = numA.intValue();
        l(iIntValue, iIntValue);
    }

    public final void j() {
        Integer numB;
        this.f17382e.f17457a = null;
        if (this.f17384g.f27761b.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        l(iIntValue, iIntValue);
    }

    public final void k() {
        if (this.f17384g.f27761b.length() > 0) {
            int i10 = t2.j0.f27838c;
            this.f17383f = t2.k0.a((int) (this.f17379b >> 32), (int) (this.f17383f & BodyPartID.bodyIdMax));
        }
    }

    public final void l(int i10, int i11) {
        this.f17383f = t2.k0.a(i10, i11);
    }

    public final int m() {
        long j10 = this.f17383f;
        int i10 = t2.j0.f27838c;
        return this.f17381d.b((int) (j10 & BodyPartID.bodyIdMax));
    }
}
