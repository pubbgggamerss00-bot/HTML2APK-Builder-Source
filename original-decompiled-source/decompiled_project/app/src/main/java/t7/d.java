package t7;

import hi.g;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.q;
import s7.s;

/* loaded from: classes.dex */
public final class d {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(s sVar, vg.c cVar) {
        c cVar2;
        s sVar2;
        Throwable th2;
        g gVar;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i10 = cVar2.f28077d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                cVar2.f28077d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                cVar2 = new c(cVar);
            }
        }
        Object obj = cVar2.f28076c;
        ug.a aVar = ug.a.f29706a;
        int i11 = cVar2.f28077d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = cVar2.f28075b;
            sVar2 = cVar2.f28074a;
            try {
                q.b(obj);
                ch.a.a(sVar2, null);
                return gVar;
            } catch (Throwable th3) {
                th2 = th3;
                try {
                    throw th2;
                } catch (Throwable th4) {
                    ch.a.a(sVar2, th2);
                    throw th4;
                }
            }
        }
        q.b(obj);
        try {
            g gVar2 = new g();
            cVar2.f28074a = sVar;
            cVar2.f28075b = gVar2;
            cVar2.f28077d = 1;
            if (sVar.h(gVar2) == aVar) {
                return aVar;
            }
            sVar2 = sVar;
            gVar = gVar2;
            ch.a.a(sVar2, null);
            return gVar;
        } catch (Throwable th5) {
            sVar2 = sVar;
            th2 = th5;
            throw th2;
        }
    }
}
