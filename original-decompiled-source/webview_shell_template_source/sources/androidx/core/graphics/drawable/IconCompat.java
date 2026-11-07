package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f965k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f966a;

    /* renamed from: b, reason: collision with root package name */
    public Object f967b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f968c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f969d;

    /* renamed from: e, reason: collision with root package name */
    public int f970e;

    /* renamed from: f, reason: collision with root package name */
    public int f971f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f972g;
    public PorterDuff.Mode h;

    /* renamed from: i, reason: collision with root package name */
    public String f973i;

    /* renamed from: j, reason: collision with root package name */
    public String f974j;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {
        public static Icon a(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b {
        public static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        public static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        public static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        public static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c {
        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f966a = -1;
        this.f968c = null;
        this.f969d = null;
        this.f970e = 0;
        this.f971f = 0;
        this.f972g = null;
        this.h = f965k;
        this.f973i = null;
    }

    public static Bitmap a(Bitmap bitmap, boolean z6) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f6 = iMin;
        float f7 = 0.5f * f6;
        float f8 = 0.9166667f * f7;
        if (z6) {
            float f9 = 0.010416667f * f6;
            paint.setColor(0);
            paint.setShadowLayer(f9, 0.0f, f6 * 0.020833334f, 1023410176);
            canvas.drawCircle(f7, f7, f8, paint);
            paint.setShadowLayer(f9, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f7, f7, f8, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f7, f7, f8, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat b(Resources resources, String str, int i6) {
        str.getClass();
        if (i6 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f970e = i6;
        if (resources != null) {
            try {
                iconCompat.f967b = resources.getResourceName(i6);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f967b = str;
        }
        iconCompat.f974j = str;
        return iconCompat;
    }

    public final int c() {
        int i6 = this.f966a;
        if (i6 != -1) {
            if (i6 == 2) {
                return this.f970e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i7 = Build.VERSION.SDK_INT;
        Object obj = this.f967b;
        if (i7 >= 28) {
            return b.a(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e6) {
            Log.e("IconCompat", "Unable to get icon resource", e6);
            return 0;
        } catch (NoSuchMethodException e7) {
            Log.e("IconCompat", "Unable to get icon resource", e7);
            return 0;
        } catch (InvocationTargetException e8) {
            Log.e("IconCompat", "Unable to get icon resource", e8);
            return 0;
        }
    }

    public final int d() {
        int i6 = this.f966a;
        if (i6 != -1) {
            return i6;
        }
        int i7 = Build.VERSION.SDK_INT;
        Object obj = this.f967b;
        if (i7 >= 28) {
            return b.c(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e6) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e6);
            return -1;
        } catch (NoSuchMethodException e7) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e7);
            return -1;
        } catch (InvocationTargetException e8) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e8);
            return -1;
        }
    }

    public final Uri e() {
        int i6 = this.f966a;
        if (i6 != -1) {
            if (i6 == 4 || i6 == 6) {
                return Uri.parse((String) this.f967b);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        int i7 = Build.VERSION.SDK_INT;
        Object obj = this.f967b;
        if (i7 >= 28) {
            return b.d(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e6) {
            Log.e("IconCompat", "Unable to get icon uri", e6);
            return null;
        } catch (NoSuchMethodException e7) {
            Log.e("IconCompat", "Unable to get icon uri", e7);
            return null;
        } catch (InvocationTargetException e8) {
            Log.e("IconCompat", "Unable to get icon uri", e8);
            return null;
        }
    }

    public final Icon f(Context context) throws FileNotFoundException {
        Icon iconCreateWithBitmap;
        int i6 = Build.VERSION.SDK_INT;
        int i7 = this.f966a;
        String strB = null;
        inputStreamOpenInputStream = null;
        InputStream inputStreamOpenInputStream = null;
        strB = null;
        strB = null;
        switch (i7) {
            case -1:
                return (Icon) this.f967b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) this.f967b);
                break;
            case 2:
                if (i7 == -1) {
                    Object obj = this.f967b;
                    if (i6 >= 28) {
                        strB = b.b(obj);
                    } else {
                        try {
                            strB = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException e6) {
                            Log.e("IconCompat", "Unable to get icon package", e6);
                        } catch (NoSuchMethodException e7) {
                            Log.e("IconCompat", "Unable to get icon package", e7);
                        } catch (InvocationTargetException e8) {
                            Log.e("IconCompat", "Unable to get icon package", e8);
                        }
                    }
                } else {
                    if (i7 != 2) {
                        throw new IllegalStateException("called getResPackage() on " + this);
                    }
                    String str = this.f974j;
                    strB = (str == null || TextUtils.isEmpty(str)) ? ((String) this.f967b).split(":", -1)[0] : this.f974j;
                }
                iconCreateWithBitmap = Icon.createWithResource(strB, this.f970e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) this.f967b, this.f970e, this.f971f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) this.f967b);
                break;
            case 5:
                if (i6 < 26) {
                    iconCreateWithBitmap = Icon.createWithBitmap(a((Bitmap) this.f967b, false));
                    break;
                } else {
                    iconCreateWithBitmap = a.a((Bitmap) this.f967b);
                    break;
                }
            case 6:
                if (i6 >= 30) {
                    iconCreateWithBitmap = c.a(e());
                    break;
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + e());
                    }
                    Uri uriE = e();
                    String scheme = uriE.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriE);
                        } catch (Exception e9) {
                            Log.w("IconCompat", "Unable to load image from URI: " + uriE, e9);
                        }
                    } else {
                        try {
                            inputStreamOpenInputStream = new FileInputStream(new File((String) this.f967b));
                        } catch (FileNotFoundException e10) {
                            Log.w("IconCompat", "Unable to load image from path: " + uriE, e10);
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + e());
                    }
                    if (Build.VERSION.SDK_INT < 26) {
                        iconCreateWithBitmap = Icon.createWithBitmap(a(BitmapFactory.decodeStream(inputStreamOpenInputStream), false));
                        break;
                    } else {
                        iconCreateWithBitmap = a.a(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                        break;
                    }
                }
                break;
        }
        ColorStateList colorStateList = this.f972g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.h;
        if (mode != f965k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.f966a == -1) {
            return String.valueOf(this.f967b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f966a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f966a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f967b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f967b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f974j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f970e);
                if (this.f971f != 0) {
                    sb.append(" off=");
                    sb.append(this.f971f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f967b);
                break;
        }
        if (this.f972g != null) {
            sb.append(" tint=");
            sb.append(this.f972g);
        }
        if (this.h != f965k) {
            sb.append(" mode=");
            sb.append(this.h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i6) {
        this.f968c = null;
        this.f969d = null;
        this.f970e = 0;
        this.f971f = 0;
        this.f972g = null;
        this.h = f965k;
        this.f973i = null;
        this.f966a = i6;
    }
}
