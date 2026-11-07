package g3;

import com.yalantis.ucrop.view.CropImageView;
import java.util.Arrays;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class c implements g3.a {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f11464a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f11465b;

    public static final class a {
        public static final float a(float f10, float[] fArr, float[] fArr2) {
            float f11;
            float f12;
            float f13;
            float f14;
            float fAbs = Math.abs(f10);
            float fSignum = Math.signum(f10);
            int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
            if (iBinarySearch >= 0) {
                return fSignum * fArr2[iBinarySearch];
            }
            int i10 = -(iBinarySearch + 1);
            int i11 = i10 - 1;
            if (i11 >= fArr.length - 1) {
                float f15 = fArr[fArr.length - 1];
                return f15 == CropImageView.DEFAULT_ASPECT_RATIO ? CropImageView.DEFAULT_ASPECT_RATIO : (fArr2[fArr.length - 1] / f15) * f10;
            }
            if (i11 == -1) {
                float f16 = fArr[0];
                f13 = fArr2[0];
                f14 = f16;
                f12 = 0.0f;
                f11 = 0.0f;
            } else {
                float f17 = fArr[i11];
                float f18 = fArr[i10];
                f11 = fArr2[i11];
                f12 = f17;
                f13 = fArr2[i10];
                f14 = f18;
            }
            return (((f13 - f11) * Math.max(CropImageView.DEFAULT_ASPECT_RATIO, Math.min(1.0f, f12 == f14 ? 0.0f : (fAbs - f12) / (f14 - f12)))) + f11) * fSignum;
        }
    }

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f11464a = fArr;
        this.f11465b = fArr2;
    }

    @Override // g3.a
    public final float a(float f10) {
        return a.a(f10, this.f11465b, this.f11464a);
    }

    @Override // g3.a
    public final float b(float f10) {
        return a.a(f10, this.f11464a, this.f11465b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f11464a, cVar.f11464a) && Arrays.equals(this.f11465b, cVar.f11465b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f11465b) + (Arrays.hashCode(this.f11464a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f11464a);
        r.d(string, "toString(...)");
        sb.append(string);
        sb.append(", toDpValues=");
        String string2 = Arrays.toString(this.f11465b);
        r.d(string2, "toString(...)");
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }
}
