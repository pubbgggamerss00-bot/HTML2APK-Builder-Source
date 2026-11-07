package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.view.PreviewView;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public Size f685a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f686b;

    /* renamed from: c, reason: collision with root package name */
    public int f687c;

    /* renamed from: d, reason: collision with root package name */
    public Matrix f688d;

    /* renamed from: e, reason: collision with root package name */
    public int f689e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f690f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f691g;
    public PreviewView.e h;

    public final Matrix a(Size size, Rect rect, int i6) {
        Matrix matrix = null;
        if (!f()) {
            return null;
        }
        Matrix matrix2 = new Matrix();
        if (f()) {
            matrix = new Matrix(this.f688d);
            matrix.postConcat(c(size, i6));
        }
        matrix.invert(matrix2);
        Matrix matrix3 = new Matrix();
        matrix3.setRectToRect(new RectF(0.0f, 0.0f, rect.width(), rect.height()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix2.postConcat(matrix3);
        return matrix2;
    }

    public final Size b() {
        return TransformUtils.is90or270(this.f687c) ? new Size(this.f686b.height(), this.f686b.width()) : new Size(this.f686b.width(), this.f686b.height());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Matrix c(Size size, int i6) {
        Matrix.ScaleToFit scaleToFit;
        RectF rectF;
        androidx.work.j.f(null, f());
        if (TransformUtils.isAspectRatioMatchingWithRoundingError(size, true, b(), false)) {
            rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        } else {
            RectF rectF2 = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
            Size sizeB = b();
            RectF rectF3 = new RectF(0.0f, 0.0f, sizeB.getWidth(), sizeB.getHeight());
            Matrix matrix = new Matrix();
            PreviewView.e eVar = this.h;
            int iOrdinal = eVar.ordinal();
            if (iOrdinal == 0) {
                scaleToFit = Matrix.ScaleToFit.START;
                if (eVar != PreviewView.e.FIT_CENTER || eVar == PreviewView.e.FIT_START || eVar == PreviewView.e.FIT_END) {
                    matrix.setRectToRect(rectF3, rectF2, scaleToFit);
                } else {
                    matrix.setRectToRect(rectF2, rectF3, scaleToFit);
                    matrix.invert(matrix);
                }
                matrix.mapRect(rectF3);
                if (i6 != 1) {
                    float width = size.getWidth() / 2.0f;
                    float f6 = width + width;
                    rectF = new RectF(f6 - rectF3.right, rectF3.top, f6 - rectF3.left, rectF3.bottom);
                } else {
                    rectF = rectF3;
                }
            } else if (iOrdinal == 1) {
                scaleToFit = Matrix.ScaleToFit.CENTER;
                if (eVar != PreviewView.e.FIT_CENTER) {
                    matrix.setRectToRect(rectF3, rectF2, scaleToFit);
                    matrix.mapRect(rectF3);
                    if (i6 != 1) {
                    }
                }
            } else if (iOrdinal == 2) {
                scaleToFit = Matrix.ScaleToFit.END;
                if (eVar != PreviewView.e.FIT_CENTER) {
                }
            } else {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            Logger.e("PreviewTransform", "Unexpected crop rect: " + eVar);
                            scaleToFit = Matrix.ScaleToFit.FILL;
                        }
                    }
                }
                if (eVar != PreviewView.e.FIT_CENTER) {
                }
            }
        }
        Matrix rectToRect = TransformUtils.getRectToRect(new RectF(this.f686b), rectF, this.f687c);
        if (this.f690f && this.f691g) {
            if (TransformUtils.is90or270(this.f687c)) {
                rectToRect.preScale(1.0f, -1.0f, this.f686b.centerX(), this.f686b.centerY());
                return rectToRect;
            }
            rectToRect.preScale(-1.0f, 1.0f, this.f686b.centerX(), this.f686b.centerY());
        }
        return rectToRect;
    }

    public final Matrix d() {
        androidx.work.j.f(null, f());
        RectF rectF = new RectF(0.0f, 0.0f, this.f685a.getWidth(), this.f685a.getHeight());
        return TransformUtils.getRectToRect(rectF, rectF, !this.f691g ? this.f687c : -CameraOrientationUtil.surfaceRotationToDegrees(this.f689e));
    }

    public final RectF e(Size size, int i6) {
        androidx.work.j.f(null, f());
        Matrix matrixC = c(size, i6);
        RectF rectF = new RectF(0.0f, 0.0f, this.f685a.getWidth(), this.f685a.getHeight());
        matrixC.mapRect(rectF);
        return rectF;
    }

    public final boolean f() {
        return (this.f686b == null || this.f685a == null || !(!this.f691g || this.f689e != -1)) ? false : true;
    }
}
