package j3;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class f0 extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRect(0, 0, view.getWidth(), view.getHeight());
        outline.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
    }
}
