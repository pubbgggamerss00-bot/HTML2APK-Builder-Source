package androidx.camera.lifecycle;

import android.content.Context;
import androidx.camera.lifecycle.ProcessCameraProvider;
import com.google.android.gms.internal.ads.as1;
import g5.d;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.j;
import w5.i;
import y.c;
import y5.f;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ProcessCameraProviderExtKt {
    public static final Object awaitInstance(ProcessCameraProvider.Companion companion, Context context, d<? super ProcessCameraProvider> dVar) throws Throwable {
        c5.a<ProcessCameraProvider> companion2 = companion.getInstance(context);
        try {
            if (companion2.isDone()) {
                return y.a.e(companion2);
            }
            f fVar = new f(a1.a.f(dVar));
            companion2.addListener(new as1(12, companion2, fVar), c.s);
            fVar.o(new i(1, companion2));
            return fVar.l();
        } catch (ExecutionException e6) {
            Throwable cause = e6.getCause();
            if (cause != null) {
                throw cause;
            }
            d5.a aVar = new d5.a();
            j.f(aVar, j.class.getName());
            throw aVar;
        }
    }
}
