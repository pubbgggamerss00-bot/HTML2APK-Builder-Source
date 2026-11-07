package m0;

import i0.l4;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class s2 extends k<s2> {

    /* renamed from: h, reason: collision with root package name */
    public final y2.c0 f17508h;

    /* renamed from: i, reason: collision with root package name */
    public final l4 f17509i;

    public s2(y2.c0 c0Var, y2.v vVar, l4 l4Var, p3 p3Var) {
        super(c0Var.f33682a, c0Var.f33683b, l4Var != null ? l4Var.f13418a : null, vVar, p3Var);
        this.f17508h = c0Var;
        this.f17509i = l4Var;
    }

    public final List<y2.i> n(eh.l<? super s2, ? extends y2.i> lVar) {
        if (!t2.j0.b(this.f17383f)) {
            return qg.p.j(new y2.a("", 0), new y2.b0(t2.j0.e(this.f17383f), t2.j0.e(this.f17383f)));
        }
        y2.i iVarInvoke = lVar.invoke(this);
        if (iVarInvoke != null) {
            return c0.g0.c(iVarInvoke);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o(l4 l4Var, int i10) {
        p1.e eVarN;
        g2.v vVar = l4Var.f13419b;
        t2.h0 h0Var = l4Var.f13418a;
        if (vVar == null) {
            eVarN = p1.e.f21130e;
        } else {
            g2.v vVar2 = l4Var.f13420c;
            eVarN = vVar2 != null ? vVar2.N(vVar, true) : null;
            if (eVarN == null) {
            }
        }
        long j10 = this.f17508h.f33683b;
        int i11 = t2.j0.f27838c;
        int i12 = (int) (j10 & BodyPartID.bodyIdMax);
        y2.v vVar3 = this.f17381d;
        p1.e eVarC = h0Var.c(vVar3.b(i12));
        float f10 = eVarC.f21131a;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (eVarN.d() & BodyPartID.bodyIdMax)) * i10) + eVarC.f21132b;
        return vVar3.a(h0Var.f27820b.g((Float.floatToRawIntBits(fIntBitsToFloat) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f10) << 32)));
    }
}
