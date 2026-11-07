package v2;

import android.text.TextPaint;
import c5.p;

/* loaded from: classes.dex */
public final class d extends p {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f30549a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f30550b;

    public d(CharSequence charSequence, TextPaint textPaint) {
        this.f30549a = charSequence;
        this.f30550b = textPaint;
    }

    @Override // c5.p
    public final int X(int i10) {
        CharSequence charSequence = this.f30549a;
        return this.f30550b.getTextRunCursor(charSequence, 0, charSequence.length(), false, i10, 0);
    }

    @Override // c5.p
    public final int a0(int i10) {
        CharSequence charSequence = this.f30549a;
        return this.f30550b.getTextRunCursor(charSequence, 0, charSequence.length(), false, i10, 2);
    }
}
