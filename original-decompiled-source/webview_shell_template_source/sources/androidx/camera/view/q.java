package androidx.camera.view;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.Threads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class q extends View {
    public Window s;

    /* renamed from: t, reason: collision with root package name */
    public o f715t;

    /* JADX INFO: Access modifiers changed from: private */
    public float getBrightness() {
        Window window = this.s;
        if (window != null) {
            return window.getAttributes().screenBrightness;
        }
        Logger.e("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
        return Float.NaN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrightness(float f6) {
        if (this.s == null) {
            Logger.e("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
            return;
        }
        if (Float.isNaN(f6)) {
            Logger.e("ScreenFlashView", "setBrightness: value is NaN!");
            return;
        }
        WindowManager.LayoutParams attributes = this.s.getAttributes();
        attributes.screenBrightness = f6;
        this.s.setAttributes(attributes);
        Logger.d("ScreenFlashView", "Brightness set to " + attributes.screenBrightness);
    }

    private void setScreenFlashUiInfo(ImageCapture.ScreenFlash screenFlash) {
        Logger.d("ScreenFlashView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    public ImageCapture.ScreenFlash getScreenFlash() {
        return this.f715t;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public void setController(a aVar) {
        Threads.checkMainThread();
    }

    public void setScreenFlashWindow(Window window) {
        Threads.checkMainThread();
        if (this.s != window) {
            this.f715t = window == null ? null : new o(this);
        }
        this.s = window;
        setScreenFlashUiInfo(getScreenFlash());
    }
}
