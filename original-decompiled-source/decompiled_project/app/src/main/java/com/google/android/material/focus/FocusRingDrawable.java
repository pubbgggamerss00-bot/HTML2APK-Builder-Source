package com.google.android.material.focus;

import android.R;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.util.FloatProperty;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.animation.OvershootInterpolator;
import com.yalantis.ucrop.view.CropImageView;
import java.io.IOException;
import java.util.Arrays;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import zb.g;
import zb.k;
import zb.l;
import zb.m;
import zb.n;
import zb.r;

/* loaded from: classes2.dex */
public class FocusRingDrawable extends DrawableWrapper {

    /* renamed from: q, reason: collision with root package name */
    public static final ColorDrawable f6415q = new ColorDrawable(0);

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f6416r = {R.attr.state_focused, R.attr.state_window_focused};

    /* renamed from: s, reason: collision with root package name */
    public static final OvershootInterpolator f6417s = new OvershootInterpolator(4.0f);

    /* renamed from: t, reason: collision with root package name */
    public static final a f6418t = new a("interpolation");

    /* renamed from: a, reason: collision with root package name */
    public final Paint f6419a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f6420b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f6421c;

    /* renamed from: d, reason: collision with root package name */
    public final Path f6422d;

    /* renamed from: e, reason: collision with root package name */
    public final Path f6423e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f6424f;

    /* renamed from: g, reason: collision with root package name */
    public final n f6425g;

    /* renamed from: h, reason: collision with root package name */
    public float f6426h;

    /* renamed from: j, reason: collision with root package name */
    public ObjectAnimator f6427j;

    /* renamed from: k, reason: collision with root package name */
    public float f6428k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6429l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6430m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f6431n;

    /* renamed from: p, reason: collision with root package name */
    public b f6432p;

    public class a extends FloatProperty<FocusRingDrawable> {
        @Override // android.util.Property
        public final Float get(Object obj) {
            return Float.valueOf(((FocusRingDrawable) obj).f6428k);
        }

        @Override // android.util.FloatProperty
        public final void setValue(FocusRingDrawable focusRingDrawable, float f10) {
            FocusRingDrawable focusRingDrawable2 = focusRingDrawable;
            focusRingDrawable2.f6428k = f10;
            focusRingDrawable2.invalidateSelf();
        }
    }

    public static final class b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public Drawable.ConstantState f6433a;

        /* renamed from: b, reason: collision with root package name */
        public int f6434b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f6435c;

        /* renamed from: d, reason: collision with root package name */
        public int f6436d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f6437e;

        /* renamed from: f, reason: collision with root package name */
        public int f6438f;

        /* renamed from: g, reason: collision with root package name */
        public int f6439g;

        /* renamed from: h, reason: collision with root package name */
        public int f6440h;

        /* renamed from: i, reason: collision with root package name */
        public int f6441i;

        /* renamed from: j, reason: collision with root package name */
        public float f6442j;

        /* renamed from: k, reason: collision with root package name */
        public int f6443k;

        /* renamed from: l, reason: collision with root package name */
        public float f6444l;

        /* renamed from: m, reason: collision with root package name */
        public int f6445m;

        /* renamed from: n, reason: collision with root package name */
        public float f6446n;

        /* renamed from: o, reason: collision with root package name */
        public int f6447o;

        /* renamed from: p, reason: collision with root package name */
        public float f6448p;

        /* renamed from: q, reason: collision with root package name */
        public int f6449q;

        /* renamed from: r, reason: collision with root package name */
        public float f6450r;

        /* renamed from: s, reason: collision with root package name */
        public int f6451s;

        /* renamed from: t, reason: collision with root package name */
        public l f6452t;

        /* renamed from: u, reason: collision with root package name */
        public int f6453u;

        /* renamed from: v, reason: collision with root package name */
        public int f6454v;

        /* renamed from: w, reason: collision with root package name */
        public final Rect f6455w;

        /* renamed from: x, reason: collision with root package name */
        public final int[] f6456x;

