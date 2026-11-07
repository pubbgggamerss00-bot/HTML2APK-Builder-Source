package ig;

import androidx.lifecycle.l0;
import androidx.lifecycle.o0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import b.k;
import eh.l;
import f8.f;
import f8.g;
import j5.a;
import java.io.Closeable;
import java.util.Map;
import nc.v0;
import pg.f0;

/* loaded from: classes2.dex */
public final class b implements z0.c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f14527d = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, Boolean> f14528a;

    /* renamed from: b, reason: collision with root package name */
    public final z0.c f14529b;

    /* renamed from: c, reason: collision with root package name */
    public final C0138b f14530c;

    public class a implements a.b<l<Object, w0>> {
    }

    /* renamed from: ig.b$b, reason: collision with other inner class name */
    public class C0138b implements z0.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f14531a;

        public C0138b(f fVar) {
            this.f14531a = fVar;
        }

        @Override // androidx.lifecycle.z0.c
        public final w0 b(Class cls, j5.d dVar) {
            w0 w0Var;
            final e eVar = new e();
            f fVar = this.f14531a;
            l0 l0VarA = o0.a(dVar);
            fVar.getClass();
            g gVar = new g(fVar.f8895a, fVar.f8896b, l0VarA);
            og.a aVar = (og.a) ((d) b3.a.c(d.class, gVar)).a().get(cls);
            l lVar = (l) dVar.f15158a.get(b.f14527d);
            ((d) b3.a.c(d.class, gVar)).getClass();
            Object obj = v0.f18761g.get(cls);
            if (obj == null) {
                if (lVar != null) {
                    throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                }
                if (aVar == null) {
                    throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
                }
                w0Var = (w0) aVar.get();
            } else {
                if (aVar != null) {
                    throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
                }
                if (lVar == null) {
                    throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
                }
                w0Var = (w0) lVar.invoke(obj);
            }
            Closeable closeable = new Closeable() { // from class: ig.c
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    eVar.a();
                }
            };
            w0Var.getClass();
            l5.d dVar2 = w0Var.f2371a;
            if (dVar2 == null) {
                return w0Var;
            }
            if (dVar2.f16730d) {
                l5.d.a(closeable);
                return w0Var;
            }
            synchronized (dVar2.f16727a) {
                dVar2.f16729c.add(closeable);
                f0 f0Var = f0.f21461a;
            }
            return w0Var;
        }
    }

    public interface c {
        ng.b b();

        f g();
    }

    public interface d {
        ng.b a();
    }

    public b(Map<Class<?>, Boolean> map, z0.c cVar, f fVar) {
        this.f14528a = map;
        this.f14529b = cVar;
        this.f14530c = new C0138b(fVar);
    }

    public static b d(k kVar, z0.c cVar) {
        c cVar2 = (c) b3.a.c(c.class, kVar);
        return new b(cVar2.b(), cVar, cVar2.g());
    }

    @Override // androidx.lifecycle.z0.c
    public final <T extends w0> T a(Class<T> cls) {
        if (this.f14528a.containsKey(cls)) {
            throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        }
        return (T) this.f14529b.a(cls);
    }

    @Override // androidx.lifecycle.z0.c
    public final w0 b(Class cls, j5.d dVar) {
        return this.f14528a.containsKey(cls) ? this.f14530c.b(cls, dVar) : this.f14529b.b(cls, dVar);
    }
}
