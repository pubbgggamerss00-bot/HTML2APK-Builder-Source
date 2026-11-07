package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.htmltoapk.template.R;
import java.util.ArrayList;
import java.util.Collections;
import n4.j;
import n4.k;
import u4.g;
import u4.k;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: r0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f11988r0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: m0, reason: collision with root package name */
    public Integer f11989m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f11990n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f11991o0;
    public ImageView.ScaleType p0;

    /* renamed from: q0, reason: collision with root package name */
    public Boolean f11992q0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a5.a.b(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayD = j.d(context2, attributeSet, w3.a.f15083y, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayD.hasValue(2)) {
            setNavigationIconTint(typedArrayD.getColor(2, -1));
        }
        this.f11990n0 = typedArrayD.getBoolean(6, false);
        this.f11991o0 = typedArrayD.getBoolean(5, false);
        int i6 = typedArrayD.getInt(1, -1);
        if (i6 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f11988r0;
            if (i6 < scaleTypeArr.length) {
                this.p0 = scaleTypeArr[i6];
            }
        }
        if (typedArrayD.hasValue(0)) {
            this.f11992q0 = Boolean.valueOf(typedArrayD.getBoolean(0, false));
        }
        typedArrayD.recycle();
        k kVarA = k.f(context2, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar).a();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : i4.a.a(background);
        if (colorStateListValueOf != null) {
            g gVar = new g(kVarA);
            gVar.r(colorStateListValueOf);
            gVar.n(context2);
            gVar.q(getElevation());
            setBackground(gVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.p0;
    }

    public Integer getNavigationIconTint() {
        return this.f11989m0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            a1.a.g(this, (g) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z6, i6, i7, i8, i9);
        int i10 = 0;
        ImageView imageView2 = null;
        if (this.f11990n0 || this.f11991o0) {
            ArrayList arrayListB = n4.k.b(this, getTitle());
            boolean zIsEmpty = arrayListB.isEmpty();
            k.a aVar = n4.k.f13992a;
            TextView textView = zIsEmpty ? null : (TextView) Collections.min(arrayListB, aVar);
            ArrayList arrayListB2 = n4.k.b(this, getSubtitle());
            TextView textView2 = arrayListB2.isEmpty() ? null : (TextView) Collections.max(arrayListB2, aVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i11 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i11 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i11 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f11990n0 && textView != null) {
                    v(textView, pair);
                }
                if (this.f11991o0 && textView2 != null) {
                    v(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i10 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i10);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i10++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f11992q0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.p0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        Drawable background = getBackground();
        if (background instanceof g) {
            ((g) background).q(f6);
        }
    }

    public void setLogoAdjustViewBounds(boolean z6) {
        Boolean bool = this.f11992q0;
        if (bool == null || bool.booleanValue() != z6) {
            this.f11992q0 = Boolean.valueOf(z6);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.p0 != scaleType) {
            this.p0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f11989m0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.f11989m0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i6) {
        this.f11989m0 = Integer.valueOf(i6);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z6) {
        if (this.f11991o0 != z6) {
            this.f11991o0 = z6;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z6) {
        if (this.f11990n0 != z6) {
            this.f11990n0 = z6;
            requestLayout();
        }
    }

    public final void v(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i6 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i7 = measuredWidth2 + i6;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i6, 0), Math.max(i7 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i6 += iMax;
            i7 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i7 - i6, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i6, textView.getTop(), i7, textView.getBottom());
    }
}
