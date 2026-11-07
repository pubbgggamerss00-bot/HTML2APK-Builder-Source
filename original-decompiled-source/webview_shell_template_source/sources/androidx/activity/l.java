package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import androidx.activity.ComponentActivity;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f72t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f73u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f74v;

    public /* synthetic */ l(int i6, int i7, Object obj, Object obj2) {
        this.s = i7;
        this.f73u = obj;
        this.f72t = i6;
        this.f74v = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                ((ComponentActivity.f) this.f73u).a(this.f72t, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f74v));
                break;
            default:
                androidx.profileinstaller.b bVar = (androidx.profileinstaller.b) this.f73u;
                bVar.f1350b.b(this.f72t, this.f74v);
                break;
        }
    }
}
