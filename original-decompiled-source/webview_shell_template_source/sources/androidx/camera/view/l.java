package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import androidx.camera.core.MeteringPointFactory;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l extends MeteringPointFactory {

    /* renamed from: d, reason: collision with root package name */
    public static final PointF f704d = new PointF(2.0f, 2.0f);

    /* renamed from: a, reason: collision with root package name */
    public final e f705a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f706b = null;

    /* renamed from: c, reason: collision with root package name */
    public Matrix f707c;

    public l(e eVar) {
        this.f705a = eVar;
    }

    @Override // androidx.camera.core.MeteringPointFactory
    public final PointF convertPoint(float f6, float f7) {
        float[] fArr = {f6, f7};
        synchronized (this) {
            try {
                Matrix matrix = this.f707c;
                if (matrix == null) {
                    return f704d;
                }
                matrix.mapPoints(fArr);
                return new PointF(fArr[0], fArr[1]);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
