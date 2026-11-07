package w2;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class k extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final float f31259a;

    public k(float f10) {
        this.f31259a = f10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f31259a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f31259a);
    }
}
