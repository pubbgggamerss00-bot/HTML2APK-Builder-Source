package s0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.activity.v;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b implements Spannable {
    @Override // java.lang.CharSequence
    public final char charAt(int i6) {
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
    public final <T> T[] getSpans(int i6, int i7, Class<T> cls) {
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
    public final int nextSpanTransition(int i6, int i7, Class cls) {
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
    public final void setSpan(Object obj, int i6, int i7, int i8) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw null;
        }
        throw null;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i6, int i7) {
        throw null;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        throw null;
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextPaint f14321a;

        /* renamed from: b, reason: collision with root package name */
        public final TextDirectionHeuristic f14322b;

        /* renamed from: c, reason: collision with root package name */
        public final int f14323c;

        /* renamed from: d, reason: collision with root package name */
        public final int f14324d;

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i6, int i7) {
            if (Build.VERSION.SDK_INT >= 29) {
                v.c(textPaint).setBreakStrategy(i6).setHyphenationFrequency(i7).setTextDirection(textDirectionHeuristic).build();
            }
            this.f14321a = textPaint;
            this.f14322b = textDirectionHeuristic;
            this.f14323c = i6;
            this.f14324d = i7;
        }

        public final boolean a(a aVar) {
            if (this.f14323c != aVar.f14323c || this.f14324d != aVar.f14324d) {
                return false;
            }
            TextPaint textPaint = this.f14321a;
            float textSize = textPaint.getTextSize();
            TextPaint textPaint2 = aVar.f14321a;
            TextPaint textPaint3 = aVar.f14321a;
            if (textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint3.getTextScaleX() && textPaint.getTextSkewX() == textPaint3.getTextSkewX() && textPaint.getLetterSpacing() == textPaint3.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint3.getFontFeatureSettings()) && textPaint.getFlags() == textPaint3.getFlags() && textPaint.getTextLocales().equals(textPaint3.getTextLocales())) {
                return textPaint.getTypeface() == null ? textPaint3.getTypeface() == null : textPaint.getTypeface().equals(textPaint3.getTypeface());
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f14322b == aVar.f14322b;
        }

        public final int hashCode() {
            TextPaint textPaint = this.f14321a;
            return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f14322b, Integer.valueOf(this.f14323c), Integer.valueOf(this.f14324d));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder sb2 = new StringBuilder("textSize=");
            TextPaint textPaint = this.f14321a;
            sb2.append(textPaint.getTextSize());
            sb.append(sb2.toString());
            sb.append(", textScaleX=" + textPaint.getTextScaleX());
            sb.append(", textSkewX=" + textPaint.getTextSkewX());
            int i6 = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
            sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
            sb.append(", textLocale=" + textPaint.getTextLocales());
            sb.append(", typeface=" + textPaint.getTypeface());
            if (i6 >= 26) {
                sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f14322b);
            sb.append(", breakStrategy=" + this.f14323c);
            sb.append(", hyphenationFrequency=" + this.f14324d);
            sb.append("}");
            return sb.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f14321a = params.getTextPaint();
            this.f14322b = params.getTextDirection();
            this.f14323c = params.getBreakStrategy();
            this.f14324d = params.getHyphenationFrequency();
        }
    }
}
