package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public Size f700a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f701b;

    /* renamed from: c, reason: collision with root package name */
    public final e f702c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f703d = false;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface a {
    }

    public k(FrameLayout frameLayout, e eVar) {
        this.f701b = frameLayout;
        this.f702c = eVar;
    }

    public abstract View a();

    public abstract Bitmap b();

    public abstract void c();

    public abstract void d();

    public abstract void e(SurfaceRequest surfaceRequest, j jVar);

    public final void f() {
        View viewA = a();
        if (viewA == null || !this.f703d) {
            return;
        }
        FrameLayout frameLayout = this.f701b;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        e eVar = this.f702c;
        eVar.getClass();
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            Logger.w("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
            return;
        }
        if (eVar.f()) {
            if (viewA instanceof TextureView) {
                ((TextureView) viewA).setTransform(eVar.d());
            } else {
                Display display = viewA.getDisplay();
                boolean z6 = false;
                boolean z7 = (!eVar.f691g || display == null || display.getRotation() == eVar.f689e) ? false : true;
                boolean z8 = eVar.f691g;
                if (!z8) {
                    if ((!z8 ? eVar.f687c : -CameraOrientationUtil.surfaceRotationToDegrees(eVar.f689e)) != 0) {
                        z6 = true;
                    }
                }
                if (z7 || z6) {
                    Logger.e("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                }
            }
            RectF rectFE = eVar.e(size, layoutDirection);
            viewA.setPivotX(0.0f);
            viewA.setPivotY(0.0f);
            viewA.setScaleX(rectFE.width() / eVar.f685a.getWidth());
            viewA.setScaleY(rectFE.height() / eVar.f685a.getHeight());
            viewA.setTranslationX(rectFE.left - viewA.getLeft());
            viewA.setTranslationY(rectFE.top - viewA.getTop());
        }
    }

    public abstract void g(Executor executor);

    public abstract c5.a<Void> h();
}
