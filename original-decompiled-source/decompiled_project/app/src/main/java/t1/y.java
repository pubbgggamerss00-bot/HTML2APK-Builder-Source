package t1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import c2.n0;
import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;
import q1.b1;
import q1.w0;
import q1.x0;
import q1.z1;
import s1.a;

/* loaded from: classes.dex */
public final class y implements e {

    /* renamed from: b, reason: collision with root package name */
    public final x0 f27698b;

    /* renamed from: c, reason: collision with root package name */
    public final s1.a f27699c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f27700d;

    /* renamed from: e, reason: collision with root package name */
    public long f27701e;

    /* renamed from: f, reason: collision with root package name */
    public Matrix f27702f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f27703g;

    /* renamed from: h, reason: collision with root package name */
    public float f27704h;

    /* renamed from: i, reason: collision with root package name */
    public final int f27705i;

    /* renamed from: j, reason: collision with root package name */
    public float f27706j;

    /* renamed from: k, reason: collision with root package name */
    public float f27707k;

    /* renamed from: l, reason: collision with root package name */
    public float f27708l;

    /* renamed from: m, reason: collision with root package name */
    public float f27709m;

    /* renamed from: n, reason: collision with root package name */
    public float f27710n;

    /* renamed from: o, reason: collision with root package name */
    public long f27711o;

    /* renamed from: p, reason: collision with root package name */
    public long f27712p;

    /* renamed from: q, reason: collision with root package name */
    public float f27713q;

    /* renamed from: r, reason: collision with root package name */
    public float f27714r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f27715s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f27716t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f27717u;

    /* renamed from: v, reason: collision with root package name */
    public z1 f27718v;

    /* renamed from: w, reason: collision with root package name */
    public int f27719w;

    public y() {
        x0 x0Var = new x0();
        s1.a aVar = new s1.a();
        this.f27698b = x0Var;
        this.f27699c = aVar;
        RenderNode renderNodeB = q1.b.b();
        this.f27700d = renderNodeB;
        this.f27701e = 0L;
        renderNodeB.setClipToBounds(false);
        N(renderNodeB, 0);
        this.f27704h = 1.0f;
        this.f27705i = 3;
        this.f27706j = 1.0f;
        this.f27707k = 1.0f;
        long j10 = b1.f21648b;
        this.f27711o = j10;
        this.f27712p = j10;
        this.f27714r = 8.0f;
        this.f27719w = 0;
    }

