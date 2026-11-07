package com.google.android.gms.internal.consent_sdk;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m7 extends z5 implements RandomAccess {

    /* renamed from: v, reason: collision with root package name */
    public static final long[] f11828v;

    /* renamed from: t, reason: collision with root package name */
    public long[] f11829t;

    /* renamed from: u, reason: collision with root package name */
    public int f11830u;

    static {
        long[] jArr = new long[0];
        f11828v = jArr;
        new m7(jArr, 0, false);
    }

    public m7() {
        this(f11828v, 0, true);
    }

    @Override // com.google.android.gms.internal.consent_sdk.d7
    public final /* bridge */ /* synthetic */ d7 a(int i6) {
        if (i6 >= this.f11830u) {
            return new m7(i6 == 0 ? f11828v : Arrays.copyOf(this.f11829t, i6), this.f11830u, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i7;
        long jLongValue = ((Long) obj).longValue();
        c();
        if (i6 < 0 || i6 > (i7 = this.f11830u)) {
            throw new IndexOutOfBoundsException(androidx.camera.view.g.e("Index:", i6, this.f11830u, ", Size:"));
        }
        int i8 = i6 + 1;
        long[] jArr = this.f11829t;
        int length = jArr.length;
        if (i7 < length) {
            System.arraycopy(jArr, i6, jArr, i8, i7 - i6);
        } else {
            long[] jArr2 = new long[androidx.activity.m.b(length, 3, 2, 1, 10)];
            System.arraycopy(this.f11829t, 0, jArr2, 0, i6);
            System.arraycopy(this.f11829t, i6, jArr2, i8, this.f11830u - i6);
            this.f11829t = jArr2;
        }
        this.f11829t[i6] = jLongValue;
        this.f11830u++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.consent_sdk.z5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = e7.f11716a;
        collection.getClass();
        if (!(collection instanceof m7)) {
            return super.addAll(collection);
        }
        m7 m7Var = (m7) collection;
        int i6 = m7Var.f11830u;
        if (i6 == 0) {
            return false;
        }
        int i7 = this.f11830u;
        if (Integer.MAX_VALUE - i7 < i6) {
            throw new OutOfMemoryError();
        }
        int i8 = i7 + i6;
        long[] jArr = this.f11829t;
        if (i8 > jArr.length) {
            this.f11829t = Arrays.copyOf(jArr, i8);
        }
        System.arraycopy(m7Var.f11829t, 0, this.f11829t, this.f11830u, m7Var.f11830u);
        this.f11830u = i8;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final long d(int i6) {
        e(i6);
        return this.f11829t[i6];
    }

    public final void e(int i6) {
        if (i6 < 0 || i6 >= this.f11830u) {
            throw new IndexOutOfBoundsException(androidx.camera.view.g.e("Index:", i6, this.f11830u, ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.z5, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7)) {
            return super.equals(obj);
        }
        m7 m7Var = (m7) obj;
        if (this.f11830u != m7Var.f11830u) {
            return false;
        }
        long[] jArr = m7Var.f11829t;
        for (int i6 = 0; i6 < this.f11830u; i6++) {
            if (this.f11829t[i6] != jArr[i6]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i6) {
        e(i6);
        return Long.valueOf(this.f11829t[i6]);
    }

    @Override // com.google.android.gms.internal.consent_sdk.z5, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6 = 1;
        for (int i7 = 0; i7 < this.f11830u; i7++) {
            long j6 = this.f11829t[i7];
            Charset charset = e7.f11716a;
            i6 = (i6 * 31) + ((int) (j6 ^ (j6 >>> 32)));
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i6 = this.f11830u;
        for (int i7 = 0; i7 < i6; i7++) {
            if (this.f11829t[i7] == jLongValue) {
                return i7;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.z5, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i6) {
        c();
        e(i6);
        long[] jArr = this.f11829t;
        long j6 = jArr[i6];
        if (i6 < this.f11830u - 1) {
            System.arraycopy(jArr, i6 + 1, jArr, i6, (r3 - i6) - 1);
        }
        this.f11830u--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j6);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i7) {
        c();
        if (i7 < i6) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f11829t;
        System.arraycopy(jArr, i7, jArr, i6, this.f11830u - i7);
        this.f11830u -= i7 - i6;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i6, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        c();
        e(i6);
        long[] jArr = this.f11829t;
        long j6 = jArr[i6];
        jArr[i6] = jLongValue;
        return Long.valueOf(j6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11830u;
    }

    public m7(long[] jArr, int i6, boolean z6) {
        super(z6);
        this.f11829t = jArr;
        this.f11830u = i6;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        long jLongValue = ((Long) obj).longValue();
        c();
        int i6 = this.f11830u;
        int length = this.f11829t.length;
        if (i6 == length) {
            long[] jArr = new long[androidx.activity.m.b(length, 3, 2, 1, 10)];
            System.arraycopy(this.f11829t, 0, jArr, 0, this.f11830u);
            this.f11829t = jArr;
        }
        long[] jArr2 = this.f11829t;
        int i7 = this.f11830u;
        this.f11830u = i7 + 1;
        jArr2[i7] = jLongValue;
        return true;
    }
}
