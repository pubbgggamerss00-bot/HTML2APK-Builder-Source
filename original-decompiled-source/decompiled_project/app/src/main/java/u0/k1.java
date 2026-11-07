package u0;

import com.yalantis.ucrop.view.CropImageView;
import s.y1;
import x0.r3;

/* loaded from: classes.dex */
public final class k1 extends kotlin.jvm.internal.s implements eh.a<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r3<Float> f29046a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(y1.d dVar) {
        super(0);
        this.f29046a = dVar;
    }

    @Override // eh.a
    public final Boolean invoke() {
        return Boolean.valueOf(this.f29046a.getValue().floatValue() > CropImageView.DEFAULT_ASPECT_RATIO);
    }
}
