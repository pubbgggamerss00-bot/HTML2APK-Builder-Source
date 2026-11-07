package sh;

import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
public final /* synthetic */ class i {

    @vg.e(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {32, 33}, m = "emitAllImpl$FlowKt__ChannelsKt")
    public static final class a<T> extends vg.c {

        /* renamed from: a, reason: collision with root package name */
        public g f24987a;

        /* renamed from: b, reason: collision with root package name */
        public rh.w f24988b;

        /* renamed from: c, reason: collision with root package name */
        public rh.j f24989c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f24990d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f24991e;

        /* renamed from: f, reason: collision with root package name */
        public int f24992f;

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            this.f24991e = obj;
            this.f24992f |= PKIFailureInfo.systemUnavail;
            return i.a(null, null, false, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if (r10 == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x002f, B:25:0x0056, B:29:0x006b, B:31:0x0073, B:20:0x0047, B:24:0x0052), top: B:52:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [sh.g] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0085 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object a(g<? super T> gVar, rh.w<? extends T> wVar, boolean z10, tg.e<? super pg.f0> eVar) throws Throwable {
        a aVar;
        rh.j<? extends T> it;
        rh.j<? extends T> jVar;
        ?? r22;
        Object objA;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i10 = aVar.f24992f;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f24992f = i10 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        }
        Object obj = aVar.f24991e;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = aVar.f24992f;
        CancellationException cancellationException = null;
        try {
            if (i11 == 0) {
                pg.q.b(obj);
                if (gVar instanceof d1) {
                    throw ((d1) gVar).f24967a;
                }
                it = wVar.iterator();
                aVar.f24987a = gVar;
                aVar.f24988b = wVar;
                aVar.f24989c = it;
                aVar.f24990d = z10;
                aVar.f24992f = 1;
                objA = it.a(aVar);
                if (objA != aVar2) {
                }
            } else if (i11 == 1) {
                z10 = aVar.f24990d;
                jVar = aVar.f24989c;
                wVar = aVar.f24988b;
                g gVar2 = aVar.f24987a;
                pg.q.b(obj);
                r22 = gVar2;
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z10 = aVar.f24990d;
                jVar = aVar.f24989c;
                wVar = aVar.f24988b;
                g<? super T> gVar3 = aVar.f24987a;
                pg.q.b(obj);
                g<? super T> gVar4 = gVar3;
                it = jVar;
                gVar = gVar4;
                aVar.f24987a = gVar;
                aVar.f24988b = wVar;
                aVar.f24989c = it;
                aVar.f24990d = z10;
                aVar.f24992f = 1;
                objA = it.a(aVar);
                if (objA != aVar2) {
                    return aVar2;
                }
                r22 = gVar;
                jVar = it;
                obj = objA;
                if (((Boolean) obj).booleanValue()) {
                    if (z10) {
                        wVar.cancel(null);
                    }
                    return pg.f0.f21461a;
                }
                T next = jVar.next();
                aVar.f24987a = r22;
                aVar.f24988b = wVar;
                aVar.f24989c = jVar;
                aVar.f24990d = z10;
                aVar.f24992f = 2;
                Object objC = r22.c(next, aVar);
                gVar4 = r22;
            }
        } finally {
        }
    }
}
