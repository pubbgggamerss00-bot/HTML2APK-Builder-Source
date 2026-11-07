package sh;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import ph.v1;
import s4.n;

/* loaded from: classes2.dex */
public final class t implements f<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f25092a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n.b f25093b;

    @vg.e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", l = {CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET}, m = "collect")
    public static final class a extends vg.c {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f25094a;

        /* renamed from: b, reason: collision with root package name */
        public int f25095b;

        /* renamed from: d, reason: collision with root package name */
        public u f25097d;

        public a(tg.e eVar) {
            super(eVar);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            this.f25094a = obj;
            this.f25095b |= PKIFailureInfo.systemUnavail;
            return t.this.b(null, this);
        }
    }

    public t(n nVar, n.b bVar) {
        this.f25092a = nVar;
        this.f25093b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // sh.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(g<? super Object> gVar, tg.e<? super pg.f0> eVar) {
        a aVar;
        u uVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i10 = aVar.f25095b;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f25095b = i10 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        }
        Object obj = aVar.f25094a;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = aVar.f25095b;
        if (i11 == 0) {
            pg.q.b(obj);
            n nVar = this.f25092a;
            u uVar2 = new u(this.f25093b, gVar);
            try {
                aVar.f25097d = uVar2;
                aVar.f25095b = 1;
                if (nVar.b(uVar2, aVar) == aVar2) {
                    return aVar2;
                }
            } catch (th.a e10) {
                e = e10;
                uVar = uVar2;
                if (e.f28771a == uVar) {
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uVar = aVar.f25097d;
            try {
                pg.q.b(obj);
            } catch (th.a e11) {
                e = e11;
                if (e.f28771a == uVar) {
                    throw e;
                }
                v1.e(aVar.getContext());
                return pg.f0.f21461a;
            }
        }
        return pg.f0.f21461a;
    }
}
