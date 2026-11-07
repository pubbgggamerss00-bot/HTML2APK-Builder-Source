package sh;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import s4.n;

/* loaded from: classes2.dex */
public final class n implements f<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n.a f25030a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f25031b;

    @vg.e(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {112, CdexHeaderItem.DEBUG_INFO_OFFSETS_POS_OFFSET}, m = "collect")
    public static final class a extends vg.c {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f25032a;

        /* renamed from: b, reason: collision with root package name */
        public int f25033b;

        /* renamed from: d, reason: collision with root package name */
        public n f25035d;

        /* renamed from: e, reason: collision with root package name */
        public g f25036e;

        /* renamed from: f, reason: collision with root package name */
        public th.v f25037f;

        public a(tg.e eVar) {
            super(eVar);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            this.f25032a = obj;
            this.f25033b |= PKIFailureInfo.systemUnavail;
            return n.this.b(null, this);
        }
    }

    public n(n.a aVar, z0 z0Var) {
        this.f25030a = aVar;
        this.f25031b = z0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r7.b(r2, r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // sh.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(g<? super Object> gVar, tg.e<? super pg.f0> eVar) throws Throwable {
        a aVar;
        Throwable th2;
        th.v vVar;
        n nVar;
        g<? super Object> gVar2;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i10 = aVar.f25033b;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f25033b = i10 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        }
        Object obj = aVar.f25032a;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = aVar.f25033b;
        if (i11 == 0) {
            pg.q.b(obj);
            th.v vVar2 = new th.v(gVar, aVar.getContext());
            try {
                n.a aVar3 = this.f25030a;
                aVar.f25035d = this;
                aVar.f25036e = gVar;
                aVar.f25037f = vVar2;
                aVar.f25033b = 1;
                if (aVar3.invoke(vVar2, aVar) != aVar2) {
                    nVar = this;
                    gVar2 = gVar;
                    vVar = vVar2;
                    vVar.releaseIntercepted();
                    f fVar = nVar.f25031b;
                    aVar.f25035d = null;
                    aVar.f25036e = null;
                    aVar.f25037f = null;
                    aVar.f25033b = 2;
                }
                return aVar2;
            } catch (Throwable th3) {
                th2 = th3;
                vVar = vVar2;
                vVar.releaseIntercepted();
                throw th2;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return pg.f0.f21461a;
        }
        vVar = aVar.f25037f;
        gVar2 = aVar.f25036e;
        nVar = aVar.f25035d;
        try {
            pg.q.b(obj);
            vVar.releaseIntercepted();
            f fVar2 = nVar.f25031b;
            aVar.f25035d = null;
            aVar.f25036e = null;
            aVar.f25037f = null;
            aVar.f25033b = 2;
        } catch (Throwable th4) {
            th2 = th4;
            vVar.releaseIntercepted();
            throw th2;
        }
    }
}
