package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class o extends RecyclerView.w {

    /* renamed from: k, reason: collision with root package name */
    @SuppressLint({"UnknownNullness"})
    public PointF f1706k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f1707l;

    /* renamed from: n, reason: collision with root package name */
    public float f1709n;

    /* renamed from: i, reason: collision with root package name */
    public final LinearInterpolator f1704i = new LinearInterpolator();

    /* renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f1705j = new DecelerateInterpolator();

    /* renamed from: m, reason: collision with root package name */
    public boolean f1708m = false;

    /* renamed from: o, reason: collision with root package name */
    public int f1710o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f1711p = 0;

    @SuppressLint({"UnknownNullness"})
    public o(Context context) {
        this.f1707l = context.getResources().getDisplayMetrics();
    }

    public static int g(int i6, int i7, int i8, int i9, int i10) {
        if (i10 == -1) {
            return i8 - i6;
        }
        if (i10 != 0) {
            if (i10 == 1) {
                return i9 - i7;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i11 = i8 - i6;
        if (i11 > 0) {
            return i11;
        }
        int i12 = i9 - i7;
        if (i12 < 0) {
            return i12;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.w
    @SuppressLint({"UnknownNullness"})
    public final void c(int i6, int i7, RecyclerView.w.a aVar) {
        if (this.f1513b.F.v() == 0) {
            f();
            return;
        }
        int i8 = this.f1710o;
        int i9 = i8 - i6;
        if (i8 * i9 <= 0) {
            i9 = 0;
        }
        this.f1710o = i9;
        int i10 = this.f1711p;
        int i11 = i10 - i7;
        int i12 = i10 * i11 > 0 ? i11 : 0;
        this.f1711p = i12;
        if (i9 == 0 && i12 == 0) {
            PointF pointFA = a(this.f1512a);
            if (pointFA != null) {
                if (pointFA.x != 0.0f || pointFA.y != 0.0f) {
                    float f6 = pointFA.y;
                    float fSqrt = (float) Math.sqrt((f6 * f6) + (r4 * r4));
                    float f7 = pointFA.x / fSqrt;
                    pointFA.x = f7;
                    float f8 = pointFA.y / fSqrt;
                    pointFA.y = f8;
                    this.f1706k = pointFA;
                    this.f1710o = (int) (f7 * 10000.0f);
                    this.f1711p = (int) (f8 * 10000.0f);
                    int iK = k(10000);
                    aVar.f1519a = (int) (this.f1710o * 1.2f);
                    aVar.f1520b = (int) (this.f1711p * 1.2f);
                    aVar.f1521c = (int) (iK * 1.2f);
                    aVar.f1523e = this.f1704i;
                    aVar.f1524f = true;
                    return;
                }
            }
            aVar.f1522d = this.f1512a;
            f();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.w
    public final void d() {
        this.f1711p = 0;
        this.f1710o = 0;
        this.f1706k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.w
    @SuppressLint({"UnknownNullness"})
    public void e(View view, RecyclerView.w.a aVar) {
        int iH = h(view, l());
        int i6 = i(view, m());
        int iCeil = (int) Math.ceil(k((int) Math.sqrt((i6 * i6) + (iH * iH))) / 0.3356d);
        if (iCeil > 0) {
            aVar.f1519a = -iH;
            aVar.f1520b = -i6;
            aVar.f1521c = iCeil;
            aVar.f1523e = this.f1705j;
            aVar.f1524f = true;
        }
    }

    @SuppressLint({"UnknownNullness"})
    public int h(View view, int i6) {
        RecyclerView.m mVar = this.f1514c;
        if (mVar == null || !mVar.d()) {
            return 0;
        }
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        return g((view.getLeft() - ((RecyclerView.n) view.getLayoutParams()).f1493b.left) - ((ViewGroup.MarginLayoutParams) nVar).leftMargin, view.getRight() + ((RecyclerView.n) view.getLayoutParams()).f1493b.right + ((ViewGroup.MarginLayoutParams) nVar).rightMargin, mVar.E(), mVar.f1484n - mVar.F(), i6);
    }

    @SuppressLint({"UnknownNullness"})
    public int i(View view, int i6) {
        RecyclerView.m mVar = this.f1514c;
        if (mVar == null || !mVar.e()) {
            return 0;
        }
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        return g((view.getTop() - ((RecyclerView.n) view.getLayoutParams()).f1493b.top) - ((ViewGroup.MarginLayoutParams) nVar).topMargin, view.getBottom() + ((RecyclerView.n) view.getLayoutParams()).f1493b.bottom + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin, mVar.G(), mVar.f1485o - mVar.D(), i6);
    }

    @SuppressLint({"UnknownNullness"})
    public float j(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int k(int i6) {
        float fAbs = Math.abs(i6);
        if (!this.f1708m) {
            this.f1709n = j(this.f1707l);
            this.f1708m = true;
        }
        return (int) Math.ceil(fAbs * this.f1709n);
    }

    public int l() {
        PointF pointF = this.f1706k;
        if (pointF == null) {
            return 0;
        }
        float f6 = pointF.x;
        if (f6 == 0.0f) {
            return 0;
        }
        return f6 > 0.0f ? 1 : -1;
    }

    public int m() {
        PointF pointF = this.f1706k;
        if (pointF == null) {
            return 0;
        }
        float f6 = pointF.y;
        if (f6 == 0.0f) {
            return 0;
        }
        return f6 > 0.0f ? 1 : -1;
    }
}
