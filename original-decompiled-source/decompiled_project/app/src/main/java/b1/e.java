package b1;

import b1.b;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.jvm.internal.r;
import qg.m;
import x0.b2;

/* loaded from: classes.dex */
public final class e<E> extends b<E> {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f3482a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f3483b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3484c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3485d;

    public e(Object[] objArr, Object[] objArr2, int i10, int i11) {
        this.f3482a = objArr;
        this.f3483b = objArr2;
        this.f3484c = i10;
        this.f3485d = i11;
        if (!(c() > 32)) {
            b2.a("Trie-based persistent vector should have at least 33 elements, got " + c());
        }
        int length = objArr2.length;
    }

    public static Object[] e(Object[] objArr, int i10, int i11, Object obj, d dVar) {
        Object[] objArrCopyOf;
        int iA = l.a(i11, i10);
        if (i10 == 0) {
            if (iA == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                r.d(objArrCopyOf, "copyOf(...)");
            }
            m.g(objArr, iA + 1, objArrCopyOf, iA, 31);
            dVar.f3481a = objArr[31];
            objArrCopyOf[iA] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        r.d(objArrCopyOf2, "copyOf(...)");
        int i12 = i10 - 5;
        Object obj2 = objArr[iA];
        r.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iA] = e((Object[]) obj2, i12, i11, obj, dVar);
        while (true) {
            iA++;
            if (iA >= 32 || objArrCopyOf2[iA] == null) {
                break;
            }
            Object obj3 = objArr[iA];
            r.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[iA] = e((Object[]) obj3, i12, 0, dVar.f3481a, dVar);
        }
        return objArrCopyOf2;
    }

