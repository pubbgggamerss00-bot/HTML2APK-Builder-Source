package b0;

import androidx.constraintlayout.widget.ConstraintLayout;
import b0.d;
import b0.e;
import c0.b;
import c0.o;
import c0.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f extends l {
    public int A0;
    public int B0;
    public c[] C0;
    public c[] D0;
    public int E0;
    public boolean F0;
    public boolean G0;
    public WeakReference<d> H0;
    public WeakReference<d> I0;
    public WeakReference<d> J0;
    public WeakReference<d> K0;
    public final HashSet<e> L0;
    public final b.a M0;

    /* renamed from: s0, reason: collision with root package name */
    public final c0.b f1937s0 = new c0.b(this);

    /* renamed from: t0, reason: collision with root package name */
    public final c0.e f1938t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f1939u0;

    /* renamed from: v0, reason: collision with root package name */
    public b.InterfaceC0025b f1940v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f1941w0;

    /* renamed from: x0, reason: collision with root package name */
    public final z.c f1942x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f1943y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f1944z0;

    public f() {
        c0.e eVar = new c0.e();
        eVar.f2074b = true;
        eVar.f2075c = true;
        eVar.f2077e = new ArrayList<>();
        new ArrayList();
        eVar.f2078f = null;
        eVar.f2079g = new b.a();
        eVar.h = new ArrayList<>();
        eVar.f2073a = this;
        eVar.f2076d = this;
        this.f1938t0 = eVar;
        this.f1940v0 = null;
        this.f1941w0 = false;
        this.f1942x0 = new z.c();
        this.A0 = 0;
        this.B0 = 0;
        this.C0 = new c[4];
        this.D0 = new c[4];
        this.E0 = 257;
        this.F0 = false;
        this.G0 = false;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = null;
        this.L0 = new HashSet<>();
        this.M0 = new b.a();
    }

    public static void V(e eVar, b.InterfaceC0025b interfaceC0025b, b.a aVar) {
        int i6;
        int i7;
        if (interfaceC0025b == null) {
            return;
        }
        int i8 = eVar.f1909i0;
        int[] iArr = eVar.f1926t;
        if (i8 == 8 || (eVar instanceof h) || (eVar instanceof a)) {
            aVar.f2066e = 0;
            aVar.f2067f = 0;
            return;
        }
        e.a[] aVarArr = eVar.U;
        aVar.f2062a = aVarArr[0];
        aVar.f2063b = aVarArr[1];
        aVar.f2064c = eVar.q();
        aVar.f2065d = eVar.k();
        aVar.f2069i = false;
        aVar.f2070j = 0;
        e.a aVar2 = aVar.f2062a;
        e.a aVar3 = e.a.f1934u;
        boolean z6 = aVar2 == aVar3;
        boolean z7 = aVar.f2063b == aVar3;
        boolean z8 = z6 && eVar.Y > 0.0f;
        boolean z9 = z7 && eVar.Y > 0.0f;
        e.a aVar4 = e.a.f1933t;
        e.a aVar5 = e.a.s;
        if (z6 && eVar.t(0) && eVar.f1925r == 0 && !z8) {
            aVar.f2062a = aVar4;
            if (z7 && eVar.s == 0) {
                aVar.f2062a = aVar5;
            }
            z6 = false;
        }
        if (z7 && eVar.t(1) && eVar.s == 0 && !z9) {
            aVar.f2063b = aVar4;
            if (z6 && eVar.f1925r == 0) {
                aVar.f2063b = aVar5;
            }
            z7 = false;
        }
        if (eVar.A()) {
            aVar.f2062a = aVar5;
            z6 = false;
        }
        if (eVar.B()) {
            aVar.f2063b = aVar5;
            z7 = false;
        }
        if (z8) {
            if (iArr[0] == 4) {
                aVar.f2062a = aVar5;
            } else if (!z7) {
                if (aVar.f2063b == aVar5) {
                    i7 = aVar.f2065d;
                } else {
                    aVar.f2062a = aVar4;
                    ((ConstraintLayout.b) interfaceC0025b).b(eVar, aVar);
                    i7 = aVar.f2067f;
                }
                aVar.f2062a = aVar5;
                aVar.f2064c = (int) (eVar.Y * i7);
            }
        }
        if (z9) {
            if (iArr[1] == 4) {
                aVar.f2063b = aVar5;
            } else if (!z6) {
                if (aVar.f2062a == aVar5) {
                    i6 = aVar.f2064c;
                } else {
                    aVar.f2063b = aVar4;
                    ((ConstraintLayout.b) interfaceC0025b).b(eVar, aVar);
                    i6 = aVar.f2066e;
                }
                aVar.f2063b = aVar5;
                if (eVar.Z == -1) {
                    aVar.f2065d = (int) (i6 / eVar.Y);
                } else {
                    aVar.f2065d = (int) (eVar.Y * i6);
                }
            }
        }
        ((ConstraintLayout.b) interfaceC0025b).b(eVar, aVar);
        eVar.O(aVar.f2066e);
        eVar.L(aVar.f2067f);
        eVar.E = aVar.h;
        eVar.I(aVar.f2068g);
        aVar.f2070j = 0;
    }

    @Override // b0.l, b0.e
    public final void C() {
        this.f1942x0.t();
        this.f1943y0 = 0;
        this.f1944z0 = 0;
        super.C();
    }

    @Override // b0.e
    public final void P(boolean z6, boolean z7) {
        super.P(z6, z7);
        int size = this.f1981r0.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.f1981r0.get(i6).P(z6, z7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:339:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0698 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:384:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x07f9  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0838  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0854 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:496:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x08e4  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x08ee  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0921 A[PHI: r15 r25
      0x0921: PHI (r15v10 boolean) = (r15v9 boolean), (r15v14 boolean), (r15v14 boolean), (r15v14 boolean) binds: [B:504:0x08ef, B:512:0x090b, B:513:0x090d, B:515:0x0913] A[DONT_GENERATE, DONT_INLINE]
      0x0921: PHI (r25v7 boolean) = (r25v6 boolean), (r25v8 boolean), (r25v8 boolean), (r25v8 boolean) binds: [B:504:0x08ef, B:512:0x090b, B:513:0x090d, B:515:0x0913] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0927  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x0928 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v9 */
    @Override // b0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R() {
        int i6;
        e.a[] aVarArr;
        d dVar;
        int i7;
        int i8;
        e.a aVar;
        e.a aVar2;
        d dVar2;
        e.a aVar3;
        z.c cVar;
        e.a aVar4;
        int i9;
        boolean z6;
        char c7;
        int i10;
        int i11;
        boolean z7;
        boolean z8;
        boolean z9;
        d dVar3;
        e.a aVar5;
        boolean z10;
        d dVar4;
        boolean[] zArr;
        int iMax;
        int iMax2;
        ?? r14;
        int i12;
        d dVar5;
        int i13;
        e.a aVar6;
        e.a aVar7;
        o oVar;
        int i14;
        int iQ;
        int i15;
        int iK;
        int iB;
        o oVar2;
        o oVar3;
        int i16;
        d dVar6;
        this.f1894a0 = 0;
        this.f1896b0 = 0;
        this.F0 = false;
        this.G0 = false;
        int size = this.f1981r0.size();
        int iMax3 = Math.max(0, q());
        int iMax4 = Math.max(0, k());
        e.a[] aVarArr2 = this.U;
        e.a aVar8 = aVarArr2[1];
        e.a aVar9 = aVarArr2[0];
        int i17 = this.f1939u0;
        e.a aVar10 = e.a.f1934u;
        d dVar7 = this.K;
        d dVar8 = this.J;
        e.a aVar11 = e.a.s;
        if (i17 == 0 && j.b(this.E0, 1)) {
            b.InterfaceC0025b interfaceC0025b = this.f1940v0;
            e.a aVar12 = aVarArr2[0];
            e.a aVar13 = aVarArr2[1];
            E();
            ArrayList<e> arrayList = this.f1981r0;
            int size2 = arrayList.size();
            aVarArr = aVarArr2;
            for (int i18 = 0; i18 < size2; i18++) {
                arrayList.get(i18).E();
            }
            boolean z11 = this.f1941w0;
            if (aVar12 == aVar11) {
                i6 = iMax4;
                J(0, q());
            } else {
                i6 = iMax4;
                dVar8.l(0);
                this.f1894a0 = 0;
            }
            boolean z12 = false;
            int i19 = 0;
            boolean z13 = false;
            while (i19 < size2) {
                boolean z14 = z12;
                e eVar = arrayList.get(i19);
                int i20 = i19;
                if (eVar instanceof h) {
                    h hVar = (h) eVar;
                    dVar6 = dVar8;
                    if (hVar.f1969v0 == 1) {
                        int i21 = hVar.f1966s0;
                        if (i21 != -1) {
                            hVar.R(i21);
                        } else if (hVar.f1967t0 != -1 && A()) {
                            hVar.R(q() - hVar.f1967t0);
                        } else if (A()) {
                            hVar.R((int) ((hVar.f1965r0 * q()) + 0.5f));
                        }
                        z14 = true;
                    }
                } else {
                    dVar6 = dVar8;
                    if ((eVar instanceof a) && ((a) eVar).U() == 0) {
                        z12 = z14;
                        z13 = true;
                    }
                    i19 = i20 + 1;
                    dVar8 = dVar6;
                }
                z12 = z14;
                i19 = i20 + 1;
                dVar8 = dVar6;
            }
            dVar = dVar8;
            if (z12) {
                for (int i22 = 0; i22 < size2; i22 = i16 + 1) {
                    e eVar2 = arrayList.get(i22);
                    if (eVar2 instanceof h) {
                        h hVar2 = (h) eVar2;
                        i16 = i22;
                        if (hVar2.f1969v0 == 1) {
                            c0.h.b(0, hVar2, interfaceC0025b, z11);
                        }
                    } else {
                        i16 = i22;
                    }
                }
            }
            c0.h.b(0, this, interfaceC0025b, z11);
            if (z13) {
                for (int i23 = 0; i23 < size2; i23++) {
                    e eVar3 = arrayList.get(i23);
                    if (eVar3 instanceof a) {
                        a aVar14 = (a) eVar3;
                        if (aVar14.U() == 0 && aVar14.T()) {
                            c0.h.b(1, aVar14, interfaceC0025b, z11);
                        }
                    }
                }
            }
            if (aVar13 == aVar11) {
                K(0, k());
            } else {
                dVar7.l(0);
                this.f1896b0 = 0;
            }
            int i24 = 0;
            boolean z15 = false;
            boolean z16 = false;
            while (i24 < size2) {
                e eVar4 = arrayList.get(i24);
                int i25 = i24;
                if (eVar4 instanceof h) {
                    h hVar3 = (h) eVar4;
                    if (hVar3.f1969v0 == 0) {
                        int i26 = hVar3.f1966s0;
                        if (i26 != -1) {
                            hVar3.R(i26);
                        } else if (hVar3.f1967t0 != -1 && B()) {
                            hVar3.R(k() - hVar3.f1967t0);
                        } else if (B()) {
                            hVar3.R((int) ((hVar3.f1965r0 * k()) + 0.5f));
                        }
                        z15 = true;
                    }
                } else if ((eVar4 instanceof a) && ((a) eVar4).U() == 1) {
                    z16 = true;
                }
                i24 = i25 + 1;
            }
            if (z15) {
                for (int i27 = 0; i27 < size2; i27++) {
                    e eVar5 = arrayList.get(i27);
                    if (eVar5 instanceof h) {
                        h hVar4 = (h) eVar5;
                        if (hVar4.f1969v0 == 0) {
                            c0.h.g(1, hVar4, interfaceC0025b);
                        }
                    }
                }
            }
            c0.h.g(0, this, interfaceC0025b);
            if (z16) {
                for (int i28 = 0; i28 < size2; i28++) {
                    e eVar6 = arrayList.get(i28);
                    if (eVar6 instanceof a) {
                        a aVar15 = (a) eVar6;
                        if (aVar15.U() == 1 && aVar15.T()) {
                            c0.h.g(1, aVar15, interfaceC0025b);
                        }
                    }
                }
            }
            for (int i29 = 0; i29 < size2; i29++) {
                e eVar7 = arrayList.get(i29);
                if (eVar7.z() && c0.h.a(eVar7)) {
                    V(eVar7, interfaceC0025b, c0.h.f2099a);
                    if (!(eVar7 instanceof h)) {
                        c0.h.b(0, eVar7, interfaceC0025b, z11);
                        c0.h.g(0, eVar7, interfaceC0025b);
                    } else if (((h) eVar7).f1969v0 == 0) {
                        c0.h.g(0, eVar7, interfaceC0025b);
                    } else {
                        c0.h.b(0, eVar7, interfaceC0025b, z11);
                    }
                }
            }
            for (int i30 = 0; i30 < size; i30++) {
                e eVar8 = this.f1981r0.get(i30);
                if (eVar8.z() && !(eVar8 instanceof h) && !(eVar8 instanceof a) && !(eVar8 instanceof k) && !eVar8.G) {
                    e.a aVarJ = eVar8.j(0);
                    e.a aVarJ2 = eVar8.j(1);
                    if (aVarJ != aVar10 || eVar8.f1925r == 1 || aVarJ2 != aVar10 || eVar8.s == 1) {
                        V(eVar8, this.f1940v0, new b.a());
                    }
                }
            }
        } else {
            i6 = iMax4;
            aVarArr = aVarArr2;
            dVar = dVar8;
        }
        e.a aVar16 = e.a.f1933t;
        z.c cVar2 = this.f1942x0;
        if (size <= 2 || !((aVar9 == aVar16 || aVar8 == aVar16) && j.b(this.E0, 1024))) {
            i7 = iMax3;
            i8 = size;
            aVar = aVar16;
            aVar2 = aVar9;
            dVar2 = dVar7;
            aVar3 = aVar11;
            cVar = cVar2;
            aVar4 = aVar8;
            i9 = i6;
        } else {
            b.InterfaceC0025b interfaceC0025b2 = this.f1940v0;
            ArrayList<e> arrayList2 = this.f1981r0;
            int size3 = arrayList2.size();
            int i31 = 0;
            while (i31 < size3) {
                e eVar9 = arrayList2.get(i31);
                e.a aVar17 = aVarArr[0];
                int i32 = i31;
                e.a aVar18 = aVarArr[1];
                dVar2 = dVar7;
                e.a[] aVarArr3 = eVar9.U;
                i8 = size;
                if (!c0.i.b(aVar17, aVar18, aVarArr3[0], aVarArr3[1]) || (eVar9 instanceof g)) {
                    i13 = iMax3;
                    aVar = aVar16;
                    aVar6 = aVar8;
                    aVar7 = aVar9;
                    aVar3 = aVar11;
                    cVar = cVar2;
                    break;
                }
                i31 = i32 + 1;
                dVar7 = dVar2;
                size = i8;
            }
            i8 = size;
            dVar2 = dVar7;
            i13 = iMax3;
            aVar6 = aVar8;
            ArrayList arrayList3 = null;
            int i33 = 0;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            ArrayList arrayList6 = null;
            ArrayList arrayList7 = null;
            ArrayList arrayList8 = null;
            while (i33 < size3) {
                int i34 = i33;
                e eVar10 = arrayList2.get(i33);
                e.a aVar19 = aVar9;
                e.a aVar20 = aVarArr[0];
                e.a aVar21 = aVar11;
                e.a aVar22 = aVarArr[1];
                z.c cVar3 = cVar2;
                e.a[] aVarArr4 = eVar10.U;
                e.a aVar23 = aVar16;
                if (!c0.i.b(aVar20, aVar22, aVarArr4[0], aVarArr4[1])) {
                    V(eVar10, interfaceC0025b2, this.M0);
                }
                boolean z17 = eVar10 instanceof h;
                if (z17) {
                    h hVar5 = (h) eVar10;
                    if (hVar5.f1969v0 == 0) {
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                        }
                        arrayList7.add(hVar5);
                    }
                    if (hVar5.f1969v0 == 1) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(hVar5);
                    }
                }
                if (eVar10 instanceof i) {
                    if (eVar10 instanceof a) {
                        a aVar24 = (a) eVar10;
                        if (aVar24.U() == 0) {
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList();
                            }
                            arrayList5.add(aVar24);
                        }
                        if (aVar24.U() == 1) {
                            if (arrayList8 == null) {
                                arrayList8 = new ArrayList();
                            }
                            arrayList8.add(aVar24);
                        }
                    } else {
                        i iVar = (i) eVar10;
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        arrayList5.add(iVar);
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                        }
                        arrayList8.add(iVar);
                    }
                }
                if (eVar10.J.f1883f == null && eVar10.L.f1883f == null && !z17 && !(eVar10 instanceof a)) {
                    if (arrayList6 == null) {
                        arrayList6 = new ArrayList();
                    }
                    arrayList6.add(eVar10);
                }
                if (eVar10.K.f1883f == null && eVar10.M.f1883f == null && eVar10.N.f1883f == null && !z17 && !(eVar10 instanceof a)) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(eVar10);
                }
                i33 = i34 + 1;
                aVar9 = aVar19;
                aVar11 = aVar21;
                cVar2 = cVar3;
                aVar16 = aVar23;
            }
            e.a aVar25 = aVar16;
            z.c cVar4 = cVar2;
            aVar7 = aVar9;
            e.a aVar26 = aVar11;
            ArrayList<o> arrayList9 = new ArrayList<>();
            if (arrayList4 != null) {
                int size4 = arrayList4.size();
                int i35 = 0;
                while (i35 < size4) {
                    Object obj = arrayList4.get(i35);
                    i35++;
                    c0.i.a((h) obj, 0, arrayList9, null);
                }
            }
            if (arrayList5 != null) {
                int size5 = arrayList5.size();
                int i36 = 0;
                while (i36 < size5) {
                    Object obj2 = arrayList5.get(i36);
                    i36++;
                    i iVar2 = (i) obj2;
                    o oVarA = c0.i.a(iVar2, 0, arrayList9, null);
                    iVar2.R(0, oVarA, arrayList9);
                    oVarA.a(arrayList9);
                }
            }
            HashSet<d> hashSet = i(d.a.s).f1878a;
            if (hashSet != null) {
                Iterator<d> it = hashSet.iterator();
                while (it.hasNext()) {
                    c0.i.a(it.next().f1881d, 0, arrayList9, null);
                }
            }
            HashSet<d> hashSet2 = i(d.a.f1887u).f1878a;
            if (hashSet2 != null) {
                Iterator<d> it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    c0.i.a(it2.next().f1881d, 0, arrayList9, null);
                }
            }
            d.a aVar27 = d.a.f1890x;
            HashSet<d> hashSet3 = i(aVar27).f1878a;
            if (hashSet3 != null) {
                Iterator<d> it3 = hashSet3.iterator();
                while (it3.hasNext()) {
                    c0.i.a(it3.next().f1881d, 0, arrayList9, null);
                }
            }
            if (arrayList6 != null) {
                int size6 = arrayList6.size();
                int i37 = 0;
                while (i37 < size6) {
                    Object obj3 = arrayList6.get(i37);
                    i37++;
                    c0.i.a((e) obj3, 0, arrayList9, null);
                }
            }
            if (arrayList7 != null) {
                int size7 = arrayList7.size();
                int i38 = 0;
                while (i38 < size7) {
                    Object obj4 = arrayList7.get(i38);
                    i38++;
                    c0.i.a((h) obj4, 1, arrayList9, null);
                }
            }
            if (arrayList8 != null) {
                int size8 = arrayList8.size();
                int i39 = 0;
                while (i39 < size8) {
                    Object obj5 = arrayList8.get(i39);
                    i39++;
                    i iVar3 = (i) obj5;
                    o oVarA2 = c0.i.a(iVar3, 1, arrayList9, null);
                    iVar3.R(1, oVarA2, arrayList9);
                    oVarA2.a(arrayList9);
                }
            }
            HashSet<d> hashSet4 = i(d.a.f1886t).f1878a;
            if (hashSet4 != null) {
                Iterator<d> it4 = hashSet4.iterator();
                while (it4.hasNext()) {
                    c0.i.a(it4.next().f1881d, 1, arrayList9, null);
                }
            }
            HashSet<d> hashSet5 = i(d.a.f1889w).f1878a;
            if (hashSet5 != null) {
                Iterator<d> it5 = hashSet5.iterator();
                while (it5.hasNext()) {
                    c0.i.a(it5.next().f1881d, 1, arrayList9, null);
                }
            }
            HashSet<d> hashSet6 = i(d.a.f1888v).f1878a;
            if (hashSet6 != null) {
                Iterator<d> it6 = hashSet6.iterator();
                while (it6.hasNext()) {
                    c0.i.a(it6.next().f1881d, 1, arrayList9, null);
                }
            }
            HashSet<d> hashSet7 = i(aVar27).f1878a;
            if (hashSet7 != null) {
                Iterator<d> it7 = hashSet7.iterator();
                while (it7.hasNext()) {
                    c0.i.a(it7.next().f1881d, 1, arrayList9, null);
                }
            }
            if (arrayList3 != null) {
                int size9 = arrayList3.size();
                int i40 = 0;
                while (i40 < size9) {
                    Object obj6 = arrayList3.get(i40);
                    i40++;
                    c0.i.a((e) obj6, 1, arrayList9, null);
                }
            }
            char c8 = 1;
            int i41 = 0;
            while (i41 < size3) {
                e eVar11 = arrayList2.get(i41);
                e.a[] aVarArr5 = eVar11.U;
                if (aVarArr5[0] == aVar10 && aVarArr5[c8] == aVar10) {
                    int i42 = eVar11.p0;
                    int size10 = arrayList9.size();
                    int i43 = 0;
                    while (true) {
                        if (i43 >= size10) {
                            oVar2 = null;
                            break;
                        }
                        oVar2 = arrayList9.get(i43);
                        if (i42 == oVar2.f2107b) {
                            break;
                        } else {
                            i43++;
                        }
                    }
                    int i44 = eVar11.f1924q0;
                    int size11 = arrayList9.size();
                    int i45 = 0;
                    while (true) {
                        if (i45 >= size11) {
                            oVar3 = null;
                            break;
                        }
                        oVar3 = arrayList9.get(i45);
                        if (i44 == oVar3.f2107b) {
                            break;
                        } else {
                            i45++;
                        }
                    }
                    if (oVar2 != null && oVar3 != null) {
                        oVar2.c(0, oVar3);
                        oVar3.f2108c = 2;
                        arrayList9.remove(oVar2);
                    }
                }
                i41++;
                c8 = 1;
            }
            if (arrayList9.size() > 1) {
                aVar = aVar25;
                if (aVarArr[0] == aVar) {
                    int size12 = arrayList9.size();
                    int i46 = 0;
                    int i47 = 0;
                    oVar = null;
                    while (i47 < size12) {
                        o oVar4 = arrayList9.get(i47);
                        i47++;
                        o oVar5 = oVar4;
                        if (oVar5.f2108c != 1) {
                            z.c cVar5 = cVar4;
                            int iB2 = oVar5.b(cVar5, 0);
                            if (iB2 > i46) {
                                oVar = oVar5;
                                i46 = iB2;
                            }
                            cVar4 = cVar5;
                        }
                    }
                    cVar = cVar4;
                    aVar3 = aVar26;
                    if (oVar != null) {
                        M(aVar3);
                        O(i46);
                    }
                    if (aVarArr[1] != aVar) {
                        int size13 = arrayList9.size();
                        int i48 = 0;
                        int i49 = 0;
                        o oVar6 = null;
                        while (i49 < size13) {
                            o oVar7 = arrayList9.get(i49);
                            i49++;
                            o oVar8 = oVar7;
                            if (oVar8.f2108c != 0 && (iB = oVar8.b(cVar, 1)) > i48) {
                                oVar6 = oVar8;
                                i48 = iB;
                            }
                        }
                        if (oVar6 != null) {
                            N(aVar3);
                            L(i48);
                        } else {
                            oVar6 = null;
                        }
                        if (oVar != null || oVar6 != null) {
                            aVar2 = aVar7;
                            if (aVar2 == aVar) {
                                i14 = i13;
                                if (i14 >= q() || i14 <= 0) {
                                    iQ = q();
                                    aVar4 = aVar6;
                                    if (aVar4 != aVar) {
                                        i15 = i6;
                                        if (i15 >= k() || i15 <= 0) {
                                            iK = k();
                                            i9 = iK;
                                            i7 = iQ;
                                            z6 = true;
                                        } else {
                                            L(i15);
                                            this.G0 = true;
                                        }
                                    } else {
                                        i15 = i6;
                                    }
                                    iK = i15;
                                    i9 = iK;
                                    i7 = iQ;
                                    z6 = true;
                                } else {
                                    O(i14);
                                    this.F0 = true;
                                }
                            } else {
                                i14 = i13;
                            }
                            iQ = i14;
                            aVar4 = aVar6;
                            if (aVar4 != aVar) {
                            }
                            iK = i15;
                            i9 = iK;
                            i7 = iQ;
                            z6 = true;
                        }
                    }
                    boolean z18 = W(64) || W(128);
                    cVar.getClass();
                    cVar.h = false;
                    if (this.E0 == 0 || !z18) {
                        c7 = 1;
                    } else {
                        c7 = 1;
                        cVar.h = true;
                    }
                    ArrayList<e> arrayList10 = this.f1981r0;
                    boolean z19 = aVarArr[0] == aVar || aVarArr[c7] == aVar;
                    this.A0 = 0;
                    this.B0 = 0;
                    i10 = i8;
                    for (i11 = 0; i11 < i10; i11++) {
                        e eVar12 = this.f1981r0.get(i11);
                        if (eVar12 instanceof l) {
                            ((l) eVar12).R();
                        }
                    }
                    boolean zW = W(64);
                    boolean z20 = z6;
                    int i50 = 0;
                    z7 = true;
                    while (z7) {
                        int i51 = i50 + 1;
                        try {
                            cVar.t();
                            aVar5 = aVar3;
                            try {
                                this.A0 = 0;
                                this.B0 = 0;
                                g(cVar);
                                for (int i52 = 0; i52 < i10; i52++) {
                                    this.f1981r0.get(i52).g(cVar);
                                }
                                T(cVar);
                                try {
                                    WeakReference<d> weakReference = this.H0;
                                    if (weakReference != null) {
                                        try {
                                            if (weakReference.get() != null) {
                                                dVar5 = dVar2;
                                                try {
                                                    z9 = z19;
                                                    z10 = z20;
                                                    try {
                                                        cVar.f(cVar.k(this.H0.get()), cVar.k(dVar5), 0, 5);
                                                        this.H0 = null;
                                                    } catch (Exception e6) {
                                                        e = e6;
                                                        dVar3 = dVar5;
                                                        z7 = true;
                                                        e.printStackTrace();
                                                        dVar4 = dVar3;
                                                        System.out.println("EXCEPTION : " + e);
                                                        boolean[] zArr2 = j.f1973a;
                                                        if (z7) {
                                                        }
                                                        if (z9) {
                                                        }
                                                        iMax = Math.max(this.f1900d0, q());
                                                        if (iMax > q()) {
                                                        }
                                                        iMax2 = Math.max(this.f1902e0, k());
                                                        if (iMax2 > k()) {
                                                        }
                                                        if (z10) {
                                                        }
                                                        if (i51 > i12) {
                                                        }
                                                        i50 = i51;
                                                        z19 = z9;
                                                        aVar3 = aVar5;
                                                        dVar2 = dVar4;
                                                    }
                                                } catch (Exception e7) {
                                                    e = e7;
                                                    z9 = z19;
                                                    z10 = z20;
                                                }
                                            } else {
                                                z10 = z20;
                                                dVar5 = dVar2;
                                                z9 = z19;
                                            }
                                            try {
                                                WeakReference<d> weakReference2 = this.J0;
                                                if (weakReference2 != null && weakReference2.get() != null) {
                                                    cVar.f(cVar.k(this.M), cVar.k(this.J0.get()), 0, 5);
                                                    this.J0 = null;
                                                }
                                                WeakReference<d> weakReference3 = this.I0;
                                                if (weakReference3 != null && weakReference3.get() != null) {
                                                    d dVar9 = dVar;
                                                    try {
                                                        dVar = dVar9;
                                                        cVar.f(cVar.k(this.I0.get()), cVar.k(dVar9), 0, 5);
                                                        this.I0 = null;
                                                    } catch (Exception e8) {
                                                        e = e8;
                                                        dVar = dVar9;
                                                        dVar3 = dVar5;
                                                        z7 = true;
                                                        e.printStackTrace();
                                                        dVar4 = dVar3;
                                                        System.out.println("EXCEPTION : " + e);
                                                        boolean[] zArr22 = j.f1973a;
                                                        if (z7) {
                                                        }
                                                        if (z9) {
                                                        }
                                                        iMax = Math.max(this.f1900d0, q());
                                                        if (iMax > q()) {
                                                        }
                                                        iMax2 = Math.max(this.f1902e0, k());
                                                        if (iMax2 > k()) {
                                                        }
                                                        if (z10) {
                                                        }
                                                        if (i51 > i12) {
                                                        }
                                                        i50 = i51;
                                                        z19 = z9;
                                                        aVar3 = aVar5;
                                                        dVar2 = dVar4;
                                                    }
                                                }
                                                WeakReference<d> weakReference4 = this.K0;
                                                if (weakReference4 != null && weakReference4.get() != null) {
                                                    cVar.f(cVar.k(this.L), cVar.k(this.K0.get()), 0, 5);
                                                    try {
                                                        this.K0 = null;
                                                    } catch (Exception e9) {
                                                        e = e9;
                                                        dVar3 = dVar5;
                                                        z7 = true;
                                                        e.printStackTrace();
                                                        dVar4 = dVar3;
                                                        System.out.println("EXCEPTION : " + e);
                                                        boolean[] zArr222 = j.f1973a;
                                                        if (z7) {
                                                        }
                                                        if (z9) {
                                                        }
                                                        iMax = Math.max(this.f1900d0, q());
                                                        if (iMax > q()) {
                                                        }
                                                        iMax2 = Math.max(this.f1902e0, k());
                                                        if (iMax2 > k()) {
                                                        }
                                                        if (z10) {
                                                        }
                                                        if (i51 > i12) {
                                                        }
                                                        i50 = i51;
                                                        z19 = z9;
                                                        aVar3 = aVar5;
                                                        dVar2 = dVar4;
                                                    }
                                                }
                                                cVar.p();
                                                dVar4 = dVar5;
                                                z7 = true;
                                            } catch (Exception e10) {
                                                e = e10;
                                            }
                                        } catch (Exception e11) {
                                            e = e11;
                                            z10 = z20;
                                            dVar5 = dVar2;
                                            z9 = z19;
                                        }
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    z10 = z20;
                                    dVar5 = dVar2;
                                    z9 = z19;
                                }
                            } catch (Exception e13) {
                                e = e13;
                                d dVar10 = dVar2;
                                z9 = z19;
                                dVar3 = dVar10;
                                z10 = z20;
                                e.printStackTrace();
                                dVar4 = dVar3;
                                System.out.println("EXCEPTION : " + e);
                                boolean[] zArr2222 = j.f1973a;
                                if (z7) {
                                }
                                if (z9) {
                                }
                                iMax = Math.max(this.f1900d0, q());
                                if (iMax > q()) {
                                }
                                iMax2 = Math.max(this.f1902e0, k());
                                if (iMax2 > k()) {
                                }
                                if (z10) {
                                }
                                if (i51 > i12) {
                                }
                                i50 = i51;
                                z19 = z9;
                                aVar3 = aVar5;
                                dVar2 = dVar4;
                            }
                        } catch (Exception e14) {
                            e = e14;
                            d dVar11 = dVar2;
                            z9 = z19;
                            dVar3 = dVar11;
                            aVar5 = aVar3;
                        }
                        boolean[] zArr22222 = j.f1973a;
                        if (z7) {
                            zArr22222[2] = false;
                            boolean zW2 = W(64);
                            Q(cVar, zW2);
                            int size14 = this.f1981r0.size();
                            int i53 = 0;
                            z7 = false;
                            while (i53 < size14) {
                                boolean[] zArr3 = zArr22222;
                                e eVar13 = this.f1981r0.get(i53);
                                eVar13.Q(cVar, zW2);
                                int i54 = i53;
                                boolean z21 = zW2;
                                if (eVar13.h != -1 || eVar13.f1908i != -1) {
                                    z7 = true;
                                }
                                i53 = i54 + 1;
                                zArr22222 = zArr3;
                                zW2 = z21;
                            }
                            zArr = zArr22222;
                        } else {
                            zArr = zArr22222;
                            Q(cVar, zW);
                            for (int i55 = 0; i55 < i10; i55++) {
                                this.f1981r0.get(i55).Q(cVar, zW);
                            }
                            z7 = false;
                        }
                        if (z9 && i51 < 8) {
                            if (zArr[2]) {
                                int iMax5 = 0;
                                int iMax6 = 0;
                                for (int i56 = 0; i56 < i10; i56++) {
                                    e eVar14 = this.f1981r0.get(i56);
                                    iMax6 = Math.max(iMax6, eVar14.q() + eVar14.f1894a0);
                                    iMax5 = Math.max(iMax5, eVar14.k() + eVar14.f1896b0);
                                }
                                int iMax7 = Math.max(this.f1900d0, iMax6);
                                int iMax8 = Math.max(this.f1902e0, iMax5);
                                if (aVar2 == aVar && q() < iMax7) {
                                    O(iMax7);
                                    aVarArr[0] = aVar;
                                    z7 = true;
                                    z10 = true;
                                }
                                if (aVar4 == aVar && k() < iMax8) {
                                    L(iMax8);
                                    aVarArr[1] = aVar;
                                    z7 = true;
                                    z10 = true;
                                }
                            }
                        }
                        iMax = Math.max(this.f1900d0, q());
                        if (iMax > q()) {
                            O(iMax);
                            aVarArr[0] = aVar5;
                            z7 = true;
                            z10 = true;
                        }
                        iMax2 = Math.max(this.f1902e0, k());
                        if (iMax2 > k()) {
                            L(iMax2);
                            r14 = 1;
                            aVarArr[1] = aVar5;
                            z7 = true;
                            z10 = true;
                        } else {
                            r14 = 1;
                        }
                        if (z10) {
                            z20 = z10;
                            i12 = 8;
                        } else {
                            if (aVarArr[0] == aVar && i7 > 0 && q() > i7) {
                                this.F0 = r14;
                                aVarArr[0] = aVar5;
                                O(i7);
                                z7 = r14;
                                z10 = z7;
                            }
                            if (aVarArr[r14] == aVar && i9 > 0 && k() > i9) {
                                this.G0 = r14;
                                aVarArr[r14] = aVar5;
                                L(i9);
                                i12 = 8;
                                z20 = true;
                                z7 = true;
                            }
                        }
                        if (i51 > i12) {
                            z7 = false;
                        }
                        i50 = i51;
                        z19 = z9;
                        aVar3 = aVar5;
                        dVar2 = dVar4;
                    }
                    z8 = z20;
                    this.f1981r0 = arrayList10;
                    if (z8) {
                        aVarArr[0] = aVar2;
                        aVarArr[1] = aVar4;
                    }
                    F(cVar.f15404m);
                }
                cVar = cVar4;
                aVar3 = aVar26;
                oVar = null;
                if (aVarArr[1] != aVar) {
                }
                if (W(64)) {
                }
                cVar.getClass();
                cVar.h = false;
                if (this.E0 == 0) {
                    c7 = 1;
                }
                ArrayList<e> arrayList102 = this.f1981r0;
                if (aVarArr[0] == aVar) {
                }
                this.A0 = 0;
                this.B0 = 0;
                i10 = i8;
                while (i11 < i10) {
                }
                boolean zW3 = W(64);
                boolean z202 = z6;
                int i502 = 0;
                z7 = true;
                while (z7) {
                }
                z8 = z202;
                this.f1981r0 = arrayList102;
                if (z8) {
                }
                F(cVar.f15404m);
            }
            aVar3 = aVar26;
            cVar = cVar4;
            aVar = aVar25;
            i9 = i6;
            aVar4 = aVar6;
            i7 = i13;
            aVar2 = aVar7;
        }
        z6 = false;
        if (W(64)) {
        }
        cVar.getClass();
        cVar.h = false;
        if (this.E0 == 0) {
        }
        ArrayList<e> arrayList1022 = this.f1981r0;
        if (aVarArr[0] == aVar) {
        }
        this.A0 = 0;
        this.B0 = 0;
        i10 = i8;
        while (i11 < i10) {
        }
        boolean zW32 = W(64);
        boolean z2022 = z6;
        int i5022 = 0;
        z7 = true;
        while (z7) {
        }
        z8 = z2022;
        this.f1981r0 = arrayList1022;
        if (z8) {
        }
        F(cVar.f15404m);
    }

    public final void S(e eVar, int i6) {
        if (i6 == 0) {
            int i7 = this.A0 + 1;
            c[] cVarArr = this.D0;
            if (i7 >= cVarArr.length) {
                this.D0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
            }
            c[] cVarArr2 = this.D0;
            int i8 = this.A0;
            cVarArr2[i8] = new c(eVar, 0, this.f1941w0);
            this.A0 = i8 + 1;
            return;
        }
        if (i6 == 1) {
            int i9 = this.B0 + 1;
            c[] cVarArr3 = this.C0;
            if (i9 >= cVarArr3.length) {
                this.C0 = (c[]) Arrays.copyOf(cVarArr3, cVarArr3.length * 2);
            }
            c[] cVarArr4 = this.C0;
            int i10 = this.B0;
            cVarArr4[i10] = new c(eVar, 1, this.f1941w0);
            this.B0 = i10 + 1;
        }
    }

    public final void T(z.c cVar) {
        f fVar;
        z.c cVar2;
        boolean zW = W(64);
        b(cVar, zW);
        int size = this.f1981r0.size();
        boolean z6 = false;
        for (int i6 = 0; i6 < size; i6++) {
            e eVar = this.f1981r0.get(i6);
            boolean[] zArr = eVar.T;
            zArr[0] = false;
            zArr[1] = false;
            if (eVar instanceof a) {
                z6 = true;
            }
        }
        if (z6) {
            for (int i7 = 0; i7 < size; i7++) {
                e eVar2 = this.f1981r0.get(i7);
                if (eVar2 instanceof a) {
                    a aVar = (a) eVar2;
                    for (int i8 = 0; i8 < aVar.f1972s0; i8++) {
                        e eVar3 = aVar.f1971r0[i8];
                        if (aVar.f1859u0 || eVar3.c()) {
                            int i9 = aVar.f1858t0;
                            if (i9 == 0 || i9 == 1) {
                                eVar3.T[0] = true;
                            } else if (i9 == 2 || i9 == 3) {
                                eVar3.T[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet<e> hashSet = this.L0;
        hashSet.clear();
        for (int i10 = 0; i10 < size; i10++) {
            e eVar4 = this.f1981r0.get(i10);
            eVar4.getClass();
            boolean z7 = eVar4 instanceof k;
            if (z7 || (eVar4 instanceof h)) {
                if (z7) {
                    hashSet.add(eVar4);
                } else {
                    eVar4.b(cVar, zW);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator<e> it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                k kVar = (k) it.next();
                for (int i11 = 0; i11 < kVar.f1972s0; i11++) {
                    if (hashSet.contains(kVar.f1971r0[i11])) {
                        kVar.b(cVar, zW);
                        hashSet.remove(kVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator<e> it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    it2.next().b(cVar, zW);
                }
                hashSet.clear();
            }
        }
        boolean z8 = z.c.f15392q;
        e.a aVar2 = e.a.f1933t;
        if (z8) {
            HashSet<e> hashSet2 = new HashSet<>();
            for (int i12 = 0; i12 < size; i12++) {
                e eVar5 = this.f1981r0.get(i12);
                eVar5.getClass();
                if (!(eVar5 instanceof k) && !(eVar5 instanceof h)) {
                    hashSet2.add(eVar5);
                }
            }
            fVar = this;
            cVar2 = cVar;
            fVar.a(this, cVar2, hashSet2, this.U[0] == aVar2 ? 0 : 1, false);
            Iterator<e> it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                e next = it3.next();
                j.a(this, cVar2, next);
                next.b(cVar2, zW);
            }
        } else {
            fVar = this;
            cVar2 = cVar;
            for (int i13 = 0; i13 < size; i13++) {
                e eVar6 = fVar.f1981r0.get(i13);
                if (eVar6 instanceof f) {
                    e.a[] aVarArr = eVar6.U;
                    e.a aVar3 = aVarArr[0];
                    e.a aVar4 = aVarArr[1];
                    e.a aVar5 = e.a.s;
                    if (aVar3 == aVar2) {
                        eVar6.M(aVar5);
                    }
                    if (aVar4 == aVar2) {
                        eVar6.N(aVar5);
                    }
                    eVar6.b(cVar2, zW);
                    if (aVar3 == aVar2) {
                        eVar6.M(aVar3);
                    }
                    if (aVar4 == aVar2) {
                        eVar6.N(aVar4);
                    }
                } else {
                    j.a(this, cVar2, eVar6);
                    if (!(eVar6 instanceof k) && !(eVar6 instanceof h)) {
                        eVar6.b(cVar2, zW);
                    }
                }
            }
        }
        if (fVar.A0 > 0) {
            b.a(this, cVar2, null, 0);
        }
        if (fVar.B0 > 0) {
            b.a(this, cVar2, null, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean U(int i6, boolean z6) {
        int i7;
        boolean z7;
        int i8;
        boolean z8;
        e.a aVar;
        boolean z9;
        c0.e eVar = this.f1938t0;
        ArrayList<p> arrayList = eVar.f2077e;
        f fVar = eVar.f2073a;
        e.a aVarJ = fVar.j(0);
        e.a[] aVarArr = fVar.U;
        e.a aVarJ2 = fVar.j(1);
        int iR = fVar.r();
        int iS = fVar.s();
        e.a aVar2 = e.a.s;
        if (z6 && (aVarJ == (aVar = e.a.f1933t) || aVarJ2 == aVar)) {
            int size = arrayList.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    z9 = z6;
                    break;
                }
                p pVar = arrayList.get(i9);
                i9++;
                p pVar2 = pVar;
                if (pVar2.f2116f == i6 && !pVar2.k()) {
                    z9 = false;
                    break;
                }
            }
            if (i6 == 0) {
                if (z9 && aVarJ == aVar) {
                    fVar.M(aVar2);
                    fVar.O(eVar.d(fVar, 0));
                    fVar.f1899d.f2115e.d(fVar.q());
                }
            } else if (z9 && aVarJ2 == aVar) {
                fVar.N(aVar2);
                fVar.L(eVar.d(fVar, 1));
                fVar.f1901e.f2115e.d(fVar.k());
            }
        }
        e.a aVar3 = e.a.f1935v;
        if (i6 == 0) {
            i7 = 0;
            e.a aVar4 = aVarArr[0];
            if (aVar4 == aVar2 || aVar4 == aVar3) {
                int iQ = fVar.q() + iR;
                fVar.f1899d.f2118i.d(iQ);
                fVar.f1899d.f2115e.d(iQ - iR);
                i8 = 1;
                z7 = true;
            } else {
                z7 = true;
                i8 = i7;
            }
        } else {
            i7 = 0;
            z7 = true;
            e.a aVar5 = aVarArr[1];
            if (aVar5 == aVar2 || aVar5 == aVar3) {
                int iK = fVar.k() + iS;
                fVar.f1901e.f2118i.d(iK);
                fVar.f1901e.f2115e.d(iK - iS);
                i8 = 1;
            } else {
                i8 = i7;
            }
        }
        eVar.g();
        int size2 = arrayList.size();
        int i10 = i7;
        while (i10 < size2) {
            p pVar3 = arrayList.get(i10);
            i10++;
            p pVar4 = pVar3;
            if (pVar4.f2116f == i6 && (pVar4.f2112b != fVar || pVar4.f2117g)) {
                pVar4.e();
            }
        }
        int size3 = arrayList.size();
        int i11 = i7;
        while (i11 < size3) {
            p pVar5 = arrayList.get(i11);
            i11++;
            p pVar6 = pVar5;
            if (pVar6.f2116f == i6 && (i8 != 0 || pVar6.f2112b != fVar)) {
                if (!pVar6.h.f2088j || !pVar6.f2118i.f2088j || (!(pVar6 instanceof c0.c) && !pVar6.f2115e.f2088j)) {
                    z8 = i7;
                    break;
                }
            }
        }
        z8 = z7;
        fVar.M(aVarJ);
        fVar.N(aVarJ2);
        return z8;
    }

    public final boolean W(int i6) {
        return (this.E0 & i6) == i6;
    }

    @Override // b0.e
    public final void n(StringBuilder sb) {
        sb.append(this.f1910j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.W);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.X);
        sb.append("\n");
        ArrayList<e> arrayList = this.f1981r0;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            e eVar = arrayList.get(i6);
            i6++;
            eVar.n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
