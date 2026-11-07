package y4;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.htmltoapk.template.R;
import l.b1;
import l.c0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class s extends LinearLayout {
    public View.OnLongClickListener A;
    public boolean B;
    public final TextInputLayout s;

    /* renamed from: t, reason: collision with root package name */
    public final c0 f15312t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f15313u;

    /* renamed from: v, reason: collision with root package name */
    public final CheckableImageButton f15314v;

    /* renamed from: w, reason: collision with root package name */
    public ColorStateList f15315w;

    /* renamed from: x, reason: collision with root package name */
    public PorterDuff.Mode f15316x;

    /* renamed from: y, reason: collision with root package name */
    public int f15317y;

    /* renamed from: z, reason: collision with root package name */
    public ImageView.ScaleType f15318z;

    public s(TextInputLayout textInputLayout, b1 b1Var) {
        super(textInputLayout.getContext());
        this.s = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f15314v = checkableImageButton;
        c0 c0Var = new c0(getContext(), null);
        this.f15312t = c0Var;
        if (q4.c.d(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.A;
        checkableImageButton.setOnClickListener(null);
        m.d(checkableImageButton, onLongClickListener);
        this.A = null;
        checkableImageButton.setOnLongClickListener(null);
        m.d(checkableImageButton, null);
        TypedArray typedArray = b1Var.f13583b;
        if (typedArray.hasValue(70)) {
            this.f15315w = q4.c.b(getContext(), b1Var, 70);
        }
        if (typedArray.hasValue(71)) {
            this.f15316x = n4.n.a(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            c(b1Var.b(67));
            if (typedArray.hasValue(66)) {
                b(typedArray.getText(66));
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f15317y) {
            this.f15317y = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType scaleTypeB = m.b(typedArray.getInt(69, -1));
            this.f15318z = scaleTypeB;
            checkableImageButton.setScaleType(scaleTypeB);
        }
        c0Var.setVisibility(8);
        c0Var.setId(R.id.textinput_prefix_text);
        c0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        c0Var.setAccessibilityLiveRegion(1);
        c0Var.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            c0Var.setTextColor(b1Var.a(62));
        }
        CharSequence text = typedArray.getText(60);
        this.f15313u = TextUtils.isEmpty(text) ? null : text;
        c0Var.setText(text);
        f();
        addView(checkableImageButton);
        addView(c0Var);
        checkableImageButton.setOnFocusableChangedListener(new androidx.camera.core.impl.utils.futures.b(3, this));
    }

    public final int a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f15314v;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        return this.f15312t.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void b(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f15314v;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            m.e(checkableImageButton, this.A, charSequence);
        }
    }

    public final void c(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f15314v;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f15315w;
            PorterDuff.Mode mode = this.f15316x;
            TextInputLayout textInputLayout = this.s;
            m.a(textInputLayout, checkableImageButton, colorStateList, mode);
            d(true);
            m.c(textInputLayout, checkableImageButton, this.f15315w);
            return;
        }
        d(false);
        View.OnLongClickListener onLongClickListener = this.A;
        checkableImageButton.setOnClickListener(null);
        m.d(checkableImageButton, onLongClickListener);
        this.A = null;
        checkableImageButton.setOnLongClickListener(null);
        m.d(checkableImageButton, null);
        b(null);
    }

    public final void d(boolean z6) {
        EditText editText;
        CheckableImageButton checkableImageButton = this.f15314v;
        if ((checkableImageButton.getVisibility() == 0) != z6) {
            if (!z6 && checkableImageButton.hasFocus() && (editText = this.s.getEditText()) != null) {
                editText.requestFocus();
            }
            checkableImageButton.setVisibility(z6 ? 0 : 8);
            e();
            f();
        }
    }

    public final void e() {
        EditText editText = this.s.f12475w;
        if (editText == null) {
            return;
        }
        this.f15312t.setPaddingRelative(this.f15314v.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void f() {
        int i6 = (this.f15313u == null || this.B) ? 8 : 0;
        setVisibility((this.f15314v.getVisibility() == 0 || i6 == 0) ? 0 : 8);
        this.f15312t.setVisibility(i6);
        this.s.s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        e();
    }
}
