package f3;

import java.util.Arrays;
import org.bouncycastle.asn1.cmc.BodyPartID;
import pg.f0;
import ph.e0;
import ph.w2;
import uh.b0;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8827a = 0;

    public static final String a(int i10, int i11, Object[] objArr, x0.j jVar) {
        return o.c(jVar).getQuantityString(i10, i11, Arrays.copyOf(objArr, objArr.length));
    }

    public static final void b(ph.m mVar, tg.e eVar, boolean z10) {
        Object obj = ph.m.f21564g.get(mVar);
        Throwable thD = mVar.d(obj);
        Object objA = thD != null ? pg.q.a(thD) : mVar.e(obj);
        if (!z10) {
            eVar.resumeWith(objA);
            return;
        }
        kotlin.jvm.internal.r.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        uh.f fVar = (uh.f) eVar;
        vg.c cVar = fVar.f29734e;
        Object obj2 = fVar.f29736g;
        tg.h context = cVar.getContext();
        Object objC = b0.c(context, obj2);
        w2<?> w2VarC = objC != b0.f29719a ? e0.c(cVar, context, objC) : null;
        try {
            cVar.resumeWith(objA);
            f0 f0Var = f0.f21461a;
            if (w2VarC == null || w2VarC.h0()) {
                b0.a(context, objC);
            }
        } catch (Throwable th2) {
            if (w2VarC == null || w2VarC.h0()) {
                b0.a(context, objC);
            }
            throw th2;
        }
    }

    public static final String c(int i10, x0.j jVar) {
        return o.c(jVar).getString(i10);
    }

    public static final String d(int i10, Object[] objArr, x0.j jVar) {
        return o.c(jVar).getString(i10, Arrays.copyOf(objArr, objArr.length));
    }

    public static final long e(long j10) {
        float f10 = (int) (j10 >> 32);
        float f11 = (int) (j10 & BodyPartID.bodyIdMax);
        return (Float.floatToRawIntBits(f11) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f10) << 32);
    }
}
