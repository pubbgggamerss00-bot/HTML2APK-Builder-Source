package androidx.camera.core;

import android.os.Parcel;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import com.google.android.gms.internal.ads.th;
import k3.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements p5.q {
    public static String b(String str, String str2) {
        return str + str2;
    }

    public static k3.a c(Parcel parcel, Parcel parcel2) {
        k3.a aVarR = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
        th.b(parcel2);
        return aVarR;
    }

    @Override // p5.q
    public DualSurfaceProcessor a(DynamicRange dynamicRange, LayoutSettings layoutSettings, LayoutSettings layoutSettings2) {
        return new DualSurfaceProcessor(dynamicRange, layoutSettings, layoutSettings2);
    }
}
