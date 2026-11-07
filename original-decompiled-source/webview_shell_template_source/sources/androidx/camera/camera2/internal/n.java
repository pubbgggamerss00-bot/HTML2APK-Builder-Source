package androidx.camera.camera2.internal;

import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfig;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Camera2CameraImpl f433t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f434u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ SessionConfig f435v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ UseCaseConfig f436w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ StreamSpec f437x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ List f438y;

    public /* synthetic */ n(Camera2CameraImpl camera2CameraImpl, String str, SessionConfig sessionConfig, UseCaseConfig useCaseConfig, StreamSpec streamSpec, List list, int i6) {
        this.s = i6;
        this.f433t = camera2CameraImpl;
        this.f434u = str;
        this.f435v = sessionConfig;
        this.f436w = useCaseConfig;
        this.f437x = streamSpec;
        this.f438y = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                this.f433t.lambda$onUseCaseActive$7(this.f434u, this.f435v, this.f436w, this.f437x, this.f438y);
                break;
            default:
                this.f433t.lambda$resetUseCase$10(this.f434u, this.f435v, this.f436w, this.f437x, this.f438y);
                break;
        }
    }
}
