package i0;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class l3 extends kotlin.jvm.internal.s implements eh.l<m0.s2, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public static final l3 f13417a = new l3(1);

    @Override // eh.l
    public final pg.f0 invoke(m0.s2 s2Var) {
        m0.s2 s2Var2 = s2Var;
        m0.p3 p3Var = s2Var2.f17382e;
        p3Var.f17457a = null;
        t2.b bVar = s2Var2.f17384g;
        String str = bVar.f27761b;
        String str2 = bVar.f27761b;
        if (str.length() > 0) {
            if (s2Var2.e()) {
                p3Var.f17457a = null;
                if (str2.length() > 0) {
                    long j10 = s2Var2.f17383f;
                    int i10 = t2.j0.f27838c;
                    int iB = v2.b((int) (j10 & BodyPartID.bodyIdMax), str2);
                    if (iB != -1) {
                        s2Var2.l(iB, iB);
                    }
                }
            } else {
                p3Var.f17457a = null;
                if (str2.length() > 0) {
                    long j11 = s2Var2.f17383f;
                    int i11 = t2.j0.f27838c;
                    int iA = v2.a((int) (j11 & BodyPartID.bodyIdMax), str2);
                    if (iA != -1) {
                        s2Var2.l(iA, iA);
                    }
                }
            }
        }
        return pg.f0.f21461a;
    }
}