    public static void N(RenderNode renderNode, int i10) {
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

    @Override // t1.e
    public final void A(long j10) {
        this.f27711o = j10;
        this.f27700d.setAmbientShadowColor(n0.j(j10));
    }

    @Override // t1.e
    public final long B() {
        return this.f27712p;
    }

    @Override // t1.e
    public final void C(boolean z10) {
        this.f27715s = z10;
        M();
    }

    @Override // t1.e
    public final void D(long j10) {
        this.f27712p = j10;
        this.f27700d.setSpotShadowColor(n0.j(j10));
    }

    @Override // t1.e
    public final float E() {
        return this.f27714r;
    }

    @Override // t1.e
    public final float F() {
        return this.f27708l;
    }

    @Override // t1.e
    public final float G() {
        return CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // t1.e
    public final void H(int i10) {
        this.f27719w = i10;
        if (i10 != 1 && this.f27705i == 3 && this.f27718v == null) {
            N(this.f27700d, i10);
        } else {
            N(this.f27700d, 1);
        }
    }

    @Override // t1.e
    public final Matrix I() {
        Matrix matrix = this.f27702f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f27702f = matrix;
        }
        this.f27700d.getMatrix(matrix);
        return matrix;
    }

    @Override // t1.e
    public final float J() {
        return this.f27710n;
    }

    @Override // t1.e
    public final float K() {
        return this.f27707k;
    }

    @Override // t1.e
    public final int L() {
        return this.f27705i;
    }

    public final void M() {
        boolean z10 = this.f27715s;
        boolean z11 = false;
        boolean z12 = z10 && !this.f27703g;
        if (z10 && this.f27703g) {
            z11 = true;
        }
        if (z12 != this.f27716t) {
            this.f27716t = z12;
            this.f27700d.setClipToBounds(z12);
        }
        if (z11 != this.f27717u) {
            this.f27717u = z11;
            this.f27700d.setClipToOutline(z11);
        }
    }

    @Override // t1.e
    public final float a() {
        return this.f27706j;
    }

    @Override // t1.e
    public final void b(float f10) {
        this.f27713q = f10;
        this.f27700d.setRotationZ(f10);
    }

    @Override // t1.e
    public final void c(float f10) {
        this.f27709m = f10;
        this.f27700d.setTranslationY(f10);
    }

    @Override // t1.e
    public final void d(float f10) {
        this.f27707k = f10;
        this.f27700d.setScaleY(f10);
    }

    @Override // t1.e
    public final void e() {
        this.f27700d.setRotationX(CropImageView.DEFAULT_ASPECT_RATIO);
    }

    @Override // t1.e
    public final void f(float f10) {
        this.f27704h = f10;
        this.f27700d.setAlpha(f10);
    }

    @Override // t1.e
    public final void g() {
        this.f27700d.setRotationY(CropImageView.DEFAULT_ASPECT_RATIO);
    }

    @Override // t1.e
    public final void h(float f10) {
        this.f27706j = f10;
        this.f27700d.setScaleX(f10);
    }

    @Override // t1.e
    public final float i() {
        return this.f27704h;
    }

    @Override // t1.e
    public final void j(float f10) {
        this.f27708l = f10;
        this.f27700d.setTranslationX(f10);
    }

    @Override // t1.e
    public final void k(float f10) {
        this.f27714r = f10;
        this.f27700d.setCameraDistance(f10);
    }

    @Override // t1.e
    public final void l(z1 z1Var) {
        this.f27718v = z1Var;
        if (Build.VERSION.SDK_INT >= 31) {
            this.f27700d.setRenderEffect(z1Var != null ? z1Var.a() : null);
        }
    }

    @Override // t1.e
    public final void m() {
        this.f27700d.discardDisplayList();
    }

    @Override // t1.e
    public final void n(float f10) {
        this.f27710n = f10;
        this.f27700d.setElevation(f10);
    }

    @Override // t1.e
    public final z1 o() {
        return this.f27718v;
    }

    @Override // t1.e
    public final void p(Outline outline, long j10) {
        this.f27700d.setOutline(outline);
        this.f27703g = outline != null;
        M();
    }

    @Override // t1.e
    public final int q() {
        return this.f27719w;
    }

    @Override // t1.e
    public final void r(int i10, int i11, long j10) {
        this.f27700d.setPosition(i10, i11, ((int) (j10 >> 32)) + i10, ((int) (BodyPartID.bodyIdMax & j10)) + i11);
        this.f27701e = f3.q.e(j10);
    }

    @Override // t1.e
    public final float s() {
        return CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // t1.e
    public final boolean t() {
        return this.f27700d.hasDisplayList();
    }

    @Override // t1.e
    public final void u(f3.d dVar, f3.r rVar, d dVar2, b bVar) {
        s1.a aVar = this.f27699c;
        RecordingCanvas recordingCanvasBeginRecording = this.f27700d.beginRecording();
        try {
            x0 x0Var = this.f27698b;
            q1.b0 b0Var = x0Var.f21746a;
            Canvas canvas = b0Var.f21645a;
            b0Var.f21645a = recordingCanvasBeginRecording;
            a.b bVar2 = aVar.f24173b;
            bVar2.f(dVar);
            bVar2.g(rVar);
            bVar2.f24181b = dVar2;
            bVar2.h(this.f27701e);
            bVar2.e(b0Var);
            bVar.invoke(aVar);
            x0Var.f21746a.f21645a = canvas;
        } finally {
            this.f27700d.endRecording();
        }
    }

    @Override // t1.e
    public final void v(w0 w0Var) {
        q1.c0.a(w0Var).drawRenderNode(this.f27700d);
    }

    @Override // t1.e
    public final float w() {
        return this.f27713q;
    }

    @Override // t1.e
    public final void x(long j10) {
        if ((9223372034707292159L & j10) == 9205357640488583168L) {
            this.f27700d.resetPivot();
        } else {
            this.f27700d.setPivotX(Float.intBitsToFloat((int) (j10 >> 32)));
            this.f27700d.setPivotY(Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)));
        }
    }

    @Override // t1.e
    public final long y() {
        return this.f27711o;
    }

    @Override // t1.e
    public final float z() {
        return this.f27709m;
    }
}
