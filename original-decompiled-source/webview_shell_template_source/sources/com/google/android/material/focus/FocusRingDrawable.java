package com.google.android.material.focus;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
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
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import u4.f;
import u4.g;
import u4.i;
import u4.j;
import u4.k;
import u4.l;
import u4.q;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class FocusRingDrawable extends DrawableWrapper {
    public static final ColorDrawable H = new ColorDrawable(0);
    public static final int[] I = {R.attr.state_focused, R.attr.state_window_focused};
    public static final OvershootInterpolator J = new OvershootInterpolator(4.0f);
    public static final a K = new a("interpolation");
    public float A;
    public ObjectAnimator B;
    public float C;
    public boolean D;
    public boolean E;
    public boolean F;
    public b G;
    public final Paint s;

    /* renamed from: t, reason: collision with root package name */
    public final RectF f12358t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f12359u;

    /* renamed from: v, reason: collision with root package name */
    public final Path f12360v;

    /* renamed from: w, reason: collision with root package name */
    public final Path f12361w;

    /* renamed from: x, reason: collision with root package name */
    public final Matrix f12362x;

    /* renamed from: y, reason: collision with root package name */
    public final l f12363y;

    /* renamed from: z, reason: collision with root package name */
    public WeakReference<g> f12364z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends FloatProperty<FocusRingDrawable> {
        @Override // android.util.Property
        public final Float get(Object obj) {
            return Float.valueOf(((FocusRingDrawable) obj).C);
        }

        @Override // android.util.FloatProperty
        public final void setValue(FocusRingDrawable focusRingDrawable, float f6) {
            FocusRingDrawable focusRingDrawable2 = focusRingDrawable;
            focusRingDrawable2.C = f6;
            focusRingDrawable2.invalidateSelf();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public Drawable.ConstantState f12365a;

        /* renamed from: b, reason: collision with root package name */
        public int f12366b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f12367c;

        /* renamed from: d, reason: collision with root package name */
        public int f12368d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f12369e;

        /* renamed from: f, reason: collision with root package name */
        public int f12370f;

        /* renamed from: g, reason: collision with root package name */
        public int f12371g;
        public int h;

        /* renamed from: i, reason: collision with root package name */
        public int f12372i;

        /* renamed from: j, reason: collision with root package name */
        public float f12373j;

        /* renamed from: k, reason: collision with root package name */
        public int f12374k;

        /* renamed from: l, reason: collision with root package name */
        public float f12375l;

        /* renamed from: m, reason: collision with root package name */
        public int f12376m;

        /* renamed from: n, reason: collision with root package name */
        public float f12377n;

        /* renamed from: o, reason: collision with root package name */
        public int f12378o;

        /* renamed from: p, reason: collision with root package name */
        public float f12379p;

        /* renamed from: q, reason: collision with root package name */
        public int f12380q;

        /* renamed from: r, reason: collision with root package name */
        public float f12381r;
        public int s;

        /* renamed from: t, reason: collision with root package name */
        public j f12382t;

        /* renamed from: u, reason: collision with root package name */
        public int f12383u;

        /* renamed from: v, reason: collision with root package name */
        public int f12384v;

        /* renamed from: w, reason: collision with root package name */
        public final Rect f12385w;

        /* renamed from: x, reason: collision with root package name */
        public int[] f12386x;

        public b(b bVar) {
            this.f12366b = 0;
            this.f12367c = false;
            this.f12368d = Integer.MIN_VALUE;
            this.f12369e = false;
            this.f12370f = Integer.MIN_VALUE;
            this.f12371g = Integer.MIN_VALUE;
            this.h = Integer.MIN_VALUE;
            this.f12372i = Integer.MIN_VALUE;
            this.f12373j = Float.NaN;
            this.f12374k = Integer.MIN_VALUE;
            this.f12375l = Float.NaN;
            this.f12376m = Integer.MIN_VALUE;
            this.f12377n = Float.NaN;
            this.f12378o = Integer.MIN_VALUE;
            this.f12379p = Float.NaN;
            this.f12380q = Integer.MIN_VALUE;
            this.f12381r = Float.NaN;
            this.s = Integer.MIN_VALUE;
            this.f12382t = null;
            this.f12383u = Integer.MIN_VALUE;
            this.f12384v = Integer.MIN_VALUE;
            this.f12385w = null;
            this.f12386x = FocusRingDrawable.I;
            if (bVar != null) {
                this.f12365a = bVar.f12365a;
                this.f12366b = bVar.f12366b;
                this.f12367c = bVar.f12367c;
                this.f12368d = bVar.f12368d;
                this.f12369e = bVar.f12369e;
                this.f12370f = bVar.f12370f;
                this.f12371g = bVar.f12371g;
                this.h = bVar.h;
                this.f12372i = bVar.f12372i;
                this.f12373j = bVar.f12373j;
                this.f12374k = bVar.f12374k;
                this.f12375l = bVar.f12375l;
                this.f12376m = bVar.f12376m;
                this.f12377n = bVar.f12377n;
                this.f12378o = bVar.f12378o;
                this.f12379p = bVar.f12379p;
                this.f12380q = bVar.f12380q;
                this.f12381r = bVar.f12381r;
                this.s = bVar.s;
                this.f12383u = bVar.f12383u;
                this.f12384v = bVar.f12384v;
                j jVar = bVar.f12382t;
                if (jVar instanceof k) {
                    this.f12382t = ((k) jVar).j().a();
                } else if (jVar instanceof q) {
                    this.f12382t = ((q) jVar).i().b();
                } else {
                    this.f12382t = jVar;
                }
                if (bVar.f12385w != null) {
                    this.f12385w = new Rect(bVar.f12385w);
                }
                int[] iArr = bVar.f12386x;
                this.f12386x = Arrays.copyOf(iArr, iArr.length);
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            Drawable.ConstantState constantState = this.f12365a;
            return (constantState != null ? constantState.getChangingConfigurations() : 0) | this.f12366b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new FocusRingDrawable(this, null, 0 == true ? 1 : 0);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new FocusRingDrawable(this, resources, null);
        }
    }

    public /* synthetic */ FocusRingDrawable(b bVar, Resources resources, a aVar) {
        this(bVar, resources);
    }

    public static int c(TypedArray typedArray, int i6) {
        if (typedArray.getType(i6) != 2) {
            return Integer.MIN_VALUE;
        }
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i6, typedValue)) {
            return typedValue.data;
        }
        return Integer.MIN_VALUE;
    }

    public static FocusRingDrawable e(Context context, RippleDrawable rippleDrawable, g gVar) {
        if (!q4.b.b(context.getTheme(), com.htmltoapk.template.R.attr.focusRingsEnabled, false)) {
            return null;
        }
        FocusRingDrawable focusRingDrawable = new FocusRingDrawable(context, H);
        if (gVar != null) {
            focusRingDrawable.f12364z = new WeakReference<>(gVar);
        }
        rippleDrawable.addLayer(focusRingDrawable);
        focusRingDrawable.setCallback(rippleDrawable);
        return focusRingDrawable;
    }

    public static float f(float f6, Resources.Theme theme, int i6, TypedArray typedArray, int i7, int i8) {
        if (!Float.isNaN(f6)) {
            return f6;
        }
        Resources resources = theme.getResources();
        if (i6 != Float.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i6, typedValue, true)) {
                return typedValue.getDimension(resources.getDisplayMetrics());
            }
        }
        float dimension = typedArray.getDimension(i7, Float.NaN);
        if (!Float.isNaN(dimension)) {
            return dimension;
        }
        if (i8 == 0) {
            return Float.NaN;
        }
        return resources.getDimension(i8);
    }

    public final void a(RectF rectF) {
        Rect rect = this.G.f12385w;
        if (rect != null) {
            rectF.set(rect);
            return;
        }
        WeakReference<g> weakReference = this.f12364z;
        if (weakReference != null && weakReference.get() != null) {
            rectF.set(this.f12364z.get().getBounds());
            return;
        }
        if (!(getDrawable() instanceof RippleDrawable)) {
            rectF.set(getBounds());
            return;
        }
        RippleDrawable rippleDrawable = (RippleDrawable) getDrawable();
        Rect rect2 = this.f12359u;
        rippleDrawable.getHotspotBounds(rect2);
        int radius = rippleDrawable.getRadius();
        if (radius > 0) {
            rect2.inset(Math.max(0, (rect2.width() / 2) - radius), Math.max(0, (rect2.height() / 2) - radius));
        }
        rectF.set(rect2);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        d(theme);
    }

    public final void b(Canvas canvas, Path path, float f6, float f7, int i6) {
        RectF rectF = this.f12358t;
        a(rectF);
        float f8 = f6 * 2.0f;
        float fWidth = 1.0f - (f8 / rectF.width());
        float fHeight = 1.0f - (f8 / rectF.height());
        Matrix matrix = this.f12362x;
        matrix.reset();
        matrix.postScale(fWidth, fHeight, rectF.centerX(), rectF.centerY());
        Path path2 = this.f12360v;
        path.transform(matrix, path2);
        float f9 = f7 * this.C;
        Paint paint = this.s;
        paint.setStrokeWidth(f9);
        paint.setColor(i6);
        canvas.drawPath(path2, paint);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Resources.Theme theme) {
        TypedValue typedValueA;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(w3.a.f15068i);
        int i6 = this.G.f12368d;
        if (i6 != Integer.MIN_VALUE && (typedValueA = q4.b.a(theme, i6)) != null) {
            b bVar = this.G;
            bVar.f12367c = typedValueA.data != 0;
            bVar.f12369e = true;
        }
        b bVar2 = this.G;
        if (!bVar2.f12369e) {
            bVar2.f12367c = q4.b.b(theme, com.htmltoapk.template.R.attr.focusRingsEnabled, bVar2.f12367c);
        }
        b bVar3 = this.G;
        if (bVar3.f12367c) {
            int color = bVar3.f12370f;
            int i7 = bVar3.f12371g;
            if (color == Integer.MIN_VALUE) {
                if (i7 != Integer.MIN_VALUE) {
                    TypedValue typedValue = new TypedValue();
                    color = theme.resolveAttribute(i7, typedValue, true) ? typedValue.data : typedArrayObtainStyledAttributes.getColor(5, -16777216);
                }
            }
            bVar3.f12370f = color;
            b bVar4 = this.G;
            int color2 = bVar4.h;
            int i8 = bVar4.f12372i;
            if (color2 == Integer.MIN_VALUE) {
                if (i8 != Integer.MIN_VALUE) {
                    TypedValue typedValue2 = new TypedValue();
                    color2 = theme.resolveAttribute(i8, typedValue2, true) ? typedValue2.data : typedArrayObtainStyledAttributes.getColor(1, -1);
                }
            }
            bVar4.h = color2;
            b bVar5 = this.G;
            bVar5.f12373j = f(bVar5.f12373j, theme, bVar5.f12374k, typedArrayObtainStyledAttributes, 6, com.htmltoapk.template.R.dimen.mtrl_focus_ring_outer_stroke_width);
            b bVar6 = this.G;
            bVar6.f12375l = f(bVar6.f12375l, theme, bVar6.f12376m, typedArrayObtainStyledAttributes, 3, com.htmltoapk.template.R.dimen.mtrl_focus_ring_inner_stroke_width);
            b bVar7 = this.G;
            bVar7.f12377n = f(bVar7.f12377n, theme, bVar7.f12378o, typedArrayObtainStyledAttributes, 7, 0);
            b bVar8 = this.G;
            bVar8.f12379p = f(bVar8.f12379p, theme, bVar8.f12380q, typedArrayObtainStyledAttributes, 4, 0);
            if (Float.isNaN(this.G.f12379p)) {
                this.G.f12379p = 0.0f;
            }
            b bVar9 = this.G;
            bVar9.f12381r = f(bVar9.f12381r, theme, bVar9.s, typedArrayObtainStyledAttributes, 2, com.htmltoapk.template.R.dimen.mtrl_focus_ring_inner_stroke_inset);
            b bVar10 = this.G;
            int i9 = bVar10.f12383u;
            int[] iArr = w3.a.B;
            if (i9 != Integer.MIN_VALUE) {
                bVar10.f12382t = k.g(theme.obtainStyledAttributes(i9, iArr), new u4.a(0.0f)).a();
            } else {
                int i10 = bVar10.f12384v;
                if (i10 == Integer.MIN_VALUE) {
                    i10 = com.htmltoapk.template.R.attr.focusRingsShapeAppearance;
                }
                TypedValue typedValueA2 = q4.b.a(theme, i10);
                if (typedValueA2 != null) {
                    this.G.f12382t = k.g(theme.obtainStyledAttributes(typedValueA2.resourceId, iArr), new u4.a(0.0f)).a();
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.s;
        paint.setStyle(style);
        if (Float.isNaN(this.G.f12373j)) {
            return;
        }
        paint.setStrokeWidth(this.G.f12373j);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float fMax;
        int radius;
        super.draw(canvas);
        b bVar = this.G;
        if (bVar.f12367c && this.E) {
            float f6 = bVar.f12379p;
            float f7 = bVar.f12373j / 2.0f;
            float f8 = this.C;
            float f9 = (f7 * f8) + f6;
            float f10 = ((bVar.f12375l / 2.0f) * f8) + f6 + bVar.f12381r;
            Path path = this.f12361w;
            if (path.isEmpty()) {
                WeakReference<g> weakReference = this.f12364z;
                if (weakReference == null || weakReference.get() == null) {
                    path = null;
                } else {
                    path = this.f12364z.get().A;
                    if (path.isEmpty()) {
                    }
                }
            }
            Path path2 = path;
            if (path2 != null) {
                b bVar2 = this.G;
                b(canvas, path2, f10, bVar2.f12375l, bVar2.h);
                b bVar3 = this.G;
                b(canvas, path2, f9, bVar3.f12373j, bVar3.f12370f);
                return;
            }
            if (Float.isNaN(this.G.f12377n)) {
                fMax = this.A;
                if (fMax < 0.0f) {
                    WeakReference<g> weakReference2 = this.f12364z;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        Drawable drawable = getDrawable();
                        fMax = (!(drawable instanceof RippleDrawable) || (radius = ((RippleDrawable) drawable).getRadius()) < 0) ? 0.0f : radius;
                    } else {
                        g gVar = this.f12364z.get();
                        float fC = gVar.c(gVar.h(), gVar.f14610t.f14619a.c(), gVar.U);
                        if (fC >= 0.0f) {
                            fC *= gVar.f14610t.f14626i;
                        }
                        if (fC >= 0.0f) {
                            fMax = Math.max(0.0f, fC - (this.G.f12373j / 2.0f));
                        }
                    }
                }
            } else {
                fMax = this.G.f12377n;
            }
            float fMax2 = Math.max(0.0f, fMax - (this.G.f12373j / 2.0f));
            b bVar4 = this.G;
            float f11 = bVar4.f12375l;
            int i6 = bVar4.h;
            RectF rectF = this.f12358t;
            a(rectF);
            rectF.inset(f10, f10);
            float f12 = f11 * this.C;
            Paint paint = this.s;
            paint.setStrokeWidth(f12);
            paint.setColor(i6);
            canvas.drawRoundRect(rectF, fMax2, fMax2, paint);
            b bVar5 = this.G;
            float f13 = bVar5.f12373j;
            int i7 = bVar5.f12370f;
            a(rectF);
            rectF.inset(f9, f9);
            paint.setStrokeWidth(f13 * this.C);
            paint.setColor(i7);
            canvas.drawRoundRect(rectF, fMax, fMax, paint);
        }
    }

    public final void g(j jVar) {
        RectF rectF = this.f12358t;
        a(rectF);
        k kVarB = jVar.b(I);
        boolean zI = kVarB.i(rectF);
        Path path = this.f12361w;
        if (!zI) {
            this.f12363y.a(kVarB, null, 1.0f, rectF, null, path);
            this.A = -1.0f;
            return;
        }
        b bVar = this.G;
        float f6 = ((bVar.f12373j / 2.0f) * this.C) + bVar.f12379p;
        rectF.inset(f6, f6);
        this.A = kVarB.f14639e.a(rectF);
        path.reset();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        b bVar = this.G;
        if (bVar.f12365a == null) {
            return null;
        }
        bVar.f12366b = getChangingConfigurations();
        return this.G;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean hasFocusStateSpecified() {
        try {
            if (super.hasFocusStateSpecified()) {
                return true;
            }
            return this.G.f12367c;
        } catch (NoSuchMethodError unused) {
            return this.G.f12367c;
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
        return super.isStateful() || this.G.f12367c;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        ObjectAnimator objectAnimator = this.B;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.B = null;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.F && super.mutate() == this) {
            this.G = new b(this.G);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                this.G.f12365a = drawable.getConstantState();
            }
            this.F = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float[] cornerRadii;
        float cornerRadius;
        k kVar;
        super.onBoundsChange(rect);
        b bVar = this.G;
        if (bVar.f12367c) {
            j jVar = bVar.f12382t;
            if (jVar != null) {
                g(jVar);
                return;
            }
            Drawable drawable = getDrawable();
            k kVar2 = null;
            if (drawable instanceof ShapeDrawable) {
                Outline outline = new Outline();
                ((ShapeDrawable) drawable).getOutline(outline);
                if (outline.getRadius() > 0.0f) {
                    i iVar = new i();
                    i iVar2 = new i();
                    i iVar3 = new i();
                    i iVar4 = new i();
                    f fVar = new f();
                    f fVar2 = new f();
                    f fVar3 = new f();
                    f fVar4 = new f();
                    float radius = outline.getRadius();
                    u4.a aVar = new u4.a(radius);
                    u4.a aVar2 = new u4.a(radius);
                    u4.a aVar3 = new u4.a(radius);
                    u4.a aVar4 = new u4.a(radius);
                    kVar = new k();
                    kVar.f14635a = iVar;
                    kVar.f14636b = iVar2;
                    kVar.f14637c = iVar3;
                    kVar.f14638d = iVar4;
                    kVar.f14639e = aVar;
                    kVar.f14640f = aVar2;
                    kVar.f14641g = aVar3;
                    kVar.h = aVar4;
                    kVar.f14642i = fVar;
                    kVar.f14643j = fVar2;
                    kVar.f14644k = fVar3;
                    kVar.f14645l = fVar4;
                    kVar2 = kVar;
                }
            } else if (drawable instanceof GradientDrawable) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                try {
                    cornerRadii = gradientDrawable.getCornerRadii();
                } catch (NullPointerException unused) {
                    cornerRadii = null;
                }
                if (cornerRadii != null) {
                    i iVar5 = new i();
                    i iVar6 = new i();
                    i iVar7 = new i();
                    i iVar8 = new i();
                    f fVar5 = new f();
                    f fVar6 = new f();
                    f fVar7 = new f();
                    f fVar8 = new f();
                    u4.a aVar5 = new u4.a(Math.min(cornerRadii[0], cornerRadii[1]));
                    u4.a aVar6 = new u4.a(Math.min(cornerRadii[2], cornerRadii[3]));
                    u4.a aVar7 = new u4.a(Math.min(cornerRadii[4], cornerRadii[5]));
                    u4.a aVar8 = new u4.a(Math.min(cornerRadii[6], cornerRadii[7]));
                    kVar = new k();
                    kVar.f14635a = iVar5;
                    kVar.f14636b = iVar6;
                    kVar.f14637c = iVar7;
                    kVar.f14638d = iVar8;
                    kVar.f14639e = aVar5;
                    kVar.f14640f = aVar6;
                    kVar.f14641g = aVar7;
                    kVar.h = aVar8;
                    kVar.f14642i = fVar5;
                    kVar.f14643j = fVar6;
                    kVar.f14644k = fVar7;
                    kVar.f14645l = fVar8;
                    kVar2 = kVar;
                } else {
                    try {
                        cornerRadius = gradientDrawable.getCornerRadius();
                    } catch (NullPointerException unused2) {
                        cornerRadius = -1.0f;
                    }
                    if (cornerRadius > 0.0f) {
                        i iVar9 = new i();
                        i iVar10 = new i();
                        i iVar11 = new i();
                        i iVar12 = new i();
                        f fVar9 = new f();
                        f fVar10 = new f();
                        f fVar11 = new f();
                        f fVar12 = new f();
                        u4.a aVar9 = new u4.a(cornerRadius);
                        u4.a aVar10 = new u4.a(cornerRadius);
                        u4.a aVar11 = new u4.a(cornerRadius);
                        u4.a aVar12 = new u4.a(cornerRadius);
                        k kVar3 = new k();
                        kVar3.f14635a = iVar9;
                        kVar3.f14636b = iVar10;
                        kVar3.f14637c = iVar11;
                        kVar3.f14638d = iVar12;
                        kVar3.f14639e = aVar9;
                        kVar3.f14640f = aVar10;
                        kVar3.f14641g = aVar11;
                        kVar3.h = aVar12;
                        kVar3.f14642i = fVar9;
                        kVar3.f14643j = fVar10;
                        kVar3.f14644k = fVar11;
                        kVar3.f14645l = fVar12;
                        kVar2 = kVar3;
                    }
                }
            }
            if (kVar2 != null) {
                g(kVar2);
            } else {
                this.A = -1.0f;
                this.f12361w.reset();
            }
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        b bVar = this.G;
        if (!bVar.f12367c) {
            this.E = false;
            return super.onStateChange(iArr);
        }
        boolean zStateSetMatches = StateSet.stateSetMatches(bVar.f12386x, iArr);
        boolean z6 = this.E != zStateSetMatches;
        this.E = zStateSetMatches;
        if (z6 && iArr.length > 0 && !this.D) {
            ObjectAnimator objectAnimator = this.B;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.B = null;
            }
            if (zStateSetMatches) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, K, 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(300L);
                objectAnimatorOfFloat.setInterpolator(J);
                objectAnimatorOfFloat.addListener(new a4.a(this, 1));
                this.B = objectAnimatorOfFloat;
                objectAnimatorOfFloat.start();
            } else {
                this.C = 1.0f;
            }
        }
        this.D = iArr.length == 0;
        return super.onStateChange(iArr) || z6;
    }

    public FocusRingDrawable() {
        super(null);
        this.s = new Paint(1);
        this.f12358t = new RectF();
        this.f12359u = new Rect();
        this.f12360v = new Path();
        this.f12361w = new Path();
        this.f12362x = new Matrix();
        this.f12363y = l.b();
        this.A = -1.0f;
        this.C = 1.0f;
        this.E = false;
        this.F = false;
        this.G = new b(null);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        int[] iArr = w3.a.f15068i;
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, iArr, 0, 0) : resources.obtainAttributes(attributeSet, iArr);
        this.G.f12368d = c(typedArrayObtainStyledAttributes, 0);
        if (this.G.f12368d == Integer.MIN_VALUE && typedArrayObtainStyledAttributes.hasValue(0)) {
            b bVar = this.G;
            bVar.f12367c = typedArrayObtainStyledAttributes.getBoolean(0, bVar.f12367c);
            this.G.f12369e = true;
        }
        this.G.f12371g = c(typedArrayObtainStyledAttributes, 5);
        b bVar2 = this.G;
        if (bVar2.f12371g == Integer.MIN_VALUE) {
            bVar2.f12370f = typedArrayObtainStyledAttributes.getColor(5, Integer.MIN_VALUE);
        }
        this.G.f12372i = c(typedArrayObtainStyledAttributes, 1);
        b bVar3 = this.G;
        if (bVar3.f12372i == Integer.MIN_VALUE) {
            bVar3.h = typedArrayObtainStyledAttributes.getColor(1, Integer.MIN_VALUE);
        }
        this.G.f12374k = c(typedArrayObtainStyledAttributes, 6);
        b bVar4 = this.G;
        if (bVar4.f12374k == Integer.MIN_VALUE) {
            bVar4.f12373j = typedArrayObtainStyledAttributes.getDimension(6, Float.NaN);
        }
        this.G.f12376m = c(typedArrayObtainStyledAttributes, 3);
        b bVar5 = this.G;
        if (bVar5.f12376m == Integer.MIN_VALUE) {
            bVar5.f12375l = typedArrayObtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.G.f12376m = c(typedArrayObtainStyledAttributes, 3);
        b bVar6 = this.G;
        if (bVar6.f12376m == Integer.MIN_VALUE) {
            bVar6.f12375l = typedArrayObtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.G.f12378o = c(typedArrayObtainStyledAttributes, 7);
        b bVar7 = this.G;
        if (bVar7.f12378o == Integer.MIN_VALUE) {
            bVar7.f12377n = typedArrayObtainStyledAttributes.getDimension(7, Float.NaN);
        }
        this.G.f12380q = c(typedArrayObtainStyledAttributes, 4);
        b bVar8 = this.G;
        if (bVar8.f12380q == Integer.MIN_VALUE) {
            bVar8.f12379p = typedArrayObtainStyledAttributes.getDimension(4, Float.NaN);
        }
        this.G.s = c(typedArrayObtainStyledAttributes, 2);
        b bVar9 = this.G;
        if (bVar9.s == Integer.MIN_VALUE) {
            bVar9.f12381r = typedArrayObtainStyledAttributes.getDimension(2, Float.NaN);
        }
        this.G.f12384v = c(typedArrayObtainStyledAttributes, 8);
        this.G.f12383u = typedArrayObtainStyledAttributes.getType(8) == 1 ? typedArrayObtainStyledAttributes.getResourceId(8, Integer.MIN_VALUE) : Integer.MIN_VALUE;
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
            this.G.f12365a = drawableCreateFromXmlInner.getConstantState();
        } else {
            ColorDrawable colorDrawable = H;
            setDrawable(colorDrawable);
            this.G.f12365a = colorDrawable.getConstantState();
        }
    }

    public FocusRingDrawable(Context context, Drawable drawable) {
        super(drawable);
        this.s = new Paint(1);
        this.f12358t = new RectF();
        this.f12359u = new Rect();
        this.f12360v = new Path();
        this.f12361w = new Path();
        this.f12362x = new Matrix();
        this.f12363y = l.b();
        this.A = -1.0f;
        this.C = 1.0f;
        this.E = false;
        this.F = false;
        b bVar = new b(null);
        this.G = bVar;
        if (drawable != null) {
            bVar.f12365a = drawable.getConstantState();
        }
        d(context.getTheme());
    }

    private FocusRingDrawable(b bVar, Resources resources) {
        Drawable drawableNewDrawable;
        super(null);
        Paint paint = new Paint(1);
        this.s = paint;
        this.f12358t = new RectF();
        this.f12359u = new Rect();
        this.f12360v = new Path();
        this.f12361w = new Path();
        this.f12362x = new Matrix();
        this.f12363y = l.b();
        this.A = -1.0f;
        this.C = 1.0f;
        this.E = false;
        this.F = false;
        b bVar2 = new b(bVar);
        this.G = bVar2;
        Drawable.ConstantState constantState = bVar2.f12365a;
        if (constantState != null) {
            if (resources != null) {
                drawableNewDrawable = constantState.newDrawable(resources);
            } else {
                drawableNewDrawable = constantState.newDrawable();
            }
            setDrawable(drawableNewDrawable);
        }
        paint.setStyle(Paint.Style.STROKE);
        if (Float.isNaN(this.G.f12373j)) {
            return;
        }
        paint.setStrokeWidth(this.G.f12373j);
    }
}
