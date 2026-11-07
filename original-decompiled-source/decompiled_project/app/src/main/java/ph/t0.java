package ph;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import tg.f;
import tg.h;

/* loaded from: classes2.dex */
public final class t0 {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(vg.c cVar) {
        s0 s0Var;
        if (cVar instanceof s0) {
            s0Var = (s0) cVar;
            int i10 = s0Var.f21588b;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                s0Var.f21588b = i10 - PKIFailureInfo.systemUnavail;
            } else {
                s0Var = new s0(cVar);
            }
        }
        Object obj = s0Var.f21587a;
        ug.a aVar = ug.a.f29706a;
        int i11 = s0Var.f21588b;
        if (i11 == 0) {
            pg.q.b(obj);
            s0Var.f21588b = 1;
            m mVar = new m(1, ah.p.c(s0Var));
            mVar.p();
            if (mVar.o() == aVar) {
                return;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        throw new pg.g();
    }

    public static final Object b(long j10, tg.e<? super pg.f0> eVar) throws Throwable {
        if (j10 <= 0) {
            return pg.f0.f21461a;
        }
        m mVar = new m(1, ah.p.c(eVar));
        mVar.p();
        if (j10 < Long.MAX_VALUE) {
            c(mVar.f21567e).i0(j10, mVar);
        }
        Object objO = mVar.o();
        return objO == ug.a.f29706a ? objO : pg.f0.f21461a;
    }

    public static final r0 c(tg.h hVar) {
        h.a aVar = hVar.get(f.a.f28767a);
        r0 r0Var = aVar instanceof r0 ? (r0) aVar : null;
        return r0Var == null ? o0.f21572a : r0Var;
    }
}
