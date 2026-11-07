package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import com.htmltoapk.template.R;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f13672b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static j f13673c;

    /* renamed from: a, reason: collision with root package name */
    public s0 f13674a;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f13675a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b, reason: collision with root package name */
        public final int[] f13676b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c, reason: collision with root package name */
        public final int[] f13677c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};

        /* renamed from: d, reason: collision with root package name */
        public final int[] f13678d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e, reason: collision with root package name */
        public final int[] f13679e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

        /* renamed from: f, reason: collision with root package name */
        public final int[] f13680f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public static boolean a(int[] iArr, int i6) {
            for (int i7 : iArr) {
                if (i7 == i6) {
                    return true;
                }
            }
            return false;
        }

        public static ColorStateList b(Context context, int i6) {
            int iC = w0.c(context, R.attr.colorControlHighlight);
            int iB = w0.b(context, R.attr.colorButtonNormal);
            int[] iArr = w0.f13744b;
            int[] iArr2 = w0.f13746d;
            int iC2 = m0.a.c(iC, i6);
            return new ColorStateList(new int[][]{iArr, iArr2, w0.f13745c, w0.f13748f}, new int[]{iB, iC2, m0.a.c(iC, i6), i6});
        }

        public static LayerDrawable c(s0 s0Var, Context context, int i6) throws Resources.NotFoundException {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i6);
            Drawable drawableC = s0Var.c(context, R.drawable.abc_star_black_48dp);
            Drawable drawableC2 = s0Var.c(context, R.drawable.abc_star_half_black_48dp);
            if ((drawableC instanceof BitmapDrawable) && drawableC.getIntrinsicWidth() == dimensionPixelSize && drawableC.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableC;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableC.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableC.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableC2 instanceof BitmapDrawable) && drawableC2.getIntrinsicWidth() == dimensionPixelSize && drawableC2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableC2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableC2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableC2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, android.R.id.background);
            layerDrawable.setId(1, android.R.id.secondaryProgress);
            layerDrawable.setId(2, android.R.id.progress);
            return layerDrawable;
        }

        public static void e(Drawable drawable, int i6, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = j.f13672b;
            }
            drawableMutate.setColorFilter(j.c(i6, mode));
        }

        public final ColorStateList d(Context context, int i6) {
            if (i6 == R.drawable.abc_edit_text_material) {
                return k0.a.b(context, R.color.abc_tint_edittext);
            }
            if (i6 == R.drawable.abc_switch_track_mtrl_alpha) {
                return k0.a.b(context, R.color.abc_tint_switch_track);
            }
            if (i6 != R.drawable.abc_switch_thumb_material) {
                if (i6 == R.drawable.abc_btn_default_mtrl_shape) {
                    return b(context, w0.c(context, R.attr.colorButtonNormal));
                }
                if (i6 == R.drawable.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i6 == R.drawable.abc_btn_colored_material) {
                    return b(context, w0.c(context, R.attr.colorAccent));
                }
                if (i6 == R.drawable.abc_spinner_mtrl_am_alpha || i6 == R.drawable.abc_spinner_textfield_background_material) {
                    return k0.a.b(context, R.color.abc_tint_spinner);
                }
                if (a(this.f13676b, i6)) {
                    return w0.d(context, R.attr.colorControlNormal);
                }
                if (a(this.f13679e, i6)) {
                    return k0.a.b(context, R.color.abc_tint_default);
                }
                if (a(this.f13680f, i6)) {
                    return k0.a.b(context, R.color.abc_tint_btn_checkable);
                }
                if (i6 == R.drawable.abc_seekbar_thumb_material) {
                    return k0.a.b(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListD = w0.d(context, R.attr.colorSwitchThumbNormal);
            if (colorStateListD == null || !colorStateListD.isStateful()) {
                iArr[0] = w0.f13744b;
                iArr2[0] = w0.b(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = w0.f13747e;
                iArr2[1] = w0.c(context, R.attr.colorControlActivated);
                iArr[2] = w0.f13748f;
                iArr2[2] = w0.c(context, R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = w0.f13744b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
                iArr[1] = w0.f13747e;
                iArr2[1] = w0.c(context, R.attr.colorControlActivated);
                iArr[2] = w0.f13748f;
                iArr2[2] = colorStateListD.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
    }

    public static synchronized j a() {
        try {
            if (f13673c == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f13673c;
    }

    public static synchronized PorterDuffColorFilter c(int i6, PorterDuff.Mode mode) {
        return s0.e(i6, mode);
    }

    public static synchronized void d() {
        if (f13673c == null) {
            j jVar = new j();
            f13673c = jVar;
            jVar.f13674a = s0.b();
            s0 s0Var = f13673c.f13674a;
            a aVar = new a();
            synchronized (s0Var) {
                s0Var.f13730e = aVar;
            }
        }
    }

    public static void e(Drawable drawable, z0 z0Var, int[] iArr) {
        PorterDuff.Mode mode = s0.f13724f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z6 = z0Var.f13768d;
        if (!z6 && !z0Var.f13767c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterE = null;
        ColorStateList colorStateList = z6 ? z0Var.f13765a : null;
        PorterDuff.Mode mode2 = z0Var.f13767c ? z0Var.f13766b : s0.f13724f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterE = s0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterE);
    }

    public final synchronized Drawable b(Context context, int i6) {
        return this.f13674a.c(context, i6);
    }
}
