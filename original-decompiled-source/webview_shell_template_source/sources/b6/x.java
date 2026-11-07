package b6;

import g5.f;
import y5.k1;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final v f2051a = new v(0, "NO_THREAD_ELEMENTS");

    /* renamed from: b, reason: collision with root package name */
    public static final a f2052b = a.s;

    /* renamed from: c, reason: collision with root package name */
    public static final b f2053c = b.s;

    /* renamed from: d, reason: collision with root package name */
    public static final c f2054d = c.s;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a extends kotlin.jvm.internal.k implements p5.p<Object, f.b, Object> {
        public static final a s = new a(2);

        @Override // p5.p
        public final Object b(Object obj, f.b bVar) {
            f.b bVar2 = bVar;
            if (!(bVar2 instanceof k1)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 1;
            return iIntValue == 0 ? bVar2 : Integer.valueOf(iIntValue + 1);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class b extends kotlin.jvm.internal.k implements p5.p<k1<?>, f.b, k1<?>> {
        public static final b s = new b(2);

        @Override // p5.p
        public final k1<?> b(k1<?> k1Var, f.b bVar) {
            k1<?> k1Var2 = k1Var;
            f.b bVar2 = bVar;
            if (k1Var2 != null) {
                return k1Var2;
            }
            if (bVar2 instanceof k1) {
                return (k1) bVar2;
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class c extends kotlin.jvm.internal.k implements p5.p<a0, f.b, a0> {
        public static final c s = new c(2);

        @Override // p5.p
        public final a0 b(a0 a0Var, f.b bVar) {
            a0 a0Var2 = a0Var;
            f.b bVar2 = bVar;
            if (bVar2 instanceof k1) {
                k1<Object> k1Var = (k1) bVar2;
                String strD = k1Var.d(a0Var2.f2013a);
                Object[] objArr = a0Var2.f2014b;
                int i6 = a0Var2.f2016d;
                objArr[i6] = strD;
                k1<Object>[] k1VarArr = a0Var2.f2015c;
                a0Var2.f2016d = i6 + 1;
                k1VarArr[i6] = k1Var;
            }
            return a0Var2;
        }
    }

    public static final void a(g5.f fVar, Object obj) {
        if (obj == f2051a) {
            return;
        }
        if (!(obj instanceof a0)) {
            Object objS = fVar.s(null, f2053c);
            kotlin.jvm.internal.j.c("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>", objS);
            ((k1) objS).o(obj);
            return;
        }
        a0 a0Var = (a0) obj;
        k1<Object>[] k1VarArr = a0Var.f2015c;
        int length = k1VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i6 = length - 1;
            k1<Object> k1Var = k1VarArr[length];
            kotlin.jvm.internal.j.b(k1Var);
            k1Var.o(a0Var.f2014b[length]);
            if (i6 < 0) {
                return;
            } else {
                length = i6;
            }
        }
    }

    public static final Object b(g5.f fVar) {
        Object objS = fVar.s(0, f2052b);
        kotlin.jvm.internal.j.b(objS);
        return objS;
    }

    public static final Object c(g5.f fVar, Object obj) {
        if (obj == null) {
            obj = b(fVar);
        }
        return obj == 0 ? f2051a : obj instanceof Integer ? fVar.s(new a0(fVar, ((Number) obj).intValue()), f2054d) : ((k1) obj).d(fVar);
    }
}
