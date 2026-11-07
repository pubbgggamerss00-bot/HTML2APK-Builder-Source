package j2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import com.yalantis.ucrop.view.CropImageView;
import j2.q4;

/* loaded from: classes.dex */
public final class p4 implements m2 {

    /* renamed from: a, reason: collision with root package name */
    public final RenderNode f14859a = f4.a();

    @Override // j2.m2
    public final boolean A(int i10, int i11, int i12, int i13) {
        return this.f14859a.setPosition(i10, i11, i12, i13);
    }

    @Override // j2.m2
    public final void B(float f10) {
        this.f14859a.setPivotY(f10);
    }

    @Override // j2.m2
    public final void C(float f10) {
        this.f14859a.setElevation(f10);
    }

    @Override // j2.m2
    public final void D(int i10) {
        this.f14859a.offsetTopAndBottom(i10);
    }

    @Override // j2.m2
    public final void E(q1.x0 x0Var, q1.u1 u1Var, q4.b bVar) {
        RecordingCanvas recordingCanvasBeginRecording = this.f14859a.beginRecording();
        q1.b0 b0Var = x0Var.f21746a;
        Canvas canvas = b0Var.f21645a;
        b0Var.f21645a = recordingCanvasBeginRecording;
        if (u1Var != null) {
            b0Var.d();
            b0Var.i(u1Var);
        }
        bVar.invoke(b0Var);
        if (u1Var != null) {
            b0Var.o();
        }
        x0Var.f21746a.f21645a = canvas;
        this.f14859a.endRecording();
    }

    @Override // j2.m2
    public final void F(Outline outline) {
        this.f14859a.setOutline(outline);
    }

    @Override // j2.m2
    public final boolean G() {
        return this.f14859a.setHasOverlappingRendering(true);
    }

    @Override // j2.m2
    public final boolean H() {
        return this.f14859a.getClipToBounds();
    }

    @Override // j2.m2
    public final int I() {
        return this.f14859a.getTop();
    }

    @Override // j2.m2
    public final void J(int i10) {
        this.f14859a.setAmbientShadowColor(i10);
    }

    @Override // j2.m2
    public final int K() {
        return this.f14859a.getRight();
    }

    @Override // j2.m2
    public final boolean L() {
        return this.f14859a.getClipToOutline();
    }

    @Override // j2.m2
    public final void M(boolean z10) {
        this.f14859a.setClipToOutline(z10);
    }

    @Override // j2.m2
    public final void N(int i10) {
        this.f14859a.setSpotShadowColor(i10);
    }

    @Override // j2.m2
    public final void O(Matrix matrix) {
        this.f14859a.getMatrix(matrix);
    }

    @Override // j2.m2
    public final float P() {
        return this.f14859a.getElevation();
    }

    @Override // j2.m2
    public final int a() {
        return this.f14859a.getWidth();
    }

    @Override // j2.m2
    public final void b(float f10) {
        this.f14859a.setRotationZ(f10);
    }

    @Override // j2.m2
    public final void c(float f10) {
        this.f14859a.setTranslationY(f10);
    }

    @Override // j2.m2
    public final void d(float f10) {
        this.f14859a.setScaleY(f10);
    }

    @Override // j2.m2
    public final void e() {
        this.f14859a.setRotationX(CropImageView.DEFAULT_ASPECT_RATIO);
    }

    @Override // j2.m2
    public final void f(float f10) {
        this.f14859a.setAlpha(f10);
    }

    @Override // j2.m2
    public final void g() {
        this.f14859a.setRotationY(CropImageView.DEFAULT_ASPECT_RATIO);
    }

    @Override // j2.m2
    public final int getHeight() {
        return this.f14859a.getHeight();
    }

    @Override // j2.m2
    public final void h(float f10) {
        this.f14859a.setScaleX(f10);
    }

    @Override // j2.m2
    public final float i() {
        return this.f14859a.getAlpha();
    }

    @Override // j2.m2
    public final void j(float f10) {
        this.f14859a.setTranslationX(f10);
    }

    @Override // j2.m2
    public final void k(float f10) {
        this.f14859a.setCameraDistance(f10);
    }

    @Override // j2.m2
    public final void l(q1.z1 z1Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f14859a.setRenderEffect(z1Var != null ? z1Var.a() : null);
        }
    }

    @Override // j2.m2
    public final void m() {
        this.f14859a.discardDisplayList();
    }

    @Override // j2.m2
    public final void s(int i10) {
        RenderNode renderNode = this.f14859a;
        if (i10 == 1) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (i10 == 2) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // j2.m2
    public final boolean t() {
        return this.f14859a.hasDisplayList();
    }

    @Override // j2.m2
    public final void u(int i10) {
        this.f14859a.offsetLeftAndRight(i10);
    }

    @Override // j2.m2
    public final int v() {
        return this.f14859a.getBottom();
    }

    @Override // j2.m2
    public final void w(Canvas canvas) {
        canvas.drawRenderNode(this.f14859a);
    }

    @Override // j2.m2
    public final int x() {
        return this.f14859a.getLeft();
    }

    @Override // j2.m2
    public final void y(float f10) {
        this.f14859a.setPivotX(f10);
    }

    @Override // j2.m2
    public final void z(boolean z10) {
        this.f14859a.setClipToBounds(z10);
    }
}
