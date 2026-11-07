package zb;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public float f34967a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public float f34968b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public float f34969c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public float f34970d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public float f34971e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f34972f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f34973g = new ArrayList();

    public static class a extends f {

        /* renamed from: c, reason: collision with root package name */
        public final c f34974c;

        public a(c cVar) {
            this.f34974c = cVar;
        }

        @Override // zb.p.f
        public final void a(Matrix matrix, yb.a aVar, int i10, Canvas canvas) {
            float f10;
            c cVar = this.f34974c;
            float f11 = cVar.f34983f;
            float f12 = cVar.f34984g;
            RectF rectF = new RectF(cVar.f34979b, cVar.f34980c, cVar.f34981d, cVar.f34982e);
            Paint paint = aVar.f34364b;
            boolean z10 = f12 < CropImageView.DEFAULT_ASPECT_RATIO;
            Path path = aVar.f34369g;
            int[] iArr = yb.a.f34361k;
            if (z10) {
                iArr[0] = 0;
                iArr[1] = aVar.f34368f;
                iArr[2] = aVar.f34367e;
                iArr[3] = aVar.f34366d;
                f10 = 0.0f;
            } else {
                path.rewind();
                f10 = 0.0f;
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f11, f12);
                path.close();
                float f13 = -i10;
                rectF.inset(f13, f13);
                iArr[0] = 0;
                iArr[1] = aVar.f34366d;
                iArr[2] = aVar.f34367e;
                iArr[3] = aVar.f34368f;
            }
            float fWidth = rectF.width() / 2.0f;
            if (fWidth <= f10) {
                return;
            }
            float f14 = 1.0f - (i10 / fWidth);
            float[] fArr = yb.a.f34362l;
            fArr[1] = f14;
            fArr[2] = ((1.0f - f14) / 2.0f) + f14;
            paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (!z10) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, aVar.f34370h);
            }
            canvas.drawArc(rectF, f11, f12, true, paint);
            canvas.restore();
        }
    }

    public static class b extends f {

        /* renamed from: c, reason: collision with root package name */
        public final d f34975c;

        /* renamed from: d, reason: collision with root package name */
        public final float f34976d;

        /* renamed from: e, reason: collision with root package name */
        public final float f34977e;

        public b(d dVar, float f10, float f11) {
            this.f34975c = dVar;
            this.f34976d = f10;
            this.f34977e = f11;
        }

        @Override // zb.p.f
        public final void a(Matrix matrix, yb.a aVar, int i10, Canvas canvas) {
            d dVar = this.f34975c;
            float f10 = dVar.f34986c;
            float f11 = this.f34977e;
            float f12 = dVar.f34985b;
            float f13 = this.f34976d;
            RectF rectF = new RectF(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, (float) Math.hypot(f10 - f11, f12 - f13), CropImageView.DEFAULT_ASPECT_RATIO);
            Matrix matrix2 = this.f34989a;
            matrix2.set(matrix);
            matrix2.preTranslate(f13, f11);
            matrix2.preRotate(b());
            aVar.getClass();
            rectF.bottom += i10;
            rectF.offset(CropImageView.DEFAULT_ASPECT_RATIO, -i10);
            int i11 = aVar.f34368f;
            int[] iArr = yb.a.f34359i;
            iArr[0] = i11;
            iArr[1] = aVar.f34367e;
            iArr[2] = aVar.f34366d;
            Paint paint = aVar.f34365c;
            float f14 = rectF.left;
            paint.setShader(new LinearGradient(f14, rectF.top, f14, rectF.bottom, iArr, yb.a.f34360j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }

        public final float b() {
            d dVar = this.f34975c;
            return (float) Math.toDegrees(Math.atan((dVar.f34986c - this.f34977e) / (dVar.f34985b - this.f34976d)));
        }
    }

    public static class c extends e {

        /* renamed from: h, reason: collision with root package name */
        public static final RectF f34978h = new RectF();

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public final float f34979b;

        /* renamed from: c, reason: collision with root package name */
        @Deprecated
        public final float f34980c;

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        public final float f34981d;

        /* renamed from: e, reason: collision with root package name */
        @Deprecated
        public final float f34982e;

        /* renamed from: f, reason: collision with root package name */
        @Deprecated
        public float f34983f;

        /* renamed from: g, reason: collision with root package name */
        @Deprecated
        public float f34984g;

        public c(float f10, float f11, float f12, float f13) {
            this.f34979b = f10;
            this.f34980c = f11;
            this.f34981d = f12;
            this.f34982e = f13;
        }

        @Override // zb.p.e
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f34987a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            float f10 = this.f34981d;
            float f11 = this.f34982e;
            RectF rectF = f34978h;
            rectF.set(this.f34979b, this.f34980c, f10, f11);
            path.arcTo(rectF, this.f34983f, this.f34984g, false);
            path.transform(matrix);
        }
    }

    public static class d extends e {

        /* renamed from: b, reason: collision with root package name */
        public float f34985b;

        /* renamed from: c, reason: collision with root package name */
        public float f34986c;

        @Override // zb.p.e
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f34987a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f34985b, this.f34986c);
            path.transform(matrix);
        }
    }

    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f34987a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    public static abstract class f {

        /* renamed from: b, reason: collision with root package name */
        public static final Matrix f34988b = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f34989a = new Matrix();

        public abstract void a(Matrix matrix, yb.a aVar, int i10, Canvas canvas);
    }

    public p() {
        d(CropImageView.DEFAULT_ASPECT_RATIO, 270.0f, CropImageView.DEFAULT_ASPECT_RATIO);
    }

    public final void a(float f10) {
        float f11 = this.f34970d;
        if (f11 == f10) {
            return;
        }
        float f12 = ((f10 - f11) + 360.0f) % 360.0f;
        if (f12 > 180.0f) {
            return;
        }
        float f13 = this.f34968b;
        float f14 = this.f34969c;
        c cVar = new c(f13, f14, f13, f14);
        cVar.f34983f = this.f34970d;
        cVar.f34984g = f12;
        this.f34973g.add(new a(cVar));
        this.f34970d = f10;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f34972f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) arrayList.get(i10)).a(matrix, path);
        }
    }

    public final void c(float f10, float f11) {
        d dVar = new d();
        dVar.f34985b = f10;
        dVar.f34986c = f11;
        this.f34972f.add(dVar);
        b bVar = new b(dVar, this.f34968b, this.f34969c);
        float fB = bVar.b() + 270.0f;
        float fB2 = bVar.b() + 270.0f;
        a(fB);
        this.f34973g.add(bVar);
        this.f34970d = fB2;
        this.f34968b = f10;
        this.f34969c = f11;
    }

    public final void d(float f10, float f11, float f12) {
        this.f34967a = f10;
        this.f34968b = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f34969c = f10;
        this.f34970d = f11;
        this.f34971e = (f11 + f12) % 360.0f;
        this.f34972f.clear();
        this.f34973g.clear();
    }
}
