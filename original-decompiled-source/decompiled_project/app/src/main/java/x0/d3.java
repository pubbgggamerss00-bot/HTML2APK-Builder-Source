package x0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import x0.j;

/* loaded from: classes.dex */
public final class d3 {

    /* renamed from: a, reason: collision with root package name */
    public final a3 f31632a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f31633b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f31634c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList<b> f31635d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap<b, s0> f31636e;

    /* renamed from: f, reason: collision with root package name */
    public p.y<p.z> f31637f;

    /* renamed from: g, reason: collision with root package name */
    public int f31638g;

    /* renamed from: h, reason: collision with root package name */
    public int f31639h;

    /* renamed from: i, reason: collision with root package name */
    public int f31640i;

    /* renamed from: j, reason: collision with root package name */
    public int f31641j;

    /* renamed from: k, reason: collision with root package name */
    public int f31642k;

    /* renamed from: l, reason: collision with root package name */
    public int f31643l;

    /* renamed from: m, reason: collision with root package name */
    public int f31644m;

    /* renamed from: n, reason: collision with root package name */
    public int f31645n;

    /* renamed from: o, reason: collision with root package name */
    public int f31646o;

    /* renamed from: p, reason: collision with root package name */
    public final t0 f31647p;

    /* renamed from: q, reason: collision with root package name */
    public final t0 f31648q;

    /* renamed from: r, reason: collision with root package name */
    public final t0 f31649r;

    /* renamed from: s, reason: collision with root package name */
    public p.y<p.h0<Object>> f31650s;

    /* renamed from: t, reason: collision with root package name */
    public int f31651t;

    /* renamed from: u, reason: collision with root package name */
    public int f31652u;

    /* renamed from: v, reason: collision with root package name */
    public int f31653v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f31654w;

