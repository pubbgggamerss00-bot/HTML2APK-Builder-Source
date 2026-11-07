package cf;

import com.yalantis.ucrop.view.CropImageView;
import java.io.IOException;
import java.math.BigDecimal;

/* loaded from: classes2.dex */
public final class f extends n {

    /* renamed from: b, reason: collision with root package name */
    public BigDecimal f5435b;

    /* renamed from: c, reason: collision with root package name */
    public String f5436c;

    public f(float f10) {
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(f10));
        this.f5435b = bigDecimal;
        this.f5436c = v0(bigDecimal.toPlainString());
    }

    public static String v0(String str) {
        if (str.indexOf(46) > -1 && !str.endsWith(".0")) {
            while (str.endsWith(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.L0) && !str.endsWith(".0")) {
                str = p3.c.a(1, 0, str);
            }
        }
        return str;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f) && Float.floatToIntBits(((f) obj).f5435b.floatValue()) == Float.floatToIntBits(this.f5435b.floatValue());
    }

    @Override // cf.b
    public final Object f0(gf.b bVar) throws IOException {
        bVar.f12056d.write(this.f5436c.getBytes("ISO-8859-1"));
        return null;
    }

    @Override // cf.n
    public final float g0() {
        return this.f5435b.floatValue();
    }

    public final int hashCode() {
        return this.f5435b.hashCode();
    }

    @Override // cf.n
    public final int k0() {
        return this.f5435b.intValue();
    }

    @Override // cf.n
    public final long l0() {
        return this.f5435b.longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q0() {
        float fFloatValue = this.f5435b.floatValue();
        double dDoubleValue = this.f5435b.doubleValue();
        boolean z10 = true;
        if (fFloatValue == Float.NEGATIVE_INFINITY || fFloatValue == Float.POSITIVE_INFINITY) {
            if (Math.abs(dDoubleValue) > 3.4028234663852886E38d) {
                fFloatValue = (fFloatValue == Float.POSITIVE_INFINITY ? 1 : -1) * Float.MAX_VALUE;
            } else {
                z10 = false;
            }
        } else if (fFloatValue != CropImageView.DEFAULT_ASPECT_RATIO || dDoubleValue == 0.0d || Math.abs(dDoubleValue) >= 1.1754943508222875E-38d) {
        }
        if (z10) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(fFloatValue);
            this.f5435b = bigDecimalValueOf;
            this.f5436c = v0(bigDecimalValueOf.toPlainString());
        }
    }

    public final String toString() {
        return b.o.a(new StringBuilder("COSFloat{"), this.f5436c, "}");
    }
}
