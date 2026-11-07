package u0;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.s implements eh.a<Float> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0<Object> f29180a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a0<Object> a0Var) {
        super(0);
        this.f29180a = a0Var;
    }

    @Override // eh.a
    public final Float invoke() {
        a0<Object> a0Var = this.f29180a;
        float fD = a0Var.e().d(a0Var.f28947g.getValue());
        float fD2 = a0Var.e().d(a0Var.f28949i.getValue()) - fD;
        float fAbs = Math.abs(fD2);
        float f10 = 1.0f;
        if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
            float fG = (a0Var.g() - fD) / fD2;
            if (fG < 1.0E-6f) {
                f10 = CropImageView.DEFAULT_ASPECT_RATIO;
            } else if (fG <= 0.999999f) {
                f10 = fG;
            }
        }
        return Float.valueOf(f10);
    }
}
