package u2;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f29235a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f29236b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29237c;

    /* renamed from: d, reason: collision with root package name */
    public float f29238d = Float.NaN;

    /* renamed from: e, reason: collision with root package name */
    public float f29239e = Float.NaN;

    /* renamed from: f, reason: collision with root package name */
    public BoringLayout.Metrics f29240f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f29241g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f29242h;

    public v(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f29235a = charSequence;
        this.f29236b = textPaint;
        this.f29237c = i10;
    }

    public final BoringLayout.Metrics a() {
        if (!this.f29241g) {
            TextDirectionHeuristic textDirectionHeuristicA = l0.a(this.f29237c);
            int i10 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f29235a;
            TextPaint textPaint = this.f29236b;
            this.f29240f = i10 >= 33 ? BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristicA, true, null) : !textDirectionHeuristicA.isRtl(charSequence, 0, charSequence.length()) ? BoringLayout.isBoring(charSequence, textPaint, null) : null;
            this.f29241g = true;
        }
        return this.f29240f;
    }

    public final CharSequence b() {
        CharSequence charSequence = this.f29242h;
        if (charSequence != null) {
            kotlin.jvm.internal.r.b(charSequence);
            return charSequence;
        }
        CharSequence charSequence2 = this.f29235a;
        if (charSequence2 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence2;
            if (p5.o.a(spanned, CharacterStyle.class)) {
                CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence2.length(), CharacterStyle.class);
                if (characterStyleArr != null && characterStyleArr.length != 0) {
                    SpannableString spannableString = null;
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence2);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        charSequence2 = spannableString;
                    }
                }
            }
        }
        this.f29242h = charSequence2;
        return charSequence2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float c() {
        if (!Float.isNaN(this.f29238d)) {
            return this.f29238d;
        }
        BoringLayout.Metrics metricsA = a();
        float fCeil = metricsA != null ? metricsA.width : -1;
        TextPaint textPaint = this.f29236b;
        if (fCeil < CropImageView.DEFAULT_ASPECT_RATIO) {
            fCeil = (float) Math.ceil(Layout.getDesiredWidth(b(), 0, b().length(), textPaint));
        }
        if (fCeil != CropImageView.DEFAULT_ASPECT_RATIO) {
            CharSequence charSequence = this.f29235a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (p5.o.a(spanned, w2.f.class) || p5.o.a(spanned, w2.e.class)) {
                    fCeil += 0.5f;
                } else if (textPaint.getLetterSpacing() != CropImageView.DEFAULT_ASPECT_RATIO) {
                }
            }
        }
        this.f29238d = fCeil;
        return fCeil;
    }
}
