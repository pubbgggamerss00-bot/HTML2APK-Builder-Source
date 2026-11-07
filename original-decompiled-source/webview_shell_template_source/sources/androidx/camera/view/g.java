package androidx.camera.view;

import android.graphics.pdf.PdfRenderer;
import com.google.android.gms.internal.ads.p42;
import com.google.android.material.textfield.TextInputLayout;
import e2.f;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements f.e, TextInputLayout.f {
    public static /* synthetic */ String b(int i6) {
        if (i6 == 1) {
            return "htmlDisplay";
        }
        if (i6 == 2) {
            return "nativeDisplay";
        }
        if (i6 == 3) {
            return "video";
        }
        throw null;
    }

    public static int c(int i6, int i7, int i8) {
        return p42.r(i6) + i7 + i8;
    }

    public static int d(int i6, int i7, String str) {
        return (str.hashCode() + i6) * i7;
    }

    public static String e(String str, int i6, int i7, String str2) {
        return str + i6 + str2 + i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void f(PdfRenderer.Page page) throws Exception {
        boolean zIsTerminated;
        if (page instanceof AutoCloseable) {
            page.close();
            return;
        }
        if (!(page instanceof ExecutorService)) {
            throw new IllegalArgumentException();
        }
        ExecutorService executorService = (ExecutorService) page;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z6 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z6) {
                    executorService.shutdownNow();
                    z6 = true;
                }
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ String g(int i6) {
        return i6 != 1 ? i6 != 2 ? i6 != 3 ? "null" : "VIDEO" : "NATIVE_DISPLAY" : "HTML_DISPLAY";
    }

    @Override // e2.f.e
    public void a(f.d dVar, e2.f fVar) {
        dVar.c(fVar);
    }
}
