package n8;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class c1 implements sh.f<String> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sh.f f18403a;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sh.g f18404a;

        @vg.e(c = "com.basitce.htmltoapk.data.repository.SettingsRepository$special$$inlined$map$2$2", f = "SettingsRepository.kt", l = {50}, m = "emit")
        /* renamed from: n8.c1$a$a, reason: collision with other inner class name */
        public static final class C0187a extends vg.c {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f18405a;

            /* renamed from: b, reason: collision with root package name */
            public int f18406b;

            public C0187a(tg.e eVar) {
                super(eVar);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                this.f18405a = obj;
                this.f18406b |= PKIFailureInfo.systemUnavail;
                return a.this.c(null, this);
            }
        }

        public a(sh.g gVar) {
            this.f18404a = gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // sh.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(Object obj, tg.e eVar) {
            C0187a c0187a;
            if (eVar instanceof C0187a) {
                c0187a = (C0187a) eVar;
                int i10 = c0187a.f18406b;
                if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                    c0187a.f18406b = i10 - PKIFailureInfo.systemUnavail;
                } else {
                    c0187a = new C0187a(eVar);
                }
            }
            Object obj2 = c0187a.f18405a;
            ug.a aVar = ug.a.f29706a;
            int i11 = c0187a.f18406b;
            if (i11 == 0) {
                pg.q.b(obj2);
                String str = (String) ((v4.e) obj).b(m1.f18521w);
                if (str == null) {
                    str = "system";
                }
                c0187a.f18406b = 1;
                if (this.f18404a.c(str, c0187a) == aVar) {
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

    public c1(sh.f fVar) {
        this.f18403a = fVar;
    }

    @Override // sh.f
    public final Object b(sh.g<? super String> gVar, tg.e eVar) {
        Object objB = this.f18403a.b(new a(gVar), eVar);
        return objB == ug.a.f29706a ? objB : pg.f0.f21461a;
    }
}
