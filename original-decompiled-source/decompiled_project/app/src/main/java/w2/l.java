package w2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class l extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f31260a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f31261b;

    public l(boolean z10, boolean z11) {
        this.f31260a = z10;
        this.f31261b = z11;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f31260a);
        textPaint.setStrikeThruText(this.f31261b);
    }
}
