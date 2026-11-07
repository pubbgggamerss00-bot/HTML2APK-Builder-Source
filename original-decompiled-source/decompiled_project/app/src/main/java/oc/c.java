package oc;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.logging.Level;
import lc.v;

/* loaded from: classes2.dex */
public final class c implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public static final InterfaceC0217c f19133d;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0217c f19134a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f19135b = new ArrayDeque(4);

    /* renamed from: c, reason: collision with root package name */
    public Throwable f19136c;

    public static final class a implements InterfaceC0217c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f19137a = new a();

        @Override // oc.c.InterfaceC0217c
        public final void a(Closeable closeable, Throwable th2, Throwable th3) {
            oc.b.f19132a.log(Level.WARNING, "Suppressing exception thrown when closing " + closeable, th3);
        }
    }

    public static final class b implements InterfaceC0217c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f19138a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final Method f19139b;

        static {
            Method method;
            try {
                method = Throwable.class.getMethod("addSuppressed", Throwable.class);
            } catch (Throwable unused) {
                method = null;
            }
            f19139b = method;
        }

        @Override // oc.c.InterfaceC0217c
        public final void a(Closeable closeable, Throwable th2, Throwable th3) {
            if (th2 == th3) {
                return;
            }
            try {
                f19139b.invoke(th2, th3);
            } catch (Throwable unused) {
                oc.b.f19132a.log(Level.WARNING, "Suppressing exception thrown when closing " + closeable, th3);
            }
        }
    }

    /* renamed from: oc.c$c, reason: collision with other inner class name */
    public interface InterfaceC0217c {
        void a(Closeable closeable, Throwable th2, Throwable th3);
    }

    static {
        f19133d = b.f19139b != null ? b.f19138a : a.f19137a;
    }

    public c(InterfaceC0217c interfaceC0217c) {
        interfaceC0217c.getClass();
        this.f19134a = interfaceC0217c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Throwable th2 = this.f19136c;
        while (true) {
            ArrayDeque arrayDeque = this.f19135b;
            if (arrayDeque.isEmpty()) {
                break;
            }
            Closeable closeable = (Closeable) arrayDeque.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th3) {
                if (th2 == null) {
                    th2 = th3;
                } else {
                    this.f19134a.a(closeable, th2, th3);
                }
            }
        }
        if (this.f19136c != null || th2 == null) {
            return;
        }
        Object obj = v.f16973a;
        if (IOException.class.isInstance(th2)) {
            throw ((Throwable) IOException.class.cast(th2));
        }
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        }
        if (!(th2 instanceof Error)) {
            throw new AssertionError(th2);
        }
        throw ((Error) th2);
    }
}
