package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import com.google.android.gms.ads.RequestConfiguration;
import com.htmltoapk.template.R;
import l.b1;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {
    public LinearLayout A;
    public final Drawable B;
    public final int C;
    public final Context D;
    public boolean E;
    public final Drawable F;
    public final boolean G;
    public LayoutInflater H;
    public boolean I;
    public h s;

    /* renamed from: t, reason: collision with root package name */
    public ImageView f131t;

    /* renamed from: u, reason: collision with root package name */
    public RadioButton f132u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f133v;

    /* renamed from: w, reason: collision with root package name */
    public CheckBox f134w;

    /* renamed from: x, reason: collision with root package name */
    public TextView f135x;

    /* renamed from: y, reason: collision with root package name */
    public ImageView f136y;

    /* renamed from: z, reason: collision with root package name */
    public ImageView f137z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b1 b1VarE = b1.e(R.attr.listMenuViewStyle, 0, getContext(), attributeSet, f.a.f12950r);
        this.B = b1VarE.b(5);
        TypedArray typedArray = b1VarE.f13583b;
        this.C = typedArray.getResourceId(1, -1);
        this.E = typedArray.getBoolean(7, false);
        this.D = context;
        this.F = b1VarE.b(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.G = typedArrayObtainStyledAttributes.hasValue(0);
        b1VarE.f();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.H == null) {
            this.H = LayoutInflater.from(getContext());
        }
        return this.H;
    }

    private void setSubMenuArrowVisible(boolean z6) {
        ImageView imageView = this.f136y;
        if (imageView != null) {
            imageView.setVisibility(z6 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f137z;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f137z.getLayoutParams();
        rect.top = this.f137z.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    @Override // androidx.appcompat.view.menu.k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(h hVar) {
        boolean z6;
        int i6;
        String string;
        boolean z7;
        this.s = hVar;
        boolean zIsVisible = hVar.isVisible();
        f fVar = hVar.f206n;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(hVar.f198e);
        setCheckable(hVar.isCheckable());
        if (fVar.o()) {
            if ((fVar.n() ? hVar.f202j : hVar.h) != 0) {
                z6 = true;
            }
        } else {
            z6 = false;
        }
        fVar.n();
        if (z6) {
            h hVar2 = this.s;
            f fVar2 = hVar2.f206n;
            if (fVar2.o()) {
                if ((fVar2.n() ? hVar2.f202j : hVar2.h) != 0) {
                    z7 = true;
                }
                if (z7) {
                }
            } else {
                z7 = false;
                i6 = z7 ? 0 : 8;
            }
        }
        if (i6 == 0) {
            TextView textView = this.f135x;
            h hVar3 = this.s;
            f fVar3 = hVar3.f206n;
            Context context = fVar3.f170a;
            char c7 = fVar3.n() ? hVar3.f202j : hVar3.h;
            if (c7 == 0) {
                string = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            } else {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i7 = fVar3.n() ? hVar3.f203k : hVar3.f201i;
                h.c(i7, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb);
                h.c(i7, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb);
                h.c(i7, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb);
                h.c(i7, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb);
                h.c(i7, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb);
                h.c(i7, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb);
                if (c7 == '\b') {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c7 == '\n') {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c7 != ' ') {
                    sb.append(c7);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f135x.getVisibility() != i6) {
            this.f135x.setVisibility(i6);
        }
        setIcon(hVar.getIcon());
        setEnabled(hVar.isEnabled());
        setSubMenuArrowVisible(hVar.hasSubMenu());
        setContentDescription(hVar.f209q);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.s;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.B);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f133v = textView;
        int i6 = this.C;
        if (i6 != -1) {
            textView.setTextAppearance(this.D, i6);
        }
        this.f135x = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f136y = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.F);
        }
        this.f137z = (ImageView) findViewById(R.id.group_divider);
        this.A = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i6, int i7) {
        if (this.f131t != null && this.E) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f131t.getLayoutParams();
            int i8 = layoutParams.height;
            if (i8 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i8;
            }
        }
        super.onMeasure(i6, i7);
    }

    public void setCheckable(boolean z6) {
        CompoundButton compoundButton;
        View view;
        if (!z6 && this.f132u == null && this.f134w == null) {
            return;
        }
        if ((this.s.f215x & 4) != 0) {
            if (this.f132u == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f132u = radioButton;
                LinearLayout linearLayout = this.A;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f132u;
            view = this.f134w;
        } else {
            if (this.f134w == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f134w = checkBox;
                LinearLayout linearLayout2 = this.A;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f134w;
            view = this.f132u;
        }
        if (z6) {
            compoundButton.setChecked(this.s.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f134w;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f132u;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z6) {
        CompoundButton compoundButton;
        if ((this.s.f215x & 4) != 0) {
            if (this.f132u == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f132u = radioButton;
                LinearLayout linearLayout = this.A;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f132u;
        } else {
            if (this.f134w == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f134w = checkBox;
                LinearLayout linearLayout2 = this.A;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f134w;
        }
        compoundButton.setChecked(z6);
    }

    public void setForceShowIcon(boolean z6) {
        this.I = z6;
        this.E = z6;
    }

    public void setGroupDividerEnabled(boolean z6) {
        ImageView imageView = this.f137z;
        if (imageView != null) {
            imageView.setVisibility((this.G || !z6) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        f fVar = this.s.f206n;
        boolean z6 = this.I;
        if (z6 || this.E) {
            ImageView imageView = this.f131t;
            if (imageView == null && drawable == null && !this.E) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f131t = imageView2;
                LinearLayout linearLayout = this.A;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.E) {
                this.f131t.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f131t;
            if (!z6) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f131t.getVisibility() != 0) {
                this.f131t.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f133v.getVisibility() != 8) {
                this.f133v.setVisibility(8);
            }
        } else {
            this.f133v.setText(charSequence);
            if (this.f133v.getVisibility() != 0) {
                this.f133v.setVisibility(0);
            }
        }
    }
}
