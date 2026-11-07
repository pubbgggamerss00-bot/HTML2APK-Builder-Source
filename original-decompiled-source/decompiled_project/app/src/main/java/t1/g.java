package t1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.platform.AndroidComposeView;
import c2.n0;
import com.yalantis.ucrop.view.CropImageView;
import java.util.concurrent.atomic.AtomicBoolean;
import org.bouncycastle.asn1.cmc.BodyPartID;
import q1.b1;
import q1.w0;
import q1.x0;
import q1.z1;
import s1.a;

/* loaded from: classes.dex */
public final class g implements e {

    /* renamed from: z, reason: collision with root package name */
    public static final AtomicBoolean f27662z = new AtomicBoolean(true);

    /* renamed from: b, reason: collision with root package name */
    public final x0 f27663b;

    /* renamed from: c, reason: collision with root package name */
    public final s1.a f27664c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f27665d;

    /* renamed from: e, reason: collision with root package name */
    public long f27666e;

    /* renamed from: f, reason: collision with root package name */
    public Matrix f27667f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f27668g;

    /* renamed from: h, reason: collision with root package name */
    public long f27669h;

    /* renamed from: i, reason: collision with root package name */
    public int f27670i;

    /* renamed from: j, reason: collision with root package name */
    public final int f27671j;

    /* renamed from: k, reason: collision with root package name */
    public float f27672k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f27673l;

    /* renamed from: m, reason: collision with root package name */
    public float f27674m;

    /* renamed from: n, reason: collision with root package name */
    public float f27675n;

    /* renamed from: o, reason: collision with root package name */
    public float f27676o;

    /* renamed from: p, reason: collision with root package name */
    public float f27677p;

    /* renamed from: q, reason: collision with root package name */
    public float f27678q;

    /* renamed from: r, reason: collision with root package name */
    public long f27679r;

    /* renamed from: s, reason: collision with root package name */
    public long f27680s;

    /* renamed from: t, reason: collision with root package name */
    public float f27681t;

    /* renamed from: u, reason: collision with root package name */
    public float f27682u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f27683v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f27684w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f27685x;

    /* renamed from: y, reason: collision with root package name */
    public z1 f27686y;

