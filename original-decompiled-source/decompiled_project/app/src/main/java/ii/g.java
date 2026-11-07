package ii;

import e9.w0;
import hi.b0;
import hi.j0;
import hi.l0;
import hi.n;
import hi.v;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.r;
import mh.t;
import mh.x;
import pg.s;
import qg.p;

/* loaded from: classes2.dex */
public final class g extends n {

    /* renamed from: f, reason: collision with root package name */
    public static final b0 f14547f;

    /* renamed from: c, reason: collision with root package name */
    public final ClassLoader f14548c;

    /* renamed from: d, reason: collision with root package name */
    public final n f14549d;

    /* renamed from: e, reason: collision with root package name */
    public final s f14550e;

    public static final class a {
        public static final boolean a(b0 b0Var) {
            b0 b0Var2 = g.f14547f;
            return !t.i(b0Var.b(), ".class", true);
        }
    }

    static {
        String str = b0.f13033b;
        f14547f = b0.a.a("/");
    }

    public g(ClassLoader classLoader) {
        v systemFileSystem = n.f13098a;
        r.e(systemFileSystem, "systemFileSystem");
        this.f14548c = classLoader;
        this.f14549d = systemFileSystem;
        this.f14550e = w0.b(new g7.b(this, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hi.n
    public final List<b0> N(b0 dir) throws FileNotFoundException {
        r.e(dir, "dir");
        b0 b0Var = f14547f;
        b0Var.getClass();
        String strQ = c.b(b0Var, dir, true).d(b0Var).f13034a.q();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z10 = false;
        for (pg.n nVar : (List) this.f14550e.getValue()) {
            n nVar2 = (n) nVar.f21469a;
            b0 b0Var2 = (b0) nVar.f21470b;
            try {
                List<b0> listN = nVar2.N(b0Var2.e(strQ));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listN) {
                    if (a.a((b0) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(p.h(arrayList, 10));
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    b0 b0Var3 = (b0) obj2;
                    r.e(b0Var3, "<this>");
                    arrayList2.add(b0Var.e(t.m(x.I(b0Var3.f13034a.q(), b0Var2.f13034a.q()), '\\', '/')));
                }
                qg.t.p(arrayList2, linkedHashSet);
                z10 = true;
            } catch (IOException unused) {
            }
        }
        if (z10) {
            return qg.x.c0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + dir);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hi.n
    public final hi.m d0(b0 path) throws IOException {
        r.e(path, "path");
        if (!a.a(path)) {
            return null;
        }
        b0 b0Var = f14547f;
        b0Var.getClass();
        String strQ = c.b(b0Var, path, true).d(b0Var).f13034a.q();
        for (pg.n nVar : (List) this.f14550e.getValue()) {
            hi.m mVarD0 = ((n) nVar.f21469a).d0(((b0) nVar.f21470b).e(strQ));
            if (mVarD0 != null) {
                return mVarD0;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hi.n
    public final hi.l e0(b0 file) throws FileNotFoundException {
        r.e(file, "file");
        if (!a.a(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        b0 b0Var = f14547f;
        b0Var.getClass();
        String strQ = c.b(b0Var, file, true).d(b0Var).f13034a.q();
        for (pg.n nVar : (List) this.f14550e.getValue()) {
            try {
                return ((n) nVar.f21469a).e0(((b0) nVar.f21470b).e(strQ));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // hi.n
    public final j0 f0(b0 file, boolean z10) throws IOException {
        r.e(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // hi.n
    public final l0 g0(b0 file) throws IOException {
        r.e(file, "file");
        if (!a.a(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        b0 b0Var = f14547f;
        b0Var.getClass();
        URL resource = this.f14548c.getResource(c.b(b0Var, file, false).d(b0Var).f13034a.q());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + file);
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        r.d(inputStream, "getInputStream(...)");
        return hi.x.h(inputStream);
    }

    @Override // hi.n
    public final j0 h(b0 file) throws IOException {
        r.e(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // hi.n
    public final void l(b0 source, b0 target) throws IOException {
        r.e(source, "source");
        r.e(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // hi.n
    public final void p(b0 dir) throws IOException {
        r.e(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // hi.n
    public final void z(b0 path) throws IOException {
        r.e(path, "path");
        throw new IOException(this + " is read-only");
    }
}
