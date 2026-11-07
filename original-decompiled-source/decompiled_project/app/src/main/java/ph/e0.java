package ph;

import tg.f;
import tg.h;

/* loaded from: classes2.dex */
public final class e0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [T, java.lang.Object] */
    public static final tg.h a(tg.h hVar, tg.h hVar2, final boolean z10) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) hVar.fold(bool, new b0())).booleanValue();
        boolean zBooleanValue2 = ((Boolean) hVar2.fold(bool, new b0())).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return hVar.plus(hVar2);
        }
        final kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        g0Var.f16327a = hVar2;
        eh.p pVar = new eh.p() { // from class: ph.c0
            /* JADX WARN: Type inference failed for: r1v5, types: [T, tg.h] */
            @Override // eh.p
            public final Object invoke(Object obj, Object obj2) {
                tg.h hVar3 = (tg.h) obj;
                h.a aVar = (h.a) obj2;
                if (!(aVar instanceof a0)) {
                    return hVar3.plus(aVar);
                }
                kotlin.jvm.internal.g0 g0Var2 = g0Var;
                if (((tg.h) g0Var2.f16327a).get(aVar.getKey()) != null) {
                    g0Var2.f16327a = ((tg.h) g0Var2.f16327a).minusKey(aVar.getKey());
                    return hVar3.plus(((a0) aVar).q0());
                }
                a0 a0VarZ = (a0) aVar;
                if (z10) {
                    a0VarZ = a0VarZ.Z();
                }
                return hVar3.plus(a0VarZ);
            }
        };
        tg.i iVar = tg.i.f28768a;
        tg.h hVar3 = (tg.h) hVar.fold(iVar, pVar);
        if (zBooleanValue2) {
            g0Var.f16327a = ((tg.h) g0Var.f16327a).fold(iVar, new d0());
        }
        return hVar3.plus((tg.h) g0Var.f16327a);
    }

    public static final tg.h b(i0 i0Var, tg.h hVar) {
        tg.h hVarA = a(i0Var.getCoroutineContext(), hVar, true);
        wh.c cVar = z0.f21632a;
        return (hVarA == cVar || hVarA.get(f.a.f28767a) != null) ? hVarA : hVarA.plus(cVar);
    }

    public static final w2<?> c(tg.e<?> eVar, tg.h hVar, Object obj) {
        w2<?> w2Var = null;
        if ((eVar instanceof vg.d) && hVar.get(x2.f21607a) != null) {
            vg.d callerFrame = (vg.d) eVar;
            while (true) {
                if ((callerFrame instanceof w0) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                    break;
                }
                if (callerFrame instanceof w2) {
                    w2Var = (w2) callerFrame;
                    break;
                }
            }
            if (w2Var != null) {
                w2Var.j0(hVar, obj);
            }
        }
        return w2Var;
    }
}
