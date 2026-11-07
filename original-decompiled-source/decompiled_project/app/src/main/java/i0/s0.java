package i0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import x0.j;

/* loaded from: classes.dex */
public final class s0 {
    public static final void a(m0.r1 r1Var, f1.b bVar, x0.j jVar, int i10) {
        f1.b bVar2;
        x0.k kVarP = jVar.p(605522716);
        int i11 = (kVarP.l(r1Var) ? 4 : 2) | i10;
        if (kVarP.A(i11 & 1, (i11 & 19) != 18)) {
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = new u.p(0);
                kVarP.C(objG);
            }
            u.p pVar = (u.p) objG;
            Object objG2 = kVarP.g();
            if (objG2 == c0321a) {
                objG2 = new o0(pVar);
                kVarP.C(objG2);
            }
            bVar2 = bVar;
            u.f.b(pVar, (eh.a) objG2, new m0.d2(pVar, r1Var), null, false, null, bVar2, kVarP, 1572918, 56);
        } else {
            bVar2 = bVar;
            kVarP.v();
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new p0(r1Var, bVar2, i10);
        }
    }

    public static final void b(m0.x2 x2Var, f1.b bVar, x0.j jVar, int i10) {
        int i11;
        f1.b bVar2;
        x0.k kVarP = jVar.p(-1985516685);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.l(x2Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.l(bVar) ? 32 : 16;
        }
        if (kVarP.A(i11 & 1, (i11 & 19) != 18)) {
            Object objG = kVarP.g();
            Object obj = j.a.f31715a;
            if (objG == obj) {
                objG = new u.p(0);
                kVarP.C(objG);
            }
            u.p pVar = (u.p) objG;
            Object objG2 = kVarP.g();
            if (objG2 == obj) {
                x0.l0 l0Var = x0.o0.f31834a;
                Object w2Var = new x0.w2(kVarP.x());
                kVarP.C(w2Var);
                objG2 = w2Var;
            }
            ph.i0 i0Var = (ph.i0) objG2;
            Object objG3 = kVarP.g();
            if (objG3 == obj) {
                objG3 = bg.b.h(new t2(0));
                kVarP.C(objG3);
            }
            x0.n1 n1Var = (x0.n1) objG3;
            Object objG4 = kVarP.g();
            if (objG4 == obj) {
                objG4 = new k0(pVar);
                kVarP.C(objG4);
            }
            eh.a aVar = (eh.a) objG4;
            m0.j3 j3Var = new m0.j3(n1Var, pVar, x2Var);
            boolean zI = x2Var.i();
            boolean zL = kVarP.l(i0Var) | kVarP.l(x2Var);
            Object objG5 = kVarP.g();
            if (zL || objG5 == obj) {
                objG5 = new m0(i0Var, n1Var, x2Var);
                kVarP.C(objG5);
            }
            bVar2 = bVar;
            u.f.b(pVar, aVar, j3Var, null, zI, (eh.a) objG5, bVar2, kVarP, ((i11 << 15) & 3670016) | 54, 8);
        } else {
            bVar2 = bVar;
            kVarP.v();
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new n0(x2Var, bVar2, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088 A[PHI: r0 r7 r8
      0x0088: PHI (r0v8 int) = (r0v3 int), (r0v10 int) binds: [B:32:0x0087, B:30:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x0088: PHI (r7v3 m0.x2) = (r7v0 m0.x2), (r7v14 m0.x2) binds: [B:32:0x0087, B:30:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x0088: PHI (r8v8 int) = (r8v5 int), (r8v21 int) binds: [B:32:0x0087, B:30:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(m0.x2 x2Var, vg.c cVar) {
        r0 r0Var;
        int i10;
        int i11;
        int i12;
        m0.x2 x2Var2;
        int i13;
        ?? r12;
        if (cVar instanceof r0) {
            r0Var = (r0) cVar;
            int i14 = r0Var.f13538e;
            if ((i14 & PKIFailureInfo.systemUnavail) != 0) {
                r0Var.f13538e = i14 - PKIFailureInfo.systemUnavail;
            } else {
                r0Var = new r0(cVar);
            }
        }
        Object obj = r0Var.f13537d;
        ug.a aVar = ug.a.f29706a;
        int i15 = r0Var.f13538e;
        if (i15 == 0) {
            pg.q.b(obj);
            y2.q0 q0Var = x2Var.f17552f;
            i10 = !t2.j0.b(x2Var.k().f33683b) ? 1 : 0;
            if (!x2Var.h()) {
                i11 = i10;
                if (i10 == 0) {
                }
                if (t2.j0.c(x2Var.k().f33683b) == x2Var.k().f33682a.f27761b.length()) {
                }
                if (x2Var.h()) {
                }
                return new t2(( == false ? 2 : 0) | i11 | ((i10 == 0 && x2Var.h()) == false ? 4 : 0) | ((t2.j0.c(x2Var.k().f33683b) == x2Var.k().f33682a.f27761b.length()) == false ? 8 : 0) | (!x2Var.h() && t2.j0.b(x2Var.k().f33683b) ? 16 : 0));
            }
            j2.f2 f2Var = x2Var.f17554h;
            if (f2Var == null) {
                i11 = i10;
                r12 = false;
                ?? r13 = r12 != false;
                return new t2((r13 == false ? 2 : 0) | i11 | ((i10 == 0 && x2Var.h()) == false ? 4 : 0) | ((t2.j0.c(x2Var.k().f33683b) == x2Var.k().f33682a.f27761b.length()) == false ? 8 : 0) | (!x2Var.h() && t2.j0.b(x2Var.k().f33683b) ? 16 : 0));
            }
            r0Var.f13534a = x2Var;
            r0Var.f13535b = i10;
            r0Var.f13536c = i10;
            r0Var.f13538e = 1;
            j2.e2 e2VarB = f2Var.b();
            if (e2VarB == aVar) {
                return aVar;
            }
            i12 = i10;
            obj = e2VarB;
            x2Var2 = x2Var;
            i13 = i12;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = r0Var.f13536c;
            i12 = r0Var.f13535b;
            x2Var2 = r0Var.f13534a;
            pg.q.b(obj);
        }
        j2.e2 e2Var = (j2.e2) obj;
        if (e2Var == null || !e2Var.f14713a.getDescription().hasMimeType("text/*")) {
            m0.x2 x2Var3 = x2Var2;
            i11 = i13;
            x2Var = x2Var3;
            i10 = i12;
            r12 = false;
            if (r12 != false) {
            }
            if (i10 == 0) {
            }
            if (t2.j0.c(x2Var.k().f33683b) == x2Var.k().f33682a.f27761b.length()) {
            }
            if (x2Var.h()) {
            }
            return new t2((r13 == false ? 2 : 0) | i11 | ((i10 == 0 && x2Var.h()) == false ? 4 : 0) | ((t2.j0.c(x2Var.k().f33683b) == x2Var.k().f33682a.f27761b.length()) == false ? 8 : 0) | (!x2Var.h() && t2.j0.b(x2Var.k().f33683b) ? 16 : 0));
        }
        m0.x2 x2Var4 = x2Var2;
        i11 = i13;
        x2Var = x2Var4;
        i10 = i12;
        r12 = true;
        if (r12 != false) {
        }
        if (i10 == 0) {
        }
        if (t2.j0.c(x2Var.k().f33683b) == x2Var.k().f33682a.f27761b.length()) {
        }
        if (x2Var.h()) {
        }
        return new t2((r13 == false ? 2 : 0) | i11 | ((i10 == 0 && x2Var.h()) == false ? 4 : 0) | ((t2.j0.c(x2Var.k().f33683b) == x2Var.k().f33682a.f27761b.length()) == false ? 8 : 0) | (!x2Var.h() && t2.j0.b(x2Var.k().f33683b) ? 16 : 0));
    }
}
