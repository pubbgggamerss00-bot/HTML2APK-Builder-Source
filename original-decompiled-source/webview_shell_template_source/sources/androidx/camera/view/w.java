package androidx.camera.view;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.concurrent.Executor;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class w implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ x s;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements FutureCallback<SurfaceRequest.Result> {
        public final /* synthetic */ SurfaceTexture s;

        public a(SurfaceTexture surfaceTexture) {
            this.s = surfaceTexture;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onFailure(Throwable th) {
            throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onSuccess(SurfaceRequest.Result result) {
            androidx.work.j.f("Unexpected result from SurfaceRequest. Surface was provided twice.", result.getResultCode() != 3);
            Logger.d("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
            this.s.release();
            x xVar = w.this.s;
            if (xVar.f738j != null) {
                xVar.f738j = null;
            }
        }
    }

    public w(x xVar) {
        this.s = xVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i6, int i7) {
        Logger.d("TextureViewImpl", "SurfaceTexture available. Size: " + i6 + "x" + i7);
        x xVar = this.s;
        xVar.f735f = surfaceTexture;
        if (xVar.f736g == null) {
            xVar.i();
            return;
        }
        xVar.h.getClass();
        Logger.d("TextureViewImpl", "Surface invalidated " + xVar.h);
        xVar.h.getDeferrableSurface().close();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        x xVar = this.s;
        xVar.f735f = null;
        b.d dVar = xVar.f736g;
        if (dVar == null) {
            Logger.d("TextureViewImpl", "SurfaceTexture about to be destroyed");
            return true;
        }
        Futures.addCallback(dVar, new a(surfaceTexture), k0.a.c(xVar.f734e.getContext()));
        xVar.f738j = surfaceTexture;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i6, int i7) {
        Logger.d("TextureViewImpl", "SurfaceTexture size changed: " + i6 + "x" + i7);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        x xVar = this.s;
        b.a<Void> andSet = xVar.f739k.getAndSet(null);
        if (andSet != null) {
            andSet.a(null);
        }
        xVar.getClass();
        Executor executor = xVar.f741m;
    }
}
