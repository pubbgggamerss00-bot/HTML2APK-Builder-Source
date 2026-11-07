package m;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageButton;

/* loaded from: classes.dex */
public final class j extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public boolean f17142a;

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
    }

    public ColorStateList getSupportBackgroundTintList() {
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        throw null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f17142a = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        throw null;
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
    }
}
