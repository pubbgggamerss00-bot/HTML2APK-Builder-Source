package re;

import android.graphics.Path;
import android.graphics.PointF;
import android.util.Log;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public final we.c f23513a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23514b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23515c;

    /* renamed from: d, reason: collision with root package name */
    public Path f23516d;

    /* renamed from: e, reason: collision with root package name */
    public PointF f23517e;

    /* renamed from: f, reason: collision with root package name */
    public final PointF f23518f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f23519g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f23520h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f23521i;

    /* renamed from: j, reason: collision with root package name */
    public int f23522j;

    public r() {
        throw null;
    }

    public r(we.c cVar, String str, String str2) {
        this.f23516d = null;
        this.f23517e = null;
        this.f23518f = null;
        this.f23519g = false;
        this.f23520h = new ArrayList();
        this.f23513a = cVar;
        this.f23514b = str;
        this.f23515c = str2;
        this.f23518f = new PointF(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
    }

    public final Path a() {
        if (this.f23516d == null) {
            this.f23516d = new Path();
            this.f23517e = new PointF(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
            new q(this).H(this.f23521i);
        }
        return this.f23516d;
    }

    public final void b(Number number, Number number2) {
        PointF pointF = this.f23518f;
        float fFloatValue = number.floatValue() + pointF.x;
        float fFloatValue2 = number2.floatValue() + pointF.y;
        if (this.f23516d.isEmpty()) {
            Log.w("PdfBox-Android", "rlineTo without initial moveTo in font " + this.f23514b + ", glyph " + this.f23515c);
            this.f23516d.moveTo(fFloatValue, fFloatValue2);
        } else {
            this.f23516d.lineTo(fFloatValue, fFloatValue2);
        }
        pointF.set(fFloatValue, fFloatValue2);
    }

    public final void c(Number number, Number number2) {
        PointF pointF = this.f23518f;
        float fFloatValue = number.floatValue() + pointF.x;
        float fFloatValue2 = number2.floatValue() + pointF.y;
        this.f23516d.moveTo(fFloatValue, fFloatValue2);
        pointF.set(fFloatValue, fFloatValue2);
    }

    public final void d(Number number, Number number2, Number number3, Number number4, Number number5, Number number6) {
        PointF pointF = this.f23518f;
        float fFloatValue = number.floatValue() + pointF.x;
        float fFloatValue2 = number2.floatValue() + pointF.y;
        float fFloatValue3 = number3.floatValue() + fFloatValue;
        float fFloatValue4 = number4.floatValue() + fFloatValue2;
        float fFloatValue5 = number5.floatValue() + fFloatValue3;
        float fFloatValue6 = number6.floatValue() + fFloatValue4;
        if (this.f23516d.isEmpty()) {
            Log.w("PdfBox-Android", "rrcurveTo without initial moveTo in font " + this.f23514b + ", glyph " + this.f23515c);
            this.f23516d.moveTo(fFloatValue5, fFloatValue6);
        } else {
            this.f23516d.cubicTo(fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4, fFloatValue5, fFloatValue6);
        }
        pointF.set(fFloatValue5, fFloatValue6);
    }

    public final String toString() {
        return this.f23521i.toString().replace("|", "\n").replace(",", " ");
    }
}
