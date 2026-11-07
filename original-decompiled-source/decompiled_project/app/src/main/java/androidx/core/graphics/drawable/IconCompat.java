package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f1400k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public Object f1402b;

    /* renamed from: j, reason: collision with root package name */
    public String f1410j;

    /* renamed from: a, reason: collision with root package name */
    public int f1401a = -1;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f1403c = null;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f1404d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f1405e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f1406f = 0;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f1407g = null;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f1408h = f1400k;

    /* renamed from: i, reason: collision with root package name */
    public String f1409i = null;

    public static class a {
        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public static IconCompat a(Resources resources, String str, int i10) {
        str.getClass();
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1403c = null;
        iconCompat.f1404d = null;
        iconCompat.f1406f = 0;
        iconCompat.f1407g = null;
        iconCompat.f1408h = f1400k;
        iconCompat.f1409i = null;
        iconCompat.f1401a = 2;
        iconCompat.f1405e = i10;
        if (resources != null) {
            try {
                iconCompat.f1402b = resources.getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f1402b = str;
        }
        iconCompat.f1410j = str;
        return iconCompat;
    }

    public final int b() {
        int i10 = this.f1401a;
        if (i10 == -1) {
            return ((Icon) this.f1402b).getResId();
        }
        if (i10 == 2) {
            return this.f1405e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public final Uri c() {
        int i10 = this.f1401a;
        if (i10 == -1) {
            return ((Icon) this.f1402b).getUri();
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f1402b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final String toString() {
        String str;
        if (this.f1401a == -1) {
            return String.valueOf(this.f1402b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f1401a) {
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
        switch (this.f1401a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1402b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f1402b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f1410j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(b())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f1405e);
                if (this.f1406f != 0) {
                    sb.append(" off=");
                    sb.append(this.f1406f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f1402b);
                break;
        }
        if (this.f1407g != null) {
            sb.append(" tint=");
            sb.append(this.f1407g);
        }
        if (this.f1408h != f1400k) {
            sb.append(" mode=");
            sb.append(this.f1408h);
        }
        sb.append(")");
        return sb.toString();
    }
}
