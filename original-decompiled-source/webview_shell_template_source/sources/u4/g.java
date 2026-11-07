package u4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import androidx.camera.camera2.internal.g0;
import com.google.android.material.button.MaterialButton;
import i4.a;
import java.util.BitSet;
import java.util.Objects;
import u4.k;
import u4.n;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class g extends Drawable implements o {
    public static final Paint X;
    public static final e[] Y;
    public final Path A;
    public final Path B;
    public final RectF C;
    public final RectF D;
    public final Region E;
    public final Region F;
    public final Paint G;
    public final Paint H;
    public final t4.a I;
    public final b J;
    public final l K;
    public PorterDuffColorFilter L;
    public PorterDuffColorFilter M;
    public int N;
    public final RectF O;
    public final boolean P;
    public boolean Q;
    public k R;
    public d1.f S;
    public final d1.e[] T;
    public float[] U;
    public float[] V;
    public d W;
    public final a s;

    /* renamed from: t, reason: collision with root package name */
    public c f14610t;

    /* renamed from: u, reason: collision with root package name */
    public final n.f[] f14611u;

    /* renamed from: v, reason: collision with root package name */
    public final n.f[] f14612v;

    /* renamed from: w, reason: collision with root package name */
    public final BitSet f14613w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f14614x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f14615y;

    /* renamed from: z, reason: collision with root package name */
    public final Matrix f14616z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a {
        public a() {
        }

        public final u4.d a(u4.d dVar) {
            return dVar instanceof h ? dVar : new u4.b(-g.this.k(), dVar);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b {
        public b() {
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface d {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class e extends androidx.fragment.app.p {
        public final int s;

        public e(int i6) {
            this.s = i6;
        }

        @Override // androidx.fragment.app.p
        public final float c(o oVar) {
            float[] fArr = ((g) oVar).U;
            if (fArr != null) {
                return fArr[this.s];
            }
            return 0.0f;
        }

        @Override // androidx.fragment.app.p
        public final void h(o oVar, float f6) {
            g gVar = (g) oVar;
            float[] fArr = gVar.U;
            if (fArr != null) {
                int i6 = this.s;
                if (fArr[i6] != f6) {
                    fArr[i6] = f6;
                    d dVar = gVar.W;
                    if (dVar != null) {
                        float fI = gVar.i();
                        MaterialButton materialButton = (MaterialButton) ((androidx.camera.core.streamsharing.c) dVar).f653t;
                        int i7 = (int) (fI * 0.11f);
                        if (materialButton.W != i7) {
                            materialButton.W = i7;
                            materialButton.w();
                            materialButton.invalidate();
                        }
                    }
                    gVar.invalidateSelf();
                }
            }
        }
    }

    static {
        new i();
        new i();
        new i();
        new i();
        new f();
        new f();
        new f();
        new f();
        int i6 = 0;
        a1.a.d(0);
        Paint paint = new Paint(1);
        X = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        Y = new e[4];
        while (true) {
            e[] eVarArr = Y;
            if (i6 >= eVarArr.length) {
                return;
            }
            eVarArr[i6] = new e(i6);
            i6++;
        }
    }

    public g() {
        this(new k());
    }

    public final void b(RectF rectF, Path path) {
        this.K.a(this.f14610t.f14619a.c(), this.U, this.f14610t.f14626i, rectF, this.J, path);
        if (this.f14610t.h != 1.0f) {
            Matrix matrix = this.f14616z;
            matrix.reset();
            float f6 = this.f14610t.h;
            matrix.setScale(f6, f6, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.O, true);
    }

    public final float c(RectF rectF, k kVar, float[] fArr) {
        if (fArr == null) {
            if (kVar.i(rectF)) {
                return kVar.f14639e.a(rectF);
            }
            return -1.0f;
        }
        if (this.Q) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final int d(int i6) {
        int i7;
        c cVar = this.f14610t;
        float f6 = cVar.f14630m + 0.0f + cVar.f14629l;
        j4.a aVar = cVar.f14620b;
        if (aVar == null || !aVar.f13498a || m0.a.e(i6, 255) != aVar.f13501d) {
            return i6;
        }
        float fMin = (aVar.f13502e <= 0.0f || f6 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f6 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i6);
        int i8 = androidx.work.j.i(fMin, m0.a.e(i6, 255), aVar.f13499b);
        if (fMin > 0.0f && (i7 = aVar.f13500c) != 0) {
            i8 = m0.a.c(m0.a.e(i7, j4.a.f13497f), i8);
        }
        return m0.a.e(i8, iAlpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.L;
        Paint paint2 = this.G;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i6 = this.f14610t.f14628k;
        paint2.setAlpha(((i6 + (i6 >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.M;
        Paint paint3 = this.H;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.f14610t.f14627j);
        int alpha2 = paint3.getAlpha();
        int i7 = this.f14610t.f14628k;
        paint3.setAlpha(((i7 + (i7 >>> 7)) * alpha2) >>> 8);
        boolean z6 = l() || !o();
        Paint.Style style = this.f14610t.f14633p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z7 = this.f14614x;
            paint = paint2;
            Path path = this.A;
            if (z7) {
                if (z6) {
                    b(h(), path);
                }
                this.f14614x = false;
            }
            if (l()) {
                canvas.save();
                double d7 = 0;
                canvas.translate((int) (this.f14610t.f14632o * Math.sin(Math.toRadians(d7))), (int) (Math.cos(Math.toRadians(d7)) * this.f14610t.f14632o));
                if (this.P) {
                    Rect bounds = getBounds();
                    RectF rectF = this.O;
                    int iWidth = (int) (rectF.width() - bounds.width());
                    int iHeight = (int) (rectF.height() - bounds.height());
                    if (iWidth < 0 || iHeight < 0) {
                        StringBuilder sbA = g0.a("Invalid shadow bounds. Check that the treatments result in a valid path. extra width: ", iWidth, " extra height: ", iHeight, " path bounds: ");
                        sbA.append(rectF);
                        throw new IllegalStateException(sbA.toString());
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f14610t.f14631n * 2) + ((int) rectF.width()) + iWidth, (this.f14610t.f14631n * 2) + ((int) rectF.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    int i8 = bounds.left;
                    int i9 = this.f14610t.f14631n;
                    float f6 = (i8 - i9) - iWidth;
                    float f7 = (bounds.top - i9) - iHeight;
                    canvas2.translate(-f6, -f7);
                    e(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f6, f7, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    e(canvas);
                    canvas.restore();
                }
            }
            f(canvas, paint, path, this.f14610t.f14619a.c(), this.U, h());
        } else {
            paint = paint2;
        }
        if (m()) {
            if (this.f14615y) {
                k kVarJ = j();
                k.a aVarJ = kVarJ.j();
                u4.d dVar = kVarJ.f14639e;
                a aVar = this.s;
                aVarJ.f14650e = aVar.a(dVar);
                aVarJ.f14651f = aVar.a(kVarJ.f14640f);
                aVarJ.h = aVar.a(kVarJ.h);
                aVarJ.f14652g = aVar.a(kVarJ.f14641g);
                this.R = aVarJ.a();
                float[] fArr = this.U;
                if (fArr != null) {
                    if (this.V == null) {
                        this.V = new float[fArr.length];
                    }
                    float fK = k();
                    int i10 = 0;
                    while (true) {
                        float[] fArr2 = this.U;
                        if (i10 >= fArr2.length) {
                            break;
                        }
                        this.V[i10] = Math.max(0.0f, fArr2[i10] - fK);
                        i10++;
                    }
                } else {
                    this.V = null;
                }
                if (z6) {
                    k kVar = this.R;
                    float[] fArr3 = this.V;
                    float f8 = this.f14610t.f14626i;
                    RectF rectFH = h();
                    RectF rectF2 = this.D;
                    rectF2.set(rectFH);
                    float fK2 = k();
                    rectF2.inset(fK2, fK2);
                    this.K.a(kVar, fArr3, f8, rectF2, null, this.B);
                }
                this.f14615y = false;
            }
            g(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    public final void e(Canvas canvas) {
        if (this.f14613w.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i6 = this.f14610t.f14632o;
        Path path = this.A;
        t4.a aVar = this.I;
        if (i6 != 0) {
            canvas.drawPath(path, aVar.f14437a);
        }
        for (int i7 = 0; i7 < 4; i7++) {
            n.f fVar = this.f14611u[i7];
            int i8 = this.f14610t.f14631n;
            Matrix matrix = n.f.f14691b;
            fVar.a(matrix, aVar, i8, canvas);
            this.f14612v[i7].a(matrix, aVar, this.f14610t.f14631n, canvas);
        }
        if (this.P) {
            double d7 = 0;
            int iSin = (int) (Math.sin(Math.toRadians(d7)) * this.f14610t.f14632o);
            int iCos = (int) (Math.cos(Math.toRadians(d7)) * this.f14610t.f14632o);
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, X);
            canvas.translate(iSin, iCos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, k kVar, float[] fArr, RectF rectF) {
        float fC = c(rectF, kVar, fArr);
        if (fC < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f6 = fC * this.f14610t.f14626i;
            canvas.drawRoundRect(rectF, f6, f6, paint);
        }
    }

    public void g(Canvas canvas) {
        k kVar = this.R;
        float[] fArr = this.V;
        RectF rectFH = h();
        RectF rectF = this.D;
        rectF.set(rectFH);
        float fK = k();
        rectF.inset(fK, fK);
        f(canvas, this.H, this.B, kVar, fArr, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f14610t.f14628k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f14610t;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f14610t.getClass();
        RectF rectFH = h();
        if (rectFH.isEmpty()) {
            return;
        }
        float fC = c(rectFH, this.f14610t.f14619a.c(), this.U);
        if (fC >= 0.0f) {
            outline.setRoundRect(getBounds(), fC * this.f14610t.f14626i);
            return;
        }
        boolean z6 = this.f14614x;
        Path path = this.A;
        if (z6) {
            b(rectFH, path);
            this.f14614x = false;
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 30) {
            a.b.a(outline, path);
            return;
        }
        if (i6 >= 29) {
            try {
                a.C0068a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            a.C0068a.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f14610t.f14625g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.E;
        region.set(bounds);
        RectF rectFH = h();
        Path path = this.A;
        b(rectFH, path);
        Region region2 = this.F;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        Rect bounds = getBounds();
        RectF rectF = this.C;
        rectF.set(bounds);
        return rectF;
    }

    public final float i() {
        float[] fArr = this.U;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF rectFH = h();
        k kVarJ = j();
        l lVar = this.K;
        lVar.getClass();
        float fA = kVarJ.f14639e.a(rectFH);
        k kVarJ2 = j();
        lVar.getClass();
        float fA2 = kVarJ2.h.a(rectFH) + fA;
        k kVarJ3 = j();
        lVar.getClass();
        float fA3 = fA2 - kVarJ3.f14641g.a(rectFH);
        k kVarJ4 = j();
        lVar.getClass();
        return (fA3 - kVarJ4.f14640f.a(rectFH)) / 2.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f14614x = true;
        this.f14615y = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f14610t.f14623e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f14610t.getClass();
        ColorStateList colorStateList2 = this.f14610t.f14622d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f14610t.f14621c;
        return (colorStateList3 != null && colorStateList3.isStateful()) || this.f14610t.f14619a.e();
    }

    public final k j() {
        return this.f14610t.f14619a.c();
    }

    public final float k() {
        if (m()) {
            return this.H.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final boolean l() {
        c cVar = this.f14610t;
        cVar.getClass();
        return cVar.f14631n > 0 && !o() && !this.A.isConvex() && Build.VERSION.SDK_INT < 29;
    }

    public final boolean m() {
        Paint.Style style = this.f14610t.f14633p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.H.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f14610t = new c(this.f14610t);
        return this;
    }

    public final void n(Context context) {
        this.f14610t.f14620b = new j4.a(context);
        w();
    }

    public final boolean o() {
        if (this.f14610t.f14619a.b(getState()).i(h())) {
            return this.U == null || this.Q;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f14614x = true;
        this.f14615y = true;
        super.onBoundsChange(rect);
        if (!this.f14610t.f14619a.e() || rect.isEmpty()) {
            return;
        }
        int[] state = getState();
        d1.e[] eVarArr = this.T;
        int length = eVarArr.length;
        boolean z6 = false;
        int i6 = 0;
        while (true) {
            if (i6 < length) {
                d1.e eVar = eVarArr[i6];
                if (eVar != null && eVar.f12689e) {
                    z6 = true;
                    break;
                }
                i6++;
            } else {
                break;
            }
        }
        u(state, true ^ z6);
    }

    @Override // android.graphics.drawable.Drawable, n4.h.b
    public boolean onStateChange(int[] iArr) {
        if (this.f14610t.f14619a.e()) {
            u(iArr, false);
        }
        boolean z6 = t(iArr) || v();
        if (z6) {
            invalidateSelf();
        }
        return z6;
    }

    public final void p(d1.f fVar) {
        if (this.S == fVar) {
            return;
        }
        this.S = fVar;
        int i6 = 0;
        while (true) {
            d1.e[] eVarArr = this.T;
            if (i6 >= eVarArr.length) {
                u(getState(), true);
                invalidateSelf();
                return;
            }
            if (eVarArr[i6] == null) {
                eVarArr[i6] = new d1.e(this, Y[i6]);
            }
            d1.e eVar = eVarArr[i6];
            d1.f fVar2 = new d1.f();
            float f6 = (float) fVar.f12699b;
            if (f6 < 0.0f) {
                throw new IllegalArgumentException("Damping ratio must be non-negative");
            }
            fVar2.f12699b = f6;
            fVar2.f12700c = false;
            double d7 = fVar.f12698a;
            float f7 = (float) (d7 * d7);
            if (f7 <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            fVar2.f12698a = Math.sqrt(f7);
            fVar2.f12700c = false;
            eVar.f12696q = fVar2;
            i6++;
        }
    }

    public final void q(float f6) {
        c cVar = this.f14610t;
        if (cVar.f14630m != f6) {
            cVar.f14630m = f6;
            w();
        }
    }

    public final void r(ColorStateList colorStateList) {
        c cVar = this.f14610t;
        if (cVar.f14621c != colorStateList) {
            cVar.f14621c = colorStateList;
            onStateChange(getState());
        }
    }

    public final void s(j jVar) {
        if (jVar instanceof k) {
            setShapeAppearanceModel((k) jVar);
            return;
        }
        q qVar = (q) jVar;
        c cVar = this.f14610t;
        if (cVar.f14619a != qVar) {
            cVar.f14619a = qVar;
            u(getState(), true);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i6) {
        c cVar = this.f14610t;
        if (cVar.f14628k != i6) {
            cVar.f14628k = i6;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f14610t.getClass();
        super.invalidateSelf();
    }

    @Override // u4.o
    public final void setShapeAppearanceModel(k kVar) {
        this.f14610t.f14619a = kVar;
        this.U = null;
        this.V = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i6) {
        setTintList(ColorStateList.valueOf(i6));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f14610t.f14623e = colorStateList;
        v();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f14610t;
        if (cVar.f14624f != mode) {
            cVar.f14624f = mode;
            v();
            super.invalidateSelf();
        }
    }

    public final boolean t(int[] iArr) {
        boolean z6;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f14610t.f14621c == null || color2 == (colorForState2 = this.f14610t.f14621c.getColorForState(iArr, (color2 = (paint2 = this.G).getColor())))) {
            z6 = false;
        } else {
            paint2.setColor(colorForState2);
            z6 = true;
        }
        if (this.f14610t.f14622d == null || color == (colorForState = this.f14610t.f14622d.getColorForState(iArr, (color = (paint = this.H).getColor())))) {
            return z6;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053 A[EDGE_INSN: B:55:0x0053->B:27:0x0053 BREAK  A[LOOP:0: B:18:0x003a->B:23:0x0044]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(int[] iArr, boolean z6) {
        boolean z7;
        RectF rectFH = h();
        if (!this.f14610t.f14619a.e() || rectFH.isEmpty()) {
            return;
        }
        int i6 = 0;
        boolean z8 = z6 | (this.S == null);
        if (this.U == null) {
            this.U = new float[4];
        }
        k kVarB = this.f14610t.f14619a.b(iArr);
        float[] fArr = this.U;
        if (fArr.length <= 1) {
            z7 = !kVarB.i(h());
        } else {
            float f6 = fArr[0];
            for (int i7 = 1; i7 < fArr.length; i7++) {
                if (fArr[i7] != f6) {
                    break;
                }
            }
            if (!kVarB.i(h())) {
            }
        }
        this.Q = z7;
        if (!z7) {
            this.f14614x = true;
            this.f14615y = true;
        }
        while (i6 < 4) {
            this.K.getClass();
            float fA = (i6 != 1 ? i6 != 2 ? i6 != 3 ? kVarB.f14640f : kVarB.f14639e : kVarB.h : kVarB.f14641g).a(rectFH);
            if (z8) {
                this.U[i6] = fA;
            }
            d1.e[] eVarArr = this.T;
            d1.e eVar = eVarArr[i6];
            if (eVar != null) {
                eVar.d(fA);
                if (z8) {
                    eVarArr[i6].e();
                }
            }
            i6++;
        }
        if (z8) {
            invalidateSelf();
        }
    }

    public final boolean v() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.L;
        PorterDuffColorFilter porterDuffColorFilter3 = this.M;
        c cVar = this.f14610t;
        ColorStateList colorStateList = cVar.f14623e;
        PorterDuff.Mode mode = cVar.f14624f;
        if (colorStateList == null || mode == null) {
            int color = this.G.getColor();
            int iD = d(color);
            this.N = iD;
            porterDuffColorFilter = iD != color ? new PorterDuffColorFilter(iD, PorterDuff.Mode.SRC_IN) : null;
        } else {
            int iD2 = d(colorStateList.getColorForState(getState(), 0));
            this.N = iD2;
            porterDuffColorFilter = new PorterDuffColorFilter(iD2, mode);
        }
        this.L = porterDuffColorFilter;
        this.f14610t.getClass();
        this.M = null;
        this.f14610t.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.L) && Objects.equals(porterDuffColorFilter3, this.M)) ? false : true;
    }

    public final void w() {
        c cVar = this.f14610t;
        float f6 = cVar.f14630m + 0.0f;
        cVar.f14631n = (int) Math.ceil(0.75f * f6);
        this.f14610t.f14632o = (int) Math.ceil(f6 * 0.25f);
        v();
        if (l() || !o()) {
            invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public g(Context context, AttributeSet attributeSet, int i6, int i7) {
        this(k.f(context, attributeSet, i6, i7).a());
    }

    public g(k kVar) {
        this(new c(kVar));
    }

    public g(j jVar) {
        this(new c(jVar));
    }

    public g(c cVar) {
        this.s = new a();
        this.f14611u = new n.f[4];
        this.f14612v = new n.f[4];
        this.f14613w = new BitSet(8);
        this.f14616z = new Matrix();
        this.A = new Path();
        this.B = new Path();
        this.C = new RectF();
        this.D = new RectF();
        this.E = new Region();
        this.F = new Region();
        Paint paint = new Paint(1);
        this.G = paint;
        Paint paint2 = new Paint(1);
        this.H = paint2;
        this.I = new t4.a();
        this.K = l.b();
        this.O = new RectF();
        this.P = true;
        this.Q = true;
        this.T = new d1.e[4];
        this.f14610t = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        v();
        t(getState());
        this.J = new b();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public j f14619a;

        /* renamed from: b, reason: collision with root package name */
        public j4.a f14620b;

        /* renamed from: c, reason: collision with root package name */
        public ColorStateList f14621c;

        /* renamed from: d, reason: collision with root package name */
        public ColorStateList f14622d;

        /* renamed from: e, reason: collision with root package name */
        public ColorStateList f14623e;

        /* renamed from: f, reason: collision with root package name */
        public PorterDuff.Mode f14624f;

        /* renamed from: g, reason: collision with root package name */
        public Rect f14625g;
        public final float h;

        /* renamed from: i, reason: collision with root package name */
        public float f14626i;

        /* renamed from: j, reason: collision with root package name */
        public float f14627j;

        /* renamed from: k, reason: collision with root package name */
        public int f14628k;

        /* renamed from: l, reason: collision with root package name */
        public float f14629l;

        /* renamed from: m, reason: collision with root package name */
        public float f14630m;

        /* renamed from: n, reason: collision with root package name */
        public int f14631n;

        /* renamed from: o, reason: collision with root package name */
        public int f14632o;

        /* renamed from: p, reason: collision with root package name */
        public final Paint.Style f14633p;

        public c(j jVar) {
            this.f14621c = null;
            this.f14622d = null;
            this.f14623e = null;
            this.f14624f = PorterDuff.Mode.SRC_IN;
            this.f14625g = null;
            this.h = 1.0f;
            this.f14626i = 1.0f;
            this.f14628k = 255;
            this.f14629l = 0.0f;
            this.f14630m = 0.0f;
            this.f14631n = 0;
            this.f14632o = 0;
            this.f14633p = Paint.Style.FILL_AND_STROKE;
            this.f14619a = jVar;
            this.f14620b = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g(this);
            gVar.f14614x = true;
            gVar.f14615y = true;
            return gVar;
        }

        public c(c cVar) {
            this.f14621c = null;
            this.f14622d = null;
            this.f14623e = null;
            this.f14624f = PorterDuff.Mode.SRC_IN;
            this.f14625g = null;
            this.h = 1.0f;
            this.f14626i = 1.0f;
            this.f14628k = 255;
            this.f14629l = 0.0f;
            this.f14630m = 0.0f;
            this.f14631n = 0;
            this.f14632o = 0;
            this.f14633p = Paint.Style.FILL_AND_STROKE;
            this.f14619a = cVar.f14619a;
            this.f14620b = cVar.f14620b;
            this.f14627j = cVar.f14627j;
            this.f14621c = cVar.f14621c;
            this.f14622d = cVar.f14622d;
            this.f14624f = cVar.f14624f;
            this.f14623e = cVar.f14623e;
            this.f14628k = cVar.f14628k;
            this.h = cVar.h;
            this.f14632o = cVar.f14632o;
            this.f14626i = cVar.f14626i;
            this.f14629l = cVar.f14629l;
            this.f14630m = cVar.f14630m;
            this.f14631n = cVar.f14631n;
            this.f14633p = cVar.f14633p;
            if (cVar.f14625g != null) {
                this.f14625g = new Rect(cVar.f14625g);
            }
        }
    }
}
