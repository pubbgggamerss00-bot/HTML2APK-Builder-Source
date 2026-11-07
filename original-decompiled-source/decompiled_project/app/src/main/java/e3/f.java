package e3;

import androidx.datastore.preferences.protobuf.a1;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final f f8352c = new f(a.f8356c, 17);

    /* renamed from: a, reason: collision with root package name */
    public final float f8353a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8354b;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final float f8355b;

        /* renamed from: c, reason: collision with root package name */
        public static final float f8356c;

        /* renamed from: d, reason: collision with root package name */
        public static final float f8357d;

        /* renamed from: a, reason: collision with root package name */
        public final float f8358a;

        static {
            a(CropImageView.DEFAULT_ASPECT_RATIO);
            a(0.5f);
            f8355b = 0.5f;
            a(-1.0f);
            f8356c = -1.0f;
            a(1.0f);
            f8357d = 1.0f;
        }

        public static void a(float f10) {
            if ((CropImageView.DEFAULT_ASPECT_RATIO > f10 || f10 > 1.0f) && f10 != -1.0f) {
                z2.a.b("topRatio should be in [0..1] range or -1");
            }
        }

        public static String b(float f10) {
            if (f10 == CropImageView.DEFAULT_ASPECT_RATIO) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f10 == f8355b) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f10 == f8356c) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f10 == f8357d) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f10 + ')';
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return Float.compare(this.f8358a, ((a) obj).f8358a) == 0;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.f8358a);
        }

        public final String toString() {
            return b(this.f8358a);
        }
    }

    public static final class b {
        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return "Mode(value=0)";
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f8359a;

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return this.f8359a == ((c) obj).f8359a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f8359a);
        }

        public final String toString() {
            int i10 = this.f8359a;
            return i10 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i10 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i10 == 17 ? "LineHeightStyle.Trim.Both" : i10 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }
    }

    public f(float f10, int i10) {
        this.f8353a = f10;
        this.f8354b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        float f10 = fVar.f8353a;
        float f11 = a.f8355b;
        return Float.compare(this.f8353a, f10) == 0 && this.f8354b == fVar.f8354b;
    }

    public final int hashCode() {
        float f10 = a.f8355b;
        return Integer.hashCode(0) + a1.a(this.f8354b, Float.hashCode(this.f8353a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) a.b(this.f8353a));
        sb.append(", trim=");
        int i10 = this.f8354b;
        sb.append((Object) (i10 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i10 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i10 == 17 ? "LineHeightStyle.Trim.Both" : i10 == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(",mode=Mode(value=0))");
        return sb.toString();
    }
}
