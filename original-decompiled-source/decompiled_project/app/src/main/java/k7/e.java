package k7;

import hi.j0;
import hi.m0;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class e implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f16048a;

    /* renamed from: b, reason: collision with root package name */
    public final b f16049b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16050c;

    public e(j0 j0Var, b bVar) {
        this.f16048a = j0Var;
        this.f16049b = bVar;
    }

    @Override // hi.j0
    public final m0 b() {
        return this.f16048a.b();
    }

    @Override // hi.j0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f16048a.close();
        } catch (IOException e10) {
            this.f16050c = true;
            this.f16049b.invoke(e10);
        }
    }

    @Override // hi.j0, java.io.Flushable
    public final void flush() {
        try {
            this.f16048a.flush();
        } catch (IOException e10) {
            this.f16050c = true;
            this.f16049b.invoke(e10);
        }
    }

    @Override // hi.j0
    public final void j(long j10, hi.g gVar) throws EOFException {
        if (this.f16050c) {
            gVar.skip(j10);
            return;
        }
        try {
            this.f16048a.j(j10, gVar);
        } catch (IOException e10) {
            this.f16050c = true;
            this.f16049b.invoke(e10);
        }
    }
}
