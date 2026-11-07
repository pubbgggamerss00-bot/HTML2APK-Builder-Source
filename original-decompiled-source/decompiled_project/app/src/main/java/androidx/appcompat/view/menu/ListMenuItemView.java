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
import com.basitce.htmltoapk.R;
import l.f;
import l.k;
import m.j0;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public f f602a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f603b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f604c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f605d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f606e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f607f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f608g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f609h;

    /* renamed from: j, reason: collision with root package name */
    public LinearLayout f610j;

    /* renamed from: k, reason: collision with root package name */
    public final Drawable f611k;

    /* renamed from: l, reason: collision with root package name */
    public final int f612l;

    /* renamed from: m, reason: collision with root package name */
    public final Context f613m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f614n;

    /* renamed from: p, reason: collision with root package name */
    public final Drawable f615p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f616q;

    /* renamed from: r, reason: collision with root package name */
    public LayoutInflater f617r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f618s;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    private LayoutInflater getInflater() {
        if (this.f617r == null) {
            this.f617r = LayoutInflater.from(getContext());
        }
        return this.f617r;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f608g;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f609h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f609h.getLayoutParams();
        rect.top = this.f609h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    @Override // l.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(f fVar) {
        boolean z10;
        int i10;
        String string;
        boolean z11;
        this.f602a = fVar;
        boolean zIsVisible = fVar.isVisible();
        a aVar = fVar.f16517p;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(fVar.f16508e);
        setCheckable(fVar.isCheckable());
        if (aVar.n()) {
            if ((aVar.m() ? fVar.f16513k : fVar.f16511h) != 0) {
                z10 = true;
            }
        } else {
            z10 = false;
        }
        aVar.m();
        if (z10) {
            f fVar2 = this.f602a;
            a aVar2 = fVar2.f16517p;
            if (aVar2.n()) {
                if ((aVar2.m() ? fVar2.f16513k : fVar2.f16511h) != 0) {
                    z11 = true;
                }
                if (z11) {
                }
            } else {
                z11 = false;
                i10 = z11 ? 0 : 8;
            }
        }
        if (i10 == 0) {
            TextView textView = this.f607f;
            f fVar3 = this.f602a;
            a aVar3 = fVar3.f16517p;
            Context context = aVar3.f620a;
            char c10 = aVar3.m() ? fVar3.f16513k : fVar3.f16511h;
            if (c10 == 0) {
                string = "";
            } else {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i11 = aVar3.m() ? fVar3.f16514l : fVar3.f16512j;
                f.a(sb, i11, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                f.a(sb, i11, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                f.a(sb, i11, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                f.a(sb, i11, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                f.a(sb, i11, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                f.a(sb, i11, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (c10 == '\b') {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c10 == '\n') {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c10 != ' ') {
                    sb.append(c10);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f607f.getVisibility() != i10) {
            this.f607f.setVisibility(i10);
        }
        setIcon(fVar.getIcon());
        setEnabled(fVar.isEnabled());
        setSubMenuArrowVisible(fVar.hasSubMenu());
        setContentDescription(fVar.f16520s);
    }

    @Override // l.k
    public f getItemData() {
        return this.f602a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f611k);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f605d = textView;
        int i10 = this.f612l;
        if (i10 != -1) {
            textView.setTextAppearance(this.f613m, i10);
        }
        this.f607f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f608g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f615p);
        }
        this.f609h = (ImageView) findViewById(R.id.group_divider);
        this.f610j = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f603b != null && this.f614n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f603b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f604c == null && this.f606e == null) {
            return;
        }
        if ((this.f602a.A & 4) != 0) {
            if (this.f604c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f604c = radioButton;
                LinearLayout linearLayout = this.f610j;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f604c;
            view = this.f606e;
        } else {
            if (this.f606e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f606e = checkBox;
                LinearLayout linearLayout2 = this.f610j;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f606e;
            view = this.f604c;
        }
        if (z10) {
            compoundButton.setChecked(this.f602a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f606e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f604c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if ((this.f602a.A & 4) != 0) {
            if (this.f604c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f604c = radioButton;
                LinearLayout linearLayout = this.f610j;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f604c;
        } else {
            if (this.f606e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f606e = checkBox;
                LinearLayout linearLayout2 = this.f610j;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f606e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f618s = z10;
        this.f614n = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f609h;
        if (imageView != null) {
            imageView.setVisibility((this.f616q || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        a aVar = this.f602a.f16517p;
        boolean z10 = this.f618s;
        if (z10 || this.f614n) {
            ImageView imageView = this.f603b;
            if (imageView == null && drawable == null && !this.f614n) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f603b = imageView2;
                LinearLayout linearLayout = this.f610j;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f614n) {
                this.f603b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f603b;
            if (!z10) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f603b.getVisibility() != 0) {
                this.f603b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f605d.getVisibility() != 8) {
                this.f605d.setVisibility(8);
            }
        } else {
            this.f605d.setText(charSequence);
            if (this.f605d.getVisibility() != 0) {
                this.f605d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        j0 j0VarD = j0.d(getContext(), attributeSet, g.a.f11253l, i10);
        this.f611k = j0VarD.b(5);
        TypedArray typedArray = j0VarD.f17144b;
        this.f612l = typedArray.getResourceId(1, -1);
        this.f614n = typedArray.getBoolean(7, false);
        this.f613m = context;
        this.f615p = j0VarD.b(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f616q = typedArrayObtainStyledAttributes.hasValue(0);
        j0VarD.e();
        typedArrayObtainStyledAttributes.recycle();
    }
}
