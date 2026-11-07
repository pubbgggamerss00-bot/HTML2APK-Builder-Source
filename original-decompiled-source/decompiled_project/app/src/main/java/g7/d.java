package g7;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.lifecycle.x0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import sh.z0;
import x0.n1;
import x0.x1;
import x8.j6;
import x8.l7;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11482a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11483b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11484c;

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.f11482a = i10;
        this.f11483b = obj;
        this.f11484c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.a
    public final Object invoke() {
        switch (this.f11482a) {
            case 0:
                break;
            case 1:
                v8.q qVar = (v8.q) this.f11483b;
                if (!((Boolean) ((n1) this.f11484c).getValue()).booleanValue() && ((String) qVar.f30742f.getValue()) == null) {
                    x1 x1Var = qVar.f30740d;
                    Boolean bool = Boolean.FALSE;
                    x1Var.setValue(bool);
                    qVar.f30739c.setValue(bool);
                }
                break;
            default:
                j6 j6Var = (j6) this.f11483b;
                Context context = (Context) this.f11484c;
                j6Var.f32793t = true;
                z0 z0Var = j6Var.f32794u;
                Boolean bool2 = Boolean.FALSE;
                z0Var.getClass();
                z0Var.j(null, bool2);
                ph.h.c(x0.a(j6Var), null, null, new l7(j6Var, null), 3);
                final Activity activity = context instanceof Activity ? (Activity) context : null;
                if (activity != null) {
                    try {
                        Context applicationContext = activity.getApplicationContext();
                        if (applicationContext == null) {
                            applicationContext = activity;
                        }
                        final hc.f fVar = new hc.f(new hc.i(applicationContext));
                        Task<hc.b> taskA = fVar.a();
                        kotlin.jvm.internal.r.d(taskA, "requestReviewFlow(...)");
                        taskA.addOnCompleteListener(new OnCompleteListener() { // from class: l9.x
                            @Override // com.google.android.gms.tasks.OnCompleteListener
                            public final void onComplete(Task task) {
                                Task task2;
                                kotlin.jvm.internal.r.e(task, "task");
                                if (!task.isSuccessful()) {
                                    Log.w("InAppReviewHelper", "Review flow request unsuccessful", task.getException());
                                    return;
                                }
                                hc.b bVar = (hc.b) task.getResult();
                                if (bVar.b()) {
                                    task2 = Tasks.forResult(null);
                                } else {
                                    Activity activity2 = activity;
                                    Intent intent = new Intent(activity2, (Class<?>) PlayCoreDialogWrapperActivity.class);
                                    intent.putExtra("confirmation_intent", bVar.a());
                                    intent.putExtra("window_flags", activity2.getWindow().getDecorView().getWindowSystemUiVisibility());
                                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                                    intent.putExtra("result_receiver", new hc.e(fVar.f12978b, taskCompletionSource));
                                    activity2.startActivity(intent);
                                    task2 = taskCompletionSource.getTask();
                                }
                                kotlin.jvm.internal.r.d(task2, "launchReviewFlow(...)");
                                task2.addOnCompleteListener(new y());
                            }
                        });
                    } catch (Exception e10) {
                        Log.e("InAppReviewHelper", "Failed to launch in-app review", e10);
                    }
                }
                break;
        }
        return pg.f0.f21461a;
    }
}
