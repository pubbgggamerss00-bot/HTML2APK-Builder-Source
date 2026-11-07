package hi;

import hi.b0;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class n implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public static final v f13098a;

    /* renamed from: b, reason: collision with root package name */
    public static final b0 f13099b;

    static {
        v vVar;
        try {
            Class.forName("java.nio.file.Files");
            vVar = new w();
        } catch (ClassNotFoundException unused) {
            vVar = new v();
        }
        f13098a = vVar;
        String str = b0.f13033b;
        String property = System.getProperty("java.io.tmpdir");
        kotlin.jvm.internal.r.d(property, "getProperty(...)");
        f13099b = b0.a.a(property);
        ClassLoader classLoader = ii.g.class.getClassLoader();
        kotlin.jvm.internal.r.d(classLoader, "getClassLoader(...)");
        new ii.g(classLoader);
    }

    public final void E(b0 path) throws IOException {
        kotlin.jvm.internal.r.e(path, "path");
        z(path);
    }

    public final boolean M(b0 path) throws IOException {
        kotlin.jvm.internal.r.e(path, "path");
        return d0(path) != null;
    }

    public abstract List<b0> N(b0 b0Var) throws IOException;

    public final m Z(b0 path) throws IOException {
        kotlin.jvm.internal.r.e(path, "path");
        m mVarD0 = d0(path);
        if (mVarD0 != null) {
            return mVarD0;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public abstract m d0(b0 b0Var) throws IOException;

    public abstract l e0(b0 b0Var) throws IOException;

    public abstract j0 f0(b0 b0Var, boolean z10) throws IOException;

    public abstract l0 g0(b0 b0Var) throws IOException;

    public abstract j0 h(b0 b0Var) throws IOException;

    public abstract void l(b0 b0Var, b0 b0Var2) throws IOException;

    public abstract void p(b0 b0Var) throws IOException;

    public abstract void z(b0 b0Var) throws IOException;
}
