package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.f;
import g.g;
import g.h;
import l.f0;
import u0.n0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue s;

    /* renamed from: t, reason: collision with root package name */
    public TypedValue f261t;

    /* renamed from: u, reason: collision with root package name */
    public TypedValue f262u;

    /* renamed from: v, reason: collision with root package name */
    public TypedValue f263v;

    /* renamed from: w, reason: collision with root package name */
    public TypedValue f264w;

    /* renamed from: x, reason: collision with root package name */
    public TypedValue f265x;

    /* renamed from: y, reason: collision with root package name */
    public final Rect f266y;

    /* renamed from: z, reason: collision with root package name */
    public a f267z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface a {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f266y = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f264w == null) {
            this.f264w = new TypedValue();
        }
        return this.f264w;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f265x == null) {
            this.f265x = new TypedValue();
        }
        return this.f265x;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f262u == null) {
            this.f262u = new TypedValue();
        }
        return this.f262u;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f263v == null) {
            this.f263v = new TypedValue();
        }
        return this.f263v;
    }

    public TypedValue getMinWidthMajor() {
        if (this.s == null) {
            this.s = new TypedValue();
        }
        return this.s;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f261t == null) {
            this.f261t = new TypedValue();
        }
        return this.f261t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f267z;
        if (aVar != null) {
            aVar.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f267z;
        if (aVar != null) {
            g gVar = ((h) aVar).f13141a;
            f0 f0Var = gVar.J;
            if (f0Var != null) {
                f0Var.i();
            }
            if (gVar.O != null) {
                gVar.D.getDecorView().removeCallbacks(gVar.P);
                if (gVar.O.isShowing()) {
                    try {
                        gVar.O.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                gVar.O = null;
            }
            n0 n0Var = gVar.Q;
            if (n0Var != null) {
                n0Var.b();
            }
            f fVar = gVar.E(0).h;
            if (fVar != null) {
                fVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i6, int i7) {
        int iMakeMeasureSpec;
        boolean z6;
        int iMakeMeasureSpec2;
        int i8;
        int i9;
        float fraction;
        int i10;
        int i11;
        float fraction2;
        int i12;
        int i13;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z7 = true;
        boolean z8 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i6);
        int mode2 = View.MeasureSpec.getMode(i7);
        Rect rect = this.f266y;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i6;
            z6 = false;
        } else {
            TypedValue typedValue = z8 ? this.f263v : this.f262u;
            if (typedValue != null && (i12 = typedValue.type) != 0) {
                if (i12 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else if (i12 == 6) {
                    int i14 = displayMetrics.widthPixels;
                    fraction3 = typedValue.getFraction(i14, i14);
                } else {
                    i13 = 0;
                    if (i13 <= 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i13 - (rect.left + rect.right), View.MeasureSpec.getSize(i6)), 1073741824);
                        z6 = true;
                    }
                }
                i13 = (int) fraction3;
                if (i13 <= 0) {
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i7;
        } else {
            TypedValue typedValue2 = z8 ? this.f264w : this.f265x;
            if (typedValue2 != null && (i10 = typedValue2.type) != 0) {
                if (i10 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else if (i10 == 6) {
                    int i15 = displayMetrics.heightPixels;
                    fraction2 = typedValue2.getFraction(i15, i15);
                } else {
                    i11 = 0;
                    if (i11 <= 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i11 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i7)), 1073741824);
                    }
                }
                i11 = (int) fraction2;
                if (i11 <= 0) {
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z6 || mode != Integer.MIN_VALUE) {
            z7 = false;
        } else {
            TypedValue typedValue3 = z8 ? this.f261t : this.s;
            if (typedValue3 != null && (i8 = typedValue3.type) != 0) {
                if (i8 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else if (i8 == 6) {
                    int i16 = displayMetrics.widthPixels;
                    fraction = typedValue3.getFraction(i16, i16);
                } else {
                    i9 = 0;
                    if (i9 > 0) {
                        i9 -= rect.left + rect.right;
                    }
                    if (measuredWidth >= i9) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                    }
                }
                i9 = (int) fraction;
                if (i9 > 0) {
                }
                if (measuredWidth >= i9) {
                }
            }
        }
        if (z7) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(a aVar) {
        this.f267z = aVar;
    }
}
