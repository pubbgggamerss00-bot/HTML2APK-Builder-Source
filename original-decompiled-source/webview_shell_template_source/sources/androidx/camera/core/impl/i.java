package androidx.camera.core.impl;

import androidx.camera.core.impl.LiveDataObservable;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f548t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f549u;

    public /* synthetic */ i(int i6, Object obj, Object obj2) {
        this.s = i6;
        this.f548t = obj;
        this.f549u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws ExecutionException, InterruptedException {
        switch (this.s) {
            case 0:
                ((LiveDataObservable.LiveDataObserverAdapter) this.f548t).lambda$onChanged$0((LiveDataObservable.Result) this.f549u);
                break;
            default:
                ((DeferrableSurface) this.f548t).lambda$new$2((String) this.f549u);
                break;
        }
    }
}
