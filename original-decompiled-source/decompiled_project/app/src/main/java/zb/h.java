package zb;

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
import android.util.Log;
import com.yalantis.ucrop.view.CropImageView;
import java.util.BitSet;
import java.util.Objects;
import p.g0;
import tb.d;
import zb.m;
import zb.p;

/* loaded from: classes2.dex */
public final class h extends Drawable {
    public static final Paint B;
    public static final d[] C;
    public float[] A;

    /* renamed from: a, reason: collision with root package name */
    public final a f34885a;

    /* renamed from: b, reason: collision with root package name */
    public c f34886b;

    /* renamed from: c, reason: collision with root package name */
    public final p.f[] f34887c;

    /* renamed from: d, reason: collision with root package name */
    public final p.f[] f34888d;

    /* renamed from: e, reason: collision with root package name */
    public final BitSet f34889e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f34890f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f34891g;

    /* renamed from: h, reason: collision with root package name */
    public final Matrix f34892h;

    /* renamed from: i, reason: collision with root package name */
    public final Path f34893i;

    /* renamed from: j, reason: collision with root package name */
    public final Path f34894j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f34895k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f34896l;

    /* renamed from: m, reason: collision with root package name */
    public final Region f34897m;

    /* renamed from: n, reason: collision with root package name */
    public final Region f34898n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f34899o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint f34900p;

    /* renamed from: q, reason: collision with root package name */
    public final yb.a f34901q;

    /* renamed from: r, reason: collision with root package name */
    public final b f34902r;

    /* renamed from: s, reason: collision with root package name */
    public final n f34903s;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f34904t;

    /* renamed from: u, reason: collision with root package name */
    public PorterDuffColorFilter f34905u;

    /* renamed from: v, reason: collision with root package name */
    public int f34906v;

    /* renamed from: w, reason: collision with root package name */
    public final RectF f34907w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f34908x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f34909y;

    /* renamed from: z, reason: collision with root package name */
    public m f34910z;

    public class a {
        public a() {
        }

        public final zb.d a(zb.d dVar) {
            return dVar instanceof j ? dVar : new zb.b(-h.this.f(), dVar);
        }
    }

    public class b {
        public b() {
        }
    }

    public static class c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public m f34913a;

        /* renamed from: b, reason: collision with root package name */
        public ub.a f34914b;

        /* renamed from: c, reason: collision with root package name */
        public ColorStateList f34915c;

        /* renamed from: d, reason: collision with root package name */
        public ColorStateList f34916d;

        /* renamed from: e, reason: collision with root package name */
        public PorterDuff.Mode f34917e;

        /* renamed from: f, reason: collision with root package name */
        public Rect f34918f;

        /* renamed from: g, reason: collision with root package name */
        public float f34919g;

        /* renamed from: h, reason: collision with root package name */
        public float f34920h;

        /* renamed from: i, reason: collision with root package name */
        public int f34921i;

        /* renamed from: j, reason: collision with root package name */
        public float f34922j;

        /* renamed from: k, reason: collision with root package name */
        public float f34923k;

        /* renamed from: l, reason: collision with root package name */
        public int f34924l;

        /* renamed from: m, reason: collision with root package name */
        public int f34925m;

