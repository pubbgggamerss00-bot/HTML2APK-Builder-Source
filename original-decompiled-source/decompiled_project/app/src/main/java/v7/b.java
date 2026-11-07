package v7;

import java.io.Closeable;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealCall;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.q;
import ph.m;
import s7.i;
import s7.k;
import s7.l;
import s7.p;
import s7.r;

/* loaded from: classes.dex */
public final class b implements i {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f30656a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v7, types: [eh.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object b(OkHttpClient okHttpClient, p pVar, l lVar, vg.c cVar) throws Throwable {
        a aVar;
        l lVar2;
        eh.p pVar2;
        Closeable closeable;
        Throwable th2;
        Closeable closeable2;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i10 = aVar.f30655d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f30655d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(cVar);
            }
        }
        Object objB = aVar.f30654c;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = aVar.f30655d;
        if (i11 == 0) {
            q.b(objB);
            aVar.f30652a = lVar;
            aVar.f30653b = okHttpClient;
            aVar.f30655d = 1;
            objB = g.b(pVar, aVar);
            lVar2 = lVar;
            if (objB != aVar2) {
            }
            return aVar2;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable2 = (Closeable) aVar.f30652a;
                try {
                    q.b(objB);
                    ah.c.a(closeable2, null);
                    return objB;
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        throw th2;
                    } catch (Throwable th4) {
                        ah.c.a(closeable2, th2);
                        throw th4;
                    }
                }
            }
            pVar2 = (eh.p) aVar.f30652a;
            q.b(objB);
            closeable = (Closeable) objB;
            try {
                r rVarA = g.a((Response) closeable);
                aVar.f30652a = closeable;
                aVar.f30655d = 3;
                objB = pVar2.invoke(rVarA, aVar);
                if (objB != aVar2) {
                    closeable2 = closeable;
                    ah.c.a(closeable2, null);
                    return objB;
                }
                return aVar2;
            } catch (Throwable th5) {
                th2 = th5;
                closeable2 = closeable;
                throw th2;
            }
        }
        okHttpClient = aVar.f30653b;
        ?? r10 = (eh.p) aVar.f30652a;
        q.b(objB);
        lVar2 = r10;
        RealCall realCallA = okHttpClient.a((Request) objB);
        aVar.f30652a = lVar2;
        aVar.f30653b = null;
        aVar.f30655d = 2;
        m mVar = new m(1, ah.p.c(aVar));
        mVar.p();
        c cVar2 = new c(realCallA, mVar);
        realCallA.d(cVar2);
        mVar.s(cVar2);
        objB = mVar.o();
        if (objB != aVar2) {
            pVar2 = lVar2;
            closeable = (Closeable) objB;
            r rVarA2 = g.a((Response) closeable);
            aVar.f30652a = closeable;
            aVar.f30655d = 3;
            objB = pVar2.invoke(rVarA2, aVar);
            if (objB != aVar2) {
            }
        }
        return aVar2;
    }

    @Override // s7.i
    public final Object a(p pVar, l lVar, k.b bVar) {
        return b(this.f30656a, pVar, lVar, bVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f30656a.equals(((b) obj).f30656a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30656a.hashCode();
    }

    public final String toString() {
        return "CallFactoryNetworkClient(callFactory=" + this.f30656a + ')';
    }
}
