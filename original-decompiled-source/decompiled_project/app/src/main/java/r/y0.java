package r;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class y0 extends kotlin.jvm.internal.s implements eh.l<u0, Float> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u1 f23000a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w1 f23001b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(u1 u1Var, w1 w1Var) {
        super(1);
        this.f23000a = u1Var;
        this.f23001b = w1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    @Override // eh.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Float invoke(u0 u0Var) {
        int iOrdinal = u0Var.ordinal();
        float f10 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                f10 = 1.0f;
            } else {
                if (iOrdinal != 2) {
                    throw new pg.l();
                }
                if (this.f23001b.a().f22902a == null) {
                }
            }
        } else if (this.f23000a.a().f22902a == null) {
        }
        return Float.valueOf(f10);
    }
}
