package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.d;

/* loaded from: classes.dex */
public final class b implements d.e {

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<StringBuilder> f2194b = new ThreadLocal<>();

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f2195a;

    public b() {
        TextPaint textPaint = new TextPaint();
        this.f2195a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
