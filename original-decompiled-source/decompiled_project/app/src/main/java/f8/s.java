package f8;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.f0;

/* loaded from: classes.dex */
public final class s implements sh.f<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sh.f f8928a;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sh.g f8929a;

        @vg.e(c = "com.basitce.htmltoapk.MainActivity$onCreate$6$invoke$lambda$4$$inlined$map$1$2", f = "MainActivity.kt", l = {50}, m = "emit")
        /* renamed from: f8.s$a$a, reason: collision with other inner class name */
        public static final class C0094a extends vg.c {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f8930a;

            /* renamed from: b, reason: collision with root package name */
            public int f8931b;

            public C0094a(tg.e eVar) {
                super(eVar);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                this.f8930a = obj;
                this.f8931b |= PKIFailureInfo.systemUnavail;
                return a.this.c(null, this);
            }
        }

        public a(sh.g gVar) {
            this.f8929a = gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // sh.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(Object obj, tg.e eVar) {
            C0094a c0094a;
            if (eVar instanceof C0094a) {
                c0094a = (C0094a) eVar;
                int i10 = c0094a.f8931b;
                if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                    c0094a.f8931b = i10 - PKIFailureInfo.systemUnavail;
                } else {
                    c0094a = new C0094a(eVar);
                }
            }
            Object obj2 = c0094a.f8930a;
            ug.a aVar = ug.a.f29706a;
            int i11 = c0094a.f8931b;
            if (i11 == 0) {
                pg.q.b(obj2);
                Boolean bool = (Boolean) obj;
                bool.getClass();
                c0094a.f8931b = 1;
                if (this.f8929a.c(bool, c0094a) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj2);
            }
            return f0.f21461a;
        }
    }

    public s(sh.f fVar) {
        this.f8928a = fVar;
    }

    @Override // sh.f
    public final Object b(sh.g<? super Boolean> gVar, tg.e eVar) {
        Object objB = this.f8928a.b(new a(gVar), eVar);
        return objB == ug.a.f29706a ? objB : f0.f21461a;
    }
}
