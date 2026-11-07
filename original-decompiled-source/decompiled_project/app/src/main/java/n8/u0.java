package n8;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class u0 implements sh.f<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sh.f f18600a;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sh.g f18601a;

        @vg.e(c = "com.basitce.htmltoapk.data.repository.SettingsRepository$special$$inlined$map$11$2", f = "SettingsRepository.kt", l = {50}, m = "emit")
        /* renamed from: n8.u0$a$a, reason: collision with other inner class name */
        public static final class C0202a extends vg.c {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f18602a;

            /* renamed from: b, reason: collision with root package name */
            public int f18603b;

            public C0202a(tg.e eVar) {
                super(eVar);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                this.f18602a = obj;
                this.f18603b |= PKIFailureInfo.systemUnavail;
                return a.this.c(null, this);
            }
        }

        public a(sh.g gVar) {
            this.f18601a = gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // sh.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(Object obj, tg.e eVar) {
            C0202a c0202a;
            if (eVar instanceof C0202a) {
                c0202a = (C0202a) eVar;
                int i10 = c0202a.f18603b;
                if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                    c0202a.f18603b = i10 - PKIFailureInfo.systemUnavail;
                } else {
                    c0202a = new C0202a(eVar);
                }
            }
            Object obj2 = c0202a.f18602a;
            ug.a aVar = ug.a.f29706a;
            int i11 = c0202a.f18603b;
            if (i11 == 0) {
                pg.q.b(obj2);
                Integer num = (Integer) ((v4.e) obj).b(m1.G);
                Integer num2 = new Integer(num != null ? num.intValue() : 5);
                c0202a.f18603b = 1;
                if (this.f18601a.c(num2, c0202a) == aVar) {
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

    public u0(sh.f fVar) {
        this.f18600a = fVar;
    }

    @Override // sh.f
    public final Object b(sh.g<? super Integer> gVar, tg.e eVar) {
        Object objB = this.f18600a.b(new a(gVar), eVar);
        return objB == ug.a.f29706a ? objB : pg.f0.f21461a;
    }
}
