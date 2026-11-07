package androidx.camera.core.impl.utils;

import android.util.Size;
import java.util.Comparator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class CompareSizesByArea implements Comparator<Size> {
    private boolean mReverse;

    public CompareSizesByArea() {
        this(false);
    }

    public CompareSizesByArea(boolean z6) {
        this.mReverse = z6;
    }

    @Override // java.util.Comparator
    public int compare(Size size, Size size2) {
        int iSignum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        return this.mReverse ? iSignum * (-1) : iSignum;
    }
}
