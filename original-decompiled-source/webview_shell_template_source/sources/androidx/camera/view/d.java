package androidx.camera.view;

import androidx.camera.core.Logger;
import androidx.camera.core.d0;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.view.PreviewView;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d implements Observable.Observer<CameraInternal.State> {

    /* renamed from: a, reason: collision with root package name */
    public final CameraInfoInternal f679a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.r<PreviewView.f> f680b;

    /* renamed from: c, reason: collision with root package name */
    public PreviewView.f f681c;

    /* renamed from: d, reason: collision with root package name */
    public final k f682d;

    /* renamed from: e, reason: collision with root package name */
    public FutureChain f683e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f684f = false;

    public d(CameraInfoInternal cameraInfoInternal, androidx.lifecycle.r<PreviewView.f> rVar, k kVar) {
        this.f679a = cameraInfoInternal;
        this.f680b = rVar;
        this.f682d = kVar;
        synchronized (this) {
            this.f681c = rVar.getValue();
        }
    }

    public final void a(PreviewView.f fVar) {
        synchronized (this) {
            try {
                if (this.f681c.equals(fVar)) {
                    return;
                }
                this.f681c = fVar;
                Logger.d("StreamStateObserver", "Update Preview stream state to " + fVar);
                this.f680b.postValue(fVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.Observable.Observer
    public final void onError(Throwable th) {
        FutureChain futureChain = this.f683e;
        if (futureChain != null) {
            futureChain.cancel(false);
            this.f683e = null;
        }
        a(PreviewView.f.s);
    }

    @Override // androidx.camera.core.impl.Observable.Observer
    public final void onNewData(CameraInternal.State state) {
        CameraInternal.State state2 = state;
        CameraInternal.State state3 = CameraInternal.State.CLOSING;
        PreviewView.f fVar = PreviewView.f.s;
        if (state2 == state3 || state2 == CameraInternal.State.CLOSED || state2 == CameraInternal.State.RELEASING || state2 == CameraInternal.State.RELEASED) {
            a(fVar);
            if (this.f684f) {
                this.f684f = false;
                FutureChain futureChain = this.f683e;
                if (futureChain != null) {
                    futureChain.cancel(false);
                    this.f683e = null;
                    return;
                }
                return;
            }
            return;
        }
        if ((state2 == CameraInternal.State.OPENING || state2 == CameraInternal.State.OPEN || state2 == CameraInternal.State.PENDING_OPEN) && !this.f684f) {
            a(fVar);
            ArrayList arrayList = new ArrayList();
            CameraInfoInternal cameraInfoInternal = this.f679a;
            FutureChain futureChainTransform = FutureChain.from(y.b.a(new d0(this, cameraInfoInternal, arrayList))).transformAsync(new androidx.camera.core.streamsharing.c(1, this), CameraXExecutors.directExecutor()).transform(new androidx.camera.core.impl.utils.futures.b(1, this), CameraXExecutors.directExecutor());
            this.f683e = futureChainTransform;
            Futures.addCallback(futureChainTransform, new b(this, arrayList, cameraInfoInternal, 0), CameraXExecutors.directExecutor());
            this.f684f = true;
        }
    }
}
