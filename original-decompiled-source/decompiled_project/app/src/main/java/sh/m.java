package sh;

import i0.u2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;

/* loaded from: classes2.dex */
public final class m implements f<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f25022a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vg.i f25023b;

    @vg.e(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {110, 117, CdexHeaderItem.DEBUG_INFO_BASE}, m = "collect")
    public static final class a extends vg.c {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f25024a;

        /* renamed from: b, reason: collision with root package name */
        public int f25025b;

        /* renamed from: d, reason: collision with root package name */
        public Object f25027d;

        /* renamed from: e, reason: collision with root package name */
        public g f25028e;

        public a(tg.e eVar) {
            super(eVar);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            this.f25024a = obj;
            this.f25025b |= PKIFailureInfo.systemUnavail;
            return m.this.b(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(f fVar, eh.q qVar) {
        this.f25022a = fVar;
        this.f25023b = (vg.i) qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v4, types: [eh.q, vg.i] */
    /* JADX WARN: Type inference failed for: r9v6, types: [eh.q, vg.i] */
    @Override // sh.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(g<? super Object> gVar, tg.e<? super pg.f0> eVar) throws Throwable {
        a aVar;
        m mVar;
        d1 d1Var;
        ?? r22;
        th.v vVar;
        Throwable th2;
        th.v vVar2;
        ?? r92;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i10 = aVar.f25025b;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f25025b = i10 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        }
        Object obj = aVar.f25024a;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = aVar.f25025b;
        if (i11 == 0) {
            pg.q.b(obj);
            try {
                f fVar = this.f25022a;
                aVar.f25027d = this;
                aVar.f25028e = gVar;
                aVar.f25025b = 1;
                if (fVar.b(gVar, aVar) != aVar2) {
                    mVar = this;
                    vVar = new th.v(gVar, aVar.getContext());
                    r92 = mVar.f25023b;
                    aVar.f25027d = vVar;
                    aVar.f25028e = null;
                    aVar.f25025b = 3;
                    if (r92.b(vVar, null, aVar) != aVar2) {
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                mVar = this;
                d1Var = new d1(th);
                r22 = mVar.f25023b;
                aVar.f25027d = th;
                aVar.f25028e = null;
                aVar.f25025b = 2;
                if (u2.a(d1Var, r22, th, aVar) != aVar2) {
                    return aVar2;
                }
                throw th;
            }
            return aVar2;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                Throwable th4 = (Throwable) aVar.f25027d;
                pg.q.b(obj);
                throw th4;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vVar2 = (th.v) aVar.f25027d;
            try {
                pg.q.b(obj);
                vVar2.releaseIntercepted();
                return pg.f0.f21461a;
            } catch (Throwable th5) {
                th2 = th5;
                vVar2.releaseIntercepted();
                throw th2;
            }
        }
        gVar = aVar.f25028e;
        mVar = (m) aVar.f25027d;
        try {
            pg.q.b(obj);
            vVar = new th.v(gVar, aVar.getContext());
            try {
                r92 = mVar.f25023b;
                aVar.f25027d = vVar;
                aVar.f25028e = null;
                aVar.f25025b = 3;
                if (r92.b(vVar, null, aVar) != aVar2) {
                    vVar2 = vVar;
                    vVar2.releaseIntercepted();
                    return pg.f0.f21461a;
                }
            } catch (Throwable th6) {
                th2 = th6;
                vVar2 = vVar;
                vVar2.releaseIntercepted();
                throw th2;
            }
        } catch (Throwable th7) {
            th = th7;
            d1Var = new d1(th);
            r22 = mVar.f25023b;
            aVar.f25027d = th;
            aVar.f25028e = null;
            aVar.f25025b = 2;
            if (u2.a(d1Var, r22, th, aVar) != aVar2) {
            }
        }
        return aVar2;
    }
}
