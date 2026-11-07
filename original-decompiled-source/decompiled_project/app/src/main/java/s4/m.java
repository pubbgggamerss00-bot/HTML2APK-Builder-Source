package s4;

import c9.u1;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ph.l2;
import rh.l;
import s4.w0;

/* loaded from: classes.dex */
public final class m<T> implements i<T> {

    /* renamed from: a, reason: collision with root package name */
    public final n0 f24304a;

    /* renamed from: b, reason: collision with root package name */
    public final t4.a f24305b;

    /* renamed from: c, reason: collision with root package name */
    public final ph.i0 f24306c;

    /* renamed from: f, reason: collision with root package name */
    public int f24309f;

    /* renamed from: g, reason: collision with root package name */
    public l2 f24310g;

    /* renamed from: i, reason: collision with root package name */
    public final m<T>.a f24312i;

    /* renamed from: l, reason: collision with root package name */
    public final e1<w0.a<T>> f24315l;

    /* renamed from: d, reason: collision with root package name */
    public final sh.m0 f24307d = new sh.m0(new n(this, null));

    /* renamed from: e, reason: collision with root package name */
    public final yh.c f24308e = new yh.c();

    /* renamed from: h, reason: collision with root package name */
    public final i0<T> f24311h = new i0<>();

    /* renamed from: j, reason: collision with root package name */
    public final pg.s f24313j = e9.w0.b(new b0(this));

    /* renamed from: k, reason: collision with root package name */
    public final pg.s f24314k = e9.w0.b(new c0.t(this, 2));

    public final class a extends a1 {

        /* renamed from: c, reason: collision with root package name */
        public List<? extends eh.p<? super u0<T>, ? super tg.e<? super pg.f0>, ? extends Object>> f24316c;

        public a(List<? extends eh.p<? super u0<T>, ? super tg.e<? super pg.f0>, ? extends Object>> list) {
            this.f24316c = qg.x.c0(list);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // s4.a1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object a(vg.c cVar) throws c {
            j jVar;
            a aVar;
            d dVar;
            if (cVar instanceof j) {
                jVar = (j) cVar;
                int i10 = jVar.f24270d;
                if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                    jVar.f24270d = i10 - PKIFailureInfo.systemUnavail;
                } else {
                    jVar = new j(this, cVar);
                }
            }
            Object objF = jVar.f24268b;
            ug.a aVar2 = ug.a.f29706a;
            int i11 = jVar.f24270d;
            if (i11 == 0) {
                pg.q.b(objF);
                List<? extends eh.p<? super u0<T>, ? super tg.e<? super pg.f0>, ? extends Object>> list = this.f24316c;
                m<T> mVar = m.this;
                if (list == null || list.isEmpty()) {
                    jVar.f24267a = this;
                    jVar.f24270d = 1;
                    objF = m.f(mVar, false, jVar);
                    if (objF != aVar2) {
                        aVar = this;
                        dVar = (d) objF;
                    }
                } else {
                    v0 v0VarG = mVar.g();
                    l lVar = new l(mVar, this, null);
                    jVar.f24267a = this;
                    jVar.f24270d = 2;
                    objF = v0VarG.b(lVar, jVar);
                    if (objF != aVar2) {
                        aVar = this;
                        dVar = (d) objF;
                    }
                }
                return aVar2;
            }
            if (i11 == 1) {
                aVar = jVar.f24267a;
                pg.q.b(objF);
                dVar = (d) objF;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = jVar.f24267a;
                pg.q.b(objF);
                dVar = (d) objF;
            }
            m.this.f24311h.b(dVar);
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "androidx.datastore.core.DataStoreImpl$updateData$2", f = "DataStoreImpl.kt", l = {169}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.p<ph.i0, tg.e<? super T>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f24318a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f24319b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m<T> f24320c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ vg.i f24321d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(m<T> mVar, eh.p<? super T, ? super tg.e<? super T>, ? extends Object> pVar, tg.e<? super b> eVar) {
            super(2, eVar);
            this.f24320c = mVar;
            this.f24321d = (vg.i) pVar;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [eh.p, vg.i] */
        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            b bVar = new b(this.f24320c, this.f24321d, eVar);
            bVar.f24319b = obj;
            return bVar;
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, Object obj) {
            return ((b) create(i0Var, (tg.e) obj)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Type inference failed for: r6v0, types: [eh.p, vg.i] */
        @Override // vg.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f24318a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                return obj;
            }
            pg.q.b(obj);
            ph.i0 i0Var = (ph.i0) this.f24319b;
            ph.v vVarA = ph.w.a();
            m<T> mVar = this.f24320c;
            w0.a aVar2 = new w0.a(this.f24321d, vVarA, mVar.f24311h.a(), i0Var.getCoroutineContext());
            e1<w0.a<T>> e1Var = mVar.f24315l;
            Object objG = e1Var.f24220c.g(aVar2);
            if (objG instanceof l.a) {
                Throwable th2 = ((l.a) objG).f23627a;
                if (th2 == null) {
                    throw new rh.o("Channel was closed normally");
                }
                throw th2;
            }
            if (objG instanceof l.b) {
                throw new IllegalStateException("Check failed.");
            }
            if (e1Var.f24221d.f24194a.getAndIncrement() == 0) {
                ph.h.c(e1Var.f24218a, null, null, new d1(e1Var, null), 3);
            }
            this.f24318a = 1;
            Object objK = vVarA.k(this);
            return objK == aVar ? aVar : objK;
        }
    }

