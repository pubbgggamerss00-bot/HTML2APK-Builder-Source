package p1;

import c9.u1;
import i2.e0;
import i2.g;
import kotlin.jvm.internal.r;
import l9.i;
import org.bouncycastle.asn1.cmc.BodyPartID;
import ph.v1;
import x0.a2;
import x0.j;
import z.q1;

/* loaded from: classes.dex */
public final class d {
    public static final long a(float f10, float f11) {
        return (Float.floatToRawIntBits(f11) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static final void b(androidx.compose.ui.d dVar, j jVar) {
        int iD = jVar.D();
        androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVar, jVar);
        a2 a2VarY = jVar.y();
        i2.g.f13861o.getClass();
        e0.a aVar = g.a.f13863b;
        if (jVar.t() == null) {
            u1.d();
            throw null;
        }
        jVar.r();
        if (jVar.m()) {
            jVar.w(aVar);
        } else {
            jVar.z();
        }
        v1.j(g.a.f13867f, q1.f34616a, jVar);
        v1.j(g.a.f13866e, a2VarY, jVar);
        v1.j(g.a.f13865d, dVarC, jVar);
        g.a.C0128a c0128a = g.a.f13868g;
        if (jVar.m() || !r.a(jVar.g(), Integer.valueOf(iD))) {
            i.a(iD, jVar, iD, c0128a);
        }
        jVar.H();
    }

    public static final long c(long j10, long j11, float f10) {
        float fB = h3.b.b(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 >> 32)), f10);
        float fB2 = h3.b.b(Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (j11 & BodyPartID.bodyIdMax)), f10);
        return (Float.floatToRawIntBits(fB) << 32) | (Float.floatToRawIntBits(fB2) & BodyPartID.bodyIdMax);
    }
}
