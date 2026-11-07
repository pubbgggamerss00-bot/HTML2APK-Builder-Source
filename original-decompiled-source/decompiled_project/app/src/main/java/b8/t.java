package b8;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final Bitmap.Config[] f3682a = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};

    /* renamed from: b, reason: collision with root package name */
    public static final Bitmap.Config f3683b = Bitmap.Config.HARDWARE;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3684a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                l[] lVarArr = l.f3673a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                l[] lVarArr2 = l.f3673a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                l[] lVarArr3 = l.f3673a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                l[] lVarArr4 = l.f3673a;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                l[] lVarArr5 = l.f3673a;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            try {
                iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            f3684a = iArr2;
        }
    }

    public static final int a(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    public static final int b(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }
}
