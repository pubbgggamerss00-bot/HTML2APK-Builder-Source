package hc;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class h extends ic.f {

    /* renamed from: a, reason: collision with root package name */
    public final ic.g f12981a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f12982b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f12983c;

    public h(i iVar, TaskCompletionSource taskCompletionSource) {
        ic.g gVar = new ic.g("OnRequestInstallCallback");
        this.f12983c = iVar;
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.f12981a = gVar;
        this.f12982b = taskCompletionSource;
    }
}
