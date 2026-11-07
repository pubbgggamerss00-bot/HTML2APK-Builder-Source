package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c62 extends v32 implements RandomAccess, q52, t62 {

    /* renamed from: v, reason: collision with root package name */
    public static final long[] f3439v;

    /* renamed from: w, reason: collision with root package name */
    public static final c62 f3440w;

    /* renamed from: t, reason: collision with root package name */
    public long[] f3441t;

    /* renamed from: u, reason: collision with root package name */
    public int f3442u;

    static {
        long[] jArr = new long[0];
        f3439v = jArr;
        f3440w = new c62(jArr, 0, false);
    }

    public c62() {
        this(f3439v, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i7;
        long jLongValue = ((Long) obj).longValue();
        c();
        if (i6 < 0 || i6 > (i7 = this.f3442u)) {
            throw new IndexOutOfBoundsException(androidx.camera.view.g.e("Index:", i6, this.f3442u, ", Size:"));
        }
        int i8 = i6 + 1;
        long[] jArr = this.f3441t;
        int length = jArr.length;
        if (i7 < length) {
            System.arraycopy(jArr, i6, jArr, i8, i7 - i6);
        } else {
            long[] jArr2 = new long[androidx.activity.m.b(length, 3, 2, 1, 10)];
            System.arraycopy(this.f3441t, 0, jArr2, 0, i6);
            System.arraycopy(this.f3441t, i6, jArr2, i8, this.f3442u - i6);
            this.f3441t = jArr2;
        }
        this.f3441t[i6] = jLongValue;
        this.f3442u++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.v32, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = s52.f8801a;
        collection.getClass();
        if (!(collection instanceof c62)) {
            return super.addAll(collection);
        }
        c62 c62Var = (c62) collection;
        int i6 = c62Var.f3442u;
        if (i6 == 0) {
            return false;
        }
        int i7 = this.f3442u;
        if (Integer.MAX_VALUE - i7 < i6) {
            throw new OutOfMemoryError();
        }
        int i8 = i7 + i6;
        long[] jArr = this.f3441t;
        if (i8 > jArr.length) {
            this.f3441t = Arrays.copyOf(jArr, i8);
        }
        System.arraycopy(c62Var.f3441t, 0, this.f3441t, this.f3442u, c62Var.f3442u);
        this.f3442u = i8;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final long d(int i6) {
        g(i6);
        return this.f3441t[i6];
    }

    @Override // com.google.android.gms.internal.ads.r52
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final c62 b(int i6) {
        if (i6 >= this.f3442u) {
            return new c62(i6 == 0 ? f3439v : Arrays.copyOf(this.f3441t, i6), this.f3442u, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.v32, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c62)) {
            return super.equals(obj);
        }
        c62 c62Var = (c62) obj;
        if (this.f3442u != c62Var.f3442u) {
            return false;
        }
        long[] jArr = c62Var.f3441t;
        for (int i6 = 0; i6 < this.f3442u; i6++) {
            if (this.f3441t[i6] != jArr[i6]) {
                return false;
            }
        }
        return true;
    }

    public final void f(long j6) {
        c();
        int i6 = this.f3442u;
        int length = this.f3441t.length;
        if (i6 == length) {
            long[] jArr = new long[androidx.activity.m.b(length, 3, 2, 1, 10)];
            System.arraycopy(this.f3441t, 0, jArr, 0, this.f3442u);
            this.f3441t = jArr;
        }
        long[] jArr2 = this.f3441t;
        int i7 = this.f3442u;
        this.f3442u = i7 + 1;
        jArr2[i7] = j6;
    }

    public final void g(int i6) {
        if (i6 < 0 || i6 >= this.f3442u) {
            throw new IndexOutOfBoundsException(androidx.camera.view.g.e("Index:", i6, this.f3442u, ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i6) {
        g(i6);
        return Long.valueOf(this.f3441t[i6]);
    }

    @Override // com.google.android.gms.internal.ads.v32, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6 = 1;
        for (int i7 = 0; i7 < this.f3442u; i7++) {
            long j6 = this.f3441t[i7];
            Charset charset = s52.f8801a;
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
        int i6 = this.f3442u;
        for (int i7 = 0; i7 < i6; i7++) {
            if (this.f3441t[i7] == jLongValue) {
                return i7;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.v32, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i6) {
        c();
        g(i6);
        long[] jArr = this.f3441t;
        long j6 = jArr[i6];
        if (i6 < this.f3442u - 1) {
            System.arraycopy(jArr, i6 + 1, jArr, i6, (r3 - i6) - 1);
        }
        this.f3442u--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j6);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i7) {
        c();
        if (i7 < i6) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f3441t;
        System.arraycopy(jArr, i7, jArr, i6, this.f3442u - i7);
        this.f3442u -= i7 - i6;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        c();
        g(i6);
        long[] jArr = this.f3441t;
        long j6 = jArr[i6];
        jArr[i6] = jLongValue;
        return Long.valueOf(j6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3442u;
    }

    public c62(long[] jArr, int i6, boolean z6) {
        super(z6);
        this.f3441t = jArr;
        this.f3442u = i6;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Long) obj).longValue());
        return true;
    }
}
