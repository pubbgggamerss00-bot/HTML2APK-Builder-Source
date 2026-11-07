package z8;

import c2.n0;
import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;
import q1.b1;

/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements eh.l {
    @Override // eh.l
    public final Object invoke(Object obj) {
        s1.e Canvas = (s1.e) obj;
        kotlin.jvm.internal.r.e(Canvas, "$this$Canvas");
        float fN0 = Canvas.N0(7);
        float fC = p1.h.c(Canvas.i()) * 0.32f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.i() >> 32)) * 0.42f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.i() & BodyPartID.bodyIdMax)) * 0.42f;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        s1.e.f0(Canvas, b1.c(0.35f, b1.f21650d), fC, jFloatToRawIntBits, null, 0, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET);
        s1.e.f0(Canvas, n0.c(4281811281L), fC, jFloatToRawIntBits, new s1.i(fN0, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 30), 0, HeaderItem.DATA_SIZE_OFFSET);
        long jC = n0.c(4281811281L);
        float f10 = 0.62f * fC;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) + f10;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & BodyPartID.bodyIdMax)) + f10;
        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fIntBitsToFloat3) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat4) & BodyPartID.bodyIdMax);
        Canvas.B1(jC, (240 & 2) != 0 ? 0L : jFloatToRawIntBits2, (Float.floatToRawIntBits(1.4f * fN0) << 32) | (Float.floatToRawIntBits(fC * 0.9f) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(fN0) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fN0) << 32), (240 & 16) != 0 ? s1.h.f24186a : null, (240 & 32) != 0 ? 1.0f : CropImageView.DEFAULT_ASPECT_RATIO);
        return pg.f0.f21461a;
    }
}
