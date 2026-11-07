package c4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.focus.FocusRingDrawable;
import com.htmltoapk.template.R;
import d1.f;
import java.lang.ref.WeakReference;
import u4.g;
import u4.j;
import u4.o;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f2195a;

    /* renamed from: b, reason: collision with root package name */
    public j f2196b;

    /* renamed from: c, reason: collision with root package name */
    public f f2197c;

    /* renamed from: d, reason: collision with root package name */
    public g.d f2198d;

    /* renamed from: e, reason: collision with root package name */
    public int f2199e;

    /* renamed from: f, reason: collision with root package name */
    public int f2200f;

    /* renamed from: g, reason: collision with root package name */
    public int f2201g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f2202i;

    /* renamed from: j, reason: collision with root package name */
    public int f2203j;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f2204k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f2205l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f2206m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f2207n;

    /* renamed from: o, reason: collision with root package name */
    public g f2208o;
    public boolean s;

    /* renamed from: u, reason: collision with root package name */
    public RippleDrawable f2213u;

    /* renamed from: v, reason: collision with root package name */
    public int f2214v;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2209p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2210q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2211r = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2212t = true;

    public e(MaterialButton materialButton, j jVar) {
        this.f2195a = materialButton;
        this.f2196b = jVar;
    }

    public final g a(boolean z6) {
        RippleDrawable rippleDrawable = this.f2213u;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.f2213u.getDrawable(0)).getDrawable()).getDrawable(!z6 ? 1 : 0);
    }

    public final void b(int i6, int i7, int i8, int i9) {
        MaterialButton materialButton = this.f2195a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i10 = this.f2199e;
        int i11 = this.f2201g;
        int i12 = this.f2200f;
        int i13 = this.h;
        this.f2199e = i6;
        this.f2201g = i7;
        this.f2200f = i8;
        this.h = i9;
        if (!this.f2210q) {
            c();
        }
        materialButton.setPaddingRelative((paddingStart + i6) - i10, (paddingTop + i7) - i11, (paddingEnd + i8) - i12, (paddingBottom + i9) - i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        g gVar = new g(this.f2196b);
        f fVar = this.f2197c;
        if (fVar != null) {
            gVar.p(fVar);
        }
        g.d dVar = this.f2198d;
        if (dVar != null) {
            gVar.W = dVar;
        }
        MaterialButton materialButton = this.f2195a;
        Context context = materialButton.getContext();
        gVar.n(context);
        gVar.setTintList(this.f2205l);
        PorterDuff.Mode mode = this.f2204k;
        if (mode != null) {
            gVar.setTintMode(mode);
        }
        float f6 = this.f2203j;
        ColorStateList colorStateList = this.f2206m;
        gVar.f14610t.f14627j = f6;
        gVar.invalidateSelf();
        g.c cVar = gVar.f14610t;
        if (cVar.f14622d != colorStateList) {
            cVar.f14622d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.f2196b);
        f fVar2 = this.f2197c;
        if (fVar2 != null) {
            gVar2.p(fVar2);
        }
        int i6 = 0;
        gVar2.setTint(0);
        float f7 = this.f2203j;
        int iJ = this.f2209p ? androidx.work.j.j(materialButton.getContext(), q4.b.d(materialButton, R.attr.colorSurface)) : 0;
        gVar2.f14610t.f14627j = f7;
        gVar2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iJ);
        g.c cVar2 = gVar2.f14610t;
        if (cVar2.f14622d != colorStateListValueOf) {
            cVar2.f14622d = colorStateListValueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        g gVar3 = new g(this.f2196b);
        this.f2208o = gVar3;
        f fVar3 = this.f2197c;
        if (fVar3 != null) {
            gVar3.p(fVar3);
        }
        this.f2208o.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(r4.a.a(this.f2207n), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f2199e, this.f2201g, this.f2200f, this.h), this.f2208o);
        this.f2213u = rippleDrawable;
        FocusRingDrawable focusRingDrawable = null;
        FocusRingDrawable.e(context, rippleDrawable, null);
        materialButton.setInternalBackground(this.f2213u);
        g gVarA = a(false);
        if (gVarA != null) {
            gVarA.q(this.f2214v);
            gVarA.setState(materialButton.getDrawableState());
        }
        Drawable background = materialButton.getBackground();
        if (background instanceof FocusRingDrawable) {
            focusRingDrawable = (FocusRingDrawable) background;
        } else if (background instanceof DrawableWrapper) {
            Drawable drawable = ((DrawableWrapper) background).getDrawable();
            if (drawable instanceof FocusRingDrawable) {
                focusRingDrawable = (FocusRingDrawable) drawable;
            } else if (background instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) background;
                while (true) {
                    if (i6 >= layerDrawable.getNumberOfLayers()) {
                        break;
                    }
                    Drawable drawable2 = layerDrawable.getDrawable(i6);
                    if (drawable2 instanceof FocusRingDrawable) {
                        focusRingDrawable = (FocusRingDrawable) drawable2;
                        break;
                    }
                    i6++;
                }
            }
        }
        if (focusRingDrawable != null) {
            focusRingDrawable.f12364z = new WeakReference<>(gVarA);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        o oVar;
        g gVarA = a(false);
        if (gVarA != null) {
            gVarA.s(this.f2196b);
            f fVar = this.f2197c;
            if (fVar != null) {
                gVarA.p(fVar);
            }
        }
        g gVarA2 = a(true);
        if (gVarA2 != null) {
            gVarA2.s(this.f2196b);
            f fVar2 = this.f2197c;
            if (fVar2 != null) {
                gVarA2.p(fVar2);
            }
        }
        RippleDrawable rippleDrawable = this.f2213u;
        if (rippleDrawable != null) {
            Object objFindDrawableByLayerId = rippleDrawable.findDrawableByLayerId(android.R.id.mask);
            oVar = objFindDrawableByLayerId instanceof o ? (o) objFindDrawableByLayerId : null;
        }
        if (oVar != null) {
            if (!(oVar instanceof g)) {
                oVar.setShapeAppearanceModel(this.f2196b.c());
                return;
            }
            g gVar = (g) oVar;
            gVar.s(this.f2196b);
            f fVar3 = this.f2197c;
            if (fVar3 != null) {
                gVar.p(fVar3);
            }
        }
    }

    public final void e() {
        int iJ = 0;
        g gVarA = a(false);
        g gVarA2 = a(true);
        if (gVarA != null) {
            float f6 = this.f2203j;
            ColorStateList colorStateList = this.f2206m;
            gVarA.f14610t.f14627j = f6;
            gVarA.invalidateSelf();
            g.c cVar = gVarA.f14610t;
            if (cVar.f14622d != colorStateList) {
                cVar.f14622d = colorStateList;
                gVarA.onStateChange(gVarA.getState());
            }
            if (gVarA2 != null) {
                float f7 = this.f2203j;
                if (this.f2209p) {
                    MaterialButton materialButton = this.f2195a;
                    iJ = androidx.work.j.j(materialButton.getContext(), q4.b.d(materialButton, R.attr.colorSurface));
                }
                gVarA2.f14610t.f14627j = f7;
                gVarA2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iJ);
                g.c cVar2 = gVarA2.f14610t;
                if (cVar2.f14622d != colorStateListValueOf) {
                    cVar2.f14622d = colorStateListValueOf;
                    gVarA2.onStateChange(gVarA2.getState());
                }
            }
        }
    }
}
