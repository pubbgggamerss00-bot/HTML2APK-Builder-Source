package m0;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class m2 extends kotlin.jvm.internal.s implements eh.p<x, x, Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g2.v f17420a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(g2.v vVar) {
        super(2);
        this.f17420a = vVar;
    }

    @Override // eh.p
    public final Integer invoke(x xVar, x xVar2) {
        g2.v vVarI = xVar.i();
        g2.v vVarI2 = xVar2.i();
        g2.v vVar = this.f17420a;
        long jL = vVarI != null ? vVar.L(vVarI, 0L) : 0L;
        long jL2 = vVarI2 != null ? vVar.L(vVarI2, 0L) : 0L;
        int i10 = (int) (jL & BodyPartID.bodyIdMax);
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        int i11 = (int) (BodyPartID.bodyIdMax & jL2);
        return Integer.valueOf(fIntBitsToFloat == Float.intBitsToFloat(i11) ? i0.x1.b(Float.valueOf(Float.intBitsToFloat((int) (jL >> 32))), Float.valueOf(Float.intBitsToFloat((int) (jL2 >> 32)))) : i0.x1.b(Float.valueOf(Float.intBitsToFloat(i10)), Float.valueOf(Float.intBitsToFloat(i11))));
    }
}
