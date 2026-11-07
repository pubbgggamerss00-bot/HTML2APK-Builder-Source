package h9;

import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12806a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12807b;

    public /* synthetic */ t(Object obj, int i10) {
        this.f12806a = i10;
        this.f12807b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f12806a) {
            case 0:
                ((x0.l1) this.f12807b).f(((Integer) obj).intValue());
                break;
            case 1:
                q8.l1 l1Var = (q8.l1) this.f12807b;
                s1.e drawBehind = (s1.e) obj;
                kotlin.jvm.internal.r.e(drawBehind, "$this$drawBehind");
                long j10 = l1Var.f22292a;
                float fN0 = drawBehind.N0(4);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.i() & BodyPartID.bodyIdMax));
                s1.e.X0(drawBehind, j10, 0L, (BodyPartID.bodyIdMax & Float.floatToRawIntBits(fIntBitsToFloat)) | (Float.floatToRawIntBits(fN0) << 32), CropImageView.DEFAULT_ASPECT_RATIO, null, 122);
                break;
            default:
                x0.n1 n1Var = (x0.n1) this.f12807b;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                n1Var.setValue(bool);
                break;
        }
        return pg.f0.f21461a;
    }
}
