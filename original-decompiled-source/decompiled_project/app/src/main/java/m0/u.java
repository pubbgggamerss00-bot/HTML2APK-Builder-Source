package m0;

import com.yalantis.ucrop.view.CropImageView;
import i0.k4;
import java.util.ArrayList;
import l0.g;
import m0.z;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class u implements x {

    /* renamed from: a, reason: collision with root package name */
    public final long f17522a;

    /* renamed from: b, reason: collision with root package name */
    public final g.a f17523b;

    /* renamed from: c, reason: collision with root package name */
    public final g.b f17524c;

    /* renamed from: e, reason: collision with root package name */
    public t2.h0 f17526e;

    /* renamed from: d, reason: collision with root package name */
    public final u f17525d = this;

    /* renamed from: f, reason: collision with root package name */
    public int f17527f = -1;

    public u(long j10, g.a aVar, g.b bVar) {
        this.f17522a = j10;
        this.f17523b = aVar;
        this.f17524c = bVar;
    }

    @Override // m0.x
    public final int a() {
        t2.h0 h0Var = (t2.h0) this.f17524c.invoke();
        if (h0Var == null) {
            return 0;
        }
        return m(h0Var);
    }

    @Override // m0.x
    public final float b(int i10) {
        t2.l lVar;
        int iD;
        t2.h0 h0Var = (t2.h0) this.f17524c.invoke();
        if (h0Var == null || (iD = (lVar = h0Var.f27820b).d(i10)) >= lVar.f27848f) {
            return -1.0f;
        }
        float f10 = lVar.f(iD);
        return ((lVar.b(iD) - f10) / 2) + f10;
    }

    @Override // m0.x
    public final void c(j1 j1Var) {
        t2.h0 h0Var;
        o oVar;
        o oVar2;
        j1 j1Var2;
        o oVarA;
        o oVar3;
        long j10;
        o oVar4;
        o oVarA2;
        long j11;
        o oVar5;
        int i10;
        int i11;
        z.a aVar;
        z.a aVar2;
        g2.v vVarI = i();
        if (vVarI == null || (h0Var = (t2.h0) this.f17524c.invoke()) == null) {
            return;
        }
        g2.v vVar = j1Var.f17366c;
        boolean z10 = j1Var.f17367d;
        long jL = vVar.L(vVarI, 0L);
        long jF = p1.c.f(j1Var.f17364a, jL);
        long j12 = j1Var.f17365b;
        long jF2 = (j12 & 9223372034707292159L) == 9205357640488583168L ? 9205357640488583168L : p1.c.f(j12, jL);
        long j13 = h0Var.f27821c;
        float f10 = (int) (j13 >> 32);
        float f11 = (int) (j13 & BodyPartID.bodyIdMax);
        int i12 = (int) (jF >> 32);
        o oVar6 = Float.intBitsToFloat(i12) < CropImageView.DEFAULT_ASPECT_RATIO ? o.f17433a : Float.intBitsToFloat(i12) > f10 ? o.f17435c : o.f17434b;
        int i13 = (int) (jF & BodyPartID.bodyIdMax);
        o oVar7 = Float.intBitsToFloat(i13) < CropImageView.DEFAULT_ASPECT_RATIO ? o.f17433a : Float.intBitsToFloat(i13) > f11 ? o.f17435c : o.f17434b;
        s1 s1Var = j1Var.f17369f;
        z zVar = j1Var.f17368e;
        long j14 = this.f17522a;
        if (z10) {
            o oVar8 = oVar6;
            oVar = oVar7;
            oVar2 = oVar8;
            j1Var2 = j1Var;
            oVar4 = oVar2;
            j10 = j14;
            oVarA2 = v.a(oVar2, oVar, j1Var, j14, zVar != null ? zVar.f17594b : null);
            oVar3 = oVarA2;
            j11 = 9205357640488583168L;
            oVarA = oVar;
            oVar5 = oVar3;
        } else {
            o oVar9 = oVar6;
            oVar = oVar7;
            oVar2 = oVar9;
            j1Var2 = j1Var;
            oVarA = v.a(oVar2, oVar, j1Var2, j14, zVar != null ? zVar.f17593a : null);
            oVar3 = oVar2;
            j10 = j14;
            oVar4 = oVarA;
            oVarA2 = oVar4;
            j11 = 9205357640488583168L;
            oVar5 = oVar;
        }
        o oVarB = l1.b(oVar2, oVar);
        if (oVarB == o.f17434b || oVarB != oVarA2) {
            int length = h0Var.f27819a.f27809a.f27761b.length();
            if (z10) {
                int iB = v.b(jF, h0Var);
                if (zVar == null || (aVar2 = zVar.f17594b) == null) {
                    length = iB;
                } else {
                    int iCompare = s1Var.compare(Long.valueOf(aVar2.f17598c), Long.valueOf(j10));
                    if (iCompare < 0) {
                        length = 0;
                    } else if (iCompare <= 0) {
                        length = aVar2.f17597b;
                    }
                }
                i11 = length;
                i10 = iB;
            } else {
                int iB2 = v.b(jF, h0Var);
                if (zVar == null || (aVar = zVar.f17593a) == null) {
                    length = iB2;
                } else {
                    int iCompare2 = s1Var.compare(Long.valueOf(aVar.f17598c), Long.valueOf(j10));
                    if (iCompare2 < 0) {
                        length = 0;
                    } else if (iCompare2 <= 0) {
                        length = aVar.f17597b;
                    }
                }
                i10 = length;
                i11 = iB2;
            }
            int iB3 = (jF2 & 9223372034707292159L) == j11 ? -1 : v.b(jF2, h0Var);
            int i14 = j1Var2.f17374k + 2;
            j1Var2.f17374k = i14;
            long j15 = j10;
            y yVar = new y(j15, i14, i10, i11, iB3, h0Var);
            j1Var.f17372i = j1Var.a(j1Var.f17372i, oVar4, oVarA);
            j1Var.f17373j = j1Var.a(j1Var.f17373j, oVar3, oVar5);
            p.a0 a0Var = j1Var.f17370g;
            ArrayList arrayList = j1Var.f17371h;
            a0Var.e(arrayList.size(), j15);
            arrayList.add(yVar);
        }
    }

    @Override // m0.x
    public final p1.e d(int i10) {
        int length;
        t2.h0 h0Var = (t2.h0) this.f17524c.invoke();
        return (h0Var != null && (length = h0Var.f27819a.f27809a.f27761b.length()) >= 1) ? h0Var.b(jh.j.m(i10, 0, length - 1)) : p1.e.f21130e;
    }

    @Override // m0.x
    public final long e() {
        return this.f17522a;
    }

    @Override // m0.x
    public final float f(int i10) {
        t2.l lVar;
        int iD;
        t2.h0 h0Var = (t2.h0) this.f17524c.invoke();
        if (h0Var != null && (iD = (lVar = h0Var.f27820b).d(i10)) < lVar.f27848f) {
            return h0Var.f(iD);
        }
        return -1.0f;
    }

    @Override // m0.x
    public final float g(int i10) {
        t2.h0 h0Var = (t2.h0) this.f17524c.invoke();
        return h0Var != null ? k4.a(h0Var, i10) : CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // m0.x
    public final t2.b getText() {
        t2.h0 h0Var = (t2.h0) this.f17524c.invoke();
        return h0Var == null ? new t2.b("") : h0Var.f27819a.f27809a;
    }

    @Override // m0.x
    public final z h() {
        t2.h0 h0Var = (t2.h0) this.f17524c.invoke();
        if (h0Var == null) {
            return null;
        }
        int length = h0Var.f27819a.f27809a.f27761b.length();
        e3.g gVarA = h0Var.a(0);
        long j10 = this.f17522a;
        return new z(new z.a(gVarA, 0, j10), new z.a(h0Var.a(Math.max(length - 1, 0)), length, j10), false);
    }

    @Override // m0.x
    public final g2.v i() {
        g2.v vVar = (g2.v) this.f17523b.invoke();
        if (vVar == null || !vVar.m()) {
            return null;
        }
        return vVar;
    }

    @Override // m0.x
    public final long j(int i10) {
        t2.h0 h0Var = (t2.h0) this.f17524c.invoke();
        if (h0Var == null) {
            return t2.j0.f27837b;
        }
        t2.l lVar = h0Var.f27820b;
        int iM = m(h0Var);
        if (iM < 1) {
            return t2.j0.f27837b;
        }
        int iD = lVar.d(jh.j.m(i10, 0, iM - 1));
        return t2.k0.a(h0Var.g(iD), lVar.c(iD, true));
    }

    @Override // m0.x
    public final long k(z zVar, boolean z10) {
        t2.h0 h0Var;
        z.a aVar = zVar.f17594b;
        z.a aVar2 = zVar.f17593a;
        long j10 = this.f17522a;
        if (z10 && aVar2.f17598c != j10) {
            return 9205357640488583168L;
        }
        if ((!z10 && aVar.f17598c != j10) || i() == null || (h0Var = (t2.h0) this.f17524c.invoke()) == null) {
            return 9205357640488583168L;
        }
        return androidx.lifecycle.u.b(h0Var, jh.j.m(z10 ? aVar2.f17597b : aVar.f17597b, 0, m(h0Var)), z10, zVar.f17595c);
    }

    @Override // m0.x
    public final float l(int i10) {
        t2.l lVar;
        int iD;
        t2.h0 h0Var = (t2.h0) this.f17524c.invoke();
        if (h0Var != null && (iD = (lVar = h0Var.f27820b).d(i10)) < lVar.f27848f) {
            return h0Var.e(iD);
        }
        return -1.0f;
    }

    public final int m(t2.h0 h0Var) {
        int i10;
        synchronized (this.f17525d) {
            try {
                if (this.f17526e != h0Var) {
                    t2.l lVar = h0Var.f27820b;
                    boolean z10 = lVar.f27845c;
                    int i11 = 0;
                    if (!(z10 || ((float) ((int) (h0Var.f27821c & BodyPartID.bodyIdMax))) < lVar.f27847e) || z10) {
                        i11 = lVar.f27848f - 1;
                    } else {
                        int iE = lVar.e((int) (h0Var.f27821c & BodyPartID.bodyIdMax));
                        int i12 = h0Var.f27820b.f27848f - 1;
                        if (iE > i12) {
                            iE = i12;
                        }
                        while (iE >= 0 && h0Var.f27820b.f(iE) >= ((int) (h0Var.f27821c & BodyPartID.bodyIdMax))) {
                            iE--;
                        }
                        if (iE >= 0) {
                            i11 = iE;
                        }
                    }
                    this.f17527f = h0Var.f27820b.c(i11, true);
                    this.f17526e = h0Var;
                }
                i10 = this.f17527f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }
}
