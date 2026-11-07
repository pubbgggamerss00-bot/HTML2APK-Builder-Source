package l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.htmltoapk.template.R;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class e extends Button {
    public final d s;

    /* renamed from: t, reason: collision with root package name */
    public final a0 f13617t;

    /* renamed from: u, reason: collision with root package name */
    public l f13618u;

    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    private l getEmojiTextViewHelper() {
        if (this.f13618u == null) {
            this.f13618u = new l(this);
        }
        return this.f13618u;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.s;
        if (dVar != null) {
            dVar.a();
        }
        a0 a0Var = this.f13617t;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (i1.f13671c) {
            return super.getAutoSizeMaxTextSize();
        }
        a0 a0Var = this.f13617t;
        if (a0Var != null) {
            return Math.round(a0Var.f13570i.f13610e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (i1.f13671c) {
            return super.getAutoSizeMinTextSize();
        }
        a0 a0Var = this.f13617t;
        if (a0Var != null) {
            return Math.round(a0Var.f13570i.f13609d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (i1.f13671c) {
            return super.getAutoSizeStepGranularity();
        }
        a0 a0Var = this.f13617t;
        if (a0Var != null) {
            return Math.round(a0Var.f13570i.f13608c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (i1.f13671c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        a0 a0Var = this.f13617t;
        return a0Var != null ? a0Var.f13570i.f13611f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (i1.f13671c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        a0 a0Var = this.f13617t;
        if (a0Var != null) {
            return a0Var.f13570i.f13606a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return y0.d.f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.s;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.s;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f13617t.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f13617t.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        super.onLayout(z6, i6, i7, i8, i9);
        a0 a0Var = this.f13617t;
        if (a0Var == null || i1.f13671c) {
            return;
        }
        a0Var.f13570i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
        super.onTextChanged(charSequence, i6, i7, i8);
        a0 a0Var = this.f13617t;
        if (a0Var != null) {
            d0 d0Var = a0Var.f13570i;
            if (i1.f13671c || !d0Var.f()) {
                return;
            }
            d0Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().b(z6);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i6, int i7, int i8, int i9) {
        if (i1.f13671c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i6, i7, i8, i9);
            return;
        }
        a0 a0Var = this.f13617t;
        if (a0Var != null) {
            a0Var.i(i6, i7, i8, i9);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i6) {
        if (i1.f13671c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i6);
            return;
        }
        a0 a0Var = this.f13617t;
        if (a0Var != null) {
            a0Var.j(iArr, i6);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i6) {
        if (i1.f13671c) {
            super.setAutoSizeTextTypeWithDefaults(i6);
            return;
        }
        a0 a0Var = this.f13617t;
        if (a0Var != null) {
            a0Var.k(i6);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.s;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        d dVar = this.s;
        if (dVar != null) {
            dVar.f(i6);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(y0.d.g(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().c(z6);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f13695b.f12974a.a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z6) {
        a0 a0Var = this.f13617t;
        if (a0Var != null) {
            a0Var.f13563a.setAllCaps(z6);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.s;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.s;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        a0 a0Var = this.f13617t;
        a0Var.l(colorStateList);
        a0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        a0 a0Var = this.f13617t;
        a0Var.m(mode);
        a0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        a0 a0Var = this.f13617t;
        if (a0Var != null) {
            a0Var.g(context, i6);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i6, float f6) {
        boolean z6 = i1.f13671c;
        if (z6) {
            super.setTextSize(i6, f6);
            return;
        }
        a0 a0Var = this.f13617t;
        if (a0Var != null) {
            d0 d0Var = a0Var.f13570i;
            if (z6 || d0Var.f()) {
                return;
            }
            d0Var.g(f6, i6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        y0.a(context);
        w0.a(getContext(), this);
        d dVar = new d(this);
        this.s = dVar;
        dVar.d(attributeSet, i6);
        a0 a0Var = new a0(this);
        this.f13617t = a0Var;
        a0Var.f(attributeSet, i6);
        a0Var.b();
        getEmojiTextViewHelper().a(attributeSet, i6);
    }
}
