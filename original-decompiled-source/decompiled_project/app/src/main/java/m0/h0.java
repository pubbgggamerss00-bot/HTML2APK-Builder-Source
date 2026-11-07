package m0;

import m0.z;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class h0 {
    public static final z a(i1 i1Var, l lVar) {
        boolean z10 = i1Var.i() == n.f17423a;
        return new z(c(i1Var.k(), z10, true, i1Var.l(), lVar), c(i1Var.h(), z10, false, i1Var.g(), lVar), z10);
    }

    public static final z.a b(i1 i1Var, y yVar, z.a aVar) {
        int i10 = i1Var.a() ? yVar.f17576c : yVar.f17577d;
        int iL = i1Var.a() ? i1Var.l() : i1Var.g();
        int i11 = yVar.f17575b;
        t2.h0 h0Var = yVar.f17579f;
        int i12 = yVar.f17578e;
        if (iL != i11) {
            return yVar.a(i10);
        }
        pg.k kVar = pg.k.f21467b;
        pg.j jVarA = e9.w0.a(kVar, new g0(yVar, i10));
        pg.j jVarA2 = e9.w0.a(kVar, new f0(yVar, i10, i1Var.a() ? yVar.f17577d : yVar.f17576c, i1Var, jVarA));
        if (yVar.f17574a != aVar.f17598c) {
            return (z.a) jVarA2.getValue();
        }
        if (i10 == i12) {
            return aVar;
        }
        if (((Number) jVarA.getValue()).intValue() != h0Var.f27820b.d(i12)) {
            return (z.a) jVarA2.getValue();
        }
        int i13 = aVar.f17597b;
        long j10 = h0Var.j(i13);
        boolean zA = i1Var.a();
        if (i12 != -1) {
            if (i10 != i12) {
                if (!(zA ^ (yVar.b() == n.f17423a))) {
                }
            }
            return yVar.a(i10);
        }
        int i14 = t2.j0.f27838c;
        return (i13 == ((int) (j10 >> 32)) || i13 == ((int) (j10 & BodyPartID.bodyIdMax))) ? (z.a) jVarA2.getValue() : yVar.a(i10);
    }

    public static final z.a c(y yVar, boolean z10, boolean z11, int i10, l lVar) {
        long j10;
        int i11 = z11 ? yVar.f17576c : yVar.f17577d;
        if (i10 != yVar.f17575b) {
            return yVar.a(i11);
        }
        long jA = lVar.a(yVar, i11);
        if (z10 ^ z11) {
            int i12 = t2.j0.f27838c;
            j10 = jA >> 32;
        } else {
            int i13 = t2.j0.f27838c;
            j10 = BodyPartID.bodyIdMax & jA;
        }
        return yVar.a((int) j10);
    }

    public static final z.a d(z.a aVar, y yVar, int i10) {
        return new z.a(yVar.f17579f.a(i10), i10, aVar.f17598c);
    }
}
