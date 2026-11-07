package i0;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class l4 {

    /* renamed from: a, reason: collision with root package name */
    public final t2.h0 f13418a;

    /* renamed from: b, reason: collision with root package name */
    public g2.v f13419b = null;

    /* renamed from: c, reason: collision with root package name */
    public g2.v f13420c;

    public l4(g2.v vVar, t2.h0 h0Var) {
        this.f13418a = h0Var;
        this.f13420c = vVar;
    }

    public final long a(long j10) {
        p1.e eVarN;
        g2.v vVar = this.f13419b;
        p1.e eVar = p1.e.f21130e;
        if (vVar != null) {
            if (vVar.m()) {
                g2.v vVar2 = this.f13420c;
                eVarN = vVar2 != null ? vVar2.N(vVar, true) : null;
            } else {
                eVarN = eVar;
            }
            if (eVarN != null) {
                eVar = eVarN;
            }
        }
        int i10 = (int) (j10 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        float fIntBitsToFloat2 = eVar.f21131a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i10);
            fIntBitsToFloat2 = eVar.f21133c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i10);
            }
        }
        int i11 = (int) (j10 & BodyPartID.bodyIdMax);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i11);
        float fIntBitsToFloat5 = eVar.f21132b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i11);
            fIntBitsToFloat5 = eVar.f21134d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i11);
            }
        }
        return (Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat5) & BodyPartID.bodyIdMax);
    }

    public final int b(long j10, boolean z10) {
        if (z10) {
            j10 = a(j10);
        }
        return this.f13418a.f27820b.g(d(j10));
    }

    public final boolean c(long j10) {
        long jD = d(a(j10));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & jD));
        t2.h0 h0Var = this.f13418a;
        int iE = h0Var.f27820b.e(fIntBitsToFloat);
        int i10 = (int) (jD >> 32);
        return Float.intBitsToFloat(i10) >= h0Var.e(iE) && Float.intBitsToFloat(i10) <= h0Var.f(iE);
    }

    public final long d(long j10) {
        g2.v vVar;
        g2.v vVar2 = this.f13419b;
        if (vVar2 == null) {
            return j10;
        }
        if (!vVar2.m()) {
            vVar2 = null;
        }
        if (vVar2 == null || (vVar = this.f13420c) == null) {
            return j10;
        }
        g2.v vVar3 = vVar.m() ? vVar : null;
        return vVar3 == null ? j10 : vVar2.L(vVar3, j10);
    }

    public final long e(long j10) {
        g2.v vVar;
        g2.v vVar2 = this.f13419b;
        if (vVar2 == null) {
            return j10;
        }
        if (!vVar2.m()) {
            vVar2 = null;
        }
        if (vVar2 == null || (vVar = this.f13420c) == null) {
            return j10;
        }
        g2.v vVar3 = vVar.m() ? vVar : null;
        return vVar3 == null ? j10 : vVar3.L(vVar2, j10);
    }
}
