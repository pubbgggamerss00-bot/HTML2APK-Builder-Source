package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.d0;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<?> f2127a;

    /* renamed from: b, reason: collision with root package name */
    public static final w1<?, ?> f2128b;

    /* renamed from: c, reason: collision with root package name */
    public static final y1 f2129c;

    static {
        Class<?> cls;
        Class<?> cls2;
        k1 k1Var = k1.f2075c;
        w1<?, ?> w1Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f2127a = cls;
        try {
            k1 k1Var2 = k1.f2075c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                w1Var = (w1) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f2128b = w1Var;
        f2129c = new y1();
    }

    public static void A(int i10, List<Integer> list, c2 c2Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = ((n) c2Var).f2101a;
        int i11 = 0;
        if (!(list instanceof c0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    int iIntValue = list.get(i11).intValue();
                    mVar.C(i10, (iIntValue >> 31) ^ (iIntValue << 1));
                    i11++;
                }
                return;
            }
            mVar.B(i10, 2);
            int iD = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iD += m.d(list.get(i12).intValue());
            }
            mVar.D(iD);
            while (i11 < list.size()) {
                int iIntValue2 = list.get(i11).intValue();
                mVar.D((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                i11++;
            }
            return;
        }
        c0 c0Var = (c0) list;
        if (!z10) {
            while (i11 < c0Var.f1995c) {
                int i13 = c0Var.getInt(i11);
                mVar.C(i10, (i13 >> 31) ^ (i13 << 1));
                i11++;
            }
            return;
        }
        mVar.B(i10, 2);
        int iD2 = 0;
        for (int i14 = 0; i14 < c0Var.f1995c; i14++) {
            iD2 += m.d(c0Var.getInt(i14));
        }
        mVar.D(iD2);
        while (i11 < c0Var.f1995c) {
            int i15 = c0Var.getInt(i11);
            mVar.D((i15 >> 31) ^ (i15 << 1));
            i11++;
        }
    }

    public static void B(int i10, List<Long> list, c2 c2Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = ((n) c2Var).f2101a;
        int i11 = 0;
        if (!(list instanceof n0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    long jLongValue = list.get(i11).longValue();
                    mVar.E(i10, (jLongValue >> 63) ^ (jLongValue << 1));
                    i11++;
                }
                return;
            }
            mVar.B(i10, 2);
            int iE = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iE += m.e(list.get(i12).longValue());
            }
            mVar.D(iE);
            while (i11 < list.size()) {
                long jLongValue2 = list.get(i11).longValue();
                mVar.F((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                i11++;
            }
            return;
        }
        n0 n0Var = (n0) list;
        if (!z10) {
            while (i11 < n0Var.f2104c) {
                long j10 = n0Var.getLong(i11);
                mVar.E(i10, (j10 >> 63) ^ (j10 << 1));
                i11++;
            }
            return;
        }
        mVar.B(i10, 2);
        int iE2 = 0;
        for (int i13 = 0; i13 < n0Var.f2104c; i13++) {
            iE2 += m.e(n0Var.getLong(i13));
        }
        mVar.D(iE2);
        while (i11 < n0Var.f2104c) {
            long j11 = n0Var.getLong(i11);
            mVar.F((j11 >> 63) ^ (j11 << 1));
            i11++;
        }
    }

    public static void C(int i10, List<String> list, c2 c2Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = ((n) c2Var).f2101a;
        int i11 = 0;
        if (!(list instanceof j0)) {
            while (i11 < list.size()) {
                mVar.z(i10, list.get(i11));
                i11++;
            }
            return;
        }
        j0 j0Var = (j0) list;
        while (i11 < list.size()) {
            Object objH = j0Var.h();
            if (objH instanceof String) {
                mVar.z(i10, (String) objH);
            } else {
                mVar.n(i10, (j) objH);
            }
            i11++;
        }
    }

    public static void D(int i10, List<Integer> list, c2 c2Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = ((n) c2Var).f2101a;
        int i11 = 0;
        if (!(list instanceof c0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    mVar.C(i10, list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            mVar.B(i10, 2);
            int iH = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iH += m.h(list.get(i12).intValue());
            }
            mVar.D(iH);
            while (i11 < list.size()) {
                mVar.D(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        c0 c0Var = (c0) list;
        if (!z10) {
            while (i11 < c0Var.f1995c) {
                mVar.C(i10, c0Var.getInt(i11));
                i11++;
            }
            return;
        }
        mVar.B(i10, 2);
        int iH2 = 0;
        for (int i13 = 0; i13 < c0Var.f1995c; i13++) {
            iH2 += m.h(c0Var.getInt(i13));
        }
        mVar.D(iH2);
        while (i11 < c0Var.f1995c) {
            mVar.D(c0Var.getInt(i11));
            i11++;
        }
    }

    public static void E(int i10, List<Long> list, c2 c2Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = ((n) c2Var).f2101a;
        int i11 = 0;
        if (!(list instanceof n0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    mVar.E(i10, list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            mVar.B(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += m.i(list.get(i13).longValue());
            }
            mVar.D(i12);
            while (i11 < list.size()) {
                mVar.F(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        n0 n0Var = (n0) list;
        if (!z10) {
            while (i11 < n0Var.f2104c) {
                mVar.E(i10, n0Var.getLong(i11));
                i11++;
            }
            return;
        }
        mVar.B(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < n0Var.f2104c; i15++) {
            i14 += m.i(n0Var.getLong(i15));
        }
        mVar.D(i14);
        while (i11 < n0Var.f2104c) {
            mVar.F(n0Var.getLong(i11));
            i11++;
        }
    }

    public static int a(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof c0)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += m.i(list.get(i10).intValue());
                i10++;
            }
            return i11;
        }
        c0 c0Var = (c0) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += m.i(c0Var.getInt(i10));
            i10++;
        }
        return i12;
    }

    public static int b(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (m.g(i10) + 4) * size;
    }

    public static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (m.g(i10) + 8) * size;
    }

    public static int d(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof c0)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += m.i(list.get(i10).intValue());
                i10++;
            }
            return i11;
        }
        c0 c0Var = (c0) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += m.i(c0Var.getInt(i10));
            i10++;
        }
        return i12;
    }

    public static int e(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof n0)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += m.i(list.get(i10).longValue());
                i10++;
            }
            return i11;
        }
        n0 n0Var = (n0) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += m.i(n0Var.getLong(i10));
            i10++;
        }
        return i12;
    }

    public static int f(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof c0)) {
            int iD = 0;
            while (i10 < size) {
                iD += m.d(list.get(i10).intValue());
                i10++;
            }
            return iD;
        }
        c0 c0Var = (c0) list;
        int iD2 = 0;
        while (i10 < size) {
            iD2 += m.d(c0Var.getInt(i10));
            i10++;
        }
        return iD2;
    }

    public static int g(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof n0)) {
            int iE = 0;
            while (i10 < size) {
                iE += m.e(list.get(i10).longValue());
                i10++;
            }
            return iE;
        }
        n0 n0Var = (n0) list;
        int iE2 = 0;
        while (i10 < size) {
            iE2 += m.e(n0Var.getLong(i10));
            i10++;
        }
        return iE2;
    }

    public static int h(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof c0)) {
            int iH = 0;
            while (i10 < size) {
                iH += m.h(list.get(i10).intValue());
                i10++;
            }
            return iH;
        }
        c0 c0Var = (c0) list;
        int iH2 = 0;
        while (i10 < size) {
            iH2 += m.h(c0Var.getInt(i10));
            i10++;
        }
        return iH2;
    }

    public static int i(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof n0)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += m.i(list.get(i10).longValue());
                i10++;
            }
            return i11;
        }
        n0 n0Var = (n0) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += m.i(n0Var.getLong(i10));
            i10++;
        }
        return i12;
    }

    public static Object j(Object obj, int i10, AbstractList abstractList, d0.d dVar, Object obj2, w1 w1Var) {
        if (dVar == null) {
            return obj2;
        }
        int size = abstractList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) abstractList.get(i12);
            int iIntValue = num.intValue();
            if (dVar.findValueByNumber(iIntValue) != null) {
                if (i12 != i11) {
                    abstractList.set(i11, num);
                }
                i11++;
            } else {
                obj2 = m(obj, i10, iIntValue, obj2, w1Var);
            }
        }
        if (i11 != size) {
            abstractList.subList(i11, size).clear();
        }
        return obj2;
    }

    public static <UT, UB> UB k(Object obj, int i10, List<Integer> list, d0.e eVar, UB ub2, w1<UT, UB> w1Var) {
        if (eVar == null) {
            return ub2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (!eVar.isInRange(iIntValue)) {
                    ub2 = (UB) m(obj, i10, iIntValue, ub2, w1Var);
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
            if (eVar.isInRange(iIntValue2)) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                ub2 = (UB) m(obj, i10, iIntValue2, ub2, w1Var);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return ub2;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static <UT, UB> UB m(Object obj, int i10, int i11, UB ub2, w1<UT, UB> w1Var) {
        if (ub2 == null) {
            ub2 = (UB) w1Var.f(obj);
        }
        w1Var.e(ub2, i10, i11);
        return ub2;
    }

    public static void n(int i10, List<Boolean> list, c2 c2Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = ((n) c2Var).f2101a;
        int i11 = 0;
        if (!(list instanceof f)) {
            if (!z10) {
                while (i11 < list.size()) {
                    mVar.l(i10, list.get(i11).booleanValue());
                    i11++;
                }
                return;
            }
            mVar.B(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).getClass();
                Logger logger = m.f2085b;
                i12++;
            }
            mVar.D(i12);
            while (i11 < list.size()) {
                mVar.k(list.get(i11).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        f fVar = (f) list;
        if (!z10) {
            while (i11 < fVar.f2012c) {
                fVar.b(i11);
                mVar.l(i10, fVar.f2011b[i11]);
                i11++;
            }
            return;
        }
        mVar.B(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < fVar.f2012c; i15++) {
            fVar.b(i15);
            boolean z11 = fVar.f2011b[i15];
            Logger logger2 = m.f2085b;
            i14++;
        }
        mVar.D(i14);
        while (i11 < fVar.f2012c) {
            fVar.b(i11);
            mVar.k(fVar.f2011b[i11] ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    public static void o(int i10, List<j> list, c2 c2Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) c2Var;
        nVar.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            nVar.f2101a.n(i10, list.get(i11));
        }
    }

    public static void p(int i10, List<Double> list, c2 c2Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = ((n) c2Var).f2101a;
        int i11 = 0;
        if (!(list instanceof q)) {
            if (!z10) {
                while (i11 < list.size()) {
                    double dDoubleValue = list.get(i11).doubleValue();
                    mVar.getClass();
                    mVar.r(i10, Double.doubleToRawLongBits(dDoubleValue));
                    i11++;
                }
                return;
            }
            mVar.B(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).getClass();
                Logger logger = m.f2085b;
                i12 += 8;
            }
            mVar.D(i12);
            while (i11 < list.size()) {
                mVar.s(Double.doubleToRawLongBits(list.get(i11).doubleValue()));
                i11++;
            }
            return;
        }
        q qVar = (q) list;
        if (!z10) {
            while (i11 < qVar.f2132c) {
                qVar.b(i11);
                double d10 = qVar.f2131b[i11];
                mVar.getClass();
                mVar.r(i10, Double.doubleToRawLongBits(d10));
                i11++;
            }
            return;
        }
        mVar.B(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < qVar.f2132c; i15++) {
            qVar.b(i15);
            double d11 = qVar.f2131b[i15];
            Logger logger2 = m.f2085b;
            i14 += 8;
        }
        mVar.D(i14);
        while (i11 < qVar.f2132c) {
            qVar.b(i11);
            mVar.s(Double.doubleToRawLongBits(qVar.f2131b[i11]));
            i11++;
        }
    }

    public static void q(int i10, List<Integer> list, c2 c2Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = ((n) c2Var).f2101a;
        int i11 = 0;
        if (!(list instanceof c0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    mVar.t(i10, list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            mVar.B(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += m.i(list.get(i13).intValue());
            }
            mVar.D(i12);
            while (i11 < list.size()) {
                mVar.u(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        c0 c0Var = (c0) list;
        if (!z10) {
            while (i11 < c0Var.f1995c) {
                mVar.t(i10, c0Var.getInt(i11));
                i11++;
            }
            return;
        }
        mVar.B(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c0Var.f1995c; i15++) {
            i14 += m.i(c0Var.getInt(i15));
        }
        mVar.D(i14);
        while (i11 < c0Var.f1995c) {
            mVar.u(c0Var.getInt(i11));
            i11++;
        }
    }

    public static void r(int i10, List<Integer> list, c2 c2Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = ((n) c2Var).f2101a;
        int i11 = 0;
        if (!(list instanceof c0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    mVar.p(i10, list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            mVar.B(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).getClass();
                Logger logger = m.f2085b;
                i12 += 4;
            }
            mVar.D(i12);
            while (i11 < list.size()) {
                mVar.q(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        c0 c0Var = (c0) list;
        if (!z10) {
            while (i11 < c0Var.f1995c) {
                mVar.p(i10, c0Var.getInt(i11));
                i11++;
            }
            return;
        }
        mVar.B(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c0Var.f1995c; i15++) {
            c0Var.getInt(i15);
            Logger logger2 = m.f2085b;
            i14 += 4;
        }
        mVar.D(i14);
        while (i11 < c0Var.f1995c) {
            mVar.q(c0Var.getInt(i11));
            i11++;
        }
    }

    public static void s(int i10, List<Long> list, c2 c2Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = ((n) c2Var).f2101a;
        int i11 = 0;
        if (!(list instanceof n0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    mVar.r(i10, list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            mVar.B(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).getClass();
                Logger logger = m.f2085b;
                i12 += 8;
            }
            mVar.D(i12);
            while (i11 < list.size()) {
                mVar.s(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        n0 n0Var = (n0) list;
        if (!z10) {
            while (i11 < n0Var.f2104c) {
                mVar.r(i10, n0Var.getLong(i11));
                i11++;
            }
            return;
        }
        mVar.B(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < n0Var.f2104c; i15++) {
            n0Var.getLong(i15);
            Logger logger2 = m.f2085b;
            i14 += 8;
        }
        mVar.D(i14);
        while (i11 < n0Var.f2104c) {
            mVar.s(n0Var.getLong(i11));
            i11++;
        }
    }

    public static void t(int i10, List<Float> list, c2 c2Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = ((n) c2Var).f2101a;
        int i11 = 0;
        if (!(list instanceof a0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    float fFloatValue = list.get(i11).floatValue();
                    mVar.getClass();
                    mVar.p(i10, Float.floatToRawIntBits(fFloatValue));
                    i11++;
                }
                return;
            }
            mVar.B(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).getClass();
                Logger logger = m.f2085b;
                i12 += 4;
            }
            mVar.D(i12);
            while (i11 < list.size()) {
                mVar.q(Float.floatToRawIntBits(list.get(i11).floatValue()));
                i11++;
            }
            return;
        }
        a0 a0Var = (a0) list;
        if (!z10) {
            while (i11 < a0Var.f1950c) {
                a0Var.b(i11);
                float f10 = a0Var.f1949b[i11];
                mVar.getClass();
                mVar.p(i10, Float.floatToRawIntBits(f10));
                i11++;
            }
            return;
        }
        mVar.B(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < a0Var.f1950c; i15++) {
            a0Var.b(i15);
            float f11 = a0Var.f1949b[i15];
            Logger logger2 = m.f2085b;
            i14 += 4;
        }
        mVar.D(i14);
        while (i11 < a0Var.f1950c) {
            a0Var.b(i11);
            mVar.q(Float.floatToRawIntBits(a0Var.f1949b[i11]));
            i11++;
        }
    }

    public static void u(int i10, List<?> list, c2 c2Var, o1 o1Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) c2Var;
        nVar.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            nVar.a(i10, list.get(i11), o1Var);
        }
    }

    public static void v(int i10, List<Integer> list, c2 c2Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = ((n) c2Var).f2101a;
        int i11 = 0;
        if (!(list instanceof c0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    mVar.t(i10, list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            mVar.B(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += m.i(list.get(i13).intValue());
            }
            mVar.D(i12);
            while (i11 < list.size()) {
                mVar.u(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        c0 c0Var = (c0) list;
        if (!z10) {
            while (i11 < c0Var.f1995c) {
                mVar.t(i10, c0Var.getInt(i11));
                i11++;
            }
            return;
        }
        mVar.B(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c0Var.f1995c; i15++) {
            i14 += m.i(c0Var.getInt(i15));
        }
        mVar.D(i14);
        while (i11 < c0Var.f1995c) {
            mVar.u(c0Var.getInt(i11));
            i11++;
        }
    }

    public static void w(int i10, List<Long> list, c2 c2Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = ((n) c2Var).f2101a;
        int i11 = 0;
        if (!(list instanceof n0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    mVar.E(i10, list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            mVar.B(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += m.i(list.get(i13).longValue());
            }
            mVar.D(i12);
            while (i11 < list.size()) {
                mVar.F(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        n0 n0Var = (n0) list;
        if (!z10) {
            while (i11 < n0Var.f2104c) {
                mVar.E(i10, n0Var.getLong(i11));
                i11++;
            }
            return;
        }
        mVar.B(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < n0Var.f2104c; i15++) {
            i14 += m.i(n0Var.getLong(i15));
        }
        mVar.D(i14);
        while (i11 < n0Var.f2104c) {
            mVar.F(n0Var.getLong(i11));
            i11++;
        }
    }

    public static void x(int i10, List<?> list, c2 c2Var, o1 o1Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) c2Var;
        nVar.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            nVar.f2101a.v(i10, (MessageLite) list.get(i11), o1Var);
        }
    }

    public static void y(int i10, List<Integer> list, c2 c2Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = ((n) c2Var).f2101a;
        int i11 = 0;
        if (!(list instanceof c0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    mVar.p(i10, list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            mVar.B(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).getClass();
                Logger logger = m.f2085b;
                i12 += 4;
            }
            mVar.D(i12);
            while (i11 < list.size()) {
                mVar.q(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        c0 c0Var = (c0) list;
        if (!z10) {
            while (i11 < c0Var.f1995c) {
                mVar.p(i10, c0Var.getInt(i11));
                i11++;
            }
            return;
        }
        mVar.B(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c0Var.f1995c; i15++) {
            c0Var.getInt(i15);
            Logger logger2 = m.f2085b;
            i14 += 4;
        }
        mVar.D(i14);
        while (i11 < c0Var.f1995c) {
            mVar.q(c0Var.getInt(i11));
            i11++;
        }
    }

    public static void z(int i10, List<Long> list, c2 c2Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = ((n) c2Var).f2101a;
        int i11 = 0;
        if (!(list instanceof n0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    mVar.r(i10, list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            mVar.B(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).getClass();
                Logger logger = m.f2085b;
                i12 += 8;
            }
            mVar.D(i12);
            while (i11 < list.size()) {
                mVar.s(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        n0 n0Var = (n0) list;
        if (!z10) {
            while (i11 < n0Var.f2104c) {
                mVar.r(i10, n0Var.getLong(i11));
                i11++;
            }
            return;
        }
        mVar.B(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < n0Var.f2104c; i15++) {
            n0Var.getLong(i15);
            Logger logger2 = m.f2085b;
            i14 += 8;
        }
        mVar.D(i14);
        while (i11 < n0Var.f2104c) {
            mVar.s(n0Var.getLong(i11));
            i11++;
        }
    }
}
