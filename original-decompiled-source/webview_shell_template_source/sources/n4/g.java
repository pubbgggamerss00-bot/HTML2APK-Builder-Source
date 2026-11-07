package n4;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f13972a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f13973b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13974c;

    /* renamed from: d, reason: collision with root package name */
    public int f13975d;

    /* renamed from: k, reason: collision with root package name */
    public boolean f13981k;

    /* renamed from: m, reason: collision with root package name */
    public androidx.camera.camera2.interop.b f13983m;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f13976e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f13977f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f13978g = 0.0f;
    public float h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f13979i = 1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f13980j = true;

    /* renamed from: l, reason: collision with root package name */
    public TextUtils.TruncateAt f13982l = null;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a extends Exception {
    }

    public g(CharSequence charSequence, TextPaint textPaint, int i6) {
        this.f13972a = charSequence;
        this.f13973b = textPaint;
        this.f13974c = i6;
        this.f13975d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f13972a == null) {
            this.f13972a = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        int iMax = Math.max(0, this.f13974c);
        CharSequence charSequenceEllipsize = this.f13972a;
        int i6 = this.f13977f;
        TextPaint textPaint = this.f13973b;
        if (i6 == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f13982l);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f13975d);
        this.f13975d = iMin;
        if (this.f13981k && this.f13977f == 1) {
            this.f13976e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f13976e);
        builderObtain.setIncludePad(this.f13980j);
        builderObtain.setTextDirection(this.f13981k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f13982l;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f13977f);
        float f6 = this.f13978g;
        if (f6 != 0.0f || this.h != 1.0f) {
            builderObtain.setLineSpacing(f6, this.h);
        }
        if (this.f13977f > 1) {
            builderObtain.setHyphenationFrequency(this.f13979i);
        }
        androidx.camera.camera2.interop.b bVar = this.f13983m;
        if (bVar != null) {
            builderObtain.setBreakStrategy(((TextInputLayout) bVar.s).M.getBreakStrategy());
        }
        return builderObtain.build();
    }
}
