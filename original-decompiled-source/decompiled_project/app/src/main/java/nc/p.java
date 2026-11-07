package nc;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes2.dex */
public abstract class p<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final Object[] f18724a = new Object[0];

    public static abstract class a<E> extends b<E> {

        /* renamed from: a, reason: collision with root package name */
        public Object[] f18725a;

        /* renamed from: b, reason: collision with root package name */
        public int f18726b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f18727c;

        public a() {
            g.b(4, "initialCapacity");
            this.f18725a = new Object[4];
            this.f18726b = 0;
        }

        public final void b(Object obj) {
            obj.getClass();
            int i10 = this.f18726b + 1;
            Object[] objArr = this.f18725a;
            if (objArr.length < i10) {
                this.f18725a = Arrays.copyOf(objArr, b.a(objArr.length, i10));
                this.f18727c = false;
            } else if (this.f18727c) {
                this.f18725a = (Object[]) objArr.clone();
                this.f18727c = false;
            }
            Object[] objArr2 = this.f18725a;
            int i11 = this.f18726b;
            this.f18726b = i11 + 1;
            objArr2[i11] = obj;
        }
    }

    public static abstract class b<E> {
        public static int a(int i10, int i11) {
            if (i11 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i10 + (i10 >> 1) + 1;
            if (iHighestOneBit < i11) {
                iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }
    }

    public abstract r<E> a();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public int b(Object[] objArr) {
        e1<E> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return i10;
    }

    public Object[] c() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    public int d() {
        throw new UnsupportedOperationException();
    }

    public int e() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean f();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public abstract e1<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f18724a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int size = size();
        if (tArr.length < size) {
            Object[] objArrC = c();
            if (objArrC != null) {
                return (T[]) Arrays.copyOfRange(objArrC, e(), d(), tArr.getClass());
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        b(tArr);
        return tArr;
    }
}
