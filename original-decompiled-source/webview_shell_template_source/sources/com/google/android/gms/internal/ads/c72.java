package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c72 {

    /* renamed from: a, reason: collision with root package name */
    public static final ed0 f3456a;

    static {
        u62 u62Var = u62.f9474c;
        f3456a = new ed0(9);
    }

    public static void A(int i6, List list, y72 y72Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p42 p42Var = ((q42) y72Var).f8227a;
        int i7 = 0;
        if (!(list instanceof k52)) {
            if (!z6) {
                while (i7 < list.size()) {
                    p42Var.B(i6, ((Integer) list.get(i7)).intValue());
                    i7++;
                }
                return;
            }
            p42Var.H(i6, 2);
            int iS = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                iS += p42.s(((Integer) list.get(i8)).intValue());
            }
            p42Var.J(iS);
            while (i7 < list.size()) {
                p42Var.C(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        k52 k52Var = (k52) list;
        if (!z6) {
            while (i7 < k52Var.f6258u) {
                p42Var.B(i6, k52Var.d(i7));
                i7++;
            }
            return;
        }
        p42Var.H(i6, 2);
        int iS2 = 0;
        for (int i9 = 0; i9 < k52Var.f6258u; i9++) {
            iS2 += p42.s(k52Var.d(i9));
        }
        p42Var.J(iS2);
        while (i7 < k52Var.f6258u) {
            p42Var.C(k52Var.d(i7));
            i7++;
        }
    }

    public static void a(int i6, List list, y72 y72Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p42 p42Var = ((q42) y72Var).f8227a;
        int i7 = 0;
        if (!(list instanceof c62)) {
            if (!z6) {
                while (i7 < list.size()) {
                    p42Var.K(i6, ((Long) list.get(i7)).longValue());
                    i7++;
                }
                return;
            }
            p42Var.H(i6, 2);
            int iS = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                iS += p42.s(((Long) list.get(i8)).longValue());
            }
            p42Var.J(iS);
            while (i7 < list.size()) {
                p42Var.L(((Long) list.get(i7)).longValue());
                i7++;
            }
            return;
        }
        c62 c62Var = (c62) list;
        if (!z6) {
            while (i7 < c62Var.f3442u) {
                p42Var.K(i6, c62Var.d(i7));
                i7++;
            }
            return;
        }
        p42Var.H(i6, 2);
        int iS2 = 0;
        for (int i9 = 0; i9 < c62Var.f3442u; i9++) {
            iS2 += p42.s(c62Var.d(i9));
        }
        p42Var.J(iS2);
        while (i7 < c62Var.f3442u) {
            p42Var.L(c62Var.d(i7));
            i7++;
        }
    }

    public static void b(int i6, List list, y72 y72Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p42 p42Var = ((q42) y72Var).f8227a;
        int i7 = 0;
        if (!(list instanceof k52)) {
            if (!z6) {
                while (i7 < list.size()) {
                    p42Var.x(i6, ((Integer) list.get(i7)).intValue());
                    i7++;
                }
                return;
            }
            p42Var.H(i6, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Integer) list.get(i9)).getClass();
                i8 += 4;
            }
            p42Var.J(i8);
            while (i7 < list.size()) {
                p42Var.y(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        k52 k52Var = (k52) list;
        if (!z6) {
            while (i7 < k52Var.f6258u) {
                p42Var.x(i6, k52Var.d(i7));
                i7++;
            }
            return;
        }
        p42Var.H(i6, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < k52Var.f6258u; i11++) {
            k52Var.d(i11);
            i10 += 4;
        }
        p42Var.J(i10);
        while (i7 < k52Var.f6258u) {
            p42Var.y(k52Var.d(i7));
            i7++;
        }
    }

    public static void c(int i6, List list, y72 y72Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p42 p42Var = ((q42) y72Var).f8227a;
        int i7 = 0;
        if (!(list instanceof c62)) {
            if (!z6) {
                while (i7 < list.size()) {
                    p42Var.z(i6, ((Long) list.get(i7)).longValue());
                    i7++;
                }
                return;
            }
            p42Var.H(i6, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Long) list.get(i9)).getClass();
                i8 += 8;
            }
            p42Var.J(i8);
            while (i7 < list.size()) {
                p42Var.A(((Long) list.get(i7)).longValue());
                i7++;
            }
            return;
        }
        c62 c62Var = (c62) list;
        if (!z6) {
            while (i7 < c62Var.f3442u) {
                p42Var.z(i6, c62Var.d(i7));
                i7++;
            }
            return;
        }
        p42Var.H(i6, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < c62Var.f3442u; i11++) {
            c62Var.d(i11);
            i10 += 8;
        }
        p42Var.J(i10);
        while (i7 < c62Var.f3442u) {
            p42Var.A(c62Var.d(i7));
            i7++;
        }
    }

    public static void d(int i6, List list, y72 y72Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p42 p42Var = ((q42) y72Var).f8227a;
        int i7 = 0;
        if (!(list instanceof k52)) {
            if (!z6) {
                while (i7 < list.size()) {
                    int iIntValue = ((Integer) list.get(i7)).intValue();
                    p42Var.I(i6, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i7++;
                }
                return;
            }
            p42Var.H(i6, 2);
            int iR = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                int iIntValue2 = ((Integer) list.get(i8)).intValue();
                iR += p42.r((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            p42Var.J(iR);
            while (i7 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i7)).intValue();
                p42Var.J((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i7++;
            }
            return;
        }
        k52 k52Var = (k52) list;
        if (!z6) {
            while (i7 < k52Var.f6258u) {
                int iD = k52Var.d(i7);
                p42Var.I(i6, (iD >> 31) ^ (iD + iD));
                i7++;
            }
            return;
        }
        p42Var.H(i6, 2);
        int iR2 = 0;
        for (int i9 = 0; i9 < k52Var.f6258u; i9++) {
            int iD2 = k52Var.d(i9);
            iR2 += p42.r((iD2 >> 31) ^ (iD2 + iD2));
        }
        p42Var.J(iR2);
        while (i7 < k52Var.f6258u) {
            int iD3 = k52Var.d(i7);
            p42Var.J((iD3 >> 31) ^ (iD3 + iD3));
            i7++;
        }
    }

    public static void e(int i6, List list, y72 y72Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p42 p42Var = ((q42) y72Var).f8227a;
        int i7 = 0;
        if (!(list instanceof c62)) {
            if (!z6) {
                while (i7 < list.size()) {
                    long jLongValue = ((Long) list.get(i7)).longValue();
                    p42Var.K(i6, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i7++;
                }
                return;
            }
            p42Var.H(i6, 2);
            int iS = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                long jLongValue2 = ((Long) list.get(i8)).longValue();
                iS += p42.s((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            p42Var.J(iS);
            while (i7 < list.size()) {
                long jLongValue3 = ((Long) list.get(i7)).longValue();
                p42Var.L((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i7++;
            }
            return;
        }
        c62 c62Var = (c62) list;
        if (!z6) {
            while (i7 < c62Var.f3442u) {
                long jD = c62Var.d(i7);
                p42Var.K(i6, (jD >> 63) ^ (jD + jD));
                i7++;
            }
            return;
        }
        p42Var.H(i6, 2);
        int iS2 = 0;
        for (int i9 = 0; i9 < c62Var.f3442u; i9++) {
            long jD2 = c62Var.d(i9);
            iS2 += p42.s((jD2 >> 63) ^ (jD2 + jD2));
        }
        p42Var.J(iS2);
        while (i7 < c62Var.f3442u) {
            long jD3 = c62Var.d(i7);
            p42Var.L((jD3 >> 63) ^ (jD3 + jD3));
            i7++;
        }
    }

    public static void f(int i6, List list, y72 y72Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p42 p42Var = ((q42) y72Var).f8227a;
        int i7 = 0;
        if (!(list instanceof k52)) {
            if (!z6) {
                while (i7 < list.size()) {
                    p42Var.I(i6, ((Integer) list.get(i7)).intValue());
                    i7++;
                }
                return;
            }
            p42Var.H(i6, 2);
            int iR = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                iR += p42.r(((Integer) list.get(i8)).intValue());
            }
            p42Var.J(iR);
            while (i7 < list.size()) {
                p42Var.J(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        k52 k52Var = (k52) list;
        if (!z6) {
            while (i7 < k52Var.f6258u) {
                p42Var.I(i6, k52Var.d(i7));
                i7++;
            }
            return;
        }
        p42Var.H(i6, 2);
        int iR2 = 0;
        for (int i9 = 0; i9 < k52Var.f6258u; i9++) {
            iR2 += p42.r(k52Var.d(i9));
        }
        p42Var.J(iR2);
        while (i7 < k52Var.f6258u) {
            p42Var.J(k52Var.d(i7));
            i7++;
        }
    }

    public static void g(int i6, List list, y72 y72Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p42 p42Var = ((q42) y72Var).f8227a;
        int i7 = 0;
        if (!(list instanceof c62)) {
            if (!z6) {
                while (i7 < list.size()) {
                    p42Var.K(i6, ((Long) list.get(i7)).longValue());
                    i7++;
                }
                return;
            }
            p42Var.H(i6, 2);
            int iS = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                iS += p42.s(((Long) list.get(i8)).longValue());
            }
            p42Var.J(iS);
            while (i7 < list.size()) {
                p42Var.L(((Long) list.get(i7)).longValue());
                i7++;
            }
            return;
        }
        c62 c62Var = (c62) list;
        if (!z6) {
            while (i7 < c62Var.f3442u) {
                p42Var.K(i6, c62Var.d(i7));
                i7++;
            }
            return;
        }
        p42Var.H(i6, 2);
        int iS2 = 0;
        for (int i9 = 0; i9 < c62Var.f3442u; i9++) {
            iS2 += p42.s(c62Var.d(i9));
        }
        p42Var.J(iS2);
        while (i7 < c62Var.f3442u) {
            p42Var.L(c62Var.d(i7));
            i7++;
        }
    }

    public static boolean h(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int i(List list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof k52)) {
            int iS = 0;
            while (i6 < size) {
                iS += p42.s(((Integer) list.get(i6)).intValue());
                i6++;
            }
            return iS;
        }
        k52 k52Var = (k52) list;
        int iS2 = 0;
        while (i6 < size) {
            iS2 += p42.s(k52Var.d(i6));
            i6++;
        }
        return iS2;
    }

    public static int j(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (p42.r(i6 << 3) + 4) * size;
    }

    public static int k(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (p42.r(i6 << 3) + 8) * size;
    }

    public static int l(List list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof k52)) {
            int iS = 0;
            while (i6 < size) {
                iS += p42.s(((Integer) list.get(i6)).intValue());
                i6++;
            }
            return iS;
        }
        k52 k52Var = (k52) list;
        int iS2 = 0;
        while (i6 < size) {
            iS2 += p42.s(k52Var.d(i6));
            i6++;
        }
        return iS2;
    }

    public static int m(List list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof c62)) {
            int iS = 0;
            while (i6 < size) {
                iS += p42.s(((Long) list.get(i6)).longValue());
                i6++;
            }
            return iS;
        }
        c62 c62Var = (c62) list;
        int iS2 = 0;
        while (i6 < size) {
            iS2 += p42.s(c62Var.d(i6));
            i6++;
        }
        return iS2;
    }

    public static int n(int i6, Object obj, b72 b72Var) {
        int i7 = i6 << 3;
        if (obj instanceof z52) {
            int iR = p42.r(i7);
            int iA = ((z52) obj).a();
            return androidx.camera.view.g.c(iA, iA, iR);
        }
        int iR2 = p42.r(i7);
        int iF = ((t32) ((m62) obj)).f(b72Var);
        return androidx.camera.view.g.c(iF, iF, iR2);
    }

    public static int o(List list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof k52)) {
            int iR = 0;
            while (i6 < size) {
                int iIntValue = ((Integer) list.get(i6)).intValue();
                iR += p42.r((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i6++;
            }
            return iR;
        }
        k52 k52Var = (k52) list;
        int iR2 = 0;
        while (i6 < size) {
            int iD = k52Var.d(i6);
            iR2 += p42.r((iD >> 31) ^ (iD + iD));
            i6++;
        }
        return iR2;
    }

    public static int p(List list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof c62)) {
            int iS = 0;
            while (i6 < size) {
                long jLongValue = ((Long) list.get(i6)).longValue();
                iS += p42.s((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i6++;
            }
            return iS;
        }
        c62 c62Var = (c62) list;
        int iS2 = 0;
        while (i6 < size) {
            long jD = c62Var.d(i6);
            iS2 += p42.s((jD >> 63) ^ (jD + jD));
            i6++;
        }
        return iS2;
    }

    public static int q(List list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof k52)) {
            int iR = 0;
            while (i6 < size) {
                iR += p42.r(((Integer) list.get(i6)).intValue());
                i6++;
            }
            return iR;
        }
        k52 k52Var = (k52) list;
        int iR2 = 0;
        while (i6 < size) {
            iR2 += p42.r(k52Var.d(i6));
            i6++;
        }
        return iR2;
    }

    public static int r(List list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof c62)) {
            int iS = 0;
            while (i6 < size) {
                iS += p42.s(((Long) list.get(i6)).longValue());
                i6++;
            }
            return iS;
        }
        c62 c62Var = (c62) list;
        int iS2 = 0;
        while (i6 < size) {
            iS2 += p42.s(c62Var.d(i6));
            i6++;
        }
        return iS2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object s(Object obj, int i6, r52 r52Var, m52 m52Var, Object obj2, ed0 ed0Var) {
        if (m52Var == null) {
            return obj2;
        }
        if (r52Var == null) {
            Iterator<E> it = r52Var.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!m52Var.a(iIntValue)) {
                    if (obj2 == null) {
                        ed0Var.getClass();
                        obj2 = ed0.i(obj);
                    }
                    ed0Var.getClass();
                    ((m72) obj2).b(i6 << 3, Long.valueOf(iIntValue));
                    it.remove();
                }
            }
            return obj2;
        }
        int size = r52Var.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            Integer num = (Integer) r52Var.get(i8);
            int iIntValue2 = num.intValue();
            if (m52Var.a(iIntValue2)) {
                if (i8 != i7) {
                    r52Var.set(i7, num);
                }
                i7++;
            } else {
                if (obj2 == null) {
                    ed0Var.getClass();
                    obj2 = ed0.i(obj);
                }
                ed0Var.getClass();
                ((m72) obj2).b(i6 << 3, Long.valueOf(iIntValue2));
            }
        }
        if (i7 != size) {
            r52Var.subList(i7, size).clear();
        }
        return obj2;
    }

    public static void t(Object obj, Object obj2) {
        j52 j52Var = (j52) obj;
        m72 m72Var = j52Var.zzt;
        m72 m72Var2 = ((j52) obj2).zzt;
        m72 m72Var3 = m72.f6958f;
        if (!m72Var3.equals(m72Var2)) {
            if (m72Var3.equals(m72Var)) {
                int i6 = m72Var.f6959a + m72Var2.f6959a;
                int[] iArrCopyOf = Arrays.copyOf(m72Var.f6960b, i6);
                System.arraycopy(m72Var2.f6960b, 0, iArrCopyOf, m72Var.f6959a, m72Var2.f6959a);
                Object[] objArrCopyOf = Arrays.copyOf(m72Var.f6961c, i6);
                System.arraycopy(m72Var2.f6961c, 0, objArrCopyOf, m72Var.f6959a, m72Var2.f6959a);
                m72Var = new m72(i6, iArrCopyOf, objArrCopyOf, true);
            } else {
                m72Var.getClass();
                if (!m72Var2.equals(m72Var3)) {
                    if (!m72Var.f6963e) {
                        throw new UnsupportedOperationException();
                    }
                    int i7 = m72Var.f6959a + m72Var2.f6959a;
                    m72Var.d(i7);
                    System.arraycopy(m72Var2.f6960b, 0, m72Var.f6960b, m72Var.f6959a, m72Var2.f6959a);
                    System.arraycopy(m72Var2.f6961c, 0, m72Var.f6961c, m72Var.f6959a, m72Var2.f6959a);
                    m72Var.f6959a = i7;
                }
            }
        }
        j52Var.zzt = m72Var;
    }

    public static void u(int i6, List list, y72 y72Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p42 p42Var = ((q42) y72Var).f8227a;
        int i7 = 0;
        if (!(list instanceof z32)) {
            if (!z6) {
                while (i7 < list.size()) {
                    p42Var.v(i6, ((Boolean) list.get(i7)).booleanValue());
                    i7++;
                }
                return;
            }
            p42Var.H(i6, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Boolean) list.get(i9)).getClass();
                i8++;
            }
            p42Var.J(i8);
            while (i7 < list.size()) {
                p42Var.u(((Boolean) list.get(i7)).booleanValue() ? (byte) 1 : (byte) 0);
                i7++;
            }
            return;
        }
        z32 z32Var = (z32) list;
        if (!z6) {
            while (i7 < z32Var.f11137u) {
                z32Var.e(i7);
                p42Var.v(i6, z32Var.f11136t[i7]);
                i7++;
            }
            return;
        }
        p42Var.H(i6, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < z32Var.f11137u; i11++) {
            z32Var.e(i11);
            boolean z7 = z32Var.f11136t[i11];
            i10++;
        }
        p42Var.J(i10);
        while (i7 < z32Var.f11137u) {
            z32Var.e(i7);
            p42Var.u(z32Var.f11136t[i7] ? (byte) 1 : (byte) 0);
            i7++;
        }
    }

    public static void v(int i6, List list, y72 y72Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p42 p42Var = ((q42) y72Var).f8227a;
        int i7 = 0;
        if (!(list instanceof r42)) {
            if (!z6) {
                while (i7 < list.size()) {
                    p42Var.z(i6, Double.doubleToRawLongBits(((Double) list.get(i7)).doubleValue()));
                    i7++;
                }
                return;
            }
            p42Var.H(i6, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Double) list.get(i9)).getClass();
                i8 += 8;
            }
            p42Var.J(i8);
            while (i7 < list.size()) {
                p42Var.A(Double.doubleToRawLongBits(((Double) list.get(i7)).doubleValue()));
                i7++;
            }
            return;
        }
        r42 r42Var = (r42) list;
        if (!z6) {
            while (i7 < r42Var.f8543u) {
                r42Var.e(i7);
                p42Var.z(i6, Double.doubleToRawLongBits(r42Var.f8542t[i7]));
                i7++;
            }
            return;
        }
        p42Var.H(i6, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < r42Var.f8543u; i11++) {
            r42Var.e(i11);
            double d7 = r42Var.f8542t[i11];
            i10 += 8;
        }
        p42Var.J(i10);
        while (i7 < r42Var.f8543u) {
            r42Var.e(i7);
            p42Var.A(Double.doubleToRawLongBits(r42Var.f8542t[i7]));
            i7++;
        }
    }

    public static void w(int i6, List list, y72 y72Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p42 p42Var = ((q42) y72Var).f8227a;
        int i7 = 0;
        if (!(list instanceof k52)) {
            if (!z6) {
                while (i7 < list.size()) {
                    p42Var.B(i6, ((Integer) list.get(i7)).intValue());
                    i7++;
                }
                return;
            }
            p42Var.H(i6, 2);
            int iS = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                iS += p42.s(((Integer) list.get(i8)).intValue());
            }
            p42Var.J(iS);
            while (i7 < list.size()) {
                p42Var.C(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        k52 k52Var = (k52) list;
        if (!z6) {
            while (i7 < k52Var.f6258u) {
                p42Var.B(i6, k52Var.d(i7));
                i7++;
            }
            return;
        }
        p42Var.H(i6, 2);
        int iS2 = 0;
        for (int i9 = 0; i9 < k52Var.f6258u; i9++) {
            iS2 += p42.s(k52Var.d(i9));
        }
        p42Var.J(iS2);
        while (i7 < k52Var.f6258u) {
            p42Var.C(k52Var.d(i7));
            i7++;
        }
    }

    public static void x(int i6, List list, y72 y72Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p42 p42Var = ((q42) y72Var).f8227a;
        int i7 = 0;
        if (!(list instanceof k52)) {
            if (!z6) {
                while (i7 < list.size()) {
                    p42Var.x(i6, ((Integer) list.get(i7)).intValue());
                    i7++;
                }
                return;
            }
            p42Var.H(i6, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Integer) list.get(i9)).getClass();
                i8 += 4;
            }
            p42Var.J(i8);
            while (i7 < list.size()) {
                p42Var.y(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        k52 k52Var = (k52) list;
        if (!z6) {
            while (i7 < k52Var.f6258u) {
                p42Var.x(i6, k52Var.d(i7));
                i7++;
            }
            return;
        }
        p42Var.H(i6, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < k52Var.f6258u; i11++) {
            k52Var.d(i11);
            i10 += 4;
        }
        p42Var.J(i10);
        while (i7 < k52Var.f6258u) {
            p42Var.y(k52Var.d(i7));
            i7++;
        }
    }

    public static void y(int i6, List list, y72 y72Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p42 p42Var = ((q42) y72Var).f8227a;
        int i7 = 0;
        if (!(list instanceof c62)) {
            if (!z6) {
                while (i7 < list.size()) {
                    p42Var.z(i6, ((Long) list.get(i7)).longValue());
                    i7++;
                }
                return;
            }
            p42Var.H(i6, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Long) list.get(i9)).getClass();
                i8 += 8;
            }
            p42Var.J(i8);
            while (i7 < list.size()) {
                p42Var.A(((Long) list.get(i7)).longValue());
                i7++;
            }
            return;
        }
        c62 c62Var = (c62) list;
        if (!z6) {
            while (i7 < c62Var.f3442u) {
                p42Var.z(i6, c62Var.d(i7));
                i7++;
            }
            return;
        }
        p42Var.H(i6, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < c62Var.f3442u; i11++) {
            c62Var.d(i11);
            i10 += 8;
        }
        p42Var.J(i10);
        while (i7 < c62Var.f3442u) {
            p42Var.A(c62Var.d(i7));
            i7++;
        }
    }

    public static void z(int i6, List list, y72 y72Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p42 p42Var = ((q42) y72Var).f8227a;
        int i7 = 0;
        if (!(list instanceof b52)) {
            if (!z6) {
                while (i7 < list.size()) {
                    p42Var.x(i6, Float.floatToRawIntBits(((Float) list.get(i7)).floatValue()));
                    i7++;
                }
                return;
            }
            p42Var.H(i6, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Float) list.get(i9)).getClass();
                i8 += 4;
            }
            p42Var.J(i8);
            while (i7 < list.size()) {
                p42Var.y(Float.floatToRawIntBits(((Float) list.get(i7)).floatValue()));
                i7++;
            }
            return;
        }
        b52 b52Var = (b52) list;
        if (!z6) {
            while (i7 < b52Var.f2929u) {
                b52Var.e(i7);
                p42Var.x(i6, Float.floatToRawIntBits(b52Var.f2928t[i7]));
                i7++;
            }
            return;
        }
        p42Var.H(i6, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < b52Var.f2929u; i11++) {
            b52Var.e(i11);
            float f6 = b52Var.f2928t[i11];
            i10 += 4;
        }
        p42Var.J(i10);
        while (i7 < b52Var.f2929u) {
            b52Var.e(i7);
            p42Var.y(Float.floatToRawIntBits(b52Var.f2928t[i7]));
            i7++;
        }
    }
}
