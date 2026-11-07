package m0;

import i0.l4;
import m0.d3;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class k3 extends kotlin.jvm.internal.s implements eh.a<p1.c> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x2 f17391a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<f3.p> f17392b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(x2 x2Var, x0.n1<f3.p> n1Var) {
        super(0);
        this.f17391a = x2Var;
        this.f17392b = n1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9  */
    @Override // eh.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p1.c invoke() {
        long jFloatToRawIntBits;
        long j10;
        l4 l4VarD;
        i0.i2 i2Var;
        t2.b bVar;
        long j11 = this.f17392b.getValue().f8826a;
        x2 x2Var = this.f17391a;
        p1.c cVarG = x2Var.g();
        if (cVarG != null) {
            long j12 = cVarG.f21129a;
            i0.i2 i2Var2 = x2Var.f17550d;
            t2.b bVar2 = i2Var2 != null ? i2Var2.f13337a.f13725a : null;
            if (bVar2 == null || bVar2.f27761b.length() == 0) {
                jFloatToRawIntBits = 9205357640488583168L;
            } else {
                i0.u1 u1Var = (i0.u1) x2Var.f17564r.getValue();
                int i10 = u1Var == null ? -1 : d3.d.f17293a[u1Var.ordinal()];
                if (i10 != -1) {
                    if (i10 == 1 || i10 == 2) {
                        long j13 = x2Var.k().f33683b;
                        int i11 = t2.j0.f27838c;
                        j10 = j13 >> 32;
                    } else {
                        if (i10 != 3) {
                            throw new pg.l();
                        }
                        long j14 = x2Var.k().f33683b;
                        int i12 = t2.j0.f27838c;
                        j10 = j14 & BodyPartID.bodyIdMax;
                    }
                    int i13 = (int) j10;
                    i0.i2 i2Var3 = x2Var.f17550d;
                    if (i2Var3 != null && (l4VarD = i2Var3.d()) != null && (i2Var = x2Var.f17550d) != null && (bVar = i2Var.f13337a.f13725a) != null) {
                        int iM = jh.j.m(x2Var.f17548b.b(i13), 0, bVar.f27761b.length());
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (l4VarD.d(j12) >> 32));
                        t2.h0 h0Var = l4VarD.f13418a;
                        t2.l lVar = h0Var.f27820b;
                        int iD = lVar.d(iM);
                        float fE = h0Var.e(iD);
                        float f10 = h0Var.f(iD);
                        float fL = jh.j.l(fIntBitsToFloat, Math.min(fE, f10), Math.max(fE, f10));
                        if (f3.p.b(j11, 0L) || Math.abs(fIntBitsToFloat - fL) <= ((int) (j11 >> 32)) / 2) {
                            float f11 = lVar.f(iD);
                            jFloatToRawIntBits = (Float.floatToRawIntBits(((lVar.b(iD) - f11) / 2) + f11) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fL) << 32);
                        }
                    }
                }
            }
        }
        return new p1.c(jFloatToRawIntBits);
    }
}
