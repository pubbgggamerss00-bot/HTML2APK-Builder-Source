package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p extends MultiAutoCompleteTextView {

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f13712v = {R.attr.popupBackground};
    public final d s;

    /* renamed from: t, reason: collision with root package name */
    public final a0 f13713t;

    /* renamed from: u, reason: collision with root package name */
    public final com.google.android.gms.ads.mediation.customevent.a f13714u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.htmltoapk.template.R.attr.autoCompleteTextViewStyle);
        y0.a(context);
        w0.a(getContext(), this);
        b1 b1VarE = b1.e(com.htmltoapk.template.R.attr.autoCompleteTextViewStyle, 0, getContext(), attributeSet, f13712v);
        if (b1VarE.f13583b.hasValue(0)) {
            setDropDownBackgroundDrawable(b1VarE.b(0));
        }
        b1VarE.f();
        d dVar = new d(this);
        this.s = dVar;
        dVar.d(attributeSet, com.htmltoapk.template.R.attr.autoCompleteTextViewStyle);
        a0 a0Var = new a0(this);
        this.f13713t = a0Var;
        a0Var.f(attributeSet, com.htmltoapk.template.R.attr.autoCompleteTextViewStyle);
        a0Var.b();
        com.google.android.gms.ads.mediation.customevent.a aVar = new com.google.android.gms.ads.mediation.customevent.a(this);
        this.f13714u = aVar;
        aVar.d(attributeSet, com.htmltoapk.template.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerC = aVar.c(keyListener);
        if (keyListenerC == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerC);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.s;
        if (dVar != null) {
            dVar.a();
        }
        a0 a0Var = this.f13713t;
        if (a0Var != null) {
            a0Var.b();
        }
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
        return this.f13713t.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f13713t.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        androidx.activity.c0.h(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.f13714u.e(inputConnectionOnCreateInputConnection, editorInfo);
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
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.f13713t;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.f13713t;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i6) {
        setDropDownBackgroundDrawable(y5.b0.d(getContext(), i6));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        this.f13714u.f(z6);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f13714u.c(keyListener));
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
        a0 a0Var = this.f13713t;
        a0Var.l(colorStateList);
        a0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        a0 a0Var = this.f13713t;
        a0Var.m(mode);
        a0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        a0 a0Var = this.f13713t;
        if (a0Var != null) {
            a0Var.g(context, i6);
        }
    }
}
