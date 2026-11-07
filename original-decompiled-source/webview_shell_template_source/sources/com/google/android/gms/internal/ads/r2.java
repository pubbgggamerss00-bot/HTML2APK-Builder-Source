package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r2 extends q72 {

    /* renamed from: u, reason: collision with root package name */
    public long f8507u;

    /* renamed from: v, reason: collision with root package name */
    public long[] f8508v;

    /* renamed from: w, reason: collision with root package name */
    public long[] f8509w;

    public static Serializable A(int i6, ex0 ex0Var) {
        if (i6 == 0) {
            return Double.valueOf(Double.longBitsToDouble(ex0Var.C()));
        }
        if (i6 == 1) {
            return Boolean.valueOf(ex0Var.v() == 1);
        }
        if (i6 == 2) {
            return B(ex0Var);
        }
        if (i6 != 3) {
            if (i6 == 8) {
                return C(ex0Var);
            }
            if (i6 != 10) {
                if (i6 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(ex0Var.C()));
                ex0Var.k(2);
                return date;
            }
            int iY = ex0Var.y();
            ArrayList arrayList = new ArrayList(iY);
            for (int i7 = 0; i7 < iY; i7++) {
                Serializable serializableA = A(ex0Var.v(), ex0Var);
                if (serializableA != null) {
                    arrayList.add(serializableA);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strB = B(ex0Var);
            int iV = ex0Var.v();
            if (iV == 9) {
                return map;
            }
            Serializable serializableA2 = A(iV, ex0Var);
            if (serializableA2 != null) {
                map.put(strB, serializableA2);
            }
        }
    }

    public static String B(ex0 ex0Var) {
        int iZ = ex0Var.z();
        int i6 = ex0Var.f4417b;
        ex0Var.k(iZ);
        return new String(ex0Var.f4416a, i6, iZ);
    }

    public static HashMap C(ex0 ex0Var) {
        int iY = ex0Var.y();
        HashMap map = new HashMap(iY);
        for (int i6 = 0; i6 < iY; i6++) {
            String strB = B(ex0Var);
            Serializable serializableA = A(ex0Var.v(), ex0Var);
            if (serializableA != null) {
                map.put(strB, serializableA);
            }
        }
        return map;
    }
}
