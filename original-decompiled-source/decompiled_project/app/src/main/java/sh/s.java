package sh;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
public final class s<T> implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.b0 f25080a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g<T> f25081b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vg.i f25082c;

    @vg.e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {34, 35, 37}, m = "emit")
    public static final class a extends vg.c {

        /* renamed from: a, reason: collision with root package name */
        public s f25083a;

        /* renamed from: b, reason: collision with root package name */
        public Object f25084b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f25085c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ s<T> f25086d;

        /* renamed from: e, reason: collision with root package name */
        public int f25087e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(s<? super T> sVar, tg.e<? super a> eVar) {
            super(eVar);
            this.f25086d = sVar;
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            this.f25085c = obj;
            this.f25087e |= PKIFailureInfo.systemUnavail;
            return this.f25086d.c(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(kotlin.jvm.internal.b0 b0Var, g<? super T> gVar, eh.p<? super T, ? super tg.e<? super Boolean>, ? extends Object> pVar) {
        this.f25080a = b0Var;
        this.f25081b = gVar;
        this.f25082c = (vg.i) pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r6.f25081b.c(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        if (r8.c(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v4, types: [eh.p, vg.i] */
    @Override // sh.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(T t3, tg.e<? super pg.f0> eVar) {
        a aVar;
        s<T> sVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i10 = aVar.f25087e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f25087e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(this, eVar);
            }
        }
        Object objInvoke = aVar.f25085c;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = aVar.f25087e;
        if (i11 == 0) {
            pg.q.b(objInvoke);
            if (this.f25080a.f16318a) {
                aVar.f25087e = 1;
            } else {
                aVar.f25083a = this;
                aVar.f25084b = t3;
                aVar.f25087e = 2;
                objInvoke = this.f25082c.invoke(t3, aVar);
                if (objInvoke != aVar2) {
                    sVar = this;
                    if (!((Boolean) objInvoke).booleanValue()) {
                    }
                }
            }
            return aVar2;
        }
        if (i11 == 1) {
            pg.q.b(objInvoke);
            return pg.f0.f21461a;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(objInvoke);
            return pg.f0.f21461a;
        }
        t3 = (T) aVar.f25084b;
        sVar = aVar.f25083a;
        pg.q.b(objInvoke);
        if (!((Boolean) objInvoke).booleanValue()) {
            return pg.f0.f21461a;
        }
        sVar.f25080a.f16318a = true;
        g<T> gVar = sVar.f25081b;
        aVar.f25083a = null;
        aVar.f25084b = null;
        aVar.f25087e = 3;
    }
}
