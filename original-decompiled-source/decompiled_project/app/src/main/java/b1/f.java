package b1;

import d0.z1;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import qg.m;
import x0.b2;

/* loaded from: classes.dex */
public final class f<E> extends qg.g<E> implements Collection, fh.b {

    /* renamed from: a, reason: collision with root package name */
    public a1.c<? extends E> f3486a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f3487b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f3488c;

    /* renamed from: d, reason: collision with root package name */
    public int f3489d;

    /* renamed from: e, reason: collision with root package name */
    public z1 f3490e = new z1();

    /* renamed from: f, reason: collision with root package name */
    public Object[] f3491f;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f3492g;

    /* renamed from: h, reason: collision with root package name */
    public int f3493h;

    public static final class a extends s implements eh.l<E, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Collection<E> f3494a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Collection<? extends E> collection) {
            super(1);
            this.f3494a = collection;
        }

        @Override // eh.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(this.f3494a.contains(obj));
        }
    }

    public f(b bVar, Object[] objArr, Object[] objArr2, int i10) {
        this.f3486a = bVar;
        this.f3487b = objArr;
        this.f3488c = objArr2;
        this.f3489d = i10;
        this.f3491f = objArr;
        this.f3492g = objArr2;
        this.f3493h = bVar.c();
    }

    public static void g(Object[] objArr, int i10, Iterator it) {
        while (i10 < 32 && it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
    }

    public final void A(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i10 = this.f3493h;
        int i11 = i10 >> 5;
        int i12 = this.f3489d;
        if (i11 > (1 << i12)) {
            this.f3491f = B(t(objArr), objArr2, this.f3489d + 5);
            this.f3492g = objArr3;
            this.f3489d += 5;
            this.f3493h++;
            return;
        }
        if (objArr == null) {
            this.f3491f = objArr2;
            this.f3492g = objArr3;
            this.f3493h = i10 + 1;
        } else {
            this.f3491f = B(objArr, objArr2, i12);
            this.f3492g = objArr3;
            this.f3493h++;
        }
    }

    public final Object[] B(Object[] objArr, Object[] objArr2, int i10) {
        int iA = l.a(c() - 1, i10);
        Object[] objArrQ = q(objArr);
        if (i10 == 5) {
            objArrQ[iA] = objArr2;
            return objArrQ;
        }
        objArrQ[iA] = B((Object[]) objArrQ[iA], objArr2, i10 - 5);
        return objArrQ;
    }

    public final int C(eh.l lVar, Object[] objArr, int i10, int i11, d dVar, ArrayList arrayList, ArrayList arrayList2) {
        if (n(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = dVar.f3481a;
        r.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrS = objArr2;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj2 = objArr[i12];
            if (!((Boolean) lVar.invoke(obj2)).booleanValue()) {
                if (i11 == 32) {
                    objArrS = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : s();
                    i11 = 0;
                }
                objArrS[i11] = obj2;
                i11++;
            }
        }
        dVar.f3481a = objArrS;
        if (objArr2 != objArrS) {
            arrayList2.add(objArr2);
        }
        return i11;
    }

    public final int D(eh.l<? super E, Boolean> lVar, Object[] objArr, int i10, d dVar) {
        Object[] objArrQ = objArr;
        int i11 = i10;
        boolean z10 = false;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (lVar.invoke(obj).booleanValue()) {
                if (!z10) {
                    objArrQ = q(objArr);
                    z10 = true;
                    i11 = i12;
                }
            } else if (z10) {
                objArrQ[i11] = obj;
                i11++;
            }
        }
        dVar.f3481a = objArrQ;
        return i11;
    }

    public final int F(eh.l<? super E, Boolean> lVar, int i10, d dVar) {
        int iD = D(lVar, this.f3492g, i10, dVar);
        if (iD == i10) {
            return i10;
        }
        Object obj = dVar.f3481a;
        r.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iD, i10, (Object) null);
        this.f3492g = objArr;
        this.f3493h -= i10 - iD;
        return iD;
    }

    public final boolean G(eh.l<? super E, Boolean> lVar) {
        Object[] objArrX;
        int i10;
        eh.l<? super E, Boolean> lVar2 = lVar;
        int iN = N();
        Object[] objArrU = null;
        d dVar = new d(null);
        boolean z10 = false;
        if (this.f3491f != null) {
            b1.a aVarO = o(0);
            int iD = 32;
            while (iD == 32 && aVarO.hasNext()) {
                iD = D(lVar2, (Object[]) aVarO.next(), 32, dVar);
            }
            if (iD == 32) {
                int iF = F(lVar2, iN, dVar);
                if (iF == 0) {
                    w(this.f3491f, this.f3493h, this.f3489d);
                }
                if (iF != iN) {
                }
            } else {
                int i11 = (aVarO.f3477a - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iC = iD;
                while (aVarO.hasNext()) {
                    iC = C(lVar2, (Object[]) aVarO.next(), 32, iC, dVar, arrayList2, arrayList);
                    lVar2 = lVar;
                }
                int iC2 = C(lVar, this.f3492g, iN, iC, dVar, arrayList2, arrayList);
                Object obj = dVar.f3481a;
                r.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iC2, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    objArrX = this.f3491f;
                    r.b(objArrX);
                } else {
                    objArrX = x(this.f3491f, i11, this.f3489d, arrayList.iterator());
                }
                int size = i11 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    b2.a("invalid size");
                }
                if (size == 0) {
                    this.f3489d = 0;
                } else {
                    int i12 = size - 1;
                    while (true) {
                        i10 = this.f3489d;
                        if ((i12 >> i10) != 0) {
                            break;
                        }
                        this.f3489d = i10 - 5;
                        Object[] objArr2 = objArrX[0];
                        r.c(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        objArrX = objArr2;
                    }
                    objArrU = u(objArrX, i12, i10);
                }
                this.f3491f = objArrU;
                this.f3492g = objArr;
                this.f3493h = size + iC2;
            }
            z10 = true;
        } else if (F(lVar2, iN, dVar) != iN) {
            z10 = true;
        }
        if (z10) {
            ((AbstractList) this).modCount++;
        }
        return z10;
    }

    public final Object[] H(Object[] objArr, int i10, int i11, d dVar) {
        int iA = l.a(i11, i10);
        if (i10 == 0) {
            Object obj = objArr[iA];
            Object[] objArrQ = q(objArr);
            m.g(objArr, iA, objArrQ, iA + 1, 32);
            objArrQ[31] = dVar.f3481a;
            dVar.f3481a = obj;
            return objArrQ;
        }
        int iA2 = objArr[31] == null ? l.a(J() - 1, i10) : 31;
        Object[] objArrQ2 = q(objArr);
        int i12 = i10 - 5;
        int i13 = iA + 1;
        if (i13 <= iA2) {
            while (true) {
                Object obj2 = objArrQ2[iA2];
                r.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrQ2[iA2] = H((Object[]) obj2, i12, 0, dVar);
                if (iA2 == i13) {
                    break;
                }
                iA2--;
            }
        }
        Object obj3 = objArrQ2[iA];
        r.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrQ2[iA] = H((Object[]) obj3, i12, i11, dVar);
        return objArrQ2;
    }

    public final Object I(Object[] objArr, int i10, int i11, int i12) {
        int i13 = this.f3493h - i10;
        if (i13 == 1) {
            Object obj = this.f3492g[0];
            w(objArr, i10, i11);
            return obj;
        }
        Object[] objArr2 = this.f3492g;
        Object obj2 = objArr2[i12];
        Object[] objArrQ = q(objArr2);
        m.g(objArr2, i12, objArrQ, i12 + 1, i13);
        objArrQ[i13 - 1] = null;
        this.f3491f = objArr;
        this.f3492g = objArrQ;
        this.f3493h = (i10 + i13) - 1;
        this.f3489d = i11;
        return obj2;
    }

    public final int J() {
        int i10 = this.f3493h;
        if (i10 <= 32) {
            return 0;
        }
        return (i10 - 1) & (-32);
    }

    public final Object[] K(Object[] objArr, int i10, int i11, E e10, d dVar) {
        int iA = l.a(i11, i10);
        Object[] objArrQ = q(objArr);
        if (i10 != 0) {
            Object obj = objArrQ[iA];
            r.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrQ[iA] = K((Object[]) obj, i10 - 5, i11, e10, dVar);
            return objArrQ;
        }
        if (objArrQ != objArr) {
            ((AbstractList) this).modCount++;
        }
        dVar.f3481a = objArrQ[iA];
        objArrQ[iA] = e10;
        return objArrQ;
    }

    public final void L(Collection<? extends E> collection, int i10, Object[] objArr, int i11, Object[][] objArr2, int i12, Object[] objArr3) {
        Object[] objArrS;
        if (i12 < 1) {
            b2.a("requires at least one nullBuffer");
        }
        Object[] objArrQ = q(objArr);
        objArr2[0] = objArrQ;
        int i13 = i10 & 31;
        int size = ((collection.size() + i10) - 1) & 31;
        int i14 = (i11 - i13) + size;
        if (i14 < 32) {
            m.g(objArrQ, size + 1, objArr3, i13, i11);
        } else {
            int i15 = i14 - 31;
            if (i12 == 1) {
                objArrS = objArrQ;
            } else {
                objArrS = s();
                i12--;
                objArr2[i12] = objArrS;
            }
            int i16 = i11 - i15;
            m.g(objArrQ, 0, objArr3, i16, i11);
            m.g(objArrQ, size + 1, objArrS, i13, i16);
            objArr3 = objArrS;
        }
        Iterator<? extends E> it = collection.iterator();
        g(objArrQ, i13, it);
        for (int i17 = 1; i17 < i12; i17++) {
            Object[] objArrS2 = s();
            g(objArrS2, 0, it);
            objArr2[i17] = objArrS2;
        }
        g(objArr3, 0, it);
    }

    public final int N() {
        int i10 = this.f3493h;
        return i10 <= 32 ? i10 : i10 - ((i10 - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        e1.d.b(i10, c());
        if (i10 == c()) {
            add(e10);
            return;
        }
        ((AbstractList) this).modCount++;
        int iJ = J();
        if (i10 >= iJ) {
            m(e10, this.f3491f, i10 - iJ);
            return;
        }
        d dVar = new d(null);
        Object[] objArr = this.f3491f;
        r.b(objArr);
        m(dVar.f3481a, k(objArr, this.f3489d, i10, e10, dVar), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        Collection<? extends E> collection2;
        f<E> fVar;
        Object[] objArrS;
        e1.d.b(i10, this.f3493h);
        if (i10 == this.f3493h) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i11 = (i10 >> 5) << 5;
        int size = ((collection.size() + (this.f3493h - i11)) - 1) / 32;
        if (size == 0) {
            int i12 = i10 & 31;
            int size2 = ((collection.size() + i10) - 1) & 31;
            Object[] objArr = this.f3492g;
            Object[] objArrQ = q(objArr);
            m.g(objArr, size2 + 1, objArrQ, i12, N());
            g(objArrQ, i12, collection.iterator());
            this.f3492g = objArrQ;
            this.f3493h = collection.size() + this.f3493h;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iN = N();
        int size3 = collection.size() + this.f3493h;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i10 >= J()) {
            objArrS = s();
            collection2 = collection;
            L(collection2, i10, this.f3492g, iN, objArr2, size, objArrS);
            fVar = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            fVar = this;
            if (size3 > iN) {
                int i13 = size3 - iN;
                Object[] objArrR = r(i13, fVar.f3492g);
                fVar.j(collection2, i10, i13, objArr2, size, objArrR);
                objArr2 = objArr2;
                objArrS = objArrR;
            } else {
                Object[] objArr3 = fVar.f3492g;
                objArrS = s();
                int i14 = iN - size3;
                m.g(objArr3, 0, objArrS, i14, iN);
                int i15 = 32 - i14;
                Object[] objArrR2 = r(i15, fVar.f3492g);
                int i16 = size - 1;
                objArr2[i16] = objArrR2;
                fVar.j(collection2, i10, i15, objArr2, i16, objArrR2);
                collection2 = collection2;
            }
        }
        fVar.f3491f = y(fVar.f3491f, i11, objArr2);
        fVar.f3492g = objArrS;
        fVar.f3493h = collection2.size() + fVar.f3493h;
        return true;
    }

    @Override // qg.g
    public final int c() {
        return this.f3493h;
    }

    @Override // qg.g
    public final E e(int i10) {
        e1.d.a(i10, c());
        ((AbstractList) this).modCount++;
        int iJ = J();
        if (i10 >= iJ) {
            return (E) I(this.f3491f, iJ, this.f3489d, i10 - iJ);
        }
        d dVar = new d(this.f3492g[0]);
        Object[] objArr = this.f3491f;
        r.b(objArr);
        I(H(objArr, this.f3489d, i10, dVar), iJ, this.f3489d, 0);
        return (E) dVar.f3481a;
    }

    public final a1.c<E> f() {
        e eVar;
        Object[] objArr = this.f3491f;
        if (objArr == this.f3487b && this.f3492g == this.f3488c) {
            eVar = this.f3486a;
        } else {
            this.f3490e = new z1();
            this.f3487b = objArr;
            Object[] objArr2 = this.f3492g;
            this.f3488c = objArr2;
            if (objArr != null) {
                eVar = new e(objArr, objArr2, this.f3493h, this.f3489d);
            } else if (objArr2.length == 0) {
                eVar = j.f3502b;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, this.f3493h);
                r.d(objArrCopyOf, "copyOf(...)");
                eVar = new j(objArrCopyOf);
            }
        }
        this.f3486a = eVar;
        return (a1.c<E>) eVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        Object[] objArr;
        e1.d.a(i10, c());
        if (J() <= i10) {
            objArr = this.f3492g;
        } else {
            objArr = this.f3491f;
            r.b(objArr);
            for (int i11 = this.f3489d; i11 > 0; i11 -= 5) {
                Object obj = objArr[l.a(i10, i11)];
                r.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return (E) objArr[i10 & 31];
    }

    public final int i() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    public final void j(Collection<? extends E> collection, int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.f3491f == null) {
            throw new IllegalStateException("root is null");
        }
        int i13 = i10 >> 5;
        b1.a aVarO = o(J() >> 5);
        int i14 = i12;
        Object[] objArrR = objArr2;
        while (aVarO.f3477a - 1 != i13) {
            Object[] objArr3 = (Object[]) aVarO.previous();
            m.g(objArr3, 0, objArrR, 32 - i11, 32);
            objArrR = r(i11, objArr3);
            i14--;
            objArr[i14] = objArrR;
        }
        Object[] objArr4 = (Object[]) aVarO.previous();
        int iJ = i12 - (((J() >> 5) - 1) - i13);
        if (iJ < i12) {
            objArr2 = objArr[iJ];
            r.b(objArr2);
        }
        L(collection, i10, objArr4, 32, objArr, iJ, objArr2);
    }

    public final Object[] k(Object[] objArr, int i10, int i11, Object obj, d dVar) {
        Object obj2;
        int iA = l.a(i11, i10);
        if (i10 == 0) {
            dVar.f3481a = objArr[31];
            Object[] objArrQ = q(objArr);
            m.g(objArr, iA + 1, objArrQ, iA, 31);
            objArrQ[iA] = obj;
            return objArrQ;
        }
        Object[] objArrQ2 = q(objArr);
        int i12 = i10 - 5;
        Object obj3 = objArrQ2[iA];
        r.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrQ2[iA] = k((Object[]) obj3, i12, i11, obj, dVar);
        while (true) {
            iA++;
            if (iA >= 32 || (obj2 = objArrQ2[iA]) == null) {
                break;
            }
            objArrQ2[iA] = k((Object[]) obj2, i12, 0, dVar.f3481a, dVar);
        }
        return objArrQ2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i10) {
        e1.d.b(i10, this.f3493h);
        return new h(this, i10);
    }

    public final void m(Object obj, Object[] objArr, int i10) {
        int iN = N();
        Object[] objArrQ = q(this.f3492g);
        if (iN < 32) {
            m.g(this.f3492g, i10 + 1, objArrQ, i10, iN);
            objArrQ[i10] = obj;
            this.f3491f = objArr;
            this.f3492g = objArrQ;
            this.f3493h++;
            return;
        }
        Object[] objArr2 = this.f3492g;
        Object obj2 = objArr2[31];
        m.g(objArr2, i10 + 1, objArrQ, i10, 31);
        objArrQ[i10] = obj;
        A(objArr, objArrQ, t(obj2));
    }

    public final boolean n(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f3490e;
    }

    public final b1.a o(int i10) {
        Object[] objArr = this.f3491f;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iJ = J() >> 5;
        e1.d.b(i10, iJ);
        int i11 = this.f3489d;
        return i11 == 0 ? new i(objArr, i10) : new k(objArr, i10, iJ, i11 / 5);
    }

    public final Object[] q(Object[] objArr) {
        if (objArr == null) {
            return s();
        }
        if (n(objArr)) {
            return objArr;
        }
        Object[] objArrS = s();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        m.i(objArr, 0, objArrS, length, 6);
        return objArrS;
    }

    public final Object[] r(int i10, Object[] objArr) {
        if (n(objArr)) {
            m.g(objArr, i10, objArr, 0, 32 - i10);
            return objArr;
        }
        Object[] objArrS = s();
        m.g(objArr, i10, objArrS, 0, 32 - i10);
        return objArrS;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<? extends Object> collection) {
        return G(new a(collection));
    }

    public final Object[] s() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f3490e;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        e1.d.a(i10, c());
        if (J() > i10) {
            d dVar = new d(null);
            Object[] objArr = this.f3491f;
            r.b(objArr);
            this.f3491f = K(objArr, this.f3489d, i10, e10, dVar);
            return (E) dVar.f3481a;
        }
        Object[] objArrQ = q(this.f3492g);
        if (objArrQ != this.f3492g) {
            ((AbstractList) this).modCount++;
        }
        int i11 = i10 & 31;
        E e11 = (E) objArrQ[i11];
        objArrQ[i11] = e10;
        this.f3492g = objArrQ;
        return e11;
    }

    public final Object[] t(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f3490e;
        return objArr;
    }

    public final Object[] u(Object[] objArr, int i10, int i11) {
        if (i11 < 0) {
            b2.a("shift should be positive");
        }
        if (i11 == 0) {
            return objArr;
        }
        int iA = l.a(i10, i11);
        Object obj = objArr[iA];
        r.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objU = u((Object[]) obj, i10, i11 - 5);
        if (iA < 31) {
            int i12 = iA + 1;
            if (objArr[i12] != null) {
                if (n(objArr)) {
                    Arrays.fill(objArr, i12, 32, (Object) null);
                }
                Object[] objArrS = s();
                m.g(objArr, 0, objArrS, 0, i12);
                objArr = objArrS;
            }
        }
        if (objU == objArr[iA]) {
            return objArr;
        }
        Object[] objArrQ = q(objArr);
        objArrQ[iA] = objU;
        return objArrQ;
    }

    public final Object[] v(Object[] objArr, int i10, int i11, d dVar) {
        Object[] objArrV;
        int iA = l.a(i11 - 1, i10);
        if (i10 == 5) {
            dVar.f3481a = objArr[iA];
            objArrV = null;
        } else {
            Object obj = objArr[iA];
            r.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrV = v((Object[]) obj, i10 - 5, i11, dVar);
        }
        if (objArrV == null && iA == 0) {
            return null;
        }
        Object[] objArrQ = q(objArr);
        objArrQ[iA] = objArrV;
        return objArrQ;
    }

    public final void w(Object[] objArr, int i10, int i11) {
        if (i11 == 0) {
            this.f3491f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f3492g = objArr;
            this.f3493h = i10;
            this.f3489d = i11;
            return;
        }
        d dVar = new d(null);
        r.b(objArr);
        Object[] objArrV = v(objArr, i11, i10, dVar);
        r.b(objArrV);
        Object obj = dVar.f3481a;
        r.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f3492g = (Object[]) obj;
        this.f3493h = i10;
        if (objArrV[1] == null) {
            this.f3491f = (Object[]) objArrV[0];
            this.f3489d = i11 - 5;
        } else {
            this.f3491f = objArrV;
            this.f3489d = i11;
        }
    }

    public final Object[] x(Object[] objArr, int i10, int i11, Iterator<Object[]> it) {
        if (!it.hasNext()) {
            b2.a("invalid buffersIterator");
        }
        if (!(i11 >= 0)) {
            b2.a("negative shift");
        }
        if (i11 == 0) {
            return it.next();
        }
        Object[] objArrQ = q(objArr);
        int iA = l.a(i10, i11);
        int i12 = i11 - 5;
        objArrQ[iA] = x((Object[]) objArrQ[iA], i10, i12, it);
        while (true) {
            iA++;
            if (iA >= 32 || !it.hasNext()) {
                break;
            }
            objArrQ[iA] = x((Object[]) objArrQ[iA], 0, i12, it);
        }
        return objArrQ;
    }

    public final Object[] y(Object[] objArr, int i10, Object[][] objArr2) {
        kotlin.jvm.internal.b bVarE = f3.f.e(objArr2);
        int i11 = i10 >> 5;
        int i12 = this.f3489d;
        Object[] objArrX = i11 < (1 << i12) ? x(objArr, i10, i12, bVarE) : q(objArr);
        while (bVarE.hasNext()) {
            this.f3489d += 5;
            objArrX = t(objArrX);
            int i13 = this.f3489d;
            x(objArrX, 1 << i13, i13, bVarE);
        }
        return objArrX;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        ((AbstractList) this).modCount++;
        int iN = N();
        if (iN < 32) {
            Object[] objArrQ = q(this.f3492g);
            objArrQ[iN] = e10;
            this.f3492g = objArrQ;
            this.f3493h = c() + 1;
        } else {
            A(this.f3491f, this.f3492g, t(e10));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iN = N();
        Iterator<? extends E> it = collection.iterator();
        if (32 - iN >= collection.size()) {
            Object[] objArrQ = q(this.f3492g);
            g(objArrQ, iN, it);
            this.f3492g = objArrQ;
            this.f3493h = collection.size() + this.f3493h;
            return true;
        }
        int size = ((collection.size() + iN) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrQ2 = q(this.f3492g);
        g(objArrQ2, iN, it);
        objArr[0] = objArrQ2;
        for (int i10 = 1; i10 < size; i10++) {
            Object[] objArrS = s();
            g(objArrS, 0, it);
            objArr[i10] = objArrS;
        }
        this.f3491f = y(this.f3491f, J(), objArr);
        Object[] objArrS2 = s();
        g(objArrS2, 0, it);
        this.f3492g = objArrS2;
        this.f3493h = collection.size() + this.f3493h;
        return true;
    }
}
