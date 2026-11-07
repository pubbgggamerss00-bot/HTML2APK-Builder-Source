package f2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import l0.j;
import m0.d;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g extends f2.f {
    public static final PorterDuff.Mode B = PorterDuff.Mode.SRC_IN;
    public final Rect A;

    /* renamed from: t, reason: collision with root package name */
    public C0058g f13002t;

    /* renamed from: u, reason: collision with root package name */
    public PorterDuffColorFilter f13003u;

    /* renamed from: v, reason: collision with root package name */
    public ColorFilter f13004v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f13005w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f13006x;

    /* renamed from: y, reason: collision with root package name */
    public final float[] f13007y;

    /* renamed from: z, reason: collision with root package name */
    public final Matrix f13008z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a extends e {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b extends e {

        /* renamed from: d, reason: collision with root package name */
        public l0.d f13009d;

        /* renamed from: f, reason: collision with root package name */
        public l0.d f13011f;

        /* renamed from: e, reason: collision with root package name */
        public float f13010e = 0.0f;

        /* renamed from: g, reason: collision with root package name */
        public float f13012g = 1.0f;
        public float h = 1.0f;

        /* renamed from: i, reason: collision with root package name */
        public float f13013i = 0.0f;

        /* renamed from: j, reason: collision with root package name */
        public float f13014j = 1.0f;

        /* renamed from: k, reason: collision with root package name */
        public float f13015k = 0.0f;

        /* renamed from: l, reason: collision with root package name */
        public Paint.Cap f13016l = Paint.Cap.BUTT;

        /* renamed from: m, reason: collision with root package name */
        public Paint.Join f13017m = Paint.Join.MITER;

        /* renamed from: n, reason: collision with root package name */
        public float f13018n = 4.0f;

        @Override // f2.g.d
        public final boolean a() {
            return this.f13011f.b() || this.f13009d.b();
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
        @Override // f2.g.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean b(int[] iArr) {
            boolean z6;
            l0.d dVar = this.f13011f;
            boolean z7 = true;
            if (dVar.b()) {
                ColorStateList colorStateList = dVar.f13781b;
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (colorForState != dVar.f13782c) {
                    dVar.f13782c = colorForState;
                    z6 = true;
                } else {
                    z6 = false;
                }
            }
            l0.d dVar2 = this.f13009d;
            if (dVar2.b()) {
                ColorStateList colorStateList2 = dVar2.f13781b;
                int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                if (colorForState2 != dVar2.f13782c) {
                    dVar2.f13782c = colorForState2;
                } else {
                    z7 = false;
                }
            }
            return z6 | z7;
        }

        public float getFillAlpha() {
            return this.h;
        }

        public int getFillColor() {
            return this.f13011f.f13782c;
        }

        public float getStrokeAlpha() {
            return this.f13012g;
        }

        public int getStrokeColor() {
            return this.f13009d.f13782c;
        }

        public float getStrokeWidth() {
            return this.f13010e;
        }

        public float getTrimPathEnd() {
            return this.f13014j;
        }

        public float getTrimPathOffset() {
            return this.f13015k;
        }

        public float getTrimPathStart() {
            return this.f13013i;
        }

        public void setFillAlpha(float f6) {
            this.h = f6;
        }

        public void setFillColor(int i6) {
            this.f13011f.f13782c = i6;
        }

        public void setStrokeAlpha(float f6) {
            this.f13012g = f6;
        }

        public void setStrokeColor(int i6) {
            this.f13009d.f13782c = i6;
        }

        public void setStrokeWidth(float f6) {
            this.f13010e = f6;
        }

        public void setTrimPathEnd(float f6) {
            this.f13014j = f6;
        }

        public void setTrimPathOffset(float f6) {
            this.f13015k = f6;
        }

        public void setTrimPathStart(float f6) {
            this.f13013i = f6;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class d {
        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: f2.g$g, reason: collision with other inner class name */
    public static class C0058g extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public int f13047a;

        /* renamed from: b, reason: collision with root package name */
        public f f13048b;

        /* renamed from: c, reason: collision with root package name */
        public ColorStateList f13049c;

        /* renamed from: d, reason: collision with root package name */
        public PorterDuff.Mode f13050d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f13051e;

        /* renamed from: f, reason: collision with root package name */
        public Bitmap f13052f;

        /* renamed from: g, reason: collision with root package name */
        public ColorStateList f13053g;
        public PorterDuff.Mode h;

        /* renamed from: i, reason: collision with root package name */
        public int f13054i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f13055j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f13056k;

        /* renamed from: l, reason: collision with root package name */
        public Paint f13057l;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f13047a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new g(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new g(this);
        }
    }

    public g() {
        this.f13006x = true;
        this.f13007y = new float[9];
        this.f13008z = new Matrix();
        this.A = new Rect();
        C0058g c0058g = new C0058g();
        c0058g.f13049c = null;
        c0058g.f13050d = B;
        c0058g.f13048b = new f();
        this.f13002t = c0058g;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.s;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.A;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f13004v;
        if (colorFilter == null) {
            colorFilter = this.f13003u;
        }
        Matrix matrix = this.f13008z;
        canvas.getMatrix(matrix);
        float[] fArr = this.f13007y;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C0058g c0058g = this.f13002t;
        Bitmap bitmap = c0058g.f13052f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != c0058g.f13052f.getHeight()) {
            c0058g.f13052f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            c0058g.f13056k = true;
        }
        if (this.f13006x) {
            C0058g c0058g2 = this.f13002t;
            if (c0058g2.f13056k || c0058g2.f13053g != c0058g2.f13049c || c0058g2.h != c0058g2.f13050d || c0058g2.f13055j != c0058g2.f13051e || c0058g2.f13054i != c0058g2.f13048b.getRootAlpha()) {
                C0058g c0058g3 = this.f13002t;
                c0058g3.f13052f.eraseColor(0);
                Canvas canvas2 = new Canvas(c0058g3.f13052f);
                f fVar = c0058g3.f13048b;
                fVar.a(fVar.f13039g, f.f13032p, canvas2, iMin, iMin2);
                C0058g c0058g4 = this.f13002t;
                c0058g4.f13053g = c0058g4.f13049c;
                c0058g4.h = c0058g4.f13050d;
                c0058g4.f13054i = c0058g4.f13048b.getRootAlpha();
                c0058g4.f13055j = c0058g4.f13051e;
                c0058g4.f13056k = false;
            }
        } else {
            C0058g c0058g5 = this.f13002t;
            c0058g5.f13052f.eraseColor(0);
            Canvas canvas3 = new Canvas(c0058g5.f13052f);
            f fVar2 = c0058g5.f13048b;
            fVar2.a(fVar2.f13039g, f.f13032p, canvas3, iMin, iMin2);
        }
        C0058g c0058g6 = this.f13002t;
        if (c0058g6.f13048b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c0058g6.f13057l == null) {
                Paint paint2 = new Paint();
                c0058g6.f13057l = paint2;
                paint2.setFilterBitmap(true);
            }
            c0058g6.f13057l.setAlpha(c0058g6.f13048b.getRootAlpha());
            c0058g6.f13057l.setColorFilter(colorFilter);
            paint = c0058g6.f13057l;
        }
        canvas.drawBitmap(c0058g6.f13052f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.s;
        return drawable != null ? drawable.getAlpha() : this.f13002t.f13048b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.s;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f13002t.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.s;
        return drawable != null ? drawable.getColorFilter() : this.f13004v;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.s != null) {
            return new h(this.s.getConstantState());
        }
        this.f13002t.f13047a = getChangingConfigurations();
        return this.f13002t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.s;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f13002t.f13048b.f13040i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.s;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f13002t.f13048b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.s;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.s;
        return drawable != null ? drawable.isAutoMirrored() : this.f13002t.f13051e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.s;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        C0058g c0058g = this.f13002t;
        if (c0058g == null) {
            return false;
        }
        f fVar = c0058g.f13048b;
        if (fVar.f13045n == null) {
            fVar.f13045n = Boolean.valueOf(fVar.f13039g.a());
        }
        if (fVar.f13045n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f13002t.f13049c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f13005w && super.mutate() == this) {
            C0058g c0058g = this.f13002t;
            C0058g c0058g2 = new C0058g();
            c0058g2.f13049c = null;
            c0058g2.f13050d = B;
            if (c0058g != null) {
                c0058g2.f13047a = c0058g.f13047a;
                f fVar = new f(c0058g.f13048b);
                c0058g2.f13048b = fVar;
                if (c0058g.f13048b.f13037e != null) {
                    fVar.f13037e = new Paint(c0058g.f13048b.f13037e);
                }
                if (c0058g.f13048b.f13036d != null) {
                    c0058g2.f13048b.f13036d = new Paint(c0058g.f13048b.f13036d);
                }
                c0058g2.f13049c = c0058g.f13049c;
                c0058g2.f13050d = c0058g.f13050d;
                c0058g2.f13051e = c0058g.f13051e;
            }
            this.f13002t = c0058g2;
            this.f13005w = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z6;
        PorterDuff.Mode mode;
        Drawable drawable = this.s;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C0058g c0058g = this.f13002t;
        ColorStateList colorStateList = c0058g.f13049c;
        if (colorStateList == null || (mode = c0058g.f13050d) == null) {
            z6 = false;
        } else {
            this.f13003u = a(colorStateList, mode);
            invalidateSelf();
            z6 = true;
        }
        f fVar = c0058g.f13048b;
        if (fVar.f13045n == null) {
            fVar.f13045n = Boolean.valueOf(fVar.f13039g.a());
        }
        if (fVar.f13045n.booleanValue()) {
            boolean zB = c0058g.f13048b.f13039g.b(iArr);
            c0058g.f13056k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z6;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j6) {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j6);
        } else {
            super.scheduleSelf(runnable, j6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.setAlpha(i6);
        } else if (this.f13002t.f13048b.getRootAlpha() != i6) {
            this.f13002t.f13048b.setRootAlpha(i6);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z6) {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.setAutoMirrored(z6);
        } else {
            this.f13002t.f13051e = z6;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f13004v = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i6) {
        Drawable drawable = this.s;
        if (drawable != null) {
            n0.a.a(drawable, i6);
        } else {
            setTintList(ColorStateList.valueOf(i6));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        C0058g c0058g = this.f13002t;
        if (c0058g.f13049c != colorStateList) {
            c0058g.f13049c = colorStateList;
            this.f13003u = a(colorStateList, c0058g.f13050d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        C0058g c0058g = this.f13002t;
        if (c0058g.f13050d != mode) {
            c0058g.f13050d = mode;
            this.f13003u = a(c0058g.f13049c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z7) {
        Drawable drawable = this.s;
        return drawable != null ? drawable.setVisible(z6, z7) : super.setVisible(z6, z7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f13058a;

        public h(Drawable.ConstantState constantState) {
            this.f13058a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f13058a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f13058a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            g gVar = new g();
            gVar.s = (VectorDrawable) this.f13058a.newDrawable();
            return gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            g gVar = new g();
            gVar.s = (VectorDrawable) this.f13058a.newDrawable(resources);
            return gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            g gVar = new g();
            gVar.s = (VectorDrawable) this.f13058a.newDrawable(resources, theme);
            return gVar;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class e extends d {

        /* renamed from: a, reason: collision with root package name */
        public d.a[] f13029a;

        /* renamed from: b, reason: collision with root package name */
        public String f13030b;

        /* renamed from: c, reason: collision with root package name */
        public int f13031c;

        public e() {
            this.f13029a = null;
            this.f13031c = 0;
        }

        public d.a[] getPathData() {
            return this.f13029a;
        }

        public String getPathName() {
            return this.f13030b;
        }

        public void setPathData(d.a[] aVarArr) {
            d.a[] aVarArr2 = this.f13029a;
            boolean z6 = false;
            if (aVarArr2 != null && aVarArr != null && aVarArr2.length == aVarArr.length) {
                int i6 = 0;
                while (true) {
                    if (i6 >= aVarArr2.length) {
                        z6 = true;
                        break;
                    }
                    d.a aVar = aVarArr2[i6];
                    char c7 = aVar.f13859a;
                    d.a aVar2 = aVarArr[i6];
                    if (c7 != aVar2.f13859a || aVar.f13860b.length != aVar2.f13860b.length) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            if (!z6) {
                this.f13029a = m0.d.c(aVarArr);
                return;
            }
            d.a[] aVarArr3 = this.f13029a;
            for (int i7 = 0; i7 < aVarArr.length; i7++) {
                aVarArr3[i7].f13859a = aVarArr[i7].f13859a;
                int i8 = 0;
                while (true) {
                    float[] fArr = aVarArr[i7].f13860b;
                    if (i8 < fArr.length) {
                        aVarArr3[i7].f13860b[i8] = fArr[i8];
                        i8++;
                    }
                }
            }
        }

        public e(e eVar) {
            this.f13029a = null;
            this.f13031c = 0;
            this.f13030b = eVar.f13030b;
            this.f13029a = m0.d.c(eVar.f13029a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i6;
        int i7;
        boolean z6;
        int i8;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0058g c0058g = this.f13002t;
        c0058g.f13048b = new f();
        TypedArray typedArrayC = j.c(resources, theme, attributeSet, f2.a.f12982a);
        C0058g c0058g2 = this.f13002t;
        f fVar = c0058g2.f13048b;
        int i9 = !j.b(xmlPullParser, "tintMode") ? -1 : typedArrayC.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i9 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i9 != 5) {
            if (i9 != 9) {
                switch (i9) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        c0058g2.f13050d = mode;
        ColorStateList colorStateListA = null;
        boolean z7 = false;
        int i10 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArrayC.getValue(1, typedValue);
            int i11 = typedValue.type;
            if (i11 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i11 >= 28 && i11 <= 31) {
                colorStateListA = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayC.getResources();
                int resourceId = typedArrayC.getResourceId(1, 0);
                ThreadLocal<TypedValue> threadLocal = l0.c.f13779a;
                try {
                    colorStateListA = l0.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e6) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e6);
                }
            }
        }
        ColorStateList colorStateList = colorStateListA;
        if (colorStateList != null) {
            c0058g2.f13049c = colorStateList;
        }
        boolean z8 = c0058g2.f13051e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z8 = typedArrayC.getBoolean(5, z8);
        }
        c0058g2.f13051e = z8;
        float f6 = fVar.f13041j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f6 = typedArrayC.getFloat(7, f6);
        }
        fVar.f13041j = f6;
        float f7 = fVar.f13042k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f7 = typedArrayC.getFloat(8, f7);
        }
        fVar.f13042k = f7;
        if (fVar.f13041j <= 0.0f) {
            throw new XmlPullParserException(typedArrayC.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f7 > 0.0f) {
            fVar.h = typedArrayC.getDimension(3, fVar.h);
            float dimension = typedArrayC.getDimension(2, fVar.f13040i);
            fVar.f13040i = dimension;
            if (fVar.h <= 0.0f) {
                throw new XmlPullParserException(typedArrayC.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = fVar.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayC.getFloat(4, alpha);
                }
                fVar.setAlpha(alpha);
                String string = typedArrayC.getString(0);
                if (string != null) {
                    fVar.f13044m = string;
                    fVar.f13046o.put(string, fVar);
                }
                typedArrayC.recycle();
                c0058g.f13047a = getChangingConfigurations();
                c0058g.f13056k = true;
                C0058g c0058g3 = this.f13002t;
                f fVar2 = c0058g3.f13048b;
                ArrayDeque arrayDeque = new ArrayDeque();
                c cVar = fVar2.f13039g;
                w.a<String, Object> aVar = fVar2.f13046o;
                arrayDeque.push(cVar);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z9 = true;
                while (eventType != i10 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        c cVar2 = (c) arrayDeque.peek();
                        if ("path".equals(name)) {
                            b bVar = new b();
                            TypedArray typedArrayC2 = j.c(resources, theme, attributeSet, f2.a.f12984c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                i7 = depth;
                                String string2 = typedArrayC2.getString(0);
                                if (string2 != null) {
                                    bVar.f13030b = string2;
                                }
                                String string3 = typedArrayC2.getString(2);
                                if (string3 != null) {
                                    bVar.f13029a = m0.d.b(string3);
                                }
                                bVar.f13011f = j.a(typedArrayC2, xmlPullParser, theme, "fillColor", 1);
                                float f8 = bVar.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f8 = typedArrayC2.getFloat(12, f8);
                                }
                                bVar.h = f8;
                                int i12 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayC2.getInt(8, -1) : -1;
                                Paint.Cap cap2 = bVar.f13016l;
                                if (i12 == 0) {
                                    cap = Paint.Cap.BUTT;
                                } else if (i12 != 1) {
                                    cap = i12 != 2 ? cap2 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                bVar.f13016l = cap;
                                int i13 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayC2.getInt(9, -1) : -1;
                                Paint.Join join2 = bVar.f13017m;
                                if (i13 == 0) {
                                    join = Paint.Join.MITER;
                                } else if (i13 != 1) {
                                    join = i13 != 2 ? join2 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                bVar.f13017m = join;
                                float f9 = bVar.f13018n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f9 = typedArrayC2.getFloat(10, f9);
                                }
                                bVar.f13018n = f9;
                                bVar.f13009d = j.a(typedArrayC2, xmlPullParser, theme, "strokeColor", 3);
                                float f10 = bVar.f13012g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f10 = typedArrayC2.getFloat(11, f10);
                                }
                                bVar.f13012g = f10;
                                float f11 = bVar.f13010e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f11 = typedArrayC2.getFloat(4, f11);
                                }
                                bVar.f13010e = f11;
                                float f12 = bVar.f13014j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f12 = typedArrayC2.getFloat(6, f12);
                                }
                                bVar.f13014j = f12;
                                float f13 = bVar.f13015k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f13 = typedArrayC2.getFloat(7, f13);
                                }
                                bVar.f13015k = f13;
                                float f14 = bVar.f13013i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f14 = typedArrayC2.getFloat(5, f14);
                                }
                                bVar.f13013i = f14;
                                int i14 = bVar.f13031c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i14 = typedArrayC2.getInt(13, i14);
                                }
                                bVar.f13031c = i14;
                            } else {
                                i7 = depth;
                            }
                            typedArrayC2.recycle();
                            cVar2.f13020b.add(bVar);
                            if (bVar.getPathName() != null) {
                                aVar.put(bVar.getPathName(), bVar);
                            }
                            c0058g3.f13047a = c0058g3.f13047a;
                            z6 = false;
                            i8 = 1;
                            z9 = false;
                        } else {
                            i7 = depth;
                            if ("clip-path".equals(name)) {
                                a aVar2 = new a();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray typedArrayC3 = j.c(resources, theme, attributeSet, f2.a.f12985d);
                                    String string4 = typedArrayC3.getString(0);
                                    if (string4 != null) {
                                        aVar2.f13030b = string4;
                                    }
                                    String string5 = typedArrayC3.getString(1);
                                    if (string5 != null) {
                                        aVar2.f13029a = m0.d.b(string5);
                                    }
                                    aVar2.f13031c = !j.b(xmlPullParser, "fillType") ? 0 : typedArrayC3.getInt(2, 0);
                                    typedArrayC3.recycle();
                                }
                                cVar2.f13020b.add(aVar2);
                                if (aVar2.getPathName() != null) {
                                    aVar.put(aVar2.getPathName(), aVar2);
                                }
                                c0058g3.f13047a = c0058g3.f13047a;
                            } else if ("group".equals(name)) {
                                c cVar3 = new c();
                                TypedArray typedArrayC4 = j.c(resources, theme, attributeSet, f2.a.f12983b);
                                float f15 = cVar3.f13021c;
                                if (j.b(xmlPullParser, "rotation")) {
                                    f15 = typedArrayC4.getFloat(5, f15);
                                }
                                cVar3.f13021c = f15;
                                i8 = 1;
                                cVar3.f13022d = typedArrayC4.getFloat(1, cVar3.f13022d);
                                cVar3.f13023e = typedArrayC4.getFloat(2, cVar3.f13023e);
                                float f16 = cVar3.f13024f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f16 = typedArrayC4.getFloat(3, f16);
                                }
                                cVar3.f13024f = f16;
                                float f17 = cVar3.f13025g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f17 = typedArrayC4.getFloat(4, f17);
                                }
                                cVar3.f13025g = f17;
                                float f18 = cVar3.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f18 = typedArrayC4.getFloat(6, f18);
                                }
                                cVar3.h = f18;
                                float f19 = cVar3.f13026i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f19 = typedArrayC4.getFloat(7, f19);
                                }
                                cVar3.f13026i = f19;
                                z6 = false;
                                String string6 = typedArrayC4.getString(0);
                                if (string6 != null) {
                                    cVar3.f13028k = string6;
                                }
                                cVar3.c();
                                typedArrayC4.recycle();
                                cVar2.f13020b.add(cVar3);
                                arrayDeque.push(cVar3);
                                if (cVar3.getGroupName() != null) {
                                    aVar.put(cVar3.getGroupName(), cVar3);
                                }
                                c0058g3.f13047a = c0058g3.f13047a;
                            }
                            z6 = false;
                            i8 = 1;
                        }
                        i6 = i8;
                    } else {
                        i6 = i10;
                        i7 = depth;
                        z6 = z7;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    z7 = z6;
                    i10 = i6;
                    depth = i7;
                }
                if (!z9) {
                    this.f13003u = a(c0058g.f13049c, c0058g.f13050d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayC.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayC.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c extends d {

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f13019a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList<d> f13020b;

        /* renamed from: c, reason: collision with root package name */
        public float f13021c;

        /* renamed from: d, reason: collision with root package name */
        public float f13022d;

        /* renamed from: e, reason: collision with root package name */
        public float f13023e;

        /* renamed from: f, reason: collision with root package name */
        public float f13024f;

        /* renamed from: g, reason: collision with root package name */
        public float f13025g;
        public float h;

        /* renamed from: i, reason: collision with root package name */
        public float f13026i;

        /* renamed from: j, reason: collision with root package name */
        public final Matrix f13027j;

        /* renamed from: k, reason: collision with root package name */
        public String f13028k;

        public c() {
            this.f13019a = new Matrix();
            this.f13020b = new ArrayList<>();
            this.f13021c = 0.0f;
            this.f13022d = 0.0f;
            this.f13023e = 0.0f;
            this.f13024f = 1.0f;
            this.f13025g = 1.0f;
            this.h = 0.0f;
            this.f13026i = 0.0f;
            this.f13027j = new Matrix();
            this.f13028k = null;
        }

        @Override // f2.g.d
        public final boolean a() {
            int i6 = 0;
            while (true) {
                ArrayList<d> arrayList = this.f13020b;
                if (i6 >= arrayList.size()) {
                    return false;
                }
                if (arrayList.get(i6).a()) {
                    return true;
                }
                i6++;
            }
        }

        @Override // f2.g.d
        public final boolean b(int[] iArr) {
            int i6 = 0;
            boolean zB = false;
            while (true) {
                ArrayList<d> arrayList = this.f13020b;
                if (i6 >= arrayList.size()) {
                    return zB;
                }
                zB |= arrayList.get(i6).b(iArr);
                i6++;
            }
        }

        public final void c() {
            Matrix matrix = this.f13027j;
            matrix.reset();
            matrix.postTranslate(-this.f13022d, -this.f13023e);
            matrix.postScale(this.f13024f, this.f13025g);
            matrix.postRotate(this.f13021c, 0.0f, 0.0f);
            matrix.postTranslate(this.h + this.f13022d, this.f13026i + this.f13023e);
        }

        public String getGroupName() {
            return this.f13028k;
        }

        public Matrix getLocalMatrix() {
            return this.f13027j;
        }

        public float getPivotX() {
            return this.f13022d;
        }

        public float getPivotY() {
            return this.f13023e;
        }

        public float getRotation() {
            return this.f13021c;
        }

        public float getScaleX() {
            return this.f13024f;
        }

        public float getScaleY() {
            return this.f13025g;
        }

        public float getTranslateX() {
            return this.h;
        }

        public float getTranslateY() {
            return this.f13026i;
        }

        public void setPivotX(float f6) {
            if (f6 != this.f13022d) {
                this.f13022d = f6;
                c();
            }
        }

        public void setPivotY(float f6) {
            if (f6 != this.f13023e) {
                this.f13023e = f6;
                c();
            }
        }

        public void setRotation(float f6) {
            if (f6 != this.f13021c) {
                this.f13021c = f6;
                c();
            }
        }

        public void setScaleX(float f6) {
            if (f6 != this.f13024f) {
                this.f13024f = f6;
                c();
            }
        }

        public void setScaleY(float f6) {
            if (f6 != this.f13025g) {
                this.f13025g = f6;
                c();
            }
        }

        public void setTranslateX(float f6) {
            if (f6 != this.h) {
                this.h = f6;
                c();
            }
        }

        public void setTranslateY(float f6) {
            if (f6 != this.f13026i) {
                this.f13026i = f6;
                c();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(c cVar, w.a<String, Object> aVar) {
            a aVar2;
            this.f13019a = new Matrix();
            this.f13020b = new ArrayList<>();
            this.f13021c = 0.0f;
            this.f13022d = 0.0f;
            this.f13023e = 0.0f;
            this.f13024f = 1.0f;
            this.f13025g = 1.0f;
            this.h = 0.0f;
            this.f13026i = 0.0f;
            Matrix matrix = new Matrix();
            this.f13027j = matrix;
            this.f13028k = null;
            this.f13021c = cVar.f13021c;
            this.f13022d = cVar.f13022d;
            this.f13023e = cVar.f13023e;
            this.f13024f = cVar.f13024f;
            this.f13025g = cVar.f13025g;
            this.h = cVar.h;
            this.f13026i = cVar.f13026i;
            String str = cVar.f13028k;
            this.f13028k = str;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(cVar.f13027j);
            ArrayList<d> arrayList = cVar.f13020b;
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                d dVar = arrayList.get(i6);
                if (dVar instanceof c) {
                    this.f13020b.add(new c((c) dVar, aVar));
                } else {
                    if (dVar instanceof b) {
                        b bVar = (b) dVar;
                        b bVar2 = new b(bVar);
                        bVar2.f13010e = 0.0f;
                        bVar2.f13012g = 1.0f;
                        bVar2.h = 1.0f;
                        bVar2.f13013i = 0.0f;
                        bVar2.f13014j = 1.0f;
                        bVar2.f13015k = 0.0f;
                        bVar2.f13016l = Paint.Cap.BUTT;
                        bVar2.f13017m = Paint.Join.MITER;
                        bVar2.f13018n = 4.0f;
                        bVar2.f13009d = bVar.f13009d;
                        bVar2.f13010e = bVar.f13010e;
                        bVar2.f13012g = bVar.f13012g;
                        bVar2.f13011f = bVar.f13011f;
                        bVar2.f13031c = bVar.f13031c;
                        bVar2.h = bVar.h;
                        bVar2.f13013i = bVar.f13013i;
                        bVar2.f13014j = bVar.f13014j;
                        bVar2.f13015k = bVar.f13015k;
                        bVar2.f13016l = bVar.f13016l;
                        bVar2.f13017m = bVar.f13017m;
                        bVar2.f13018n = bVar.f13018n;
                        aVar2 = bVar2;
                    } else if (dVar instanceof a) {
                        aVar2 = new a((a) dVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f13020b.add(aVar2);
                    String str2 = aVar2.f13030b;
                    if (str2 != null) {
                        aVar.put(str2, aVar2);
                    }
                }
            }
        }
    }

    public g(C0058g c0058g) {
        this.f13006x = true;
        this.f13007y = new float[9];
        this.f13008z = new Matrix();
        this.A = new Rect();
        this.f13002t = c0058g;
        this.f13003u = a(c0058g.f13049c, c0058g.f13050d);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class f {

        /* renamed from: p, reason: collision with root package name */
        public static final Matrix f13032p = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        public final Path f13033a;

        /* renamed from: b, reason: collision with root package name */
        public final Path f13034b;

        /* renamed from: c, reason: collision with root package name */
        public final Matrix f13035c;

        /* renamed from: d, reason: collision with root package name */
        public Paint f13036d;

        /* renamed from: e, reason: collision with root package name */
        public Paint f13037e;

        /* renamed from: f, reason: collision with root package name */
        public PathMeasure f13038f;

        /* renamed from: g, reason: collision with root package name */
        public final c f13039g;
        public float h;

        /* renamed from: i, reason: collision with root package name */
        public float f13040i;

        /* renamed from: j, reason: collision with root package name */
        public float f13041j;

        /* renamed from: k, reason: collision with root package name */
        public float f13042k;

        /* renamed from: l, reason: collision with root package name */
        public int f13043l;

        /* renamed from: m, reason: collision with root package name */
        public String f13044m;

        /* renamed from: n, reason: collision with root package name */
        public Boolean f13045n;

        /* renamed from: o, reason: collision with root package name */
        public final w.a<String, Object> f13046o;

        public f() {
            this.f13035c = new Matrix();
            this.h = 0.0f;
            this.f13040i = 0.0f;
            this.f13041j = 0.0f;
            this.f13042k = 0.0f;
            this.f13043l = 255;
            this.f13044m = null;
            this.f13045n = null;
            this.f13046o = new w.a<>();
            this.f13039g = new c();
            this.f13033a = new Path();
            this.f13034b = new Path();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(c cVar, Matrix matrix, Canvas canvas, int i6, int i7) {
            int i8;
            float f6;
            int i9;
            float f7;
            Matrix matrix2 = cVar.f13019a;
            ArrayList<d> arrayList = cVar.f13020b;
            matrix2.set(matrix);
            Matrix matrix3 = cVar.f13019a;
            matrix3.preConcat(cVar.f13027j);
            canvas.save();
            char c7 = 0;
            int i10 = 0;
            while (i10 < arrayList.size()) {
                d dVar = arrayList.get(i10);
                if (dVar instanceof c) {
                    a((c) dVar, matrix3, canvas, i6, i7);
                } else if (dVar instanceof e) {
                    e eVar = (e) dVar;
                    float f8 = i6 / this.f13041j;
                    float f9 = i7 / this.f13042k;
                    float fMin = Math.min(f8, f9);
                    Matrix matrix4 = this.f13035c;
                    matrix4.set(matrix3);
                    matrix4.postScale(f8, f9);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix3.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[c7], fArr[1]);
                    boolean z6 = c7;
                    i8 = i10;
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f10 = (fArr[z6 ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f10) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        Path path = this.f13033a;
                        path.reset();
                        d.a[] aVarArr = eVar.f13029a;
                        if (aVarArr != null) {
                            d.a.b(aVarArr, path);
                        }
                        Path path2 = this.f13034b;
                        path2.reset();
                        if (eVar instanceof a) {
                            path2.setFillType(eVar.f13031c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            b bVar = (b) eVar;
                            float f11 = bVar.f13013i;
                            if (f11 != 0.0f || bVar.f13014j != 1.0f) {
                                float f12 = bVar.f13015k;
                                float f13 = (f11 + f12) % 1.0f;
                                float f14 = (bVar.f13014j + f12) % 1.0f;
                                if (this.f13038f == null) {
                                    this.f13038f = new PathMeasure();
                                }
                                this.f13038f.setPath(path, z6);
                                float length = this.f13038f.getLength();
                                float f15 = f13 * length;
                                float f16 = f14 * length;
                                path.reset();
                                if (f15 > f16) {
                                    this.f13038f.getSegment(f15, length, path, true);
                                    f6 = 0.0f;
                                    this.f13038f.getSegment(0.0f, f16, path, true);
                                } else {
                                    f6 = 0.0f;
                                    this.f13038f.getSegment(f15, f16, path, true);
                                }
                                path.rLineTo(f6, f6);
                            }
                            path2.addPath(path, matrix4);
                            l0.d dVar2 = bVar.f13011f;
                            if (dVar2.f13780a == null && dVar2.f13782c == 0) {
                                f7 = 255.0f;
                                i9 = 16777215;
                            } else {
                                if (this.f13037e == null) {
                                    i9 = 16777215;
                                    Paint paint = new Paint(1);
                                    this.f13037e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i9 = 16777215;
                                }
                                Paint paint2 = this.f13037e;
                                Shader shader = dVar2.f13780a;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix4);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(bVar.h * 255.0f));
                                    f7 = 255.0f;
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i11 = dVar2.f13782c;
                                    float f17 = bVar.h;
                                    PorterDuff.Mode mode = g.B;
                                    f7 = 255.0f;
                                    paint2.setColor((i11 & i9) | (((int) (Color.alpha(i11) * f17)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(bVar.f13031c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            }
                            l0.d dVar3 = bVar.f13009d;
                            if (dVar3.f13780a != null || dVar3.f13782c != 0) {
                                if (this.f13036d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.f13036d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.f13036d;
                                Paint.Join join = bVar.f13017m;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = bVar.f13016l;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(bVar.f13018n);
                                Shader shader2 = dVar3.f13780a;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix4);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(bVar.f13012g * f7));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i12 = dVar3.f13782c;
                                    float f18 = bVar.f13012g;
                                    PorterDuff.Mode mode2 = g.B;
                                    paint4.setColor((i12 & i9) | (((int) (Color.alpha(i12) * f18)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(bVar.f13010e * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                    i10 = i8 + 1;
                    c7 = 0;
                }
                i8 = i10;
                i10 = i8 + 1;
                c7 = 0;
            }
            canvas.restore();
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f13043l;
        }

        public void setAlpha(float f6) {
            setRootAlpha((int) (f6 * 255.0f));
        }

        public void setRootAlpha(int i6) {
            this.f13043l = i6;
        }

        public f(f fVar) {
            this.f13035c = new Matrix();
            this.h = 0.0f;
            this.f13040i = 0.0f;
            this.f13041j = 0.0f;
            this.f13042k = 0.0f;
            this.f13043l = 255;
            this.f13044m = null;
            this.f13045n = null;
            w.a<String, Object> aVar = new w.a<>();
            this.f13046o = aVar;
            this.f13039g = new c(fVar.f13039g, aVar);
            this.f13033a = new Path(fVar.f13033a);
            this.f13034b = new Path(fVar.f13034b);
            this.h = fVar.h;
            this.f13040i = fVar.f13040i;
            this.f13041j = fVar.f13041j;
            this.f13042k = fVar.f13042k;
            this.f13043l = fVar.f13043l;
            this.f13044m = fVar.f13044m;
            String str = fVar.f13044m;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f13045n = fVar.f13045n;
        }
    }
}
