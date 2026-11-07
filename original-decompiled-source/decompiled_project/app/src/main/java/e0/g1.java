package e0;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class g1 extends kotlin.jvm.internal.s implements eh.a<b> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.a<Integer> f8192b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(int i10, eh.a aVar) {
        super(0);
        this.f8191a = i10;
        this.f8192b = aVar;
    }

    @Override // eh.a
    public final b invoke() {
        return new b(this.f8191a, CropImageView.DEFAULT_ASPECT_RATIO, this.f8192b);
    }
}
