package androidx.camera.core.impl;

import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class DeferrableSurfaces {
    private DeferrableSurfaces() {
    }

    public static void decrementAll(List<DeferrableSurface> list) {
        Iterator<DeferrableSurface> it = list.iterator();
        while (it.hasNext()) {
            it.next().decrementUseCount();
        }
    }

    public static void incrementAll(List<DeferrableSurface> list) {
        if (list.isEmpty()) {
            return;
        }
        int i6 = 0;
        do {
            try {
                list.get(i6).incrementUseCount();
                i6++;
            } catch (DeferrableSurface.SurfaceClosedException e6) {
                for (int i7 = i6 - 1; i7 >= 0; i7--) {
                    list.get(i7).decrementUseCount();
                }
                throw e6;
            }
        } while (i6 < list.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object lambda$surfaceListWithTimeout$1(c5.a aVar, Executor executor, final boolean z6, Collection collection, final b.a aVar2) {
        androidx.activity.o oVar = new androidx.activity.o(1, aVar);
        y.d<Void> dVar = aVar2.f15192c;
        if (dVar != null) {
            dVar.addListener(oVar, executor);
        }
        Futures.addCallback(aVar, new FutureCallback<List<Surface>>() { // from class: androidx.camera.core.impl.DeferrableSurfaces.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
                if (th instanceof TimeoutException) {
                    aVar2.b(th);
                } else {
                    aVar2.a(Collections.EMPTY_LIST);
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(List<Surface> list) {
                list.getClass();
                ArrayList arrayList = new ArrayList(list);
                if (z6) {
                    arrayList.removeAll(Collections.singleton(null));
                }
                aVar2.a(arrayList);
            }
        }, executor);
        return "surfaceList[" + collection + "]";
    }

    public static c5.a<List<Surface>> surfaceListWithTimeout(final Collection<DeferrableSurface> collection, final boolean z6, long j6, final Executor executor, ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        Iterator<DeferrableSurface> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(Futures.nonCancellationPropagating(it.next().getSurface()));
        }
        final c5.a aVarMakeTimeoutFuture = Futures.makeTimeoutFuture(j6, scheduledExecutorService, Futures.successfulAsList(arrayList));
        return y.b.a(new b.c() { // from class: androidx.camera.core.impl.f
            @Override // y.b.c
            public final Object attachCompleter(b.a aVar) {
                return DeferrableSurfaces.lambda$surfaceListWithTimeout$1(aVarMakeTimeoutFuture, executor, z6, collection, aVar);
            }
        });
    }

    public static boolean tryIncrementAll(List<DeferrableSurface> list) {
        try {
            incrementAll(list);
            return true;
        } catch (DeferrableSurface.SurfaceClosedException unused) {
            return false;
        }
    }
}
