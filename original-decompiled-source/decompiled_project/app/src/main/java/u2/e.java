package u2;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final /* synthetic */ class e {
    public static /* synthetic */ BoringLayout a(CharSequence charSequence, TextPaint textPaint, int i10, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z10, TextUtils.TruncateAt truncateAt, int i11) {
        return new BoringLayout(charSequence, textPaint, i10, alignment, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO, metrics, z10, truncateAt, i11, true);
    }
}
