package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class mq1 extends AbstractList implements RandomAccess, Serializable {
    public final int[] s;

    /* renamed from: t, reason: collision with root package name */
    public final int f7212t;

    /* renamed from: u, reason: collision with root package name */
    public final int f7213u;

    public mq1(int i6, int i7, int[] iArr) {
        this.s = iArr;
        this.f7212t = i6;
        this.f7213u = i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i6 = this.f7212t;
        while (true) {
            if (i6 >= this.f7213u) {
                i6 = -1;
                break;
            }
            if (this.s[i6] == iIntValue) {
                break;
            }
            i6++;
        }
        return i6 != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mq1)) {
            return super.equals(obj);
        }
        mq1 mq1Var = (mq1) obj;
        int i6 = mq1Var.f7212t;
        int i7 = mq1Var.f7213u - i6;
        int i8 = this.f7213u;
        int i9 = this.f7212t;
        int i10 = i8 - i9;
        if (i7 != i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.s[i9 + i11] != mq1Var.s[i6 + i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i6) {
        int i7 = this.f7213u;
        int i8 = this.f7212t;
        sl1.a(i6, i7 - i8);
        return Integer.valueOf(this.s[i8 + i6]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6 = 1;
        for (int i7 = this.f7212t; i7 < this.f7213u; i7++) {
            i6 = (i6 * 31) + this.s[i7];
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i6 = this.f7212t;
            int i7 = i6;
            while (true) {
                if (i7 >= this.f7213u) {
                    i7 = -1;
                    break;
                }
                if (this.s[i7] == iIntValue) {
                    break;
                }
                i7++;
            }
            if (i7 >= 0) {
                return i7 - i6;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i6;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i7 = this.f7213u - 1;
            while (true) {
                i6 = this.f7212t;
                if (i7 < i6) {
                    i7 = -1;
                    break;
                }
                if (this.s[i7] == iIntValue) {
                    break;
                }
                i7--;
            }
            if (i7 >= 0) {
                return i7 - i6;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i6, Object obj) {
        int i7 = this.f7213u;
        int i8 = this.f7212t;
        Integer num = (Integer) obj;
        sl1.a(i6, i7 - i8);
        int i9 = i8 + i6;
        int[] iArr = this.s;
        int i10 = iArr[i9];
        num.getClass();
        iArr[i9] = num.intValue();
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7213u - this.f7212t;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i6, int i7) {
        int i8 = this.f7213u;
        int i9 = this.f7212t;
        sl1.g(i6, i7, i8 - i9);
        if (i6 == i7) {
            return Collections.EMPTY_LIST;
        }
        return new mq1(i9 + i6, i7 + i9, this.s);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i6 = this.f7213u;
        int i7 = this.f7212t;
        StringBuilder sb = new StringBuilder((i6 - i7) * 5);
        sb.append('[');
        int[] iArr = this.s;
        sb.append(iArr[i7]);
        while (true) {
            i7++;
            if (i7 >= i6) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i7]);
        }
    }
}
