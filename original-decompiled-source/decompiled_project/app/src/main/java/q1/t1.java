package q1;

import org.bouncycastle.asn1.cmc.BodyPartID;
import q1.s1;

/* loaded from: classes.dex */
public final class t1 {
    public static void a(s1.e eVar, s1 s1Var, long j10) {
        s1.h hVar = s1.h.f24186a;
        if (s1Var instanceof s1.b) {
            p1.e eVar2 = ((s1.b) s1Var).f21734a;
            float f10 = eVar2.f21131a;
            float f11 = eVar2.f21132b;
            eVar.A1(j10, (Float.floatToRawIntBits(f11) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f10) << 32), b(eVar2), 1.0f, hVar, null, 3);
            return;
        }
        if (!(s1Var instanceof s1.c)) {
            if (!(s1Var instanceof s1.a)) {
                throw new pg.l();
            }
            eVar.n0(((s1.a) s1Var).f21733a, j10, hVar, 3);
            return;
        }
        s1.c cVar = (s1.c) s1Var;
        j0 j0Var = cVar.f21736b;
        if (j0Var != null) {
            eVar.n0(j0Var, j10, hVar, 3);
            return;
        }
        p1.g gVar = cVar.f21735a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (gVar.f21142h >> 32));
        float f12 = gVar.f21135a;
        float f13 = gVar.f21136b;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f13) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f12) << 32);
        float fB = gVar.b();
        float fA = gVar.a();
        eVar.B1(j10, jFloatToRawIntBits, (Float.floatToRawIntBits(fB) << 32) | (Float.floatToRawIntBits(fA) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & BodyPartID.bodyIdMax), hVar, 1.0f);
    }

    public static final long b(p1.e eVar) {
        float f10 = eVar.f21133c - eVar.f21131a;
        float f11 = eVar.f21134d - eVar.f21132b;
        return (Float.floatToRawIntBits(f11) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f10) << 32);
    }
}
