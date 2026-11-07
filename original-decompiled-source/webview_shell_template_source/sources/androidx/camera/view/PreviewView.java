package androidx.camera.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.MeteringPointFactory;
import androidx.camera.core.Preview;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.ViewPort;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import androidx.lifecycle.LiveData;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import t.a;
import u0.f0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class PreviewView extends FrameLayout {
    static final int DEFAULT_BACKGROUND_COLOR = 17170444;
    private static final c DEFAULT_IMPL_MODE = c.PERFORMANCE;
    private static final String TAG = "PreviewView";
    final AtomicReference<androidx.camera.view.d> mActiveStreamStateObserver;
    androidx.camera.view.a mCameraController;
    CameraInfoInternal mCameraInfoInternal;
    private final b mDisplayRotationListener;
    k mImplementation;
    c mImplementationMode;
    d mOnFrameUpdateListener;
    Executor mOnFrameUpdateListenerExecutor;
    private final View.OnLayoutChangeListener mOnLayoutChangeListener;
    final androidx.lifecycle.r<f> mPreviewStreamStateLiveData;
    final androidx.camera.view.e mPreviewTransform;
    l mPreviewViewMeteringPointFactory;
    final q mScreenFlashView;
    final Preview.SurfaceProvider mSurfaceProvider;
    private MotionEvent mTouchUpEvent;
    boolean mUseDisplayRotation;
    private final t.a mZoomGestureDetector;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements Preview.SurfaceProvider {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.camera.core.Preview.SurfaceProvider
        public final void onSurfaceRequested(final SurfaceRequest surfaceRequest) {
            u uVar;
            if (!Threads.isMainThread()) {
                k0.a.c(PreviewView.this.getContext()).execute(new Runnable() { // from class: androidx.camera.view.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        PreviewView.this.mSurfaceProvider.onSurfaceRequested(surfaceRequest);
                    }
                });
                return;
            }
            Logger.d(PreviewView.TAG, "Surface requested by Preview.");
            final CameraInternal camera = surfaceRequest.getCamera();
            PreviewView.this.mCameraInfoInternal = camera.getCameraInfoInternal();
            l lVar = PreviewView.this.mPreviewViewMeteringPointFactory;
            Rect sensorRect = camera.getCameraControlInternal().getSensorRect();
            lVar.getClass();
            lVar.setSurfaceAspectRatio(new Rational(sensorRect.width(), sensorRect.height()));
            synchronized (lVar) {
                lVar.f706b = sensorRect;
            }
            surfaceRequest.setTransformationInfoListener(k0.a.c(PreviewView.this.getContext()), new SurfaceRequest.TransformationInfoListener() { // from class: androidx.camera.view.i
                @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
                public final void onTransformationInfoUpdate(SurfaceRequest.TransformationInfo transformationInfo) {
                    k kVar;
                    PreviewView previewView = PreviewView.this;
                    Logger.d("PreviewView", "Preview transformation info updated. " + transformationInfo);
                    boolean z6 = camera.getCameraInfoInternal().getLensFacing() == 0;
                    e eVar = previewView.mPreviewTransform;
                    Size resolution = surfaceRequest.getResolution();
                    eVar.getClass();
                    Logger.d("PreviewTransform", "Transformation info set: " + transformationInfo + " " + resolution + " " + z6);
                    eVar.f686b = transformationInfo.getCropRect();
                    eVar.f687c = transformationInfo.getRotationDegrees();
                    eVar.f689e = transformationInfo.getTargetRotation();
                    eVar.f685a = resolution;
                    eVar.f690f = z6;
                    eVar.f691g = transformationInfo.hasCameraTransform();
                    eVar.f688d = transformationInfo.getSensorToBufferTransform();
                    if (transformationInfo.getTargetRotation() == -1 || ((kVar = previewView.mImplementation) != null && (kVar instanceof u))) {
                        previewView.mUseDisplayRotation = true;
                    } else {
                        previewView.mUseDisplayRotation = false;
                    }
                    previewView.redrawPreview();
                }
            });
            PreviewView previewView = PreviewView.this;
            if (!PreviewView.shouldReuseImplementation(previewView.mImplementation, surfaceRequest, previewView.mImplementationMode)) {
                PreviewView previewView2 = PreviewView.this;
                if (PreviewView.shouldUseTextureView(surfaceRequest, previewView2.mImplementationMode)) {
                    PreviewView previewView3 = PreviewView.this;
                    x xVar = new x(previewView3, previewView3.mPreviewTransform);
                    xVar.f737i = false;
                    xVar.f739k = new AtomicReference<>();
                    uVar = xVar;
                } else {
                    PreviewView previewView4 = PreviewView.this;
                    uVar = new u(previewView4, previewView4.mPreviewTransform);
                }
                previewView2.mImplementation = uVar;
            }
            CameraInfoInternal cameraInfoInternal = camera.getCameraInfoInternal();
            PreviewView previewView5 = PreviewView.this;
            androidx.camera.view.d dVar = new androidx.camera.view.d(cameraInfoInternal, previewView5.mPreviewStreamStateLiveData, previewView5.mImplementation);
            PreviewView.this.mActiveStreamStateObserver.set(dVar);
            camera.getCameraState().addObserver(k0.a.c(PreviewView.this.getContext()), dVar);
            PreviewView.this.mImplementation.e(surfaceRequest, new j(this, dVar, camera));
            PreviewView previewView6 = PreviewView.this;
            if (previewView6.indexOfChild(previewView6.mScreenFlashView) == -1) {
                PreviewView previewView7 = PreviewView.this;
                previewView7.addView(previewView7.mScreenFlashView);
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public enum c {
        PERFORMANCE(0),
        /* JADX INFO: Fake field, exist only in values array */
        COMPATIBLE(1);

        public final int s;

        c(int i6) {
            this.s = i6;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface d {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public enum e {
        /* JADX INFO: Fake field, exist only in values array */
        FILL_START(0),
        FILL_CENTER(1),
        /* JADX INFO: Fake field, exist only in values array */
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);

        public final int s;

        e(int i6) {
            this.s = i6;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class f {
        public static final f s;

        /* renamed from: t, reason: collision with root package name */
        public static final f f672t;

        /* renamed from: u, reason: collision with root package name */
        public static final /* synthetic */ f[] f673u;

        static {
            f fVar = new f("IDLE", 0);
            s = fVar;
            f fVar2 = new f("STREAMING", 1);
            f672t = fVar2;
            f673u = new f[]{fVar, fVar2};
        }

        public f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) f673u.clone();
        }
    }

    public PreviewView(Context context) {
        this(context, null);
    }

    private void attachToControllerIfReady(boolean z6) {
        Threads.checkMainThread();
        getViewPort();
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService("display");
    }

    private ImageCapture.ScreenFlash getScreenFlashInternal() {
        return this.mScreenFlashView.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int iOrdinal = getScaleType().ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i6 = 1;
        if (iOrdinal != 1) {
            i6 = 2;
            if (iOrdinal != 2) {
                i6 = 3;
                if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                    throw new IllegalStateException("Unexpected scale type: " + getScaleType());
                }
            }
        }
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        if (i8 - i6 == i12 - i10 && i9 - i7 == i13 - i11) {
            return;
        }
        redrawPreview();
        attachToControllerIfReady(true);
    }

    private boolean lambda$new$1(a.AbstractC0090a abstractC0090a) {
        return true;
    }

    private void setScreenFlashUiInfo(ImageCapture.ScreenFlash screenFlash) {
        Logger.d(TAG, "setScreenFlashUiInfo: mCameraController is null!");
    }

    public static boolean shouldReuseImplementation(k kVar, SurfaceRequest surfaceRequest, c cVar) {
        return (kVar instanceof u) && !shouldUseTextureView(surfaceRequest, cVar);
    }

    public static boolean shouldUseTextureView(SurfaceRequest surfaceRequest, c cVar) {
        boolean zEquals = surfaceRequest.getCamera().getCameraInfoInternal().getImplementationType().equals(CameraInfo.IMPLEMENTATION_TYPE_CAMERA2_LEGACY);
        boolean z6 = (u.a.f14444a.get(SurfaceViewStretchedQuirk.class) == null && u.a.f14444a.get(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (Build.VERSION.SDK_INT <= 24 || zEquals || z6) {
            return true;
        }
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1) {
            return true;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + cVar);
    }

    private void startListeningToDisplayChange() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.registerDisplayListener(this.mDisplayRotationListener, new Handler(Looper.getMainLooper()));
    }

    private void stopListeningToDisplayChange() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.mDisplayRotationListener);
    }

    public Bitmap getBitmap() {
        Threads.checkMainThread();
        k kVar = this.mImplementation;
        if (kVar == null) {
            return null;
        }
        FrameLayout frameLayout = kVar.f701b;
        Bitmap bitmapB = kVar.b();
        if (bitmapB == null) {
            return null;
        }
        androidx.camera.view.e eVar = kVar.f702c;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        if (!eVar.f()) {
            return bitmapB;
        }
        Matrix matrixD = eVar.d();
        RectF rectFE = eVar.e(size, layoutDirection);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmapB.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(matrixD);
        matrix.postScale(rectFE.width() / eVar.f685a.getWidth(), rectFE.height() / eVar.f685a.getHeight());
        matrix.postTranslate(rectFE.left, rectFE.top);
        canvas.drawBitmap(bitmapB, matrix, new Paint(7));
        return bitmapCreateBitmap;
    }

    public androidx.camera.view.a getController() {
        Threads.checkMainThread();
        return null;
    }

    public c getImplementationMode() {
        Threads.checkMainThread();
        return this.mImplementationMode;
    }

    public MeteringPointFactory getMeteringPointFactory() {
        Threads.checkMainThread();
        return this.mPreviewViewMeteringPointFactory;
    }

    public v.a getOutputTransform() {
        Matrix matrixC;
        Threads.checkMainThread();
        try {
            matrixC = this.mPreviewTransform.c(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrixC = null;
        }
        Rect rect = this.mPreviewTransform.f686b;
        if (matrixC == null || rect == null) {
            Logger.d(TAG, "Transform info is not ready");
            return null;
        }
        matrixC.preConcat(TransformUtils.getNormalizedToBuffer(rect));
        if (this.mImplementation instanceof x) {
            matrixC.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            Logger.w(TAG, "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        new Size(rect.width(), rect.height());
        return new v.a();
    }

    public LiveData<f> getPreviewStreamState() {
        return this.mPreviewStreamStateLiveData;
    }

    public e getScaleType() {
        Threads.checkMainThread();
        return this.mPreviewTransform.h;
    }

    public ImageCapture.ScreenFlash getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        Threads.checkMainThread();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        androidx.camera.view.e eVar = this.mPreviewTransform;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        if (!eVar.f()) {
            return null;
        }
        Matrix matrix = new Matrix(eVar.f688d);
        matrix.postConcat(eVar.c(size, layoutDirection));
        return matrix;
    }

    public Preview.SurfaceProvider getSurfaceProvider() {
        Threads.checkMainThread();
        return this.mSurfaceProvider;
    }

    public ViewPort getViewPort() {
        Threads.checkMainThread();
        if (getDisplay() == null) {
            return null;
        }
        return getViewPort(getDisplay().getRotation());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        startListeningToDisplayChange();
        addOnLayoutChangeListener(this.mOnLayoutChangeListener);
        k kVar = this.mImplementation;
        if (kVar != null) {
            kVar.c();
        }
        attachToControllerIfReady(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.mOnLayoutChangeListener);
        k kVar = this.mImplementation;
        if (kVar != null) {
            kVar.d();
        }
        stopListeningToDisplayChange();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean performClick() {
        this.mTouchUpEvent = null;
        return super.performClick();
    }

    public void redrawPreview() {
        Rect rect;
        Threads.checkMainThread();
        if (this.mImplementation != null) {
            updateDisplayRotationIfNeeded();
            this.mImplementation.f();
        }
        l lVar = this.mPreviewViewMeteringPointFactory;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        lVar.getClass();
        Threads.checkMainThread();
        synchronized (lVar) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0 && (rect = lVar.f706b) != null) {
                    lVar.f707c = lVar.f705a.a(size, rect, layoutDirection);
                    return;
                }
                lVar.f707c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setController(androidx.camera.view.a aVar) {
        Threads.checkMainThread();
        attachToControllerIfReady(false);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setFrameUpdateListener(Executor executor, d dVar) {
        if (this.mImplementationMode == c.PERFORMANCE) {
            throw new IllegalArgumentException("PERFORMANCE mode doesn't support frame update listener");
        }
        this.mOnFrameUpdateListenerExecutor = executor;
        k kVar = this.mImplementation;
        if (kVar != null) {
            kVar.g(executor);
        }
    }

    public void setImplementationMode(c cVar) {
        Threads.checkMainThread();
        this.mImplementationMode = cVar;
    }

    public void setScaleType(e eVar) {
        Threads.checkMainThread();
        this.mPreviewTransform.h = eVar;
        redrawPreview();
        attachToControllerIfReady(false);
    }

    public void setScreenFlashOverlayColor(int i6) {
        this.mScreenFlashView.setBackgroundColor(i6);
    }

    public void setScreenFlashWindow(Window window) {
        Threads.checkMainThread();
        this.mScreenFlashView.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void updateDisplayRotationIfNeeded() {
        Display display;
        CameraInfoInternal cameraInfoInternal;
        if (!this.mUseDisplayRotation || (display = getDisplay()) == null || (cameraInfoInternal = this.mCameraInfoInternal) == null) {
            return;
        }
        androidx.camera.view.e eVar = this.mPreviewTransform;
        int sensorRotationDegrees = cameraInfoInternal.getSensorRotationDegrees(display.getRotation());
        int rotation = display.getRotation();
        if (eVar.f691g) {
            eVar.f687c = sensorRotationDegrees;
            eVar.f689e = rotation;
        }
    }

    public PreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i6) {
        this(context, attributeSet, i6, 0);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i6, int i7) {
        super(context, attributeSet, i6, i7);
        this.mImplementationMode = DEFAULT_IMPL_MODE;
        androidx.camera.view.e eVar = new androidx.camera.view.e();
        eVar.h = e.FILL_CENTER;
        this.mPreviewTransform = eVar;
        this.mUseDisplayRotation = true;
        this.mPreviewStreamStateLiveData = new androidx.lifecycle.r<>(f.s);
        this.mActiveStreamStateObserver = new AtomicReference<>();
        this.mPreviewViewMeteringPointFactory = new l(eVar);
        this.mDisplayRotationListener = new b();
        this.mOnLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: androidx.camera.view.f
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
                this.f692a.lambda$new$0(view, i8, i9, i10, i11, i12, i13, i14, i15);
            }
        };
        this.mSurfaceProvider = new a();
        Threads.checkMainThread();
        Resources.Theme theme = context.getTheme();
        int[] iArr = m.f708a;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i6, i7);
        f0.l(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i6, i7);
        try {
            int integer = typedArrayObtainStyledAttributes.getInteger(1, eVar.h.s);
            for (e eVar2 : e.values()) {
                if (eVar2.s == integer) {
                    setScaleType(eVar2);
                    int integer2 = typedArrayObtainStyledAttributes.getInteger(0, DEFAULT_IMPL_MODE.s);
                    for (c cVar : c.values()) {
                        if (cVar.s == integer2) {
                            setImplementationMode(cVar);
                            typedArrayObtainStyledAttributes.recycle();
                            ViewConfiguration.get(context).getScaledTouchSlop();
                            t.a aVar = new t.a();
                            new GestureDetector(context, new t.b(aVar));
                            this.mZoomGestureDetector = aVar;
                            if (getBackground() == null) {
                                setBackgroundColor(getContext().getColor(17170444));
                            }
                            q qVar = new q(context, null, 0, 0);
                            qVar.setBackgroundColor(-1);
                            qVar.setAlpha(0.0f);
                            qVar.setElevation(Float.MAX_VALUE);
                            this.mScreenFlashView = qVar;
                            qVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Unknown implementation mode id " + integer2);
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + integer);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @SuppressLint({"WrongConstant"})
    public ViewPort getViewPort(int i6) {
        Threads.checkMainThread();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return new ViewPort.Builder(new Rational(getWidth(), getHeight()), i6).setScaleType(getViewPortScaleType()).setLayoutDirection(getLayoutDirection()).build();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b implements DisplayManager.DisplayListener {
        public b() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i6) {
            PreviewView previewView = PreviewView.this;
            Display display = previewView.getDisplay();
            if (display == null || display.getDisplayId() != i6) {
                return;
            }
            previewView.redrawPreview();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i6) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i6) {
        }
    }
}
