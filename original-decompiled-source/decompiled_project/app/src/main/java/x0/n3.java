package x0;

import org.bouncycastle.asn1.eac.EACTags;

@vg.e(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1", f = "SnapshotFlow.kt", l = {EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE, 68}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class n3 extends vg.i implements eh.p<c2<Object>, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f31823a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f31824b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tg.h f31825c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sh.f<Object> f31826d;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c2<Object> f31827a;

        public a(c2<Object> c2Var) {
            this.f31827a = c2Var;
        }

        @Override // sh.g
        public final Object c(T t3, tg.e<? super pg.f0> eVar) {
            this.f31827a.setValue(t3);
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1$2", f = "SnapshotFlow.kt", l = {68}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f31828a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ sh.f<Object> f31829b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c2<Object> f31830c;

        public static final class a<T> implements sh.g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c2<Object> f31831a;

            public a(c2<Object> c2Var) {
                this.f31831a = c2Var;
            }

            @Override // sh.g
            public final Object c(T t3, tg.e<? super pg.f0> eVar) {
                this.f31831a.setValue(t3);
                return pg.f0.f21461a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(sh.f<Object> fVar, c2<Object> c2Var, tg.e<? super b> eVar) {
            super(2, eVar);
            this.f31829b = fVar;
            this.f31830c = c2Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new b(this.f31829b, this.f31830c, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f31828a;
            if (i10 == 0) {
                pg.q.b(obj);
                a aVar2 = new a(this.f31830c);
                this.f31828a = 1;
                if (this.f31829b.b(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(tg.h hVar, sh.f<Object> fVar, tg.e<? super n3> eVar) {
        super(2, eVar);
        this.f31825c = hVar;
        this.f31826d = fVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        n3 n3Var = new n3(this.f31825c, this.f31826d, eVar);
        n3Var.f31824b = obj;
        return n3Var;
    }

    @Override // eh.p
    public final Object invoke(c2<Object> c2Var, tg.e<? super pg.f0> eVar) {
        return ((n3) create(c2Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r5.b(r1, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (ph.h.e(r4, r1, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        return r0;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f31823a;
        if (i10 == 0) {
            pg.q.b(obj);
            c2 c2Var = (c2) this.f31824b;
            tg.i iVar = tg.i.f28768a;
            tg.h hVar = this.f31825c;
            boolean zA = kotlin.jvm.internal.r.a(hVar, iVar);
            sh.f<Object> fVar = this.f31826d;
            if (zA) {
                a aVar2 = new a(c2Var);
                this.f31823a = 1;
            } else {
                b bVar = new b(fVar, c2Var, null);
                this.f31823a = 2;
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        return pg.f0.f21461a;
    }
}
