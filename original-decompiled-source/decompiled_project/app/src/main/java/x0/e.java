package x0;

import java.util.ArrayList;
import tg.h;
import x0.k2;

/* loaded from: classes.dex */
public final class e implements d1 {

    /* renamed from: a, reason: collision with root package name */
    public final k2.e f31656a;

    /* renamed from: c, reason: collision with root package name */
    public Throwable f31658c;

    /* renamed from: b, reason: collision with root package name */
    public final Object f31657b = new Object();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f31659d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f31660e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final f1.a f31661f = new f1.a(0);

    public static final class a<R> {

        /* renamed from: a, reason: collision with root package name */
        public final eh.l<Long, R> f31662a;

        /* renamed from: b, reason: collision with root package name */
        public final ph.m f31663b;

        public a(eh.l lVar, ph.m mVar) {
            this.f31662a = lVar;
            this.f31663b = mVar;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l<Throwable, pg.f0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a<R> f31665b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a<R> aVar) {
            super(1);
            this.f31665b = aVar;
        }

        @Override // eh.l
        public final pg.f0 invoke(Throwable th2) {
            e eVar = e.this;
            Object obj = eVar.f31657b;
            Object obj2 = this.f31665b;
            synchronized (obj) {
                eVar.f31659d.remove(obj2);
                if (eVar.f31659d.isEmpty()) {
                    eVar.f31661f.set(0);
                }
            }
            return pg.f0.f21461a;
        }
    }

    public e(k2.e eVar) {
        this.f31656a = eVar;
    }

    public final void a(long j10) {
        Object objA;
        synchronized (this.f31657b) {
            try {
                ArrayList arrayList = this.f31659d;
                this.f31659d = this.f31660e;
                this.f31660e = arrayList;
                this.f31661f.set(0);
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    a aVar = (a) arrayList.get(i10);
                    ph.m mVar = aVar.f31663b;
                    try {
                        objA = aVar.f31662a.invoke(Long.valueOf(j10));
                    } catch (Throwable th2) {
                        objA = pg.q.a(th2);
                    }
                    mVar.resumeWith(objA);
                }
                arrayList.clear();
                pg.f0 f0Var = pg.f0.f21461a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // x0.d1
    public final <R> Object f0(eh.l<? super Long, ? extends R> lVar, tg.e<? super R> eVar) throws Throwable {
        ph.m mVar = new ph.m(1, ah.p.c(eVar));
        mVar.p();
        a aVar = new a(lVar, mVar);
        synchronized (this.f31657b) {
            Throwable th2 = this.f31658c;
            if (th2 != null) {
                mVar.resumeWith(pg.q.a(th2));
            } else {
                boolean zIsEmpty = this.f31659d.isEmpty();
                this.f31659d.add(aVar);
                if (zIsEmpty) {
                    this.f31661f.set(1);
                }
                mVar.s(new b(aVar));
                if (zIsEmpty) {
                    try {
                        this.f31656a.invoke();
                    } catch (Throwable th3) {
                        synchronized (this.f31657b) {
                            try {
                                if (this.f31658c == null) {
                                    this.f31658c = th3;
                                    ArrayList arrayList = this.f31659d;
                                    int size = arrayList.size();
                                    for (int i10 = 0; i10 < size; i10++) {
                                        ((a) arrayList.get(i10)).f31663b.resumeWith(pg.q.a(th3));
                                    }
                                    this.f31659d.clear();
                                    this.f31661f.set(0);
                                    pg.f0 f0Var = pg.f0.f21461a;
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    }
                }
            }
        }
        Object objO = mVar.o();
        ug.a aVar2 = ug.a.f29706a;
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
