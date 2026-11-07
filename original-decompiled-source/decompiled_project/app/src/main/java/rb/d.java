package rb;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.v;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes2.dex */
public final class d extends e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f23336b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CarouselLayoutManager carouselLayoutManager) {
        super(0);
        this.f23336b = carouselLayoutManager;
    }

    @Override // rb.e
    public final void a(RectF rectF, RectF rectF2, RectF rectF3) {
        float f10 = rectF2.left;
        float f11 = rectF3.left;
        if (f10 < f11 && rectF2.right > f11) {
            float f12 = f11 - f10;
            rectF.left += f12;
            rectF2.left += f12;
        }
        float f13 = rectF2.right;
        float f14 = rectF3.right;
        if (f13 <= f14 || rectF2.left >= f14) {
            return;
        }
        float f15 = f13 - f14;
        rectF.right = Math.max(rectF.right - f15, rectF.left);
        rectF2.right = Math.max(rectF2.right - f15, rectF2.left);
    }

    @Override // rb.e
    public final RectF b(float f10, float f11, float f12, float f13) {
        return new RectF(f13, CropImageView.DEFAULT_ASPECT_RATIO, f11 - f13, f10);
    }

    @Override // rb.e
    public final int c() {
        CarouselLayoutManager carouselLayoutManager = this.f23336b;
        return carouselLayoutManager.f2754o - carouselLayoutManager.D();
    }

    @Override // rb.e
    public final int d() {
        return 0;
    }

    @Override // rb.e
    public final int e() {
        return this.f23336b.f2753n;
    }

    @Override // rb.e
    public final int f() {
        CarouselLayoutManager carouselLayoutManager = this.f23336b;
        if (carouselLayoutManager.P0()) {
            return carouselLayoutManager.f2753n;
        }
        return 0;
    }

    @Override // rb.e
    public final int g() {
        return this.f23336b.G();
    }

    @Override // rb.e
    public final void h(View view, int i10, int i11) {
        int iG = this.f23336b.G();
        v.m mVar = (v.m) view.getLayoutParams();
        v.l.N(view, i10, iG, i11, v.l.z(view) + ((ViewGroup.MarginLayoutParams) mVar).topMargin + ((ViewGroup.MarginLayoutParams) mVar).bottomMargin + iG);
    }

    @Override // rb.e
    public final void i(RectF rectF, RectF rectF2, RectF rectF3) {
        if (rectF2.right <= rectF3.left) {
            float fFloor = ((float) Math.floor(rectF.right)) - 1.0f;
            rectF.right = fFloor;
            rectF.left = Math.min(rectF.left, fFloor);
        }
        if (rectF2.left >= rectF3.right) {
            float fCeil = ((float) Math.ceil(rectF.left)) + 1.0f;
            rectF.left = fCeil;
            rectF.right = Math.max(fCeil, rectF.right);
        }
    }

    @Override // rb.e
    public final void j(View view, Rect rect, float f10, float f11) {
        view.offsetLeftAndRight((int) (f11 - (rect.left + f10)));
    }
}
