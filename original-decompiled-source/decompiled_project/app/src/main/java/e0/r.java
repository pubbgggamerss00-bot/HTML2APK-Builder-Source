package e0;

import com.yalantis.ucrop.view.CropImageView;
import t0.u8;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.s implements eh.q<Float, Float, Float, Float> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f8275a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f3.r f8276b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(b bVar, f3.r rVar) {
        super(3);
        this.f8275a = bVar;
        this.f8276b = rVar;
    }

    @Override // eh.q
    public final Float b(Float f10, Float f11, Float f12) {
        float fFloatValue = f10.floatValue();
        float fFloatValue2 = f11.floatValue();
        float fFloatValue3 = f12.floatValue();
        b bVar = this.f8275a;
        boolean zB = u8.b(bVar, fFloatValue);
        if (bVar.l().getOrientation() != v.t0.f30083a) {
            if (this.f8276b != f3.r.f8828a) {
                zB = !zB;
            }
        }
        int iG = bVar.l().g();
        float fA = iG == 0 ? 0.0f : u8.a(bVar) / iG;
        float f13 = fA - ((int) fA);
        char c10 = Math.abs(fFloatValue) >= bVar.f8159q.N0(w.m.f31029a) ? fFloatValue > CropImageView.DEFAULT_ASPECT_RATIO ? (char) 1 : (char) 2 : (char) 0;
        if (c10 == 0) {
            fFloatValue2 = Math.abs(f13) > 0.5f ? fFloatValue3 : fFloatValue3;
        } else if (c10 != 1) {
            if (c10 != 2) {
                fFloatValue2 = 0.0f;
            }
        }
        return Float.valueOf(fFloatValue2);
    }
}
