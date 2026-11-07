package d4;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d extends f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f12731b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CarouselLayoutManager carouselLayoutManager) {
        super(1);
        this.f12731b = carouselLayoutManager;
    }

    @Override // d4.f
    public final void a(RectF rectF, RectF rectF2, RectF rectF3) {
        float f6 = rectF2.top;
        float f7 = rectF3.top;
        if (f6 < f7 && rectF2.bottom > f7) {
            float f8 = f7 - f6;
            rectF.top += f8;
            rectF3.top += f8;
        }
        float f9 = rectF2.bottom;
        float f10 = rectF3.bottom;
        if (f9 <= f10 || rectF2.top >= f10) {
            return;
        }
        float f11 = f9 - f10;
        rectF.bottom = Math.max(rectF.bottom - f11, rectF.top);
        rectF2.bottom = Math.max(rectF2.bottom - f11, rectF2.top);
    }

    @Override // d4.f
    public final RectF b(float f6, float f7, float f8, float f9) {
        return new RectF(0.0f, f8, f7, f6 - f8);
    }

    @Override // d4.f
    public final int c() {
        return this.f12731b.f1485o;
    }

    @Override // d4.f
    public final int d() {
        return this.f12731b.E();
    }

    @Override // d4.f
    public final int e() {
        CarouselLayoutManager carouselLayoutManager = this.f12731b;
        return carouselLayoutManager.f1484n - carouselLayoutManager.F();
    }

    @Override // d4.f
    public final int f() {
        return 0;
    }

    @Override // d4.f
    public final int g() {
        return 0;
    }

    @Override // d4.f
    public final void h(View view, int i6, int i7) {
        int iE = this.f12731b.E();
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        RecyclerView.m.N(view, iE, i6, RecyclerView.m.A(view) + ((ViewGroup.MarginLayoutParams) nVar).leftMargin + ((ViewGroup.MarginLayoutParams) nVar).rightMargin + iE, i7);
    }

    @Override // d4.f
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

    @Override // d4.f
    public final void j(View view, Rect rect, float f6, float f7) {
        view.offsetTopAndBottom((int) (f7 - (rect.top + f6)));
    }
}
