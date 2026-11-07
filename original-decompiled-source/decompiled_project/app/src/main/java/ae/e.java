package ae;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Continuation {
    public static String a(Class cls, String str, String str2) {
        return str + cls + str2;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws Exception {
        kotlin.jvm.internal.r.e(task, "task");
        if (task.isSuccessful()) {
            return ((qd.q) task.getResult()).f22691a;
        }
        Exception exception = task.getException();
        if (exception instanceof me.a) {
            return null;
        }
        kotlin.jvm.internal.r.b(exception);
        throw exception;
    }
}
