package androidx.camera.core;

import androidx.camera.core.impl.ImageReaderProxy;
import com.google.android.gms.internal.ads.qs0;
import com.google.android.gms.internal.consent_sdk.k6;
import e2.f;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements ImageReaderProxy.OnImageAvailableListener, f.e {
    public static /* synthetic */ String b(int i6) {
        if (i6 == 1) {
            return "beginToRender";
        }
        if (i6 == 2) {
            return "definedByJavascript";
        }
        if (i6 == 3) {
            return "onePixel";
        }
        if (i6 == 4) {
            return "unspecified";
        }
        throw null;
    }

    public static int c(int i6, int i7, int i8) {
        return k6.c(i6) + i7 + i8;
    }

    public static void d(String str, String str2, String str3) {
        qs0.f(str3, str2.concat(String.valueOf(str)));
    }

    @Override // e2.f.e
    public void a(f.d dVar, e2.f fVar) {
        dVar.a();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        ImageCapture.lambda$new$0(imageReaderProxy);
    }
}
