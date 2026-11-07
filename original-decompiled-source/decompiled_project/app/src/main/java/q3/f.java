package q3;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f21888a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f21889b;

    public f(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f21888a = new int[size];
        this.f21889b = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            this.f21888a[i10] = ((Integer) arrayList.get(i10)).intValue();
            this.f21889b[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    public f(int i10, int i11) {
        this.f21888a = new int[]{i10, i11};
        this.f21889b = new float[]{CropImageView.DEFAULT_ASPECT_RATIO, 1.0f};
    }

    public f(int i10, int i11, int i12) {
        this.f21888a = new int[]{i10, i11, i12};
        this.f21889b = new float[]{CropImageView.DEFAULT_ASPECT_RATIO, 0.5f, 1.0f};
    }
}
