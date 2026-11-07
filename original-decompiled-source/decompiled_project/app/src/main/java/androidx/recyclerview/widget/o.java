package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.v;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public class o extends v.AbstractC0038v {

    /* renamed from: k, reason: collision with root package name */
    public PointF f2644k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f2645l;

    /* renamed from: n, reason: collision with root package name */
    public float f2647n;

    /* renamed from: i, reason: collision with root package name */
    public final LinearInterpolator f2642i = new LinearInterpolator();

    /* renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f2643j = new DecelerateInterpolator();

    /* renamed from: m, reason: collision with root package name */
    public boolean f2646m = false;

    /* renamed from: o, reason: collision with root package name */
    public int f2648o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f2649p = 0;

    public o(Context context) {
        this.f2645l = context.getResources().getDisplayMetrics();
    }

    public static int g(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 != 0) {
            if (i14 == 1) {
                return i13 - i11;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i15 = i12 - i10;
        if (i15 > 0) {
            return i15;
        }
        int i16 = i13 - i11;
        if (i16 < 0) {
            return i16;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.v.AbstractC0038v
    public final void c(int i10, int i11, v.AbstractC0038v.a aVar) {
        if (this.f2783b.f2682n.v() == 0) {
            f();
            return;
        }
        int i12 = this.f2648o;
        int i13 = i12 - i10;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f2648o = i13;
        int i14 = this.f2649p;
        int i15 = i14 - i11;
        int i16 = i14 * i15 > 0 ? i15 : 0;
        this.f2649p = i16;
        if (i13 == 0 && i16 == 0) {
            PointF pointFA = a(this.f2782a);
            if (pointFA != null) {
                if (pointFA.x != CropImageView.DEFAULT_ASPECT_RATIO || pointFA.y != CropImageView.DEFAULT_ASPECT_RATIO) {
                    float f10 = pointFA.y;
                    float fSqrt = (float) Math.sqrt((f10 * f10) + (r4 * r4));
                    float f11 = pointFA.x / fSqrt;
                    pointFA.x = f11;
                    float f12 = pointFA.y / fSqrt;
                    pointFA.y = f12;
                    this.f2644k = pointFA;
                    this.f2648o = (int) (f11 * 10000.0f);
                    this.f2649p = (int) (f12 * 10000.0f);
                    int i17 = i(10000);
                    aVar.f2790a = (int) (this.f2648o * 1.2f);
                    aVar.f2791b = (int) (this.f2649p * 1.2f);
                    aVar.f2792c = (int) (i17 * 1.2f);
                    aVar.f2794e = this.f2642i;
                    aVar.f2795f = true;
                    return;
                }
            }
            aVar.f2793d = this.f2782a;
            f();
        }
    }

    @Override // androidx.recyclerview.widget.v.AbstractC0038v
    public final void d() {
        this.f2649p = 0;
        this.f2648o = 0;
        this.f2644k = null;
    }

    @Override // androidx.recyclerview.widget.v.AbstractC0038v
    public void e(View view, v.AbstractC0038v.a aVar) {
        int iG;
        int iJ = j();
        v.l lVar = this.f2784c;
        int iG2 = 0;
        if (lVar == null || !lVar.d()) {
            iG = 0;
        } else {
            v.m mVar = (v.m) view.getLayoutParams();
            iG = g((view.getLeft() - ((v.m) view.getLayoutParams()).f2762b.left) - ((ViewGroup.MarginLayoutParams) mVar).leftMargin, view.getRight() + ((v.m) view.getLayoutParams()).f2762b.right + ((ViewGroup.MarginLayoutParams) mVar).rightMargin, lVar.E(), lVar.f2753n - lVar.F(), iJ);
        }
        int iK = k();
        v.l lVar2 = this.f2784c;
        if (lVar2 != null && lVar2.e()) {
            v.m mVar2 = (v.m) view.getLayoutParams();
            iG2 = g((view.getTop() - ((v.m) view.getLayoutParams()).f2762b.top) - ((ViewGroup.MarginLayoutParams) mVar2).topMargin, view.getBottom() + ((v.m) view.getLayoutParams()).f2762b.bottom + ((ViewGroup.MarginLayoutParams) mVar2).bottomMargin, lVar2.G(), lVar2.f2754o - lVar2.D(), iK);
        }
        int iCeil = (int) Math.ceil(i((int) Math.sqrt((iG2 * iG2) + (iG * iG))) / 0.3356d);
        if (iCeil > 0) {
            aVar.f2790a = -iG;
            aVar.f2791b = -iG2;
            aVar.f2792c = iCeil;
            aVar.f2794e = this.f2643j;
            aVar.f2795f = true;
        }
    }

    public float h(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int i(int i10) {
        float fAbs = Math.abs(i10);
        if (!this.f2646m) {
            this.f2647n = h(this.f2645l);
            this.f2646m = true;
        }
        return (int) Math.ceil(fAbs * this.f2647n);
    }

    public int j() {
        PointF pointF = this.f2644k;
        if (pointF == null) {
            return 0;
        }
        float f10 = pointF.x;
        if (f10 == CropImageView.DEFAULT_ASPECT_RATIO) {
            return 0;
        }
        return f10 > CropImageView.DEFAULT_ASPECT_RATIO ? 1 : -1;
    }

    public int k() {
        PointF pointF = this.f2644k;
        if (pointF == null) {
            return 0;
        }
        float f10 = pointF.y;
        if (f10 == CropImageView.DEFAULT_ASPECT_RATIO) {
            return 0;
        }
        return f10 > CropImageView.DEFAULT_ASPECT_RATIO ? 1 : -1;
    }
}
