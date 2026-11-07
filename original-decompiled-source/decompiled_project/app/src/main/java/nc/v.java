package nc;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import nc.p;
import nc.r;

/* loaded from: classes2.dex */
public abstract class v<E> extends p<E> implements Set<E> {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f18759c = 0;

    /* renamed from: b, reason: collision with root package name */
    public transient r<E> f18760b;

    public static class a<E> extends p.a<E> {
        public a<E> c(E e10) {
            e10.getClass();
            b(e10);
            return this;
        }

        public v<E> d() {
            int i10 = this.f18726b;
            if (i10 == 0) {
                return w0.f18781j;
            }
            if (i10 == 1) {
                return new a1(this.f18725a[0]);
            }
            v<E> vVarJ = v.j(i10, this.f18725a);
            this.f18726b = vVarJ.size();
            this.f18727c = true;
            return vVarJ;
        }
    }

    public static int i(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (iHighestOneBit * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static <E> v<E> j(int i10, Object... objArr) {
        if (i10 == 0) {
            return w0.f18781j;
        }
        if (i10 == 1) {
            return new a1(objArr[0]);
        }
        int i11 = i(i10);
        Object[] objArr2 = new Object[i11];
        int i12 = i11 - 1;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i10; i15++) {
            Object obj = objArr[i15];
            if (obj == null) {
                throw new NullPointerException(j2.y.a(i15, "at index "));
            }
            int iHashCode = obj.hashCode();
            int iA = n.a(iHashCode);
            while (true) {
                int i16 = iA & i12;
                Object obj2 = objArr2[i16];
                if (obj2 == null) {
                    objArr[i14] = obj;
                    objArr2[i16] = obj;
                    i13 += iHashCode;
                    i14++;
                    break;
                }
                if (obj2.equals(obj)) {
                    break;
                }
                iA++;
            }
        }
        Arrays.fill(objArr, i14, i10, (Object) null);
        if (i14 == 1) {
            return new a1(objArr[0], i13);
        }
        if (i(i14) < i11 / 2) {
            return j(i14, objArr);
        }
        int length = objArr.length;
        if (i14 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i14);
        }
        return new w0(objArr, i13, objArr2, i12, i14);
    }

    public static <E> v<E> k(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return w0.f18781j;
        }
        E next = it.next();
        if (!it.hasNext()) {
            return new a1(next);
        }
        a aVar = new a();
        aVar.c(next);
        while (it.hasNext()) {
            aVar.c(it.next());
        }
        return aVar.d();
    }

    @Override // nc.p
    public r<E> a() {
        r<E> rVar = this.f18760b;
        if (rVar != null) {
            return rVar;
        }
        r<E> rVarM = m();
        this.f18760b = rVarM;
        return rVarM;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof v) && n() && ((v) obj).n() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() == set.size()) {
                        if (containsAll(set)) {
                        }
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator<E> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            E next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public r<E> m() {
        Object[] array = toArray(p.f18724a);
        r.a aVar = r.f18735b;
        return r.i(array.length, array);
    }

    public boolean n() {
        return this instanceof w0;
    }
}
