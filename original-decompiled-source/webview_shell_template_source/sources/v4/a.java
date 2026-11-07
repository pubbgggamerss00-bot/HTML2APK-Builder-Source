package v4;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    public final SideSheetBehavior<? extends View> f14821a;

    public a(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f14821a = sideSheetBehavior;
    }

    @Override // v4.d
    public final int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // v4.d
    public final float b(int i6) {
        float fD = d();
        return (i6 - fD) / (c() - fD);
    }

    @Override // v4.d
    public final int c() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f14821a;
        return Math.max(0, sideSheetBehavior.f12423n + sideSheetBehavior.f12424o);
    }

    @Override // v4.d
    public final int d() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f14821a;
        return (-sideSheetBehavior.f12421l) - sideSheetBehavior.f12424o;
    }

    @Override // v4.d
    public final int e() {
        return this.f14821a.f12424o;
    }

    @Override // v4.d
    public final int f() {
        return -this.f14821a.f12421l;
    }

    @Override // v4.d
    public final <V extends View> int g(V v2) {
        return v2.getRight() + this.f14821a.f12424o;
    }

    @Override // v4.d
    public final int h(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // v4.d
    public final int i() {
        return 1;
    }

    @Override // v4.d
    public final boolean j(float f6) {
        return f6 > 0.0f;
    }

    @Override // v4.d
    public final boolean k(View view) {
        return view.getRight() < (c() - d()) / 2;
    }

    @Override // v4.d
    public final boolean l(float f6, float f7) {
        return Math.abs(f6) > Math.abs(f7) && Math.abs(f6) > ((float) 500);
    }

    @Override // v4.d
    public final boolean m(View view, float f6) {
        float left = view.getLeft();
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f14821a;
        float fAbs = Math.abs((f6 * sideSheetBehavior.f12420k) + left);
        sideSheetBehavior.getClass();
        return fAbs > 0.5f;
    }

    @Override // v4.d
    public final void n(ViewGroup.MarginLayoutParams marginLayoutParams, int i6, int i7) {
        if (i6 <= this.f14821a.f12422m) {
            marginLayoutParams.leftMargin = i7;
        }
    }
}
