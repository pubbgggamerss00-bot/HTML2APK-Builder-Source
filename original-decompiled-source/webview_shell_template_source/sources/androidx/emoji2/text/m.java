package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class m extends ReplacementSpan {

    /* renamed from: t, reason: collision with root package name */
    public final q f1024t;
    public final Paint.FontMetricsInt s = new Paint.FontMetricsInt();

    /* renamed from: u, reason: collision with root package name */
    public short f1025u = -1;

    /* renamed from: v, reason: collision with root package name */
    public float f1026v = 1.0f;

    public m(q qVar) {
        androidx.work.j.e("rasterizer cannot be null", qVar);
        this.f1024t = qVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i6, int i7, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.s;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        q qVar = this.f1024t;
        this.f1026v = fAbs / (qVar.b().a(14) != 0 ? ((ByteBuffer) r8.f12778d).getShort(r1 + r8.f12775a) : (short) 0);
        e1.a aVarB = qVar.b();
        int iA = aVarB.a(14);
        if (iA != 0) {
            ((ByteBuffer) aVarB.f12778d).getShort(iA + aVarB.f12775a);
        }
        short s = (short) ((qVar.b().a(12) != 0 ? ((ByteBuffer) r5.f12778d).getShort(r7 + r5.f12775a) : (short) 0) * this.f1026v);
        this.f1025u = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