    /* renamed from: x, reason: collision with root package name */
    public p.x f31655x;

    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static List a(d3 d3Var, int i10, d3 d3Var2, boolean z10, boolean z11, boolean z12) {
            qg.z zVar;
            qg.z zVar2;
            boolean z13;
            int i11;
            b bVarR;
            b bVarR2;
            int i12;
            int i13;
            int iS = d3Var.s(i10);
            int i14 = i10 + iS;
            int iF = d3Var.f(d3Var.f31633b, d3Var.q(i10));
            int iF2 = d3Var.f(d3Var.f31633b, d3Var.q(i14));
            int i15 = iF2 - iF;
            boolean z14 = i10 >= 0 && (d3Var.f31633b[(d3Var.q(i10) * 5) + 1] & 201326592) != 0;
            d3Var2.u(iS);
            d3Var2.v(i15, d3Var2.f31651t);
            if (d3Var.f31638g < i14) {
                d3Var.z(i14);
            }
            if (d3Var.f31642k < iF2) {
                d3Var.A(iF2, i14);
            }
            int[] iArr = d3Var2.f31633b;
            int i16 = d3Var2.f31651t;
            int i17 = i16 * 5;
            qg.m.d(i17, d3Var.f31633b, i10 * 5, i14 * 5, iArr);
            Object[] objArr = d3Var2.f31634c;
            int i18 = d3Var2.f31640i;
            System.arraycopy(d3Var.f31634c, iF, objArr, i18, i15);
            int i19 = d3Var2.f31653v;
            iArr[i17 + 2] = i19;
            int i20 = i16 - i10;
            int i21 = i16 + iS;
            int iF3 = i18 - d3Var2.f(iArr, i16);
            int i22 = d3Var2.f31644m;
            int i23 = d3Var2.f31643l;
            int length = objArr.length;
            boolean z15 = z14;
            int i24 = i22;
            int i25 = i16;
            while (i25 < i21) {
                if (i25 != i16) {
                    int i26 = (i25 * 5) + 2;
                    iArr[i26] = iArr[i26] + i20;
                }
                int[] iArr2 = iArr;
                int iF4 = d3Var2.f(iArr, i25) + iF3;
                if (i24 < i25) {
                    i12 = i16;
                    i13 = 0;
                } else {
                    i12 = i16;
                    i13 = d3Var2.f31642k;
                }
                iArr2[(i25 * 5) + 4] = d3.h(iF4, i13, i23, length);
                if (i25 == i24) {
                    i24++;
                }
                i25++;
                i16 = i12;
                iArr = iArr2;
            }
            int[] iArr3 = iArr;
            d3Var2.f31644m = i24;
            int iB = c3.b(d3Var.f31635d, i10, d3Var.n());
            int iB2 = c3.b(d3Var.f31635d, i14, d3Var.n());
            if (iB < iB2) {
                ArrayList<b> arrayList = d3Var.f31635d;
                ArrayList arrayList2 = new ArrayList(iB2 - iB);
                for (int i27 = iB; i27 < iB2; i27++) {
                    b bVar = arrayList.get(i27);
                    bVar.f31620a += i20;
                    arrayList2.add(bVar);
                }
                d3Var2.f31635d.addAll(c3.b(d3Var2.f31635d, d3Var2.f31651t, d3Var2.n()), arrayList2);
                arrayList.subList(iB, iB2).clear();
                zVar = arrayList2;
            } else {
                zVar = qg.z.f22752a;
            }
            if (!zVar.isEmpty()) {
                HashMap<b, s0> map = d3Var.f31636e;
                HashMap<b, s0> map2 = d3Var2.f31636e;
                if (map != null && map2 != null) {
                    int size = zVar.size();
                    for (int i28 = 0; i28 < size; i28++) {
                        b bVar2 = (b) zVar.get(i28);
                        s0 s0Var = map.get(bVar2);
                        if (s0Var != null) {
                            map.remove(bVar2);
                            map2.put(bVar2, s0Var);
                        }
                    }
                }
            }
            int i29 = d3Var2.f31653v;
            HashMap<b, s0> map3 = d3Var2.f31636e;
            s0 s0Var2 = null;
            if (map3 != null && (bVarR2 = d3Var2.R(i19)) != null) {
                s0Var2 = map3.get(bVarR2);
            }
            if (s0Var2 != null) {
                int i30 = i29 + 1;
                int i31 = d3Var2.f31651t;
                int i32 = -1;
                while (i30 < i31) {
                    i32 = i30;
                    i30 = d3Var2.f31633b[(i30 * 5) + 3] + i30;
                }
                ArrayList<Object> arrayList3 = s0Var2.f31912a;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList<>();
                    s0Var2.f31912a = arrayList3;
                }
                if (i32 < 0 || (bVarR = d3Var2.R(i32)) == null) {
                    zVar2 = zVar;
                    i11 = 0;
                } else {
                    int size2 = arrayList3.size();
                    int i33 = 0;
                    qg.z zVar3 = zVar;
                    while (i33 < size2) {
                        Object obj = arrayList3.get(i33);
                        if (kotlin.jvm.internal.r.a(obj, bVarR)) {
                            zVar2 = zVar3;
                        } else {
                            zVar2 = zVar3;
                            if (!(obj instanceof s0) || !((s0) obj).a(bVarR)) {
                                i33++;
                                zVar3 = zVar2;
                            }
                        }
                        i11 = i33;
                        break;
                    }
                    zVar2 = zVar3;
                    i11 = -1;
                }
                arrayList3.add(i11, d3Var2.b(i31));
            } else {
                zVar2 = zVar;
            }
            int iE = d3Var.E(d3Var.f31633b, i10);
            if (!z12) {
                z13 = false;
            } else if (z10) {
                boolean z16 = iE >= 0;
                if (z16) {
                    d3Var.P();
                    d3Var.a(iE - d3Var.f31651t);
                    d3Var.P();
                }
                d3Var.a(i10 - d3Var.f31651t);
                boolean zH = d3Var.H();
                if (z16) {
                    d3Var.L();
                    d3Var.i();
                    d3Var.L();
                    d3Var.i();
                }
                z13 = zH;
            } else {
                boolean zI = d3Var.I(i10, iS);
                d3Var.J(iF, i15, i10 - 1);
                z13 = zI;
            }
            if (z13) {
                q.c("Unexpectedly removed anchors");
            }
            int i34 = d3Var2.f31646o;
            int i35 = iArr3[i17 + 1];
            d3Var2.f31646o = i34 + ((1073741824 & i35) != 0 ? 1 : i35 & 67108863);
            if (z11) {
                d3Var2.f31651t = i21;
                d3Var2.f31640i = i18 + i15;
            }
            if (z15) {
                d3Var2.U(i19);
            }
            return zVar2;
        }
    }

    public d3(a3 a3Var) {
        this.f31632a = a3Var;
        int[] iArr = a3Var.f31609a;
        this.f31633b = iArr;
        Object[] objArr = a3Var.f31611c;
        this.f31634c = objArr;
        this.f31635d = a3Var.f31617j;
        this.f31636e = a3Var.f31618k;
        this.f31637f = a3Var.f31619l;
        int i10 = a3Var.f31610b;
        this.f31638g = i10;
        this.f31639h = (iArr.length / 5) - i10;
        int i11 = a3Var.f31612d;
        this.f31642k = i11;
        this.f31643l = objArr.length - i11;
        this.f31644m = i10;
        this.f31647p = new t0();
        this.f31648q = new t0();
        this.f31649r = new t0();
        this.f31652u = i10;
        this.f31653v = -1;
    }

    public static int h(int i10, int i11, int i12, int i13) {
        return i10 > i11 ? -(((i13 - i12) - i10) + 1) : i10;
    }

    public static void x(d3 d3Var) {
        int i10 = d3Var.f31653v;
        int iQ = d3Var.q(i10);
        int[] iArr = d3Var.f31633b;
        int i11 = (iQ * 5) + 1;
        int i12 = iArr[i11];
        if ((i12 & 134217728) != 0) {
            return;
        }
        int i13 = (i12 & (-134217729)) | 134217728;
        iArr[i11] = i13;
        if ((67108864 & i13) != 0) {
            return;
        }
        d3Var.U(d3Var.E(iArr, i10));
    }

    public final void A(int i10, int i11) {
        int i12 = this.f31643l;
        int i13 = this.f31642k;
        int i14 = this.f31644m;
        if (i13 != i10) {
            Object[] objArr = this.f31634c;
            if (i10 < i13) {
                System.arraycopy(objArr, i10, objArr, i10 + i12, i13 - i10);
            } else {
                int i15 = i13 + i12;
                System.arraycopy(objArr, i15, objArr, i13, (i10 + i12) - i15);
            }
        }
        int iMin = Math.min(i11 + 1, n());
        if (i14 != iMin) {
            int length = this.f31634c.length - i12;
            if (iMin < i14) {
                int iQ = q(iMin);
                int iQ2 = q(i14);
                int i16 = this.f31638g;
                while (iQ < iQ2) {
                    int i17 = (iQ * 5) + 4;
                    int i18 = this.f31633b[i17];
                    if (!(i18 >= 0)) {
                        q.c("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f31633b[i17] = -((length - i18) + 1);
                    iQ++;
                    if (iQ == i16) {
                        iQ += this.f31639h;
                    }
                }
            } else {
                int iQ3 = q(i14);
                int iQ4 = q(iMin);
                while (iQ3 < iQ4) {
                    int i19 = (iQ3 * 5) + 4;
                    int i20 = this.f31633b[i19];
                    if (!(i20 < 0)) {
                        q.c("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f31633b[i19] = i20 + length + 1;
                    iQ3++;
                    if (iQ3 == this.f31638g) {
                        iQ3 += this.f31639h;
                    }
                }
            }
            this.f31644m = iMin;
        }
        this.f31642k = i10;
    }

    public final List B(b bVar, d3 d3Var) {
        if (d3Var.f31645n <= 0) {
            q.c("Check failed");
        }
        if (this.f31645n != 0) {
            q.c("Check failed");
        }
        if (!bVar.a()) {
            q.c("Check failed");
        }
        int iC = c(bVar) + 1;
        int i10 = this.f31651t;
        if (i10 > iC || iC >= this.f31652u) {
            q.c("Check failed");
        }
        int iE = E(this.f31633b, iC);
        int iS = s(iC);
        int iD = w(iC) ? 1 : D(iC);
        List listA = a.a(this, iC, d3Var, false, false, true);
        U(iE);
        boolean z10 = iD > 0;
        while (iE >= i10) {
            int iQ = q(iE);
            int[] iArr = this.f31633b;
            int i11 = iQ * 5;
            int i12 = i11 + 3;
            iArr[i12] = iArr[i12] - iS;
            if (z10) {
                int i13 = iArr[i11 + 1];
                if ((1073741824 & i13) != 0) {
                    z10 = false;
                } else {
                    c3.d(iQ, (i13 & 67108863) - iD, iArr);
                }
            }
            iE = E(this.f31633b, iE);
        }
        if (z10) {
            if (this.f31646o < iD) {
                q.c("Check failed");
            }
            this.f31646o -= iD;
        }
        return listA;
    }

    public final Object C(int i10) {
        int iQ = q(i10);
        int[] iArr = this.f31633b;
        if ((iArr[(iQ * 5) + 1] & 1073741824) != 0) {
            return this.f31634c[g(f(iArr, iQ))];
        }
        return null;
    }

    public final int D(int i10) {
        return this.f31633b[(q(i10) * 5) + 1] & 67108863;
    }

    public final int E(int[] iArr, int i10) {
        int i11 = iArr[(q(i10) * 5) + 2];
        return i11 > -2 ? i11 : (n() + i11) - (-2);
    }

    public final Object F(Object obj) {
        if (this.f31645n > 0) {
            v(1, this.f31653v);
        }
        Object[] objArr = this.f31634c;
        int i10 = this.f31640i;
        this.f31640i = i10 + 1;
        Object obj2 = objArr[g(i10)];
        if (this.f31640i > this.f31641j) {
            q.c("Writing to an invalid slot");
        }
        this.f31634c[g(this.f31640i - 1)] = obj;
        return obj2;
    }

    public final void G() {
        int i10;
        p.x xVar = this.f31655x;
        if (xVar != null) {
            while (xVar.f20751b != 0) {
                int iH = f3.a.h(xVar);
                int iQ = q(iH);
                int iS = iH + 1;
                int iS2 = s(iH) + iH;
                while (true) {
                    if (iS >= iS2) {
                        i10 = 0;
                        break;
                    } else {
                        if ((this.f31633b[(q(iS) * 5) + 1] & 201326592) != 0) {
                            i10 = 1;
                            break;
                        }
                        iS += s(iS);
                    }
                }
                int[] iArr = this.f31633b;
                int i11 = (iQ * 5) + 1;
                int i12 = iArr[i11];
                if (((67108864 & i12) != 0 ? 1 : 0) != i10) {
                    iArr[i11] = (i10 << 26) | ((-67108865) & i12);
                    int iE = E(iArr, iH);
                    if (iE >= 0) {
                        f3.a.b(xVar, iE);
                    }
                }
            }
        }
    }

    public final boolean H() {
        b bVarR;
        b bVarR2;
        if (this.f31645n != 0) {
            q.c("Cannot remove group while inserting");
        }
        int i10 = this.f31651t;
        int i11 = this.f31640i;
        int iF = f(this.f31633b, q(i10));
        int iK = K();
        int i12 = this.f31653v;
        HashMap<b, s0> map = this.f31636e;
        s0 s0Var = (map == null || (bVarR2 = R(i12)) == null) ? null : map.get(bVarR2);
        if (s0Var != null && (bVarR = R(i10)) != null) {
            s0Var.c(bVarR);
        }
        p.x xVar = this.f31655x;
        if (xVar != null) {
            while (true) {
                int i13 = xVar.f20751b;
                if (i13 == 0) {
                    break;
                }
                if (i13 == 0) {
                    q.d.c("IntList is empty.");
                    throw null;
                }
                if (xVar.f20750a[0] < i10) {
                    break;
                }
                f3.a.h(xVar);
            }
        }
        boolean zI = I(i10, this.f31651t - i10);
        J(iF, this.f31640i - iF, i10 - 1);
        this.f31651t = i10;
        this.f31640i = i11;
        this.f31646o -= iK;
        return zI;
    }

    public final boolean I(int i10, int i11) {
        if (i11 > 0) {
            ArrayList<b> arrayList = this.f31635d;
            z(i10);
            if (!arrayList.isEmpty()) {
                HashMap<b, s0> map = this.f31636e;
                int i12 = i10 + i11;
                int iB = c3.b(this.f31635d, i12, m() - this.f31639h);
                if (iB >= this.f31635d.size()) {
                    iB--;
                }
                int i13 = iB + 1;
                int i14 = 0;
                while (iB >= 0) {
                    b bVar = this.f31635d.get(iB);
                    int iC = c(bVar);
                    if (iC < i10) {
                        break;
                    }
                    if (iC < i12) {
                        bVar.f31620a = PKIFailureInfo.systemUnavail;
                        if (map != null) {
                            map.remove(bVar);
                        }
                        if (i14 == 0) {
                            i14 = iB + 1;
                        }
                        i13 = iB;
                    }
                    iB--;
                }
                z = i13 < i14;
                if (z) {
                    this.f31635d.subList(i13, i14).clear();
                }
            }
            this.f31638g = i10;
            this.f31639h += i11;
            int i15 = this.f31644m;
            if (i15 > i10) {
                this.f31644m = Math.max(i10, i15 - i11);
            }
            int i16 = this.f31652u;
            if (i16 >= this.f31638g) {
                this.f31652u = i16 - i11;
            }
            int i17 = this.f31653v;
            if (i17 >= 0 && (this.f31633b[(q(i17) * 5) + 1] & 67108864) != 0) {
                U(i17);
            }
        }
        return z;
    }

    public final void J(int i10, int i11, int i12) {
        if (i11 > 0) {
            int i13 = this.f31643l;
            int i14 = i10 + i11;
            A(i14, i12);
            this.f31642k = i10;
            this.f31643l = i13 + i11;
            qg.m.m(this.f31634c, i10, i14, null);
            int i15 = this.f31641j;
            if (i15 >= i10) {
                this.f31641j = i15 - i11;
            }
        }
    }

    public final int K() {
        int iQ = q(this.f31651t);
        int iA = c3.a(this.f31633b, iQ) + this.f31651t;
        this.f31651t = iA;
        this.f31640i = f(this.f31633b, q(iA));
        int i10 = this.f31633b[(iQ * 5) + 1];
        if ((1073741824 & i10) != 0) {
            return 1;
        }
        return i10 & 67108863;
    }

    public final void L() {
        int i10 = this.f31652u;
        this.f31651t = i10;
        this.f31640i = f(this.f31633b, q(i10));
    }

    public final int M(int[] iArr, int i10) {
        if (i10 >= m()) {
            return this.f31634c.length - this.f31643l;
        }
        int iC = c3.c(iArr, i10);
        return iC < 0 ? (this.f31634c.length - this.f31643l) + iC + 1 : iC;
    }

    public final int N(int i10, int i11) {
        int iM = M(this.f31633b, q(i10));
        int i12 = iM + i11;
        if (!(i12 >= iM && i12 < f(this.f31633b, q(i10 + 1)))) {
            q.c("Write to an invalid slot index " + i11 + " for group " + i10);
        }
        return i12;
    }

    public final int O(int i10) {
        return f(this.f31633b, q(s(i10) + i10));
    }

    public final void P() {
        if (this.f31645n != 0) {
            q.c("Key must be supplied when inserting");
        }
        j.a.C0321a c0321a = j.a.f31715a;
        Q(0, c0321a, c0321a, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(int i10, Object obj, Object obj2, boolean z10) {
        int i11;
        b bVarR;
        int i12 = this.f31653v;
        Object[] objArr = this.f31645n > 0;
        this.f31649r.c(this.f31646o);
        j.a.C0321a c0321a = j.a.f31715a;
        if (objArr == true) {
            int i13 = this.f31651t;
            int iF = f(this.f31633b, q(i13));
            u(1);
            this.f31640i = iF;
            this.f31641j = iF;
            int iQ = q(i13);
            int i14 = obj != c0321a ? 1 : 0;
            int i15 = (z10 || obj2 == c0321a) ? 0 : 1;
            int iH = h(iF, this.f31642k, this.f31643l, this.f31634c.length);
            if (iH >= 0 && this.f31644m < i13) {
                iH = -(((this.f31634c.length - this.f31643l) - iH) + 1);
            }
            int[] iArr = this.f31633b;
            int i16 = this.f31653v;
            int i17 = iQ * 5;
            iArr[i17] = i10;
            iArr[i17 + 1] = ((z10 ? 1 : 0) << 30) | (i14 << 29) | (i15 << 28);
            iArr[i17 + 2] = i16;
            iArr[i17 + 3] = 0;
            iArr[i17 + 4] = iH;
            int i18 = (z10 ? 1 : 0) + i14 + i15;
            if (i18 > 0) {
                v(i18, i13);
                Object[] objArr2 = this.f31634c;
                int i19 = this.f31640i;
                if (z10) {
                    objArr2[i19] = obj2;
                    i19++;
                }
                if (i14 != 0) {
                    objArr2[i19] = obj;
                    i19++;
                }
                if (i15 != 0) {
                    objArr2[i19] = obj2;
                    i19++;
                }
                this.f31640i = i19;
            }
            this.f31646o = 0;
            i11 = i13 + 1;
            this.f31653v = i13;
            this.f31651t = i11;
            if (i12 >= 0) {
                HashMap<b, s0> map = this.f31636e;
                s0 s0Var = null;
                if (map != null && (bVarR = R(i12)) != null) {
                    s0Var = map.get(bVarR);
                }
                if (s0Var != null) {
                    s0 s0VarB = s0Var.b();
                    b bVarB = b(i13);
                    ArrayList<Object> arrayList = s0VarB.f31912a;
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    s0VarB.f31912a = arrayList;
                    arrayList.add(bVarB);
                }
            }
        } else {
            this.f31647p.c(i12);
            this.f31648q.c((m() - this.f31639h) - this.f31652u);
            int i20 = this.f31651t;
            int iQ2 = q(i20);
            if (!kotlin.jvm.internal.r.a(obj2, c0321a)) {
                if (z10) {
                    V(this.f31651t, obj2);
                } else {
                    T(obj2);
                }
            }
            this.f31640i = M(this.f31633b, iQ2);
            this.f31641j = f(this.f31633b, q(this.f31651t + 1));
            int[] iArr2 = this.f31633b;
            int i21 = iQ2 * 5;
            this.f31646o = iArr2[i21 + 1] & 67108863;
            this.f31653v = i20;
            this.f31651t = i20 + 1;
            i11 = i20 + iArr2[i21 + 3];
        }
        this.f31652u = i11;
    }

    public final b R(int i10) {
        ArrayList<b> arrayList;
        int iE;
        if (i10 < 0 || i10 >= n() || (iE = c3.e((arrayList = this.f31635d), i10, n())) < 0) {
            return null;
        }
        return arrayList.get(iE);
    }

    public final void S(Object obj) {
        if (this.f31645n <= 0 || this.f31640i == this.f31642k) {
            F(obj);
            return;
        }
        p.y<p.h0<Object>> yVar = this.f31650s;
        if (yVar == null) {
            yVar = new p.y<>();
        }
        this.f31650s = yVar;
        int i10 = this.f31653v;
        p.h0<Object> h0VarB = yVar.b(i10);
        if (h0VarB == null) {
            h0VarB = new p.h0<>((Object) null);
            yVar.h(i10, h0VarB);
        }
        h0VarB.g(obj);
    }

    public final void T(Object obj) {
        int iQ = q(this.f31651t);
        int i10 = (iQ * 5) + 1;
        if ((this.f31633b[i10] & 268435456) == 0) {
            q.c("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f31634c;
        int[] iArr = this.f31633b;
        objArr[g(Integer.bitCount(iArr[i10] >> 29) + f(iArr, iQ))] = obj;
    }

    public final void U(int i10) {
        if (i10 >= 0) {
            p.x xVar = this.f31655x;
            if (xVar == null) {
                xVar = new p.x();
                this.f31655x = xVar;
            }
            f3.a.b(xVar, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(int i10, Object obj) {
        boolean z10;
        int iQ = q(i10);
        int[] iArr = this.f31633b;
        if (iQ < iArr.length) {
            z10 = (iArr[(iQ * 5) + 1] & 1073741824) != 0;
        }
        if (!z10) {
            q.c("Updating the node of a group at " + i10 + " that was not created with as a node group");
        }
        this.f31634c[g(f(this.f31633b, iQ))] = obj;
    }

    public final void a(int i10) {
        boolean z10 = false;
        if (!(i10 >= 0)) {
            q.c("Cannot seek backwards");
        }
        if (!(this.f31645n <= 0)) {
            b2.b("Cannot call seek() while inserting");
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.f31651t + i10;
        if (i11 >= this.f31653v && i11 <= this.f31652u) {
            z10 = true;
        }
        if (!z10) {
            q.c("Cannot seek outside the current group (" + this.f31653v + '-' + this.f31652u + ')');
        }
        this.f31651t = i11;
        int iF = f(this.f31633b, q(i11));
        this.f31640i = iF;
        this.f31641j = iF;
    }

    public final b b(int i10) {
        ArrayList<b> arrayList = this.f31635d;
        int iE = c3.e(arrayList, i10, n());
        if (iE >= 0) {
            return arrayList.get(iE);
        }
        if (i10 > this.f31638g) {
            i10 = -(n() - i10);
        }
        b bVar = new b(i10);
        arrayList.add(-(iE + 1), bVar);
        return bVar;
    }

    public final int c(b bVar) {
        int i10 = bVar.f31620a;
        return i10 < 0 ? n() + i10 : i10;
    }

    public final void d() {
        int i10 = this.f31645n;
        this.f31645n = i10 + 1;
        if (i10 == 0) {
            this.f31648q.c((m() - this.f31639h) - this.f31652u);
        }
    }

    public final void e(boolean z10) {
        this.f31654w = true;
        if (z10 && this.f31647p.f31916b == 0) {
            z(n());
            A(this.f31634c.length - this.f31643l, this.f31638g);
            int i10 = this.f31642k;
            Arrays.fill(this.f31634c, i10, this.f31643l + i10, (Object) null);
            G();
        }
        int[] iArr = this.f31633b;
        int i11 = this.f31638g;
        Object[] objArr = this.f31634c;
        int i12 = this.f31642k;
        ArrayList<b> arrayList = this.f31635d;
        HashMap<b, s0> map = this.f31636e;
        p.y<p.z> yVar = this.f31637f;
        a3 a3Var = this.f31632a;
        if (!a3Var.f31615g) {
            b2.a("Unexpected writer close()");
        }
        a3Var.f31615g = false;
        a3Var.f31609a = iArr;
        a3Var.f31610b = i11;
        a3Var.f31611c = objArr;
        a3Var.f31612d = i12;
        a3Var.f31617j = arrayList;
        a3Var.f31618k = map;
        a3Var.f31619l = yVar;
    }

    public final int f(int[] iArr, int i10) {
        if (i10 >= m()) {
            return this.f31634c.length - this.f31643l;
        }
        int i11 = iArr[(i10 * 5) + 4];
        return i11 < 0 ? (this.f31634c.length - this.f31643l) + i11 + 1 : i11;
    }

    public final int g(int i10) {
        return (this.f31643l * (i10 < this.f31642k ? 0 : 1)) + i10;
    }

    public final void i() {
        p.h0<Object> h0VarB;
        boolean z10 = this.f31645n > 0;
        int i10 = this.f31651t;
        int i11 = this.f31652u;
        int i12 = this.f31653v;
        int iQ = q(i12);
        int i13 = this.f31646o;
        int i14 = i10 - i12;
        int i15 = iQ * 5;
        int i16 = i15 + 1;
        boolean z11 = (this.f31633b[i16] & 1073741824) != 0;
        t0 t0Var = this.f31649r;
        if (z10) {
            p.y<p.h0<Object>> yVar = this.f31650s;
            if (yVar != null && (h0VarB = yVar.b(i12)) != null) {
                Object[] objArr = h0VarB.f20706a;
                int i17 = h0VarB.f20707b;
                for (int i18 = 0; i18 < i17; i18++) {
                    F(objArr[i18]);
                }
                yVar.g(i12);
            }
            int[] iArr = this.f31633b;
            iArr[i15 + 3] = i14;
            c3.d(iQ, i13, iArr);
            int iB = t0Var.b();
            if (z11) {
                i13 = 1;
            }
            this.f31646o = iB + i13;
            int iE = E(this.f31633b, i12);
            this.f31653v = iE;
            int iN = iE < 0 ? n() : q(iE + 1);
            int iF = iN >= 0 ? f(this.f31633b, iN) : 0;
            this.f31640i = iF;
            this.f31641j = iF;
            return;
        }
        if (i10 != i11) {
            q.c("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f31633b;
        int i19 = i15 + 3;
        int i20 = iArr2[i19];
        int i21 = iArr2[i16] & 67108863;
        iArr2[i19] = i14;
        c3.d(iQ, i13, iArr2);
        int iB2 = this.f31647p.b();
        this.f31652u = (m() - this.f31639h) - this.f31648q.b();
        this.f31653v = iB2;
        int iE2 = E(this.f31633b, i12);
        int iB3 = t0Var.b();
        this.f31646o = iB3;
        if (iE2 == iB2) {
            this.f31646o = iB3 + (z11 ? 0 : i13 - i21);
            return;
        }
        int i22 = i14 - i20;
        int i23 = z11 ? 0 : i13 - i21;
        if (i22 != 0 || i23 != 0) {
            while (iE2 != 0 && iE2 != iB2 && (i23 != 0 || i22 != 0)) {
                int iQ2 = q(iE2);
                if (i22 != 0) {
                    int[] iArr3 = this.f31633b;
                    int i24 = (iQ2 * 5) + 3;
                    iArr3[i24] = iArr3[i24] + i22;
                }
                if (i23 != 0) {
                    int[] iArr4 = this.f31633b;
                    c3.d(iQ2, (iArr4[(iQ2 * 5) + 1] & 67108863) + i23, iArr4);
                }
                int[] iArr5 = this.f31633b;
                if ((iArr5[(iQ2 * 5) + 1] & 1073741824) != 0) {
                    i23 = 0;
                }
                iE2 = E(iArr5, iE2);
            }
        }
        this.f31646o += i23;
    }

    public final void j() {
        if (this.f31645n <= 0) {
            b2.b("Unbalanced begin/end insert");
        }
        int i10 = this.f31645n - 1;
        this.f31645n = i10;
        if (i10 == 0) {
            if (this.f31649r.f31916b != this.f31647p.f31916b) {
                q.c("startGroup/endGroup mismatch while inserting");
            }
            this.f31652u = (m() - this.f31639h) - this.f31648q.b();
        }
    }

    public final void k(int i10) {
        boolean z10 = false;
        if (!(this.f31645n <= 0)) {
            q.c("Cannot call ensureStarted() while inserting");
        }
        int i11 = this.f31653v;
        if (i11 != i10) {
            if (i10 >= i11 && i10 < this.f31652u) {
                z10 = true;
            }
            if (!z10) {
                q.c("Started group at " + i10 + " must be a subgroup of the group at " + i11);
            }
            int i12 = this.f31651t;
            int i13 = this.f31640i;
            int i14 = this.f31641j;
            this.f31651t = i10;
            P();
            this.f31651t = i12;
            this.f31640i = i13;
            this.f31641j = i14;
        }
    }

    public final void l(int i10, int i11, int i12) {
        if (i10 >= this.f31638g) {
            i10 = -((n() - i10) + 2);
        }
        while (i12 < i11) {
            this.f31633b[(q(i12) * 5) + 2] = i10;
            int i13 = this.f31633b[(q(i12) * 5) + 3] + i12;
            l(i12, i13, i12 + 1);
            i12 = i13;
        }
    }

    public final int m() {
        return this.f31633b.length / 5;
    }

    public final int n() {
        return m() - this.f31639h;
    }

    public final int o() {
        return this.f31634c.length - this.f31643l;
    }

    public final Object p(int i10) {
        int iQ = q(i10);
        int[] iArr = this.f31633b;
        int i11 = (iQ * 5) + 1;
        if ((iArr[i11] & 268435456) == 0) {
            return j.a.f31715a;
        }
        return this.f31634c[Integer.bitCount(iArr[i11] >> 29) + f(iArr, iQ)];
    }

    public final int q(int i10) {
        return (this.f31639h * (i10 < this.f31638g ? 0 : 1)) + i10;
    }

    public final Object r(int i10) {
        int iQ = q(i10);
        int[] iArr = this.f31633b;
        int i11 = iQ * 5;
        int i12 = iArr[i11 + 1];
        if ((536870912 & i12) == 0) {
            return null;
        }
        return this.f31634c[Integer.bitCount(i12 >> 30) + iArr[i11 + 4]];
    }

    public final int s(int i10) {
        return c3.a(this.f31633b, q(i10));
    }

    public final boolean t(int i10, int i11) {
        int iM;
        int iS;
        if (i11 == this.f31653v) {
            iM = this.f31652u;
        } else {
            t0 t0Var = this.f31647p;
            if (i11 > t0Var.a(0)) {
                iS = s(i11);
            } else {
                int[] iArr = t0Var.f31915a;
                int iMin = Math.min(iArr.length, t0Var.f31916b);
                int i12 = 0;
                while (true) {
                    if (i12 >= iMin) {
                        i12 = -1;
                        break;
                    }
                    if (iArr[i12] == i11) {
                        break;
                    }
                    i12++;
                }
                if (i12 < 0) {
                    iS = s(i11);
                } else {
                    iM = (m() - this.f31639h) - this.f31648q.f31915a[i12];
                }
            }
            iM = iS + i11;
        }
        return i10 > i11 && i10 < iM;
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f31651t + " end=" + this.f31652u + " size = " + n() + " gap=" + this.f31638g + '-' + (this.f31638g + this.f31639h) + ')';
    }

    public final void u(int i10) {
        if (i10 > 0) {
            int i11 = this.f31651t;
            z(i11);
            int i12 = this.f31638g;
            int i13 = this.f31639h;
            int[] iArr = this.f31633b;
            int length = iArr.length / 5;
            int i14 = length - i13;
            if (i13 < i10) {
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                int[] iArr2 = new int[iMax * 5];
                int i15 = iMax - i14;
                qg.m.d(0, iArr, 0, i12 * 5, iArr2);
                qg.m.d((i12 + i15) * 5, iArr, (i13 + i12) * 5, length * 5, iArr2);
                this.f31633b = iArr2;
                i13 = i15;
            }
            int i16 = this.f31652u;
            if (i16 >= i12) {
                this.f31652u = i16 + i10;
            }
            int i17 = i12 + i10;
            this.f31638g = i17;
            this.f31639h = i13 - i10;
            int iH = h(i14 > 0 ? f(this.f31633b, q(i11 + i10)) : 0, this.f31644m >= i12 ? this.f31642k : 0, this.f31643l, this.f31634c.length);
            for (int i18 = i12; i18 < i17; i18++) {
                this.f31633b[(i18 * 5) + 4] = iH;
            }
            int i19 = this.f31644m;
            if (i19 >= i12) {
                this.f31644m = i19 + i10;
            }
        }
    }

    public final void v(int i10, int i11) {
        if (i10 > 0) {
            A(this.f31640i, i11);
            int i12 = this.f31642k;
            int i13 = this.f31643l;
            if (i13 < i10) {
                Object[] objArr = this.f31634c;
                int length = objArr.length;
                int i14 = length - i13;
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i15 = 0; i15 < iMax; i15++) {
                    objArr2[i15] = null;
                }
                int i16 = iMax - i14;
                int i17 = i13 + i12;
                System.arraycopy(objArr, 0, objArr2, 0, i12);
                System.arraycopy(objArr, i17, objArr2, i12 + i16, length - i17);
                this.f31634c = objArr2;
                i13 = i16;
            }
            int i18 = this.f31641j;
            if (i18 >= i12) {
                this.f31641j = i18 + i10;
            }
            this.f31642k = i12 + i10;
            this.f31643l = i13 - i10;
        }
    }

    public final boolean w(int i10) {
        return (this.f31633b[(q(i10) * 5) + 1] & 1073741824) != 0;
    }

    public final void y(a3 a3Var, int i10) {
        if (this.f31645n <= 0) {
            q.c("Check failed");
        }
        if (i10 == 0 && this.f31651t == 0 && this.f31632a.f31610b == 0) {
            int[] iArr = a3Var.f31609a;
            int i11 = iArr[(i10 * 5) + 3];
            int i12 = a3Var.f31610b;
            if (i11 == i12) {
                int[] iArr2 = this.f31633b;
                Object[] objArr = this.f31634c;
                ArrayList<b> arrayList = this.f31635d;
                HashMap<b, s0> map = this.f31636e;
                p.y<p.z> yVar = this.f31637f;
                Object[] objArr2 = a3Var.f31611c;
                int i13 = a3Var.f31612d;
                HashMap<b, s0> map2 = a3Var.f31618k;
                p.y<p.z> yVar2 = a3Var.f31619l;
                this.f31633b = iArr;
                this.f31634c = objArr2;
                this.f31635d = a3Var.f31617j;
                this.f31638g = i12;
                this.f31639h = (iArr.length / 5) - i12;
                this.f31642k = i13;
                this.f31643l = objArr2.length - i13;
                this.f31644m = i12;
                this.f31636e = map2;
                this.f31637f = yVar2;
                a3Var.f31609a = iArr2;
                a3Var.f31610b = 0;
                a3Var.f31611c = objArr;
                a3Var.f31612d = 0;
                a3Var.f31617j = arrayList;
                a3Var.f31618k = map;
                a3Var.f31619l = yVar;
                return;
            }
        }
        d3 d3VarG = a3Var.g();
        try {
            a.a(d3VarG, i10, this, true, true, false);
            d3VarG.e(true);
        } catch (Throwable th2) {
            d3VarG.e(false);
            throw th2;
        }
    }

    public final void z(int i10) {
        b bVar;
        int i11;
        b bVar2;
        int i12;
        int i13;
        int i14 = this.f31639h;
        int i15 = this.f31638g;
        if (i15 != i10) {
            if (!this.f31635d.isEmpty()) {
                int iM = m() - this.f31639h;
                if (i15 < i10) {
                    for (int iB = c3.b(this.f31635d, i15, iM); iB < this.f31635d.size() && (i12 = (bVar2 = this.f31635d.get(iB)).f31620a) < 0 && (i13 = i12 + iM) < i10; iB++) {
                        bVar2.f31620a = i13;
                    }
                } else {
                    for (int iB2 = c3.b(this.f31635d, i10, iM); iB2 < this.f31635d.size() && (i11 = (bVar = this.f31635d.get(iB2)).f31620a) >= 0; iB2++) {
                        bVar.f31620a = -(iM - i11);
                    }
                }
            }
            if (i14 > 0) {
                int[] iArr = this.f31633b;
                int i16 = i10 * 5;
                int i17 = i14 * 5;
                int i18 = i15 * 5;
                if (i10 < i15) {
                    qg.m.d(i17 + i16, iArr, i16, i18, iArr);
                } else {
                    qg.m.d(i18, iArr, i18 + i17, i16 + i17, iArr);
                }
            }
            if (i10 < i15) {
                i15 = i10 + i14;
            }
            int iM2 = m();
            if (i15 >= iM2) {
                q.c("Check failed");
            }
            while (i15 < iM2) {
                int i19 = (i15 * 5) + 2;
                int i20 = this.f31633b[i19];
                int iN = i20 > -2 ? i20 : (n() + i20) - (-2);
                if (iN >= i10) {
                    iN = -((n() - iN) - (-2));
                }
                if (iN != i20) {
                    this.f31633b[i19] = iN;
                }
                i15++;
                if (i15 == i10) {
                    i15 += i14;
                }
            }
        }
        this.f31638g = i10;
    }
}
