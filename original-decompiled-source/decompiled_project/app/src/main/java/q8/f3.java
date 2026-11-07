package q8;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class f3 implements sh.f<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sh.f f22210a;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sh.g f22211a;

        @vg.e(c = "com.basitce.htmltoapk.ui.components.WalkingPixelCatKt$WalkingPixelCat$lambda$4$$inlined$map$1$2", f = "WalkingPixelCat.kt", l = {50}, m = "emit")
        /* renamed from: q8.f3$a$a, reason: collision with other inner class name */
        public static final class C0248a extends vg.c {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f22212a;

            /* renamed from: b, reason: collision with root package name */
            public int f22213b;

            public C0248a(tg.e eVar) {
                super(eVar);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                this.f22212a = obj;
                this.f22213b |= PKIFailureInfo.systemUnavail;
                return a.this.c(null, this);
            }
        }

        public a(sh.g gVar) {
            this.f22211a = gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // sh.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(Object obj, tg.e eVar) {
            C0248a c0248a;
            if (eVar instanceof C0248a) {
                c0248a = (C0248a) eVar;
                int i10 = c0248a.f22213b;
                if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                    c0248a.f22213b = i10 - PKIFailureInfo.systemUnavail;
                } else {
                    c0248a = new C0248a(eVar);
                }
            }
            Object obj2 = c0248a.f22212a;
            ug.a aVar = ug.a.f29706a;
            int i11 = c0248a.f22213b;
            if (i11 == 0) {
                pg.q.b(obj2);
                Boolean bool = (Boolean) ((v4.e) obj).b(n8.m1.f18523y);
                Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                c0248a.f22213b = 1;
                if (this.f22211a.c(boolValueOf, c0248a) == aVar) {
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

    public f3(sh.f fVar) {
        this.f22210a = fVar;
    }

    @Override // sh.f
    public final Object b(sh.g<? super Boolean> gVar, tg.e eVar) {
        Object objB = this.f22210a.b(new a(gVar), eVar);
        return objB == ug.a.f29706a ? objB : pg.f0.f21461a;
    }
}
