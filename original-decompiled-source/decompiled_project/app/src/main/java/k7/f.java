package k7;

import hi.b0;
import hi.j;
import hi.n;
import k7.a;
import k7.c;

/* loaded from: classes.dex */
public final class f implements k7.a {

    /* renamed from: a, reason: collision with root package name */
    public final n f16051a;

    /* renamed from: b, reason: collision with root package name */
    public final c f16052b;

    public static final class a implements a.b {

        /* renamed from: a, reason: collision with root package name */
        public final c.a f16053a;

        public a(c.a aVar) {
            this.f16053a = aVar;
        }

        @Override // k7.a.b
        public final b a() {
            c.C0163c c0163cP;
            c.a aVar = this.f16053a;
            c cVar = c.this;
            synchronized (cVar.f16020h) {
                aVar.a(true);
                c0163cP = cVar.p(aVar.f16030a.f16034a);
            }
            if (c0163cP != null) {
                return new b(c0163cP);
            }
            return null;
        }

        @Override // k7.a.b
        public final void b() {
            this.f16053a.a(false);
        }
    }

    public static final class b implements a.c {

        /* renamed from: a, reason: collision with root package name */
        public final c.C0163c f16054a;

        public b(c.C0163c c0163c) {
            this.f16054a = c0163c;
        }

        @Override // k7.a.c
        public final a K() {
            c.a aVarL;
            c.C0163c c0163c = this.f16054a;
            c cVar = c.this;
            synchronized (cVar.f16020h) {
                c0163c.close();
                aVarL = cVar.l(c0163c.f16043a.f16034a);
            }
            if (aVarL != null) {
                return new a(aVarL);
            }
            return null;
        }

        @Override // k7.a.c
        public final b0 c() {
            c.C0163c c0163c = this.f16054a;
            if (c0163c.f16044b) {
                throw new IllegalStateException("snapshot is closed");
            }
            return c0163c.f16043a.f16036c.get(0);
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            this.f16054a.close();
        }

        @Override // k7.a.c
        public final b0 getData() {
            c.C0163c c0163c = this.f16054a;
            if (c0163c.f16044b) {
                throw new IllegalStateException("snapshot is closed");
            }
            return c0163c.f16043a.f16036c.get(1);
        }
    }

    public f(long j10, n nVar, b0 b0Var, tg.h hVar) {
        this.f16051a = nVar;
        this.f16052b = new c(j10, nVar, b0Var, hVar);
    }

    @Override // k7.a
    public final a a(String str) {
        j jVar = j.f13075d;
        c.a aVarL = this.f16052b.l(j.a.b(str).c("SHA-256").e());
        if (aVarL != null) {
            return new a(aVarL);
        }
        return null;
    }

    @Override // k7.a
    public final b b(String str) {
        j jVar = j.f13075d;
        c.C0163c c0163cP = this.f16052b.p(j.a.b(str).c("SHA-256").e());
        if (c0163cP != null) {
            return new b(c0163cP);
        }
        return null;
    }

    @Override // k7.a
    public final n getFileSystem() {
        return this.f16051a;
    }
}
