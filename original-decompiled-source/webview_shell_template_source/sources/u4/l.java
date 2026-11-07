package u4;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Looper;
import androidx.activity.c0;
import java.util.ArrayList;
import java.util.BitSet;
import u4.g;
import u4.n;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final n[] f14657a = new n[4];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix[] f14658b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix[] f14659c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    public final PointF f14660d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f14661e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final Path f14662f = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final n f14663g = new n();
    public final float[] h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    public final float[] f14664i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public final Path f14665j = new Path();

    /* renamed from: k, reason: collision with root package name */
    public final Path f14666k = new Path();

    /* renamed from: l, reason: collision with root package name */
    public final boolean f14667l = true;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final l f14668a = new l();
    }

    public l() {
        for (int i6 = 0; i6 < 4; i6++) {
            this.f14657a[i6] = new n();
            this.f14658b[i6] = new Matrix();
            this.f14659c[i6] = new Matrix();
        }
    }

    public static l b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread() ? a.f14668a : new l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public final void a(k kVar, float[] fArr, float f6, RectF rectF, g.b bVar, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i6;
        n[] nVarArr;
        Matrix[] matrixArr2;
        boolean z6;
        float f7;
        boolean z7;
        int i7;
        path.rewind();
        Path path2 = this.f14661e;
        path2.rewind();
        Path path3 = this.f14662f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i8 = 0;
        while (true) {
            matrixArr = this.f14659c;
            fArr2 = this.h;
            nVarArr = this.f14657a;
            matrixArr2 = this.f14658b;
            z6 = 0;
            if (i8 >= 4) {
                break;
            }
            d cVar = fArr == null ? i8 != 1 ? i8 != 2 ? i8 != 3 ? kVar.f14640f : kVar.f14639e : kVar.h : kVar.f14641g : new c(fArr[i8]);
            c0 c0Var = i8 != 1 ? i8 != 2 ? i8 != 3 ? kVar.f14636b : kVar.f14635a : kVar.f14638d : kVar.f14637c;
            n nVar = nVarArr[i8];
            c0Var.getClass();
            c0Var.e(nVar, f6, cVar.a(rectF));
            int i9 = i8 + 1;
            float f8 = (i9 % 4) * 90;
            matrixArr2[i8].reset();
            PointF pointF = this.f14660d;
            if (i8 == 1) {
                i7 = i8;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i8 == 2) {
                i7 = i8;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i8 != 3) {
                i7 = i8;
                pointF.set(rectF.right, rectF.top);
            } else {
                i7 = i8;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i7].setTranslate(pointF.x, pointF.y);
            matrixArr2[i7].preRotate(f8);
            n nVar2 = nVarArr[i7];
            fArr2[0] = nVar2.f14672b;
            fArr2[1] = nVar2.f14673c;
            matrixArr2[i7].mapPoints(fArr2);
            matrixArr[i7].reset();
            matrixArr[i7].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i7].preRotate(f8);
            i8 = i9;
        }
        int i10 = 0;
        for (i6 = 4; i10 < i6; i6 = 4) {
            n nVar3 = nVarArr[i10];
            nVar3.getClass();
            fArr2[z6] = 0.0f;
            fArr2[1] = nVar3.f14671a;
            matrixArr2[i10].mapPoints(fArr2);
            if (i10 == 0) {
                path.moveTo(fArr2[z6], fArr2[1]);
            } else {
                path.lineTo(fArr2[z6], fArr2[1]);
            }
            nVarArr[i10].b(matrixArr2[i10], path);
            if (bVar != null) {
                n nVar4 = nVarArr[i10];
                Matrix matrix = matrixArr2[i10];
                g gVar = g.this;
                f7 = 0.0f;
                BitSet bitSet = gVar.f14613w;
                nVar4.getClass();
                bitSet.set(i10, z6);
                n.f[] fVarArr = gVar.f14611u;
                nVar4.a(nVar4.f14675e);
                fVarArr[i10] = new m(new ArrayList(nVar4.f14677g), new Matrix(matrix));
            } else {
                f7 = 0.0f;
            }
            int i11 = i10 + 1;
            int i12 = i11 % 4;
            n nVar5 = nVarArr[i10];
            fArr2[0] = nVar5.f14672b;
            fArr2[1] = nVar5.f14673c;
            matrixArr2[i10].mapPoints(fArr2);
            n nVar6 = nVarArr[i12];
            nVar6.getClass();
            float[] fArr3 = this.f14664i;
            fArr3[0] = f7;
            fArr3[1] = nVar6.f14671a;
            matrixArr2[i12].mapPoints(fArr3);
            Matrix[] matrixArr3 = matrixArr;
            n[] nVarArr2 = nVarArr;
            float fMax = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f7);
            n nVar7 = nVarArr2[i10];
            fArr2[0] = nVar7.f14672b;
            fArr2[1] = nVar7.f14673c;
            matrixArr2[i10].mapPoints(fArr2);
            if (i10 == 1 || i10 == 3) {
                Math.abs(rectF.centerX() - fArr2[0]);
            } else {
                Math.abs(rectF.centerY() - fArr2[1]);
            }
            n nVar8 = this.f14663g;
            nVar8.d(0.0f, 270.0f, 0.0f);
            (i10 != 1 ? i10 != 2 ? i10 != 3 ? kVar.f14643j : kVar.f14642i : kVar.f14645l : kVar.f14644k).getClass();
            nVar8.c(fMax, 0.0f);
            Path path4 = this.f14665j;
            path4.reset();
            nVar8.b(matrixArr3[i10], path4);
            if (this.f14667l && (c(path4, i10) || c(path4, i12))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = nVar8.f14671a;
                matrixArr3[i10].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                nVar8.b(matrixArr3[i10], path2);
            } else {
                nVar8.b(matrixArr3[i10], path);
            }
            if (bVar != null) {
                Matrix matrix2 = matrixArr3[i10];
                g gVar2 = g.this;
                z7 = false;
                gVar2.f14613w.set(i10 + 4, false);
                n.f[] fVarArr2 = gVar2.f14612v;
                nVar8.a(nVar8.f14675e);
                fVarArr2[i10] = new m(new ArrayList(nVar8.f14677g), new Matrix(matrix2));
            } else {
                z7 = false;
            }
            matrixArr = matrixArr3;
            i10 = i11;
            z6 = z7;
            nVarArr = nVarArr2;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean c(Path path, int i6) {
        Path path2 = this.f14666k;
        path2.reset();
        this.f14657a[i6].b(this.f14658b[i6], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
