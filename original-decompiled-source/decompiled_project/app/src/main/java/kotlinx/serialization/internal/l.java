package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class l<T> implements j0<T> {

    /* renamed from: b, reason: collision with root package name */
    public final eh.p<kh.c<Object>, List<? extends kh.j>, zh.b<T>> f16377b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap<Class<?>, i0<T>> f16378c = new ConcurrentHashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    public l(eh.p<? super kh.c<Object>, ? super List<? extends kh.j>, ? extends zh.b<T>> pVar) {
        this.f16377b = pVar;
    }

    @Override // kotlinx.serialization.internal.j0
    public final Object a(kh.c cVar, ArrayList arrayList) {
        Object objA;
        i0<T> i0VarPutIfAbsent;
        Class<?> clsC = b3.e.c(cVar);
        ConcurrentHashMap<Class<?>, i0<T>> concurrentHashMap = this.f16378c;
        i0<T> i0Var = concurrentHashMap.get(clsC);
        if (i0Var == null && (i0VarPutIfAbsent = concurrentHashMap.putIfAbsent(clsC, (i0Var = new i0<>()))) != null) {
            i0Var = i0VarPutIfAbsent;
        }
        i0<T> i0Var2 = i0Var;
        ArrayList arrayList2 = new ArrayList(qg.p.h(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            arrayList2.add(new x((kh.j) obj));
        }
        ConcurrentHashMap<List<x>, pg.p<zh.b<T>>> concurrentHashMap2 = i0Var2.f16374a;
        pg.p<zh.b<T>> pVar = concurrentHashMap2.get(arrayList2);
        if (pVar == null) {
            try {
                objA = (zh.b) this.f16377b.invoke(cVar, arrayList);
            } catch (Throwable th2) {
                objA = pg.q.a(th2);
            }
            pg.p<zh.b<T>> pVar2 = new pg.p<>(objA);
            pg.p<zh.b<T>> pVarPutIfAbsent = concurrentHashMap2.putIfAbsent(arrayList2, pVar2);
            pVar = pVarPutIfAbsent == null ? pVar2 : pVarPutIfAbsent;
        }
        return pVar.f21471a;
    }
}
