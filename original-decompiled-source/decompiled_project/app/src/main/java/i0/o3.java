package i0;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class o3 extends kotlin.jvm.internal.s implements eh.l<m0.s2, y2.i> {

    /* renamed from: a, reason: collision with root package name */
    public static final o3 f13474a = new o3(1);

    @Override // eh.l
    public final y2.i invoke(m0.s2 s2Var) {
        m0.s2 s2Var2 = s2Var;
        String str = s2Var2.f17384g.f27761b;
        long j10 = s2Var2.f17383f;
        int i10 = t2.j0.f27838c;
        int iA = v2.a((int) (j10 & BodyPartID.bodyIdMax), str);
        if (iA != -1) {
            return new y2.g(0, iA - ((int) (s2Var2.f17383f & BodyPartID.bodyIdMax)));
        }
        return null;
    }
}
