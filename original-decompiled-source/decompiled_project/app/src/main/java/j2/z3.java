package j2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.platform.AndroidComposeView;
import com.yalantis.ucrop.view.CropImageView;
import j2.q4;

/* loaded from: classes.dex */
public final class z3 implements m2 {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f15014g = true;

    /* renamed from: a, reason: collision with root package name */
    public final RenderNode f15015a;

    /* renamed from: b, reason: collision with root package name */
    public int f15016b;

    /* renamed from: c, reason: collision with root package name */
    public int f15017c;

    /* renamed from: d, reason: collision with root package name */
    public int f15018d;

    /* renamed from: e, reason: collision with root package name */
    public int f15019e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15020f;

    public z3(AndroidComposeView androidComposeView) {
        RenderNode renderNodeCreate = RenderNode.create("Compose", androidComposeView);
        this.f15015a = renderNodeCreate;
        if (f15014g) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            s4.c(renderNodeCreate, s4.a(renderNodeCreate));
            s4.d(renderNodeCreate, s4.b(renderNodeCreate));
            r4.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
            f15014g = false;
        }
    }

    @Override // j2.m2
    public final boolean A(int i10, int i11, int i12, int i13) {
        this.f15016b = i10;
        this.f15017c = i11;
        this.f15018d = i12;
        this.f15019e = i13;
        return this.f15015a.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // j2.m2
    public final void B(float f10) {
        this.f15015a.setPivotY(f10);
    }

    @Override // j2.m2
    public final void C(float f10) {
        this.f15015a.setElevation(f10);
    }

    @Override // j2.m2
    public final void D(int i10) {
        this.f15017c += i10;
        this.f15019e += i10;
        this.f15015a.offsetTopAndBottom(i10);
    }

    @Override // j2.m2
    public final void E(q1.x0 x0Var, q1.u1 u1Var, q4.b bVar) {
        Canvas canvasStart = this.f15015a.start(a(), getHeight());
        q1.b0 b0Var = x0Var.f21746a;
        Canvas canvas = b0Var.f21645a;
        b0Var.f21645a = canvasStart;
        if (u1Var != null) {
            b0Var.d();
            b0Var.i(u1Var);
        }
        bVar.invoke(b0Var);
        if (u1Var != null) {
            b0Var.o();
        }
        x0Var.f21746a.f21645a = canvas;
        this.f15015a.end(canvasStart);
    }

    @Override // j2.m2
    public final void F(Outline outline) {
        this.f15015a.setOutline(outline);
    }

    @Override // j2.m2
    public final boolean G() {
        return this.f15015a.setHasOverlappingRendering(true);
    }

    @Override // j2.m2
    public final boolean H() {
        return this.f15020f;
    }

    @Override // j2.m2
    public final int I() {
        return this.f15017c;
    }

    @Override // j2.m2
    public final void J(int i10) {
        s4.c(this.f15015a, i10);
    }

    @Override // j2.m2
    public final int K() {
        return this.f15018d;
    }

    @Override // j2.m2
    public final boolean L() {
        return this.f15015a.getClipToOutline();
    }

    @Override // j2.m2
    public final void M(boolean z10) {
        this.f15015a.setClipToOutline(z10);
    }

    @Override // j2.m2
    public final void N(int i10) {
        s4.d(this.f15015a, i10);
    }

    @Override // j2.m2
    public final void O(Matrix matrix) {
        this.f15015a.getMatrix(matrix);
    }

    @Override // j2.m2
    public final float P() {
        return this.f15015a.getElevation();
    }

    @Override // j2.m2
    public final int a() {
        return this.f15018d - this.f15016b;
    }

    @Override // j2.m2
    public final void b(float f10) {
        this.f15015a.setRotation(f10);
    }

    @Override // j2.m2
    public final void c(float f10) {
        this.f15015a.setTranslationY(f10);
    }

    @Override // j2.m2
    public final void d(float f10) {
        this.f15015a.setScaleY(f10);
    }

    @Override // j2.m2
    public final void e() {
        this.f15015a.setRotationX(CropImageView.DEFAULT_ASPECT_RATIO);
    }

    @Override // j2.m2
    public final void f(float f10) {
        this.f15015a.setAlpha(f10);
    }

    @Override // j2.m2
    public final void g() {
        this.f15015a.setRotationY(CropImageView.DEFAULT_ASPECT_RATIO);
    }

    @Override // j2.m2
    public final int getHeight() {
        return this.f15019e - this.f15017c;
    }

    @Override // j2.m2
    public final void h(float f10) {
        this.f15015a.setScaleX(f10);
    }

    @Override // j2.m2
    public final float i() {
        return this.f15015a.getAlpha();
    }

    @Override // j2.m2
    public final void j(float f10) {
        this.f15015a.setTranslationX(f10);
    }

    @Override // j2.m2
    public final void k(float f10) {
        this.f15015a.setCameraDistance(-f10);
    }

    @Override // j2.m2
    public final void l(q1.z1 z1Var) {
    }

    @Override // j2.m2
    public final void m() {
        r4.a(this.f15015a);
    }

    @Override // j2.m2
    public final void s(int i10) {
        if (i10 == 1) {
            this.f15015a.setLayerType(2);
            this.f15015a.setHasOverlappingRendering(true);
        } else if (i10 == 2) {
            this.f15015a.setLayerType(0);
            this.f15015a.setHasOverlappingRendering(false);
        } else {
            this.f15015a.setLayerType(0);
            this.f15015a.setHasOverlappingRendering(true);
        }
    }

    @Override // j2.m2
    public final boolean t() {
        return this.f15015a.isValid();
    }

    @Override // j2.m2
    public final void u(int i10) {
        this.f15016b += i10;
        this.f15018d += i10;
        this.f15015a.offsetLeftAndRight(i10);
    }

    @Override // j2.m2
    public final int v() {
        return this.f15019e;
    }

    @Override // j2.m2
    public final void w(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.f15015a);
    }

    @Override // j2.m2
    public final int x() {
        return this.f15016b;
    }

    @Override // j2.m2
    public final void y(float f10) {
        this.f15015a.setPivotX(f10);
    }

    @Override // j2.m2
    public final void z(boolean z10) {
        this.f15020f = z10;
        this.f15015a.setClipToBounds(z10);
    }
}
