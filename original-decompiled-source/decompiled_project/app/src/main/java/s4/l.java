package s4;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", f = "DataStoreImpl.kt", l = {437, 458, 546, 468}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class l extends vg.i implements eh.l<tg.e<? super d<Object>>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public Object f24289a;

    /* renamed from: b, reason: collision with root package name */
    public Serializable f24290b;

    /* renamed from: c, reason: collision with root package name */
    public Object f24291c;

    /* renamed from: d, reason: collision with root package name */
    public Object f24292d;

    /* renamed from: e, reason: collision with root package name */
    public Iterator f24293e;

    /* renamed from: f, reason: collision with root package name */
    public int f24294f;

    /* renamed from: g, reason: collision with root package name */
    public int f24295g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m<Object> f24296h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m<Object>.a f24297j;

    public static final class a implements u0<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ yh.a f24298a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.b0 f24299b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.g0<Object> f24300c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m<Object> f24301d;

        public a(yh.a aVar, kotlin.jvm.internal.b0 b0Var, kotlin.jvm.internal.g0<Object> g0Var, m<Object> mVar) {
            this.f24298a = aVar;
            this.f24299b = b0Var;
            this.f24300c = g0Var;
            this.f24301d = mVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b4 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:21:0x0050, B:36:0x00ac, B:38:0x00b4), top: B:54:0x0050 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r10v13, types: [T] */
        /* JADX WARN: Type inference failed for: r10v20 */
        /* JADX WARN: Type inference failed for: r10v9 */
        /* JADX WARN: Type inference failed for: r8v3, types: [eh.p] */
        @Override // s4.u0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object a(h hVar, vg.c cVar) throws Throwable {
            k kVar;
            yh.a aVar;
            m<Object> mVar;
            kotlin.jvm.internal.b0 b0Var;
            kotlin.jvm.internal.g0<Object> g0Var;
            yh.a aVar2;
            yh.a aVar3;
            m<Object> mVar2;
            ?? r10;
            kotlin.jvm.internal.g0<Object> g0Var2;
            if (cVar instanceof k) {
                kVar = (k) cVar;
                int i10 = kVar.f24283h;
                if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                    kVar.f24283h = i10 - PKIFailureInfo.systemUnavail;
                } else {
                    kVar = new k(this, cVar);
                }
            }
            Object obj = kVar.f24281f;
            ug.a aVar4 = ug.a.f29706a;
            int i11 = kVar.f24283h;
            try {
                if (i11 == 0) {
                    pg.q.b(obj);
                    kVar.f24276a = hVar;
                    aVar = this.f24298a;
                    kVar.f24277b = aVar;
                    kotlin.jvm.internal.b0 b0Var2 = this.f24299b;
                    kVar.f24278c = b0Var2;
                    kotlin.jvm.internal.g0<Object> g0Var3 = this.f24300c;
                    kVar.f24279d = g0Var3;
                    mVar = this.f24301d;
                    kVar.f24280e = mVar;
                    kVar.f24283h = 1;
                    if (aVar.h(kVar) != aVar4) {
                        b0Var = b0Var2;
                        g0Var = g0Var3;
                    }
                    return aVar4;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj2 = kVar.f24278c;
                        g0Var2 = (kotlin.jvm.internal.g0) kVar.f24277b;
                        aVar2 = (yh.a) kVar.f24276a;
                        try {
                            pg.q.b(obj);
                            r10 = obj2;
                            g0Var2.f16327a = r10;
                            g0Var = g0Var2;
                            Object obj3 = g0Var.f16327a;
                            aVar2.l(null);
                            return obj3;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar2.l(null);
                            throw th;
                        }
                    }
                    mVar2 = (m) kVar.f24278c;
                    g0Var = (kotlin.jvm.internal.g0) kVar.f24277b;
                    aVar3 = (yh.a) kVar.f24276a;
                    try {
                        pg.q.b(obj);
                        if (!kotlin.jvm.internal.r.a(obj, g0Var.f16327a)) {
                            aVar2 = aVar3;
                            Object obj32 = g0Var.f16327a;
                            aVar2.l(null);
                            return obj32;
                        }
                        kVar.f24276a = aVar3;
                        kVar.f24277b = g0Var;
                        kVar.f24278c = obj;
                        kVar.f24283h = 3;
                        if (mVar2.j(obj, false, kVar) != aVar4) {
                            r10 = obj;
                            g0Var2 = g0Var;
                            aVar2 = aVar3;
                            g0Var2.f16327a = r10;
                            g0Var = g0Var2;
                            Object obj322 = g0Var.f16327a;
                            aVar2.l(null);
                            return obj322;
                        }
                        return aVar4;
                    } catch (Throwable th3) {
                        th = th3;
                        aVar2 = aVar3;
                        aVar2.l(null);
                        throw th;
                    }
                }
                m<Object> mVar3 = kVar.f24280e;
                g0Var = kVar.f24279d;
                b0Var = (kotlin.jvm.internal.b0) kVar.f24278c;
                yh.a aVar5 = (yh.a) kVar.f24277b;
                ?? r82 = (eh.p) kVar.f24276a;
                pg.q.b(obj);
                mVar = mVar3;
                hVar = r82;
                aVar = aVar5;
                if (b0Var.f16318a) {
                    throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                }
                Object obj4 = g0Var.f16327a;
                kVar.f24276a = aVar;
                kVar.f24277b = g0Var;
                kVar.f24278c = mVar;
                kVar.f24279d = null;
                kVar.f24280e = null;
                kVar.f24283h = 2;
                Object objInvoke = hVar.invoke(obj4, kVar);
                if (objInvoke != aVar4) {
                    aVar3 = aVar;
                    obj = objInvoke;
                    mVar2 = mVar;
                    if (!kotlin.jvm.internal.r.a(obj, g0Var.f16327a)) {
                    }
                }
                return aVar4;
            } catch (Throwable th4) {
                th = th4;
                aVar2 = aVar;
                aVar2.l(null);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m<Object> mVar, m<Object>.a aVar, tg.e<? super l> eVar) {
        super(1, eVar);
        this.f24296h = mVar;
        this.f24297j = aVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(tg.e<?> eVar) {
        return new l(this.f24296h, this.f24297j, eVar);
    }

    @Override // eh.l
    public final Object invoke(tg.e<? super d<Object>> eVar) {
        return ((l) create(eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws c {
        yh.a cVar;
        kotlin.jvm.internal.b0 b0Var;
        kotlin.jvm.internal.g0 g0Var;
        kotlin.jvm.internal.g0 g0Var2;
        yh.a aVar;
        Iterator it;
        yh.a aVar2;
        kotlin.jvm.internal.b0 b0Var2;
        kotlin.jvm.internal.g0 g0Var3;
        a aVar3;
        kotlin.jvm.internal.g0 g0Var4;
        kotlin.jvm.internal.b0 b0Var3;
        Object obj2;
        Integer version;
        int i10;
        ug.a aVar4 = ug.a.f29706a;
        int i11 = this.f24295g;
        m<Object>.a aVar5 = this.f24297j;
        m<Object> mVar = this.f24296h;
        if (i11 == 0) {
            pg.q.b(obj);
            cVar = new yh.c();
            b0Var = new kotlin.jvm.internal.b0();
            g0Var = new kotlin.jvm.internal.g0();
            this.f24289a = cVar;
            this.f24290b = b0Var;
            this.f24291c = g0Var;
            this.f24292d = g0Var;
            this.f24295g = 1;
            obj = m.f(mVar, true, this);
            if (obj != aVar4) {
                g0Var2 = g0Var;
            }
            return aVar4;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i10 = this.f24294f;
                    obj2 = this.f24289a;
                    pg.q.b(obj);
                    return new d(obj2, i10, ((Number) obj).intValue());
                }
                aVar = (yh.a) this.f24291c;
                g0Var4 = (kotlin.jvm.internal.g0) this.f24290b;
                b0Var3 = (kotlin.jvm.internal.b0) this.f24289a;
                pg.q.b(obj);
                try {
                    b0Var3.f16318a = true;
                    pg.f0 f0Var = pg.f0.f21461a;
                    aVar.l(null);
                    obj2 = g0Var4.f16327a;
                    int iHashCode = obj2 == null ? obj2.hashCode() : 0;
                    v0 v0VarG = mVar.g();
                    this.f24289a = obj2;
                    this.f24290b = null;
                    this.f24291c = null;
                    this.f24294f = iHashCode;
                    this.f24295g = 4;
                    version = v0VarG.getVersion();
                    if (version != aVar4) {
                        i10 = iHashCode;
                        obj = version;
                        return new d(obj2, i10, ((Number) obj).intValue());
                    }
                    return aVar4;
                } catch (Throwable th2) {
                    aVar.l(null);
                    throw th2;
                }
            }
            it = this.f24293e;
            aVar3 = (a) this.f24292d;
            g0Var3 = (kotlin.jvm.internal.g0) this.f24291c;
            b0Var2 = (kotlin.jvm.internal.b0) this.f24290b;
            aVar2 = (yh.a) this.f24289a;
            pg.q.b(obj);
            while (it.hasNext()) {
                eh.p pVar = (eh.p) it.next();
                this.f24289a = aVar2;
                this.f24290b = b0Var2;
                this.f24291c = g0Var3;
                this.f24292d = aVar3;
                this.f24293e = it;
                this.f24295g = 2;
                if (pVar.invoke(aVar3, this) == aVar4) {
                    break;
                }
            }
            g0Var2 = g0Var3;
            b0Var = b0Var2;
            aVar = aVar2;
            aVar5.f24316c = null;
            this.f24289a = b0Var;
            this.f24290b = g0Var2;
            this.f24291c = aVar;
            this.f24292d = null;
            this.f24293e = null;
            this.f24295g = 3;
            if (aVar.h(this) != aVar4) {
                g0Var4 = g0Var2;
                b0Var3 = b0Var;
                b0Var3.f16318a = true;
                pg.f0 f0Var2 = pg.f0.f21461a;
                aVar.l(null);
                obj2 = g0Var4.f16327a;
                if (obj2 == null) {
                }
                v0 v0VarG2 = mVar.g();
                this.f24289a = obj2;
                this.f24290b = null;
                this.f24291c = null;
                this.f24294f = iHashCode;
                this.f24295g = 4;
                version = v0VarG2.getVersion();
                if (version != aVar4) {
                }
            }
            return aVar4;
        }
        g0Var = (kotlin.jvm.internal.g0) this.f24292d;
        g0Var2 = (kotlin.jvm.internal.g0) this.f24291c;
        b0Var = (kotlin.jvm.internal.b0) this.f24290b;
        cVar = (yh.a) this.f24289a;
        pg.q.b(obj);
        g0Var.f16327a = ((d) obj).f24211b;
        a aVar6 = new a(cVar, b0Var, g0Var2, mVar);
        List<? extends eh.p<? super u0<Object>, ? super tg.e<? super pg.f0>, ? extends Object>> list = aVar5.f24316c;
        if (list == null) {
            aVar = cVar;
            aVar5.f24316c = null;
            this.f24289a = b0Var;
            this.f24290b = g0Var2;
            this.f24291c = aVar;
            this.f24292d = null;
            this.f24293e = null;
            this.f24295g = 3;
            if (aVar.h(this) != aVar4) {
            }
            return aVar4;
        }
        it = list.iterator();
        aVar2 = cVar;
        b0Var2 = b0Var;
        g0Var3 = g0Var2;
        aVar3 = aVar6;
        while (it.hasNext()) {
        }
        g0Var2 = g0Var3;
        b0Var = b0Var2;
        aVar = aVar2;
        aVar5.f24316c = null;
        this.f24289a = b0Var;
        this.f24290b = g0Var2;
        this.f24291c = aVar;
        this.f24292d = null;
        this.f24293e = null;
        this.f24295g = 3;
        if (aVar.h(this) != aVar4) {
        }
        return aVar4;
    }
}
