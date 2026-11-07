package n8;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class y0 implements sh.f<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sh.f f18627a;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sh.g f18628a;

        @vg.e(c = "com.basitce.htmltoapk.data.repository.SettingsRepository$special$$inlined$map$15$2", f = "SettingsRepository.kt", l = {50}, m = "emit")
        /* renamed from: n8.y0$a$a, reason: collision with other inner class name */
        public static final class C0206a extends vg.c {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f18629a;

            /* renamed from: b, reason: collision with root package name */
            public int f18630b;

            public C0206a(tg.e eVar) {
                super(eVar);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                this.f18629a = obj;
                this.f18630b |= PKIFailureInfo.systemUnavail;
                return a.this.c(null, this);
            }
        }

        public a(sh.g gVar) {
            this.f18628a = gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // sh.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(Object obj, tg.e eVar) {
            C0206a c0206a;
            if (eVar instanceof C0206a) {
                c0206a = (C0206a) eVar;
                int i10 = c0206a.f18630b;
                if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                    c0206a.f18630b = i10 - PKIFailureInfo.systemUnavail;
                } else {
                    c0206a = new C0206a(eVar);
                }
            }
            Object obj2 = c0206a.f18629a;
            ug.a aVar = ug.a.f29706a;
            int i11 = c0206a.f18630b;
            if (i11 == 0) {
                pg.q.b(obj2);
                Boolean bool = (Boolean) ((v4.e) obj).b(m1.M);
                Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                c0206a.f18630b = 1;
                if (this.f18628a.c(boolValueOf, c0206a) == aVar) {
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

    public y0(sh.f fVar) {
        this.f18627a = fVar;
    }

    @Override // sh.f
    public final Object b(sh.g<? super Boolean> gVar, tg.e eVar) {
        Object objB = this.f18627a.b(new a(gVar), eVar);
        return objB == ug.a.f29706a ? objB : pg.f0.f21461a;
    }
}
