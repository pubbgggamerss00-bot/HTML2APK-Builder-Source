package com.google.android.gms.internal.consent_sdk;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class x0 extends t0 implements Set {

    /* renamed from: t, reason: collision with root package name */
    public transient w0 f11934t;

    public static int g(int i6) {
        int iMax = Math.max(i6, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (iHighestOneBit * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static x0 h(Object[] objArr, int i6) {
        if (i6 == 0) {
            return a1.A;
        }
        if (i6 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new c1(obj);
        }
        int iG = g(i6);
        Object[] objArr2 = new Object[iG];
        int i7 = iG - 1;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                throw new NullPointerException(androidx.camera.camera2.internal.compat.workaround.c.d(i10, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iRotateLeft = (int) (Integer.rotateLeft((int) (iHashCode * (-862048943)), 15) * 461845907);
            while (true) {
                int i11 = iRotateLeft & i7;
                Object obj3 = objArr2[i11];
                if (obj3 == null) {
                    objArr[i9] = obj2;
                    objArr2[i11] = obj2;
                    i8 += iHashCode;
                    i9++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iRotateLeft++;
                }
            }
        }
        Arrays.fill(objArr, i9, i6, (Object) null);
        if (i9 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new c1(obj4);
        }
        if (g(i9) < iG / 2) {
            return h(objArr, i9);
        }
        if (i9 < 3) {
            objArr = Arrays.copyOf(objArr, i9);
        }
        return new a1(i8, i7, i9, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof x0) && (this instanceof a1) && (((x0) obj) instanceof a1) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public abstract int hashCode();
}
