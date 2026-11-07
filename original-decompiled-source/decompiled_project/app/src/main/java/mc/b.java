package mc;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import lc.t;
import qc.l;
import qc.m;
import qc.n;

/* loaded from: classes2.dex */
public abstract class b<K, V> {

    public static class a extends b<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Executor f18044b;

        /* renamed from: mc.b$a$a, reason: collision with other inner class name */
        public class CallableC0178a implements Callable<V> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f18045a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f18046b;

            public CallableC0178a(Object obj, Object obj2) {
                this.f18045a = obj;
                this.f18046b = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final V call() throws Exception {
                return b.this.reload(this.f18045a, this.f18046b).get();
            }
        }

        public a(Executor executor) {
            this.f18044b = executor;
        }

        @Override // mc.b
        public final V load(K k10) throws Exception {
            return (V) b.this.load(k10);
        }

        @Override // mc.b
        public final Map<K, V> loadAll(Iterable<? extends K> iterable) throws Exception {
            return b.this.loadAll(iterable);
        }

        @Override // mc.b
        public final m<V> reload(K k10, V v10) throws Exception {
            n nVar = new n(new CallableC0178a(k10, v10));
            this.f18044b.execute(nVar);
            return nVar;
        }
    }

    /* renamed from: mc.b$b, reason: collision with other inner class name */
    public static final class C0179b<K, V> extends b<K, V> implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final lc.e<K, V> f18048a;

        public C0179b(lc.e<K, V> eVar) {
            eVar.getClass();
            this.f18048a = eVar;
        }

        @Override // mc.b
        public final V load(K k10) {
            k10.getClass();
            return this.f18048a.apply(k10);
        }
    }

    public static final class c extends RuntimeException {
    }

    public static final class d<V> extends b<Object, V> implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final t<V> f18049a;

        public d(t<V> tVar) {
            tVar.getClass();
            this.f18049a = tVar;
        }

        @Override // mc.b
        public final V load(Object obj) {
            obj.getClass();
            return this.f18049a.get();
        }
    }

    public static final class e extends UnsupportedOperationException {
    }

    public static <K, V> b<K, V> asyncReloading(b<K, V> bVar, Executor executor) {
        bVar.getClass();
        executor.getClass();
        return bVar.new a(executor);
    }

    public static <K, V> b<K, V> from(lc.e<K, V> eVar) {
        return new C0179b(eVar);
    }

    public abstract V load(K k10) throws Exception;

    public Map<K, V> loadAll(Iterable<? extends K> iterable) throws Exception {
        throw new e();
    }

    public m<V> reload(K k10, V v10) throws Exception {
        k10.getClass();
        v10.getClass();
        V vLoad = load(k10);
        return vLoad == null ? l.b.f22642c : new l.b(vLoad);
    }

    public static <V> b<Object, V> from(t<V> tVar) {
        return new d(tVar);
    }
}