    public static Object[] g(Object[] objArr, int i10, int i11, d dVar) {
        Object[] objArrG;
        int iA = l.a(i11, i10);
        if (i10 == 5) {
            dVar.f3481a = objArr[iA];
            objArrG = null;
        } else {
            Object obj = objArr[iA];
            r.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrG = g((Object[]) obj, i10 - 5, i11, dVar);
        }
        if (objArrG == null && iA == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        r.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[iA] = objArrG;
        return objArrCopyOf;
    }

    public static Object[] o(Object[] objArr, int i10, int i11, Object obj) {
        int iA = l.a(i11, i10);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        r.d(objArrCopyOf, "copyOf(...)");
        if (i10 == 0) {
            objArrCopyOf[iA] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iA];
        r.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf[iA] = o((Object[]) obj2, i10 - 5, i11, obj);
        return objArrCopyOf;
    }

    @Override // a1.c
    public final a1.c<E> E(int i10) {
        e1.d.a(i10, this.f3484c);
        int iN = n();
        Object[] objArr = this.f3482a;
        int i11 = this.f3485d;
        return i10 >= iN ? m(objArr, iN, i11, i10 - iN) : m(k(objArr, i11, i10, new d(this.f3483b[0])), iN, i11, 0);
    }

    @Override // java.util.Collection, java.util.List, a1.c
    public final a1.c<E> add(E e10) {
        int iN = n();
        int i10 = this.f3484c;
        int i11 = i10 - iN;
        Object[] objArr = this.f3482a;
        Object[] objArr2 = this.f3483b;
        if (i11 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = e10;
            return i(objArr, objArr2, objArr3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        r.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i11] = e10;
        return new e(objArr, objArrCopyOf, i10 + 1, this.f3485d);
    }

    @Override // a1.c
    public final f builder() {
        return new f(this, this.f3482a, this.f3483b, this.f3485d);
    }

    @Override // qg.a
    public final int c() {
        return this.f3484c;
    }

    public final e f(Object obj, Object[] objArr, int i10) {
        int iN = n();
        int i11 = this.f3484c;
        int i12 = i11 - iN;
        Object[] objArr2 = this.f3483b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        r.d(objArrCopyOf, "copyOf(...)");
        if (i12 < 32) {
            m.g(objArr2, i10 + 1, objArrCopyOf, i10, i12);
            objArrCopyOf[i10] = obj;
            return new e(objArr, objArrCopyOf, i11 + 1, this.f3485d);
        }
        Object obj2 = objArr2[31];
        m.g(objArr2, i10 + 1, objArrCopyOf, i10, i12 - 1);
        objArrCopyOf[i10] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return i(objArr, objArrCopyOf, objArr3);
    }

    @Override // java.util.List
    public final E get(int i10) {
        Object[] objArr;
        e1.d.a(i10, c());
        if (n() <= i10) {
            objArr = this.f3483b;
        } else {
            objArr = this.f3482a;
            for (int i11 = this.f3485d; i11 > 0; i11 -= 5) {
                Object obj = objArr[l.a(i10, i11)];
                r.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return (E) objArr[i10 & 31];
    }

    public final e<E> i(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i10 = this.f3484c;
        int i11 = i10 >> 5;
        int i12 = this.f3485d;
        if (i11 <= (1 << i12)) {
            return new e<>(j(objArr, objArr2, i12), objArr3, i10 + 1, i12);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i13 = i12 + 5;
        return new e<>(j(objArr4, objArr2, i13), objArr3, i10 + 1, i13);
    }

    public final Object[] j(Object[] objArr, Object[] objArr2, int i10) {
        Object[] objArrCopyOf;
        int iA = l.a(c() - 1, i10);
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            r.d(objArrCopyOf, "copyOf(...)");
        } else {
            objArrCopyOf = new Object[32];
        }
        if (i10 == 5) {
            objArrCopyOf[iA] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iA] = j((Object[]) objArrCopyOf[iA], objArr2, i10 - 5);
        return objArrCopyOf;
    }

    public final Object[] k(Object[] objArr, int i10, int i11, d dVar) {
        Object[] objArrCopyOf;
        int iA = l.a(i11, i10);
        if (i10 == 0) {
            if (iA == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                r.d(objArrCopyOf, "copyOf(...)");
            }
            m.g(objArr, iA, objArrCopyOf, iA + 1, 32);
            objArrCopyOf[31] = dVar.f3481a;
            dVar.f3481a = objArr[iA];
            return objArrCopyOf;
        }
        int iA2 = objArr[31] == null ? l.a(n() - 1, i10) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        r.d(objArrCopyOf2, "copyOf(...)");
        int i12 = i10 - 5;
        int i13 = iA + 1;
        if (i13 <= iA2) {
            while (true) {
                Object obj = objArrCopyOf2[iA2];
                r.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iA2] = k((Object[]) obj, i12, 0, dVar);
                if (iA2 == i13) {
                    break;
                }
                iA2--;
            }
        }
        Object obj2 = objArrCopyOf2[iA];
        r.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iA] = k((Object[]) obj2, i12, i11, dVar);
        return objArrCopyOf2;
    }

    @Override // a1.c
    public final a1.c l(b.a aVar) {
        f fVar = new f(this, this.f3482a, this.f3483b, this.f3485d);
        fVar.G(aVar);
        return fVar.f();
    }

    @Override // qg.c, java.util.List
    public final ListIterator<E> listIterator(int i10) {
        e1.d.b(i10, this.f3484c);
        return new g(this.f3482a, i10, this.f3483b, this.f3484c, (this.f3485d / 5) + 1);
    }

    public final b m(Object[] objArr, int i10, int i11, int i12) {
        int i13 = this.f3484c - i10;
        if (i13 != 1) {
            Object[] objArr2 = this.f3483b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            r.d(objArrCopyOf, "copyOf(...)");
            int i14 = i13 - 1;
            if (i12 < i14) {
                m.g(objArr2, i12, objArrCopyOf, i12 + 1, i13);
            }
            objArrCopyOf[i14] = null;
            return new e(objArr, objArrCopyOf, (i10 + i13) - 1, i11);
        }
        if (i11 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                r.d(objArr, "copyOf(...)");
            }
            return new j(objArr);
        }
        d dVar = new d(null);
        Object[] objArrG = g(objArr, i11, i10 - 1, dVar);
        r.b(objArrG);
        Object obj = dVar.f3481a;
        r.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj;
        if (objArrG[1] != null) {
            return new e(objArrG, objArr3, i10, i11);
        }
        Object obj2 = objArrG[0];
        r.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new e((Object[]) obj2, objArr3, i10, i11 - 5);
    }

    public final int n() {
        return (this.f3484c - 1) & (-32);
    }

    @Override // qg.c, java.util.List, a1.c
    public final a1.c<E> set(int i10, E e10) {
        int i11 = this.f3484c;
        e1.d.a(i10, i11);
        int iN = n();
        Object[] objArr = this.f3482a;
        Object[] objArr2 = this.f3483b;
        int i12 = this.f3485d;
        if (iN > i10) {
            return new e(o(objArr, i12, i10, e10), objArr2, i11, i12);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        r.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10 & 31] = e10;
        return new e(objArr, objArrCopyOf, i11, i12);
    }

    @Override // java.util.List, a1.c
    public final a1.c<E> add(int i10, E e10) {
        int i11 = this.f3484c;
        e1.d.b(i10, i11);
        if (i10 == i11) {
            return add((e<E>) e10);
        }
        int iN = n();
        Object[] objArr = this.f3482a;
        if (i10 >= iN) {
            return f(e10, objArr, i10 - iN);
        }
        d dVar = new d(null);
        return f(dVar.f3481a, e(objArr, this.f3485d, i10, e10, dVar), 0);
    }
}
