package x4;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes.dex */
public abstract class g extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final k f32062b;

    /* renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f32061a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    public short f32063c = -1;

    /* renamed from: d, reason: collision with root package name */
    public float f32064d = 1.0f;

    public g(k kVar) {
        x3.e.a(kVar, "rasterizer cannot be null");
        this.f32062b = kVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f32061a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        k kVar = this.f32062b;
        this.f32064d = fAbs / (kVar.b().a(14) != 0 ? r8.f33936b.getShort(r1 + r8.f33935a) : (short) 0);
        y4.a aVarB = kVar.b();
        int iA = aVarB.a(14);
        if (iA != 0) {
            aVarB.f33936b.getShort(iA + aVarB.f33935a);
        }
        short s10 = (short) ((kVar.b().a(12) != 0 ? r5.f33936b.getShort(r7 + r5.f33935a) : (short) 0) * this.f32064d);
        this.f32063c = s10;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s10;
    }
}