    public g(AndroidComposeView androidComposeView, x0 x0Var, s1.a aVar) {
        this.f27663b = x0Var;
        this.f27664c = aVar;
        RenderNode renderNodeCreate = RenderNode.create("Compose", androidComposeView);
        this.f27665d = renderNodeCreate;
        this.f27666e = 0L;
        this.f27669h = 0L;
        if (f27662z.getAndSet(false)) {
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
            g0.c(renderNodeCreate, g0.a(renderNodeCreate));
            g0.d(renderNodeCreate, g0.b(renderNodeCreate));
            f0.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        N(0);
        this.f27670i = 0;
        this.f27671j = 3;
        this.f27672k = 1.0f;
        this.f27674m = 1.0f;
        this.f27675n = 1.0f;
        long j10 = b1.f21648b;
        this.f27679r = j10;
        this.f27680s = j10;
        this.f27682u = 8.0f;
    }

    @Override // t1.e
    public final void A(long j10) {
        this.f27679r = j10;
        g0.c(this.f27665d, n0.j(j10));
    }

    @Override // t1.e
    public final long B() {
        return this.f27680s;
    }

    @Override // t1.e
    public final void C(boolean z10) {
        this.f27683v = z10;
        M();
    }

    @Override // t1.e
    public final void D(long j10) {
        this.f27680s = j10;
        g0.d(this.f27665d, n0.j(j10));
    }

    @Override // t1.e
    public final float E() {
        return this.f27682u;
    }

    @Override // t1.e
    public final float F() {
        return this.f27676o;
    }

    @Override // t1.e
    public final float G() {
        return CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // t1.e
    public final void H(int i10) {
        this.f27670i = i10;
        if (i10 != 1 && this.f27671j == 3) {
            N(i10);
        } else {
            N(1);
        }
    }

    @Override // t1.e
    public final Matrix I() {
        Matrix matrix = this.f27667f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f27667f = matrix;
        }
        this.f27665d.getMatrix(matrix);
        return matrix;
    }

    @Override // t1.e
    public final float J() {
        return this.f27678q;
    }

    @Override // t1.e
    public final float K() {
        return this.f27675n;
    }

    @Override // t1.e
    public final int L() {
        return this.f27671j;
    }

    public final void M() {
        boolean z10 = this.f27683v;
        boolean z11 = false;
        boolean z12 = z10 && !this.f27668g;
        if (z10 && this.f27668g) {
            z11 = true;
        }
        if (z12 != this.f27684w) {
            this.f27684w = z12;
            this.f27665d.setClipToBounds(z12);
        }
        if (z11 != this.f27685x) {
            this.f27685x = z11;
            this.f27665d.setClipToOutline(z11);
        }
    }

    public final void N(int i10) {
        RenderNode renderNode = this.f27665d;
        if (i10 == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        } else if (i10 == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // t1.e
    public final float a() {
        return this.f27674m;
    }

    @Override // t1.e
    public final void b(float f10) {
        this.f27681t = f10;
        this.f27665d.setRotation(f10);
    }

    @Override // t1.e
    public final void c(float f10) {
        this.f27677p = f10;
        this.f27665d.setTranslationY(f10);
    }

    @Override // t1.e
    public final void d(float f10) {
        this.f27675n = f10;
        this.f27665d.setScaleY(f10);
    }

    @Override // t1.e
    public final void e() {
        this.f27665d.setRotationX(CropImageView.DEFAULT_ASPECT_RATIO);
    }

    @Override // t1.e
    public final void f(float f10) {
        this.f27672k = f10;
        this.f27665d.setAlpha(f10);
    }

    @Override // t1.e
    public final void g() {
        this.f27665d.setRotationY(CropImageView.DEFAULT_ASPECT_RATIO);
    }

    @Override // t1.e
    public final void h(float f10) {
        this.f27674m = f10;
        this.f27665d.setScaleX(f10);
    }

    @Override // t1.e
    public final float i() {
        return this.f27672k;
    }

    @Override // t1.e
    public final void j(float f10) {
        this.f27676o = f10;
        this.f27665d.setTranslationX(f10);
    }

    @Override // t1.e
    public final void k(float f10) {
        this.f27682u = f10;
        this.f27665d.setCameraDistance(-f10);
    }

    @Override // t1.e
    public final void l(z1 z1Var) {
        this.f27686y = z1Var;
    }

    @Override // t1.e
    public final void m() {
        f0.a(this.f27665d);
    }

    @Override // t1.e
    public final void n(float f10) {
        this.f27678q = f10;
        this.f27665d.setElevation(f10);
    }

    @Override // t1.e
    public final z1 o() {
        return this.f27686y;
    }

    @Override // t1.e
    public final void p(Outline outline, long j10) {
        this.f27669h = j10;
        this.f27665d.setOutline(outline);
        this.f27668g = outline != null;
        M();
    }

    @Override // t1.e
    public final int q() {
        return this.f27670i;
    }

    @Override // t1.e
    public final void r(int i10, int i11, long j10) {
        int i12 = (int) (j10 >> 32);
        int i13 = (int) (BodyPartID.bodyIdMax & j10);
        this.f27665d.setLeftTopRightBottom(i10, i11, i10 + i12, i11 + i13);
        if (f3.p.b(this.f27666e, j10)) {
            return;
        }
        if (this.f27673l) {
            this.f27665d.setPivotX(i12 / 2.0f);
            this.f27665d.setPivotY(i13 / 2.0f);
        }
        this.f27666e = j10;
    }

    @Override // t1.e
    public final float s() {
        return CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // t1.e
    public final boolean t() {
        return this.f27665d.isValid();
    }

    @Override // t1.e
    public final void u(f3.d dVar, f3.r rVar, d dVar2, b bVar) {
        Canvas canvasStart = this.f27665d.start(Math.max((int) (this.f27666e >> 32), (int) (this.f27669h >> 32)), Math.max((int) (this.f27666e & BodyPartID.bodyIdMax), (int) (this.f27669h & BodyPartID.bodyIdMax)));
        try {
            q1.b0 b0Var = this.f27663b.f21746a;
            Canvas canvas = b0Var.f21645a;
            b0Var.f21645a = canvasStart;
            s1.a aVar = this.f27664c;
            a.b bVar2 = aVar.f24173b;
            long jE = f3.q.e(this.f27666e);
            f3.d dVarB = bVar2.b();
            f3.r rVarC = bVar2.c();
            w0 w0VarA = bVar2.a();
            long jD = bVar2.d();
            d dVar3 = bVar2.f24181b;
            bVar2.f(dVar);
            bVar2.g(rVar);
            bVar2.e(b0Var);
            bVar2.h(jE);
            bVar2.f24181b = dVar2;
            b0Var.d();
            try {
                bVar.invoke(aVar);
                b0Var.o();
                bVar2.f(dVarB);
                bVar2.g(rVarC);
                bVar2.e(w0VarA);
                bVar2.h(jD);
                bVar2.f24181b = dVar3;
                b0Var.f21645a = canvas;
                this.f27665d.end(canvasStart);
            } catch (Throwable th2) {
                b0Var.o();
                a.b bVar3 = aVar.f24173b;
                bVar3.f(dVarB);
                bVar3.g(rVarC);
                bVar3.e(w0VarA);
                bVar3.h(jD);
                bVar3.f24181b = dVar3;
                throw th2;
            }
        } catch (Throwable th3) {
            this.f27665d.end(canvasStart);
            throw th3;
        }
    }

    @Override // t1.e
    public final void v(w0 w0Var) {
        DisplayListCanvas displayListCanvasA = q1.c0.a(w0Var);
        kotlin.jvm.internal.r.c(displayListCanvasA, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        displayListCanvasA.drawRenderNode(this.f27665d);
    }

    @Override // t1.e
    public final float w() {
        return this.f27681t;
    }

    @Override // t1.e
    public final void x(long j10) {
        if ((9223372034707292159L & j10) == 9205357640488583168L) {
            this.f27673l = true;
            this.f27665d.setPivotX(((int) (this.f27666e >> 32)) / 2.0f);
            this.f27665d.setPivotY(((int) (BodyPartID.bodyIdMax & this.f27666e)) / 2.0f);
        } else {
            this.f27673l = false;
            this.f27665d.setPivotX(Float.intBitsToFloat((int) (j10 >> 32)));
            this.f27665d.setPivotY(Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)));
        }
    }

    @Override // t1.e
    public final long y() {
        return this.f27679r;
    }

    @Override // t1.e
    public final float z() {
        return this.f27677p;
    }
}