        public b(b bVar) {
            this.f6434b = 0;
            this.f6435c = false;
            this.f6436d = PKIFailureInfo.systemUnavail;
            this.f6437e = false;
            this.f6438f = PKIFailureInfo.systemUnavail;
            this.f6439g = PKIFailureInfo.systemUnavail;
            this.f6440h = PKIFailureInfo.systemUnavail;
            this.f6441i = PKIFailureInfo.systemUnavail;
            this.f6442j = Float.NaN;
            this.f6443k = PKIFailureInfo.systemUnavail;
            this.f6444l = Float.NaN;
            this.f6445m = PKIFailureInfo.systemUnavail;
            this.f6446n = Float.NaN;
            this.f6447o = PKIFailureInfo.systemUnavail;
            this.f6448p = Float.NaN;
            this.f6449q = PKIFailureInfo.systemUnavail;
            this.f6450r = Float.NaN;
            this.f6451s = PKIFailureInfo.systemUnavail;
            this.f6452t = null;
            this.f6453u = PKIFailureInfo.systemUnavail;
            this.f6454v = PKIFailureInfo.systemUnavail;
            this.f6455w = null;
            this.f6456x = FocusRingDrawable.f6416r;
            if (bVar != null) {
                this.f6433a = bVar.f6433a;
                this.f6434b = bVar.f6434b;
                this.f6435c = bVar.f6435c;
                this.f6436d = bVar.f6436d;
                this.f6437e = bVar.f6437e;
                this.f6438f = bVar.f6438f;
                this.f6439g = bVar.f6439g;
                this.f6440h = bVar.f6440h;
                this.f6441i = bVar.f6441i;
                this.f6442j = bVar.f6442j;
                this.f6443k = bVar.f6443k;
                this.f6444l = bVar.f6444l;
                this.f6445m = bVar.f6445m;
                this.f6446n = bVar.f6446n;
                this.f6447o = bVar.f6447o;
                this.f6448p = bVar.f6448p;
                this.f6449q = bVar.f6449q;
                this.f6450r = bVar.f6450r;
                this.f6451s = bVar.f6451s;
                this.f6453u = bVar.f6453u;
                this.f6454v = bVar.f6454v;
                l lVar = bVar.f6452t;
                if (lVar instanceof m) {
                    this.f6452t = ((m) lVar).f().a();
                } else if (lVar instanceof r) {
                    r rVar = (r) lVar;
                    r.a aVar = new r.a();
                    int i10 = rVar.f34990a;
                    aVar.f34994a = i10;
                    aVar.f34995b = rVar.f34991b;
                    int[][] iArr = rVar.f34992c;
                    int[][] iArr2 = new int[iArr.length][];
                    aVar.f34996c = iArr2;
                    m[] mVarArr = rVar.f34993d;
                    aVar.f34997d = new m[mVarArr.length];
                    System.arraycopy(iArr, 0, iArr2, 0, i10);
                    System.arraycopy(mVarArr, 0, aVar.f34997d, 0, aVar.f34994a);
                    this.f6452t = aVar.f34994a != 0 ? new r(aVar) : null;
                } else {
                    this.f6452t = lVar;
                }
                if (bVar.f6455w != null) {
                    this.f6455w = new Rect(bVar.f6455w);
                }
                int[] iArr3 = bVar.f6456x;
                this.f6456x = Arrays.copyOf(iArr3, iArr3.length);
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            Drawable.ConstantState constantState = this.f6433a;
            return (constantState != null ? constantState.getChangingConfigurations() : 0) | this.f6434b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new FocusRingDrawable(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new FocusRingDrawable(this, resources);
        }
    }

    public FocusRingDrawable() {
        super(null);
        this.f6419a = new Paint(1);
        this.f6420b = new RectF();
        this.f6421c = new Rect();
        this.f6422d = new Path();
        this.f6423e = new Path();
        this.f6424f = new Matrix();
        this.f6425g = n.b();
        this.f6426h = -1.0f;
        this.f6428k = 1.0f;
        this.f6430m = false;
        this.f6431n = false;
        this.f6432p = new b(null);
    }

    public static int c(TypedArray typedArray, int i10) {
        if (typedArray.getType(i10) != 2) {
            return PKIFailureInfo.systemUnavail;
        }
        TypedValue typedValue = new TypedValue();
        return typedArray.getValue(i10, typedValue) ? typedValue.data : PKIFailureInfo.systemUnavail;
    }

    public static float d(float f10, Resources.Theme theme, int i10, TypedArray typedArray, int i11, int i12) {
        if (!Float.isNaN(f10)) {
            return f10;
        }
        Resources resources = theme.getResources();
        if (i10 != Float.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i10, typedValue, true)) {
                return typedValue.getDimension(resources.getDisplayMetrics());
            }
        }
        float dimension = typedArray.getDimension(i11, Float.NaN);
        if (!Float.isNaN(dimension)) {
            return dimension;
        }
        if (i12 == 0) {
            return Float.NaN;
        }
        return resources.getDimension(i12);
    }

    public final void a(RectF rectF) {
        Rect rect = this.f6432p.f6455w;
        if (rect != null) {
            rectF.set(rect);
            return;
        }
        if (!(getDrawable() instanceof RippleDrawable)) {
            rectF.set(getBounds());
            return;
        }
        RippleDrawable rippleDrawable = (RippleDrawable) getDrawable();
        Rect rect2 = this.f6421c;
        rippleDrawable.getHotspotBounds(rect2);
        int radius = rippleDrawable.getRadius();
        if (radius > 0) {
            rect2.inset(Math.max(0, (rect2.width() / 2) - radius), Math.max(0, (rect2.height() / 2) - radius));
        }
        rectF.set(rect2);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0087  */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void applyTheme(Resources.Theme theme) {
        TypedValue typedValueA;
        super.applyTheme(theme);
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(mb.a.f18032f);
        int i10 = this.f6432p.f6436d;
        boolean z10 = false;
        if (i10 != Integer.MIN_VALUE && (typedValueA = xb.a.a(theme, i10)) != null) {
            b bVar = this.f6432p;
            bVar.f6435c = typedValueA.data != 0;
            bVar.f6437e = true;
        }
        b bVar2 = this.f6432p;
        if (!bVar2.f6437e) {
            boolean z11 = bVar2.f6435c;
            TypedValue typedValueA2 = xb.a.a(theme, com.basitce.htmltoapk.R.attr.focusRingsEnabled);
            if (typedValueA2 == null || typedValueA2.type != 18) {
                z10 = z11;
            } else if (typedValueA2.data != 0) {
                z10 = true;
            }
            bVar2.f6435c = z10;
        }
        b bVar3 = this.f6432p;
        if (bVar3.f6435c) {
            int color = bVar3.f6438f;
            int i11 = bVar3.f6439g;
            if (color == Integer.MIN_VALUE) {
                if (i11 != Integer.MIN_VALUE) {
                    TypedValue typedValue = new TypedValue();
                    color = theme.resolveAttribute(i11, typedValue, true) ? typedValue.data : typedArrayObtainStyledAttributes.getColor(5, -16777216);
                }
            }
            bVar3.f6438f = color;
            b bVar4 = this.f6432p;
            int color2 = bVar4.f6440h;
            int i12 = bVar4.f6441i;
            if (color2 == Integer.MIN_VALUE) {
                if (i12 != Integer.MIN_VALUE) {
                    TypedValue typedValue2 = new TypedValue();
                    color2 = theme.resolveAttribute(i12, typedValue2, true) ? typedValue2.data : typedArrayObtainStyledAttributes.getColor(1, -1);
                }
            }
            bVar4.f6440h = color2;
            b bVar5 = this.f6432p;
            bVar5.f6442j = d(bVar5.f6442j, theme, bVar5.f6443k, typedArrayObtainStyledAttributes, 6, com.basitce.htmltoapk.R.dimen.mtrl_focus_ring_outer_stroke_width);
            b bVar6 = this.f6432p;
            bVar6.f6444l = d(bVar6.f6444l, theme, bVar6.f6445m, typedArrayObtainStyledAttributes, 3, com.basitce.htmltoapk.R.dimen.mtrl_focus_ring_inner_stroke_width);
            b bVar7 = this.f6432p;
            bVar7.f6446n = d(bVar7.f6446n, theme, bVar7.f6447o, typedArrayObtainStyledAttributes, 7, 0);
            b bVar8 = this.f6432p;
            bVar8.f6448p = d(bVar8.f6448p, theme, bVar8.f6449q, typedArrayObtainStyledAttributes, 4, 0);
            if (Float.isNaN(this.f6432p.f6448p)) {
                this.f6432p.f6448p = CropImageView.DEFAULT_ASPECT_RATIO;
            }
            b bVar9 = this.f6432p;
            bVar9.f6450r = d(bVar9.f6450r, theme, bVar9.f6451s, typedArrayObtainStyledAttributes, 2, com.basitce.htmltoapk.R.dimen.mtrl_focus_ring_inner_stroke_inset);
            b bVar10 = this.f6432p;
            int i13 = bVar10.f6453u;
            int[] iArr = mb.a.f18035i;
            if (i13 != Integer.MIN_VALUE) {
                bVar10.f6452t = m.c(theme.obtainStyledAttributes(i13, iArr), new zb.a(CropImageView.DEFAULT_ASPECT_RATIO)).a();
            } else {
                int i14 = bVar10.f6454v;
                if (i14 == Integer.MIN_VALUE) {
                    i14 = com.basitce.htmltoapk.R.attr.focusRingsShapeAppearance;
                }
                TypedValue typedValueA3 = xb.a.a(theme, i14);
                if (typedValueA3 != null) {
                    this.f6432p.f6452t = m.c(theme.obtainStyledAttributes(typedValueA3.resourceId, iArr), new zb.a(CropImageView.DEFAULT_ASPECT_RATIO)).a();
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f6419a;
        paint.setStyle(style);
        if (Float.isNaN(this.f6432p.f6442j)) {
            return;
        }
        paint.setStrokeWidth(this.f6432p.f6442j);
    }

    public final void b(Canvas canvas, Path path, float f10, float f11, int i10) {
        RectF rectF = this.f6420b;
        a(rectF);
        float f12 = f10 * 2.0f;
        float fWidth = 1.0f - (f12 / rectF.width());
        float fHeight = 1.0f - (f12 / rectF.height());
        Matrix matrix = this.f6424f;
        matrix.reset();
        matrix.postScale(fWidth, fHeight, rectF.centerX(), rectF.centerY());
        Path path2 = this.f6422d;
        path.transform(matrix, path2);
        float f13 = f11 * this.f6428k;
        Paint paint = this.f6419a;
        paint.setStrokeWidth(f13);
        paint.setColor(i10);
        canvas.drawPath(path2, paint);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return true;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f10;
        int radius;
        super.draw(canvas);
        b bVar = this.f6432p;
        if (bVar.f6435c && this.f6430m) {
            float f11 = bVar.f6448p;
            float f12 = bVar.f6442j / 2.0f;
            float f13 = this.f6428k;
            float f14 = (f12 * f13) + f11;
            float f15 = ((bVar.f6444l / 2.0f) * f13) + f11 + bVar.f6450r;
            Path path = this.f6423e;
            if (path.isEmpty()) {
                path = null;
            }
            Path path2 = path;
            if (path2 != null) {
                b bVar2 = this.f6432p;
                b(canvas, path2, f15, bVar2.f6444l, bVar2.f6440h);
                b bVar3 = this.f6432p;
                b(canvas, path2, f14, bVar3.f6442j, bVar3.f6438f);
                return;
            }
            if (Float.isNaN(this.f6432p.f6446n)) {
                f10 = this.f6426h;
                if (f10 < CropImageView.DEFAULT_ASPECT_RATIO) {
                    Drawable drawable = getDrawable();
                    f10 = (!(drawable instanceof RippleDrawable) || (radius = ((RippleDrawable) drawable).getRadius()) < 0) ? 0.0f : radius;
                }
            } else {
                f10 = this.f6432p.f6446n;
            }
            float fMax = Math.max(CropImageView.DEFAULT_ASPECT_RATIO, f10 - (this.f6432p.f6442j / 2.0f));
            b bVar4 = this.f6432p;
            float f16 = bVar4.f6444l;
            int i10 = bVar4.f6440h;
            RectF rectF = this.f6420b;
            a(rectF);
            rectF.inset(f15, f15);
            float f17 = f16 * this.f6428k;
            Paint paint = this.f6419a;
            paint.setStrokeWidth(f17);
            paint.setColor(i10);
            canvas.drawRoundRect(rectF, fMax, fMax, paint);
            b bVar5 = this.f6432p;
            float f18 = bVar5.f6442j;
            int i11 = bVar5.f6438f;
            a(rectF);
            rectF.inset(f14, f14);
            paint.setStrokeWidth(f18 * this.f6428k);
            paint.setColor(i11);
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    public final void e(l lVar) {
        RectF rectF = this.f6420b;
        a(rectF);
        m mVarA = lVar.a(f6416r);
        boolean zE = mVarA.e(rectF);
        Path path = this.f6423e;
        if (!zE) {
            this.f6425g.a(mVarA, null, 1.0f, rectF, null, path);
            this.f6426h = -1.0f;
            return;
        }
        b bVar = this.f6432p;
        float f10 = ((bVar.f6442j / 2.0f) * this.f6428k) + bVar.f6448p;
        rectF.inset(f10, f10);
        this.f6426h = mVarA.f34932e.a(rectF);
        path.reset();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        b bVar = this.f6432p;
        if (bVar.f6433a == null) {
            return null;
        }
        bVar.f6434b = getChangingConfigurations();
        return this.f6432p;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean hasFocusStateSpecified() {
        try {
            if (super.hasFocusStateSpecified()) {
                return true;
            }
            return this.f6432p.f6435c;
        } catch (NoSuchMethodError unused) {
            return this.f6432p.f6435c;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Drawable drawable = getDrawable();
        return drawable != null && drawable.isProjected();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return super.isStateful() || this.f6432p.f6435c;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        ObjectAnimator objectAnimator = this.f6427j;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.f6427j = null;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f6431n && super.mutate() == this) {
            this.f6432p = new b(this.f6432p);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                this.f6432p.f6433a = drawable.getConstantState();
            }
            this.f6431n = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float[] cornerRadii;
        float cornerRadius;
        m mVar;
        super.onBoundsChange(rect);
        b bVar = this.f6432p;
        if (bVar.f6435c) {
            l lVar = bVar.f6452t;
            if (lVar != null) {
                e(lVar);
                return;
            }
            Drawable drawable = getDrawable();
            m mVar2 = null;
            if (drawable instanceof ShapeDrawable) {
                Outline outline = new Outline();
                ((ShapeDrawable) drawable).getOutline(outline);
                if (outline.getRadius() > CropImageView.DEFAULT_ASPECT_RATIO) {
                    k kVar = new k();
                    k kVar2 = new k();
                    k kVar3 = new k();
                    k kVar4 = new k();
                    g gVar = new g();
                    g gVar2 = new g();
                    g gVar3 = new g();
                    g gVar4 = new g();
                    float radius = outline.getRadius();
                    zb.a aVar = new zb.a(radius);
                    zb.a aVar2 = new zb.a(radius);
                    zb.a aVar3 = new zb.a(radius);
                    zb.a aVar4 = new zb.a(radius);
                    mVar = new m();
                    mVar.f34928a = kVar;
                    mVar.f34929b = kVar2;
                    mVar.f34930c = kVar3;
                    mVar.f34931d = kVar4;
                    mVar.f34932e = aVar;
                    mVar.f34933f = aVar2;
                    mVar.f34934g = aVar3;
                    mVar.f34935h = aVar4;
                    mVar.f34936i = gVar;
                    mVar.f34937j = gVar2;
                    mVar.f34938k = gVar3;
                    mVar.f34939l = gVar4;
                    mVar2 = mVar;
                }
            } else if (drawable instanceof GradientDrawable) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                try {
                    cornerRadii = gradientDrawable.getCornerRadii();
                } catch (NullPointerException unused) {
                    cornerRadii = null;
                }
                if (cornerRadii != null) {
                    k kVar5 = new k();
                    k kVar6 = new k();
                    k kVar7 = new k();
                    k kVar8 = new k();
                    g gVar5 = new g();
                    g gVar6 = new g();
                    g gVar7 = new g();
                    g gVar8 = new g();
                    zb.a aVar5 = new zb.a(Math.min(cornerRadii[0], cornerRadii[1]));
                    zb.a aVar6 = new zb.a(Math.min(cornerRadii[2], cornerRadii[3]));
                    zb.a aVar7 = new zb.a(Math.min(cornerRadii[4], cornerRadii[5]));
                    zb.a aVar8 = new zb.a(Math.min(cornerRadii[6], cornerRadii[7]));
                    mVar = new m();
                    mVar.f34928a = kVar5;
                    mVar.f34929b = kVar6;
                    mVar.f34930c = kVar7;
                    mVar.f34931d = kVar8;
                    mVar.f34932e = aVar5;
                    mVar.f34933f = aVar6;
                    mVar.f34934g = aVar7;
                    mVar.f34935h = aVar8;
                    mVar.f34936i = gVar5;
                    mVar.f34937j = gVar6;
                    mVar.f34938k = gVar7;
                    mVar.f34939l = gVar8;
                    mVar2 = mVar;
                } else {
                    try {
                        cornerRadius = gradientDrawable.getCornerRadius();
                    } catch (NullPointerException unused2) {
                        cornerRadius = -1.0f;
                    }
                    if (cornerRadius > CropImageView.DEFAULT_ASPECT_RATIO) {
                        k kVar9 = new k();
                        k kVar10 = new k();
                        k kVar11 = new k();
                        k kVar12 = new k();
                        g gVar9 = new g();
                        g gVar10 = new g();
                        g gVar11 = new g();
                        g gVar12 = new g();
                        zb.a aVar9 = new zb.a(cornerRadius);
                        zb.a aVar10 = new zb.a(cornerRadius);
                        zb.a aVar11 = new zb.a(cornerRadius);
                        zb.a aVar12 = new zb.a(cornerRadius);
                        m mVar3 = new m();
                        mVar3.f34928a = kVar9;
                        mVar3.f34929b = kVar10;
                        mVar3.f34930c = kVar11;
                        mVar3.f34931d = kVar12;
                        mVar3.f34932e = aVar9;
                        mVar3.f34933f = aVar10;
                        mVar3.f34934g = aVar11;
                        mVar3.f34935h = aVar12;
                        mVar3.f34936i = gVar9;
                        mVar3.f34937j = gVar10;
                        mVar3.f34938k = gVar11;
                        mVar3.f34939l = gVar12;
                        mVar2 = mVar3;
                    }
                }
            }
            if (mVar2 != null) {
                e(mVar2);
            } else {
                this.f6426h = -1.0f;
                this.f6423e.reset();
            }
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        b bVar = this.f6432p;
        if (!bVar.f6435c) {
            this.f6430m = false;
            return super.onStateChange(iArr);
        }
        boolean zStateSetMatches = StateSet.stateSetMatches(bVar.f6456x, iArr);
        boolean z10 = this.f6430m != zStateSetMatches;
        this.f6430m = zStateSetMatches;
        if (z10 && iArr.length > 0 && !this.f6429l) {
            ObjectAnimator objectAnimator = this.f6427j;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.f6427j = null;
            }
            if (zStateSetMatches) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f6418t, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
                objectAnimatorOfFloat.setDuration(300L);
                objectAnimatorOfFloat.setInterpolator(f6417s);
                objectAnimatorOfFloat.addListener(new vb.b(this));
                this.f6427j = objectAnimatorOfFloat;
                objectAnimatorOfFloat.start();
            } else {
                this.f6428k = 1.0f;
            }
        }
        this.f6429l = iArr.length == 0;
        return super.onStateChange(iArr) || z10;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        int[] iArr = mb.a.f18032f;
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, iArr, 0, 0) : resources.obtainAttributes(attributeSet, iArr);
        this.f6432p.f6436d = c(typedArrayObtainStyledAttributes, 0);
        int i10 = this.f6432p.f6436d;
        int resourceId = PKIFailureInfo.systemUnavail;
        if (i10 == Integer.MIN_VALUE && typedArrayObtainStyledAttributes.hasValue(0)) {
            b bVar = this.f6432p;
            bVar.f6435c = typedArrayObtainStyledAttributes.getBoolean(0, bVar.f6435c);
            this.f6432p.f6437e = true;
        }
        this.f6432p.f6439g = c(typedArrayObtainStyledAttributes, 5);
        b bVar2 = this.f6432p;
        if (bVar2.f6439g == Integer.MIN_VALUE) {
            bVar2.f6438f = typedArrayObtainStyledAttributes.getColor(5, PKIFailureInfo.systemUnavail);
        }
        this.f6432p.f6441i = c(typedArrayObtainStyledAttributes, 1);
        b bVar3 = this.f6432p;
        if (bVar3.f6441i == Integer.MIN_VALUE) {
            bVar3.f6440h = typedArrayObtainStyledAttributes.getColor(1, PKIFailureInfo.systemUnavail);
        }
        this.f6432p.f6443k = c(typedArrayObtainStyledAttributes, 6);
        b bVar4 = this.f6432p;
        if (bVar4.f6443k == Integer.MIN_VALUE) {
            bVar4.f6442j = typedArrayObtainStyledAttributes.getDimension(6, Float.NaN);
        }
        this.f6432p.f6445m = c(typedArrayObtainStyledAttributes, 3);
        b bVar5 = this.f6432p;
        if (bVar5.f6445m == Integer.MIN_VALUE) {
            bVar5.f6444l = typedArrayObtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.f6432p.f6445m = c(typedArrayObtainStyledAttributes, 3);
        b bVar6 = this.f6432p;
        if (bVar6.f6445m == Integer.MIN_VALUE) {
            bVar6.f6444l = typedArrayObtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.f6432p.f6447o = c(typedArrayObtainStyledAttributes, 7);
        b bVar7 = this.f6432p;
        if (bVar7.f6447o == Integer.MIN_VALUE) {
            bVar7.f6446n = typedArrayObtainStyledAttributes.getDimension(7, Float.NaN);
        }
        this.f6432p.f6449q = c(typedArrayObtainStyledAttributes, 4);
        b bVar8 = this.f6432p;
        if (bVar8.f6449q == Integer.MIN_VALUE) {
            bVar8.f6448p = typedArrayObtainStyledAttributes.getDimension(4, Float.NaN);
        }
        this.f6432p.f6451s = c(typedArrayObtainStyledAttributes, 2);
        b bVar9 = this.f6432p;
        if (bVar9.f6451s == Integer.MIN_VALUE) {
            bVar9.f6450r = typedArrayObtainStyledAttributes.getDimension(2, Float.NaN);
        }
        this.f6432p.f6454v = c(typedArrayObtainStyledAttributes, 8);
        b bVar10 = this.f6432p;
        if (typedArrayObtainStyledAttributes.getType(8) == 1) {
            resourceId = typedArrayObtainStyledAttributes.getResourceId(8, PKIFailureInfo.systemUnavail);
        }
        bVar10.f6453u = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        int depth = xmlPullParser.getDepth();
        Drawable drawableCreateFromXmlInner = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= depth)) {
                break;
            } else if (next == 2) {
                drawableCreateFromXmlInner = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawableCreateFromXmlInner != null) {
            setDrawable(drawableCreateFromXmlInner);
            this.f6432p.f6433a = drawableCreateFromXmlInner.getConstantState();
        } else {
            ColorDrawable colorDrawable = f6415q;
            setDrawable(colorDrawable);
            this.f6432p.f6433a = colorDrawable.getConstantState();
        }
    }

    public FocusRingDrawable(b bVar, Resources resources) {
        Drawable drawableNewDrawable;
        super(null);
        Paint paint = new Paint(1);
        this.f6419a = paint;
        this.f6420b = new RectF();
        this.f6421c = new Rect();
        this.f6422d = new Path();
        this.f6423e = new Path();
        this.f6424f = new Matrix();
        this.f6425g = n.b();
        this.f6426h = -1.0f;
        this.f6428k = 1.0f;
        this.f6430m = false;
        this.f6431n = false;
        b bVar2 = new b(bVar);
        this.f6432p = bVar2;
        Drawable.ConstantState constantState = bVar2.f6433a;
        if (constantState != null) {
            if (resources != null) {
                drawableNewDrawable = constantState.newDrawable(resources);
            } else {
                drawableNewDrawable = constantState.newDrawable();
            }
            setDrawable(drawableNewDrawable);
        }
        paint.setStyle(Paint.Style.STROKE);
        if (Float.isNaN(this.f6432p.f6442j)) {
            return;
        }
        paint.setStrokeWidth(this.f6432p.f6442j);
    }
}
