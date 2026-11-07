package d4;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f12732b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CarouselLayoutManager carouselLayoutManager) {
        super(0);
        this.f12732b = carouselLayoutManager;
    }

    @Override // d4.f
    public final void a(RectF rectF, RectF rectF2, RectF rectF3) {
        float f6 = rectF2.left;
        float f7 = rectF3.left;
        if (f6 < f7 && rectF2.right > f7) {
            float f8 = f7 - f6;
            rectF.left += f8;
            rectF2.left += f8;
        }
        float f9 = rectF2.right;
        float f10 = rectF3.right;
        if (f9 <= f10 || rectF2.left >= f10) {
            return;
        }
        float f11 = f9 - f10;
        rectF.right = Math.max(rectF.right - f11, rectF.left);
        rectF2.right = Math.max(rectF2.right - f11, rectF2.left);
    }

    @Override // d4.f
    public final RectF b(float f6, float f7, float f8, float f9) {
        return new RectF(f9, 0.0f, f7 - f9, f6);
    }

    @Override // d4.f
    public final int c() {
        CarouselLayoutManager carouselLayoutManager = this.f12732b;
        return carouselLayoutManager.f1485o - carouselLayoutManager.D();
    }

    @Override // d4.f
    public final int d() {
        return 0;
    }

    @Override // d4.f
    public final int e() {
        return this.f12732b.f1484n;
    }

    @Override // d4.f
    public final int f() {
        CarouselLayoutManager carouselLayoutManager = this.f12732b;
        if (carouselLayoutManager.Q0()) {
            return carouselLayoutManager.f1484n;
        }
        return 0;
    }

    @Override // d4.f
    public final int g() {
        return this.f12732b.G();
    }

    @Override // d4.f
    public final void h(View view, int i6, int i7) {
        int iG = this.f12732b.G();
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        RecyclerView.m.N(view, i6, iG, i7, RecyclerView.m.z(view) + ((ViewGroup.MarginLayoutParams) nVar).topMargin + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin + iG);
    }

    @Override // d4.f
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

    @Override // d4.f
    public final void j(View view, Rect rect, float f6, float f7) {
        view.offsetLeftAndRight((int) (f7 - (rect.left + f6)));
    }
}
