package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.htmltoapk.template.R;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class m extends ImageButton {
    public final d s;

    /* renamed from: t, reason: collision with root package name */
    public final n f13696t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f13697u;

    public m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.s;
        if (dVar != null) {
            dVar.a();
        }
        n nVar = this.f13696t;
        if (nVar != null) {
            nVar.a();
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

    public ColorStateList getSupportImageTintList() {
        z0 z0Var;
        n nVar = this.f13696t;
        if (nVar == null || (z0Var = nVar.f13708b) == null) {
            return null;
        }
        return z0Var.f13765a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        z0 z0Var;
        n nVar = this.f13696t;
        if (nVar == null || (z0Var = nVar.f13708b) == null) {
            return null;
        }
        return z0Var.f13766b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(this.f13696t.f13707a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
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

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        n nVar = this.f13696t;
        if (nVar != null) {
            nVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        n nVar = this.f13696t;
        if (nVar != null && drawable != null && !this.f13697u) {
            nVar.f13709c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (nVar != null) {
            nVar.a();
            if (this.f13697u) {
                return;
            }
            ImageView imageView = nVar.f13707a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(nVar.f13709c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i6) {
        super.setImageLevel(i6);
        this.f13697u = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i6) {
        n nVar = this.f13696t;
        ImageView imageView = nVar.f13707a;
        if (i6 != 0) {
            Drawable drawableD = y5.b0.d(imageView.getContext(), i6);
            if (drawableD != null) {
                h0.a(drawableD);
            }
            imageView.setImageDrawable(drawableD);
        } else {
            imageView.setImageDrawable(null);
        }
        nVar.a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        n nVar = this.f13696t;
        if (nVar != null) {
            nVar.a();
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

    public void setSupportImageTintList(ColorStateList colorStateList) {
        n nVar = this.f13696t;
        if (nVar != null) {
            if (nVar.f13708b == null) {
                nVar.f13708b = new z0();
            }
            z0 z0Var = nVar.f13708b;
            z0Var.f13765a = colorStateList;
            z0Var.f13768d = true;
            nVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        n nVar = this.f13696t;
        if (nVar != null) {
            if (nVar.f13708b == null) {
                nVar.f13708b = new z0();
            }
            z0 z0Var = nVar.f13708b;
            z0Var.f13766b = mode;
            z0Var.f13767c = true;
            nVar.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        y0.a(context);
        this.f13697u = false;
        w0.a(getContext(), this);
        d dVar = new d(this);
        this.s = dVar;
        dVar.d(attributeSet, i6);
        n nVar = new n(this);
        this.f13696t = nVar;
        nVar.b(attributeSet, i6);
    }
}
