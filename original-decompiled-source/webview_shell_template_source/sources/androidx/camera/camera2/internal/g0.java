package androidx.camera.camera2.internal;

import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements o.a, p5.l {
    public static StringBuilder a(String str, int i6, String str2, int i7, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i6);
        sb.append(str2);
        sb.append(i7);
        sb.append(str3);
        return sb;
    }

    public static void b(SurfaceConfig.ConfigType configType, SurfaceConfig.ConfigSize configSize, SurfaceCombination surfaceCombination, SurfaceConfig.ConfigType configType2, SurfaceConfig.ConfigSize configSize2) {
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2));
    }

    @Override // o.a
    public Object apply(Object obj) {
        return new DefaultSurfaceProcessor((DynamicRange) obj);
    }

    @Override // p5.l
    public Object invoke(Object obj) {
        ((Float) obj).getClass();
        int i6 = w2.z.I;
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }
}
