package s4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;

@vg.e(c = "androidx.datastore.core.DataStoreImpl$data$1", f = "DataStoreImpl.kt", l = {72, EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY, 100}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class n extends vg.i implements eh.p<sh.g<Object>, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public s4.d f24324a;

    /* renamed from: b, reason: collision with root package name */
    public int f24325b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f24326c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m<Object> f24327d;

    @vg.e(c = "androidx.datastore.core.DataStoreImpl$data$1$1", f = "DataStoreImpl.kt", l = {102}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<sh.g<? super i1<Object>>, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f24328a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m<Object> f24329b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m<Object> mVar, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f24329b = mVar;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f24329b, eVar);
        }

        @Override // eh.p
        public final Object invoke(sh.g<? super i1<Object>> gVar, tg.e<? super pg.f0> eVar) {
            return ((a) create(gVar, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f24328a;
            if (i10 == 0) {
                pg.q.b(obj);
                this.f24328a = 1;
                if (m.d(this.f24329b, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "androidx.datastore.core.DataStoreImpl$data$1$2", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.p<i1<Object>, tg.e<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f24330a;

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            b bVar = new b(2, eVar);
            bVar.f24330a = obj;
            return bVar;
        }

        @Override // eh.p
        public final Object invoke(i1<Object> i1Var, tg.e<? super Boolean> eVar) {
            return ((b) create(i1Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            return Boolean.valueOf(!(((i1) this.f24330a) instanceof t0));
        }
    }

    @vg.e(c = "androidx.datastore.core.DataStoreImpl$data$1$3", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
    public static final class c extends vg.i implements eh.p<i1<Object>, tg.e<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f24331a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i1<Object> f24332b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(i1<Object> i1Var, tg.e<? super c> eVar) {
            super(2, eVar);
            this.f24332b = i1Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            c cVar = new c(this.f24332b, eVar);
            cVar.f24331a = obj;
            return cVar;
        }

        @Override // eh.p
        public final Object invoke(i1<Object> i1Var, tg.e<? super Boolean> eVar) {
            return ((c) create(i1Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            i1 i1Var = (i1) this.f24331a;
            return Boolean.valueOf((i1Var instanceof s4.d) && i1Var.f24266a <= this.f24332b.f24266a);
        }
    }

    @vg.e(c = "androidx.datastore.core.DataStoreImpl$data$1$5", f = "DataStoreImpl.kt", l = {CdexHeaderItem.DEBUG_INFO_OFFSETS_POS_OFFSET}, m = "invokeSuspend")
    public static final class d extends vg.i implements eh.q<sh.g<Object>, Throwable, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f24333a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m<Object> f24334b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(m<Object> mVar, tg.e<? super d> eVar) {
            super(3, eVar);
            this.f24334b = mVar;
        }

        @Override // eh.q
        public final Object b(sh.g<Object> gVar, Throwable th2, tg.e<? super pg.f0> eVar) {
            return new d(this.f24334b, eVar).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f24333a;
            if (i10 == 0) {
                pg.q.b(obj);
                this.f24333a = 1;
                if (m.b(this.f24334b, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class e implements sh.f<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sh.r f24335a;

        public static final class a<T> implements sh.g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ sh.g f24336a;

            @vg.e(c = "androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2", f = "DataStoreImpl.kt", l = {223}, m = "emit")
            /* renamed from: s4.n$e$a$a, reason: collision with other inner class name */
            public static final class C0271a extends vg.c {

                /* renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f24337a;

                /* renamed from: b, reason: collision with root package name */
                public int f24338b;

                public C0271a(tg.e eVar) {
                    super(eVar);
                }

                @Override // vg.a
                public final Object invokeSuspend(Object obj) {
                    this.f24337a = obj;
                    this.f24338b |= PKIFailureInfo.systemUnavail;
                    return a.this.c(null, this);
                }
            }

            public a(sh.g gVar) {
                this.f24336a = gVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // sh.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object c(Object obj, tg.e eVar) throws Throwable {
                C0271a c0271a;
                if (eVar instanceof C0271a) {
                    c0271a = (C0271a) eVar;
                    int i10 = c0271a.f24338b;
                    if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                        c0271a.f24338b = i10 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0271a = new C0271a(eVar);
                    }
                }
                Object obj2 = c0271a.f24337a;
                ug.a aVar = ug.a.f29706a;
                int i11 = c0271a.f24338b;
                if (i11 == 0) {
                    pg.q.b(obj2);
                    i1 i1Var = (i1) obj;
                    if (i1Var instanceof x0) {
                        throw ((x0) i1Var).f24426b;
                    }
                    if (!(i1Var instanceof s4.d)) {
                        if (i1Var instanceof t0 ? true : i1Var instanceof l1) {
                            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        }
                        throw new pg.l();
                    }
                    T t3 = ((s4.d) i1Var).f24211b;
                    c0271a.f24338b = 1;
                    if (this.f24336a.c(t3, c0271a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj2);
                }
                return pg.f0.f21461a;
            }
        }

        public e(sh.r rVar) {
            this.f24335a = rVar;
        }

        @Override // sh.f
        public final Object b(sh.g<? super Object> gVar, tg.e eVar) {
            Object objB = this.f24335a.b(new a(gVar), eVar);
            return objB == ug.a.f29706a ? objB : pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m<Object> mVar, tg.e<? super n> eVar) {
        super(2, eVar);
        this.f24327d = mVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        n nVar = new n(this.f24327d, eVar);
        nVar.f24326c = obj;
        return nVar;
    }

    @Override // eh.p
    public final Object invoke(sh.g<Object> gVar, tg.e<? super pg.f0> eVar) {
        return ((n) create(gVar, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00be, code lost:
    
        if (r10 == r0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4  */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        sh.g<? super Object> gVar;
        i1 i1Var;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f24325b;
        m<Object> mVar = this.f24327d;
        if (i10 == 0) {
            pg.q.b(obj);
            sh.g<? super Object> gVar2 = (sh.g) this.f24326c;
            this.f24326c = gVar2;
            this.f24325b = 1;
            Object objE = ph.h.e(mVar.f24306c.getCoroutineContext(), new a0(mVar, null), this);
            if (objE != aVar) {
                gVar = gVar2;
                obj = objE;
            }
            return aVar;
        }
        if (i10 == 1) {
            sh.g<? super Object> gVar3 = (sh.g) this.f24326c;
            pg.q.b(obj);
            gVar = gVar3;
        } else {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                return pg.f0.f21461a;
            }
            i1Var = this.f24324a;
            gVar = (sh.g) this.f24326c;
            pg.q.b(obj);
            sh.m mVar2 = new sh.m(new e(new sh.r(new sh.t(new sh.n(new a(mVar, null), mVar.f24311h.f24265a), new b(2, null)), new c(i1Var, null))), new d(mVar, null));
            this.f24326c = null;
            this.f24324a = null;
            this.f24325b = 3;
            if (!(gVar instanceof sh.d1)) {
                throw ((sh.d1) gVar).f24967a;
            }
            Object objB = mVar2.b(gVar, this);
            if (objB != aVar) {
                objB = pg.f0.f21461a;
            }
        }
        i1Var = (i1) obj;
        if (i1Var instanceof s4.d) {
            s4.d dVar = (s4.d) i1Var;
            Object obj2 = dVar.f24211b;
            this.f24326c = gVar;
            this.f24324a = dVar;
            this.f24325b = 2;
            if (gVar.c(obj2, this) != aVar) {
            }
            return aVar;
        }
        if (i1Var instanceof l1) {
            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
        }
        if (i1Var instanceof x0) {
            throw ((x0) i1Var).f24426b;
        }
        if (i1Var instanceof t0) {
            return pg.f0.f21461a;
        }
        sh.m mVar22 = new sh.m(new e(new sh.r(new sh.t(new sh.n(new a(mVar, null), mVar.f24311h.f24265a), new b(2, null)), new c(i1Var, null))), new d(mVar, null));
        this.f24326c = null;
        this.f24324a = null;
        this.f24325b = 3;
        if (!(gVar instanceof sh.d1)) {
        }
    }
}
