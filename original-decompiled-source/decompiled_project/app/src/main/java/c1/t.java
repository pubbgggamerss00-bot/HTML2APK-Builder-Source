package c1;

import d0.z1;
import java.util.Arrays;
import x0.b2;

/* loaded from: classes.dex */
public final class t<K, V> {

    /* renamed from: e, reason: collision with root package name */
    public static final t f4579e = new t(0, 0, new Object[0], null);

    /* renamed from: a, reason: collision with root package name */
    public int f4580a;

    /* renamed from: b, reason: collision with root package name */
    public int f4581b;

    /* renamed from: c, reason: collision with root package name */
    public final z1 f4582c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f4583d;

    public static final class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public t<K, V> f4584a;

        /* renamed from: b, reason: collision with root package name */
        public final int f4585b;

        public a(t<K, V> tVar, int i10) {
            this.f4584a = tVar;
            this.f4585b = i10;
        }
    }

    public t(int i10, int i11, Object[] objArr, z1 z1Var) {
        this.f4580a = i10;
        this.f4581b = i11;
        this.f4582c = z1Var;
        this.f4583d = objArr;
    }

    public static t j(int i10, Object obj, Object obj2, int i11, Object obj3, Object obj4, int i12, z1 z1Var) {
        if (i12 > 30) {
            return new t(0, 0, new Object[]{obj, obj2, obj3, obj4}, z1Var);
        }
        int iG = x.g(i10, i12);
        int iG2 = x.g(i11, i12);
        if (iG != iG2) {
            return new t((1 << iG) | (1 << iG2), 0, iG < iG2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, z1Var);
        }
        return new t(0, 1 << iG, new Object[]{j(i10, obj, obj2, i11, obj3, obj4, i12 + 5, z1Var)}, z1Var);
    }

    public final Object[] a(int i10, int i11, int i12, K k10, V v10, int i13, z1 z1Var) {
        Object obj = this.f4583d[i10];
        t tVarJ = j(obj != null ? obj.hashCode() : 0, obj, x(i10), i12, k10, v10, i13 + 5, z1Var);
        int iT = t(i11);
        int i14 = iT + 1;
        Object[] objArr = this.f4583d;
        Object[] objArr2 = new Object[objArr.length - 1];
        qg.m.i(objArr, 0, objArr2, i10, 6);
        qg.m.g(objArr, i10, objArr2, i10 + 2, i14);
        objArr2[iT - 1] = tVarJ;
        qg.m.g(objArr, iT, objArr2, i14, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.f4581b == 0) {
            return this.f4583d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f4580a);
        int length = this.f4583d.length;
        for (int i10 = iBitCount * 2; i10 < length; i10++) {
            iBitCount += s(i10).b();
        }
        return iBitCount;
    }

    public final boolean c(K k10) {
        jh.e eVarP = jh.j.p(jh.j.q(0, this.f4583d.length), 2);
        int i10 = eVarP.f15744a;
        int i11 = eVarP.f15745b;
        int i12 = eVarP.f15746c;
        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
            while (!kotlin.jvm.internal.r.a(k10, this.f4583d[i10])) {
                if (i10 != i11) {
                    i10 += i12;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(Object obj, int i10, int i11) {
        int iG = 1 << x.g(i10, i11);
        if (h(iG)) {
            return kotlin.jvm.internal.r.a(obj, this.f4583d[f(iG)]);
        }
        if (!i(iG)) {
            return false;
        }
        t<K, V> tVarS = s(t(iG));
        return i11 == 30 ? tVarS.c(obj) : tVarS.d(obj, i10, i11 + 5);
    }

    public final boolean e(t<K, V> tVar) {
        if (this == tVar) {
            return true;
        }
        if (this.f4581b == tVar.f4581b && this.f4580a == tVar.f4580a) {
            int length = this.f4583d.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.f4583d[i10] == tVar.f4583d[i10]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i10) {
        return Integer.bitCount((i10 - 1) & this.f4580a) * 2;
    }

    public final Object g(Object obj, int i10, int i11) {
        int iG = 1 << x.g(i10, i11);
        if (h(iG)) {
            int iF = f(iG);
            if (kotlin.jvm.internal.r.a(obj, this.f4583d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iG)) {
            return null;
        }
        t<K, V> tVarS = s(t(iG));
        if (i11 != 30) {
            return tVarS.g(obj, i10, i11 + 5);
        }
        jh.e eVarP = jh.j.p(jh.j.q(0, tVarS.f4583d.length), 2);
        int i12 = eVarP.f15744a;
        int i13 = eVarP.f15745b;
        int i14 = eVarP.f15746c;
        if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
            return null;
        }
        while (!kotlin.jvm.internal.r.a(obj, tVarS.f4583d[i12])) {
            if (i12 == i13) {
                return null;
            }
            i12 += i14;
        }
        return tVarS.x(i12);
    }

    public final boolean h(int i10) {
        return (i10 & this.f4580a) != 0;
    }

    public final boolean i(int i10) {
        return (i10 & this.f4581b) != 0;
    }

    public final t<K, V> k(int i10, f<K, V> fVar) {
        fVar.e(fVar.f4567f - 1);
        fVar.f4565d = x(i10);
        Object[] objArr = this.f4583d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f4582c != fVar.f4563b) {
            return new t<>(0, 0, x.b(i10, objArr), fVar.f4563b);
        }
        this.f4583d = x.b(i10, objArr);
        return this;
    }

    public final t<K, V> l(int i10, K k10, V v10, int i11, f<K, V> fVar) {
        f<K, V> fVar2;
        t<K, V> tVarL;
        int iG = 1 << x.g(i10, i11);
        boolean zH = h(iG);
        z1 z1Var = this.f4582c;
        if (zH) {
            int iF = f(iG);
            if (!kotlin.jvm.internal.r.a(k10, this.f4583d[iF])) {
                fVar.e(fVar.f4567f + 1);
                z1 z1Var2 = fVar.f4563b;
                if (z1Var != z1Var2) {
                    return new t<>(this.f4580a ^ iG, this.f4581b | iG, a(iF, iG, i10, k10, v10, i11, z1Var2), z1Var2);
                }
                this.f4583d = a(iF, iG, i10, k10, v10, i11, z1Var2);
                this.f4580a ^= iG;
                this.f4581b |= iG;
                return this;
            }
            fVar.f4565d = x(iF);
            if (x(iF) == v10) {
                return this;
            }
            if (z1Var == fVar.f4563b) {
                this.f4583d[iF + 1] = v10;
                return this;
            }
            fVar.f4566e++;
            Object[] objArr = this.f4583d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.r.d(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iF + 1] = v10;
            return new t<>(this.f4580a, this.f4581b, objArrCopyOf, fVar.f4563b);
        }
        if (!i(iG)) {
            fVar.e(fVar.f4567f + 1);
            z1 z1Var3 = fVar.f4563b;
            int iF2 = f(iG);
            if (z1Var != z1Var3) {
                return new t<>(this.f4580a | iG, this.f4581b, x.a(this.f4583d, iF2, k10, v10), z1Var3);
            }
            this.f4583d = x.a(this.f4583d, iF2, k10, v10);
            this.f4580a |= iG;
            return this;
        }
        int iT = t(iG);
        t<K, V> tVarS = s(iT);
        if (i11 == 30) {
            jh.e eVarP = jh.j.p(jh.j.q(0, tVarS.f4583d.length), 2);
            int i12 = eVarP.f15744a;
            int i13 = eVarP.f15745b;
            int i14 = eVarP.f15746c;
            if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
                fVar.e(fVar.f4567f + 1);
                tVarL = new t<>(0, 0, x.a(tVarS.f4583d, 0, k10, v10), fVar.f4563b);
                fVar2 = fVar;
            } else {
                while (!kotlin.jvm.internal.r.a(k10, tVarS.f4583d[i12])) {
                    if (i12 == i13) {
                        fVar.e(fVar.f4567f + 1);
                        tVarL = new t<>(0, 0, x.a(tVarS.f4583d, 0, k10, v10), fVar.f4563b);
                        break;
                    }
                    i12 += i14;
                }
                fVar.f4565d = tVarS.x(i12);
                if (tVarS.f4582c == fVar.f4563b) {
                    tVarS.f4583d[i12 + 1] = v10;
                    tVarL = tVarS;
                } else {
                    fVar.f4566e++;
                    Object[] objArr2 = tVarS.f4583d;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    kotlin.jvm.internal.r.d(objArrCopyOf2, "copyOf(...)");
                    objArrCopyOf2[i12 + 1] = v10;
                    tVarL = new t<>(0, 0, objArrCopyOf2, fVar.f4563b);
                }
                fVar2 = fVar;
            }
        } else {
            fVar2 = fVar;
            tVarL = tVarS.l(i10, k10, v10, i11 + 5, fVar2);
        }
        return tVarS == tVarL ? this : r(iT, tVarL, fVar2.f4563b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r27v0, types: [c1.t, c1.t<K, V>] */
    /* JADX WARN: Type inference failed for: r4v18, types: [c1.t] */
    /* JADX WARN: Type inference failed for: r5v14, types: [c1.t] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v20, types: [c1.t] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v26, types: [c1.t] */
    /* JADX WARN: Type inference failed for: r5v28, types: [c1.t] */
    /* JADX WARN: Type inference failed for: r5v29, types: [c1.t] */
    public final t<K, V> m(t<K, V> tVar, int i10, e1.a aVar, f<K, V> fVar) {
        ?? r17;
        ?? J;
        if (this == tVar) {
            aVar.f8338a += b();
            return this;
        }
        int i11 = 0;
        if (i10 > 30) {
            z1 z1Var = fVar.f4563b;
            int i12 = tVar.f4581b;
            Object[] objArr = this.f4583d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + tVar.f4583d.length);
            kotlin.jvm.internal.r.d(objArrCopyOf, "copyOf(...)");
            int length = this.f4583d.length;
            jh.e eVarP = jh.j.p(jh.j.q(0, tVar.f4583d.length), 2);
            int i13 = eVarP.f15744a;
            int i14 = eVarP.f15745b;
            int i15 = eVarP.f15746c;
            if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
                while (true) {
                    if (c(tVar.f4583d[i13])) {
                        aVar.f8338a++;
                    } else {
                        Object[] objArr2 = tVar.f4583d;
                        objArrCopyOf[length] = objArr2[i13];
                        objArrCopyOf[length + 1] = objArr2[i13 + 1];
                        length += 2;
                    }
                    if (i13 == i14) {
                        break;
                    }
                    i13 += i15;
                }
            }
            if (length != this.f4583d.length) {
                if (length == tVar.f4583d.length) {
                    return tVar;
                }
                if (length == objArrCopyOf.length) {
                    return new t<>(0, 0, objArrCopyOf, z1Var);
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
                kotlin.jvm.internal.r.d(objArrCopyOf2, "copyOf(...)");
                return new t<>(0, 0, objArrCopyOf2, z1Var);
            }
        } else {
            int i16 = this.f4581b | tVar.f4581b;
            int i17 = this.f4580a;
            int i18 = tVar.f4580a;
            int i19 = (i17 ^ i18) & (~i16);
            int i20 = i17 & i18;
            int i21 = i19;
            while (i20 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i20);
                if (kotlin.jvm.internal.r.a(this.f4583d[f(iLowestOneBit)], tVar.f4583d[tVar.f(iLowestOneBit)])) {
                    i21 |= iLowestOneBit;
                } else {
                    i16 |= iLowestOneBit;
                }
                i20 ^= iLowestOneBit;
            }
            if ((i16 & i21) != 0) {
                b2.b("Check failed.");
            }
            t<K, V> tVar2 = (kotlin.jvm.internal.r.a(this.f4582c, fVar.f4563b) && this.f4580a == i21 && this.f4581b == i16) ? this : new t<>(i21, i16, new Object[Integer.bitCount(i16) + (Integer.bitCount(i21) * 2)], null);
            int i22 = i16;
            int i23 = 0;
            while (i22 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i22);
                Object[] objArr3 = tVar2.f4583d;
                int length2 = (objArr3.length - 1) - i23;
                if (i(iLowestOneBit2)) {
                    J = s(t(iLowestOneBit2));
                    if (tVar.i(iLowestOneBit2)) {
                        J = J.m(tVar.s(tVar.t(iLowestOneBit2)), i10 + 5, aVar, fVar);
                        r17 = objArr3;
                    } else if (tVar.h(iLowestOneBit2)) {
                        int iF = tVar.f(iLowestOneBit2);
                        Object obj = tVar.f4583d[iF];
                        V vX = tVar.x(iF);
                        int i24 = fVar.f4567f;
                        r17 = objArr3;
                        J = J.l(obj != null ? obj.hashCode() : i11, obj, vX, i10 + 5, fVar);
                        if (fVar.f4567f == i24) {
                            aVar.f8338a++;
                        }
                    } else {
                        r17 = objArr3;
                    }
                } else {
                    r17 = objArr3;
                    if (tVar.i(iLowestOneBit2)) {
                        t<K, V> tVarS = tVar.s(tVar.t(iLowestOneBit2));
                        if (h(iLowestOneBit2)) {
                            int iF2 = f(iLowestOneBit2);
                            Object obj2 = this.f4583d[iF2];
                            int i25 = i10 + 5;
                            if (tVarS.d(obj2, obj2 != null ? obj2.hashCode() : 0, i25)) {
                                aVar.f8338a++;
                                J = tVarS;
                            } else {
                                J = tVarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i25, fVar);
                            }
                        } else {
                            J = tVarS;
                        }
                    } else {
                        int iF3 = f(iLowestOneBit2);
                        Object obj3 = this.f4583d[iF3];
                        Object objX = x(iF3);
                        int iF4 = tVar.f(iLowestOneBit2);
                        Object obj4 = tVar.f4583d[iF4];
                        J = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX, obj4 != null ? obj4.hashCode() : 0, obj4, tVar.x(iF4), i10 + 5, fVar.f4563b);
                    }
                }
                r17[length2] = J;
                i23++;
                i22 ^= iLowestOneBit2;
                i11 = 0;
            }
            int i26 = 0;
            while (i21 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i21);
                int i27 = i26 * 2;
                if (tVar.h(iLowestOneBit3)) {
                    int iF5 = tVar.f(iLowestOneBit3);
                    Object[] objArr4 = tVar2.f4583d;
                    objArr4[i27] = tVar.f4583d[iF5];
                    objArr4[i27 + 1] = tVar.x(iF5);
                    if (h(iLowestOneBit3)) {
                        aVar.f8338a++;
                    }
                } else {
                    int iF6 = f(iLowestOneBit3);
                    Object[] objArr5 = tVar2.f4583d;
                    objArr5[i27] = this.f4583d[iF6];
                    objArr5[i27 + 1] = x(iF6);
                }
                i26++;
                i21 ^= iLowestOneBit3;
            }
            if (!e(tVar2)) {
                return tVar.e(tVar2) ? tVar : tVar2;
            }
        }
        return this;
    }

    public final t<K, V> n(int i10, K k10, int i11, f<K, V> fVar) {
        t<K, V> tVarN;
        int iG = 1 << x.g(i10, i11);
        if (h(iG)) {
            int iF = f(iG);
            if (kotlin.jvm.internal.r.a(k10, this.f4583d[iF])) {
                return p(iF, iG, fVar);
            }
        } else if (i(iG)) {
            int iT = t(iG);
            t<K, V> tVarS = s(iT);
            if (i11 == 30) {
                jh.e eVarP = jh.j.p(jh.j.q(0, tVarS.f4583d.length), 2);
                int i12 = eVarP.f15744a;
                int i13 = eVarP.f15745b;
                int i14 = eVarP.f15746c;
                if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
                    tVarN = tVarS;
                    break;
                }
                while (!kotlin.jvm.internal.r.a(k10, tVarS.f4583d[i12])) {
                    if (i12 == i13) {
                        tVarN = tVarS;
                        break;
                    }
                    i12 += i14;
                }
                tVarN = tVarS.k(i12, fVar);
            } else {
                tVarN = tVarS.n(i10, k10, i11 + 5, fVar);
            }
            return q(tVarS, tVarN, iT, iG, fVar.f4563b);
        }
        return this;
    }

    public final t<K, V> o(int i10, K k10, V v10, int i11, f<K, V> fVar) {
        t<K, V> tVar;
        t<K, V> tVarO;
        int iG = 1 << x.g(i10, i11);
        if (h(iG)) {
            int iF = f(iG);
            if (kotlin.jvm.internal.r.a(k10, this.f4583d[iF]) && kotlin.jvm.internal.r.a(v10, x(iF))) {
                return p(iF, iG, fVar);
            }
        } else if (i(iG)) {
            int iT = t(iG);
            t<K, V> tVarS = s(iT);
            if (i11 == 30) {
                jh.e eVarP = jh.j.p(jh.j.q(0, tVarS.f4583d.length), 2);
                int i12 = eVarP.f15744a;
                int i13 = eVarP.f15745b;
                int i14 = eVarP.f15746c;
                if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
                    tVarO = tVarS;
                    tVar = tVarS;
                } else {
                    while (true) {
                        if (!kotlin.jvm.internal.r.a(k10, tVarS.f4583d[i12]) || !kotlin.jvm.internal.r.a(v10, tVarS.x(i12))) {
                            if (i12 == i13) {
                                break;
                            }
                            i12 += i14;
                        } else {
                            tVarO = tVarS.k(i12, fVar);
                            break;
                        }
                    }
                    tVarO = tVarS;
                    tVar = tVarS;
                }
            } else {
                tVar = tVarS;
                tVarO = tVar.o(i10, k10, v10, i11 + 5, fVar);
            }
            return q(tVar, tVarO, iT, iG, fVar.f4563b);
        }
        return this;
    }

    public final t<K, V> p(int i10, int i11, f<K, V> fVar) {
        fVar.e(fVar.f4567f - 1);
        fVar.f4565d = x(i10);
        Object[] objArr = this.f4583d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f4582c != fVar.f4563b) {
            return new t<>(i11 ^ this.f4580a, this.f4581b, x.b(i10, objArr), fVar.f4563b);
        }
        this.f4583d = x.b(i10, objArr);
        this.f4580a ^= i11;
        return this;
    }

    public final t<K, V> q(t<K, V> tVar, t<K, V> tVar2, int i10, int i11, z1 z1Var) {
        z1 z1Var2 = this.f4582c;
        if (tVar2 != null) {
            return (z1Var2 == z1Var || tVar != tVar2) ? r(i10, tVar2, z1Var) : this;
        }
        Object[] objArr = this.f4583d;
        if (objArr.length == 1) {
            return null;
        }
        if (z1Var2 != z1Var) {
            return new t<>(this.f4580a, i11 ^ this.f4581b, x.c(i10, objArr), z1Var);
        }
        this.f4583d = x.c(i10, objArr);
        this.f4581b ^= i11;
        return this;
    }

    public final t<K, V> r(int i10, t<K, V> tVar, z1 z1Var) {
        Object[] objArr = this.f4583d;
        if (objArr.length == 1 && tVar.f4583d.length == 2 && tVar.f4581b == 0) {
            tVar.f4580a = this.f4581b;
            return tVar;
        }
        if (this.f4582c == z1Var) {
            objArr[i10] = tVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.r.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = tVar;
        return new t<>(this.f4580a, this.f4581b, objArrCopyOf, z1Var);
    }

    public final t<K, V> s(int i10) {
        Object obj = this.f4583d[i10];
        kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (t) obj;
    }

    public final int t(int i10) {
        return (this.f4583d.length - 1) - Integer.bitCount((i10 - 1) & this.f4581b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d1, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00da, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dd, code lost:
    
        r14.f4584a = w(r12, r4, r14.f4584a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e5, code lost:
    
        return r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a u(Object obj, int i10, int i11, Object obj2) {
        a aVarU;
        int iG = 1 << x.g(i10, i11);
        if (h(iG)) {
            int iF = f(iG);
            if (!kotlin.jvm.internal.r.a(obj, this.f4583d[iF])) {
                return new a(new t(this.f4580a ^ iG, this.f4581b | iG, a(iF, iG, i10, obj, obj2, i11, null), null), 1);
            }
            if (x(iF) != obj2) {
                Object[] objArr = this.f4583d;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                kotlin.jvm.internal.r.d(objArrCopyOf, "copyOf(...)");
                objArrCopyOf[iF + 1] = obj2;
                return new a(new t(this.f4580a, this.f4581b, objArrCopyOf, null), 0);
            }
        } else {
            if (!i(iG)) {
                return new a(new t(this.f4580a | iG, this.f4581b, x.a(this.f4583d, f(iG), obj, obj2), null), 1);
            }
            int iT = t(iG);
            t<K, V> tVarS = s(iT);
            if (i11 == 30) {
                jh.e eVarP = jh.j.p(jh.j.q(0, tVarS.f4583d.length), 2);
                int i12 = eVarP.f15744a;
                int i13 = eVarP.f15745b;
                int i14 = eVarP.f15746c;
                if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                    while (!kotlin.jvm.internal.r.a(obj, tVarS.f4583d[i12])) {
                        if (i12 != i13) {
                            i12 += i14;
                        }
                    }
                    if (obj2 == tVarS.x(i12)) {
                        aVarU = null;
                    } else {
                        Object[] objArr2 = tVarS.f4583d;
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        kotlin.jvm.internal.r.d(objArrCopyOf2, "copyOf(...)");
                        objArrCopyOf2[i12 + 1] = obj2;
                        aVarU = new a(new t(0, 0, objArrCopyOf2, null), 0);
                    }
                }
                aVarU = new a(new t(0, 0, x.a(tVarS.f4583d, 0, obj, obj2), null), 1);
                break;
            }
            aVarU = tVarS.u(obj, i10, i11 + 5, obj2);
        }
        return null;
    }

    public final t v(Object obj, int i10, int i11) {
        t<K, V> tVarV;
        int iG = 1 << x.g(i10, i11);
        if (h(iG)) {
            int iF = f(iG);
            if (kotlin.jvm.internal.r.a(obj, this.f4583d[iF])) {
                Object[] objArr = this.f4583d;
                if (objArr.length != 2) {
                    return new t(this.f4580a ^ iG, this.f4581b, x.b(iF, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (i(iG)) {
            int iT = t(iG);
            t<K, V> tVarS = s(iT);
            if (i11 == 30) {
                jh.e eVarP = jh.j.p(jh.j.q(0, tVarS.f4583d.length), 2);
                int i12 = eVarP.f15744a;
                int i13 = eVarP.f15745b;
                int i14 = eVarP.f15746c;
                if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                    while (!kotlin.jvm.internal.r.a(obj, tVarS.f4583d[i12])) {
                        if (i12 != i13) {
                            i12 += i14;
                        }
                    }
                    Object[] objArr2 = tVarS.f4583d;
                    tVarV = objArr2.length == 2 ? null : new t<>(0, 0, x.b(i12, objArr2), null);
                }
                tVarV = tVarS;
                break;
            }
            tVarV = tVarS.v(obj, i10, i11 + 5);
            if (tVarV == null) {
                Object[] objArr3 = this.f4583d;
                if (objArr3.length != 1) {
                    return new t(this.f4580a, iG ^ this.f4581b, x.c(iT, objArr3), null);
                }
                return null;
            }
            if (tVarS != tVarV) {
                return w(iT, iG, tVarV);
            }
        }
        return this;
    }

    public final t<K, V> w(int i10, int i11, t<K, V> tVar) {
        Object[] objArr = tVar.f4583d;
        if (objArr.length != 2 || tVar.f4581b != 0) {
            Object[] objArr2 = this.f4583d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            kotlin.jvm.internal.r.d(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[i10] = tVar;
            return new t<>(this.f4580a, this.f4581b, objArrCopyOf, null);
        }
        if (this.f4583d.length == 1) {
            tVar.f4580a = this.f4581b;
            return tVar;
        }
        int iF = f(i11);
        Object[] objArr3 = this.f4583d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        kotlin.jvm.internal.r.d(objArrCopyOf2, "copyOf(...)");
        qg.m.g(objArrCopyOf2, i10 + 2, objArrCopyOf2, i10 + 1, objArr3.length);
        qg.m.g(objArrCopyOf2, iF + 2, objArrCopyOf2, iF, i10);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new t<>(this.f4580a ^ i11, i11 ^ this.f4581b, objArrCopyOf2, null);
    }

    public final V x(int i10) {
        return (V) this.f4583d[i10 + 1];
    }
}
