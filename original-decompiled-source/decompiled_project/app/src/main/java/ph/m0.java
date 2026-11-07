package ph;

import androidx.compose.foundation.ScrollingLayoutElement;
import org.bouncycastle.asn1.cmc.BodyPartID;
import x0.j;

/* loaded from: classes2.dex */
public final class m0 {
    public static final String a(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final long b(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) + ((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)) + ((int) (j11 & BodyPartID.bodyIdMax));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & BodyPartID.bodyIdMax);
    }

    public static final t.u1 c(x0.j jVar) {
        Object[] objArr = new Object[0];
        g1.n nVar = t.u1.f25375i;
        boolean zI = jVar.i(0);
        Object objG = jVar.g();
        if (zI || objG == j.a.f31715a) {
            objG = new t.r1(0);
            jVar.C(objG);
        }
        return (t.u1) b0.a0.d(objArr, nVar, (eh.a) objG, jVar, 0, 4);
    }

    public static final long d(long j10) {
        return (Math.round(Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax) | (Math.round(Float.intBitsToFloat((int) (j10 >> 32))) << 32);
    }

    public static androidx.compose.ui.d e(androidx.compose.ui.d dVar, t.u1 u1Var, boolean z10) {
        return androidx.compose.foundation.f.a(dVar, u1Var, z10 ? v.t0.f30083a : v.t0.f30084b, true, null, u1Var.f25378c, true, null, null).h(new ScrollingLayoutElement(u1Var, z10));
    }

    public static final String f(tg.e eVar) {
        Object objA;
        if (eVar instanceof uh.f) {
            return ((uh.f) eVar).toString();
        }
        try {
            objA = eVar + '@' + a(eVar);
        } catch (Throwable th2) {
            objA = pg.q.a(th2);
        }
        if (pg.p.a(objA) != null) {
            objA = eVar.getClass().getName() + '@' + a(eVar);
        }
        return (String) objA;
    }

    public static androidx.compose.ui.d g(androidx.compose.ui.d dVar, t.u1 u1Var) {
        return e(dVar, u1Var, true);
    }
}
