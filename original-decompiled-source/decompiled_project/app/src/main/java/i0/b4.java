package i0;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class b4 extends kotlin.jvm.internal.s implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13176a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13177b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b4(Object obj, int i10) {
        super(1);
        this.f13176a = i10;
        this.f13177b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f13176a) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                f4 f4Var = (f4) this.f13177b;
                x0.u1 u1Var = f4Var.f13281a;
                float floatValue = u1Var.getFloatValue() + fFloatValue;
                x0.u1 u1Var2 = f4Var.f13282b;
                if (floatValue > u1Var2.getFloatValue()) {
                    fFloatValue = u1Var2.getFloatValue() - u1Var.getFloatValue();
                } else if (floatValue < CropImageView.DEFAULT_ASPECT_RATIO) {
                    fFloatValue = -u1Var.getFloatValue();
                }
                u1Var.e(u1Var.getFloatValue() + fFloatValue);
                return Float.valueOf(fFloatValue);
            default:
                g2.v vVarS = ((g2.v) obj).S();
                kotlin.jvm.internal.r.b(vVarS);
                ((j3.g0) this.f13177b).n(vVarS);
                return pg.f0.f21461a;
        }
    }
}
