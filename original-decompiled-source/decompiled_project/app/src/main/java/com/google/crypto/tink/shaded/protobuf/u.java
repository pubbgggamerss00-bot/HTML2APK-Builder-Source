package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.y;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class u extends c<Float> implements RandomAccess, a1 {

    /* renamed from: b, reason: collision with root package name */
    public float[] f6771b;

    /* renamed from: c, reason: collision with root package name */
    public int f6772c;

    static {
        new u(new float[0], 0).f6635a = false;
    }

    public u() {
        this(new float[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        float fFloatValue = ((Float) obj).floatValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f6772c)) {
            StringBuilder sbB = p.i0.b(i10, "Index:", ", Size:");
            sbB.append(this.f6772c);
            throw new IndexOutOfBoundsException(sbB.toString());
        }
        float[] fArr = this.f6771b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[androidx.datastore.preferences.protobuf.e.a(i11, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f6771b, i10, fArr2, i10 + 1, this.f6772c - i10);
            this.f6771b = fArr2;
        }
        this.f6771b[i10] = fFloatValue;
        this.f6772c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        a();
        Charset charset = y.f6818a;
        collection.getClass();
        if (!(collection instanceof u)) {
            return super.addAll(collection);
        }
        u uVar = (u) collection;
        int i10 = uVar.f6772c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f6772c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f6771b;
        if (i12 > fArr.length) {
            this.f6771b = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(uVar.f6771b, 0, this.f6771b, this.f6772c, uVar.f6772c);
        this.f6772c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addFloat(float f10) {
        a();
        int i10 = this.f6772c;
        float[] fArr = this.f6771b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[androidx.datastore.preferences.protobuf.e.a(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f6771b = fArr2;
        }
        float[] fArr3 = this.f6771b;
        int i11 = this.f6772c;
        this.f6772c = i11 + 1;
        fArr3[i11] = f10;
    }

    public final void b(int i10) {
        if (i10 < 0 || i10 >= this.f6772c) {
            StringBuilder sbB = p.i0.b(i10, "Index:", ", Size:");
            sbB.append(this.f6772c);
            throw new IndexOutOfBoundsException(sbB.toString());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return super.equals(obj);
        }
        u uVar = (u) obj;
        if (this.f6772c != uVar.f6772c) {
            return false;
        }
        float[] fArr = uVar.f6771b;
        for (int i10 = 0; i10 < this.f6772c; i10++) {
            if (Float.floatToIntBits(this.f6771b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        b(i10);
        return Float.valueOf(this.f6771b[i10]);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f6772c; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f6771b[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i10 = this.f6772c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f6771b[i11] == fFloatValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y.c
    public final y.c mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f6772c) {
            return new u(Arrays.copyOf(this.f6771b, i10), this.f6772c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        b(i10);
        float[] fArr = this.f6771b;
        float f10 = fArr[i10];
        if (i10 < this.f6772c - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.f6772c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f6771b;
        System.arraycopy(fArr, i11, fArr, i10, this.f6772c - i11);
        this.f6772c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        a();
        b(i10);
        float[] fArr = this.f6771b;
        float f10 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6772c;
    }

    public u(float[] fArr, int i10) {
        this.f6771b = fArr;
        this.f6772c = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addFloat(((Float) obj).floatValue());
        return true;
    }
}
