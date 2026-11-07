package u2;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class g0 {
    public static StaticLayout a(CharSequence charSequence, TextPaint textPaint, int i10, int i11, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i12, TextUtils.TruncateAt truncateAt, int i13, int i14, boolean z10, int i15, int i16, int i17, int i18) {
        if (i11 < 0) {
            z2.a.a("invalid start value");
        }
        int length = charSequence.length();
        if (i11 < 0 || i11 > length) {
            z2.a.a("invalid end value");
        }
        if (i12 < 0) {
            z2.a.a("invalid maxLines value");
        }
        if (i10 < 0) {
            z2.a.a("invalid width value");
        }
        if (i13 < 0) {
            z2.a.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i11, textPaint, i10);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i12);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i13);
        builderObtain.setLineSpacing(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        builderObtain.setIncludePad(z10);
        builderObtain.setBreakStrategy(i15);
        builderObtain.setHyphenationFrequency(i18);
        builderObtain.setIndents(null, null);
        int i19 = Build.VERSION.SDK_INT;
        builderObtain.setJustificationMode(i14);
        builderObtain.setUseLineSpacingFromFallbacks(true);
        if (i19 >= 33) {
            builderObtain.setLineBreakConfig(e0.a().setLineBreakStyle(i16).setLineBreakWordStyle(i17).build());
        }
        if (i19 >= 35) {
            builderObtain.setUseBoundsForWidth(false);
        }
        return builderObtain.build();
    }
}
