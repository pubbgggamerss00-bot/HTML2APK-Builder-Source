package zb;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Looper;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.BitSet;
import zb.h;
import zb.p;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final p[] f34952a = new p[4];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix[] f34953b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix[] f34954c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    public final PointF f34955d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f34956e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final Path f34957f = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final p f34958g = new p();

    /* renamed from: h, reason: collision with root package name */
    public final float[] f34959h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    public final float[] f34960i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public final Path f34961j = new Path();

    /* renamed from: k, reason: collision with root package name */
    public final Path f34962k = new Path();

    /* renamed from: l, reason: collision with root package name */
    public final boolean f34963l = true;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final n f34964a = new n();
    }

    public n() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f34952a[i10] = new p();
            this.f34953b[i10] = new Matrix();
            this.f34954c[i10] = new Matrix();
        }
    }

    public static n b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread() ? a.f34964a : new n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public final void a(m mVar, float[] fArr, float f10, RectF rectF, h.b bVar, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i10;
        p[] pVarArr;
        Matrix[] matrixArr2;
        boolean z10;
        float f11;
        boolean z11;
        int i11;
        path.rewind();
        Path path2 = this.f34956e;
        path2.rewind();
        Path path3 = this.f34957f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i12 = 0;
        while (true) {
            matrixArr = this.f34954c;
            fArr2 = this.f34959h;
            pVarArr = this.f34952a;
            matrixArr2 = this.f34953b;
            z10 = 0;
            if (i12 >= 4) {
                break;
            }
            d cVar = fArr == null ? i12 != 1 ? i12 != 2 ? i12 != 3 ? mVar.f34933f : mVar.f34932e : mVar.f34935h : mVar.f34934g : new c(fArr[i12]);
            e eVar = i12 != 1 ? i12 != 2 ? i12 != 3 ? mVar.f34929b : mVar.f34928a : mVar.f34931d : mVar.f34930c;
            p pVar = pVarArr[i12];
            eVar.getClass();
            eVar.a(pVar, f10, cVar.a(rectF));
            int i13 = i12 + 1;
            float f12 = (i13 % 4) * 90;
            matrixArr2[i12].reset();
            PointF pointF = this.f34955d;
            if (i12 == 1) {
                i11 = i12;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i12 == 2) {
                i11 = i12;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i12 != 3) {
                i11 = i12;
                pointF.set(rectF.right, rectF.top);
            } else {
                i11 = i12;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i11].setTranslate(pointF.x, pointF.y);
            matrixArr2[i11].preRotate(f12);
            p pVar2 = pVarArr[i11];
            fArr2[0] = pVar2.f34968b;
            fArr2[1] = pVar2.f34969c;
            matrixArr2[i11].mapPoints(fArr2);
            matrixArr[i11].reset();
            matrixArr[i11].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i11].preRotate(f12);
            i12 = i13;
        }
        int i14 = 0;
        for (i10 = 4; i14 < i10; i10 = 4) {
            p pVar3 = pVarArr[i14];
            pVar3.getClass();
            fArr2[z10] = 0.0f;
            fArr2[1] = pVar3.f34967a;
            matrixArr2[i14].mapPoints(fArr2);
            if (i14 == 0) {
                path.moveTo(fArr2[z10], fArr2[1]);
            } else {
                path.lineTo(fArr2[z10], fArr2[1]);
            }
            pVarArr[i14].b(matrixArr2[i14], path);
            if (bVar != null) {
                p pVar4 = pVarArr[i14];
                Matrix matrix = matrixArr2[i14];
                h hVar = h.this;
                f11 = 0.0f;
                BitSet bitSet = hVar.f34889e;
                pVar4.getClass();
                bitSet.set(i14, z10);
                p.f[] fVarArr = hVar.f34887c;
                pVar4.a(pVar4.f34971e);
                fVarArr[i14] = new o(new ArrayList(pVar4.f34973g), new Matrix(matrix));
            } else {
                f11 = 0.0f;
            }
            int i15 = i14 + 1;
            int i16 = i15 % 4;
            p pVar5 = pVarArr[i14];
            fArr2[0] = pVar5.f34968b;
            fArr2[1] = pVar5.f34969c;
            matrixArr2[i14].mapPoints(fArr2);
            p pVar6 = pVarArr[i16];
            pVar6.getClass();
            float[] fArr3 = this.f34960i;
            fArr3[0] = f11;
            fArr3[1] = pVar6.f34967a;
            matrixArr2[i16].mapPoints(fArr3);
            Matrix[] matrixArr3 = matrixArr;
            p[] pVarArr2 = pVarArr;
            float fMax = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f11);
            p pVar7 = pVarArr2[i14];
            fArr2[0] = pVar7.f34968b;
            fArr2[1] = pVar7.f34969c;
            matrixArr2[i14].mapPoints(fArr2);
            if (i14 == 1 || i14 == 3) {
                Math.abs(rectF.centerX() - fArr2[0]);
            } else {
                Math.abs(rectF.centerY() - fArr2[1]);
            }
            p pVar8 = this.f34958g;
            pVar8.d(CropImageView.DEFAULT_ASPECT_RATIO, 270.0f, CropImageView.DEFAULT_ASPECT_RATIO);
            (i14 != 1 ? i14 != 2 ? i14 != 3 ? mVar.f34937j : mVar.f34936i : mVar.f34939l : mVar.f34938k).getClass();
            pVar8.c(fMax, CropImageView.DEFAULT_ASPECT_RATIO);
            Path path4 = this.f34961j;
            path4.reset();
            pVar8.b(matrixArr3[i14], path4);
            if (this.f34963l && (c(path4, i14) || c(path4, i16))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = pVar8.f34967a;
                matrixArr3[i14].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                pVar8.b(matrixArr3[i14], path2);
            } else {
                pVar8.b(matrixArr3[i14], path);
            }
            if (bVar != null) {
                Matrix matrix2 = matrixArr3[i14];
                h hVar2 = h.this;
                z11 = false;
                hVar2.f34889e.set(i14 + 4, false);
                p.f[] fVarArr2 = hVar2.f34888d;
                pVar8.a(pVar8.f34971e);
                fVarArr2[i14] = new o(new ArrayList(pVar8.f34973g), new Matrix(matrix2));
            } else {
                z11 = false;
            }
            matrixArr = matrixArr3;
            i14 = i15;
            z10 = z11;
            pVarArr = pVarArr2;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean c(Path path, int i10) {
        Path path2 = this.f34962k;
        path2.reset();
        this.f34952a[i10].b(this.f34953b[i10], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
