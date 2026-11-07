package com.google.android.material.bottomappbar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import androidx.appcompat.widget.d;
import com.basitce.htmltoapk.R;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.yalantis.ucrop.view.CropImageView;
import i8.n;
import java.util.ArrayList;
import m3.b;
import pb.c;
import r3.g;
import zb.i;

/* loaded from: classes2.dex */
public final class BottomAppBar extends d implements b.a {
    public static final /* synthetic */ int D = 0;
    public boolean A;
    public boolean B;
    public Behavior C;

    /* renamed from: r, reason: collision with root package name */
    public Integer f6320r;

    /* renamed from: s, reason: collision with root package name */
    public AnimatorSet f6321s;

    /* renamed from: t, reason: collision with root package name */
    public AnimatorSet f6322t;

    /* renamed from: v, reason: collision with root package name */
    public int f6323v;

    /* renamed from: w, reason: collision with root package name */
    public int f6324w;

    /* renamed from: x, reason: collision with root package name */
    public int f6325x;

    /* renamed from: y, reason: collision with root package name */
    public int f6326y;

    /* renamed from: z, reason: collision with root package name */
    public int f6327z;

    public static class a extends q4.a {
        public static final Parcelable.Creator<a> CREATOR = new C0070a();

        /* renamed from: c, reason: collision with root package name */
        public int f6328c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f6329d;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a$a, reason: collision with other inner class name */
        public class C0070a implements Parcelable.ClassLoaderCreator<a> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new a[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new a(parcel, null);
            }
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6328c = parcel.readInt();
            this.f6329d = parcel.readInt() != 0;
        }

