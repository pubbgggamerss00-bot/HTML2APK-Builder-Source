package z;

import com.yalantis.ucrop.view.CropImageView;
import f3.b;
import j1.d;
import java.util.List;
import z.b;

/* loaded from: classes.dex */
public final class m1 implements g2.l0, i1 {

    /* renamed from: a, reason: collision with root package name */
    public final b.e f34596a;

    /* renamed from: b, reason: collision with root package name */
    public final d.c f34597b;

    public m1(b.e eVar, d.c cVar) {
        this.f34596a = eVar;
        this.f34597b = cVar;
    }

    @Override // z.i1
    public final g2.m0 a(g2.g1[] g1VarArr, g2.o0 o0Var, int[] iArr, int i10, int i11, int[] iArr2, int i12, int i13, int i14) {
        return o0Var.i0(i10, i11, qg.a0.f22708a, new l1(g1VarArr, this, i11, iArr));
    }

    @Override // z.i1
    public final int b(g2.g1 g1Var) {
        return g1Var.f11383b;
    }

    @Override // g2.l0
    public final int c(g2.q qVar, List<? extends g2.p> list, int i10) {
        int iB1 = qVar.b1(this.f34596a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i11 = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            g2.p pVar = list.get(i12);
            float fD = b8.n.d(b8.n.c(pVar));
            int iO = pVar.O(i10);
            if (fD == CropImageView.DEFAULT_ASPECT_RATIO) {
                i11 += iO;
            } else if (fD > CropImageView.DEFAULT_ASPECT_RATIO) {
                f10 += fD;
                iMax = Math.max(iMax, Math.round(iO / fD));
            }
        }
        return ((list.size() - 1) * iB1) + Math.round(iMax * f10) + i11;
    }

    @Override // z.i1
    public final void d(int i10, int[] iArr, int[] iArr2, g2.o0 o0Var) {
        this.f34596a.b(o0Var, i10, iArr, o0Var.getLayoutDirection(), iArr2);
    }

    @Override // z.i1
    public final long e(int i10, int i11, int i12, boolean z10) {
        m1 m1Var = k1.f34578a;
        return !z10 ? f3.c.a(i10, i11, 0, i12) : b.a.b(i10, i11, 0, i12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return kotlin.jvm.internal.r.a(this.f34596a, m1Var.f34596a) && kotlin.jvm.internal.r.a(this.f34597b, m1Var.f34597b);
    }

    @Override // g2.l0
    public final int f(g2.q qVar, List<? extends g2.p> list, int i10) {
        int iB1 = qVar.b1(this.f34596a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i11 = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            g2.p pVar = list.get(i12);
            float fD = b8.n.d(b8.n.c(pVar));
            int iJ = pVar.J(i10);
            if (fD == CropImageView.DEFAULT_ASPECT_RATIO) {
                i11 += iJ;
            } else if (fD > CropImageView.DEFAULT_ASPECT_RATIO) {
                f10 += fD;
                iMax = Math.max(iMax, Math.round(iJ / fD));
            }
        }
        return ((list.size() - 1) * iB1) + Math.round(iMax * f10) + i11;
    }

    @Override // g2.l0
    public final int g(g2.q qVar, List<? extends g2.p> list, int i10) {
        int iB1 = qVar.b1(this.f34596a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iB1, i10);
        int size = list.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            g2.p pVar = list.get(i11);
            float fD = b8.n.d(b8.n.c(pVar));
            if (fD == CropImageView.DEFAULT_ASPECT_RATIO) {
                int iMin2 = Math.min(pVar.O(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, pVar.b0(iMin2));
            } else if (fD > CropImageView.DEFAULT_ASPECT_RATIO) {
                f10 += fD;
            }
        }
        int iRound = f10 == CropImageView.DEFAULT_ASPECT_RATIO ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            g2.p pVar2 = list.get(i12);
            float fD2 = b8.n.d(b8.n.c(pVar2));
            if (fD2 > CropImageView.DEFAULT_ASPECT_RATIO) {
                iMax = Math.max(iMax, pVar2.b0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fD2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // g2.l0
    public final g2.m0 h(g2.o0 o0Var, List<? extends g2.k0> list, long j10) {
        return com.google.crypto.tink.shaded.protobuf.l1.b(this, f3.b.k(j10), f3.b.j(j10), f3.b.i(j10), f3.b.h(j10), o0Var.b1(this.f34596a.a()), o0Var, list, new g2.g1[list.size()], 0, list.size(), null, 0);
    }

    public final int hashCode() {
        return this.f34597b.hashCode() + (this.f34596a.hashCode() * 31);
    }

    @Override // g2.l0
    public final int i(g2.q qVar, List<? extends g2.p> list, int i10) {
        int iB1 = qVar.b1(this.f34596a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iB1, i10);
        int size = list.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            g2.p pVar = list.get(i11);
            float fD = b8.n.d(b8.n.c(pVar));
            if (fD == CropImageView.DEFAULT_ASPECT_RATIO) {
                int iMin2 = Math.min(pVar.O(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, pVar.z(iMin2));
            } else if (fD > CropImageView.DEFAULT_ASPECT_RATIO) {
                f10 += fD;
            }
        }
        int iRound = f10 == CropImageView.DEFAULT_ASPECT_RATIO ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            g2.p pVar2 = list.get(i12);
            float fD2 = b8.n.d(b8.n.c(pVar2));
            if (fD2 > CropImageView.DEFAULT_ASPECT_RATIO) {
                iMax = Math.max(iMax, pVar2.z(iRound != Integer.MAX_VALUE ? Math.round(iRound * fD2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // z.i1
    public final int j(g2.g1 g1Var) {
        return g1Var.f11382a;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f34596a + ", verticalAlignment=" + this.f34597b + ')';
    }
}
