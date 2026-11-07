package x0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import tg.h;

/* loaded from: classes.dex */
public final class y1 implements d1 {

    /* renamed from: a, reason: collision with root package name */
    public final d1 f31970a;

    /* renamed from: b, reason: collision with root package name */
    public final z0 f31971b = new z0();

    @vg.e(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", l = {61, 62}, m = "withFrameNanos")
    public static final class a<R> extends vg.c {

        /* renamed from: a, reason: collision with root package name */
        public y1 f31972a;

        /* renamed from: b, reason: collision with root package name */
        public eh.l f31973b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f31974c;

        /* renamed from: e, reason: collision with root package name */
        public int f31976e;

        public a(tg.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            this.f31974c = obj;
            this.f31976e |= PKIFailureInfo.systemUnavail;
            return y1.this.f0(null, this);
        }
    }

    public y1(d1 d1Var) {
        this.f31970a = d1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // x0.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <R> Object f0(eh.l<? super Long, ? extends R> lVar, tg.e<? super R> eVar) throws Throwable {
        a aVar;
        boolean z10;
        Object objO;
        y1 y1Var;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i10 = aVar.f31976e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f31976e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        }
        Object obj = aVar.f31974c;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = aVar.f31976e;
        if (i11 == 0) {
            pg.q.b(obj);
            z0 z0Var = this.f31971b;
            aVar.f31972a = this;
            aVar.f31973b = lVar;
            aVar.f31976e = 1;
            synchronized (z0Var.f31980a) {
                z10 = z0Var.f31983d;
            }
            if (z10) {
                objO = pg.f0.f21461a;
            } else {
                ph.m mVar = new ph.m(1, ah.p.c(aVar));
                mVar.p();
                synchronized (z0Var.f31980a) {
                    z0Var.f31981b.add(mVar);
                }
                mVar.s(new y0(z0Var, mVar));
                objO = mVar.o();
                if (objO != aVar2) {
                    objO = pg.f0.f21461a;
                }
            }
            if (objO != aVar2) {
                y1Var = this;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return obj;
        }
        lVar = aVar.f31973b;
        y1Var = aVar.f31972a;
        pg.q.b(obj);
        d1 d1Var = y1Var.f31970a;
        aVar.f31972a = null;
        aVar.f31973b = null;
        aVar.f31976e = 2;
        Object objF0 = d1Var.f0(lVar, aVar);
        return objF0 == aVar2 ? aVar2 : objF0;
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
