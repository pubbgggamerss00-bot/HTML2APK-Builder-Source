package rh;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.f0;
import ph.s1;

/* loaded from: classes2.dex */
public final class s {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(u uVar, eh.a aVar, vg.c cVar) {
        q qVar;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i10 = qVar.f23634d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                qVar.f23634d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                qVar = new q(cVar);
            }
        }
        Object obj = qVar.f23633c;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = qVar.f23634d;
        try {
            if (i11 == 0) {
                pg.q.b(obj);
                if (qVar.getContext().get(s1.a.f21589a) != uVar) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                qVar.f23631a = uVar;
                qVar.f23632b = (kotlin.jvm.internal.s) aVar;
                qVar.f23634d = 1;
                ph.m mVar = new ph.m(1, ah.p.c(qVar));
                mVar.p();
                uVar.f(new r(mVar));
                aVar = aVar;
                if (mVar.o() == aVar2) {
                    return aVar2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eh.a aVar3 = (eh.a) qVar.f23632b;
                pg.q.b(obj);
                aVar = aVar3;
            }
            aVar.invoke();
            return f0.f21461a;
        } catch (Throwable th2) {
            aVar.invoke();
            throw th2;
        }
    }
}
