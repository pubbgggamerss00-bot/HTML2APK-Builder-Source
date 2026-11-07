package w3;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a implements Spannable {

    /* renamed from: w3.a$a, reason: collision with other inner class name */
    public static final class C0316a {

        /* renamed from: a, reason: collision with root package name */
        public final TextPaint f31263a;

        /* renamed from: b, reason: collision with root package name */
        public final TextDirectionHeuristic f31264b;

        /* renamed from: c, reason: collision with root package name */
        public final int f31265c;

        /* renamed from: d, reason: collision with root package name */
        public final int f31266d;

        public C0316a(PrecomputedText.Params params) {
            this.f31263a = params.getTextPaint();
            this.f31264b = params.getTextDirection();
            this.f31265c = params.getBreakStrategy();
            this.f31266d = params.getHyphenationFrequency();
        }

        public final boolean a(C0316a c0316a) {
            int i10 = c0316a.f31265c;
            TextPaint textPaint = c0316a.f31263a;
            if (this.f31265c != i10 || this.f31266d != c0316a.f31266d) {
                return false;
            }
            TextPaint textPaint2 = this.f31263a;
            if (textPaint2.getTextSize() == textPaint.getTextSize() && textPaint2.getTextScaleX() == textPaint.getTextScaleX() && textPaint2.getTextSkewX() == textPaint.getTextSkewX() && textPaint2.getLetterSpacing() == textPaint.getLetterSpacing() && TextUtils.equals(textPaint2.getFontFeatureSettings(), textPaint.getFontFeatureSettings()) && textPaint2.getFlags() == textPaint.getFlags() && textPaint2.getTextLocales().equals(textPaint.getTextLocales())) {
                return textPaint2.getTypeface() == null ? textPaint.getTypeface() == null : textPaint2.getTypeface().equals(textPaint.getTypeface());
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0316a)) {
                return false;
            }
            C0316a c0316a = (C0316a) obj;
            return a(c0316a) && this.f31264b == c0316a.f31264b;
        }

        public final int hashCode() {
            TextPaint textPaint = this.f31263a;
            return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f31264b, Integer.valueOf(this.f31265c), Integer.valueOf(this.f31266d));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder sb2 = new StringBuilder("textSize=");
            TextPaint textPaint = this.f31263a;
            sb2.append(textPaint.getTextSize());
            sb.append(sb2.toString());
            sb.append(", textScaleX=" + textPaint.getTextScaleX());
            sb.append(", textSkewX=" + textPaint.getTextSkewX());
            sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
            sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
            sb.append(", textLocale=" + textPaint.getTextLocales());
            sb.append(", typeface=" + textPaint.getTypeface());
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
            sb.append(", textDir=" + this.f31264b);
            sb.append(", breakStrategy=" + this.f31265c);
            sb.append(", hyphenationFrequency=" + this.f31266d);
            sb.append("}");
            return sb.toString();
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        throw null;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        throw null;
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        throw null;
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw null;
        }
        throw null;
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw null;
        }
        throw null;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        throw null;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        throw null;
    }
}
