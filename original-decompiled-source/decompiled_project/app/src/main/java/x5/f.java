package x5;

import androidx.room.g0;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.f0;
import pg.q;

/* loaded from: classes.dex */
public final class f implements sh.f<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sh.f f32108a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f32109b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.l f32110c;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sh.g f32111a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g0 f32112b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ eh.l f32113c;

        @vg.e(c = "androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2", f = "FlowBuilder.kt", l = {BERTags.FLAGS, 223}, m = "emit")
        /* renamed from: x5.f$a$a, reason: collision with other inner class name */
        public static final class C0324a extends vg.c {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f32114a;

            /* renamed from: b, reason: collision with root package name */
            public int f32115b;

            /* renamed from: c, reason: collision with root package name */
            public sh.g f32116c;

            public C0324a(tg.e eVar) {
                super(eVar);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                this.f32114a = obj;
                this.f32115b |= PKIFailureInfo.systemUnavail;
                return a.this.c(null, this);
            }
        }

        public a(sh.g gVar, g0 g0Var, eh.l lVar) {
            this.f32111a = gVar;
            this.f32112b = g0Var;
            this.f32113c = lVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
        
            if (r7.c(r8, r0) == r1) goto L21;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // sh.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(Object obj, tg.e eVar) throws Throwable {
            C0324a c0324a;
            sh.g gVar;
            if (eVar instanceof C0324a) {
                c0324a = (C0324a) eVar;
                int i10 = c0324a.f32115b;
                if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                    c0324a.f32115b = i10 - PKIFailureInfo.systemUnavail;
                } else {
                    c0324a = new C0324a(eVar);
                }
            }
            Object objG = c0324a.f32114a;
            Object obj2 = ug.a.f29706a;
            int i11 = c0324a.f32115b;
            if (i11 == 0) {
                q.b(objG);
                sh.g gVar2 = this.f32111a;
                c0324a.f32116c = gVar2;
                c0324a.f32115b = 1;
                objG = b6.c.g(this.f32112b, this.f32113c, c0324a, true, false);
                gVar = gVar2;
                if (objG != obj2) {
                }
                return obj2;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.b(objG);
                return f0.f21461a;
            }
            sh.g gVar3 = c0324a.f32116c;
            q.b(objG);
            gVar = gVar3;
            c0324a.f32116c = null;
            c0324a.f32115b = 2;
        }
    }

    public f(sh.f fVar, g0 g0Var, eh.l lVar) {
        this.f32108a = fVar;
        this.f32109b = g0Var;
        this.f32110c = lVar;
    }

    @Override // sh.f
    public final Object b(sh.g<? super Object> gVar, tg.e eVar) {
        Object objB = this.f32108a.b(new a(gVar, this.f32109b, this.f32110c), eVar);
        return objB == ug.a.f29706a ? objB : f0.f21461a;
    }
}
