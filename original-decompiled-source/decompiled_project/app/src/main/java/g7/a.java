package g7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f11477a;

    public a(Bitmap bitmap) {
        this.f11477a = bitmap;
    }

    @Override // g7.l
    public final int a() {
        return this.f11477a.getWidth();
    }

    @Override // g7.l
    public final boolean b() {
        return true;
    }

    @Override // g7.l
    public final void c(Canvas canvas) {
        canvas.drawBitmap(this.f11477a, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, (Paint) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && kotlin.jvm.internal.r.a(this.f11477a, ((a) obj).f11477a);
    }

    @Override // g7.l
    public final int getHeight() {
        return this.f11477a.getHeight();
    }

    @Override // g7.l
    public final long getSize() {
        int allocationByteCount;
        Bitmap bitmap = this.f11477a;
        if (!bitmap.isRecycled()) {
            try {
                allocationByteCount = bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                allocationByteCount = (config == Bitmap.Config.ALPHA_8 ? 1 : (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) ? 2 : config == Bitmap.Config.RGBA_F16 ? 8 : 4) * height;
            }
            return allocationByteCount;
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f11477a.hashCode() * 31);
    }

    public final String toString() {
        return "BitmapImage(bitmap=" + this.f11477a + ", shareable=true)";
    }
}
