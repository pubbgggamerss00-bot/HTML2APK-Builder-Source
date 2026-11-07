package c9;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class f {
    /* JADX WARN: Multi-variable type inference failed */
    public static pg.n a(z1 z1Var, int i10, float f10) {
        pg.n nVarB = b(CropImageView.DEFAULT_ASPECT_RATIO, ((i10 * 1.2f) + 0.905f) * z1Var.f5336e, z1Var.f5337f);
        return new pg.n(Float.valueOf(z1Var.f5332a + ((Number) nVarB.f21469a).floatValue()), Float.valueOf((((Number) nVarB.f21470b).floatValue() * f10) + z1Var.f5333b));
    }

    public static pg.n b(float f10, float f11, int i10) {
        int i11 = ((i10 % 360) + 360) % 360;
        return i11 != 90 ? i11 != 180 ? i11 != 270 ? new pg.n(Float.valueOf(f10), Float.valueOf(f11)) : new pg.n(Float.valueOf(f11), Float.valueOf(-f10)) : new pg.n(Float.valueOf(-f10), Float.valueOf(-f11)) : new pg.n(Float.valueOf(-f11), Float.valueOf(f10));
    }
}
