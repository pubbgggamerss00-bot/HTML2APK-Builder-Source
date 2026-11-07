package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import y3.q0;

/* loaded from: classes.dex */
public class l extends ImageView {
    private final d mBackgroundTintHelper;
    private boolean mHasLevel;
    private final k mImageHelper;

    public l(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.a();
        }
        k kVar = this.mImageHelper;
        if (kVar != null) {
            kVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        h0 h0Var;
        d dVar = this.mBackgroundTintHelper;
        if (dVar == null || (h0Var = dVar.f17113e) == null) {
            return null;
        }
        return h0Var.f17138a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        h0 h0Var;
        d dVar = this.mBackgroundTintHelper;
        if (dVar == null || (h0Var = dVar.f17113e) == null) {
            return null;
        }
        return h0Var.f17139b;
    }

    public ColorStateList getSupportImageTintList() {
        h0 h0Var;
        k kVar = this.mImageHelper;
        if (kVar == null || (h0Var = kVar.f17147b) == null) {
            return null;
        }
        return h0Var.f17138a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        h0 h0Var;
        k kVar = this.mImageHelper;
        if (kVar == null || (h0Var = kVar.f17147b) == null) {
            return null;
        }
        return h0Var.f17139b;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return !(this.mImageHelper.f17146a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.f17111c = -1;
            dVar.d(null);
            dVar.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.c(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        k kVar = this.mImageHelper;
        if (kVar != null) {
            kVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        k kVar = this.mImageHelper;
        if (kVar != null && drawable != null && !this.mHasLevel) {
            kVar.f17148c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        k kVar2 = this.mImageHelper;
        if (kVar2 != null) {
            kVar2.a();
            if (this.mHasLevel) {
                return;
            }
            k kVar3 = this.mImageHelper;
            ImageView imageView = kVar3.f17146a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(kVar3.f17148c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        k kVar = this.mImageHelper;
        if (kVar != null) {
            ImageView imageView = kVar.f17146a;
            if (i10 != 0) {
                Drawable drawableC = i.a.c(imageView.getContext(), i10);
                if (drawableC != null) {
                    u.a(drawableC);
                }
                imageView.setImageDrawable(drawableC);
            } else {
                imageView.setImageDrawable(null);
            }
            kVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        k kVar = this.mImageHelper;
        if (kVar != null) {
            kVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.f(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        k kVar = this.mImageHelper;
        if (kVar != null) {
            if (kVar.f17147b == null) {
                kVar.f17147b = new h0();
            }
            h0 h0Var = kVar.f17147b;
            h0Var.f17138a = colorStateList;
            h0Var.f17141d = true;
            kVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        k kVar = this.mImageHelper;
        if (kVar != null) {
            if (kVar.f17147b == null) {
                kVar.f17147b = new h0();
            }
            h0 h0Var = kVar.f17147b;
            h0Var.f17139b = mode;
            h0Var.f17140c = true;
            kVar.a();
        }
    }

    public l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, AttributeSet attributeSet, int i10) {
        int resourceId;
        super(context, attributeSet, i10);
        g0.a(context);
        this.mHasLevel = false;
        f0.a(getContext(), this);
        d dVar = new d(this);
        this.mBackgroundTintHelper = dVar;
        dVar.b(attributeSet, i10);
        k kVar = new k(this);
        this.mImageHelper = kVar;
        ImageView imageView = kVar.f17146a;
        Context context2 = imageView.getContext();
        int[] iArr = g.a.f11244c;
        j0 j0VarD = j0.d(context2, attributeSet, iArr, i10);
        TypedArray typedArray = j0VarD.f17144b;
        q0.g(imageView, imageView.getContext(), iArr, attributeSet, j0VarD.f17144b, i10);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = i.a.c(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                u.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(j0VarD.a(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(u.b(typedArray.getInt(3, -1), null));
            }
            j0VarD.e();
        } catch (Throwable th2) {
            j0VarD.e();
            throw th2;
        }
    }
}
