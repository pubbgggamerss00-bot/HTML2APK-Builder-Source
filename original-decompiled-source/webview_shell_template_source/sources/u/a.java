package u;

import androidx.camera.core.impl.QuirkSettingsHolder;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static volatile Quirks f14444a;

    static {
        QuirkSettingsHolder.instance().observe(CameraXExecutors.directExecutor(), new androidx.camera.core.internal.compat.quirk.a(1));
    }
}
