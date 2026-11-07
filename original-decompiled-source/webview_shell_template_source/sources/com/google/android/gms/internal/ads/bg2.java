package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class bg2 {
    public static int a(boolean z6) {
        List supportedPerformancePoints;
        try {
            tk2 tk2Var = new tk2();
            tk2Var.c("video/avc");
            w wVar = new w(tk2Var);
            String str = wVar.f9978m;
            if (str != null) {
                List listB = pg2.b(z6, false, str);
                String strA = pg2.a(wVar);
                Iterable iterableB = strA == null ? cp1.f3636w : pg2.b(z6, false, strA);
                yn1 yn1Var = new yn1();
                yn1Var.r(listB);
                yn1Var.r(iterableB);
                cp1 cp1VarT = yn1Var.t();
                for (int i6 = 0; i6 < cp1VarT.f3638v; i6++) {
                    if (((zf2) cp1VarT.get(i6)).f11285d != null && ((zf2) cp1VarT.get(i6)).f11285d.getVideoCapabilities() != null && (supportedPerformancePoints = ((zf2) cp1VarT.get(i6)).f11285d.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        androidx.activity.x.f();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointB = ag2.b();
                        for (int i7 = 0; i7 < supportedPerformancePoints.size(); i7++) {
                            if (androidx.camera.camera2.internal.compat.c.b(supportedPerformancePoints.get(i7)).covers(performancePointB)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (jg2 unused) {
        }
        return 0;
    }
}
