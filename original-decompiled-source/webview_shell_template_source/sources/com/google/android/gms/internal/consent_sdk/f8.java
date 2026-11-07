package com.google.android.gms.internal.consent_sdk;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f8 {

    /* renamed from: a, reason: collision with root package name */
    public static final p1 f11738a;

    static {
        int i6 = a6.f11630a;
        f11738a = new p1();
    }

    public static void a(int i6, List list, l6 l6Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k6 k6Var = l6Var.f11816a;
        int i7 = 0;
        if (!(list instanceof a7)) {
            if (!z6) {
                while (i7 < list.size()) {
                    int iIntValue = ((Integer) list.get(i7)).intValue();
                    k6Var.t(i6, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i7++;
                }
                return;
            }
            k6Var.s(i6, 2);
            int iC = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                int iIntValue2 = ((Integer) list.get(i8)).intValue();
                iC += k6.c((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            k6Var.u(iC);
            while (i7 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i7)).intValue();
                k6Var.u((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i7++;
            }
            return;
        }
        a7 a7Var = (a7) list;
        if (!z6) {
            while (i7 < a7Var.f11634u) {
                int iD = a7Var.d(i7);
                k6Var.t(i6, (iD >> 31) ^ (iD + iD));
                i7++;
            }
            return;
        }
        k6Var.s(i6, 2);
        int iC2 = 0;
        for (int i9 = 0; i9 < a7Var.f11634u; i9++) {
            int iD2 = a7Var.d(i9);
            iC2 += k6.c((iD2 >> 31) ^ (iD2 + iD2));
        }
        k6Var.u(iC2);
        while (i7 < a7Var.f11634u) {
            int iD3 = a7Var.d(i7);
            k6Var.u((iD3 >> 31) ^ (iD3 + iD3));
            i7++;
        }
    }

    public static void b(int i6, List list, l6 l6Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k6 k6Var = l6Var.f11816a;
        int i7 = 0;
        if (!(list instanceof m7)) {
            if (!z6) {
                while (i7 < list.size()) {
                    long jLongValue = ((Long) list.get(i7)).longValue();
                    k6Var.v(i6, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i7++;
                }
                return;
            }
            k6Var.s(i6, 2);
            int iD = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                long jLongValue2 = ((Long) list.get(i8)).longValue();
                iD += k6.d((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            k6Var.u(iD);
            while (i7 < list.size()) {
                long jLongValue3 = ((Long) list.get(i7)).longValue();
                k6Var.w((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i7++;
            }
            return;
        }
        m7 m7Var = (m7) list;
        if (!z6) {
            while (i7 < m7Var.f11830u) {
                long jD = m7Var.d(i7);
                k6Var.v(i6, (jD >> 63) ^ (jD + jD));
                i7++;
            }
            return;
        }
        k6Var.s(i6, 2);
        int iD2 = 0;
        for (int i9 = 0; i9 < m7Var.f11830u; i9++) {
            long jD2 = m7Var.d(i9);
            iD2 += k6.d((jD2 >> 63) ^ (jD2 + jD2));
        }
        k6Var.u(iD2);
        while (i7 < m7Var.f11830u) {
            long jD3 = m7Var.d(i7);
            k6Var.w((jD3 >> 63) ^ (jD3 + jD3));
            i7++;
        }
    }

    public static void c(int i6, List list, l6 l6Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k6 k6Var = l6Var.f11816a;
        int i7 = 0;
        if (!(list instanceof a7)) {
            if (!z6) {
                while (i7 < list.size()) {
                    k6Var.t(i6, ((Integer) list.get(i7)).intValue());
                    i7++;
                }
                return;
            }
            k6Var.s(i6, 2);
            int iC = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                iC += k6.c(((Integer) list.get(i8)).intValue());
            }
            k6Var.u(iC);
            while (i7 < list.size()) {
                k6Var.u(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        a7 a7Var = (a7) list;
        if (!z6) {
            while (i7 < a7Var.f11634u) {
                k6Var.t(i6, a7Var.d(i7));
                i7++;
            }
            return;
        }
        k6Var.s(i6, 2);
        int iC2 = 0;
        for (int i9 = 0; i9 < a7Var.f11634u; i9++) {
            iC2 += k6.c(a7Var.d(i9));
        }
        k6Var.u(iC2);
        while (i7 < a7Var.f11634u) {
            k6Var.u(a7Var.d(i7));
            i7++;
        }
    }

    public static void d(int i6, List list, l6 l6Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k6 k6Var = l6Var.f11816a;
        int i7 = 0;
        if (!(list instanceof m7)) {
            if (!z6) {
                while (i7 < list.size()) {
                    k6Var.v(i6, ((Long) list.get(i7)).longValue());
                    i7++;
                }
                return;
            }
            k6Var.s(i6, 2);
            int iD = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                iD += k6.d(((Long) list.get(i8)).longValue());
            }
            k6Var.u(iD);
            while (i7 < list.size()) {
                k6Var.w(((Long) list.get(i7)).longValue());
                i7++;
            }
            return;
        }
        m7 m7Var = (m7) list;
        if (!z6) {
            while (i7 < m7Var.f11830u) {
                k6Var.v(i6, m7Var.d(i7));
                i7++;
            }
            return;
        }
        k6Var.s(i6, 2);
        int iD2 = 0;
        for (int i9 = 0; i9 < m7Var.f11830u; i9++) {
            iD2 += k6.d(m7Var.d(i9));
        }
        k6Var.u(iD2);
        while (i7 < m7Var.f11830u) {
            k6Var.w(m7Var.d(i7));
            i7++;
        }
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int f(List list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof a7)) {
            int iD = 0;
            while (i6 < size) {
                iD += k6.d(((Integer) list.get(i6)).intValue());
                i6++;
            }
            return iD;
        }
        a7 a7Var = (a7) list;
        int iD2 = 0;
        while (i6 < size) {
            iD2 += k6.d(a7Var.d(i6));
            i6++;
        }
        return iD2;
    }

    public static int g(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (k6.c(i6 << 3) + 4) * size;
    }

    public static int h(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (k6.c(i6 << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof a7)) {
            int iD = 0;
            while (i6 < size) {
                iD += k6.d(((Integer) list.get(i6)).intValue());
                i6++;
            }
            return iD;
        }
        a7 a7Var = (a7) list;
        int iD2 = 0;
        while (i6 < size) {
            iD2 += k6.d(a7Var.d(i6));
            i6++;
        }
        return iD2;
    }

    public static int j(List list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof m7)) {
            int iD = 0;
            while (i6 < size) {
                iD += k6.d(((Long) list.get(i6)).longValue());
                i6++;
            }
            return iD;
        }
        m7 m7Var = (m7) list;
        int iD2 = 0;
        while (i6 < size) {
            iD2 += k6.d(m7Var.d(i6));
            i6++;
        }
        return iD2;
    }

    public static int k(int i6, Object obj, e8 e8Var) {
        int i7 = i6 << 3;
        if (obj instanceof i7) {
            int iC = k6.c(i7);
            int iA = ((i7) obj).a();
            return androidx.camera.core.t.c(iA, iA, iC);
        }
        int iC2 = k6.c(i7);
        int iC3 = ((y5) obj).c(e8Var);
        return androidx.camera.core.t.c(iC3, iC3, iC2);
    }

    public static int l(List list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof a7)) {
            int iC = 0;
            while (i6 < size) {
                int iIntValue = ((Integer) list.get(i6)).intValue();
                iC += k6.c((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i6++;
            }
            return iC;
        }
        a7 a7Var = (a7) list;
        int iC2 = 0;
        while (i6 < size) {
            int iD = a7Var.d(i6);
            iC2 += k6.c((iD >> 31) ^ (iD + iD));
            i6++;
        }
        return iC2;
    }

    public static int m(List list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof m7)) {
            int iD = 0;
            while (i6 < size) {
                long jLongValue = ((Long) list.get(i6)).longValue();
                iD += k6.d((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i6++;
            }
            return iD;
        }
        m7 m7Var = (m7) list;
        int iD2 = 0;
        while (i6 < size) {
            long jD = m7Var.d(i6);
            iD2 += k6.d((jD >> 63) ^ (jD + jD));
            i6++;
        }
        return iD2;
    }

    public static int n(List list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof a7)) {
            int iC = 0;
            while (i6 < size) {
                iC += k6.c(((Integer) list.get(i6)).intValue());
                i6++;
            }
            return iC;
        }
        a7 a7Var = (a7) list;
        int iC2 = 0;
        while (i6 < size) {
            iC2 += k6.c(a7Var.d(i6));
            i6++;
        }
        return iC2;
    }

    public static int o(List list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof m7)) {
            int iD = 0;
            while (i6 < size) {
                iD += k6.d(((Long) list.get(i6)).longValue());
                i6++;
            }
            return iD;
        }
        m7 m7Var = (m7) list;
        int iD2 = 0;
        while (i6 < size) {
            iD2 += k6.d(m7Var.d(i6));
            i6++;
        }
        return iD2;
    }

    public static void p(Object obj, Object obj2) {
        z6 z6Var = (z6) obj;
        n8 n8Var = z6Var.zzc;
        n8 n8Var2 = ((z6) obj2).zzc;
        n8 n8Var3 = n8.f11847e;
        if (!n8Var3.equals(n8Var2)) {
            if (n8Var3.equals(n8Var)) {
                n8Var.getClass();
                n8Var2.getClass();
                int[] iArrCopyOf = Arrays.copyOf(n8Var.f11848a, 0);
                System.arraycopy(n8Var2.f11848a, 0, iArrCopyOf, 0, 0);
                Object[] objArrCopyOf = Arrays.copyOf(n8Var.f11849b, 0);
                System.arraycopy(n8Var2.f11849b, 0, objArrCopyOf, 0, 0);
                n8Var = new n8(iArrCopyOf, objArrCopyOf, true);
            } else {
                n8Var.getClass();
                if (!n8Var2.equals(n8Var3)) {
                    if (!n8Var.f11851d) {
                        throw new UnsupportedOperationException();
                    }
                    int[] iArr = n8Var.f11848a;
                    int length = iArr.length;
                    System.arraycopy(n8Var2.f11848a, 0, iArr, 0, 0);
                    System.arraycopy(n8Var2.f11849b, 0, n8Var.f11849b, 0, 0);
                }
            }
        }
        z6Var.zzc = n8Var;
    }

    public static void q(int i6, List list, l6 l6Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k6 k6Var = l6Var.f11816a;
        int i7 = 0;
        if (list instanceof b6) {
            if (z6) {
                k6Var.s(i6, 2);
                k6Var.u(0);
                return;
            }
            return;
        }
        if (!z6) {
            while (i7 < list.size()) {
                k6Var.f(i6, ((Boolean) list.get(i7)).booleanValue());
                i7++;
            }
            return;
        }
        k6Var.s(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((Boolean) list.get(i9)).getClass();
            i8++;
        }
        k6Var.u(i8);
        while (i7 < list.size()) {
            k6Var.e(((Boolean) list.get(i7)).booleanValue() ? (byte) 1 : (byte) 0);
            i7++;
        }
    }

    public static void r(int i6, List list, l6 l6Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k6 k6Var = l6Var.f11816a;
        int i7 = 0;
        if (list instanceof m6) {
            if (z6) {
                k6Var.s(i6, 2);
                k6Var.u(0);
                return;
            }
            return;
        }
        if (!z6) {
            while (i7 < list.size()) {
                k6Var.l(i6, Double.doubleToRawLongBits(((Double) list.get(i7)).doubleValue()));
                i7++;
            }
            return;
        }
        k6Var.s(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((Double) list.get(i9)).getClass();
            i8 += 8;
        }
        k6Var.u(i8);
        while (i7 < list.size()) {
            k6Var.m(Double.doubleToRawLongBits(((Double) list.get(i7)).doubleValue()));
            i7++;
        }
    }

    public static void s(int i6, List list, l6 l6Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k6 k6Var = l6Var.f11816a;
        int i7 = 0;
        if (!(list instanceof a7)) {
            if (!z6) {
                while (i7 < list.size()) {
                    k6Var.n(i6, ((Integer) list.get(i7)).intValue());
                    i7++;
                }
                return;
            }
            k6Var.s(i6, 2);
            int iD = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                iD += k6.d(((Integer) list.get(i8)).intValue());
            }
            k6Var.u(iD);
            while (i7 < list.size()) {
                k6Var.o(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        a7 a7Var = (a7) list;
        if (!z6) {
            while (i7 < a7Var.f11634u) {
                k6Var.n(i6, a7Var.d(i7));
                i7++;
            }
            return;
        }
        k6Var.s(i6, 2);
        int iD2 = 0;
        for (int i9 = 0; i9 < a7Var.f11634u; i9++) {
            iD2 += k6.d(a7Var.d(i9));
        }
        k6Var.u(iD2);
        while (i7 < a7Var.f11634u) {
            k6Var.o(a7Var.d(i7));
            i7++;
        }
    }

    public static void t(int i6, List list, l6 l6Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k6 k6Var = l6Var.f11816a;
        int i7 = 0;
        if (!(list instanceof a7)) {
            if (!z6) {
                while (i7 < list.size()) {
                    k6Var.j(i6, ((Integer) list.get(i7)).intValue());
                    i7++;
                }
                return;
            }
            k6Var.s(i6, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Integer) list.get(i9)).getClass();
                i8 += 4;
            }
            k6Var.u(i8);
            while (i7 < list.size()) {
                k6Var.k(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        a7 a7Var = (a7) list;
        if (!z6) {
            while (i7 < a7Var.f11634u) {
                k6Var.j(i6, a7Var.d(i7));
                i7++;
            }
            return;
        }
        k6Var.s(i6, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < a7Var.f11634u; i11++) {
            a7Var.d(i11);
            i10 += 4;
        }
        k6Var.u(i10);
        while (i7 < a7Var.f11634u) {
            k6Var.k(a7Var.d(i7));
            i7++;
        }
    }

    public static void u(int i6, List list, l6 l6Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k6 k6Var = l6Var.f11816a;
        int i7 = 0;
        if (!(list instanceof m7)) {
            if (!z6) {
                while (i7 < list.size()) {
                    k6Var.l(i6, ((Long) list.get(i7)).longValue());
                    i7++;
                }
                return;
            }
            k6Var.s(i6, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Long) list.get(i9)).getClass();
                i8 += 8;
            }
            k6Var.u(i8);
            while (i7 < list.size()) {
                k6Var.m(((Long) list.get(i7)).longValue());
                i7++;
            }
            return;
        }
        m7 m7Var = (m7) list;
        if (!z6) {
            while (i7 < m7Var.f11830u) {
                k6Var.l(i6, m7Var.d(i7));
                i7++;
            }
            return;
        }
        k6Var.s(i6, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < m7Var.f11830u; i11++) {
            m7Var.d(i11);
            i10 += 8;
        }
        k6Var.u(i10);
        while (i7 < m7Var.f11830u) {
            k6Var.m(m7Var.d(i7));
            i7++;
        }
    }

    public static void v(int i6, List list, l6 l6Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k6 k6Var = l6Var.f11816a;
        int i7 = 0;
        if (list instanceof u6) {
            if (z6) {
                k6Var.s(i6, 2);
                k6Var.u(0);
                return;
            }
            return;
        }
        if (!z6) {
            while (i7 < list.size()) {
                k6Var.j(i6, Float.floatToRawIntBits(((Float) list.get(i7)).floatValue()));
                i7++;
            }
            return;
        }
        k6Var.s(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((Float) list.get(i9)).getClass();
            i8 += 4;
        }
        k6Var.u(i8);
        while (i7 < list.size()) {
            k6Var.k(Float.floatToRawIntBits(((Float) list.get(i7)).floatValue()));
            i7++;
        }
    }

    public static void w(int i6, List list, l6 l6Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k6 k6Var = l6Var.f11816a;
        int i7 = 0;
        if (!(list instanceof a7)) {
            if (!z6) {
                while (i7 < list.size()) {
                    k6Var.n(i6, ((Integer) list.get(i7)).intValue());
                    i7++;
                }
                return;
            }
            k6Var.s(i6, 2);
            int iD = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                iD += k6.d(((Integer) list.get(i8)).intValue());
            }
            k6Var.u(iD);
            while (i7 < list.size()) {
                k6Var.o(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        a7 a7Var = (a7) list;
        if (!z6) {
            while (i7 < a7Var.f11634u) {
                k6Var.n(i6, a7Var.d(i7));
                i7++;
            }
            return;
        }
        k6Var.s(i6, 2);
        int iD2 = 0;
        for (int i9 = 0; i9 < a7Var.f11634u; i9++) {
            iD2 += k6.d(a7Var.d(i9));
        }
        k6Var.u(iD2);
        while (i7 < a7Var.f11634u) {
            k6Var.o(a7Var.d(i7));
            i7++;
        }
    }

    public static void x(int i6, List list, l6 l6Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k6 k6Var = l6Var.f11816a;
        int i7 = 0;
        if (!(list instanceof m7)) {
            if (!z6) {
                while (i7 < list.size()) {
                    k6Var.v(i6, ((Long) list.get(i7)).longValue());
                    i7++;
                }
                return;
            }
            k6Var.s(i6, 2);
            int iD = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                iD += k6.d(((Long) list.get(i8)).longValue());
            }
            k6Var.u(iD);
            while (i7 < list.size()) {
                k6Var.w(((Long) list.get(i7)).longValue());
                i7++;
            }
            return;
        }
        m7 m7Var = (m7) list;
        if (!z6) {
            while (i7 < m7Var.f11830u) {
                k6Var.v(i6, m7Var.d(i7));
                i7++;
            }
            return;
        }
        k6Var.s(i6, 2);
        int iD2 = 0;
        for (int i9 = 0; i9 < m7Var.f11830u; i9++) {
            iD2 += k6.d(m7Var.d(i9));
        }
        k6Var.u(iD2);
        while (i7 < m7Var.f11830u) {
            k6Var.w(m7Var.d(i7));
            i7++;
        }
    }

    public static void y(int i6, List list, l6 l6Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k6 k6Var = l6Var.f11816a;
        int i7 = 0;
        if (!(list instanceof a7)) {
            if (!z6) {
                while (i7 < list.size()) {
                    k6Var.j(i6, ((Integer) list.get(i7)).intValue());
                    i7++;
                }
                return;
            }
            k6Var.s(i6, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Integer) list.get(i9)).getClass();
                i8 += 4;
            }
            k6Var.u(i8);
            while (i7 < list.size()) {
                k6Var.k(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        a7 a7Var = (a7) list;
        if (!z6) {
            while (i7 < a7Var.f11634u) {
                k6Var.j(i6, a7Var.d(i7));
                i7++;
            }
            return;
        }
        k6Var.s(i6, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < a7Var.f11634u; i11++) {
            a7Var.d(i11);
            i10 += 4;
        }
        k6Var.u(i10);
        while (i7 < a7Var.f11634u) {
            k6Var.k(a7Var.d(i7));
            i7++;
        }
    }

    public static void z(int i6, List list, l6 l6Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k6 k6Var = l6Var.f11816a;
        int i7 = 0;
        if (!(list instanceof m7)) {
            if (!z6) {
                while (i7 < list.size()) {
                    k6Var.l(i6, ((Long) list.get(i7)).longValue());
                    i7++;
                }
                return;
            }
            k6Var.s(i6, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Long) list.get(i9)).getClass();
                i8 += 8;
            }
            k6Var.u(i8);
            while (i7 < list.size()) {
                k6Var.m(((Long) list.get(i7)).longValue());
                i7++;
            }
            return;
        }
        m7 m7Var = (m7) list;
        if (!z6) {
            while (i7 < m7Var.f11830u) {
                k6Var.l(i6, m7Var.d(i7));
                i7++;
            }
            return;
        }
        k6Var.s(i6, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < m7Var.f11830u; i11++) {
            m7Var.d(i11);
            i10 += 8;
        }
        k6Var.u(i10);
        while (i7 < m7Var.f11830u) {
            k6Var.m(m7Var.d(i7));
            i7++;
        }
    }
}
