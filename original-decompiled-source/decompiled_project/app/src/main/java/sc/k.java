package sc;

import ed.e0;
import ed.g0;
import ed.i0;
import ed.o0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Iterator;
import zc.w;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final i0.a f24813a;

    public k(i0.a aVar) {
        this.f24813a = aVar;
    }

    @Deprecated
    public final synchronized void a(g0 g0Var) throws GeneralSecurityException {
        i0.b bVarB;
        synchronized (this) {
            bVarB = b(r.d(g0Var), g0Var.A());
        }
        i0.a aVar = this.f24813a;
        aVar.e();
        i0.x((i0) aVar.f6808b, bVarB);
    }

    public final synchronized i0.b b(e0 e0Var, o0 o0Var) throws GeneralSecurityException {
        int iA;
        synchronized (this) {
            iA = w.a();
            while (d(iA)) {
                iA = w.a();
            }
        }
        return aVarF.b();
        if (o0Var == o0.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        i0.b.a aVarF = i0.b.F();
        aVarF.e();
        i0.b.w((i0.b) aVarF.f6808b, e0Var);
        aVarF.e();
        i0.b.z((i0.b) aVarF.f6808b, iA);
        aVarF.e();
        i0.b.y((i0.b) aVarF.f6808b);
        aVarF.e();
        i0.b.x((i0.b) aVarF.f6808b, o0Var);
        return aVarF.b();
    }

    public final synchronized j c() throws GeneralSecurityException {
        return j.a(this.f24813a.b());
    }

    public final synchronized boolean d(int i10) {
        Iterator it = Collections.unmodifiableList(((i0) this.f24813a.f6808b).A()).iterator();
        while (it.hasNext()) {
            if (((i0.b) it.next()).B() == i10) {
                return true;
            }
        }
        return false;
    }
}
