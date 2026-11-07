package j2;

import android.view.Choreographer;
import tg.h;

/* loaded from: classes.dex */
public final class i1 implements x0.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final Choreographer f14750a;

    /* renamed from: b, reason: collision with root package name */
    public final h1 f14751b;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<Throwable, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h1 f14752a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f14753b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h1 h1Var, c cVar) {
            super(1);
            this.f14752a = h1Var;
            this.f14753b = cVar;
        }

        @Override // eh.l
        public final pg.f0 invoke(Throwable th2) {
            h1 h1Var = this.f14752a;
            c cVar = this.f14753b;
            synchronized (h1Var.f14733e) {
                h1Var.f14735g.remove(cVar);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l<Throwable, pg.f0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f14755b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar) {
            super(1);
            this.f14755b = cVar;
        }

        @Override // eh.l
        public final pg.f0 invoke(Throwable th2) {
            i1.this.f14750a.removeFrameCallback(this.f14755b);
            return pg.f0.f21461a;
        }
    }

    public static final class c implements Choreographer.FrameCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ph.m f14756a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.l<Long, R> f14757b;

        public c(ph.m mVar, i1 i1Var, eh.l lVar) {
            this.f14756a = mVar;
            this.f14757b = lVar;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j10) {
            Object objA;
            try {
                objA = this.f14757b.invoke(Long.valueOf(j10));
            } catch (Throwable th2) {
                objA = pg.q.a(th2);
            }
            this.f14756a.resumeWith(objA);
        }
    }

    public i1(Choreographer choreographer, h1 h1Var) {
        this.f14750a = choreographer;
        this.f14751b = h1Var;
    }

    @Override // x0.d1
    public final <R> Object f0(eh.l<? super Long, ? extends R> lVar, tg.e<? super R> eVar) throws Throwable {
        h1 h1Var = this.f14751b;
        ph.m mVar = new ph.m(1, ah.p.c(eVar));
        mVar.p();
        c cVar = new c(mVar, this, lVar);
        if (kotlin.jvm.internal.r.a(h1Var.f14731c, this.f14750a)) {
            synchronized (h1Var.f14733e) {
                try {
                    h1Var.f14735g.add(cVar);
                    if (!h1Var.f14738k) {
                        h1Var.f14738k = true;
                        h1Var.f14731c.postFrameCallback(h1Var.f14739l);
                    }
                    pg.f0 f0Var = pg.f0.f21461a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            mVar.s(new a(h1Var, cVar));
        } else {
            this.f14750a.postFrameCallback(cVar);
            mVar.s(new b(cVar));
        }
        Object objO = mVar.o();
        ug.a aVar = ug.a.f29706a;
        return objO;
    }

    @Override // tg.h
    public final <R> R fold(R r10, eh.p<? super R, ? super h.a, ? extends R> pVar) {
        return pVar.invoke(r10, this);
    }

    @Override // tg.h
    public final <E extends h.a> E get(h.b<E> bVar) {
        return (E) h.a.C0291a.a(this, bVar);
    }

    @Override // tg.h
    public final tg.h minusKey(h.b<?> bVar) {
        return h.a.C0291a.b(this, bVar);
    }

    @Override // tg.h
    public final tg.h plus(tg.h hVar) {
        return h.a.C0291a.c(this, hVar);
    }
}
