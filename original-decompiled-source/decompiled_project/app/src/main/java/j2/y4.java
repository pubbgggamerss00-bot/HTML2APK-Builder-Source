package j2;

import android.graphics.Path;
import android.graphics.RectF;
import org.bouncycastle.asn1.cmc.BodyPartID;
import q1.s1;
import q1.u1;

/* loaded from: classes.dex */
public final class y4 {
    public static final boolean a(q1.s1 s1Var, float f10, float f11) {
        if (s1Var instanceof s1.b) {
            p1.e eVar = ((s1.b) s1Var).f21734a;
            return eVar.f21131a <= f10 && f10 < eVar.f21133c && eVar.f21132b <= f11 && f11 < eVar.f21134d;
        }
        if (!(s1Var instanceof s1.c)) {
            if (s1Var instanceof s1.a) {
                return b(((s1.a) s1Var).f21733a, f10, f11);
            }
            throw new pg.l();
        }
        p1.g gVar = ((s1.c) s1Var).f21735a;
        float f12 = gVar.f21135a;
        long j10 = gVar.f21140f;
        long j11 = gVar.f21142h;
        long j12 = gVar.f21141g;
        float f13 = gVar.f21138d;
        float f14 = gVar.f21136b;
        float f15 = gVar.f21137c;
        long j13 = gVar.f21139e;
        if (f10 < f12 || f10 >= f15 || f11 < f14 || f11 >= f13) {
            return false;
        }
        int i10 = (int) (j13 >> 32);
        int i11 = (int) (j10 >> 32);
        if (Float.intBitsToFloat(i11) + Float.intBitsToFloat(i10) <= gVar.b()) {
            int i12 = (int) (j11 >> 32);
            int i13 = (int) (j12 >> 32);
            if (Float.intBitsToFloat(i13) + Float.intBitsToFloat(i12) <= gVar.b()) {
                int i14 = (int) (j13 & BodyPartID.bodyIdMax);
                float fIntBitsToFloat = Float.intBitsToFloat(i14);
                int i15 = (int) (j11 & BodyPartID.bodyIdMax);
                if (Float.intBitsToFloat(i15) + fIntBitsToFloat <= gVar.a()) {
                    int i16 = (int) (j10 & BodyPartID.bodyIdMax);
                    float fIntBitsToFloat2 = Float.intBitsToFloat(i16);
                    int i17 = (int) (j12 & BodyPartID.bodyIdMax);
                    if (Float.intBitsToFloat(i17) + fIntBitsToFloat2 <= gVar.a()) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i10) + f12;
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i14) + f14;
                        float fIntBitsToFloat5 = f15 - Float.intBitsToFloat(i11);
                        float fIntBitsToFloat6 = Float.intBitsToFloat(i16) + f14;
                        float fIntBitsToFloat7 = f15 - Float.intBitsToFloat(i13);
                        float fIntBitsToFloat8 = f13 - Float.intBitsToFloat(i17);
                        float fIntBitsToFloat9 = f13 - Float.intBitsToFloat(i15);
                        float fIntBitsToFloat10 = Float.intBitsToFloat(i12) + f12;
                        if (f10 < fIntBitsToFloat3 && f11 < fIntBitsToFloat4) {
                            return c(f10, f11, fIntBitsToFloat3, fIntBitsToFloat4, gVar.f21139e);
                        }
                        if (f10 < fIntBitsToFloat10 && f11 > fIntBitsToFloat9) {
                            return c(f10, f11, fIntBitsToFloat10, fIntBitsToFloat9, gVar.f21142h);
                        }
                        if (f10 > fIntBitsToFloat5 && f11 < fIntBitsToFloat6) {
                            return c(f10, f11, fIntBitsToFloat5, fIntBitsToFloat6, gVar.f21140f);
                        }
                        if (f10 <= fIntBitsToFloat7 || f11 <= fIntBitsToFloat8) {
                            return true;
                        }
                        return c(f10, f11, fIntBitsToFloat7, fIntBitsToFloat8, gVar.f21141g);
                    }
                }
            }
        }
        q1.j0 j0VarA = q1.l0.a();
        q1.u1.f(j0VarA, gVar);
        return b(j0VarA, f10, f11);
    }

    public static final boolean b(q1.u1 u1Var, float f10, float f11) {
        float f12 = f10 - 0.005f;
        float f13 = f11 - 0.005f;
        float f14 = f10 + 0.005f;
        float f15 = f11 + 0.005f;
        q1.j0 j0VarA = q1.l0.a();
        u1.a aVar = u1.a.f21740a;
        u1.a aVar2 = u1.a.f21740a;
        if (Float.isNaN(f12) || Float.isNaN(f13) || Float.isNaN(f14) || Float.isNaN(f15)) {
            q1.l0.c("Invalid rectangle, make sure no value is NaN");
        }
        if (j0VarA.f21713b == null) {
            j0VarA.f21713b = new RectF();
        }
        RectF rectF = j0VarA.f21713b;
        kotlin.jvm.internal.r.b(rectF);
        rectF.set(f12, f13, f14, f15);
        Path path = j0VarA.f21712a;
        RectF rectF2 = j0VarA.f21713b;
        kotlin.jvm.internal.r.b(rectF2);
        path.addRect(rectF2, q1.l0.b(aVar2));
        q1.j0 j0VarA2 = q1.l0.a();
        j0VarA2.q(u1Var, j0VarA, 1);
        boolean zIsEmpty = j0VarA2.f21712a.isEmpty();
        j0VarA2.reset();
        j0VarA.reset();
        return !zIsEmpty;
    }

    public static final boolean c(float f10, float f11, float f12, float f13, long j10) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax));
        return ((f15 * f15) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f14 * f14) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }
}
