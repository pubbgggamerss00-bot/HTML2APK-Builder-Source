package m0;

import m0.e0;
import m0.z;

/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements e0 {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    @Override // m0.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final z a(i1 i1Var) {
        z.a aVarB;
        z.a aVarB2;
        boolean z10;
        z zVarC = i1Var.c();
        if (zVarC == null) {
            return h0.a(i1Var, e0.a.b.f17307a);
        }
        z.a aVar = zVarC.f17594b;
        z.a aVar2 = zVarC.f17593a;
        if (i1Var.a()) {
            aVarB2 = h0.b(i1Var, i1Var.k(), aVar2);
            aVarB = aVar;
            aVar = aVar2;
            aVar2 = aVarB2;
        } else {
            aVarB = h0.b(i1Var, i1Var.h(), aVar);
            aVarB2 = aVarB;
        }
        if (kotlin.jvm.internal.r.a(aVarB2, aVar)) {
            return zVarC;
        }
        z zVar = new z(aVar2, aVarB, i1Var.i() == n.f17423a || (i1Var.i() == n.f17425c && aVar2.f17597b > aVarB.f17597b));
        boolean z11 = false;
        z.a aVar3 = zVar.f17593a;
        long j10 = aVar3.f17598c;
        z.a aVar4 = zVar.f17594b;
        if (j10 == aVar4.f17598c) {
            z10 = aVar3.f17597b == aVar4.f17597b;
        } else {
            boolean z12 = zVar.f17595c;
            if ((z12 ? aVar3 : aVar4).f17597b == 0) {
                if (z12) {
                    aVar3 = aVar4;
                }
                if (i1Var.e().f17579f.f27819a.f27809a.f27761b.length() == aVar3.f17597b) {
                    kotlin.jvm.internal.b0 b0Var = new kotlin.jvm.internal.b0();
                    b0Var.f16318a = true;
                    i1Var.d(new k1(b0Var, 0));
                    z10 = b0Var.f16318a;
                }
            }
        }
        if (!z10) {
            return zVar;
        }
        String str = i1Var.b().f17579f.f27819a.f27809a.f27761b;
        if (i1Var.getSize() > 1 || i1Var.c() == null) {
            return zVar;
        }
        if (str.length() == 0) {
            return zVar;
        }
        y yVarB = i1Var.b();
        String str2 = yVarB.f17579f.f27819a.f27809a.f27761b;
        int i10 = yVarB.f17576c;
        int length = str2.length();
        if (i10 == 0) {
            int iA = i0.v2.a(0, str2);
            return i1Var.a() ? z.a(zVar, h0.d(zVar.f17593a, yVarB, iA), null, true, 2) : z.a(zVar, null, h0.d(zVar.f17594b, yVarB, iA), false, 1);
        }
        if (i10 == length) {
            int iB = i0.v2.b(length, str2);
            return i1Var.a() ? z.a(zVar, h0.d(zVar.f17593a, yVarB, iB), null, false, 2) : z.a(zVar, null, h0.d(zVar.f17594b, yVarB, iB), true, 1);
        }
        z zVarC2 = i1Var.c();
        if (zVarC2 != null && zVarC2.f17595c) {
            z11 = true;
        }
        int iB2 = i1Var.a() ^ z11 ? i0.v2.b(i10, str2) : i0.v2.a(i10, str2);
        return i1Var.a() ? z.a(zVar, h0.d(zVar.f17593a, yVarB, iB2), null, z11, 2) : z.a(zVar, null, h0.d(zVar.f17594b, yVarB, iB2), z11, 1);
    }
}
