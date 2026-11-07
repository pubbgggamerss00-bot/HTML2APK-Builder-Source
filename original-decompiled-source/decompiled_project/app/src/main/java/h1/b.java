package h1;

/* loaded from: classes.dex */
public final class b extends c {

    public static final class a extends kotlin.jvm.internal.s implements eh.l<l, c> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.l<Object, pg.f0> f12086a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.l<Object, pg.f0> f12087b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(eh.l<Object, pg.f0> lVar, eh.l<Object, pg.f0> lVar2) {
            super(1);
            this.f12086a = lVar;
            this.f12087b = lVar2;
        }

        @Override // eh.l
        public final c invoke(l lVar) {
            long j10;
            l lVar2 = lVar;
            synchronized (n.f12160c) {
                j10 = n.f12162e;
                n.f12162e = 1 + j10;
            }
            return new c(j10, lVar2, this.f12086a, this.f12087b);
        }
    }

    /* renamed from: h1.b$b, reason: collision with other inner class name */
    public static final class C0108b extends kotlin.jvm.internal.s implements eh.l<l, f> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.l<Object, pg.f0> f12088a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0108b(eh.l<Object, pg.f0> lVar) {
            super(1);
            this.f12088a = lVar;
        }

        @Override // eh.l
        public final f invoke(l lVar) {
            long j10;
            l lVar2 = lVar;
            synchronized (n.f12160c) {
                j10 = n.f12162e;
                n.f12162e = 1 + j10;
            }
            return new f(j10, lVar2, this.f12088a);
        }
    }

    @Override // h1.c
    public final c C(eh.l<Object, pg.f0> lVar, eh.l<Object, pg.f0> lVar2) {
        return (c) ((h) n.f(new o(new a(lVar, lVar2))));
    }

    @Override // h1.c, h1.h
    public final void c() {
        synchronized (n.f12160c) {
            o();
            pg.f0 f0Var = pg.f0.f21461a;
        }
    }

    @Override // h1.c, h1.h
    public final void k() {
        x.a();
        throw null;
    }

    @Override // h1.c, h1.h
    public final void l() {
        x.a();
        throw null;
    }

    @Override // h1.c, h1.h
    public final void m() {
        n.a();
    }

    @Override // h1.c, h1.h
    public final h u(eh.l<Object, pg.f0> lVar) {
        return (f) ((h) n.f(new o(new C0108b(lVar))));
    }

    @Override // h1.c
    public final i w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
