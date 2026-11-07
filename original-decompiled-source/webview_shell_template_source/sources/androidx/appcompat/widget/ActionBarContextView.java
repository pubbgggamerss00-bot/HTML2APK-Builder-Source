package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.a;
import com.htmltoapk.template.R;
import l.i1;
import u0.f0;
import y5.b0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class ActionBarContextView extends l.a {
    public CharSequence A;
    public CharSequence B;
    public View C;
    public View D;
    public View E;
    public LinearLayout F;
    public TextView G;
    public TextView H;
    public final int I;
    public final int J;
    public boolean K;
    public final int L;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements View.OnClickListener {
        public final /* synthetic */ j.a s;

        public a(j.a aVar) {
            this.s = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.s.c();
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f12937d, R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : b0.d(context, resourceId));
        this.I = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.J = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f13557w = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.L = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void f(j.a aVar) {
        View view = this.C;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.L, (ViewGroup) this, false);
            this.C = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.C);
        }
        View viewFindViewById = this.C.findViewById(R.id.action_mode_close_button);
        this.D = viewFindViewById;
        viewFindViewById.setOnClickListener(new a(aVar));
        f fVarE = aVar.e();
        androidx.appcompat.widget.a aVar2 = this.f13556v;
        if (aVar2 != null) {
            aVar2.f();
            a.C0007a c0007a = aVar2.L;
            if (c0007a != null && c0007a.b()) {
                c0007a.f227j.dismiss();
            }
        }
        androidx.appcompat.widget.a aVar3 = new androidx.appcompat.widget.a(getContext());
        this.f13556v = aVar3;
        aVar3.D = true;
        aVar3.E = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        fVarE.b(this.f13556v, this.f13554t);
        androidx.appcompat.widget.a aVar4 = this.f13556v;
        k kVar = aVar4.f144z;
        if (kVar == null) {
            k kVar2 = (k) aVar4.f140v.inflate(aVar4.f142x, (ViewGroup) this, false);
            aVar4.f144z = kVar2;
            kVar2.b(aVar4.f139u);
            aVar4.h();
        }
        k kVar3 = aVar4.f144z;
        if (kVar != kVar3) {
            ((ActionMenuView) kVar3).setPresenter(aVar4);
        }
        ActionMenuView actionMenuView = (ActionMenuView) kVar3;
        this.f13555u = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f13555u, layoutParams);
    }

    public final void g() {
        if (this.F == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.F = linearLayout;
            this.G = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.H = (TextView) this.F.findViewById(R.id.action_bar_subtitle);
            int i6 = this.I;
            if (i6 != 0) {
                this.G.setTextAppearance(getContext(), i6);
            }
            int i7 = this.J;
            if (i7 != 0) {
                this.H.setTextAppearance(getContext(), i7);
            }
        }
        this.G.setText(this.A);
        this.H.setText(this.B);
        boolean zIsEmpty = TextUtils.isEmpty(this.A);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.B);
        this.H.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.F.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.F.getParent() == null) {
            addView(this.F);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // l.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // l.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.B;
    }

    public CharSequence getTitle() {
        return this.A;
    }

    public final void h() {
        removeAllViews();
        this.E = null;
        this.f13555u = null;
        this.f13556v = null;
        View view = this.D;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.a aVar = this.f13556v;
        if (aVar != null) {
            aVar.f();
            a.C0007a c0007a = this.f13556v.L;
            if (c0007a == null || !c0007a.b()) {
                return;
            }
            c0007a.f227j.dismiss();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        boolean z7 = i1.f13669a;
        boolean z8 = getLayoutDirection() == 1;
        int paddingRight = z8 ? (i8 - i6) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i9 - i7) - getPaddingTop()) - getPaddingBottom();
        View view = this.C;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.C.getLayoutParams();
            int i10 = z8 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i11 = z8 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i12 = z8 ? paddingRight - i10 : paddingRight + i10;
            int iD = l.a.d(this.C, i12, z8, paddingTop, paddingTop2) + i12;
            paddingRight = z8 ? iD - i11 : iD + i11;
        }
        LinearLayout linearLayout = this.F;
        if (linearLayout != null && this.E == null && linearLayout.getVisibility() != 8) {
            paddingRight += l.a.d(this.F, paddingRight, z8, paddingTop, paddingTop2);
        }
        View view2 = this.E;
        if (view2 != null) {
            l.a.d(view2, paddingRight, z8, paddingTop, paddingTop2);
        }
        int paddingLeft = z8 ? getPaddingLeft() : (i8 - i6) - getPaddingRight();
        ActionMenuView actionMenuView = this.f13555u;
        if (actionMenuView != null) {
            l.a.d(actionMenuView, paddingLeft, !z8, paddingTop, paddingTop2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i7) {
        if (View.MeasureSpec.getMode(i6) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i7) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i6);
        int size2 = this.f13557w;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i7);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.C;
        if (view != null) {
            int iC = l.a.c(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.C.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f13555u;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = l.a.c(this.f13555u, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.F;
        if (linearLayout != null && this.E == null) {
            if (this.K) {
                this.F.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.F.getMeasuredWidth();
                boolean z6 = measuredWidth <= paddingLeft;
                if (z6) {
                    paddingLeft -= measuredWidth;
                }
                this.F.setVisibility(z6 ? 0 : 8);
            } else {
                paddingLeft = l.a.c(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.E;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i8 = layoutParams.width;
            int i9 = i8 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i8 >= 0) {
                paddingLeft = Math.min(i8, paddingLeft);
            }
            int i10 = layoutParams.height;
            int i11 = i10 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i10 >= 0) {
                iMin = Math.min(i10, iMin);
            }
            this.E.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i9), View.MeasureSpec.makeMeasureSpec(iMin, i11));
        }
        if (this.f13557w > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            int measuredHeight = getChildAt(i13).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i12) {
                i12 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i12);
    }

    @Override // l.a
    public void setContentHeight(int i6) {
        this.f13557w = i6;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.E;
        if (view2 != null) {
            removeView(view2);
        }
        this.E = view;
        if (view != null && (linearLayout = this.F) != null) {
            removeView(linearLayout);
            this.F = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.B = charSequence;
        g();
    }

    public void setTitle(CharSequence charSequence) {
        this.A = charSequence;
        g();
        f0.n(this, charSequence);
    }

    public void setTitleOptional(boolean z6) {
        if (z6 != this.K) {
            requestLayout();
        }
        this.K = z6;
    }

    @Override // l.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i6) {
        super.setVisibility(i6);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
