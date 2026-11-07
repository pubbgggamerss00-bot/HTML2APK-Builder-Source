package androidx.camera.core;

import androidx.camera.core.impl.SessionConfig;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements SessionConfig.ErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f570a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UseCase f571b;

    public /* synthetic */ k(UseCase useCase, int i6) {
        this.f570a = i6;
        this.f571b = useCase;
    }

    @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
    public final void onError(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        switch (this.f570a) {
            case 0:
                ((ImageAnalysis) this.f571b).lambda$createPipeline$2(sessionConfig, sessionError);
                break;
            default:
                ((ImageCapture) this.f571b).lambda$createPipeline$3(sessionConfig, sessionError);
                break;
        }
    }
}
