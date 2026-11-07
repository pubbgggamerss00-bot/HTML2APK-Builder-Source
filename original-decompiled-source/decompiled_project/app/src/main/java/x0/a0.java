package x0;

import f1.f;

/* loaded from: classes.dex */
public final class a0 {
    public static final <T> T a(a2 a2Var, e2 e2Var) {
        kotlin.jvm.internal.r.c(e2Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Object objB = a2Var.get(e2Var);
        if (objB == null) {
            objB = e2Var.b();
        }
        return (T) ((v3) objB).a(a2Var);
    }

    public static final a2 b(f2<?>[] f2VarArr, a2 a2Var, a2 a2Var2) {
        f1.f fVar = f1.f.f8790d;
        f.a aVar = new f.a(fVar);
        aVar.f8791g = fVar;
        for (f2<?> f2Var : f2VarArr) {
            e2 e2Var = f2Var.f31672a;
            if (f2Var.f31677f || !a2Var.containsKey(e2Var)) {
                aVar.put(e2Var, e2Var.c(f2Var, (v3) a2Var2.get(e2Var)));
            }
        }
        return aVar.build();
    }
}
