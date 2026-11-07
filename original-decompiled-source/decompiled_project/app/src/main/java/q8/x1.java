package q8;

import android.content.Context;
import android.provider.Settings;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public static final x0.m0 f22493a = new x0.m0(new w1());

    public static final boolean a(x0.j jVar) {
        jVar.L(-1380936107);
        if (!((Boolean) jVar.f(f22493a)).booleanValue()) {
            jVar.B();
            return true;
        }
        boolean z10 = false;
        try {
            z10 = Settings.Global.getFloat(((Context) jVar.f(AndroidCompositionLocals_androidKt.f1281b)).getContentResolver(), "animator_duration_scale") == CropImageView.DEFAULT_ASPECT_RATIO;
        } catch (Exception unused) {
        }
        jVar.B();
        return z10;
    }
}
