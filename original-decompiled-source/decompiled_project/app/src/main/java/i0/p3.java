package i0;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class p3 extends kotlin.jvm.internal.s implements eh.l<m0.s2, y2.i> {

    /* renamed from: a, reason: collision with root package name */
    public static final p3 f13502a = new p3(1);

    @Override // eh.l
    public final y2.i invoke(m0.s2 s2Var) {
        m0.s2 s2Var2 = s2Var;
        Integer numD = s2Var2.d();
        if (numD == null) {
            return null;
        }
        int iIntValue = numD.intValue();
        long j10 = s2Var2.f17383f;
        int i10 = t2.j0.f27838c;
        return new y2.g(((int) (j10 & BodyPartID.bodyIdMax)) - iIntValue, 0);
    }
}
