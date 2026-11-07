package uh;

import ph.o2;

/* loaded from: classes2.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final v f29719a = new v("NO_THREAD_ELEMENTS");

    /* renamed from: b, reason: collision with root package name */
    public static final y f29720b = new y();

    /* renamed from: c, reason: collision with root package name */
    public static final z f29721c = new z();

    /* renamed from: d, reason: collision with root package name */
    public static final a0 f29722d = new a0();

    public static final void a(tg.h hVar, Object obj) {
        if (obj == f29719a) {
            return;
        }
        if (!(obj instanceof g0)) {
            Object objFold = hVar.fold(null, f29721c);
            kotlin.jvm.internal.r.c(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((o2) objFold).k0(obj);
            return;
        }
        g0 g0Var = (g0) obj;
        o2<Object>[] o2VarArr = g0Var.f29741c;
        int length = o2VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            o2<Object> o2Var = o2VarArr[length];
            kotlin.jvm.internal.r.b(o2Var);
            o2Var.k0(g0Var.f29740b[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }

    public static final Object b(tg.h hVar) {
        Object objFold = hVar.fold(0, f29720b);
        kotlin.jvm.internal.r.b(objFold);
        return objFold;
    }

    public static final Object c(tg.h hVar, Object obj) {
        if (obj == null) {
            obj = b(hVar);
        }
        return obj == 0 ? f29719a : obj instanceof Integer ? hVar.fold(new g0(((Number) obj).intValue(), hVar), f29722d) : ((o2) obj).N(hVar);
    }
}
