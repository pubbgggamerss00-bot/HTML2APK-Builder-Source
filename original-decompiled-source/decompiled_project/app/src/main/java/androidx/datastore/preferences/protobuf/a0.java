package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.d0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class a0 extends b<Float> implements d0.f, RandomAccess, i1 {

    /* renamed from: d, reason: collision with root package name */
    public static final a0 f1948d = new a0(new float[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    public float[] f1949b;

    /* renamed from: c, reason: collision with root package name */
    public int f1950c;

    public a0() {
        this(new float[10], 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        float fFloatValue = ((Float) obj).floatValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f1950c)) {
            StringBuilder sbB = p.i0.b(i10, "Index:", ", Size:");
            sbB.append(this.f1950c);
            throw new IndexOutOfBoundsException(sbB.toString());
        }
        float[] fArr = this.f1949b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[e.a(i11, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f1949b, i10, fArr2, i10 + 1, this.f1950c - i10);
            this.f1949b = fArr2;
        }
        this.f1949b[i10] = fFloatValue;
        this.f1950c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        a();
        Charset charset = d0.f2005a;
        collection.getClass();
        if (!(collection instanceof a0)) {
            return super.addAll(collection);
        }
        a0 a0Var = (a0) collection;
        int i10 = a0Var.f1950c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f1950c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f1949b;
        if (i12 > fArr.length) {
            this.f1949b = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(a0Var.f1949b, 0, this.f1949b, this.f1950c, a0Var.f1950c);
        this.f1950c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addFloat(float f10) {
        a();
        int i10 = this.f1950c;
        float[] fArr = this.f1949b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[e.a(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f1949b = fArr2;
        }
        float[] fArr3 = this.f1949b;
        int i11 = this.f1950c;
        this.f1950c = i11 + 1;
        fArr3[i11] = f10;
    }

    public final void b(int i10) {
        if (i10 < 0 || i10 >= this.f1950c) {
            StringBuilder sbB = p.i0.b(i10, "Index:", ", Size:");
            sbB.append(this.f1950c);
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
        if (!(obj instanceof a0)) {
            return super.equals(obj);
        }
        a0 a0Var = (a0) obj;
        if (this.f1950c != a0Var.f1950c) {
            return false;
        }
        float[] fArr = a0Var.f1949b;
        for (int i10 = 0; i10 < this.f1950c; i10++) {
            if (Float.floatToIntBits(this.f1949b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        b(i10);
        return Float.valueOf(this.f1949b[i10]);
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f1950c; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f1949b[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i10 = this.f1950c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f1949b[i11] == fFloatValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.d0.j
    public final d0.j<Float> mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f1950c) {
            return new a0(Arrays.copyOf(this.f1949b, i10), this.f1950c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        b(i10);
        float[] fArr = this.f1949b;
        float f10 = fArr[i10];
        if (i10 < this.f1950c - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.f1950c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f1949b;
        System.arraycopy(fArr, i11, fArr, i10, this.f1950c - i11);
        this.f1950c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        a();
        b(i10);
        float[] fArr = this.f1949b;
        float f10 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1950c;
    }

    public a0(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.f1949b = fArr;
        this.f1950c = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addFloat(((Float) obj).floatValue());
        return true;
    }
}
