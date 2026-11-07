package t;

import android.content.Context;
import android.widget.EdgeEffect;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class n0 extends EdgeEffect {

    /* renamed from: a, reason: collision with root package name */
    public final float f25303a;

    /* renamed from: b, reason: collision with root package name */
    public float f25304b;

    public n0(Context context) {
        super(context);
        this.f25303a = f3.a.a(context).f8814a * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i10) {
        this.f25304b = CropImageView.DEFAULT_ASPECT_RATIO;
        super.onAbsorb(i10);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f10, float f11) {
        this.f25304b = CropImageView.DEFAULT_ASPECT_RATIO;
        super.onPull(f10, f11);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f25304b = CropImageView.DEFAULT_ASPECT_RATIO;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f10) {
        this.f25304b = CropImageView.DEFAULT_ASPECT_RATIO;
        super.onPull(f10);
    }
}
