package q8;

import org.bouncycastle.asn1.cmc.BodyPartID;
import q1.s1;

/* loaded from: classes.dex */
public final class y1 implements q1.f2 {

    /* renamed from: a, reason: collision with root package name */
    public final p1.e f22499a;

    /* renamed from: b, reason: collision with root package name */
    public final float f22500b;

    public y1(p1.e eVar, float f10) {
        this.f22499a = eVar;
        this.f22500b = f10;
    }

    @Override // q1.f2
    public final q1.s1 a(long j10, f3.r layoutDirection, f3.d density) {
        kotlin.jvm.internal.r.e(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.r.e(density, "density");
        float f10 = this.f22500b;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f10) & BodyPartID.bodyIdMax);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & BodyPartID.bodyIdMax));
        p1.e eVar = this.f22499a;
        float f11 = eVar.f21131a;
        float f12 = eVar.f21132b;
        float f13 = eVar.f21133c;
        float f14 = eVar.f21134d;
        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & BodyPartID.bodyIdMax);
        return new s1.c(new p1.g(f11, f12, f13, f14, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits2));
    }
}
