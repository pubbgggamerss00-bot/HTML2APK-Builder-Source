package u6;

import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f29296a;

    static {
        String strF = t6.s.f("WorkerWrapper");
        kotlin.jvm.internal.r.d(strF, "tagWithPrefix(\"WorkerWrapper\")");
        f29296a = strF;
    }

    public static final Object a(qc.m mVar, androidx.work.c cVar, vg.i iVar) {
        V v10;
        try {
            if (!mVar.isDone()) {
                ph.m mVar2 = new ph.m(1, ah.p.c(iVar));
                mVar2.p();
                mVar.a(new z(mVar, mVar2), t6.h.f28020a);
                mVar2.s(new f1(cVar, mVar));
                Object objO = mVar2.o();
                ug.a aVar = ug.a.f29706a;
                return objO;
            }
            boolean z10 = false;
            while (true) {
                try {
                    v10 = mVar.get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            return v10;
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            kotlin.jvm.internal.r.b(cause);
            throw cause;
        }
    }
}