    public m(n0 n0Var, List list, t4.a aVar, ph.i0 i0Var) {
        this.f24304a = n0Var;
        this.f24305b = aVar;
        this.f24306c = i0Var;
        this.f24312i = new a(list);
        this.f24315l = new e1<>(i0Var, new d0(this), e0.f24217a, new f0(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(m mVar, vg.c cVar) {
        o oVar;
        yh.c cVar2;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i10 = oVar.f24350e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                oVar.f24350e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                oVar = new o(mVar, cVar);
            }
        }
        Object obj = oVar.f24348c;
        ug.a aVar = ug.a.f29706a;
        int i11 = oVar.f24350e;
        if (i11 == 0) {
            pg.q.b(obj);
            cVar2 = mVar.f24308e;
            oVar.f24346a = mVar;
            oVar.f24347b = cVar2;
            oVar.f24350e = 1;
            if (cVar2.h(oVar) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yh.c cVar3 = oVar.f24347b;
            m mVar2 = oVar.f24346a;
            pg.q.b(obj);
            cVar2 = cVar3;
            mVar = mVar2;
        }
        try {
            int i12 = mVar.f24309f - 1;
            mVar.f24309f = i12;
            if (i12 == 0) {
                l2 l2Var = mVar.f24310g;
                if (l2Var != null) {
                    l2Var.cancel((CancellationException) null);
                }
                mVar.f24310g = null;
            }
            pg.f0 f0Var = pg.f0.f21461a;
            cVar2.l(null);
            return pg.f0.f21461a;
        } catch (Throwable th2) {
            cVar2.l(null);
            throw th2;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(2:4|(1:6)(1:7))(0)|8|(8:68|(1:(1:(2:18|19))(3:20|21|22))|13|14|62|(1:64)(1:65)|66|67)(5:23|73|24|(3:26|71|27)(3:37|(1:39)(1:40)|(2:42|(2:44|(1:46))(2:53|54))(2:55|(2:57|58)(2:59|60)))|50)|47|69|48|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (r9 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b5, code lost:
    
        if (r9 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b8, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v3, types: [eh.p, vg.i] */
    /* JADX WARN: Type inference failed for: r2v9, types: [eh.p, vg.i] */
    /* JADX WARN: Type inference failed for: r9v0, types: [s4.m] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12, types: [ph.u] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(m mVar, w0.a aVar, vg.c cVar) {
        q qVar;
        ph.v vVar;
        m mVar2;
        Object objB;
        ?? r92;
        Throwable thA;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i10 = qVar.f24373f;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                qVar.f24373f = i10 - PKIFailureInfo.systemUnavail;
            } else {
                qVar = new q(mVar, cVar);
            }
        }
        Object objA = qVar.f24371d;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = qVar.f24373f;
        boolean z10 = true;
        if (i11 != 0) {
            try {
                if (i11 != 1) {
                    if (i11 == 2) {
                        ph.v vVar2 = qVar.f24370c;
                        m mVar3 = qVar.f24369b;
                        w0.a aVar3 = (w0.a) qVar.f24368a;
                        pg.q.b(objA);
                        vVar = vVar2;
                        mVar2 = mVar3;
                        aVar = aVar3;
                    } else if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ph.u uVar = (ph.u) qVar.f24368a;
                pg.q.b(objA);
                r92 = uVar;
            } catch (Throwable th2) {
                th = th2;
                objA = pg.q.a(th);
                r92 = mVar;
                thA = pg.p.a(objA);
                if (thA == null) {
                }
                return pg.f0.f21461a;
            }
            thA = pg.p.a(objA);
            if (thA == null) {
                r92.g0(objA);
            } else {
                r92.d0(thA);
            }
            return pg.f0.f21461a;
        }
        pg.q.b(objA);
        vVar = aVar.f24414b;
        try {
            i1<T> i1VarA = mVar.f24311h.a();
            if (i1VarA instanceof d) {
                ?? r22 = aVar.f24413a;
                tg.h hVar = aVar.f24416d;
                qVar.f24368a = vVar;
                qVar.f24373f = 1;
                try {
                    objB = mVar.g().b(new c0(mVar, hVar, r22, null), qVar);
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    mVar = vVar;
                    objA = pg.q.a(th);
                    r92 = mVar;
                    thA = pg.p.a(objA);
                    if (thA == null) {
                    }
                    return pg.f0.f21461a;
                }
            } else {
                if (!(i1VarA instanceof x0)) {
                    z10 = i1VarA instanceof l1;
                }
                if (!z10) {
                    if (i1VarA instanceof t0) {
                        throw ((t0) i1VarA).f24398b;
                    }
                    throw new pg.l();
                }
                if (i1VarA != aVar.f24415c) {
                    kotlin.jvm.internal.r.c(i1VarA, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
                    throw ((x0) i1VarA).f24426b;
                }
                qVar.f24368a = aVar;
                qVar.f24369b = mVar;
                qVar.f24370c = vVar;
                qVar.f24373f = 2;
                Object objH = mVar.h(qVar);
                mVar2 = mVar;
                if (objH == aVar2) {
                }
            }
            return aVar2;
        } catch (Throwable th4) {
            th = th4;
            mVar = vVar;
            objA = pg.q.a(th);
            r92 = mVar;
            thA = pg.p.a(objA);
            if (thA == null) {
            }
            return pg.f0.f21461a;
        }
        ?? r23 = aVar.f24413a;
        tg.h hVar2 = aVar.f24416d;
        qVar.f24368a = vVar;
        qVar.f24369b = null;
        qVar.f24370c = null;
        qVar.f24373f = 3;
        objB = mVar2.g().b(new c0(mVar2, hVar2, r23, null), qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(m mVar, vg.c cVar) {
        r rVar;
        yh.c cVar2;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i10 = rVar.f24384e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                rVar.f24384e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                rVar = new r(mVar, cVar);
            }
        }
        Object obj = rVar.f24382c;
        ug.a aVar = ug.a.f29706a;
        int i11 = rVar.f24384e;
        if (i11 == 0) {
            pg.q.b(obj);
            cVar2 = mVar.f24308e;
            rVar.f24380a = mVar;
            rVar.f24381b = cVar2;
            rVar.f24384e = 1;
            if (cVar2.h(rVar) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yh.c cVar3 = rVar.f24381b;
            m mVar2 = rVar.f24380a;
            pg.q.b(obj);
            cVar2 = cVar3;
            mVar = mVar2;
        }
        try {
            int i12 = mVar.f24309f + 1;
            mVar.f24309f = i12;
            if (i12 == 1) {
                mVar.f24310g = ph.h.c(mVar.f24306c, null, null, new s(mVar, null), 3);
            }
            pg.f0 f0Var = pg.f0.f21461a;
            cVar2.l(null);
            return pg.f0.f21461a;
        } catch (Throwable th2) {
            cVar2.l(null);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(m mVar, boolean z10, tg.e eVar) {
        u uVar;
        m mVar2;
        i1<T> i1Var;
        m mVar3;
        pg.n nVar;
        if (eVar instanceof u) {
            uVar = (u) eVar;
            int i10 = uVar.f24404f;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                uVar.f24404f = i10 - PKIFailureInfo.systemUnavail;
            } else {
                uVar = new u(mVar, eVar);
            }
        }
        Object objA = uVar.f24402d;
        ug.a aVar = ug.a.f29706a;
        int i11 = uVar.f24404f;
        if (i11 == 0) {
            pg.q.b(objA);
            i1<T> i1VarA = mVar.f24311h.a();
            if (i1VarA instanceof l1) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            v0 v0VarG = mVar.g();
            uVar.f24399a = mVar;
            uVar.f24400b = i1VarA;
            uVar.f24401c = z10;
            uVar.f24404f = 1;
            Integer version = v0VarG.getVersion();
            if (version != aVar) {
                mVar2 = mVar;
                i1Var = i1VarA;
                objA = version;
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                mVar3 = uVar.f24399a;
                pg.q.b(objA);
                nVar = (pg.n) objA;
                i1 i1Var2 = (i1) nVar.f21469a;
                if (((Boolean) nVar.f21470b).booleanValue()) {
                }
                return i1Var2;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mVar3 = uVar.f24399a;
            pg.q.b(objA);
            nVar = (pg.n) objA;
            i1 i1Var22 = (i1) nVar.f21469a;
            if (((Boolean) nVar.f21470b).booleanValue()) {
                mVar3.f24311h.b(i1Var22);
            }
            return i1Var22;
        }
        z10 = uVar.f24401c;
        i1Var = uVar.f24400b;
        mVar2 = uVar.f24399a;
        pg.q.b(objA);
        int iIntValue = ((Number) objA).intValue();
        boolean z11 = i1Var instanceof d;
        int i12 = z11 ? i1Var.f24266a : -1;
        if (z11 && iIntValue == i12) {
            return i1Var;
        }
        if (z10) {
            v0 v0VarG2 = mVar2.g();
            v vVar = new v(mVar2, null);
            uVar.f24399a = mVar2;
            uVar.f24400b = null;
            uVar.f24404f = 2;
            objA = v0VarG2.b(vVar, uVar);
            if (objA != aVar) {
                mVar3 = mVar2;
                nVar = (pg.n) objA;
                i1 i1Var222 = (i1) nVar.f21469a;
                if (((Boolean) nVar.f21470b).booleanValue()) {
                }
                return i1Var222;
            }
        } else {
            v0 v0VarG3 = mVar2.g();
            w wVar = new w(mVar2, i12, null);
            uVar.f24399a = mVar2;
            uVar.f24400b = null;
            uVar.f24404f = 3;
            objA = v0VarG3.a(wVar, uVar);
            if (objA != aVar) {
                mVar3 = mVar2;
                nVar = (pg.n) objA;
                i1 i1Var2222 = (i1) nVar.f21469a;
                if (((Boolean) nVar.f21470b).booleanValue()) {
                }
                return i1Var2222;
            }
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x013c, code lost:
    
        if (r10 != r1) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e6 A[Catch: c -> 0x00a7, TryCatch #3 {c -> 0x00a7, blocks: (B:36:0x00a2, B:70:0x013f, B:41:0x00b0, B:67:0x0122, B:49:0x00cd, B:57:0x00e6, B:58:0x00ea, B:53:0x00d6, B:64:0x0110), top: B:79:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(m mVar, boolean z10, vg.c cVar) throws c {
        x xVar;
        T t3;
        Integer version;
        Object obj;
        m mVar2;
        int i10;
        ?? r10;
        Object obj2;
        Object obj3;
        c cVar2;
        Object objB;
        kotlin.jvm.internal.e0 e0Var;
        kotlin.jvm.internal.g0 g0Var;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i11 = xVar.f24425j;
            if ((i11 & PKIFailureInfo.systemUnavail) != 0) {
                xVar.f24425j = i11 - PKIFailureInfo.systemUnavail;
            } else {
                xVar = new x(mVar, cVar);
            }
        }
        T t10 = (T) xVar.f24423g;
        ug.a aVar = ug.a.f29706a;
        try {
            switch (xVar.f24425j) {
                case 0:
                    pg.q.b(t10);
                    if (!z10) {
                        v0 v0VarG = mVar.g();
                        xVar.f24417a = mVar;
                        xVar.f24421e = z10;
                        xVar.f24425j = 3;
                        ug.a aVar2 = (T) v0VarG.getVersion();
                        obj2 = aVar2;
                        if (aVar2 != aVar) {
                            int iIntValue = ((Number) obj2).intValue();
                            v0 v0VarG2 = mVar.g();
                            y yVar = new y(mVar, iIntValue, null);
                            xVar.f24417a = mVar;
                            xVar.f24421e = z10;
                            xVar.f24425j = 4;
                            ug.a aVar3 = (T) v0VarG2.a(yVar, xVar);
                            obj3 = aVar3;
                            break;
                        }
                    } else {
                        xVar.f24417a = mVar;
                        xVar.f24421e = z10;
                        xVar.f24425j = 1;
                        T t11 = (T) mVar.i(xVar);
                        t3 = t11;
                        if (t11 != aVar) {
                            int iHashCode = t3 != null ? t3.hashCode() : 0;
                            v0 v0VarG3 = mVar.g();
                            xVar.f24417a = mVar;
                            xVar.f24418b = t3;
                            xVar.f24421e = z10;
                            xVar.f24422f = iHashCode;
                            xVar.f24425j = 2;
                            version = v0VarG3.getVersion();
                            if (version != aVar) {
                                obj = t3;
                                boolean z11 = (T) version;
                                mVar2 = mVar;
                                i10 = iHashCode;
                                r10 = z11;
                                return new d(obj, i10, ((Number) r10).intValue());
                            }
                        }
                    }
                    return aVar;
                case 1:
                    z10 = xVar.f24421e;
                    mVar = (m) xVar.f24417a;
                    pg.q.b(t10);
                    t3 = t10;
                    if (t3 != null) {
                    }
                    v0 v0VarG32 = mVar.g();
                    xVar.f24417a = mVar;
                    xVar.f24418b = t3;
                    xVar.f24421e = z10;
                    xVar.f24422f = iHashCode;
                    xVar.f24425j = 2;
                    version = v0VarG32.getVersion();
                    if (version != aVar) {
                    }
                    return aVar;
                case 2:
                    i10 = xVar.f24422f;
                    z10 = xVar.f24421e;
                    obj = xVar.f24418b;
                    mVar2 = (m) xVar.f24417a;
                    try {
                        pg.q.b(t10);
                        r10 = t10;
                        return new d(obj, i10, ((Number) r10).intValue());
                    } catch (c e10) {
                        e = e10;
                        mVar = mVar2;
                        kotlin.jvm.internal.g0 g0Var2 = new kotlin.jvm.internal.g0();
                        t4.a aVar4 = mVar.f24305b;
                        xVar.f24417a = mVar;
                        xVar.f24418b = e;
                        xVar.f24419c = g0Var2;
                        xVar.f24420d = g0Var2;
                        xVar.f24421e = z10;
                        xVar.f24425j = 5;
                        throw e;
                    }
                case 3:
                    z10 = xVar.f24421e;
                    mVar = (m) xVar.f24417a;
                    pg.q.b(t10);
                    obj2 = t10;
                    int iIntValue2 = ((Number) obj2).intValue();
                    v0 v0VarG22 = mVar.g();
                    y yVar2 = new y(mVar, iIntValue2, null);
                    xVar.f24417a = mVar;
                    xVar.f24421e = z10;
                    xVar.f24425j = 4;
                    ug.a aVar32 = (T) v0VarG22.a(yVar2, xVar);
                    obj3 = aVar32;
                    break;
                case 4:
                    boolean z12 = xVar.f24421e;
                    pg.q.b(t10);
                    obj3 = t10;
                    return (d) obj3;
                case 5:
                    boolean z13 = xVar.f24421e;
                    kotlin.jvm.internal.g0 g0Var3 = xVar.f24420d;
                    kotlin.jvm.internal.g0 g0Var4 = (kotlin.jvm.internal.g0) xVar.f24419c;
                    c cVar3 = (c) xVar.f24418b;
                    m mVar3 = (m) xVar.f24417a;
                    pg.q.b(t10);
                    g0Var3.f16327a = t10;
                    kotlin.jvm.internal.e0 e0Var2 = new kotlin.jvm.internal.e0();
                    try {
                        z zVar = new z(g0Var4, mVar3, e0Var2, null);
                        xVar.f24417a = cVar3;
                        xVar.f24418b = g0Var4;
                        xVar.f24419c = e0Var2;
                        xVar.f24420d = null;
                        xVar.f24425j = 6;
                        if (z13) {
                            mVar3.getClass();
                            objB = zVar.invoke(xVar);
                        } else {
                            objB = mVar3.g().b(new p(zVar, null), xVar);
                        }
                        if (objB != aVar) {
                            e0Var = e0Var2;
                            g0Var = g0Var4;
                            T t12 = g0Var.f16327a;
                            return new d(t12, t12 != null ? t12.hashCode() : 0, e0Var.f16324a);
                        }
                        return aVar;
                    } catch (Throwable th2) {
                        th = th2;
                        cVar2 = cVar3;
                        u1.b(cVar2, th);
                        throw cVar2;
                    }
                case 6:
                    e0Var = (kotlin.jvm.internal.e0) xVar.f24419c;
                    g0Var = (kotlin.jvm.internal.g0) xVar.f24418b;
                    cVar2 = (c) xVar.f24417a;
                    try {
                        pg.q.b(t10);
                        T t122 = g0Var.f16327a;
                        return new d(t122, t122 != null ? t122.hashCode() : 0, e0Var.f16324a);
                    } catch (Throwable th3) {
                        th = th3;
                        u1.b(cVar2, th);
                        throw cVar2;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (c e11) {
            e = e11;
        }
    }

    @Override // s4.i
    public final Object a(eh.p<? super T, ? super tg.e<? super T>, ? extends Object> pVar, tg.e<? super T> eVar) {
        o1 o1Var = (o1) eVar.getContext().get(n1.f24345a);
        if (o1Var != null) {
            o1Var.a(this);
        }
        return ph.h.e(new o1(o1Var, this), new b(this, pVar, null), eVar);
    }

    public final v0 g() {
        return (v0) this.f24314k.getValue();
    }

    @Override // s4.i
    public final sh.f<T> getData() {
        return this.f24307d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r4.b(r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(vg.c cVar) throws Throwable {
        t tVar;
        m<T> mVar;
        int iIntValue;
        int i10;
        Throwable th2;
        m<T> mVar2;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i11 = tVar.f24397e;
            if ((i11 & PKIFailureInfo.systemUnavail) != 0) {
                tVar.f24397e = i11 - PKIFailureInfo.systemUnavail;
            } else {
                tVar = new t(this, cVar);
            }
        }
        Object version = tVar.f24395c;
        Object obj = ug.a.f29706a;
        int i12 = tVar.f24397e;
        try {
            if (i12 == 0) {
                pg.q.b(version);
                v0 v0VarG = g();
                tVar.f24393a = this;
                tVar.f24397e = 1;
                version = v0VarG.getVersion();
                if (version != obj) {
                    mVar = this;
                }
                return obj;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = tVar.f24394b;
                mVar2 = tVar.f24393a;
                try {
                    pg.q.b(version);
                    return pg.f0.f21461a;
                } catch (Throwable th3) {
                    th2 = th3;
                    mVar2.f24311h.b(new x0(i10, th2));
                    throw th2;
                }
            }
            mVar = tVar.f24393a;
            pg.q.b(version);
            m<T>.a aVar = mVar.f24312i;
            tVar.f24393a = mVar;
            tVar.f24394b = iIntValue;
            tVar.f24397e = 2;
        } catch (Throwable th4) {
            i10 = iIntValue;
            th2 = th4;
            mVar2 = mVar;
            mVar2.f24311h.b(new x0(i10, th2));
            throw th2;
        }
        iIntValue = ((Number) version).intValue();
    }

    public final Object i(vg.c cVar) {
        return ((j1) this.f24313j.getValue()).d(new k1(3, null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj, boolean z10, vg.c cVar) {
        g0 g0Var;
        kotlin.jvm.internal.e0 e0Var;
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i10 = g0Var.f24240d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                g0Var.f24240d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                g0Var = new g0(this, cVar);
            }
        }
        Object obj2 = g0Var.f24238b;
        ug.a aVar = ug.a.f29706a;
        int i11 = g0Var.f24240d;
        if (i11 == 0) {
            pg.q.b(obj2);
            kotlin.jvm.internal.e0 e0Var2 = new kotlin.jvm.internal.e0();
            j1 j1Var = (j1) this.f24313j.getValue();
            h0 h0Var = new h0(e0Var2, this, obj, z10, null);
            g0Var.f24237a = e0Var2;
            g0Var.f24240d = 1;
            if (j1Var.b(h0Var, g0Var) == aVar) {
                return aVar;
            }
            e0Var = e0Var2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e0Var = g0Var.f24237a;
            pg.q.b(obj2);
        }
        return new Integer(e0Var.f16324a);
    }
}
