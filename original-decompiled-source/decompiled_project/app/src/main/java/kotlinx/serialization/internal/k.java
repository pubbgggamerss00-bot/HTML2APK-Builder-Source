package kotlinx.serialization.internal;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class k<T> implements w0<T> {

    /* renamed from: a, reason: collision with root package name */
    public final eh.l<kh.c<?>, zh.b<T>> f16375a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap<Class<?>, e<T>> f16376b = new ConcurrentHashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    public k(eh.l<? super kh.c<?>, ? extends zh.b<T>> lVar) {
        this.f16375a = lVar;
    }

    @Override // kotlinx.serialization.internal.w0
    public final zh.b<T> a(kh.c<Object> cVar) {
        e<T> eVarPutIfAbsent;
        Class<?> clsC = b3.e.c(cVar);
        ConcurrentHashMap<Class<?>, e<T>> concurrentHashMap = this.f16376b;
        e<T> eVar = concurrentHashMap.get(clsC);
        if (eVar == null && (eVarPutIfAbsent = concurrentHashMap.putIfAbsent(clsC, (eVar = new e<>(this.f16375a.invoke(cVar))))) != null) {
            eVar = eVarPutIfAbsent;
        }
        return eVar.f16363a;
    }
}
