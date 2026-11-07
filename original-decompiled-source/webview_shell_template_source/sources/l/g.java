package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.htmltoapk.template.R;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g extends CheckedTextView {
    public final h s;

    /* renamed from: t, reason: collision with root package name */
    public final d f13631t;

    /* renamed from: u, reason: collision with root package name */
    public final a0 f13632u;

    /* renamed from: v, reason: collision with root package name */
    public l f13633v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        y0.a(context);
        w0.a(getContext(), this);
        a0 a0Var = new a0(this);
        this.f13632u = a0Var;
        a0Var.f(attributeSet, R.attr.checkedTextViewStyle);
        a0Var.b();
        d dVar = new d(this);
        this.f13631t = dVar;
        dVar.d(attributeSet, R.attr.checkedTextViewStyle);
        this.s = new h(this);
        Context context2 = getContext();
        int[] iArr = f.a.f12944l;
        b1 b1VarE = b1.e(R.attr.checkedTextViewStyle, 0, context2, attributeSet, iArr);
        TypedArray typedArray = b1VarE.f13583b;
        u0.f0.l(this, getContext(), iArr, attributeSet, b1VarE.f13583b, R.attr.checkedTextViewStyle, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(y5.b0.d(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(y5.b0.d(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(b1VarE.a(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(h0.b(typedArray.getInt(3, -1), null));
            }
            b1VarE.f();
            getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            b1VarE.f();
            throw th;
        }
    }

    private l getEmojiTextViewHelper() {
        if (this.f13633v == null) {
            this.f13633v = new l(this);
        }
        return this.f13633v;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        a0 a0Var = this.f13632u;
        if (a0Var != null) {
            a0Var.b();
        }
        d dVar = this.f13631t;
        if (dVar != null) {
            dVar.a();
        }
        h hVar = this.s;
        if (hVar != null) {
            hVar.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return y0.d.f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f13631t;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f13631t;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        h hVar = this.s;
        if (hVar != null) {
            return hVar.f13642b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        h hVar = this.s;
        if (hVar != null) {
            return hVar.f13643c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f13632u.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f13632u.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        androidx.activity.c0.h(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().b(z6);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f13631t;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        d dVar = this.f13631t;
        if (dVar != null) {
            dVar.f(i6);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        h hVar = this.s;
        if (hVar != null) {
            if (hVar.f13646f) {
                hVar.f13646f = false;
            } else {
                hVar.f13646f = true;
                hVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.f13632u;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.f13632u;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(y0.d.g(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().c(z6);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f13631t;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f13631t;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        h hVar = this.s;
        if (hVar != null) {
            hVar.f13642b = colorStateList;
            hVar.f13644d = true;
            hVar.a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        h hVar = this.s;
        if (hVar != null) {
            hVar.f13643c = mode;
            hVar.f13645e = true;
            hVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        a0 a0Var = this.f13632u;
        a0Var.l(colorStateList);
        a0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        a0 a0Var = this.f13632u;
        a0Var.m(mode);
        a0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        a0 a0Var = this.f13632u;
        if (a0Var != null) {
            a0Var.g(context, i6);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i6) {
        setCheckMarkDrawable(y5.b0.d(getContext(), i6));
    }
}
