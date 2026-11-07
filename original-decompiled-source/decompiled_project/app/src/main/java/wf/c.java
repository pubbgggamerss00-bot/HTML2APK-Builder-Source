package wf;

import com.yalantis.ucrop.view.CropImageView;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class c implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public float[] f31528a;

    public c() {
        this.f31528a = new float[]{1.0f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f};
    }

    public final Object clone() throws CloneNotSupportedException {
        float[] fArr = (float[]) this.f31528a.clone();
        c cVar = new c();
        cVar.f31528a = fArr;
        return cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            return Arrays.equals(this.f31528a, ((c) obj).f31528a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f31528a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        float[] fArr = this.f31528a;
        sb.append(fArr[0]);
        sb.append(",");
        sb.append(fArr[1]);
        sb.append(",");
        sb.append(fArr[3]);
        sb.append(",");
        sb.append(fArr[4]);
        sb.append(",");
        sb.append(fArr[6]);
        sb.append(",");
        sb.append(fArr[7]);
        sb.append("]");
        return sb.toString();
    }

    public c(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f31528a = new float[]{f10, f11, 0.0f, f12, f13, 0.0f, f14, f15, 1.0f};
    }
}
