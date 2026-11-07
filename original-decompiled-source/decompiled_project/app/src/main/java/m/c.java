package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import c4.d;
import z4.a;

/* loaded from: classes.dex */
public class c extends AutoCompleteTextView {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f17105d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final d f17106a;

    /* renamed from: b, reason: collision with root package name */
    public final p f17107b;

    /* renamed from: c, reason: collision with root package name */
    public final g f17108c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        super(context, attributeSet, i10);
        g0.a(context);
        f0.a(getContext(), this);
        j0 j0VarD = j0.d(getContext(), attributeSet, f17105d, i10);
        if (j0VarD.f17144b.hasValue(0)) {
            setDropDownBackgroundDrawable(j0VarD.b(0));
        }
        j0VarD.e();
        d dVar = new d(this);
        this.f17106a = dVar;
        dVar.b(attributeSet, i10);
        p pVar = new p(this);
        this.f17107b = pVar;
        pVar.d(attributeSet, i10);
        pVar.b();
        g gVar = new g(this);
        this.f17108c = gVar;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.a.f11246e, i10, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            gVar.b(z10);
            KeyListener keyListener = getKeyListener();
            if (keyListener instanceof NumberKeyListener) {
                return;
            }
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerA = gVar.a(keyListener);
            if (keyListenerA == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerA);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f17106a;
        if (dVar != null) {
            dVar.a();
        }
        p pVar = this.f17107b;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        if (customSelectionActionModeCallback instanceof d.b) {
            throw null;
        }
        return customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        h0 h0Var;
        d dVar = this.f17106a;
        if (dVar == null || (h0Var = dVar.f17113e) == null) {
            return null;
        }
        return h0Var.f17138a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        h0 h0Var;
        d dVar = this.f17106a;
        if (dVar == null || (h0Var = dVar.f17113e) == null) {
            return null;
        }
        return h0Var.f17139b;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        h0 h0Var = this.f17107b.f17159h;
        if (h0Var != null) {
            return h0Var.f17138a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        h0 h0Var = this.f17107b.f17159h;
        if (h0Var != null) {
            return h0Var.f17139b;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        i.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        z4.a aVar = this.f17108c.f17134a;
        if (inputConnectionOnCreateInputConnection == null) {
            aVar.getClass();
            return null;
        }
        a.C0354a c0354a = aVar.f34744a;
        c0354a.getClass();
        return inputConnectionOnCreateInputConnection instanceof z4.c ? inputConnectionOnCreateInputConnection : new z4.c(c0354a.f34745a, inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f17106a;
        if (dVar != null) {
            dVar.f17111c = -1;
            dVar.d(null);
            dVar.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        d dVar = this.f17106a;
        if (dVar != null) {
            dVar.c(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f17107b;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f17107b;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(i.a.c(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f17108c.b(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f17108c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f17106a;
        if (dVar != null) {
            dVar.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f17106a;
        if (dVar != null) {
            dVar.f(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        p pVar = this.f17107b;
        if (pVar.f17159h == null) {
            pVar.f17159h = new h0();
        }
        h0 h0Var = pVar.f17159h;
        h0Var.f17138a = colorStateList;
        h0Var.f17141d = colorStateList != null;
        pVar.f17153b = h0Var;
        pVar.f17154c = h0Var;
        pVar.f17155d = h0Var;
        pVar.f17156e = h0Var;
        pVar.f17157f = h0Var;
        pVar.f17158g = h0Var;
        pVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        p pVar = this.f17107b;
        if (pVar.f17159h == null) {
            pVar.f17159h = new h0();
        }
        h0 h0Var = pVar.f17159h;
        h0Var.f17139b = mode;
        h0Var.f17140c = mode != null;
        pVar.f17153b = h0Var;
        pVar.f17154c = h0Var;
        pVar.f17155d = h0Var;
        pVar.f17156e = h0Var;
        pVar.f17157f = h0Var;
        pVar.f17158g = h0Var;
        pVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) throws Resources.NotFoundException {
        super.setTextAppearance(context, i10);
        p pVar = this.f17107b;
        if (pVar != null) {
            pVar.e(context, i10);
        }
    }
}
