package u4;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public float f14671a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public float f14672b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public float f14673c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public float f14674d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public float f14675e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f14676f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f14677g = new ArrayList();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a extends f {

        /* renamed from: c, reason: collision with root package name */
        public final c f14678c;

        public a(c cVar) {
            this.f14678c = cVar;
        }

        @Override // u4.n.f
        public final void a(Matrix matrix, t4.a aVar, int i6, Canvas canvas) {
            float f6;
            c cVar = this.f14678c;
            float f7 = cVar.f14686f;
            float f8 = cVar.f14687g;
            RectF rectF = new RectF(cVar.f14682b, cVar.f14683c, cVar.f14684d, cVar.f14685e);
            Paint paint = aVar.f14438b;
            boolean z6 = f8 < 0.0f;
            Path path = aVar.f14443g;
            int[] iArr = t4.a.f14435k;
            if (z6) {
                iArr[0] = 0;
                iArr[1] = aVar.f14442f;
                iArr[2] = aVar.f14441e;
                iArr[3] = aVar.f14440d;
                f6 = 0.0f;
            } else {
                path.rewind();
                f6 = 0.0f;
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f7, f8);
                path.close();
                float f9 = -i6;
                rectF.inset(f9, f9);
                iArr[0] = 0;
                iArr[1] = aVar.f14440d;
                iArr[2] = aVar.f14441e;
                iArr[3] = aVar.f14442f;
            }
            float fWidth = rectF.width() / 2.0f;
            if (fWidth <= f6) {
                return;
            }
            float f10 = 1.0f - (i6 / fWidth);
            float[] fArr = t4.a.f14436l;
            fArr[1] = f10;
            fArr[2] = ((1.0f - f10) / 2.0f) + f10;
            paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (!z6) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, aVar.h);
            }
            canvas.drawArc(rectF, f7, f8, true, paint);
            canvas.restore();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b extends f {

        /* renamed from: c, reason: collision with root package name */
        public final d f14679c;

        /* renamed from: d, reason: collision with root package name */
        public final float f14680d;

        /* renamed from: e, reason: collision with root package name */
        public final float f14681e;

        public b(d dVar, float f6, float f7) {
            this.f14679c = dVar;
            this.f14680d = f6;
            this.f14681e = f7;
        }

        @Override // u4.n.f
        public final void a(Matrix matrix, t4.a aVar, int i6, Canvas canvas) {
            d dVar = this.f14679c;
            float f6 = dVar.f14689c;
            float f7 = this.f14681e;
            float f8 = dVar.f14688b;
            float f9 = this.f14680d;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f6 - f7, f8 - f9), 0.0f);
            Matrix matrix2 = this.f14692a;
            matrix2.set(matrix);
            matrix2.preTranslate(f9, f7);
            matrix2.preRotate(b());
            aVar.getClass();
            rectF.bottom += i6;
            rectF.offset(0.0f, -i6);
            int i7 = aVar.f14442f;
            int[] iArr = t4.a.f14433i;
            iArr[0] = i7;
            iArr[1] = aVar.f14441e;
            iArr[2] = aVar.f14440d;
            Paint paint = aVar.f14439c;
            float f10 = rectF.left;
            paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, t4.a.f14434j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }

        public final float b() {
            d dVar = this.f14679c;
            return (float) Math.toDegrees(Math.atan((dVar.f14689c - this.f14681e) / (dVar.f14688b - this.f14680d)));
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c extends e {
        public static final RectF h = new RectF();

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public final float f14682b;

        /* renamed from: c, reason: collision with root package name */
        @Deprecated
        public final float f14683c;

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        public final float f14684d;

        /* renamed from: e, reason: collision with root package name */
        @Deprecated
        public final float f14685e;

        /* renamed from: f, reason: collision with root package name */
        @Deprecated
        public float f14686f;

        /* renamed from: g, reason: collision with root package name */
        @Deprecated
        public float f14687g;

        public c(float f6, float f7, float f8, float f9) {
            this.f14682b = f6;
            this.f14683c = f7;
            this.f14684d = f8;
            this.f14685e = f9;
        }

        @Override // u4.n.e
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f14690a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            float f6 = this.f14684d;
            float f7 = this.f14685e;
            RectF rectF = h;
            rectF.set(this.f14682b, this.f14683c, f6, f7);
            path.arcTo(rectF, this.f14686f, this.f14687g, false);
            path.transform(matrix);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class d extends e {

        /* renamed from: b, reason: collision with root package name */
        public float f14688b;

        /* renamed from: c, reason: collision with root package name */
        public float f14689c;

        @Override // u4.n.e
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f14690a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f14688b, this.f14689c);
            path.transform(matrix);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f14690a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class f {

        /* renamed from: b, reason: collision with root package name */
        public static final Matrix f14691b = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f14692a = new Matrix();

        public abstract void a(Matrix matrix, t4.a aVar, int i6, Canvas canvas);
    }

    public n() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f6) {
        float f7 = this.f14674d;
        if (f7 == f6) {
            return;
        }
        float f8 = ((f6 - f7) + 360.0f) % 360.0f;
        if (f8 > 180.0f) {
            return;
        }
        float f9 = this.f14672b;
        float f10 = this.f14673c;
        c cVar = new c(f9, f10, f9, f10);
        cVar.f14686f = this.f14674d;
        cVar.f14687g = f8;
        this.f14677g.add(new a(cVar));
        this.f14674d = f6;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f14676f;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((e) arrayList.get(i6)).a(matrix, path);
        }
    }

    public final void c(float f6, float f7) {
        d dVar = new d();
        dVar.f14688b = f6;
        dVar.f14689c = f7;
        this.f14676f.add(dVar);
        b bVar = new b(dVar, this.f14672b, this.f14673c);
        float fB = bVar.b() + 270.0f;
        float fB2 = bVar.b() + 270.0f;
        a(fB);
        this.f14677g.add(bVar);
        this.f14674d = fB2;
        this.f14672b = f6;
        this.f14673c = f7;
    }

    public final void d(float f6, float f7, float f8) {
        this.f14671a = f6;
        this.f14672b = 0.0f;
        this.f14673c = f6;
        this.f14674d = f7;
        this.f14675e = (f7 + f8) % 360.0f;
        this.f14676f.clear();
        this.f14677g.clear();
    }
}
