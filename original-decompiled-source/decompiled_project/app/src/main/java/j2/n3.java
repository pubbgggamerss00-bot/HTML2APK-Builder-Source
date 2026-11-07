package j2;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class n3 {
    public static final int a(float f10) {
        return ((int) (f10 >= CropImageView.DEFAULT_ASPECT_RATIO ? Math.ceil(f10) : Math.floor(f10))) * (-1);
    }
}
