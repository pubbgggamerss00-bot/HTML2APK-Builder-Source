package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class go1 extends wn1 implements Set {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f5097u = 0;

    /* renamed from: t, reason: collision with root package name */
    public transient bo1 f5098t;

    public static int j(int i6) {
        int iMax = Math.max(i6, 2);
        if (iMax >= 751619276) {
            sl1.e("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (iHighestOneBit * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static fo1 l(int i6) {
        fo1 fo1Var = new fo1(i6);
        fo1Var.f4742w = new Object[j(i6)];
        return fo1Var;
    }

    public static go1 m(Object[] objArr, int i6) {
        if (i6 == 0) {
            return jp1.B;
        }
        if (i6 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new rp1(obj);
        }
        int iJ = j(i6);
        Object[] objArr2 = new Object[iJ];
        int i7 = iJ - 1;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                throw new NullPointerException(androidx.camera.camera2.internal.compat.workaround.c.d(i10, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iA = aa1.a(iHashCode);
            while (true) {
                int i11 = iA & i7;
                Object obj3 = objArr2[i11];
                if (obj3 == null) {
                    objArr[i9] = obj2;
                    objArr2[i11] = obj2;
                    i8 += iHashCode;
                    i9++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iA++;
                }
            }
        }
        Arrays.fill(objArr, i9, i6, (Object) null);
        if (i9 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new rp1(obj4);
        }
        if (j(i9) < iJ / 2) {
            return m(objArr, i9);
        }
        int length = objArr.length;
        if (i9 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i9);
        }
        return new jp1(i8, i7, i9, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof go1) && (this instanceof jp1) && (((go1) obj) instanceof jp1) && hashCode() != obj.hashCode()) {
            return false;
        }
        return rj1.q(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.wn1
    public bo1 f() {
        bo1 bo1Var = this.f5098t;
        if (bo1Var != null) {
            return bo1Var;
        }
        bo1 bo1VarK = k();
        this.f5098t = bo1VarK;
        return bo1VarK;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return rj1.a(this);
    }

    public bo1 k() {
        Object[] array = toArray(wn1.s);
        zn1 zn1Var = bo1.f3236t;
        return bo1.k(array, array.length);
    }
}
