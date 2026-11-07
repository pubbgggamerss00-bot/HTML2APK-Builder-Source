package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import com.basitce.htmltoapk.R;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f17118b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static e f17119c;

    /* renamed from: a, reason: collision with root package name */
    public b0 f17120a;

    public class a {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f17121a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b, reason: collision with root package name */
        public final int[] f17122b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c, reason: collision with root package name */
        public final int[] f17123c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};

        /* renamed from: d, reason: collision with root package name */
        public final int[] f17124d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e, reason: collision with root package name */
        public final int[] f17125e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

        /* renamed from: f, reason: collision with root package name */
        public final int[] f17126f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public static boolean a(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        public static ColorStateList b(Context context, int i10) {
            int iC = f0.c(context, R.attr.colorControlHighlight);
            int iB = f0.b(context, R.attr.colorButtonNormal);
            int[] iArr = f0.f17128b;
            int[] iArr2 = f0.f17130d;
            int iB2 = r3.a.b(iC, i10);
            return new ColorStateList(new int[][]{iArr, iArr2, f0.f17129c, f0.f17132f}, new int[]{iB, iB2, r3.a.b(iC, i10), i10});
        }

        public static LayerDrawable c(b0 b0Var, Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable drawableC = b0Var.c(context, R.drawable.abc_star_black_48dp);
            Drawable drawableC2 = b0Var.c(context, R.drawable.abc_star_half_black_48dp);
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

        public static void e(Drawable drawable, int i10, PorterDuff.Mode mode) {
            PorterDuffColorFilter porterDuffColorFilterE;
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = e.f17118b;
            }
            PorterDuff.Mode mode2 = e.f17118b;
            synchronized (e.class) {
                porterDuffColorFilterE = b0.e(i10, mode);
            }
            drawableMutate.setColorFilter(porterDuffColorFilterE);
        }

        public final ColorStateList d(Context context, int i10) {
            if (i10 == R.drawable.abc_edit_text_material) {
                return p3.b.getColorStateList(context, R.color.abc_tint_edittext);
            }
            if (i10 == R.drawable.abc_switch_track_mtrl_alpha) {
                return p3.b.getColorStateList(context, R.color.abc_tint_switch_track);
            }
            if (i10 != R.drawable.abc_switch_thumb_material) {
                if (i10 == R.drawable.abc_btn_default_mtrl_shape) {
                    return b(context, f0.c(context, R.attr.colorButtonNormal));
                }
                if (i10 == R.drawable.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i10 == R.drawable.abc_btn_colored_material) {
                    return b(context, f0.c(context, R.attr.colorAccent));
                }
                if (i10 == R.drawable.abc_spinner_mtrl_am_alpha || i10 == R.drawable.abc_spinner_textfield_background_material) {
                    return p3.b.getColorStateList(context, R.color.abc_tint_spinner);
                }
                if (a(this.f17122b, i10)) {
                    return f0.d(context, R.attr.colorControlNormal);
                }
                if (a(this.f17125e, i10)) {
                    return p3.b.getColorStateList(context, R.color.abc_tint_default);
                }
                if (a(this.f17126f, i10)) {
                    return p3.b.getColorStateList(context, R.color.abc_tint_btn_checkable);
                }
                if (i10 == R.drawable.abc_seekbar_thumb_material) {
                    return p3.b.getColorStateList(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListD = f0.d(context, R.attr.colorSwitchThumbNormal);
            if (colorStateListD == null || !colorStateListD.isStateful()) {
                iArr[0] = f0.f17128b;
                iArr2[0] = f0.b(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = f0.f17131e;
                iArr2[1] = f0.c(context, R.attr.colorControlActivated);
                iArr[2] = f0.f17132f;
                iArr2[2] = f0.c(context, R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = f0.f17128b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
                iArr[1] = f0.f17131e;
                iArr2[1] = f0.c(context, R.attr.colorControlActivated);
                iArr[2] = f0.f17132f;
                iArr2[2] = colorStateListD.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
    }

    public static synchronized void b() {
        if (f17119c == null) {
            e eVar = new e();
            f17119c = eVar;
            eVar.f17120a = b0.b();
            b0 b0Var = f17119c.f17120a;
            a aVar = new a();
            synchronized (b0Var) {
                b0Var.f17104e = aVar;
            }
        }
    }

    public static void c(Drawable drawable, h0 h0Var, int[] iArr) {
        PorterDuff.Mode mode = b0.f17097f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = h0Var.f17141d;
        if (!z10 && !h0Var.f17140c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterE = null;
        ColorStateList colorStateList = z10 ? h0Var.f17138a : null;
        PorterDuff.Mode mode2 = h0Var.f17140c ? h0Var.f17139b : b0.f17097f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterE = b0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterE);
    }

    public final synchronized Drawable a(Context context, int i10) {
        return this.f17120a.c(context, i10);
    }
}
