package sh;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import s4.n;

/* loaded from: classes2.dex */
public final class u implements g<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n.b f25100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f25101b;

    @vg.e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", f = "Limit.kt", l = {132, 133}, m = "emit")
    public static final class a extends vg.c {

        /* renamed from: a, reason: collision with root package name */
        public u f25102a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f25103b;

        /* renamed from: c, reason: collision with root package name */
        public int f25104c;

        /* renamed from: e, reason: collision with root package name */
        public Object f25106e;

        public a(tg.e eVar) {
            super(eVar);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            this.f25103b = obj;
            this.f25104c |= PKIFailureInfo.systemUnavail;
            return u.this.c(null, this);
        }
    }

    public u(n.b bVar, g gVar) {
        this.f25100a = bVar;
        this.f25101b = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (r2.c(r9, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // sh.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, tg.e<? super pg.f0> eVar) {
        a aVar;
        Object obj2;
        Object obj3;
        u uVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i10 = aVar.f25104c;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f25104c = i10 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        }
        Object obj4 = aVar.f25103b;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = aVar.f25104c;
        boolean z10 = true;
        if (i11 == 0) {
            pg.q.b(obj4);
            aVar.f25102a = this;
            aVar.f25106e = obj;
            aVar.f25104c = 1;
            Object objInvoke = this.f25100a.invoke(obj, aVar);
            if (objInvoke != aVar2) {
                obj2 = objInvoke;
                obj3 = obj;
                uVar = this;
            }
            return aVar2;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uVar = aVar.f25102a;
            pg.q.b(obj4);
            if (z10) {
                throw new th.a(uVar);
            }
            return pg.f0.f21461a;
        }
        Object obj5 = aVar.f25106e;
        u uVar2 = aVar.f25102a;
        pg.q.b(obj4);
        obj3 = obj5;
        uVar = uVar2;
        obj2 = obj4;
        if (((Boolean) obj2).booleanValue()) {
            g gVar = uVar.f25101b;
            aVar.f25102a = uVar;
            aVar.f25106e = null;
            aVar.f25104c = 2;
        } else {
            z10 = false;
        }
        if (z10) {
        }
    }
}
