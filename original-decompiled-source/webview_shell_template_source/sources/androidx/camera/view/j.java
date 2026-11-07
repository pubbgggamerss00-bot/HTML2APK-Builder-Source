package androidx.camera.view;

import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.view.PreviewView;
import androidx.camera.view.k;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements k.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PreviewView.a f697a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f698b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CameraInternal f699c;

    public /* synthetic */ j(PreviewView.a aVar, d dVar, CameraInternal cameraInternal) {
        this.f697a = aVar;
        this.f698b = dVar;
        this.f699c = cameraInternal;
    }

    public final void a() {
        d dVar;
        AtomicReference<d> atomicReference = PreviewView.this.mActiveStreamStateObserver;
        while (true) {
            dVar = this.f698b;
            if (atomicReference.compareAndSet(dVar, null)) {
                dVar.a(PreviewView.f.s);
                break;
            } else if (atomicReference.get() != dVar) {
                break;
            }
        }
        FutureChain futureChain = dVar.f683e;
        if (futureChain != null) {
            futureChain.cancel(false);
            dVar.f683e = null;
        }
        this.f699c.getCameraState().removeObserver(dVar);
    }
}