        /* renamed from: n, reason: collision with root package name */
        public Paint.Style f34926n;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            h hVar = new h(this);
            hVar.f34890f = true;
            hVar.f34891g = true;
            return hVar;
        }
    }

    public static class d extends ci.a {
    }

    static {
        new k();
        new k();
        new k();
        new k();
        new g();
        new g();
        new g();
        new g();
        int i10 = 0;
        i.a(0);
        Paint paint = new Paint(1);
        B = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        C = new d[4];
        while (true) {
            d[] dVarArr = C;
            if (i10 >= dVarArr.length) {
                return;
            }
            dVarArr[i10] = new d();
            i10++;
        }
    }

    public h(m mVar) {
        c cVar = new c();
        cVar.f34915c = null;
        cVar.f34916d = null;
        cVar.f34917e = PorterDuff.Mode.SRC_IN;
        cVar.f34918f = null;
        cVar.f34919g = 1.0f;
        cVar.f34920h = 1.0f;
        cVar.f34921i = 255;
        cVar.f34922j = CropImageView.DEFAULT_ASPECT_RATIO;
        cVar.f34923k = CropImageView.DEFAULT_ASPECT_RATIO;
        cVar.f34924l = 0;
        cVar.f34925m = 0;
        cVar.f34926n = Paint.Style.FILL_AND_STROKE;
        cVar.f34913a = mVar;
        cVar.f34914b = null;
        this(cVar);
    }

    public final void a(RectF rectF, Path path) {
        m mVar = this.f34886b.f34913a;
        mVar.getClass();
        this.f34903s.a(mVar, null, this.f34886b.f34920h, rectF, this.f34902r, path);
        if (this.f34886b.f34919g != 1.0f) {
            Matrix matrix = this.f34892h;
            matrix.reset();
            float f10 = this.f34886b.f34919g;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f34907w, true);
    }

    public final float b(RectF rectF, m mVar, float[] fArr) {
        if (fArr == null) {
            if (mVar.e(rectF)) {
                return mVar.f34932e.a(rectF);
            }
            return -1.0f;
        }
        if (this.f34909y) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final int c(int i10) {
        int i11;
        c cVar = this.f34886b;
        float f10 = cVar.f34923k + CropImageView.DEFAULT_ASPECT_RATIO + cVar.f34922j;
        ub.a aVar = cVar.f34914b;
        if (aVar == null || !aVar.f29691a || r3.a.d(i10, 255) != aVar.f29694d) {
            return i10;
        }
        float fMin = (aVar.f29695e <= CropImageView.DEFAULT_ASPECT_RATIO || f10 <= CropImageView.DEFAULT_ASPECT_RATIO) ? 0.0f : Math.min(((((float) Math.log1p(f10 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i10);
        int iB = r3.a.b(r3.a.d(aVar.f29692b, Math.round(Color.alpha(r3) * fMin)), r3.a.d(i10, 255));
        if (fMin > CropImageView.DEFAULT_ASPECT_RATIO && (i11 = aVar.f29693c) != 0) {
            iB = r3.a.b(r3.a.d(i11, ub.a.f29690f), iB);
        }
        return r3.a.d(iB, iAlpha);
    }

    public final void d(Canvas canvas) {
        if (this.f34889e.cardinality() > 0) {
            Log.w("h", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i10 = this.f34886b.f34925m;
        Path path = this.f34893i;
        yb.a aVar = this.f34901q;
        if (i10 != 0) {
            canvas.drawPath(path, aVar.f34363a);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            p.f fVar = this.f34887c[i11];
            int i12 = this.f34886b.f34924l;
            Matrix matrix = p.f.f34988b;
            fVar.a(matrix, aVar, i12, canvas);
            this.f34888d[i11].a(matrix, aVar, this.f34886b.f34924l, canvas);
        }
        if (this.f34908x) {
            double d10 = 0;
            int iSin = (int) (Math.sin(Math.toRadians(d10)) * this.f34886b.f34925m);
            int iCos = (int) (Math.cos(Math.toRadians(d10)) * this.f34886b.f34925m);
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, B);
            canvas.translate(iSin, iCos);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0132  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float f10;
        float fB;
        RectF rectF;
        Path path;
        PorterDuffColorFilter porterDuffColorFilter = this.f34904t;
        Paint paint = this.f34899o;
        paint.setColorFilter(porterDuffColorFilter);
        int alpha = paint.getAlpha();
        int i10 = this.f34886b.f34921i;
        paint.setAlpha(((i10 + (i10 >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.f34905u;
        Paint paint2 = this.f34900p;
        paint2.setColorFilter(porterDuffColorFilter2);
        this.f34886b.getClass();
        paint2.setStrokeWidth(CropImageView.DEFAULT_ASPECT_RATIO);
        int alpha2 = paint2.getAlpha();
        int i11 = this.f34886b.f34921i;
        paint2.setAlpha(((i11 + (i11 >>> 7)) * alpha2) >>> 8);
        boolean z10 = g() || !i();
        Paint.Style style = this.f34886b.f34926n;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z11 = this.f34890f;
            Path path2 = this.f34893i;
            if (z11) {
                if (z10) {
                    a(e(), path2);
                }
                this.f34890f = false;
            }
            if (g()) {
                canvas.save();
                double d10 = 0;
                canvas.translate((int) (this.f34886b.f34925m * Math.sin(Math.toRadians(d10))), (int) (Math.cos(Math.toRadians(d10)) * this.f34886b.f34925m));
                if (this.f34908x) {
                    Rect bounds = getBounds();
                    RectF rectF2 = this.f34907w;
                    int iWidth = (int) (rectF2.width() - bounds.width());
                    int iHeight = (int) (rectF2.height() - bounds.height());
                    if (iWidth < 0 || iHeight < 0) {
                        StringBuilder sbA = g0.a(iWidth, iHeight, "Invalid shadow bounds. Check that the treatments result in a valid path. extra width: ", " extra height: ", " path bounds: ");
                        sbA.append(rectF2);
                        throw new IllegalStateException(sbA.toString());
                    }
                    f10 = 0.0f;
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(ad.k.b(this.f34886b.f34924l, 2, (int) rectF2.width(), iWidth), ad.k.b(this.f34886b.f34924l, 2, (int) rectF2.height(), iHeight), Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    int i12 = bounds.left;
                    int i13 = this.f34886b.f34924l;
                    float f11 = (i12 - i13) - iWidth;
                    float f12 = (bounds.top - i13) - iHeight;
                    canvas2.translate(-f11, -f12);
                    d(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f11, f12, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                    m mVar = this.f34886b.f34913a;
                    mVar.getClass();
                    RectF rectFE = e();
                    fB = b(rectFE, mVar, null);
                    if (fB >= f10) {
                    }
                } else {
                    d(canvas);
                    canvas.restore();
                    f10 = 0.0f;
                    m mVar2 = this.f34886b.f34913a;
                    mVar2.getClass();
                    RectF rectFE2 = e();
                    fB = b(rectFE2, mVar2, null);
                    if (fB >= f10) {
                    }
                }
            } else {
                f10 = 0.0f;
                m mVar22 = this.f34886b.f34913a;
                mVar22.getClass();
                RectF rectFE22 = e();
                fB = b(rectFE22, mVar22, null);
                if (fB >= f10) {
                    float f13 = fB * this.f34886b.f34920h;
                    canvas.drawRoundRect(rectFE22, f13, f13, paint);
                } else {
                    canvas.drawPath(path2, paint);
                }
            }
        } else {
            f10 = 0.0f;
        }
        if (h()) {
            boolean z12 = this.f34891g;
            RectF rectF3 = this.f34896l;
            Path path3 = this.f34894j;
            if (z12) {
                m mVar3 = this.f34886b.f34913a;
                mVar3.getClass();
                m.a aVarF = mVar3.f();
                zb.d dVar = mVar3.f34932e;
                a aVar = this.f34885a;
                aVarF.f34944e = aVar.a(dVar);
                aVarF.f34945f = aVar.a(mVar3.f34933f);
                aVarF.f34947h = aVar.a(mVar3.f34935h);
                aVarF.f34946g = aVar.a(mVar3.f34934g);
                this.f34910z = aVarF.a();
                this.A = null;
                if (z10) {
                    m mVar4 = this.f34910z;
                    float[] fArr = this.A;
                    float f14 = this.f34886b.f34920h;
                    rectF3.set(e());
                    float f15 = f();
                    rectF3.inset(f15, f15);
                    this.f34903s.a(mVar4, fArr, f14, rectF3, null, path3);
                    rectF = rectF3;
                    path = path3;
                } else {
                    rectF = rectF3;
                    path = path3;
                }
                this.f34891g = false;
            } else {
                rectF = rectF3;
                path = path3;
            }
            m mVar5 = this.f34910z;
            float[] fArr2 = this.A;
            rectF.set(e());
            float f16 = f();
            rectF.inset(f16, f16);
            float fB2 = b(rectF, mVar5, fArr2);
            if (fB2 >= f10) {
                float f17 = fB2 * this.f34886b.f34920h;
                canvas.drawRoundRect(rectF, f17, f17, paint2);
            } else {
                canvas.drawPath(path, paint2);
            }
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final RectF e() {
        Rect bounds = getBounds();
        RectF rectF = this.f34895k;
        rectF.set(bounds);
        return rectF;
    }

    public final float f() {
        return h() ? this.f34900p.getStrokeWidth() / 2.0f : CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public final boolean g() {
        c cVar = this.f34886b;
        cVar.getClass();
        return cVar.f34924l > 0 && !i() && !this.f34893i.isConvex() && Build.VERSION.SDK_INT < 29;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f34886b.f34921i;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f34886b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        this.f34886b.getClass();
        RectF rectFE = e();
        if (rectFE.isEmpty()) {
            return;
        }
        m mVar = this.f34886b.f34913a;
        mVar.getClass();
        float fB = b(rectFE, mVar, null);
        if (fB >= CropImageView.DEFAULT_ASPECT_RATIO) {
            outline.setRoundRect(getBounds(), fB * this.f34886b.f34920h);
            return;
        }
        boolean z10 = this.f34890f;
        Path path = this.f34893i;
        if (z10) {
            a(rectFE, path);
            this.f34890f = false;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            d.b.a(outline, path);
            return;
        }
        if (i10 >= 29) {
            try {
                d.a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            d.a.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f34886b.f34918f;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f34897m;
        region.set(bounds);
        RectF rectFE = e();
        Path path = this.f34893i;
        a(rectFE, path);
        Region region2 = this.f34898n;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final boolean h() {
        Paint.Style style = this.f34886b.f34926n;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f34900p.getStrokeWidth() > CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public final boolean i() {
        m mVar = this.f34886b.f34913a;
        getState();
        mVar.getClass();
        return mVar.e(e());
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f34890f = true;
        this.f34891g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f34886b.f34916d;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f34886b.getClass();
        this.f34886b.getClass();
        ColorStateList colorStateList2 = this.f34886b.f34915c;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        this.f34886b.f34913a.getClass();
        return false;
    }

    public final void j(float f10) {
        c cVar = this.f34886b;
        if (cVar.f34923k != f10) {
            cVar.f34923k = f10;
            n();
        }
    }

    public final void k(ColorStateList colorStateList) {
        c cVar = this.f34886b;
        if (cVar.f34915c != colorStateList) {
            cVar.f34915c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean l(int[] iArr) {
        boolean z10;
        Paint paint;
        int color;
        int colorForState;
        if (this.f34886b.f34915c == null || color == (colorForState = this.f34886b.f34915c.getColorForState(iArr, (color = (paint = this.f34899o).getColor())))) {
            z10 = false;
        } else {
            paint.setColor(colorForState);
            z10 = true;
        }
        this.f34886b.getClass();
        return z10;
    }

    public final boolean m() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f34904t;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f34905u;
        c cVar = this.f34886b;
        ColorStateList colorStateList = cVar.f34916d;
        PorterDuff.Mode mode = cVar.f34917e;
        if (colorStateList == null || mode == null) {
            int color = this.f34899o.getColor();
            int iC = c(color);
            this.f34906v = iC;
            porterDuffColorFilter = iC != color ? new PorterDuffColorFilter(iC, PorterDuff.Mode.SRC_IN) : null;
        } else {
            int iC2 = c(colorStateList.getColorForState(getState(), 0));
            this.f34906v = iC2;
            porterDuffColorFilter = new PorterDuffColorFilter(iC2, mode);
        }
        this.f34904t = porterDuffColorFilter;
        this.f34886b.getClass();
        this.f34905u = null;
        this.f34886b.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f34904t) && Objects.equals(porterDuffColorFilter3, this.f34905u)) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        c cVar = this.f34886b;
        c cVar2 = new c();
        cVar2.f34915c = null;
        cVar2.f34916d = null;
        cVar2.f34917e = PorterDuff.Mode.SRC_IN;
        cVar2.f34918f = null;
        cVar2.f34919g = 1.0f;
        cVar2.f34920h = 1.0f;
        cVar2.f34921i = 255;
        cVar2.f34922j = CropImageView.DEFAULT_ASPECT_RATIO;
        cVar2.f34923k = CropImageView.DEFAULT_ASPECT_RATIO;
        cVar2.f34924l = 0;
        cVar2.f34925m = 0;
        cVar2.f34926n = Paint.Style.FILL_AND_STROKE;
        cVar2.f34913a = cVar.f34913a;
        cVar2.f34914b = cVar.f34914b;
        cVar2.f34915c = cVar.f34915c;
        cVar2.f34917e = cVar.f34917e;
        cVar2.f34916d = cVar.f34916d;
        cVar2.f34921i = cVar.f34921i;
        cVar2.f34919g = cVar.f34919g;
        cVar2.f34925m = cVar.f34925m;
        cVar2.f34920h = cVar.f34920h;
        cVar2.f34922j = cVar.f34922j;
        cVar2.f34923k = cVar.f34923k;
        cVar2.f34924l = cVar.f34924l;
        cVar2.f34926n = cVar.f34926n;
        Rect rect = cVar.f34918f;
        if (rect != null) {
            cVar2.f34918f = new Rect(rect);
        }
        this.f34886b = cVar2;
        return this;
    }

    public final void n() {
        c cVar = this.f34886b;
        float f10 = cVar.f34923k + CropImageView.DEFAULT_ASPECT_RATIO;
        cVar.f34924l = (int) Math.ceil(0.75f * f10);
        this.f34886b.f34925m = (int) Math.ceil(f10 * 0.25f);
        m();
        if (g() || !i()) {
            invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f34890f = true;
        this.f34891g = true;
        super.onBoundsChange(rect);
        this.f34886b.f34913a.getClass();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        this.f34886b.f34913a.getClass();
        boolean z10 = l(iArr) || m();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        c cVar = this.f34886b;
        if (cVar.f34921i != i10) {
            cVar.f34921i = i10;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f34886b.getClass();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f34886b.f34916d = colorStateList;
        m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f34886b;
        if (cVar.f34917e != mode) {
            cVar.f34917e = mode;
            m();
            super.invalidateSelf();
        }
    }

    public h(c cVar) {
        this.f34885a = new a();
        this.f34887c = new p.f[4];
        this.f34888d = new p.f[4];
        this.f34889e = new BitSet(8);
        this.f34892h = new Matrix();
        this.f34893i = new Path();
        this.f34894j = new Path();
        this.f34895k = new RectF();
        this.f34896l = new RectF();
        this.f34897m = new Region();
        this.f34898n = new Region();
        Paint paint = new Paint(1);
        this.f34899o = paint;
        Paint paint2 = new Paint(1);
        this.f34900p = paint2;
        this.f34901q = new yb.a();
        this.f34903s = n.b();
        this.f34907w = new RectF();
        this.f34908x = true;
        this.f34909y = true;
        this.f34886b = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m();
        l(getState());
        this.f34902r = new b();
    }
}
