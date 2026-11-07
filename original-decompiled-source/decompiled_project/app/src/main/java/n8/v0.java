package n8;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class v0 implements sh.f<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sh.f f18606a;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sh.g f18607a;

        @vg.e(c = "com.basitce.htmltoapk.data.repository.SettingsRepository$special$$inlined$map$12$2", f = "SettingsRepository.kt", l = {50}, m = "emit")
        /* renamed from: n8.v0$a$a, reason: collision with other inner class name */
        public static final class C0203a extends vg.c {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f18608a;

            /* renamed from: b, reason: collision with root package name */
            public int f18609b;

            public C0203a(tg.e eVar) {
                super(eVar);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                this.f18608a = obj;
                this.f18609b |= PKIFailureInfo.systemUnavail;
                return a.this.c(null, this);
            }
        }

        public a(sh.g gVar) {
            this.f18607a = gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // sh.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(Object obj, tg.e eVar) {
            C0203a c0203a;
            if (eVar instanceof C0203a) {
                c0203a = (C0203a) eVar;
                int i10 = c0203a.f18609b;
                if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                    c0203a.f18609b = i10 - PKIFailureInfo.systemUnavail;
                } else {
                    c0203a = new C0203a(eVar);
                }
            }
            Object obj2 = c0203a.f18608a;
            ug.a aVar = ug.a.f29706a;
            int i11 = c0203a.f18609b;
            if (i11 == 0) {
                pg.q.b(obj2);
                Boolean bool = (Boolean) ((v4.e) obj).b(m1.I);
                Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                c0203a.f18609b = 1;
                if (this.f18607a.c(boolValueOf, c0203a) == aVar) {
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

    public v0(sh.f fVar) {
        this.f18606a = fVar;
    }

    @Override // sh.f
    public final Object b(sh.g<? super Boolean> gVar, tg.e eVar) {
        Object objB = this.f18606a.b(new a(gVar), eVar);
        return objB == ug.a.f29706a ? objB : pg.f0.f21461a;
    }
}
