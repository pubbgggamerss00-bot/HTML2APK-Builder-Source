package sh;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;

/* loaded from: classes2.dex */
public final class c0 implements f<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f24951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vg.i f24952b;

    public static final class a<T> implements g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f24953a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ vg.i f24954b;

        @vg.e(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {50, EACTags.TRANSACTION_DATE}, m = "emit")
        /* renamed from: sh.c0$a$a, reason: collision with other inner class name */
        public static final class C0276a extends vg.c {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f24955a;

            /* renamed from: b, reason: collision with root package name */
            public int f24956b;

            /* renamed from: d, reason: collision with root package name */
            public Object f24958d;

            /* renamed from: e, reason: collision with root package name */
            public g f24959e;

            public C0276a(tg.e eVar) {
                super(eVar);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                this.f24955a = obj;
                this.f24956b |= PKIFailureInfo.systemUnavail;
                return a.this.c(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(g gVar, eh.p pVar) {
            this.f24953a = gVar;
            this.f24954b = (vg.i) pVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
        
            if (r6.c(r2, r0) == r1) goto L22;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r2v1, types: [eh.p, vg.i] */
        @Override // sh.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(T t3, tg.e<? super pg.f0> eVar) {
            C0276a c0276a;
            Object obj;
            g gVar;
            if (eVar instanceof C0276a) {
                c0276a = (C0276a) eVar;
                int i10 = c0276a.f24956b;
                if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                    c0276a.f24956b = i10 - PKIFailureInfo.systemUnavail;
                } else {
                    c0276a = new C0276a(eVar);
                }
            }
            Object obj2 = c0276a.f24955a;
            ug.a aVar = ug.a.f29706a;
            int i11 = c0276a.f24956b;
            if (i11 == 0) {
                pg.q.b(obj2);
                c0276a.f24958d = t3;
                g gVar2 = this.f24953a;
                c0276a.f24959e = gVar2;
                c0276a.f24956b = 1;
                if (this.f24954b.invoke(t3, c0276a) != aVar) {
                    obj = t3;
                    gVar = gVar2;
                }
                return aVar;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj2);
                return pg.f0.f21461a;
            }
            g gVar3 = c0276a.f24959e;
            obj = c0276a.f24958d;
            pg.q.b(obj2);
            gVar = gVar3;
            c0276a.f24958d = null;
            c0276a.f24959e = null;
            c0276a.f24956b = 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c0(f fVar, eh.p pVar) {
        this.f24951a = fVar;
        this.f24952b = (vg.i) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eh.p, vg.i] */
    @Override // sh.f
    public final Object b(g<? super Object> gVar, tg.e eVar) {
        Object objB = this.f24951a.b(new a(gVar, this.f24952b), eVar);
        return objB == ug.a.f29706a ? objB : pg.f0.f21461a;
    }
}
