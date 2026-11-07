package sh;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
public final class b<T> extends d<T> {

    /* renamed from: e, reason: collision with root package name */
    public final vg.i f24931e;

    @vg.e(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {330}, m = "collectTo")
    public static final class a extends vg.c {

        /* renamed from: a, reason: collision with root package name */
        public rh.u f24932a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f24933b;

        /* renamed from: d, reason: collision with root package name */
        public int f24935d;

        public a(vg.c cVar) {
            super(cVar);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            this.f24933b = obj;
            this.f24935d |= PKIFailureInfo.systemUnavail;
            return b.this.e(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(eh.p<? super rh.u<? super T>, ? super tg.e<? super pg.f0>, ? extends Object> pVar, tg.h hVar, int i10, rh.a aVar) {
        super(pVar, hVar, i10, aVar);
        this.f24931e = (vg.i) pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [eh.p, vg.i] */
    @Override // th.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(rh.u<? super T> uVar, tg.e<? super pg.f0> eVar) {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i10 = aVar.f24935d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f24935d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a((vg.c) eVar);
            }
        }
        Object obj = aVar.f24933b;
        Object obj2 = ug.a.f29706a;
        int i11 = aVar.f24935d;
        if (i11 == 0) {
            pg.q.b(obj);
            aVar.f24932a = uVar;
            aVar.f24935d = 1;
            Object objInvoke = this.f24960d.invoke(uVar, aVar);
            if (objInvoke != obj2) {
                objInvoke = pg.f0.f21461a;
            }
            if (objInvoke == obj2) {
                return obj2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uVar = aVar.f24932a;
            pg.q.b(obj);
        }
        if (uVar.h()) {
            return pg.f0.f21461a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eh.p, vg.i] */
    @Override // th.g
    public final th.g<T> f(tg.h hVar, int i10, rh.a aVar) {
        return new b(this.f24931e, hVar, i10, aVar);
    }
}
