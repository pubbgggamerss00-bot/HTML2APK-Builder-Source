package w2;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class h implements LineHeightSpan {

    /* renamed from: a, reason: collision with root package name */
    public final float f31239a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31240b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f31241c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f31242d;

    /* renamed from: e, reason: collision with root package name */
    public final float f31243e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f31244f;

    /* renamed from: g, reason: collision with root package name */
    public int f31245g = PKIFailureInfo.systemUnavail;

    /* renamed from: h, reason: collision with root package name */
    public int f31246h = PKIFailureInfo.systemUnavail;

    /* renamed from: j, reason: collision with root package name */
    public int f31247j = PKIFailureInfo.systemUnavail;

    /* renamed from: k, reason: collision with root package name */
    public int f31248k = PKIFailureInfo.systemUnavail;

    /* renamed from: l, reason: collision with root package name */
    public int f31249l;

    /* renamed from: m, reason: collision with root package name */
    public int f31250m;

    public h(float f10, int i10, boolean z10, boolean z11, float f11, boolean z12) {
        this.f31239a = f10;
        this.f31240b = i10;
        this.f31241c = z10;
        this.f31242d = z11;
        this.f31243e = f11;
        this.f31244f = z12;
        if ((CropImageView.DEFAULT_ASPECT_RATIO > f11 || f11 > 1.0f) && f11 != -1.0f) {
            z2.a.b("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        int i14 = fontMetricsInt.descent;
        int i15 = fontMetricsInt.ascent;
        if (i14 - i15 <= 0) {
            return;
        }
        boolean z10 = i10 == 0;
        boolean z11 = i11 == this.f31240b;
        boolean z12 = this.f31242d;
        boolean z13 = this.f31241c;
        if (z10 && z11 && z13 && z12) {
            return;
        }
        if (this.f31245g == Integer.MIN_VALUE) {
            int i16 = i14 - i15;
            int iCeil = (int) Math.ceil(this.f31239a);
            int i17 = iCeil - i16;
            if (!this.f31244f || i17 > 0) {
                float fAbs = this.f31243e;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int iCeil2 = (int) (i17 <= 0 ? Math.ceil(i17 * fAbs) : Math.ceil((1.0f - fAbs) * i17));
                int i18 = fontMetricsInt.descent;
                int i19 = iCeil2 + i18;
                this.f31247j = i19;
                int i20 = i19 - iCeil;
                this.f31246h = i20;
                if (z13) {
                    i20 = fontMetricsInt.ascent;
                }
                this.f31245g = i20;
                if (z12) {
                    i19 = i18;
                }
                this.f31248k = i19;
                this.f31249l = fontMetricsInt.ascent - i20;
                this.f31250m = i19 - i18;
            } else {
                int i21 = fontMetricsInt.ascent;
                this.f31246h = i21;
                int i22 = fontMetricsInt.descent;
                this.f31247j = i22;
                this.f31245g = i21;
                this.f31248k = i22;
                this.f31249l = 0;
                this.f31250m = 0;
            }
        }
        fontMetricsInt.ascent = z10 ? this.f31245g : this.f31246h;
        fontMetricsInt.descent = z11 ? this.f31248k : this.f31247j;
    }
}
