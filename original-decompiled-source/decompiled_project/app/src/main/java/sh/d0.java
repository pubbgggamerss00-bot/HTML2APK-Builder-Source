package sh;

import x8.n7;

/* loaded from: classes2.dex */
public final class d0 implements f<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f[] f24961a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n7 f24962b;

    @vg.e(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", l = {259, 258}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.q<g<Object>, Object[], tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f24963a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ g f24964b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object[] f24965c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n7 f24966d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(tg.e eVar, n7 n7Var) {
            super(3, eVar);
            this.f24966d = n7Var;
        }

        @Override // eh.q
        public final Object b(g<Object> gVar, Object[] objArr, tg.e<? super pg.f0> eVar) {
            a aVar = new a(eVar, this.f24966d);
            aVar.f24964b = gVar;
            aVar.f24965c = objArr;
            return aVar.invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            if (r1.c(r7, r6) == r0) goto L15;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            g gVar;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f24963a;
            if (i10 == 0) {
                pg.q.b(obj);
                gVar = this.f24964b;
                Object[] objArr = this.f24965c;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                this.f24964b = gVar;
                this.f24963a = 1;
                obj = this.f24966d.f(obj2, obj3, obj4, this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                return pg.f0.f21461a;
            }
            gVar = this.f24964b;
            pg.q.b(obj);
            this.f24964b = null;
            this.f24963a = 2;
        }
    }

    public d0(f[] fVarArr, n7 n7Var) {
        this.f24961a = fVarArr;
        this.f24962b = n7Var;
    }

    @Override // sh.f
    public final Object b(g<? super Object> gVar, tg.e eVar) {
        Object objA = th.n.a(h0.f24986a, new a(null, this.f24962b), gVar, eVar, this.f24961a);
        return objA == ug.a.f29706a ? objA : pg.f0.f21461a;
    }
}
