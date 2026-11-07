package n8;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class d1 implements sh.f<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sh.f f18417a;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sh.g f18418a;

        @vg.e(c = "com.basitce.htmltoapk.data.repository.SettingsRepository$special$$inlined$map$20$2", f = "SettingsRepository.kt", l = {50}, m = "emit")
        /* renamed from: n8.d1$a$a, reason: collision with other inner class name */
        public static final class C0188a extends vg.c {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f18419a;

            /* renamed from: b, reason: collision with root package name */
            public int f18420b;

            public C0188a(tg.e eVar) {
                super(eVar);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                this.f18419a = obj;
                this.f18420b |= PKIFailureInfo.systemUnavail;
                return a.this.c(null, this);
            }
        }

        public a(sh.g gVar) {
            this.f18418a = gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // sh.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(Object obj, tg.e eVar) {
            C0188a c0188a;
            if (eVar instanceof C0188a) {
                c0188a = (C0188a) eVar;
                int i10 = c0188a.f18420b;
                if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                    c0188a.f18420b = i10 - PKIFailureInfo.systemUnavail;
                } else {
                    c0188a = new C0188a(eVar);
                }
            }
            Object obj2 = c0188a.f18419a;
            ug.a aVar = ug.a.f29706a;
            int i11 = c0188a.f18420b;
            if (i11 == 0) {
                pg.q.b(obj2);
                Boolean bool = (Boolean) ((v4.e) obj).b(m1.P);
                Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                c0188a.f18420b = 1;
                if (this.f18418a.c(boolValueOf, c0188a) == aVar) {
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

    public d1(sh.f fVar) {
        this.f18417a = fVar;
    }

    @Override // sh.f
    public final Object b(sh.g<? super Boolean> gVar, tg.e eVar) {
        Object objB = this.f18417a.b(new a(gVar), eVar);
        return objB == ug.a.f29706a ? objB : pg.f0.f21461a;
    }
}
