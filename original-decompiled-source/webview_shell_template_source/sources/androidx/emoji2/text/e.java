package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.g;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e implements g.e {

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<StringBuilder> f987b = new ThreadLocal<>();

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f988a;

    public e() {
        TextPaint textPaint = new TextPaint();
        this.f988a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
