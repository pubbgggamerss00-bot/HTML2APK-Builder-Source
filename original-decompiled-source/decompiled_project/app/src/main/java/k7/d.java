package k7;

import hi.b0;
import hi.j0;
import hi.l;
import hi.l0;
import hi.m;
import hi.n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.r;
import qg.t;

/* loaded from: classes.dex */
public final class d extends n {

    /* renamed from: c, reason: collision with root package name */
    public final n f16047c;

    public d(n delegate) {
        r.e(delegate, "delegate");
        this.f16047c = delegate;
    }

    @Override // hi.n
    public final List N(b0 dir) throws IOException {
        r.e(dir, "dir");
        List<b0> listN = this.f16047c.N(dir);
        ArrayList arrayList = new ArrayList();
        for (b0 path : listN) {
            r.e(path, "path");
            arrayList.add(path);
        }
        t.u(arrayList);
        return arrayList;
    }

    @Override // hi.n, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f16047c.close();
    }

    @Override // hi.n
    public final m d0(b0 path) throws IOException {
        r.e(path, "path");
        m mVarD0 = this.f16047c.d0(path);
        if (mVarD0 == null) {
            return null;
        }
        b0 b0Var = mVarD0.f13088c;
        if (b0Var == null) {
            return mVarD0;
        }
        boolean z10 = mVarD0.f13086a;
        boolean z11 = mVarD0.f13087b;
        Long l10 = mVarD0.f13089d;
        Long l11 = mVarD0.f13090e;
        Long l12 = mVarD0.f13091f;
        Long l13 = mVarD0.f13092g;
        Map<kh.c<?>, Object> extras = mVarD0.f13093h;
        r.e(extras, "extras");
        return new m(z10, z11, b0Var, l10, l11, l12, l13, extras);
    }

    @Override // hi.n
    public final l e0(b0 file) throws IOException {
        r.e(file, "file");
        return this.f16047c.e0(file);
    }

    @Override // hi.n
    public final j0 f0(b0 b0Var, boolean z10) throws IOException {
        b0 b0VarC = b0Var.c();
        if (b0VarC != null) {
            qg.l lVar = new qg.l();
            while (b0VarC != null && !M(b0VarC)) {
                lVar.addFirst(b0VarC);
                b0VarC = b0VarC.c();
            }
            Iterator<E> it = lVar.iterator();
            while (it.hasNext()) {
                p((b0) it.next());
            }
        }
        return this.f16047c.f0(b0Var, z10);
    }

    @Override // hi.n
    public final l0 g0(b0 file) throws IOException {
        r.e(file, "file");
        return this.f16047c.g0(file);
    }

    @Override // hi.n
    public final j0 h(b0 file) throws IOException {
        r.e(file, "file");
        return this.f16047c.h(file);
    }

    @Override // hi.n
    public final void l(b0 source, b0 target) throws IOException {
        r.e(source, "source");
        r.e(target, "target");
        this.f16047c.l(source, target);
    }

    @Override // hi.n
    public final void p(b0 dir) throws IOException {
        r.e(dir, "dir");
        this.f16047c.p(dir);
    }

    public final String toString() {
        return h0.a(getClass()).e() + '(' + this.f16047c + ')';
    }

    @Override // hi.n
    public final void z(b0 path) throws IOException {
        r.e(path, "path");
        this.f16047c.z(path);
    }
}
