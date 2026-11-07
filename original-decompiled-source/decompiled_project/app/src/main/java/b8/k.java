package b8;

import androidx.lifecycle.l;
import kotlin.jvm.internal.g0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.f0;

/* loaded from: classes.dex */
public final class k {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, androidx.lifecycle.s, b8.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(androidx.lifecycle.l lVar, vg.c cVar) throws Throwable {
        i iVar;
        androidx.lifecycle.l lVar2;
        g0 g0Var;
        Throwable th2;
        androidx.lifecycle.s sVar;
        androidx.lifecycle.s sVar2;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i10 = iVar.f3671d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                iVar.f3671d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                iVar = new i(cVar);
            }
        }
        Object obj = iVar.f3670c;
        ug.a aVar = ug.a.f29706a;
        int i11 = iVar.f3671d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g0Var = iVar.f3669b;
            lVar2 = iVar.f3668a;
            try {
                pg.q.b(obj);
                sVar2 = (androidx.lifecycle.s) g0Var.f16327a;
                if (sVar2 != null) {
                    lVar2.c(sVar2);
                }
                return f0.f21461a;
            } catch (Throwable th3) {
                th2 = th3;
                sVar = (androidx.lifecycle.s) g0Var.f16327a;
                if (sVar != null) {
                    lVar2.c(sVar);
                }
                throw th2;
            }
        }
        pg.q.b(obj);
        if (lVar.b().compareTo(l.b.f2322d) >= 0) {
            return f0.f21461a;
        }
        g0 g0Var2 = new g0();
        try {
            iVar.f3668a = lVar;
            iVar.f3669b = g0Var2;
            iVar.f3671d = 1;
            ph.m mVar = new ph.m(1, ah.p.c(iVar));
            mVar.p();
            ?? jVar = new j(mVar);
            g0Var2.f16327a = jVar;
            lVar.a(jVar);
            if (mVar.o() == aVar) {
                return aVar;
            }
            lVar2 = lVar;
            g0Var = g0Var2;
            sVar2 = (androidx.lifecycle.s) g0Var.f16327a;
            if (sVar2 != null) {
            }
            return f0.f21461a;
        } catch (Throwable th4) {
            lVar2 = lVar;
            g0Var = g0Var2;
            th2 = th4;
            sVar = (androidx.lifecycle.s) g0Var.f16327a;
            if (sVar != null) {
            }
            throw th2;
        }
    }
}
