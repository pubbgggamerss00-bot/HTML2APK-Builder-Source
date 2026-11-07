package w2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class j extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final int f31255a;

    /* renamed from: b, reason: collision with root package name */
    public final float f31256b;

    /* renamed from: c, reason: collision with root package name */
    public final float f31257c;

    /* renamed from: d, reason: collision with root package name */
    public final float f31258d;

    public j(float f10, float f11, float f12, int i10) {
        this.f31255a = i10;
        this.f31256b = f10;
        this.f31257c = f11;
        this.f31258d = f12;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f31258d, this.f31256b, this.f31257c, this.f31255a);
    }
}
