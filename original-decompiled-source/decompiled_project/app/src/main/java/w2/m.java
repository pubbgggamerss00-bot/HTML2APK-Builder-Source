package w2;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class m extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f31262a;

    public m(Typeface typeface) {
        this.f31262a = typeface;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTypeface(this.f31262a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTypeface(this.f31262a);
    }
}
