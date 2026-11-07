package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.core.impl.Config;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class CaptureRequestParameterCompat {
    public static final CaptureRequestParameterCompat INSTANCE = new CaptureRequestParameterCompat();

    private CaptureRequestParameterCompat() {
    }

    public static final void setSettingsOverrideZoom(Camera2ImplConfig.Builder builder, Config.OptionPriority optionPriority) {
        j.e("options", builder);
        j.e("priority", optionPriority);
        if (Build.VERSION.SDK_INT >= 34) {
            builder.setCaptureRequestOptionWithPriority(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1, optionPriority);
        }
    }
}
