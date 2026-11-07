package d3;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.jvm.internal.r;
import s1.f;
import s1.h;
import s1.i;

/* loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name */
    public final f f7344a;

    public b(f fVar) {
        this.f7344a = fVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            h hVar = h.f24186a;
            f fVar = this.f7344a;
            if (r.a(fVar, hVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (fVar instanceof i) {
                textPaint.setStyle(Paint.Style.STROKE);
                i iVar = (i) fVar;
                textPaint.setStrokeWidth(iVar.f24187a);
                textPaint.setStrokeMiter(iVar.f24188b);
                int i10 = iVar.f24190d;
                textPaint.setStrokeJoin(i10 == 0 ? Paint.Join.MITER : i10 == 1 ? Paint.Join.ROUND : i10 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
                int i11 = iVar.f24189c;
                textPaint.setStrokeCap(i11 == 0 ? Paint.Cap.BUTT : i11 == 1 ? Paint.Cap.ROUND : i11 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
                textPaint.setPathEffect(null);
            }
        }
    }
}
