package s1;

import f3.r;
import org.bouncycastle.asn1.cmc.BodyPartID;
import q1.c1;
import q1.i2;
import q1.n1;
import q1.p0;
import q1.u0;
import q1.u1;
import q1.w1;
import s1.a;

/* loaded from: classes.dex */
public interface e extends f3.d {
    static long D0(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)) - Float.intBitsToFloat((int) (j11 & BodyPartID.bodyIdMax));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & BodyPartID.bodyIdMax);
    }

    static /* synthetic */ void P0(e eVar, u1 u1Var, long j10, i iVar, int i10, int i11) {
        f fVar = iVar;
        if ((i11 & 8) != 0) {
            fVar = h.f24186a;
        }
        f fVar2 = fVar;
        if ((i11 & 32) != 0) {
            i10 = 3;
        }
        eVar.n0(u1Var, j10, fVar2, i10);
    }

    static /* synthetic */ void W(e eVar, u1 u1Var, u0 u0Var, float f10, i iVar, int i10) {
        if ((i10 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        f fVar = iVar;
        if ((i10 & 8) != 0) {
            fVar = h.f24186a;
        }
        eVar.H0(u1Var, u0Var, f11, fVar, (i10 & 32) != 0 ? 3 : 0);
    }

    static /* synthetic */ void X0(e eVar, long j10, long j11, long j12, float f10, c1 c1Var, int i10) {
        long j13 = (i10 & 2) != 0 ? 0L : j11;
        eVar.A1(j10, j13, (i10 & 4) != 0 ? D0(eVar.i(), j13) : j12, (i10 & 8) != 0 ? 1.0f : f10, h.f24186a, (i10 & 32) != 0 ? null : c1Var, (i10 & 64) != 0 ? 3 : 0);
    }

    static /* synthetic */ void a1(c cVar, u0 u0Var, long j10, long j11, long j12, f fVar, int i10) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        long j13 = j10;
        cVar.h0(u0Var, j13, (i10 & 4) != 0 ? D0(cVar.i(), j13) : j11, j12, 1.0f, (i10 & 32) != 0 ? h.f24186a : fVar);
    }

    static /* synthetic */ void d0(e eVar, u0 u0Var, long j10, long j11, float f10, f fVar, int i10) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            j11 = D0(eVar.i(), j12);
        }
        eVar.c0(u0Var, j12, j11, (i10 & 8) != 0 ? 1.0f : f10, (i10 & 16) != 0 ? h.f24186a : fVar);
    }

    static void e1(e eVar, n1 n1Var, long j10, long j11, long j12, long j13, float f10, f fVar, c1 c1Var, int i10, int i11, int i12) {
        long height;
        long j14 = (i12 & 2) != 0 ? 0L : j10;
        if ((i12 & 4) != 0) {
            height = (n1Var.getHeight() & BodyPartID.bodyIdMax) | (n1Var.a() << 32);
        } else {
            height = j11;
        }
        eVar.y0(n1Var, j14, height, (i12 & 8) != 0 ? 0L : j12, (i12 & 16) != 0 ? height : j13, (i12 & 32) != 0 ? 1.0f : f10, (i12 & 64) != 0 ? h.f24186a : fVar, (i12 & 128) != 0 ? null : c1Var, (i12 & 256) != 0 ? 3 : i10, (i12 & 512) != 0 ? 1 : i11);
    }

    static /* synthetic */ void f0(e eVar, long j10, float f10, long j11, f fVar, int i10, int i11) {
        if ((i11 & 4) != 0) {
            j11 = eVar.h1();
        }
        eVar.o1(j10, f10, j11, (i11 & 16) != 0 ? h.f24186a : fVar, (i11 & 64) != 0 ? 3 : i10);
    }

    void A1(long j10, long j11, long j12, float f10, f fVar, c1 c1Var, int i10);

    void B1(long j10, long j11, long j12, long j13, f fVar, float f10);

    void D1(n1 n1Var, f fVar, p0 p0Var);

    void H0(u1 u1Var, u0 u0Var, float f10, f fVar, int i10);

    a.b Q0();

    void S0(long j10, float f10, float f11, long j11, long j12, f fVar);

    void c0(u0 u0Var, long j10, long j11, float f10, f fVar);

    r getLayoutDirection();

    void h0(u0 u0Var, long j10, long j11, long j12, float f10, f fVar);

    default long h1() {
        return d0.h.d(Q0().d());
    }

    default long i() {
        return Q0().d();
    }

    void j1(i2 i2Var, long j10, long j11, float f10, float f11);

    void k0(long j10, long j11, long j12, float f10, int i10);

    void n0(u1 u1Var, long j10, f fVar, int i10);

    void o1(long j10, float f10, long j11, f fVar, int i10);

    void x0(w1 w1Var, float f10, long j10, f fVar);

    default void y0(n1 n1Var, long j10, long j11, long j12, long j13, float f10, f fVar, c1 c1Var, int i10, int i11) {
        e1(this, n1Var, j10, j11, j12, j13, f10, fVar, c1Var, i10, 0, 512);
    }
}
