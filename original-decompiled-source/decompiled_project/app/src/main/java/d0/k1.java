package d0;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class k1 extends kotlin.jvm.internal.s implements eh.l<s.k<Float, s.o>, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f7173a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.d0 f7174b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h1 f7175c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(float f10, kotlin.jvm.internal.d0 d0Var, h1 h1Var) {
        super(1);
        this.f7173a = f10;
        this.f7174b = d0Var;
        this.f7175c = h1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a A[PHI: r1
      0x001a: PHI (r1v8 float) = (r1v4 float), (r1v12 float) binds: [B:12:0x002f, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // eh.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pg.f0 invoke(s.k<Float, s.o> kVar) {
        float fFloatValue;
        s.k<Float, s.o> kVar2 = kVar;
        float f10 = this.f7173a;
        float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (f10 > CropImageView.DEFAULT_ASPECT_RATIO) {
            fFloatValue = ((Number) kVar2.f23791e.getValue()).floatValue();
            if (fFloatValue <= f10) {
                f10 = fFloatValue;
            }
            f11 = f10;
        } else if (f10 < CropImageView.DEFAULT_ASPECT_RATIO) {
            fFloatValue = ((Number) kVar2.f23791e.getValue()).floatValue();
            if (fFloatValue >= f10) {
            }
            f11 = f10;
        }
        kotlin.jvm.internal.d0 d0Var = this.f7174b;
        float f12 = f11 - d0Var.f16322a;
        if (f12 != this.f7175c.e(f12) || f11 != ((Number) kVar2.f23791e.getValue()).floatValue()) {
            kVar2.a();
        }
        d0Var.f16322a += f12;
        return pg.f0.f21461a;
    }
}
