package s8;

import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;
import x8.g5;

/* loaded from: classes.dex */
public final /* synthetic */ class s1 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24732a;

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f24732a) {
            case 0:
                ((p5.w0) obj).f21297b = true;
                break;
            default:
                s1.e Canvas = (s1.e) obj;
                kotlin.jvm.internal.r.e(Canvas, "$this$Canvas");
                float fN0 = Canvas.N0(12);
                float f10 = 1.4142f * fN0;
                float f11 = -Float.intBitsToFloat((int) (Canvas.i() & BodyPartID.bodyIdMax));
                int i10 = 0;
                while (f11 < Float.intBitsToFloat((int) (Canvas.i() & BodyPartID.bodyIdMax)) + Float.intBitsToFloat((int) (Canvas.i() >> 32))) {
                    Canvas.k0(i10 % 2 == 0 ? g5.f32667c : g5.f32668d, (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.i() & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.i() & BodyPartID.bodyIdMax)) + f11) << 32) | (Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO) & BodyPartID.bodyIdMax), fN0, (496 & 16) != 0 ? 0 : 0);
                    f11 += f10;
                    i10++;
                }
                break;
        }
        return pg.f0.f21461a;
    }
}
