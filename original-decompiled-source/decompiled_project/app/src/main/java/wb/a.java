package wb;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes2.dex */
public final class a {
    public static float a(int i10, String[] strArr) throws NumberFormatException {
        float f10 = Float.parseFloat(strArr[i10]);
        if (f10 >= CropImageView.DEFAULT_ASPECT_RATIO && f10 <= 1.0f) {
            return f10;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f10);
    }

    public static boolean b(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }
}
