package w2;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class f extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final float f31237a;

    public f(float f10) {
        this.f31237a = f10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == CropImageView.DEFAULT_ASPECT_RATIO) {
            return;
        }
        textPaint.setLetterSpacing(this.f31237a / textScaleX);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == CropImageView.DEFAULT_ASPECT_RATIO) {
            return;
        }
        textPaint.setLetterSpacing(this.f31237a / textScaleX);
    }
}
