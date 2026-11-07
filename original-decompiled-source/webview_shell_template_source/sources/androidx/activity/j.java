package androidx.activity;

import androidx.activity.ComponentActivity;
import com.google.android.material.button.MaterialButton;
import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f69t;

    public /* synthetic */ j(int i6, Object obj) {
        this.s = i6;
        this.f69t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                ComponentActivity.e eVar = (ComponentActivity.e) this.f69t;
                Runnable runnable = eVar.f39t;
                if (runnable != null) {
                    runnable.run();
                    eVar.f39t = null;
                    break;
                }
                break;
            case 1:
                r.a((r) this.f69t);
                break;
            case 2:
                ((ScheduledFuture) this.f69t).cancel(true);
                break;
            case 3:
                MaterialButton.a((MaterialButton) this.f69t);
                break;
            default:
                ((p5.a) this.f69t).a();
                break;
        }
    }
}
