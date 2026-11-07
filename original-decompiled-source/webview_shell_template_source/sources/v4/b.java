package v4;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b extends d {

    /* renamed from: a, reason: collision with root package name */
    public final SideSheetBehavior<? extends View> f14822a;

    public b(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f14822a = sideSheetBehavior;
    }

    @Override // v4.d
    public final int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // v4.d
    public final float b(int i6) {
        float f6 = this.f14822a.f12422m;
        return (f6 - i6) / (f6 - c());
    }

    @Override // v4.d
    public final int c() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f14822a;
        return Math.max(0, (sideSheetBehavior.f12422m - sideSheetBehavior.f12421l) - sideSheetBehavior.f12424o);
    }

    @Override // v4.d
    public final int d() {
        return this.f14822a.f12422m;
    }

    @Override // v4.d
    public final int e() {
        return this.f14822a.f12422m;
    }

    @Override // v4.d
    public final int f() {
        return c();
    }

    @Override // v4.d
    public final <V extends View> int g(V v2) {
        return v2.getLeft() - this.f14822a.f12424o;
    }

    @Override // v4.d
    public final int h(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // v4.d
    public final int i() {
        return 0;
    }

    @Override // v4.d
    public final boolean j(float f6) {
        return f6 < 0.0f;
    }

    @Override // v4.d
    public final boolean k(View view) {
        return view.getLeft() > (c() + this.f14822a.f12422m) / 2;
    }

    @Override // v4.d
    public final boolean l(float f6, float f7) {
        return Math.abs(f6) > Math.abs(f7) && Math.abs(f6) > ((float) 500);
    }

    @Override // v4.d
    public final boolean m(View view, float f6) {
        float right = view.getRight();
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f14822a;
        float fAbs = Math.abs((f6 * sideSheetBehavior.f12420k) + right);
        sideSheetBehavior.getClass();
        return fAbs > 0.5f;
    }

    @Override // v4.d
    public final void n(ViewGroup.MarginLayoutParams marginLayoutParams, int i6, int i7) {
        int i8 = this.f14822a.f12422m;
        if (i6 <= i8) {
            marginLayoutParams.rightMargin = i8 - i6;
        }
    }
}
