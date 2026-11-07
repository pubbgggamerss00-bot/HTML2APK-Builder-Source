package r;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.s implements eh.l<s.r, q1.b1> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r1.c f22879a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(r1.c cVar) {
        super(1);
        this.f22879a = cVar;
    }

    @Override // eh.l
    public final q1.b1 invoke(s.r rVar) {
        s.r rVar2 = rVar;
        float f10 = rVar2.f23902b;
        float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (f10 < CropImageView.DEFAULT_ASPECT_RATIO) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        float f12 = rVar2.f23903c;
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        if (f12 > 0.5f) {
            f12 = 0.5f;
        }
        float f13 = rVar2.f23904d;
        float f14 = f13 >= -0.5f ? f13 : -0.5f;
        float f15 = f14 <= 0.5f ? f14 : 0.5f;
        float f16 = rVar2.f23901a;
        if (f16 >= CropImageView.DEFAULT_ASPECT_RATIO) {
            f11 = f16;
        }
        return new q1.b1(q1.b1.b(c2.n0.a(f10, f12, f15, f11 <= 1.0f ? f11 : 1.0f, r1.j.f23098x), this.f22879a));
    }
}
