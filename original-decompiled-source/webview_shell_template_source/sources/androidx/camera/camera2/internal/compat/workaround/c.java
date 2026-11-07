package androidx.camera.camera2.internal.compat.workaround;

import android.os.Bundle;
import androidx.camera.core.Preview;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import com.google.android.gms.ads.internal.zzv;
import e2.f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements o.a, Preview.SurfaceProvider, d.b, f.e {
    public static int c(int i6, int i7, boolean z6) {
        return (Boolean.hashCode(z6) + i6) * i7;
    }

    public static String d(int i6, String str) {
        return str + i6;
    }

    public static void e(int i6, HashMap map, String str, int i7, String str2) {
        map.put(str, Integer.valueOf(i6));
        map.put(str2, Integer.valueOf(i7));
    }

    public static void f(String str, Bundle bundle) {
        bundle.putLong(str, zzv.zzC().a());
    }

    @Override // e2.f.e
    public void a(f.d dVar, f fVar) {
        dVar.f(fVar);
    }

    @Override // o.a
    public Object apply(Object obj) {
        return RequestMonitor.lambda$getRequestsProcessedFuture$0((List) obj);
    }

    @Override // d.b
    public void b(Object obj) {
        j.e("<unused var>", (Map) obj);
    }

    @Override // androidx.camera.core.Preview.SurfaceProvider
    public void onSurfaceRequested(SurfaceRequest surfaceRequest) {
        CameraUseCaseAdapter.lambda$createExtraPreview$1(surfaceRequest);
    }
}
