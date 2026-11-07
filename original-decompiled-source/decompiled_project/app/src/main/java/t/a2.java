package t;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;
import s1.a;

/* loaded from: classes.dex */
public final class a2 extends i2.m implements i2.r {

    /* renamed from: s, reason: collision with root package name */
    public final g f25161s;

    /* renamed from: t, reason: collision with root package name */
    public final i0 f25162t;

    /* renamed from: v, reason: collision with root package name */
    public RenderNode f25163v;

    public a2(c2.y0 y0Var, g gVar, i0 i0Var) {
        this.f25161s = gVar;
        this.f25162t = i0Var;
        T1(y0Var);
    }

    public static boolean W1(float f10, EdgeEffect edgeEffect, Canvas canvas) {
        if (f10 == CropImageView.DEFAULT_ASPECT_RATIO) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f10);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final RenderNode X1() {
        RenderNode renderNode = this.f25163v;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeA = w1.a();
        this.f25163v = renderNodeA;
        return renderNodeA;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01ea A[PHI: r16
      0x01ea: PHI (r16v2 boolean) = (r16v1 boolean), (r16v12 boolean) binds: [B:93:0x01a0, B:101:0x01bb] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // i2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(i2.h0 h0Var) {
        boolean z10;
        boolean zW1;
        char c10;
        float f10;
        float f11;
        boolean z11;
        s1.a aVar = h0Var.f13901a;
        long jI = aVar.i();
        g gVar = this.f25161s;
        gVar.k(jI);
        Canvas canvasA = q1.c0.a(aVar.f24173b.a());
        gVar.f25231d.getValue();
        if (p1.h.e(aVar.i())) {
            h0Var.z1();
            return;
        }
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        i0 i0Var = this.f25162t;
        if (!zIsHardwareAccelerated) {
            EdgeEffect edgeEffect = i0Var.f25256d;
            if (edgeEffect != null) {
                edgeEffect.finish();
            }
            EdgeEffect edgeEffect2 = i0Var.f25257e;
            if (edgeEffect2 != null) {
                edgeEffect2.finish();
            }
            EdgeEffect edgeEffect3 = i0Var.f25258f;
            if (edgeEffect3 != null) {
                edgeEffect3.finish();
            }
            EdgeEffect edgeEffect4 = i0Var.f25259g;
            if (edgeEffect4 != null) {
                edgeEffect4.finish();
            }
            EdgeEffect edgeEffect5 = i0Var.f25260h;
            if (edgeEffect5 != null) {
                edgeEffect5.finish();
            }
            EdgeEffect edgeEffect6 = i0Var.f25261i;
            if (edgeEffect6 != null) {
                edgeEffect6.finish();
            }
            EdgeEffect edgeEffect7 = i0Var.f25262j;
            if (edgeEffect7 != null) {
                edgeEffect7.finish();
            }
            EdgeEffect edgeEffect8 = i0Var.f25263k;
            if (edgeEffect8 != null) {
                edgeEffect8.finish();
            }
            h0Var.z1();
            return;
        }
        float fN0 = h0Var.N0(d0.f25188a);
        boolean z12 = i0.f(i0Var.f25256d) || i0.g(i0Var.f25260h) || i0.f(i0Var.f25257e) || i0.g(i0Var.f25261i);
        boolean z13 = i0.f(i0Var.f25258f) || i0.g(i0Var.f25262j) || i0.f(i0Var.f25259g) || i0.g(i0Var.f25263k);
        if (z12 && z13) {
            X1().setPosition(0, 0, canvasA.getWidth(), canvasA.getHeight());
        } else if (z12) {
            X1().setPosition(0, 0, (gh.a.b(fN0) * 2) + canvasA.getWidth(), canvasA.getHeight());
        } else {
            if (!z13) {
                h0Var.z1();
                return;
            }
            X1().setPosition(0, 0, canvasA.getWidth(), (gh.a.b(fN0) * 2) + canvasA.getHeight());
        }
        RecordingCanvas recordingCanvasBeginRecording = X1().beginRecording();
        if (i0.g(i0Var.f25262j)) {
            EdgeEffect edgeEffectA = i0Var.f25262j;
            if (edgeEffectA == null) {
                edgeEffectA = i0Var.a(v.t0.f30084b);
                i0Var.f25262j = edgeEffectA;
            }
            W1(90.0f, edgeEffectA, recordingCanvasBeginRecording);
            edgeEffectA.finish();
        }
        if (i0.f(i0Var.f25258f)) {
            EdgeEffect edgeEffectC = i0Var.c();
            zW1 = W1(270.0f, edgeEffectC, recordingCanvasBeginRecording);
            if (i0.g(i0Var.f25258f)) {
                z10 = z13;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (gVar.e() & BodyPartID.bodyIdMax));
                EdgeEffect edgeEffectA2 = i0Var.f25262j;
                if (edgeEffectA2 == null) {
                    edgeEffectA2 = i0Var.a(v.t0.f30084b);
                    i0Var.f25262j = edgeEffectA2;
                }
                int i10 = Build.VERSION.SDK_INT;
                float fB = i10 >= 31 ? j.b(edgeEffectC) : CropImageView.DEFAULT_ASPECT_RATIO;
                float f12 = 1 - fIntBitsToFloat;
                if (i10 >= 31) {
                    j.c(edgeEffectA2, fB, f12);
                } else {
                    edgeEffectA2.onPull(fB, f12);
                }
            } else {
                z10 = z13;
            }
        } else {
            z10 = z13;
            zW1 = false;
        }
        if (i0.g(i0Var.f25260h)) {
            EdgeEffect edgeEffectA3 = i0Var.f25260h;
            if (edgeEffectA3 == null) {
                edgeEffectA3 = i0Var.a(v.t0.f30083a);
                i0Var.f25260h = edgeEffectA3;
            }
            W1(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
            edgeEffectA3.finish();
        }
        if (i0.f(i0Var.f25256d)) {
            EdgeEffect edgeEffectE = i0Var.e();
            zW1 = W1(CropImageView.DEFAULT_ASPECT_RATIO, edgeEffectE, recordingCanvasBeginRecording) || zW1;
            if (i0.g(i0Var.f25256d)) {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (gVar.e() >> 32));
                EdgeEffect edgeEffectA4 = i0Var.f25260h;
                if (edgeEffectA4 == null) {
                    edgeEffectA4 = i0Var.a(v.t0.f30083a);
                    i0Var.f25260h = edgeEffectA4;
                }
                c10 = ' ';
                int i11 = Build.VERSION.SDK_INT;
                float fB2 = i11 >= 31 ? j.b(edgeEffectE) : CropImageView.DEFAULT_ASPECT_RATIO;
                if (i11 >= 31) {
                    j.c(edgeEffectA4, fB2, fIntBitsToFloat2);
                } else {
                    edgeEffectA4.onPull(fB2, fIntBitsToFloat2);
                }
            } else {
                c10 = ' ';
            }
        }
        if (i0.g(i0Var.f25263k)) {
            EdgeEffect edgeEffectA5 = i0Var.f25263k;
            if (edgeEffectA5 == null) {
                edgeEffectA5 = i0Var.a(v.t0.f30084b);
                i0Var.f25263k = edgeEffectA5;
            }
            W1(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
            edgeEffectA5.finish();
        }
        if (i0.f(i0Var.f25259g)) {
            EdgeEffect edgeEffectD = i0Var.d();
            zW1 = W1(90.0f, edgeEffectD, recordingCanvasBeginRecording) || zW1;
            if (i0.g(i0Var.f25259g)) {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (gVar.e() & BodyPartID.bodyIdMax));
                EdgeEffect edgeEffectA6 = i0Var.f25263k;
                if (edgeEffectA6 == null) {
                    edgeEffectA6 = i0Var.a(v.t0.f30084b);
                    i0Var.f25263k = edgeEffectA6;
                }
                int i12 = Build.VERSION.SDK_INT;
                float fB3 = i12 >= 31 ? j.b(edgeEffectD) : CropImageView.DEFAULT_ASPECT_RATIO;
                if (i12 >= 31) {
                    j.c(edgeEffectA6, fB3, fIntBitsToFloat3);
                } else {
                    edgeEffectA6.onPull(fB3, fIntBitsToFloat3);
                }
            }
        }
        if (i0.g(i0Var.f25261i)) {
            EdgeEffect edgeEffectA7 = i0Var.f25261i;
            if (edgeEffectA7 == null) {
                edgeEffectA7 = i0Var.a(v.t0.f30083a);
                i0Var.f25261i = edgeEffectA7;
            }
            W1(CropImageView.DEFAULT_ASPECT_RATIO, edgeEffectA7, recordingCanvasBeginRecording);
            edgeEffectA7.finish();
        }
        if (i0.f(i0Var.f25257e)) {
            EdgeEffect edgeEffectB = i0Var.b();
            boolean z14 = W1(180.0f, edgeEffectB, recordingCanvasBeginRecording) || zW1;
            if (i0.g(i0Var.f25257e)) {
                z11 = z14;
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (gVar.e() >> c10));
                EdgeEffect edgeEffectA8 = i0Var.f25261i;
                if (edgeEffectA8 == null) {
                    edgeEffectA8 = i0Var.a(v.t0.f30083a);
                    i0Var.f25261i = edgeEffectA8;
                }
                int i13 = Build.VERSION.SDK_INT;
                float fB4 = i13 >= 31 ? j.b(edgeEffectB) : CropImageView.DEFAULT_ASPECT_RATIO;
                float f13 = 1 - fIntBitsToFloat4;
                if (i13 >= 31) {
                    j.c(edgeEffectA8, fB4, f13);
                } else {
                    edgeEffectA8.onPull(fB4, f13);
                }
            } else {
                z11 = z14;
            }
            zW1 = z11;
        }
        if (zW1) {
            gVar.f();
        }
        float f14 = z10 ? CropImageView.DEFAULT_ASPECT_RATIO : fN0;
        if (z12) {
            fN0 = CropImageView.DEFAULT_ASPECT_RATIO;
        }
        f3.r layoutDirection = h0Var.getLayoutDirection();
        q1.b0 b0Var = new q1.b0();
        b0Var.f21645a = recordingCanvasBeginRecording;
        long jI2 = aVar.i();
        f3.d dVarB = aVar.f24173b.b();
        f3.r rVarC = aVar.f24173b.c();
        q1.w0 w0VarA = aVar.f24173b.a();
        long jD = aVar.f24173b.d();
        a.b bVar = aVar.f24173b;
        t1.d dVar = bVar.f24181b;
        bVar.f(h0Var);
        bVar.g(layoutDirection);
        bVar.e(b0Var);
        bVar.h(jI2);
        bVar.f24181b = null;
        b0Var.d();
        try {
            aVar.f24173b.f24180a.f(f14, fN0);
            try {
                h0Var.z1();
                b0Var.o();
                a.b bVar2 = aVar.f24173b;
                bVar2.f(dVarB);
                bVar2.g(rVarC);
                bVar2.e(w0VarA);
                bVar2.h(jD);
                bVar2.f24181b = dVar;
                X1().endRecording();
                int iSave = canvasA.save();
                canvasA.translate(f10, f11);
                canvasA.drawRenderNode(X1());
                canvasA.restoreToCount(iSave);
            } finally {
                aVar.f24173b.f24180a.f(-f14, -fN0);
            }
        } catch (Throwable th2) {
            b0Var.o();
            a.b bVar3 = aVar.f24173b;
            bVar3.f(dVarB);
            bVar3.g(rVarC);
            bVar3.e(w0VarA);
            bVar3.h(jD);
            bVar3.f24181b = dVar;
            throw th2;
        }
    }
}
