package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.htmltoapk.template.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import l.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: g, reason: collision with root package name */
    public static s0 f13725g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap<Context, w.h<ColorStateList>> f13726a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap<Context, w.d<WeakReference<Drawable.ConstantState>>> f13727b = new WeakHashMap<>(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f13728c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13729d;

    /* renamed from: e, reason: collision with root package name */
    public j.a f13730e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f13724f = PorterDuff.Mode.SRC_IN;
    public static final a h = new a(6);

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a extends w.f<Integer, PorterDuffColorFilter> {
    }

    public static synchronized s0 b() {
        try {
            if (f13725g == null) {
                f13725g = new s0();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f13725g;
    }

    public static synchronized PorterDuffColorFilter e(int i6, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterA;
        a aVar = h;
        aVar.getClass();
        int i7 = (31 + i6) * 31;
        porterDuffColorFilterA = aVar.a(Integer.valueOf(mode.hashCode() + i7));
        if (porterDuffColorFilterA == null) {
            porterDuffColorFilterA = new PorterDuffColorFilter(i6, mode);
            aVar.b(Integer.valueOf(mode.hashCode() + i7), porterDuffColorFilterA);
        }
        return porterDuffColorFilterA;
    }

    public final Drawable a(Context context, int i6) throws Resources.NotFoundException {
        Drawable drawableNewDrawable;
        WeakReference<Drawable.ConstantState> weakReferenceB;
        if (this.f13728c == null) {
            this.f13728c = new TypedValue();
        }
        TypedValue typedValue = this.f13728c;
        context.getResources().getValue(i6, typedValue, true);
        long j6 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            w.d<WeakReference<Drawable.ConstantState>> dVar = this.f13727b.get(context);
            drawableNewDrawable = null;
            if (dVar != null && (weakReferenceB = dVar.b(j6)) != null) {
                Drawable.ConstantState constantState = weakReferenceB.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    int iB = x.a.b(dVar.f14839t, dVar.f14841v, j6);
                    if (iB >= 0) {
                        Object[] objArr = dVar.f14840u;
                        Object obj = objArr[iB];
                        Object obj2 = w.e.f14842a;
                        if (obj != obj2) {
                            objArr[iB] = obj2;
                            dVar.s = true;
                        }
                    }
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableC = null;
        if (this.f13730e != null) {
            if (i6 == R.drawable.abc_cab_background_top_material) {
                layerDrawableC = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i6 == R.drawable.abc_ratingbar_material) {
                layerDrawableC = j.a.c(this, context, R.dimen.abc_star_big);
            } else if (i6 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableC = j.a.c(this, context, R.dimen.abc_star_medium);
            } else if (i6 == R.drawable.abc_ratingbar_small_material) {
                layerDrawableC = j.a.c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableC == null) {
            return layerDrawableC;
        }
        layerDrawableC.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableC.getConstantState();
                if (constantState2 != null) {
                    w.d<WeakReference<Drawable.ConstantState>> dVar2 = this.f13727b.get(context);
                    if (dVar2 == null) {
                        dVar2 = new w.d<>();
                        this.f13727b.put(context, dVar2);
                    }
                    dVar2.d(j6, new WeakReference<>(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawableC;
    }

    public final synchronized Drawable c(Context context, int i6) {
        return d(context, i6, false);
    }

    public final synchronized Drawable d(Context context, int i6, boolean z6) {
        Drawable drawableA;
        try {
            if (!this.f13729d) {
                this.f13729d = true;
                Drawable drawableC = c(context, R.drawable.abc_vector_test);
                if (drawableC == null || (!(drawableC instanceof f2.g) && !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName()))) {
                    this.f13729d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableA = a(context, i6);
            if (drawableA == null) {
                drawableA = context.getDrawable(i6);
            }
            if (drawableA != null) {
                drawableA = g(context, i6, z6, drawableA);
            }
            if (drawableA != null) {
                h0.a(drawableA);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableA;
    }

    public final synchronized ColorStateList f(Context context, int i6) {
        ColorStateList colorStateListB;
        w.h<ColorStateList> hVar;
        WeakHashMap<Context, w.h<ColorStateList>> weakHashMap = this.f13726a;
        ColorStateList colorStateListD = null;
        colorStateListB = (weakHashMap == null || (hVar = weakHashMap.get(context)) == null) ? null : hVar.b(i6);
        if (colorStateListB == null) {
            j.a aVar = this.f13730e;
            if (aVar != null) {
                colorStateListD = aVar.d(context, i6);
            }
            if (colorStateListD != null) {
                if (this.f13726a == null) {
                    this.f13726a = new WeakHashMap<>();
                }
                w.h<ColorStateList> hVar2 = this.f13726a.get(context);
                if (hVar2 == null) {
                    hVar2 = new w.h<>();
                    this.f13726a.put(context, hVar2);
                }
                hVar2.a(i6, colorStateListD);
            }
            colorStateListB = colorStateListD;
        }
        return colorStateListB;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable g(Context context, int i6, boolean z6, Drawable drawable) {
        int i7;
        boolean z7;
        int iRound;
        ColorStateList colorStateListF = f(context, i6);
        PorterDuff.Mode mode = null;
        if (colorStateListF != null) {
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setTintList(colorStateListF);
            if (this.f13730e != null && i6 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate.setTintMode(mode);
            }
            return drawableMutate;
        }
        if (this.f13730e != null) {
            if (i6 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC = w0.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = j.f13672b;
                j.a.e(drawableFindDrawableByLayerId, iC, mode2);
                j.a.e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), w0.c(context, R.attr.colorControlNormal), mode2);
                j.a.e(layerDrawable.findDrawableByLayerId(android.R.id.progress), w0.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i6 == R.drawable.abc_ratingbar_material || i6 == R.drawable.abc_ratingbar_indicator_material || i6 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = w0.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = j.f13672b;
                j.a.e(drawableFindDrawableByLayerId2, iB, mode3);
                j.a.e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), w0.c(context, R.attr.colorControlActivated), mode3);
                j.a.e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), w0.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        j.a aVar = this.f13730e;
        boolean z8 = false;
        if (aVar != null) {
            PorterDuff.Mode mode4 = j.f13672b;
            if (j.a.a(aVar.f13675a, i6)) {
                i7 = R.attr.colorControlNormal;
            } else if (j.a.a(aVar.f13677c, i6)) {
                i7 = R.attr.colorControlActivated;
            } else {
                if (j.a.a(aVar.f13678d, i6)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i6 == R.drawable.abc_list_divider_mtrl_alpha) {
                    iRound = Math.round(40.8f);
                    i7 = 16842800;
                    z7 = true;
                    if (z7) {
                        Drawable drawableMutate2 = drawable.mutate();
                        drawableMutate2.setColorFilter(j.c(w0.c(context, i7), mode4));
                        if (iRound != -1) {
                            drawableMutate2.setAlpha(iRound);
                        }
                        z8 = true;
                    }
                } else if (i6 != R.drawable.abc_dialog_material_background) {
                    i7 = 0;
                    z7 = false;
                    iRound = -1;
                    if (z7) {
                    }
                }
                i7 = 16842801;
            }
            z7 = true;
            iRound = -1;
            if (z7) {
            }
        }
        if (z8 || !z6) {
            return drawable;
        }
        return null;
    }
}
