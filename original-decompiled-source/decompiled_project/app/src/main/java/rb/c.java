package rb;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.v;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes2.dex */
public final class c extends e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f23335b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CarouselLayoutManager carouselLayoutManager) {
        super(1);
        this.f23335b = carouselLayoutManager;
    }

    @Override // rb.e
    public final void a(RectF rectF, RectF rectF2, RectF rectF3) {
        float f10 = rectF2.top;
        float f11 = rectF3.top;
        if (f10 < f11 && rectF2.bottom > f11) {
            float f12 = f11 - f10;
            rectF.top += f12;
            rectF3.top += f12;
        }
        float f13 = rectF2.bottom;
        float f14 = rectF3.bottom;
        if (f13 <= f14 || rectF2.top >= f14) {
            return;
        }
        float f15 = f13 - f14;
        rectF.bottom = Math.max(rectF.bottom - f15, rectF.top);
        rectF2.bottom = Math.max(rectF2.bottom - f15, rectF2.top);
    }

    @Override // rb.e
    public final RectF b(float f10, float f11, float f12, float f13) {
        return new RectF(CropImageView.DEFAULT_ASPECT_RATIO, f12, f11, f10 - f12);
    }

    @Override // rb.e
    public final int c() {
        return this.f23335b.f2754o;
    }

    @Override // rb.e
    public final int d() {
        return this.f23335b.E();
    }

    @Override // rb.e
    public final int e() {
        CarouselLayoutManager carouselLayoutManager = this.f23335b;
        return carouselLayoutManager.f2753n - carouselLayoutManager.F();
    }

    @Override // rb.e
    public final int f() {
        return 0;
    }

    @Override // rb.e
    public final int g() {
        return 0;
    }

    @Override // rb.e
    public final void h(View view, int i10, int i11) {
        int iE = this.f23335b.E();
        v.m mVar = (v.m) view.getLayoutParams();
        v.l.N(view, iE, i10, v.l.A(view) + ((ViewGroup.MarginLayoutParams) mVar).leftMargin + ((ViewGroup.MarginLayoutParams) mVar).rightMargin + iE, i11);
    }

    @Override // rb.e
    public final void i(RectF rectF, RectF rectF2, RectF rectF3) {
        if (rectF2.bottom <= rectF3.top) {
            float fFloor = ((float) Math.floor(rectF.bottom)) - 1.0f;
            rectF.bottom = fFloor;
            rectF.top = Math.min(rectF.top, fFloor);
        }
        if (rectF2.top >= rectF3.bottom) {
            float fCeil = ((float) Math.ceil(rectF.top)) + 1.0f;
            rectF.top = fCeil;
            rectF.bottom = Math.max(fCeil, rectF.bottom);
        }
    }

    @Override // rb.e
    public final void j(View view, Rect rect, float f10, float f11) {
        view.offsetTopAndBottom((int) (f11 - (rect.top + f10)));
    }
}
