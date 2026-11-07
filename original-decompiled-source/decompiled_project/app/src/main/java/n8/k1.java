package n8;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class k1 implements sh.f<Long> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sh.f f18497a;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sh.g f18498a;

        @vg.e(c = "com.basitce.htmltoapk.data.repository.SettingsRepository$special$$inlined$map$9$2", f = "SettingsRepository.kt", l = {50}, m = "emit")
        /* renamed from: n8.k1$a$a, reason: collision with other inner class name */
        public static final class C0197a extends vg.c {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f18499a;

            /* renamed from: b, reason: collision with root package name */
            public int f18500b;

            public C0197a(tg.e eVar) {
                super(eVar);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                this.f18499a = obj;
                this.f18500b |= PKIFailureInfo.systemUnavail;
                return a.this.c(null, this);
            }
        }

        public a(sh.g gVar) {
            this.f18498a = gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // sh.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(Object obj, tg.e eVar) {
            C0197a c0197a;
            if (eVar instanceof C0197a) {
                c0197a = (C0197a) eVar;
                int i10 = c0197a.f18500b;
                if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                    c0197a.f18500b = i10 - PKIFailureInfo.systemUnavail;
                } else {
                    c0197a = new C0197a(eVar);
                }
            }
            Object obj2 = c0197a.f18499a;
            ug.a aVar = ug.a.f29706a;
            int i11 = c0197a.f18500b;
            if (i11 == 0) {
                pg.q.b(obj2);
                Long l10 = (Long) ((v4.e) obj).b(m1.E);
                Long l11 = new Long(l10 != null ? l10.longValue() : 0L);
                c0197a.f18500b = 1;
                if (this.f18498a.c(l11, c0197a) == aVar) {
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

    public k1(sh.f fVar) {
        this.f18497a = fVar;
    }

    @Override // sh.f
    public final Object b(sh.g<? super Long> gVar, tg.e eVar) {
        Object objB = this.f18497a.b(new a(gVar), eVar);
        return objB == ug.a.f29706a ? objB : pg.f0.f21461a;
    }
}
