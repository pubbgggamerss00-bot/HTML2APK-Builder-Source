package k3;

import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k3.c;
import qc.m;

/* loaded from: classes.dex */
public final class d {

    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public Object f15966a;

        /* renamed from: b, reason: collision with root package name */
        public C0161d<T> f15967b;

        /* renamed from: c, reason: collision with root package name */
        public h<Void> f15968c = new h<>();

        /* renamed from: d, reason: collision with root package name */
        public boolean f15969d;

        public final void a(Object obj) {
            this.f15969d = true;
            C0161d<T> c0161d = this.f15967b;
            if (c0161d == null || !c0161d.f15971b.j(obj)) {
                return;
            }
            this.f15966a = null;
            this.f15967b = null;
            this.f15968c = null;
        }

        public final void b(Throwable th2) {
            this.f15969d = true;
            C0161d<T> c0161d = this.f15967b;
            if (c0161d == null || !c0161d.f15971b.k(th2)) {
                return;
            }
            this.f15966a = null;
            this.f15967b = null;
            this.f15968c = null;
        }

        public final void finalize() {
            h<Void> hVar;
            C0161d<T> c0161d = this.f15967b;
            if (c0161d != null) {
                C0161d.a aVar = c0161d.f15971b;
                if (!aVar.isDone()) {
                    aVar.k(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f15966a));
                }
            }
            if (this.f15969d || (hVar = this.f15968c) == null) {
                return;
            }
            hVar.j(null);
        }
    }

    public static final class b extends Throwable {
        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public interface c<T> {
        Object a(a<T> aVar) throws Exception;
    }

    /* renamed from: k3.d$d, reason: collision with other inner class name */
    public static final class C0161d<T> implements m<T> {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<a<T>> f15970a;

        /* renamed from: b, reason: collision with root package name */
        public final a f15971b = new a();

        /* renamed from: k3.d$d$a */
        public class a extends k3.c<T> {
            public a() {
            }

            @Override // k3.c
            public final String h() {
                a<T> aVar = C0161d.this.f15970a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f15966a + "]";
            }
        }

        public C0161d(a<T> aVar) {
            this.f15970a = new WeakReference<>(aVar);
        }

        @Override // qc.m
        public final void a(Runnable runnable, Executor executor) {
            this.f15971b.a(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            a<T> aVar = this.f15970a.get();
            boolean zCancel = this.f15971b.cancel(z10);
            if (zCancel && aVar != null) {
                aVar.f15966a = null;
                aVar.f15967b = null;
                aVar.f15968c.j(null);
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public final T get() throws ExecutionException, InterruptedException {
            return this.f15971b.get();
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.f15971b.f15946a instanceof c.b;
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return this.f15971b.isDone();
        }

        public final String toString() {
            return this.f15971b.toString();
        }

        @Override // java.util.concurrent.Future
        public final T get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return this.f15971b.get(j10, timeUnit);
        }
    }

    public static C0161d a(c cVar) {
        a aVar = new a();
        C0161d<T> c0161d = new C0161d<>(aVar);
        aVar.f15967b = c0161d;
        aVar.f15966a = cVar.getClass();
        try {
            Object objA = cVar.a(aVar);
            if (objA == null) {
                return c0161d;
            }
            aVar.f15966a = objA;
            return c0161d;
        } catch (Exception e10) {
            c0161d.f15971b.k(e10);
            return c0161d;
        }
    }
}
