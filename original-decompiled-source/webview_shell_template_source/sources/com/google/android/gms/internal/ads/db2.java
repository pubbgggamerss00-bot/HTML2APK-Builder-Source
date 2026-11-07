package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class db2 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, na2 {
    public final /* synthetic */ gb2 s;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i6, int i7) {
        int i8 = gb2.f4973n0;
        Surface surface = new Surface(surfaceTexture);
        gb2 gb2Var = this.s;
        gb2Var.J(surface);
        gb2Var.Y = surface;
        gb2Var.H(i6, i7);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        int i6 = gb2.f4973n0;
        gb2 gb2Var = this.s;
        gb2Var.J(null);
        gb2Var.H(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i6, int i7) {
        int i8 = gb2.f4973n0;
        this.s.H(i6, i7);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i6, int i7, int i8) {
        int i9 = gb2.f4973n0;
        this.s.H(i7, i8);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        int i6 = gb2.f4973n0;
        this.s.H(0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }
}
