package kotlin.jvm.internal;

import java.util.Map;

/* loaded from: classes2.dex */
public final class m0 {
    public static Map a(Object obj) {
        if ((obj instanceof fh.a) && !(obj instanceof fh.c)) {
            d(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            r.g(e10, m0.class.getName());
            throw e10;
        }
    }

    public static void b(int i10, Object obj) {
        if (obj == null || c(i10, obj)) {
            return;
        }
        d(obj, "kotlin.jvm.functions.Function" + i10);
        throw null;
    }

    public static boolean c(int i10, Object obj) {
        if (obj instanceof pg.f) {
            if ((obj instanceof n ? ((n) obj).getArity() : obj instanceof eh.a ? 0 : obj instanceof eh.l ? 1 : obj instanceof eh.p ? 2 : obj instanceof eh.q ? 3 : obj instanceof eh.r ? 4 : obj instanceof eh.s ? 5 : obj instanceof eh.t ? 6 : obj instanceof eh.u ? 7 : obj instanceof eh.v ? 8 : obj instanceof eh.w ? 9 : obj instanceof eh.b ? 10 : obj instanceof eh.c ? 11 : obj instanceof eh.d ? 12 : obj instanceof eh.e ? 13 : obj instanceof eh.f ? 14 : obj instanceof eh.g ? 15 : obj instanceof eh.h ? 16 : obj instanceof eh.i ? 17 : obj instanceof eh.j ? 18 : obj instanceof eh.k ? 19 : obj instanceof eh.m ? 20 : obj instanceof eh.n ? 21 : obj instanceof eh.o ? 22 : -1) == i10) {
                return true;
            }
        }
        return false;
    }

    public static void d(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(k3.b.a(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        r.g(classCastException, m0.class.getName());
        throw classCastException;
    }
}
