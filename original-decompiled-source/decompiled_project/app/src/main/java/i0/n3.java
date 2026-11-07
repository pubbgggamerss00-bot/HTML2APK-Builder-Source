package i0;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class n3 extends kotlin.jvm.internal.s implements eh.l<m0.s2, y2.i> {

    /* renamed from: a, reason: collision with root package name */
    public static final n3 f13447a = new n3(1);

    @Override // eh.l
    public final y2.i invoke(m0.s2 s2Var) {
        m0.s2 s2Var2 = s2Var;
        long j10 = s2Var2.f17383f;
        int i10 = t2.j0.f27838c;
        return new y2.g(((int) (j10 & BodyPartID.bodyIdMax)) - v2.b((int) (j10 & BodyPartID.bodyIdMax), s2Var2.f17384g.f27761b), 0);
    }
}
