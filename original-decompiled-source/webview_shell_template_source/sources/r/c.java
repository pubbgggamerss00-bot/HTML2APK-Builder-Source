package r;

import android.content.Context;
import androidx.camera.camera2.Camera2Config;
import androidx.camera.core.impl.UseCaseConfigFactory;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements UseCaseConfigFactory.Provider {
    @Override // androidx.camera.core.impl.UseCaseConfigFactory.Provider
    public final UseCaseConfigFactory newInstance(Context context) {
        return Camera2Config.lambda$defaultConfig$1(context);
    }
}
