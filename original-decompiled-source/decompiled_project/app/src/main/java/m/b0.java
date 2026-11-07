package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.basitce.htmltoapk.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import m.e;
import p.c1;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: g, reason: collision with root package name */
    public static b0 f17098g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap<Context, c1<ColorStateList>> f17100a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap<Context, p.q<WeakReference<Drawable.ConstantState>>> f17101b = new WeakHashMap<>(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f17102c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17103d;

    /* renamed from: e, reason: collision with root package name */
    public e.a f17104e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f17097f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final a f17099h = new a(6);

    public static class a extends p.s<Integer, PorterDuffColorFilter> {
    }

    public static synchronized b0 b() {
        try {
            if (f17098g == null) {
                f17098g = new b0();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f17098g;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        a aVar = f17099h;
        aVar.getClass();
        int i11 = (31 + i10) * 31;
        porterDuffColorFilter = aVar.get(Integer.valueOf(mode.hashCode() + i11));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
            aVar.put(Integer.valueOf(mode.hashCode() + i11), porterDuffColorFilter);
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i10) throws Resources.NotFoundException {
        LayerDrawable layerDrawableC;
        WeakReference<Drawable.ConstantState> weakReferenceB;
        Drawable drawableNewDrawable;
        if (this.f17102c == null) {
            this.f17102c = new TypedValue();
        }
        TypedValue typedValue = this.f17102c;
        context.getResources().getValue(i10, typedValue, true);
        long j10 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            p.q<WeakReference<Drawable.ConstantState>> qVar = this.f17101b.get(context);
            layerDrawableC = null;
            if (qVar != null && (weakReferenceB = qVar.b(j10)) != null) {
                Drawable.ConstantState constantState = weakReferenceB.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    qVar.e(j10);
                }
            }
            drawableNewDrawable = null;
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        if (this.f17104e != null) {
            if (i10 == R.drawable.abc_cab_background_top_material) {
                layerDrawableC = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i10 == R.drawable.abc_ratingbar_material) {
                layerDrawableC = e.a.c(this, context, R.dimen.abc_star_big);
            } else if (i10 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableC = e.a.c(this, context, R.dimen.abc_star_medium);
            } else if (i10 == R.drawable.abc_ratingbar_small_material) {
                layerDrawableC = e.a.c(this, context, R.dimen.abc_star_small);
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
                    p.q<WeakReference<Drawable.ConstantState>> qVar2 = this.f17101b.get(context);
                    if (qVar2 == null) {
                        qVar2 = new p.q<>();
                        this.f17101b.put(context, qVar2);
                    }
                    qVar2.d(new WeakReference(constantState2), j10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return layerDrawableC;
    }

    public final synchronized Drawable c(Context context, int i10) {
        return d(context, i10);
    }

    public final synchronized Drawable d(Context context, int i10) {
        Drawable drawableA;
        try {
            if (!this.f17103d) {
                this.f17103d = true;
                Drawable drawableC = c(context, R.drawable.abc_vector_test);
                if (drawableC == null || (!(drawableC instanceof n6.b) && !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName()))) {
                    this.f17103d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableA = a(context, i10);
            if (drawableA == null) {
                drawableA = p3.b.getDrawable(context, i10);
            }
            if (drawableA != null) {
                drawableA = g(context, i10, drawableA);
            }
            if (drawableA != null) {
                u.a(drawableA);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return drawableA;
    }

    public final synchronized ColorStateList f(Context context, int i10) {
        ColorStateList colorStateListC;
        c1<ColorStateList> c1Var;
        WeakHashMap<Context, c1<ColorStateList>> weakHashMap = this.f17100a;
        ColorStateList colorStateListD = null;
        colorStateListC = (weakHashMap == null || (c1Var = weakHashMap.get(context)) == null) ? null : c1Var.c(i10);
        if (colorStateListC == null) {
            e.a aVar = this.f17104e;
            if (aVar != null) {
                colorStateListD = aVar.d(context, i10);
            }
            if (colorStateListD != null) {
                if (this.f17100a == null) {
                    this.f17100a = new WeakHashMap<>();
                }
                c1<ColorStateList> c1Var2 = this.f17100a.get(context);
                if (c1Var2 == null) {
                    c1Var2 = new c1<>();
                    this.f17100a.put(context, c1Var2);
                }
                c1Var2.a(i10, colorStateListD);
            }
            colorStateListC = colorStateListD;
        }
        return colorStateListC;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable g(Context context, int i10, Drawable drawable) {
        int iRound;
        PorterDuffColorFilter porterDuffColorFilterE;
        ColorStateList colorStateListF = f(context, i10);
        if (colorStateListF != null) {
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setTintList(colorStateListF);
            PorterDuff.Mode mode = null;
            if (this.f17104e != null && i10 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate.setTintMode(mode);
            }
            return drawableMutate;
        }
        e.a aVar = this.f17104e;
        int i11 = R.attr.colorControlNormal;
        if (aVar != null) {
            if (i10 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC = f0.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = e.f17118b;
                e.a.e(drawableFindDrawableByLayerId, iC, mode2);
                e.a.e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), f0.c(context, R.attr.colorControlNormal), mode2);
                e.a.e(layerDrawable.findDrawableByLayerId(android.R.id.progress), f0.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i10 == R.drawable.abc_ratingbar_material || i10 == R.drawable.abc_ratingbar_indicator_material || i10 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = f0.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = e.f17118b;
                e.a.e(drawableFindDrawableByLayerId2, iB, mode3);
                e.a.e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), f0.c(context, R.attr.colorControlActivated), mode3);
                e.a.e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), f0.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        e.a aVar2 = this.f17104e;
        if (aVar2 != null) {
            PorterDuff.Mode mode4 = e.f17118b;
            boolean z10 = true;
            if (e.a.a(aVar2.f17121a, i10)) {
                iRound = -1;
                if (z10) {
                }
            } else {
                if (e.a.a(aVar2.f17123c, i10)) {
                    i11 = R.attr.colorControlActivated;
                } else {
                    boolean zA = e.a.a(aVar2.f17124d, i10);
                    i11 = android.R.attr.colorBackground;
                    if (zA) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i10 == R.drawable.abc_list_divider_mtrl_alpha) {
                        iRound = Math.round(40.8f);
                        i11 = android.R.attr.colorForeground;
                        if (z10) {
                            Drawable drawableMutate2 = drawable.mutate();
                            int iC2 = f0.c(context, i11);
                            synchronized (e.class) {
                                porterDuffColorFilterE = e(iC2, mode4);
                            }
                            drawableMutate2.setColorFilter(porterDuffColorFilterE);
                            if (iRound != -1) {
                                drawableMutate2.setAlpha(iRound);
                            }
                        }
                    } else if (i10 != R.drawable.abc_dialog_material_background) {
                        i11 = 0;
                        z10 = false;
                    }
                }
                iRound = -1;
                if (z10) {
                }
            }
        }
        return drawable;
    }
}
