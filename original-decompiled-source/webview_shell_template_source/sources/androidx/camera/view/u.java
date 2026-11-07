package androidx.camera.view;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u extends k {

    /* renamed from: e, reason: collision with root package name */
    public SurfaceView f722e;

    /* renamed from: f, reason: collision with root package name */
    public final a f723f;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements SurfaceHolder.Callback {
        public Size s;

        /* renamed from: t, reason: collision with root package name */
        public SurfaceRequest f724t;

        /* renamed from: u, reason: collision with root package name */
        public SurfaceRequest f725u;

        /* renamed from: v, reason: collision with root package name */
        public j f726v;

        /* renamed from: w, reason: collision with root package name */
        public Size f727w;

        /* renamed from: x, reason: collision with root package name */
        public boolean f728x = false;

        /* renamed from: y, reason: collision with root package name */
        public boolean f729y = false;

        public a() {
        }

        public final void a() {
            if (this.f724t != null) {
                Logger.d("SurfaceViewImpl", "Request canceled: " + this.f724t);
                this.f724t.willNotProvideSurface();
            }
        }

        public final boolean b() {
            u uVar = u.this;
            Surface surface = uVar.f722e.getHolder().getSurface();
            if (this.f728x || this.f724t == null || !Objects.equals(this.s, this.f727w)) {
                return false;
            }
            Logger.d("SurfaceViewImpl", "Surface set on Preview.");
            j jVar = this.f726v;
            SurfaceRequest surfaceRequest = this.f724t;
            Objects.requireNonNull(surfaceRequest);
            surfaceRequest.provideSurface(surface, k0.a.c(uVar.f722e.getContext()), new t(0, jVar));
            this.f728x = true;
            uVar.f703d = true;
            uVar.f();
            return true;
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i6, int i7, int i8) {
            Logger.d("SurfaceViewImpl", "Surface changed. Size: " + i7 + "x" + i8);
            this.f727w = new Size(i7, i8);
            b();
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            SurfaceRequest surfaceRequest;
            Logger.d("SurfaceViewImpl", "Surface created.");
            if (!this.f729y || (surfaceRequest = this.f725u) == null) {
                return;
            }
            surfaceRequest.invalidate();
            this.f725u = null;
            this.f729y = false;
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            Logger.d("SurfaceViewImpl", "Surface destroyed.");
            if (!this.f728x) {
                a();
            } else if (this.f724t != null) {
                Logger.d("SurfaceViewImpl", "Surface closed " + this.f724t);
                this.f724t.getDeferrableSurface().close();
            }
            this.f729y = true;
            SurfaceRequest surfaceRequest = this.f724t;
            if (surfaceRequest != null) {
                this.f725u = surfaceRequest;
            }
            this.f728x = false;
            this.f724t = null;
            this.f726v = null;
            this.f727w = null;
            this.s = null;
        }
    }

    public u(FrameLayout frameLayout, e eVar) {
        super(frameLayout, eVar);
        this.f723f = new a();
    }

    @Override // androidx.camera.view.k
    public final View a() {
        return this.f722e;
    }

    @Override // androidx.camera.view.k
    public final Bitmap b() {
        SurfaceView surfaceView = this.f722e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.f722e.getHolder().getSurface().isValid()) {
            return null;
        }
        final Semaphore semaphore = new Semaphore(0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f722e.getWidth(), this.f722e.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        PixelCopy.request(this.f722e, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: androidx.camera.view.s
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i6) {
                if (i6 == 0) {
                    Logger.d("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
                } else {
                    Logger.e("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i6);
                }
                semaphore.release();
            }
        }, new Handler(handlerThread.getLooper()));
        try {
            if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                Logger.e("SurfaceViewImpl", "Timed out while trying to acquire screenshot.");
            }
            return bitmapCreateBitmap;
        } catch (InterruptedException e6) {
            Logger.e("SurfaceViewImpl", "Interrupted while trying to acquire screenshot.", e6);
            return bitmapCreateBitmap;
        } finally {
            handlerThread.quitSafely();
        }
    }

    @Override // androidx.camera.view.k
    public final void e(SurfaceRequest surfaceRequest, j jVar) {
        SurfaceView surfaceView = this.f722e;
        boolean zEquals = Objects.equals(this.f700a, surfaceRequest.getResolution());
        if (surfaceView == null || !zEquals) {
            Size resolution = surfaceRequest.getResolution();
            this.f700a = resolution;
            resolution.getClass();
            FrameLayout frameLayout = this.f701b;
            SurfaceView surfaceView2 = new SurfaceView(frameLayout.getContext());
            this.f722e = surfaceView2;
            surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(this.f700a.getWidth(), this.f700a.getHeight()));
            frameLayout.removeAllViews();
            frameLayout.addView(this.f722e);
            this.f722e.getHolder().addCallback(this.f723f);
        }
        surfaceRequest.addRequestCancellationListener(k0.a.c(this.f722e.getContext()), new androidx.camera.lifecycle.a(1, jVar));
        this.f722e.post(new r(this, surfaceRequest, jVar, 0));
    }

    @Override // androidx.camera.view.k
    public final void g(Executor executor) {
        throw new IllegalArgumentException("SurfaceView doesn't support frame update listener");
    }

    @Override // androidx.camera.view.k
    public final c5.a<Void> h() {
        return Futures.immediateFuture(null);
    }

    @Override // androidx.camera.view.k
    public final void c() {
    }

    @Override // androidx.camera.view.k
    public final void d() {
    }
}
