package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.htmltoapk.template.R;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class f extends CheckBox implements y0.f {
    public final i s;

    /* renamed from: t, reason: collision with root package name */
    public final d f13621t;

    /* renamed from: u, reason: collision with root package name */
    public final a0 f13622u;

    /* renamed from: v, reason: collision with root package name */
    public l f13623v;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    private l getEmojiTextViewHelper() {
        if (this.f13623v == null) {
            this.f13623v = new l(this);
        }
        return this.f13623v;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f13621t;
        if (dVar != null) {
            dVar.a();
        }
        a0 a0Var = this.f13622u;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f13621t;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f13621t;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    @Override // y0.f
    public ColorStateList getSupportButtonTintList() {
        i iVar = this.s;
        if (iVar != null) {
            return iVar.f13651b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i iVar = this.s;
        if (iVar != null) {
            return iVar.f13652c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f13622u.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f13622u.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().b(z6);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f13621t;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        d dVar = this.f13621t;
        if (dVar != null) {
            dVar.f(i6);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        i iVar = this.s;
        if (iVar != null) {
            if (iVar.f13655f) {
                iVar.f13655f = false;
            } else {
                iVar.f13655f = true;
                iVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.f13622u;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.f13622u;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().c(z6);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f13695b.f12974a.a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f13621t;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f13621t;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    @Override // y0.f
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        i iVar = this.s;
        if (iVar != null) {
            iVar.f13651b = colorStateList;
            iVar.f13653d = true;
            iVar.a();
        }
    }

    @Override // y0.f
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        i iVar = this.s;
        if (iVar != null) {
            iVar.f13652c = mode;
            iVar.f13654e = true;
            iVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        a0 a0Var = this.f13622u;
        a0Var.l(colorStateList);
        a0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        a0 a0Var = this.f13622u;
        a0Var.m(mode);
        a0Var.b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        y0.a(context);
        w0.a(getContext(), this);
        i iVar = new i(this);
        this.s = iVar;
        iVar.b(attributeSet, i6);
        d dVar = new d(this);
        this.f13621t = dVar;
        dVar.d(attributeSet, i6);
        a0 a0Var = new a0(this);
        this.f13622u = a0Var;
        a0Var.f(attributeSet, i6);
        getEmojiTextViewHelper().a(attributeSet, i6);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i6) {
        setButtonDrawable(y5.b0.d(getContext(), i6));
    }
}
