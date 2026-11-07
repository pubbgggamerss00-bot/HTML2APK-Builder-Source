package x8;

import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class u7 implements sh.f<Map<String, ? extends Integer>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sh.l0 f33254a;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sh.g f33255a;

        @vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$special$$inlined$map$1$2", f = "HomeViewModel.kt", l = {50}, m = "emit")
        /* renamed from: x8.u7$a$a, reason: collision with other inner class name */
        public static final class C0333a extends vg.c {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f33256a;

            /* renamed from: b, reason: collision with root package name */
            public int f33257b;

            public C0333a(tg.e eVar) {
                super(eVar);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                this.f33256a = obj;
                this.f33257b |= PKIFailureInfo.systemUnavail;
                return a.this.c(null, this);
            }
        }

        public a(sh.g gVar) {
            this.f33255a = gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // sh.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(Object obj, tg.e eVar) {
            C0333a c0333a;
            if (eVar instanceof C0333a) {
                c0333a = (C0333a) eVar;
                int i10 = c0333a.f33257b;
                if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                    c0333a.f33257b = i10 - PKIFailureInfo.systemUnavail;
                } else {
                    c0333a = new C0333a(eVar);
                }
            }
            Object obj2 = c0333a.f33256a;
            ug.a aVar = ug.a.f29706a;
            int i11 = c0333a.f33257b;
            if (i11 == 0) {
                pg.q.b(obj2);
                Map mapA = qg.d0.a(new m7(((m0) obj).f32924a));
                c0333a.f33257b = 1;
                if (this.f33255a.c(mapA, c0333a) == aVar) {
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

    public u7(sh.l0 l0Var) {
        this.f33254a = l0Var;
    }

    @Override // sh.f
    public final Object b(sh.g<? super Map<String, ? extends Integer>> gVar, tg.e eVar) {
        this.f33254a.b(new a(gVar), eVar);
        return ug.a.f29706a;
    }
}
