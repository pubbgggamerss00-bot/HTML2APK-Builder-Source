package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.camera.camera2.interop.f;
import androidx.camera.camera2.interop.g;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.htmltoapk.template.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l.b1;
import l.c0;
import n4.i;
import n4.n;
import y4.k;
import y4.l;
import y4.m;
import y4.q;
import y4.r;
import y5.b0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class a extends LinearLayout {
    public int A;
    public final LinkedHashSet<TextInputLayout.h> B;
    public ColorStateList C;
    public PorterDuff.Mode D;
    public int E;
    public ImageView.ScaleType F;
    public View.OnLongClickListener G;
    public CharSequence H;
    public final c0 I;
    public boolean J;
    public EditText K;
    public final AccessibilityManager L;
    public AccessibilityManager.TouchExplorationStateChangeListener M;
    public final C0039a N;
    public final TextInputLayout s;

    /* renamed from: t, reason: collision with root package name */
    public final FrameLayout f12489t;

    /* renamed from: u, reason: collision with root package name */
    public final CheckableImageButton f12490u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f12491v;

    /* renamed from: w, reason: collision with root package name */
    public PorterDuff.Mode f12492w;

    /* renamed from: x, reason: collision with root package name */
    public View.OnLongClickListener f12493x;

    /* renamed from: y, reason: collision with root package name */
    public final CheckableImageButton f12494y;

    /* renamed from: z, reason: collision with root package name */
    public final d f12495z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: com.google.android.material.textfield.a$a, reason: collision with other inner class name */
    public class C0039a extends i {
        public C0039a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            a.this.b().a();
        }

        @Override // n4.i, android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
            a.this.b().b();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b implements TextInputLayout.g {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public final void a(TextInputLayout textInputLayout) {
            a aVar = a.this;
            C0039a c0039a = aVar.N;
            if (aVar.K == textInputLayout.getEditText()) {
                return;
            }
            EditText editText = aVar.K;
            if (editText != null) {
                editText.removeTextChangedListener(c0039a);
                if (aVar.K.getOnFocusChangeListener() == aVar.b().e()) {
                    aVar.K.setOnFocusChangeListener(null);
                }
            }
            EditText editText2 = textInputLayout.getEditText();
            aVar.K = editText2;
            if (editText2 != null) {
                editText2.addTextChangedListener(c0039a);
            }
            aVar.b().l(aVar.K);
            aVar.k(aVar.b());
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            a aVar = a.this;
            AccessibilityManager accessibilityManager = aVar.L;
            if (aVar.M == null || accessibilityManager == null || !aVar.isAttachedToWindow()) {
                return;
            }
            accessibilityManager.addTouchExplorationStateChangeListener(aVar.M);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            AccessibilityManager accessibilityManager;
            a aVar = a.this;
            AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = aVar.M;
            if (touchExplorationStateChangeListener == null || (accessibilityManager = aVar.L) == null) {
                return;
            }
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final SparseArray<l> f12497a = new SparseArray<>();

        /* renamed from: b, reason: collision with root package name */
        public final a f12498b;

        /* renamed from: c, reason: collision with root package name */
        public final int f12499c;

        /* renamed from: d, reason: collision with root package name */
        public final int f12500d;

        public d(a aVar, b1 b1Var) {
            this.f12498b = aVar;
            TypedArray typedArray = b1Var.f13583b;
            this.f12499c = typedArray.getResourceId(28, 0);
            this.f12500d = typedArray.getResourceId(53, 0);
        }
    }

    public a(TextInputLayout textInputLayout, b1 b1Var) {
        super(textInputLayout.getContext());
        this.A = 0;
        this.B = new LinkedHashSet<>();
        this.N = new C0039a();
        b bVar = new b();
        this.L = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.s = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f12489t = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f12490u = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f12494y = checkableImageButtonA2;
        this.f12495z = new d(this, b1Var);
        c0 c0Var = new c0(getContext(), null);
        this.I = c0Var;
        TypedArray typedArray = b1Var.f13583b;
        if (typedArray.hasValue(38)) {
            this.f12491v = q4.c.b(getContext(), b1Var, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f12492w = n.a(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            j(b1Var.b(37));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setCheckable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.C = q4.c.b(getContext(), b1Var, 32);
            }
            if (typedArray.hasValue(33)) {
                this.D = n.a(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            h(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27)) {
                g(typedArray.getText(27));
            }
            checkableImageButtonA2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.C = q4.c.b(getContext(), b1Var, 55);
            }
            if (typedArray.hasValue(56)) {
                this.D = n.a(typedArray.getInt(56, -1), null);
            }
            h(typedArray.getBoolean(54, false) ? 1 : 0);
            g(typedArray.getText(52));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.E) {
            this.E = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeB = m.b(typedArray.getInt(31, -1));
            this.F = scaleTypeB;
            checkableImageButtonA2.setScaleType(scaleTypeB);
            checkableImageButtonA.setScaleType(scaleTypeB);
        }
        c0Var.setVisibility(8);
        c0Var.setId(R.id.textinput_suffix_text);
        c0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c0Var.setAccessibilityLiveRegion(1);
        c0Var.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            c0Var.setTextColor(b1Var.a(74));
        }
        CharSequence text = typedArray.getText(72);
        this.H = TextUtils.isEmpty(text) ? null : text;
        c0Var.setText(text);
        o();
        frameLayout.addView(checkableImageButtonA2);
        addView(c0Var);
        addView(frameLayout);
        addView(checkableImageButtonA);
        checkableImageButtonA.setOnFocusableChangedListener(new f(8, this));
        checkableImageButtonA2.setOnFocusableChangedListener(new g(4, this));
        textInputLayout.f12478x0.add(bVar);
        if (textInputLayout.f12475w != null) {
            bVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new c());
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i6) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i6);
        if (q4.c.d(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final l b() {
        l dVar;
        int i6 = this.A;
        d dVar2 = this.f12495z;
        SparseArray<l> sparseArray = dVar2.f12497a;
        l lVar = sparseArray.get(i6);
        if (lVar != null) {
            return lVar;
        }
        a aVar = dVar2.f12498b;
        if (i6 == -1) {
            dVar = new y4.d(aVar);
        } else if (i6 == 0) {
            dVar = new q(aVar);
        } else if (i6 == 1) {
            dVar = new r(aVar, dVar2.f12500d);
        } else if (i6 == 2) {
            dVar = new y4.c(aVar);
        } else {
            if (i6 != 3) {
                throw new IllegalArgumentException(androidx.camera.camera2.internal.compat.workaround.c.d(i6, "Invalid end icon mode: "));
            }
            dVar = new k(aVar);
        }
        sparseArray.append(i6, dVar);
        return dVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f12494y;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.I.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f12489t.getVisibility() == 0 && this.f12494y.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f12490u.getVisibility() == 0;
    }

    public final void f(boolean z6) {
        boolean z7;
        boolean zIsActivated;
        boolean z8;
        l lVarB = b();
        boolean zJ = lVarB.j();
        CheckableImageButton checkableImageButton = this.f12494y;
        boolean z9 = true;
        if (!zJ || (z8 = checkableImageButton.f12389v) == lVarB.k()) {
            z7 = false;
        } else {
            checkableImageButton.setChecked(!z8);
            z7 = true;
        }
        if (!(lVarB instanceof k) || (zIsActivated = checkableImageButton.isActivated()) == ((k) lVarB).f15263l) {
            z9 = z7;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z6 || z9) {
            m.c(this.s, checkableImageButton, this.C);
        }
    }

    public final void g(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f12494y;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            m.e(checkableImageButton, this.G, charSequence);
        }
    }

    public final void h(int i6) {
        if (this.A == i6) {
            return;
        }
        l lVarB = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.M;
        AccessibilityManager accessibilityManager = this.L;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.M = null;
        lVarB.r();
        this.A = i6;
        Iterator<TextInputLayout.h> it = this.B.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        i(i6 != 0);
        l lVarB2 = b();
        int iD = this.f12495z.f12499c;
        if (iD == 0) {
            iD = lVarB2.d();
        }
        Drawable drawableD = iD != 0 ? b0.d(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.f12494y;
        checkableImageButton.setImageDrawable(drawableD);
        TextInputLayout textInputLayout = this.s;
        if (drawableD != null) {
            m.a(textInputLayout, checkableImageButton, this.C, this.D);
            m.c(textInputLayout, checkableImageButton, this.C);
        }
        checkableImageButton.setCheckable(lVarB2.j());
        if (!lVarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i6);
        }
        lVarB2.q();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListenerH = lVarB2.h();
        this.M = touchExplorationStateChangeListenerH;
        if (touchExplorationStateChangeListenerH != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.M);
        }
        View.OnClickListener onClickListenerF = lVarB2.f();
        View.OnLongClickListener onLongClickListener = this.G;
        checkableImageButton.setOnClickListener(onClickListenerF);
        m.d(checkableImageButton, onLongClickListener);
        int iC = lVarB2.c();
        g(iC != 0 ? getResources().getText(iC) : null);
        EditText editText = this.K;
        if (editText != null) {
            lVarB2.l(editText);
            k(lVarB2);
        }
        m.a(textInputLayout, checkableImageButton, this.C, this.D);
        f(true);
    }

    public final void i(boolean z6) {
        EditText editText;
        if (d() != z6) {
            CheckableImageButton checkableImageButton = this.f12494y;
            if (!z6 && checkableImageButton.hasFocus() && (editText = this.K) != null) {
                editText.requestFocus();
            }
            checkableImageButton.setVisibility(z6 ? 0 : 8);
            l();
            n();
            this.s.s();
        }
    }

    public final void j(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f12490u;
        checkableImageButton.setImageDrawable(drawable);
        m();
        m.a(this.s, checkableImageButton, this.f12491v, this.f12492w);
    }

    public final void k(l lVar) {
        if (this.K == null) {
            return;
        }
        if (lVar.e() != null) {
            this.K.setOnFocusChangeListener(lVar.e());
        }
        if (lVar.g() != null) {
            this.f12494y.setOnFocusChangeListener(lVar.g());
        }
    }

    public final void l() {
        this.f12489t.setVisibility((this.f12494y.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.H == null || this.J) ? 8 : false)) ? 0 : 8);
    }

    public final void m() {
        CheckableImageButton checkableImageButton = this.f12490u;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.s;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.C.f15289q && textInputLayout.o()) ? 0 : 8);
        l();
        n();
        if (this.A != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void n() {
        TextInputLayout textInputLayout = this.s;
        if (textInputLayout.f12475w == null) {
            return;
        }
        this.I.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.f12475w.getPaddingTop(), (d() || e()) ? 0 : textInputLayout.f12475w.getPaddingEnd(), textInputLayout.f12475w.getPaddingBottom());
    }

    public final void o() {
        c0 c0Var = this.I;
        int visibility = c0Var.getVisibility();
        int i6 = (this.H == null || this.J) ? 8 : 0;
        if (visibility != i6) {
            b().o(i6 == 0);
        }
        l();
        c0Var.setVisibility(i6);
        this.s.s();
    }
}
