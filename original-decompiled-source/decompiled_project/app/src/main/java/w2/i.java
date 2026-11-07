package w2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.yalantis.ucrop.view.CropImageView;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class i extends ReplacementSpan {

    /* renamed from: a, reason: collision with root package name */
    public Paint.FontMetricsInt f31251a;

    /* renamed from: b, reason: collision with root package name */
    public int f31252b;

    /* renamed from: c, reason: collision with root package name */
    public int f31253c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f31254d;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f31251a;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        r.h("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.f31254d) {
            z2.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.f31253c;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        this.f31254d = true;
        paint.getTextSize();
        this.f31251a = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            z2.a.a("Invalid fontMetrics: line height can not be negative.");
        }
        this.f31252b = (int) Math.ceil(CropImageView.DEFAULT_ASPECT_RATIO);
        this.f31253c = (int) Math.ceil(CropImageView.DEFAULT_ASPECT_RATIO);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            if (fontMetricsInt.ascent > (-b())) {
                fontMetricsInt.ascent = -b();
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        if (!this.f31254d) {
            z2.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.f31252b;
    }
}
