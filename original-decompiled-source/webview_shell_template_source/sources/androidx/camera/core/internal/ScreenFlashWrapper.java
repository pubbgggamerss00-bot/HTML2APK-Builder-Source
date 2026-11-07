package androidx.camera.core.internal;

import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ScreenFlashWrapper implements ImageCapture.ScreenFlash {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "ScreenFlashWrapper";
    private boolean isClearScreenFlashPending;
    private final Object lock;
    private ImageCapture.ScreenFlashListener pendingListener;
    private final ImageCapture.ScreenFlash screenFlash;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final ScreenFlashWrapper from(ImageCapture.ScreenFlash screenFlash) {
            return new ScreenFlashWrapper(screenFlash, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ ScreenFlashWrapper(ImageCapture.ScreenFlash screenFlash, f fVar) {
        this(screenFlash);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void apply$lambda$2(ScreenFlashWrapper screenFlashWrapper) {
        j.e("this$0", screenFlashWrapper);
        synchronized (screenFlashWrapper.lock) {
            try {
                if (screenFlashWrapper.pendingListener == null) {
                    Logger.w(TAG, "apply: pendingListener is null!");
                }
                screenFlashWrapper.completePendingScreenFlashListener();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void completePendingScreenFlashClear() {
        d5.j jVar;
        synchronized (this.lock) {
            try {
                if (this.isClearScreenFlashPending) {
                    ImageCapture.ScreenFlash screenFlash = this.screenFlash;
                    if (screenFlash != null) {
                        screenFlash.clear();
                        jVar = d5.j.f12745a;
                    } else {
                        jVar = null;
                    }
                    if (jVar == null) {
                        Logger.e(TAG, "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    Logger.w(TAG, "completePendingScreenFlashClear: none pending!");
                }
                this.isClearScreenFlashPending = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void completePendingScreenFlashListener() {
        synchronized (this.lock) {
            try {
                ImageCapture.ScreenFlashListener screenFlashListener = this.pendingListener;
                if (screenFlashListener != null) {
                    screenFlashListener.onCompleted();
                }
                this.pendingListener = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final ScreenFlashWrapper from(ImageCapture.ScreenFlash screenFlash) {
        return Companion.from(screenFlash);
    }

    @Override // androidx.camera.core.ImageCapture.ScreenFlash
    public void apply(long j6, ImageCapture.ScreenFlashListener screenFlashListener) {
        d5.j jVar;
        j.e("screenFlashListener", screenFlashListener);
        synchronized (this.lock) {
            this.isClearScreenFlashPending = true;
            this.pendingListener = screenFlashListener;
        }
        ImageCapture.ScreenFlash screenFlash = this.screenFlash;
        if (screenFlash != null) {
            screenFlash.apply(j6, new ImageCapture.ScreenFlashListener() { // from class: androidx.camera.core.internal.b
                @Override // androidx.camera.core.ImageCapture.ScreenFlashListener
                public final void onCompleted() {
                    ScreenFlashWrapper.apply$lambda$2(this.f566a);
                }
            });
            jVar = d5.j.f12745a;
        } else {
            jVar = null;
        }
        if (jVar == null) {
            Logger.e(TAG, "apply: screenFlash is null!");
            completePendingScreenFlashListener();
        }
    }

    @Override // androidx.camera.core.ImageCapture.ScreenFlash
    public void clear() {
        completePendingScreenFlashClear();
    }

    public final void completePendingTasks() {
        completePendingScreenFlashListener();
        completePendingScreenFlashClear();
    }

    public final ImageCapture.ScreenFlash getBaseScreenFlash() {
        return this.screenFlash;
    }

    private ScreenFlashWrapper(ImageCapture.ScreenFlash screenFlash) {
        this.screenFlash = screenFlash;
        this.lock = new Object();
    }
}
