package i0;

import e3.l;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class g1 extends kotlin.jvm.internal.s implements eh.l<s1.e, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i2 f13291a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y2.c0 f13292b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y2.v f13293c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(i2 i2Var, y2.c0 c0Var, y2.v vVar) {
        super(1);
        this.f13291a = i2Var;
        this.f13292b = c0Var;
        this.f13293c = vVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.l
    public final pg.f0 invoke(s1.e eVar) {
        s1.e eVar2 = eVar;
        i2 i2Var = this.f13291a;
        l4 l4VarD = i2Var.d();
        if (l4VarD != null) {
            q1.w0 w0VarA = eVar2.Q0().a();
            long j10 = ((t2.j0) i2Var.f13362z.getValue()).f27839a;
            long j11 = ((t2.j0) i2Var.A.getValue()).f27839a;
            t2.h0 h0Var = l4VarD.f13418a;
            t2.l lVar = h0Var.f27820b;
            t2.g0 g0Var = h0Var.f27819a;
            q1.h0 h0Var2 = i2Var.f13360x;
            long j12 = i2Var.f13361y;
            boolean zB = t2.j0.b(j10);
            y2.v vVar = this.f13293c;
            if (!zB) {
                h0Var2.i(j12);
                int iB = vVar.b(t2.j0.e(j10));
                int iB2 = vVar.b(t2.j0.d(j10));
                if (iB != iB2) {
                    w0VarA.k(h0Var.i(iB, iB2), h0Var2);
                }
            } else if (t2.j0.b(j11)) {
                y2.c0 c0Var = this.f13292b;
                if (!t2.j0.b(c0Var.f33683b)) {
                    h0Var2.i(j12);
                    long j13 = c0Var.f33683b;
                    int iB3 = vVar.b(t2.j0.e(j13));
                    int iB4 = vVar.b(t2.j0.d(j13));
                    if (iB3 != iB4) {
                        w0VarA.k(h0Var.i(iB3, iB4), h0Var2);
                    }
                }
            } else {
                long jB = g0Var.f27810b.b();
                q1.b1 b1Var = new q1.b1(jB);
                if (jB == 16) {
                    b1Var = null;
                }
                long j14 = b1Var != null ? b1Var.f21656a : q1.b1.f21648b;
                h0Var2.i(q1.b1.c(q1.b1.e(j14) * 0.2f, j14));
                int iB5 = vVar.b(t2.j0.e(j11));
                int iB6 = vVar.b(t2.j0.d(j11));
                if (iB5 != iB6) {
                    w0VarA.k(h0Var.i(iB5, iB6), h0Var2);
                }
            }
            boolean z10 = h0Var.d() && g0Var.f27814f != 3;
            if (z10) {
                float f10 = (int) (h0Var.f27821c >> 32);
                p1.e eVarA = p1.f.a(0L, (Float.floatToRawIntBits((int) (r4 & BodyPartID.bodyIdMax)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f10) << 32));
                w0VarA.d();
                w0VarA.h(eVarA);
            }
            t2.b0 b0Var = g0Var.f27810b.f27852a;
            e3.i iVar = b0Var.f27787m;
            e3.l lVar2 = b0Var.f27775a;
            if (iVar == null) {
                iVar = e3.i.f8364b;
            }
            e3.i iVar2 = iVar;
            q1.e2 e2Var = b0Var.f27788n;
            if (e2Var == null) {
                e2Var = q1.e2.f21687d;
            }
            q1.e2 e2Var2 = e2Var;
            s1.f fVar = b0Var.f27790p;
            if (fVar == null) {
                fVar = s1.h.f24186a;
            }
            s1.f fVar2 = fVar;
            try {
                q1.u0 u0VarL = lVar2.l();
                l.a aVar = l.a.f8369a;
                if (u0VarL != null) {
                    t2.l.j(lVar, w0VarA, u0VarL, lVar2 != aVar ? lVar2.i() : 1.0f, e2Var2, iVar2, fVar2);
                } else {
                    t2.l.i(lVar, w0VarA, lVar2 != aVar ? lVar2.j() : q1.b1.f21648b, e2Var2, iVar2, fVar2);
                }
                if (z10) {
                    w0VarA.o();
                }
            } finally {
            }
        }
        return pg.f0.f21461a;
    }
}
