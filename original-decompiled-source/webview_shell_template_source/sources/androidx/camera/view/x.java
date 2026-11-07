package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.b0;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class x extends k {

    /* renamed from: e, reason: collision with root package name */
    public TextureView f734e;

    /* renamed from: f, reason: collision with root package name */
    public SurfaceTexture f735f;

    /* renamed from: g, reason: collision with root package name */
    public b.d f736g;
    public SurfaceRequest h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f737i;

    /* renamed from: j, reason: collision with root package name */
    public SurfaceTexture f738j;

    /* renamed from: k, reason: collision with root package name */
    public AtomicReference<b.a<Void>> f739k;

    /* renamed from: l, reason: collision with root package name */
    public j f740l;

    /* renamed from: m, reason: collision with root package name */
    public Executor f741m;

    @Override // androidx.camera.view.k
    public final View a() {
        return this.f734e;
    }

    @Override // androidx.camera.view.k
    public final Bitmap b() {
        TextureView textureView = this.f734e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.f734e.getBitmap();
    }

    @Override // androidx.camera.view.k
    public final void c() {
        if (!this.f737i || this.f738j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.f734e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.f738j;
        if (surfaceTexture != surfaceTexture2) {
            this.f734e.setSurfaceTexture(surfaceTexture2);
            this.f738j = null;
            this.f737i = false;
        }
    }

    @Override // androidx.camera.view.k
    public final void d() {
        this.f737i = true;
    }

    @Override // androidx.camera.view.k
    public final void e(SurfaceRequest surfaceRequest, j jVar) {
        Size resolution = surfaceRequest.getResolution();
        this.f700a = resolution;
        this.f740l = jVar;
        resolution.getClass();
        FrameLayout frameLayout = this.f701b;
        TextureView textureView = new TextureView(frameLayout.getContext());
        this.f734e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f700a.getWidth(), this.f700a.getHeight()));
        this.f734e.setSurfaceTextureListener(new w(this));
        frameLayout.removeAllViews();
        frameLayout.addView(this.f734e);
        SurfaceRequest surfaceRequest2 = this.h;
        if (surfaceRequest2 != null) {
            surfaceRequest2.willNotProvideSurface();
        }
        this.h = surfaceRequest;
        surfaceRequest.addRequestCancellationListener(k0.a.c(this.f734e.getContext()), new androidx.camera.camera2.interop.d(4, this, surfaceRequest));
        i();
    }

    @Override // androidx.camera.view.k
    public final void g(Executor executor) {
        this.f741m = executor;
    }

    @Override // androidx.camera.view.k
    public final c5.a<Void> h() {
        return y.b.a(new androidx.camera.core.impl.e(2, this));
    }

    public final void i() {
        SurfaceTexture surfaceTexture;
        Size size = this.f700a;
        if (size == null || (surfaceTexture = this.f735f) == null || this.h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f700a.getHeight());
        Surface surface = new Surface(this.f735f);
        SurfaceRequest surfaceRequest = this.h;
        b.d dVarA = y.b.a(new b0(4, this, surface));
        this.f736g = dVarA;
        dVarA.f15194t.addListener(new androidx.camera.core.processing.h(this, surface, dVarA, surfaceRequest, 1), k0.a.c(this.f734e.getContext()));
        this.f703d = true;
        f();
    }
}
