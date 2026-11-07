package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
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
import c4.d;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import w3.a;

/* loaded from: classes.dex */
public class r extends TextView {
    private final m.d mBackgroundTintHelper;
    private h mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<w3.a> mPrecomputedTextFuture;
    private a mSuperCaller;
    private final o mTextClassifierHelper;
    private final p mTextHelper;

    public interface a {
        void a(int i10);

        void b(int i10);

        void c(int i10, float f10);
    }

    public class b implements a {
        public b() {
        }

        @Override // m.r.a
        public void c(int i10, float f10) {
        }
    }

    public class c extends b {
        public c() {
            super();
        }

        @Override // m.r.a
        public final void a(int i10) {
            r.super.setLastBaselineToBottomHeight(i10);
        }

        @Override // m.r.a
        public final void b(int i10) {
            r.super.setFirstBaselineToTopHeight(i10);
        }
    }

    public class d extends c {
        public d() {
            super();
        }

        @Override // m.r.b, m.r.a
        public final void c(int i10, float f10) {
            r.super.setLineHeight(i10, f10);
        }
    }

    public r(Context context) {
        this(context, null);
    }

    private void consumeTextFutureAndSetBlocking() throws ExecutionException, InterruptedException {
        Future<w3.a> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                w3.a aVar = future.get();
                if (Build.VERSION.SDK_INT >= 29) {
                    aVar.getClass();
                    setText((CharSequence) null);
                } else {
                    a.C0316a c0316a = new a.C0316a(getTextMetricsParams());
                    aVar.getClass();
                    c0316a.a(null);
                    throw null;
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    private h getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new h(this);
        }
        return this.mEmojiTextViewHelper;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        m.d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.a();
        }
        p pVar = this.mTextHelper;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        if (customSelectionActionModeCallback instanceof d.b) {
            throw null;
        }
        return customSelectionActionModeCallback;
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
        if (this.mSuperCaller == null) {
            if (Build.VERSION.SDK_INT >= 34) {
                this.mSuperCaller = new d();
            } else {
                this.mSuperCaller = new c();
            }
        }
        return this.mSuperCaller;
    }

    public ColorStateList getSupportBackgroundTintList() {
        h0 h0Var;
        m.d dVar = this.mBackgroundTintHelper;
        if (dVar == null || (h0Var = dVar.f17113e) == null) {
            return null;
        }
        return h0Var.f17138a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        h0 h0Var;
        m.d dVar = this.mBackgroundTintHelper;
        if (dVar == null || (h0Var = dVar.f17113e) == null) {
            return null;
        }
        return h0Var.f17139b;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        h0 h0Var = this.mTextHelper.f17159h;
        if (h0Var != null) {
            return h0Var.f17138a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        h0 h0Var = this.mTextHelper.f17159h;
        if (h0Var != null) {
            return h0Var.f17139b;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() throws ExecutionException, InterruptedException {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    public a.C0316a getTextMetricsParamsCompat() {
        return new a.C0316a(getTextMetricsParams());
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().f17137b.f34758a.b();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            a4.a.a(editorInfo, getText());
        }
        i.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        p pVar = this.mTextHelper;
        if (pVar != null) {
            pVar.getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) throws ExecutionException, InterruptedException {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().f17137b.f34758a.c(z10);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) throws IllegalArgumentException {
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        super.setAutoSizeTextTypeWithDefaults(i10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        m.d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.f17111c = -1;
            dVar.d(null);
            dVar.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        m.d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.c(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        p pVar = this.mTextHelper;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        p pVar = this.mTextHelper;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        p pVar = this.mTextHelper;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        p pVar = this.mTextHelper;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().f17137b.f34758a.d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f17137b.f34758a.a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        getSuperCaller().b(i10);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        getSuperCaller().a(i10);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        c4.d.a(this, i10);
    }

    public void setPrecomputedText(w3.a aVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            aVar.getClass();
            setText((CharSequence) null);
        } else {
            a.C0316a c0316a = new a.C0316a(getTextMetricsParams());
            aVar.getClass();
            c0316a.a(null);
            throw null;
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        m.d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        m.d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.f(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        p pVar = this.mTextHelper;
        if (pVar.f17159h == null) {
            pVar.f17159h = new h0();
        }
        h0 h0Var = pVar.f17159h;
        h0Var.f17138a = colorStateList;
        h0Var.f17141d = colorStateList != null;
        pVar.f17153b = h0Var;
        pVar.f17154c = h0Var;
        pVar.f17155d = h0Var;
        pVar.f17156e = h0Var;
        pVar.f17157f = h0Var;
        pVar.f17158g = h0Var;
        pVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        p pVar = this.mTextHelper;
        if (pVar.f17159h == null) {
            pVar.f17159h = new h0();
        }
        h0 h0Var = pVar.f17159h;
        h0Var.f17139b = mode;
        h0Var.f17140c = mode != null;
        pVar.f17153b = h0Var;
        pVar.f17154c = h0Var;
        pVar.f17155d = h0Var;
        pVar.f17156e = h0Var;
        pVar.f17157f = h0Var;
        pVar.f17158g = h0Var;
        pVar.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) throws Resources.NotFoundException {
        super.setTextAppearance(context, i10);
        p pVar = this.mTextHelper;
        if (pVar != null) {
            pVar.e(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    public void setTextFuture(Future<w3.a> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(a.C0316a c0316a) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c0316a.f31264b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i10 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i10 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i10 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i10 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i10 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i10 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i10 = 7;
            }
        }
        setTextDirection(i10);
        getPaint().set(c0316a.f31263a);
        setBreakStrategy(c0316a.f31265c);
        setHyphenationFrequency(c0316a.f31266d);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i10) {
        Typeface typefaceCreate;
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        if (typeface == null || i10 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            r3.a0 a0Var = r3.u.f23169a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i10);
        }
        this.mIsSetTypefaceProcessing = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    public r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10, float f10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            getSuperCaller().c(i10, f10);
        } else if (i11 >= 34) {
            d.a.a(this, i10, f10);
        } else {
            c4.d.a(this, Math.round(TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        super(context, attributeSet, i10);
        g0.a(context);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        f0.a(getContext(), this);
        m.d dVar = new m.d(this);
        this.mBackgroundTintHelper = dVar;
        dVar.b(attributeSet, i10);
        p pVar = new p(this);
        this.mTextHelper = pVar;
        pVar.d(attributeSet, i10);
        pVar.b();
        this.mTextClassifierHelper = new o();
        h emojiTextViewHelper = getEmojiTextViewHelper();
        TypedArray typedArrayObtainStyledAttributes = emojiTextViewHelper.f17136a.getContext().obtainStyledAttributes(attributeSet, g.a.f11246e, i10, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            emojiTextViewHelper.f17137b.f34758a.d(z10);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? i.a.c(context, i10) : null, i11 != 0 ? i.a.c(context, i11) : null, i12 != 0 ? i.a.c(context, i12) : null, i13 != 0 ? i.a.c(context, i13) : null);
        p pVar = this.mTextHelper;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? i.a.c(context, i10) : null, i11 != 0 ? i.a.c(context, i11) : null, i12 != 0 ? i.a.c(context, i12) : null, i13 != 0 ? i.a.c(context, i13) : null);
        p pVar = this.mTextHelper;
        if (pVar != null) {
            pVar.b();
        }
    }
}
