package y;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import y.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public Object f15190a;

        /* renamed from: b, reason: collision with root package name */
        public d<T> f15191b;

        /* renamed from: c, reason: collision with root package name */
        public y.d<Void> f15192c = new y.d<>();

        /* renamed from: d, reason: collision with root package name */
        public boolean f15193d;

        /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean a(T t6) {
            boolean z6 = true;
            this.f15193d = true;
            d<T> dVar = this.f15191b;
            if (dVar != null) {
                d.a aVar = dVar.f15194t;
                aVar.getClass();
                if (t6 == null) {
                    t6 = (T) y.a.f15171y;
                }
                if (y.a.f15170x.b(aVar, null, t6)) {
                    y.a.b(aVar);
                } else {
                    z6 = false;
                }
            }
            if (z6) {
                this.f15190a = null;
                this.f15191b = null;
                this.f15192c = null;
            }
            return z6;
        }

        public final boolean b(Throwable th) {
            this.f15193d = true;
            d<T> dVar = this.f15191b;
            boolean z6 = dVar != null && dVar.f15194t.h(th);
            if (z6) {
                this.f15190a = null;
                this.f15191b = null;
                this.f15192c = null;
            }
            return z6;
        }

        public final void finalize() {
            y.d<Void> dVar;
            d<T> dVar2 = this.f15191b;
            if (dVar2 != null) {
                d.a aVar = dVar2.f15194t;
                if (!aVar.isDone()) {
                    aVar.h(new C0106b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f15190a));
                }
            }
            if (this.f15193d || (dVar = this.f15192c) == null) {
                return;
            }
            dVar.i(null);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: y.b$b, reason: collision with other inner class name */
    public static final class C0106b extends Throwable {
        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface c<T> {
        Object attachCompleter(a<T> aVar);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class d<T> implements c5.a<T> {
        public final WeakReference<a<T>> s;

        /* renamed from: t, reason: collision with root package name */
        public final a f15194t = new a();

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public class a extends y.a<T> {
            public a() {
            }

            @Override // y.a
            public final String f() {
                a<T> aVar = d.this.s.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f15190a + "]";
            }
        }

        public d(a<T> aVar) {
            this.s = new WeakReference<>(aVar);
        }

        @Override // c5.a
        public final void addListener(Runnable runnable, Executor executor) {
            this.f15194t.addListener(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z6) {
            a<T> aVar = this.s.get();
            boolean zCancel = this.f15194t.cancel(z6);
            if (zCancel && aVar != null) {
                aVar.f15190a = null;
                aVar.f15191b = null;
                aVar.f15192c.i(null);
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public final T get() {
            return this.f15194t.get();
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.f15194t.s instanceof a.b;
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return this.f15194t.isDone();
        }

        public final String toString() {
            return this.f15194t.toString();
        }

        @Override // java.util.concurrent.Future
        public final T get(long j6, TimeUnit timeUnit) {
            return this.f15194t.get(j6, timeUnit);
        }
    }

    public static d a(c cVar) {
        a aVar = new a();
        d<T> dVar = new d<>(aVar);
        aVar.f15191b = dVar;
        aVar.f15190a = cVar.getClass();
        try {
            Object objAttachCompleter = cVar.attachCompleter(aVar);
            if (objAttachCompleter == null) {
                return dVar;
            }
            aVar.f15190a = objAttachCompleter;
            return dVar;
        } catch (Exception e6) {
            dVar.f15194t.h(e6);
            return dVar;
        }
    }
}
