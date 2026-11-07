package n8;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class w0 implements sh.f<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sh.f f18612a;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sh.g f18613a;

        @vg.e(c = "com.basitce.htmltoapk.data.repository.SettingsRepository$special$$inlined$map$13$2", f = "SettingsRepository.kt", l = {50}, m = "emit")
        /* renamed from: n8.w0$a$a, reason: collision with other inner class name */
        public static final class C0204a extends vg.c {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f18614a;

            /* renamed from: b, reason: collision with root package name */
            public int f18615b;

            public C0204a(tg.e eVar) {
                super(eVar);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                this.f18614a = obj;
                this.f18615b |= PKIFailureInfo.systemUnavail;
                return a.this.c(null, this);
            }
        }

        public a(sh.g gVar) {
            this.f18613a = gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // sh.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(Object obj, tg.e eVar) {
            C0204a c0204a;
            if (eVar instanceof C0204a) {
                c0204a = (C0204a) eVar;
                int i10 = c0204a.f18615b;
                if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                    c0204a.f18615b = i10 - PKIFailureInfo.systemUnavail;
                } else {
                    c0204a = new C0204a(eVar);
                }
            }
            Object obj2 = c0204a.f18614a;
            ug.a aVar = ug.a.f29706a;
            int i11 = c0204a.f18615b;
            if (i11 == 0) {
                pg.q.b(obj2);
                Integer num = (Integer) ((v4.e) obj).b(m1.J);
                Integer num2 = new Integer(num != null ? num.intValue() : 0);
                c0204a.f18615b = 1;
                if (this.f18613a.c(num2, c0204a) == aVar) {
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

    public w0(sh.f fVar) {
        this.f18612a = fVar;
    }

    @Override // sh.f
    public final Object b(sh.g<? super Integer> gVar, tg.e eVar) {
        Object objB = this.f18612a.b(new a(gVar), eVar);
        return objB == ug.a.f29706a ? objB : pg.f0.f21461a;
    }
}
