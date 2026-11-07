package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.s;
import com.google.crypto.tink.shaded.protobuf.y;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<?> f6674a;

    /* renamed from: b, reason: collision with root package name */
    public static final n1<?, ?> f6675b;

    /* renamed from: c, reason: collision with root package name */
    public static final n1<?, ?> f6676c;

    /* renamed from: d, reason: collision with root package name */
    public static final p1 f6677d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f6674a = cls;
        f6675b = x(false);
        f6676c = x(true);
        f6677d = new p1();
    }

    public static <UT, UB> UB A(Object obj, int i10, int i11, UB ub2, n1<UT, UB> n1Var) {
        if (ub2 == null) {
            ub2 = (UB) n1Var.f(obj);
        }
        n1Var.e(ub2, i10, i11);
        return ub2;
    }

    public static void B(int i10, List<Boolean> list, v1 v1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = ((l) v1Var).f6726a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                kVar.V(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        kVar.h0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).getClass();
            Logger logger = k.f6720b;
            i12++;
        }
        kVar.j0(i12);
        while (i11 < list.size()) {
            kVar.U(list.get(i11).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    public static void C(int i10, List<h> list, v1 v1Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) v1Var;
        lVar.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            lVar.f6726a.W(i10, list.get(i11));
        }
    }

    public static void D(int i10, List<Double> list, v1 v1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = ((l) v1Var).f6726a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                double dDoubleValue = list.get(i11).doubleValue();
                kVar.getClass();
                kVar.Z(i10, Double.doubleToRawLongBits(dDoubleValue));
                i11++;
            }
            return;
        }
        kVar.h0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).getClass();
            Logger logger = k.f6720b;
            i12 += 8;
        }
        kVar.j0(i12);
        while (i11 < list.size()) {
            kVar.a0(Double.doubleToRawLongBits(list.get(i11).doubleValue()));
            i11++;
        }
    }

    public static void E(int i10, List<Integer> list, v1 v1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = ((l) v1Var).f6726a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                kVar.b0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        kVar.h0(i10, 2);
        int iN = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iN += k.N(list.get(i12).intValue());
        }
        kVar.j0(iN);
        while (i11 < list.size()) {
            kVar.c0(list.get(i11).intValue());
            i11++;
        }
    }

    public static void F(int i10, List<Integer> list, v1 v1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = ((l) v1Var).f6726a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                kVar.X(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        kVar.h0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).getClass();
            Logger logger = k.f6720b;
            i12 += 4;
        }
        kVar.j0(i12);
        while (i11 < list.size()) {
            kVar.Y(list.get(i11).intValue());
            i11++;
        }
    }

    public static void G(int i10, List<Long> list, v1 v1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = ((l) v1Var).f6726a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                kVar.Z(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        kVar.h0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).getClass();
            Logger logger = k.f6720b;
            i12 += 8;
        }
        kVar.j0(i12);
        while (i11 < list.size()) {
            kVar.a0(list.get(i11).longValue());
            i11++;
        }
    }

    public static void H(int i10, List<Float> list, v1 v1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = ((l) v1Var).f6726a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                float fFloatValue = list.get(i11).floatValue();
                kVar.getClass();
                kVar.X(i10, Float.floatToRawIntBits(fFloatValue));
                i11++;
            }
            return;
        }
        kVar.h0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).getClass();
            Logger logger = k.f6720b;
            i12 += 4;
        }
        kVar.j0(i12);
        while (i11 < list.size()) {
            kVar.Y(Float.floatToRawIntBits(list.get(i11).floatValue()));
            i11++;
        }
    }

    public static void I(int i10, List<?> list, v1 v1Var, g1 g1Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) v1Var;
        lVar.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            lVar.b(i10, list.get(i11), g1Var);
        }
    }

    public static void J(int i10, List<Integer> list, v1 v1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = ((l) v1Var).f6726a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                kVar.b0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        kVar.h0(i10, 2);
        int iN = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iN += k.N(list.get(i12).intValue());
        }
        kVar.j0(iN);
        while (i11 < list.size()) {
            kVar.c0(list.get(i11).intValue());
            i11++;
        }
    }

    public static void K(int i10, List<Long> list, v1 v1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = ((l) v1Var).f6726a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                kVar.k0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        kVar.h0(i10, 2);
        int iT = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iT += k.T(list.get(i12).longValue());
        }
        kVar.j0(iT);
        while (i11 < list.size()) {
            kVar.l0(list.get(i11).longValue());
            i11++;
        }
    }

    public static void L(int i10, List<?> list, v1 v1Var, g1 g1Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) v1Var;
        lVar.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            lVar.f6726a.d0(i10, (p0) list.get(i11), g1Var);
        }
    }

    public static void M(int i10, List<Integer> list, v1 v1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = ((l) v1Var).f6726a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                kVar.X(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        kVar.h0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).getClass();
            Logger logger = k.f6720b;
            i12 += 4;
        }
        kVar.j0(i12);
        while (i11 < list.size()) {
            kVar.Y(list.get(i11).intValue());
            i11++;
        }
    }

    public static void N(int i10, List<Long> list, v1 v1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = ((l) v1Var).f6726a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                kVar.Z(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        kVar.h0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).getClass();
            Logger logger = k.f6720b;
            i12 += 8;
        }
        kVar.j0(i12);
        while (i11 < list.size()) {
            kVar.a0(list.get(i11).longValue());
            i11++;
        }
    }

    public static void O(int i10, List<Integer> list, v1 v1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = ((l) v1Var).f6726a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                int iIntValue = list.get(i11).intValue();
                kVar.i0(i10, (iIntValue >> 31) ^ (iIntValue << 1));
                i11++;
            }
            return;
        }
        kVar.h0(i10, 2);
        int iS = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int iIntValue2 = list.get(i12).intValue();
            iS += k.S((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        kVar.j0(iS);
        while (i11 < list.size()) {
            int iIntValue3 = list.get(i11).intValue();
            kVar.j0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i11++;
        }
    }

    public static void P(int i10, List<Long> list, v1 v1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = ((l) v1Var).f6726a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                long jLongValue = list.get(i11).longValue();
                kVar.k0(i10, (jLongValue >> 63) ^ (jLongValue << 1));
                i11++;
            }
            return;
        }
        kVar.h0(i10, 2);
        int iT = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long jLongValue2 = list.get(i12).longValue();
            iT += k.T((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        kVar.j0(iT);
        while (i11 < list.size()) {
            long jLongValue3 = list.get(i11).longValue();
            kVar.l0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i11++;
        }
    }

    public static void Q(int i10, List<String> list, v1 v1Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = ((l) v1Var).f6726a;
        int i11 = 0;
        if (!(list instanceof e0)) {
            while (i11 < list.size()) {
                kVar.g0(i10, list.get(i11));
                i11++;
            }
            return;
        }
        e0 e0Var = (e0) list;
        while (i11 < list.size()) {
            Object raw = e0Var.getRaw(i11);
            if (raw instanceof String) {
                kVar.g0(i10, (String) raw);
            } else {
                kVar.W(i10, (h) raw);
            }
            i11++;
        }
    }

    public static void R(int i10, List<Integer> list, v1 v1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = ((l) v1Var).f6726a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                kVar.i0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        kVar.h0(i10, 2);
        int iS = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iS += k.S(list.get(i12).intValue());
        }
        kVar.j0(iS);
        while (i11 < list.size()) {
            kVar.j0(list.get(i11).intValue());
            i11++;
        }
    }

    public static void S(int i10, List<Long> list, v1 v1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = ((l) v1Var).f6726a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                kVar.k0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        kVar.h0(i10, 2);
        int iT = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iT += k.T(list.get(i12).longValue());
        }
        kVar.j0(iT);
        while (i11 < list.size()) {
            kVar.l0(list.get(i11).longValue());
            i11++;
        }
    }

    public static int a(int i10, List<h> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iQ = k.Q(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iQ += k.J(list.get(i11));
        }
        return iQ;
    }

    public static int b(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (k.Q(i10) * size) + c(list);
    }

    public static int c(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof x)) {
            int iN = 0;
            while (i10 < size) {
                iN += k.N(list.get(i10).intValue());
                i10++;
            }
            return iN;
        }
        x xVar = (x) list;
        int iN2 = 0;
        while (i10 < size) {
            xVar.b(i10);
            iN2 += k.N(xVar.f6816b[i10]);
            i10++;
        }
        return iN2;
    }

    public static int d(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return k.K(i10) * size;
    }

    public static int e(List<?> list) {
        return list.size() * 4;
    }

    public static int f(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return k.L(i10) * size;
    }

    public static int g(List<?> list) {
        return list.size() * 8;
    }

    public static int h(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (k.Q(i10) * size) + i(list);
    }

    public static int i(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof x)) {
            int iN = 0;
            while (i10 < size) {
                iN += k.N(list.get(i10).intValue());
                i10++;
            }
            return iN;
        }
        x xVar = (x) list;
        int iN2 = 0;
        while (i10 < size) {
            xVar.b(i10);
            iN2 += k.N(xVar.f6816b[i10]);
            i10++;
        }
        return iN2;
    }

    public static int j(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (k.Q(i10) * list.size()) + k(list);
    }

    public static int k(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof g0)) {
            int iT = 0;
            while (i10 < size) {
                iT += k.T(list.get(i10).longValue());
                i10++;
            }
            return iT;
        }
        g0 g0Var = (g0) list;
        int iT2 = 0;
        while (i10 < size) {
            g0Var.b(i10);
            iT2 += k.T(g0Var.f6663b[i10]);
            i10++;
        }
        return iT2;
    }

    public static int l(int i10, Object obj, g1 g1Var) {
        if (obj instanceof c0) {
            return k.O((c0) obj) + k.Q(i10);
        }
        int iQ = k.Q(i10);
        int iC = ((a) ((p0) obj)).c(g1Var);
        return k.S(iC) + iC + iQ;
    }

    public static int m(int i10, List<?> list, g1 g1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iQ = k.Q(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof c0) {
                iQ = k.O((c0) obj) + iQ;
            } else {
                int iC = ((a) ((p0) obj)).c(g1Var);
                iQ = k.S(iC) + iC + iQ;
            }
        }
        return iQ;
    }

    public static int n(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (k.Q(i10) * size) + o(list);
    }

    public static int o(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof x)) {
            int iS = 0;
            while (i10 < size) {
                int iIntValue = list.get(i10).intValue();
                iS += k.S((iIntValue >> 31) ^ (iIntValue << 1));
                i10++;
            }
            return iS;
        }
        x xVar = (x) list;
        int iS2 = 0;
        while (i10 < size) {
            xVar.b(i10);
            int i11 = xVar.f6816b[i10];
            iS2 += k.S((i11 >> 31) ^ (i11 << 1));
            i10++;
        }
        return iS2;
    }

    public static int p(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (k.Q(i10) * size) + q(list);
    }

    public static int q(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof g0)) {
            int iT = 0;
            while (i10 < size) {
                long jLongValue = list.get(i10).longValue();
                iT += k.T((jLongValue >> 63) ^ (jLongValue << 1));
                i10++;
            }
            return iT;
        }
        g0 g0Var = (g0) list;
        int iT2 = 0;
        while (i10 < size) {
            g0Var.b(i10);
            long j10 = g0Var.f6663b[i10];
            iT2 += k.T((j10 >> 63) ^ (j10 << 1));
            i10++;
        }
        return iT2;
    }

    public static int r(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iQ = k.Q(i10) * size;
        if (!(list instanceof e0)) {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof h) {
                    int size2 = ((h) obj).size();
                    iQ = k.S(size2) + size2 + iQ;
                } else {
                    iQ = k.P((String) obj) + iQ;
                }
                i11++;
            }
            return iQ;
        }
        e0 e0Var = (e0) list;
        while (i11 < size) {
            Object raw = e0Var.getRaw(i11);
            if (raw instanceof h) {
                int size3 = ((h) raw).size();
                iQ = k.S(size3) + size3 + iQ;
            } else {
                iQ = k.P((String) raw) + iQ;
            }
            i11++;
        }
        return iQ;
    }

    public static int s(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (k.Q(i10) * size) + t(list);
    }

    public static int t(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof x)) {
            int iS = 0;
            while (i10 < size) {
                iS += k.S(list.get(i10).intValue());
                i10++;
            }
            return iS;
        }
        x xVar = (x) list;
        int iS2 = 0;
        while (i10 < size) {
            xVar.b(i10);
            iS2 += k.S(xVar.f6816b[i10]);
            i10++;
        }
        return iS2;
    }

    public static int u(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (k.Q(i10) * size) + v(list);
    }

    public static int v(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof g0)) {
            int iT = 0;
            while (i10 < size) {
                iT += k.T(list.get(i10).longValue());
                i10++;
            }
            return iT;
        }
        g0 g0Var = (g0) list;
        int iT2 = 0;
        while (i10 < size) {
            g0Var.b(i10);
            iT2 += k.T(g0Var.f6663b[i10]);
            i10++;
        }
        return iT2;
    }

    public static <UT, UB> UB w(Object obj, int i10, List<Integer> list, y.b bVar, UB ub2, n1<UT, UB> n1Var) {
        if (bVar == null) {
            return ub2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (!bVar.a()) {
                    ub2 = (UB) A(obj, i10, iIntValue, ub2, n1Var);
                    it.remove();
                }
            }
            return ub2;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = list.get(i12);
            int iIntValue2 = num.intValue();
            if (bVar.a()) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                ub2 = (UB) A(obj, i10, iIntValue2, ub2, n1Var);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return ub2;
    }

    public static n1<?, ?> x(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (n1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static <T, FT extends s.a<FT>> void y(p<FT> pVar, T t3, T t10) {
        s<T> sVarC = pVar.c(t10);
        if (sVarC.f6758a.isEmpty()) {
            return;
        }
        s<T> sVarD = pVar.d(t3);
        sVarD.getClass();
        i1 i1Var = sVarC.f6758a;
        if (i1Var.f6705b.size() > 0) {
            sVarD.h(i1Var.f(0));
            throw null;
        }
        Iterator<Map.Entry<Object, Object>> it = i1Var.g().iterator();
        if (it.hasNext()) {
            sVarD.h(it.next());
            throw null;
        }
    }

    public static boolean z(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
