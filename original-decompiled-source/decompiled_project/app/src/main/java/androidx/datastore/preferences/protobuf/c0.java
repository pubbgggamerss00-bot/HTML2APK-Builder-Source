package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.d0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class c0 extends b<Integer> implements d0.g, RandomAccess, i1 {

    /* renamed from: d, reason: collision with root package name */
    public static final c0 f1993d = new c0(new int[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    public int[] f1994b;

    /* renamed from: c, reason: collision with root package name */
    public int f1995c;

    public c0() {
        this(new int[10], 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f1995c)) {
            StringBuilder sbB = p.i0.b(i10, "Index:", ", Size:");
            sbB.append(this.f1995c);
            throw new IndexOutOfBoundsException(sbB.toString());
        }
        int[] iArr = this.f1994b;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[e.a(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f1994b, i10, iArr2, i10 + 1, this.f1995c - i10);
            this.f1994b = iArr2;
        }
        this.f1994b[i10] = iIntValue;
        this.f1995c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        a();
        Charset charset = d0.f2005a;
        collection.getClass();
        if (!(collection instanceof c0)) {
            return super.addAll(collection);
        }
        c0 c0Var = (c0) collection;
        int i10 = c0Var.f1995c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f1995c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f1994b;
        if (i12 > iArr.length) {
            this.f1994b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c0Var.f1994b, 0, this.f1994b, this.f1995c, c0Var.f1995c);
        this.f1995c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addInt(int i10) {
        a();
        int i11 = this.f1995c;
        int[] iArr = this.f1994b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[e.a(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f1994b = iArr2;
        }
        int[] iArr3 = this.f1994b;
        int i12 = this.f1995c;
        this.f1995c = i12 + 1;
        iArr3[i12] = i10;
    }

    public final void b(int i10) {
        if (i10 < 0 || i10 >= this.f1995c) {
            StringBuilder sbB = p.i0.b(i10, "Index:", ", Size:");
            sbB.append(this.f1995c);
            throw new IndexOutOfBoundsException(sbB.toString());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return super.equals(obj);
        }
        c0 c0Var = (c0) obj;
        if (this.f1995c != c0Var.f1995c) {
            return false;
        }
        int[] iArr = c0Var.f1994b;
        for (int i10 = 0; i10 < this.f1995c; i10++) {
            if (this.f1994b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return Integer.valueOf(getInt(i10));
    }

    public final int getInt(int i10) {
        b(i10);
        return this.f1994b[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f1995c; i11++) {
            i10 = (i10 * 31) + this.f1994b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f1995c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f1994b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.d0.j
    public final d0.j<Integer> mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f1995c) {
            return new c0(Arrays.copyOf(this.f1994b, i10), this.f1995c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        b(i10);
        int[] iArr = this.f1994b;
        int i11 = iArr[i10];
        if (i10 < this.f1995c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f1995c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f1994b;
        System.arraycopy(iArr, i11, iArr, i10, this.f1995c - i11);
        this.f1995c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        return Integer.valueOf(setInt(i10, ((Integer) obj).intValue()));
    }

    public final int setInt(int i10, int i11) {
        a();
        b(i10);
        int[] iArr = this.f1994b;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1995c;
    }

    public c0(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f1994b = iArr;
        this.f1995c = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addInt(((Integer) obj).intValue());
        return true;
    }
}
