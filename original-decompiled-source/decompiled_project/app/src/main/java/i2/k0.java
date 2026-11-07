package i2;

import java.util.Map;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class k0 extends a {
    @Override // i2.a
    public final long b(g1 g1Var, long j10) {
        o0 o0VarG1 = g1Var.g1();
        kotlin.jvm.internal.r.b(o0VarG1);
        long j11 = o0VarG1.f13969p;
        float f10 = (int) (j11 >> 32);
        float f11 = (int) (j11 & BodyPartID.bodyIdMax);
        return p1.c.g((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & BodyPartID.bodyIdMax), j10);
    }

    @Override // i2.a
    public final Map<g2.a, Integer> c(g1 g1Var) {
        o0 o0VarG1 = g1Var.g1();
        kotlin.jvm.internal.r.b(o0VarG1);
        return o0VarG1.v0().r();
    }

    @Override // i2.a
    public final int d(g1 g1Var, g2.a aVar) {
        o0 o0VarG1 = g1Var.g1();
        kotlin.jvm.internal.r.b(o0VarG1);
        return o0VarG1.Q(aVar);
    }
}
