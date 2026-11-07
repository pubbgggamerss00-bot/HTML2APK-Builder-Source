package androidx.activity;

import android.graphics.pdf.PdfRenderer;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import i2.a;
import java.io.Closeable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import l.j1;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class c0 implements d0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(PdfRenderer.Page page, Throwable th) {
        boolean zIsTerminated;
        if (page != 0) {
            if (th != null) {
                try {
                    androidx.camera.view.g.f(page);
                    return;
                } catch (Throwable th2) {
                    y5.b0.a(th, th2);
                    return;
                }
            }
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
    }

    public static final void d(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                y5.b0.a(th, th2);
            }
        }
    }

    public static boolean f(String str) {
        a.d dVar = i2.j.f13351a;
        Set<i2.c> setUnmodifiableSet = Collections.unmodifiableSet(i2.a.f13344c);
        HashSet hashSet = new HashSet();
        for (i2.c cVar : setUnmodifiableSet) {
            if (cVar.a().equals(str)) {
                hashSet.add(cVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((i2.c) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    public static d5.f g(p5.a aVar) {
        kotlin.jvm.internal.j.e("initializer", aVar);
        return new d5.f(aVar);
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof j1) {
                editorInfo.hintText = ((j1) parent).a();
                return;
            }
        }
    }

    public void e(u4.n nVar, float f6, float f7) {
        throw null;
    }

    @Override // androidx.activity.d0
    public void b(Window window) {
    }
}