        @Override // q4.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f6328c);
            parcel.writeInt(this.f6329d ? 1 : 0);
        }
    }

    private androidx.appcompat.widget.b getActionMenuView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof androidx.appcompat.widget.b) {
                return (androidx.appcompat.widget.b) childAt;
            }
        }
        return null;
    }

    private int getBottomInset() {
        return 0;
    }

    private int getFabAlignmentAnimationDuration() {
        TypedValue typedValueA = xb.a.a(getContext().getTheme(), R.attr.motionDurationLong2);
        if (typedValueA == null || typedValueA.type != 16) {
            return 300;
        }
        return typedValueA.data;
    }

    private float getFabTranslationX() {
        return g(this.f6323v);
    }

    private float getFabTranslationY() {
        if (this.f6325x == 1) {
            return -getTopEdgeTreatment().f21419c;
        }
        e();
        return 0;
    }

    private int getLeftInset() {
        return 0;
    }

    private int getRightInset() {
        return 0;
    }

    private pb.d getTopEdgeTreatment() {
        throw null;
    }

    public final void e() {
        if (getParent() instanceof b) {
            ((b) getParent()).getClass();
            throw null;
        }
    }

    public final int f(androidx.appcompat.widget.b bVar, int i10) throws Resources.NotFoundException {
        int dimensionPixelOffset = 0;
        if (this.f6327z != 1) {
            return 0;
        }
        boolean z10 = getLayoutDirection() == 1;
        int measuredWidth = z10 ? getMeasuredWidth() : 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if ((childAt.getLayoutParams() instanceof d.b) && (((d.b) childAt.getLayoutParams()).f12076a & 8388615) == 8388611) {
                measuredWidth = z10 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = z10 ? bVar.getRight() : bVar.getLeft();
        if (getNavigationIcon() == null) {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_bottomappbar_horizontal_padding);
            if (!z10) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
        }
        return measuredWidth - (right + dimensionPixelOffset);
    }

    public final float g(int i10) {
        boolean z10 = getLayoutDirection() == 1;
        if (i10 != 1) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        e();
        return (getMeasuredWidth() / 2) * (z10 ? -1 : 1);
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f21419c;
    }

    public int getFabAlignmentMode() {
        return this.f6323v;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.f6326y;
    }

    public int getFabAnchorMode() {
        return this.f6325x;
    }

    public int getFabAnimationMode() {
        return this.f6324w;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f21418b;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f21417a;
    }

    public boolean getHideOnScroll() {
        return this.A;
    }

    public int getMenuAlignmentMode() {
        return this.f6327z;
    }

    public final void h() {
        pb.d topEdgeTreatment = getTopEdgeTreatment();
        getFabTranslationX();
        topEdgeTreatment.getClass();
        if (this.B) {
            e();
        }
        throw null;
    }

    @Override // androidx.appcompat.widget.d, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i.b(this, null);
        throw null;
    }

    @Override // androidx.appcompat.widget.d, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        throw null;
    }

    @Override // androidx.appcompat.widget.d, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f21914a);
        this.f6323v = aVar.f6328c;
        this.B = aVar.f6329d;
    }

    @Override // androidx.appcompat.widget.d, android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f6328c = this.f6323v;
        aVar.f6329d = this.B;
        return aVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        throw null;
    }

    public void setCradleVerticalOffset(float f10) {
        if (f10 == getCradleVerticalOffset()) {
            return;
        }
        pb.d topEdgeTreatment = getTopEdgeTreatment();
        if (f10 >= CropImageView.DEFAULT_ASPECT_RATIO) {
            topEdgeTreatment.f21419c = f10;
            throw null;
        }
        topEdgeTreatment.getClass();
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x021f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0220 A[Catch: NumberFormatException -> 0x0239, LOOP:3: B:73:0x01e4->B:94:0x0220, LOOP_END, TryCatch #1 {NumberFormatException -> 0x0239, blocks: (B:70:0x01cd, B:73:0x01e4, B:75:0x01ea, B:80:0x01fa, B:97:0x022b, B:103:0x0243, B:94:0x0220, B:106:0x024a, B:108:0x024d, B:109:0x0259, B:110:0x025e, B:111:0x025f, B:112:0x0264), top: B:140:0x01cd }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setFabAlignmentMode(int i10) throws Resources.NotFoundException {
        int i11;
        String strTrim;
        int i12;
        int i13;
        float[] fArr;
        int i14;
        char c10;
        int i15 = 1;
        int i16 = 0;
        if (isLaidOut()) {
            AnimatorSet animatorSet = this.f6322t;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ArrayList arrayList = new ArrayList();
            e();
            androidx.appcompat.widget.b actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                objectAnimatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
                if (Math.abs(actionMenuView.getTranslationX() - f(actionMenuView, 0)) > 1.0f) {
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", CropImageView.DEFAULT_ASPECT_RATIO);
                    objectAnimatorOfFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
                    objectAnimatorOfFloat2.addListener(new c(this, actionMenuView));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
                    arrayList.add(animatorSet2);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(objectAnimatorOfFloat);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList);
            this.f6322t = animatorSet3;
            animatorSet3.addListener(new pb.b(this));
            this.f6322t.start();
        }
        if (this.f6323v != i10 && isLaidOut()) {
            AnimatorSet animatorSet4 = this.f6321s;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (this.f6324w == 1) {
                e();
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat((Object) null, "translationX", g(i10));
                objectAnimatorOfFloat3.setDuration(getFabAlignmentAnimationDuration());
                arrayList2.add(objectAnimatorOfFloat3);
            } else {
                e();
            }
            AnimatorSet animatorSet5 = new AnimatorSet();
            animatorSet5.playTogether(arrayList2);
            Context context = getContext();
            TimeInterpolator pathInterpolator = nb.a.f18655a;
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(R.attr.motionEasingEmphasizedInterpolator, typedValue, true)) {
                if (typedValue.type != 3) {
                    throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
                }
                String strValueOf = String.valueOf(typedValue.string);
                if (!wb.a.b(strValueOf, "cubic-bezier") && !wb.a.b(strValueOf, "path")) {
                    pathInterpolator = AnimationUtils.loadInterpolator(context, typedValue.resourceId);
                } else if (wb.a.b(strValueOf, "cubic-bezier")) {
                    String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
                    if (strArrSplit.length != 4) {
                        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
                    }
                    pathInterpolator = new PathInterpolator(wb.a.a(0, strArrSplit), wb.a.a(1, strArrSplit), wb.a.a(2, strArrSplit), wb.a.a(3, strArrSplit));
                } else {
                    if (!wb.a.b(strValueOf, "path")) {
                        throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
                    }
                    String strA = p3.c.a(1, 5, strValueOf);
                    Path path = new Path();
                    ArrayList arrayList3 = new ArrayList();
                    int i17 = 1;
                    int i18 = 0;
                    while (i17 < strA.length()) {
                        while (i17 < strA.length()) {
                            char cCharAt = strA.charAt(i17);
                            if (((cCharAt - 'Z') * (cCharAt - 'A') > 0 && (cCharAt - 'z') * (cCharAt - 'a') > 0) || cCharAt == 'e' || cCharAt == 'E') {
                                i17++;
                            } else {
                                strTrim = strA.substring(i18, i17).trim();
                                if (strTrim.isEmpty()) {
                                    if (strTrim.charAt(i16) == 'z' || strTrim.charAt(i16) == 'Z') {
                                        i12 = i17;
                                        i13 = i16;
                                        fArr = new float[i13];
                                    } else {
                                        try {
                                            float[] fArr2 = new float[strTrim.length()];
                                            int length = strTrim.length();
                                            int i19 = i15;
                                            int i20 = i16;
                                            while (i19 < length) {
                                                int i21 = i16;
                                                int i22 = i21;
                                                int i23 = i22;
                                                int i24 = i23;
                                                int i25 = i19;
                                                while (true) {
                                                    if (i25 < strTrim.length()) {
                                                        char cCharAt2 = strTrim.charAt(i25);
                                                        i14 = i17;
                                                        if (cCharAt2 != ' ') {
                                                            c10 = 'e';
                                                            if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                                switch (cCharAt2) {
                                                                    case ',':
                                                                        break;
                                                                    case '-':
                                                                        if (i25 != i19 && i21 == 0) {
                                                                            i21 = 0;
                                                                            i23 = 1;
                                                                            i24 = 1;
                                                                            break;
                                                                        }
                                                                        i21 = 0;
                                                                        break;
                                                                    case '.':
                                                                        if (i22 != 0) {
                                                                            i21 = 0;
                                                                            i23 = 1;
                                                                            i24 = 1;
                                                                            break;
                                                                        } else {
                                                                            i21 = 0;
                                                                            i22 = 1;
                                                                            break;
                                                                        }
                                                                    default:
                                                                        i21 = 0;
                                                                        break;
                                                                }
                                                            } else {
                                                                i21 = 1;
                                                            }
                                                            if (i23 != 0) {
                                                                i25++;
                                                                i17 = i14;
                                                            }
                                                        } else {
                                                            c10 = 'e';
                                                        }
                                                        i21 = 0;
                                                        i23 = 1;
                                                        if (i23 != 0) {
                                                        }
                                                    } else {
                                                        i14 = i17;
                                                        c10 = 'e';
                                                    }
                                                }
                                                if (i19 < i25) {
                                                    fArr2[i20] = Float.parseFloat(strTrim.substring(i19, i25));
                                                    i20++;
                                                }
                                                i19 = i24 != 0 ? i25 : i25 + 1;
                                                i17 = i14;
                                                i16 = 0;
                                            }
                                            i12 = i17;
                                            if (i20 < 0) {
                                                throw new IllegalArgumentException();
                                            }
                                            int length2 = fArr2.length;
                                            if (length2 < 0) {
                                                throw new ArrayIndexOutOfBoundsException();
                                            }
                                            int iMin = Math.min(i20, length2);
                                            fArr = new float[i20];
                                            System.arraycopy(fArr2, 0, fArr, 0, iMin);
                                            i13 = 0;
                                        } catch (NumberFormatException e10) {
                                            throw new RuntimeException(n.d("error in parsing \"", strTrim, "\""), e10);
                                        }
                                    }
                                    arrayList3.add(new g.a(strTrim.charAt(i13), fArr));
                                } else {
                                    i12 = i17;
                                }
                                i17 = i12 + 1;
                                i18 = i12;
                                i15 = 1;
                                i16 = 0;
                            }
                        }
                        strTrim = strA.substring(i18, i17).trim();
                        if (strTrim.isEmpty()) {
                        }
                        i17 = i12 + 1;
                        i18 = i12;
                        i15 = 1;
                        i16 = 0;
                    }
                    if (i17 - i18 != 1 || i18 >= strA.length()) {
                        i11 = 0;
                    } else {
                        i11 = 0;
                        arrayList3.add(new g.a(strA.charAt(i18), new float[0]));
                    }
                    try {
                        g.a((g.a[]) arrayList3.toArray(new g.a[i11]), path);
                        pathInterpolator = new PathInterpolator(path);
                    } catch (RuntimeException e11) {
                        throw new RuntimeException("Error in parsing ".concat(strA), e11);
                    }
                }
            }
            animatorSet5.setInterpolator(pathInterpolator);
            this.f6321s = animatorSet5;
            animatorSet5.addListener(new pb.a(this));
            this.f6321s.start();
        }
        this.f6323v = i10;
    }

    public void setFabAlignmentModeEndMargin(int i10) {
        if (this.f6326y == i10) {
            return;
        }
        this.f6326y = i10;
        h();
        throw null;
    }

    public void setFabAnchorMode(int i10) {
        this.f6325x = i10;
        h();
        throw null;
    }

    public void setFabAnimationMode(int i10) {
        this.f6324w = i10;
    }

    public void setFabCornerSize(float f10) {
        if (f10 == getTopEdgeTreatment().f21420d) {
            return;
        }
        getTopEdgeTreatment().f21420d = f10;
        throw null;
    }

    public void setFabCradleMargin(float f10) {
        if (f10 == getFabCradleMargin()) {
            return;
        }
        getTopEdgeTreatment().f21418b = f10;
        throw null;
    }

    public void setFabCradleRoundedCornerRadius(float f10) {
        if (f10 == getFabCradleRoundedCornerRadius()) {
            return;
        }
        getTopEdgeTreatment().f21417a = f10;
        throw null;
    }

    public void setHideOnScroll(boolean z10) {
        this.A = z10;
    }

    public void setMenuAlignmentMode(int i10) {
        if (this.f6327z != i10) {
            this.f6327z = i10;
            androidx.appcompat.widget.b actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                int i11 = this.f6323v;
                e();
                actionMenuView.setTranslationX(f(actionMenuView, i11));
            }
        }
    }

    @Override // androidx.appcompat.widget.d
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f6320r != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.f6320r.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.f6320r = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.d
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.d
    public void setTitle(CharSequence charSequence) {
    }

    @Override // m3.b.a
    public Behavior getBehavior() {
        if (this.C == null) {
            this.C = new Behavior();
        }
        return this.C;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        public class a implements View.OnLayoutChangeListener {
            public a(Behavior behavior) {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                throw null;
            }
        }

        public Behavior() {
            new a(this);
            new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, m3.b.AbstractC0173b
        public final boolean h(b bVar, View view, View view2, View view3, int i10, int i11) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.h(bVar, bottomAppBar, view2, view3, i10, i11);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            new a(this);
            new Rect();
        }
    }
}
