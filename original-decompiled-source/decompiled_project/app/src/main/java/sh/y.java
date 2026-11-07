package sh;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
public final class y implements g<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.p f25121a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f25122b;

    @vg.e(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", l = {132}, m = "emit")
    public static final class a extends vg.c {

        /* renamed from: a, reason: collision with root package name */
        public y f25123a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f25124b;

        /* renamed from: c, reason: collision with root package name */
        public int f25125c;

        /* renamed from: e, reason: collision with root package name */
        public Object f25127e;

        public a(tg.e eVar) {
            super(eVar);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            this.f25124b = obj;
            this.f25125c |= PKIFailureInfo.systemUnavail;
            return y.this.c(null, this);
        }
    }

    public y(eh.p pVar, kotlin.jvm.internal.g0 g0Var) {
        this.f25121a = pVar;
        this.f25122b = g0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // sh.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, tg.e<? super pg.f0> eVar) {
        a aVar;
        y yVar;
        T t3;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i10 = aVar.f25125c;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f25125c = i10 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        }
        Object objInvoke = aVar.f25124b;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = aVar.f25125c;
        if (i11 == 0) {
            pg.q.b(objInvoke);
            aVar.f25123a = this;
            aVar.f25127e = obj;
            aVar.f25125c = 1;
            objInvoke = this.f25121a.invoke(obj, aVar);
            if (objInvoke == aVar2) {
                return aVar2;
            }
            yVar = this;
            t3 = obj;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = aVar.f25127e;
            yVar = aVar.f25123a;
            pg.q.b(objInvoke);
            t3 = obj2;
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return pg.f0.f21461a;
        }
        yVar.f25122b.f16327a = t3;
        throw new th.a(yVar);
    }
}
