package androidx.compose.material3.internal;

import androidx.compose.ui.d;
import eh.p;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.f0;
import pg.q;
import ph.j0;
import t.b1;
import u0.a0;
import u0.l;
import u0.n;
import u0.o;
import v.t0;
import vg.c;
import vg.i;

/* loaded from: classes.dex */
public final class a {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(eh.a aVar, p pVar, c cVar) {
        o oVar;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i10 = oVar.f29087b;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                oVar.f29087b = i10 - PKIFailureInfo.systemUnavail;
            } else {
                oVar = new o(cVar);
            }
        }
        Object obj = oVar.f29086a;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = oVar.f29087b;
        try {
            if (i11 == 0) {
                q.b(obj);
                u0.p pVar2 = new u0.p(aVar, pVar, null);
                oVar.f29087b = 1;
                if (j0.c(pVar2, oVar) == aVar2) {
                    return aVar2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.b(obj);
            }
        } catch (l unused) {
        }
        return f0.f21461a;
    }

    public static final Object b(a0 a0Var, Object obj, float f10, i iVar) {
        Object objA = a0Var.a(obj, b1.f25167a, new n(a0Var, f10, null), iVar);
        return objA == ug.a.f29706a ? objA : f0.f21461a;
    }

    public static final d c(d dVar, a0 a0Var, p pVar) {
        t0 t0Var = t0.f30083a;
        return dVar.h(new DraggableAnchorsElement(a0Var, pVar));
    }
}
