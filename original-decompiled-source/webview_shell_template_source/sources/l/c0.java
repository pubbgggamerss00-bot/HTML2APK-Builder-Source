package l;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import l.z;
import s0.b;
import y0.d;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class c0 extends TextView {
    public final l.d s;

    /* renamed from: t, reason: collision with root package name */
    public final a0 f13588t;

    /* renamed from: u, reason: collision with root package name */
    public final z f13589u;

    /* renamed from: v, reason: collision with root package name */
    public l f13590v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f13591w;

    /* renamed from: x, reason: collision with root package name */
    public b f13592x;

    /* renamed from: y, reason: collision with root package name */
    public Future<s0.b> f13593y;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface a {
        void a(int i6);

        void b(int i6);

        void c(int i6, float f6);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class c extends b {
        public c() {
            super();
        }

        @Override // l.c0.b, l.c0.a
        public final void a(int i6) {
            c0.super.setLastBaselineToBottomHeight(i6);
        }

        @Override // l.c0.b, l.c0.a
        public final void b(int i6) {
            c0.super.setFirstBaselineToTopHeight(i6);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class d extends c {
        public d() {
            super();
        }

        @Override // l.c0.b, l.c0.a
        public final void c(int i6, float f6) {
            c0.super.setLineHeight(i6, f6);
        }
    }

    public c0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private l getEmojiTextViewHelper() {
        if (this.f13590v == null) {
            this.f13590v = new l(this);
        }
        return this.f13590v;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        l.d dVar = this.s;
        if (dVar != null) {
            dVar.a();
        }
        a0 a0Var = this.f13588t;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (i1.f13671c) {
            return super.getAutoSizeMaxTextSize();
        }
        a0 a0Var = this.f13588t;
        if (a0Var != null) {
            return Math.round(a0Var.f13570i.f13610e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (i1.f13671c) {
            return super.getAutoSizeMinTextSize();
        }
        a0 a0Var = this.f13588t;
        if (a0Var != null) {
            return Math.round(a0Var.f13570i.f13609d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (i1.f13671c) {
            return super.getAutoSizeStepGranularity();
        }
        a0 a0Var = this.f13588t;
        if (a0Var != null) {
            return Math.round(a0Var.f13570i.f13608c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (i1.f13671c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        a0 a0Var = this.f13588t;
        return a0Var != null ? a0Var.f13570i.f13611f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (i1.f13671c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        a0 a0Var = this.f13588t;
        if (a0Var != null) {
            return a0Var.f13570i.f13606a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return y0.d.f(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public a getSuperCaller() {
        if (this.f13592x == null) {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 34) {
                this.f13592x = new d();
            } else if (i6 >= 28) {
                this.f13592x = new c();
            } else if (i6 >= 26) {
                this.f13592x = new b();
            }
        }
        return this.f13592x;
    }

    public ColorStateList getSupportBackgroundTintList() {
        l.d dVar = this.s;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        l.d dVar = this.s;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f13588t.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f13588t.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<s0.b> future = this.f13593y;
        if (future != null) {
            try {
                this.f13593y = null;
                y0.d.e(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        z zVar;
        if (Build.VERSION.SDK_INT >= 28 || (zVar = this.f13589u) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = zVar.f13764b;
        return textClassifier == null ? z.a.a(zVar.f13763a) : textClassifier;
    }

    public b.a getTextMetricsParamsCompat() {
        return y0.d.a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f13588t.getClass();
        a0.h(editorInfo, inputConnectionOnCreateInputConnection, this);
        androidx.activity.c0.h(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 30 || i6 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        super.onLayout(z6, i6, i7, i8, i9);
        a0 a0Var = this.f13588t;
        if (a0Var == null || i1.f13671c) {
            return;
        }
        a0Var.f13570i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i6, int i7) {
        Future<s0.b> future = this.f13593y;
        if (future != null) {
            try {
                this.f13593y = null;
                y0.d.e(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i6, i7);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
        super.onTextChanged(charSequence, i6, i7, i8);
        a0 a0Var = this.f13588t;
        if (a0Var != null) {
            d0 d0Var = a0Var.f13570i;
            if (i1.f13671c || !d0Var.f()) {
                return;
            }
            d0Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().b(z6);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i6, int i7, int i8, int i9) {
        if (i1.f13671c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i6, i7, i8, i9);
            return;
        }
        a0 a0Var = this.f13588t;
        if (a0Var != null) {
            a0Var.i(i6, i7, i8, i9);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i6) {
        if (i1.f13671c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i6);
            return;
        }
        a0 a0Var = this.f13588t;
        if (a0Var != null) {
            a0Var.j(iArr, i6);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i6) {
        if (i1.f13671c) {
            super.setAutoSizeTextTypeWithDefaults(i6);
            return;
        }
        a0 a0Var = this.f13588t;
        if (a0Var != null) {
            a0Var.k(i6);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        l.d dVar = this.s;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        l.d dVar = this.s;
        if (dVar != null) {
            dVar.f(i6);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.f13588t;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.f13588t;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.f13588t;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.f13588t;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(y0.d.g(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().c(z6);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f13695b.f12974a.a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i6) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i6);
        } else {
            y0.d.b(this, i6);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i6) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i6);
        } else {
            y0.d.c(this, i6);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i6) {
        y0.d.d(this, i6);
    }

    public void setPrecomputedText(s0.b bVar) {
        y0.d.e(this, bVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        l.d dVar = this.s;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        l.d dVar = this.s;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        a0 a0Var = this.f13588t;
        a0Var.l(colorStateList);
        a0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        a0 a0Var = this.f13588t;
        a0Var.m(mode);
        a0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        a0 a0Var = this.f13588t;
        if (a0Var != null) {
            a0Var.g(context, i6);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        z zVar;
        if (Build.VERSION.SDK_INT >= 28 || (zVar = this.f13589u) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            zVar.f13764b = textClassifier;
        }
    }

    public void setTextFuture(Future<s0.b> future) {
        this.f13593y = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(b.a aVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = aVar.f14322b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i6 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i6 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i6 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i6 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i6 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i6 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i6 = 7;
            }
        }
        setTextDirection(i6);
        getPaint().set(aVar.f14321a);
        setBreakStrategy(aVar.f14323c);
        setHyphenationFrequency(aVar.f14324d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i6, float f6) {
        boolean z6 = i1.f13671c;
        if (z6) {
            super.setTextSize(i6, f6);
            return;
        }
        a0 a0Var = this.f13588t;
        if (a0Var != null) {
            d0 d0Var = a0Var.f13570i;
            if (z6 || d0Var.f()) {
                return;
            }
            d0Var.g(f6, i6);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i6) {
        Typeface typefaceCreate;
        if (this.f13591w) {
            return;
        }
        if (typeface == null || i6 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            m0.k kVar = m0.e.f13861a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i6);
        }
        this.f13591w = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i6);
        } finally {
            this.f13591w = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        y0.a(context);
        this.f13591w = false;
        this.f13592x = null;
        w0.a(getContext(), this);
        l.d dVar = new l.d(this);
        this.s = dVar;
        dVar.d(attributeSet, i6);
        a0 a0Var = new a0(this);
        this.f13588t = a0Var;
        a0Var.f(attributeSet, i6);
        a0Var.b();
        z zVar = new z();
        zVar.f13763a = this;
        this.f13589u = zVar;
        getEmojiTextViewHelper().a(attributeSet, i6);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i6, float f6) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            getSuperCaller().c(i6, f6);
        } else if (i7 >= 34) {
            d.b.a(this, i6, f6);
        } else {
            y0.d.d(this, Math.round(TypedValue.applyDimension(i6, f6, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i6, int i7, int i8, int i9) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i6 != 0 ? y5.b0.d(context, i6) : null, i7 != 0 ? y5.b0.d(context, i7) : null, i8 != 0 ? y5.b0.d(context, i8) : null, i9 != 0 ? y5.b0.d(context, i9) : null);
        a0 a0Var = this.f13588t;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i6, int i7, int i8, int i9) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i6 != 0 ? y5.b0.d(context, i6) : null, i7 != 0 ? y5.b0.d(context, i7) : null, i8 != 0 ? y5.b0.d(context, i8) : null, i9 != 0 ? y5.b0.d(context, i9) : null);
        a0 a0Var = this.f13588t;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b implements a {
        public b() {
        }

        @Override // l.c0.a
        public void a(int i6) {
        }

        @Override // l.c0.a
        public void b(int i6) {
        }

        @Override // l.c0.a
        public void c(int i6, float f6) {
        }
    }
}
