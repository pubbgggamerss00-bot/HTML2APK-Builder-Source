package hc;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import ic.k;
import ic.q;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final i f12977a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f12978b = new Handler(Looper.getMainLooper());

    public f(i iVar) {
        this.f12977a = iVar;
    }

    public final Task<b> a() {
        String str;
        i iVar = this.f12977a;
        String str2 = iVar.f12986b;
        ic.g gVar = i.f12984c;
        gVar.a("requestInAppReview (%s)", str2);
        q qVar = iVar.f12985a;
        if (qVar != null) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            qVar.a().post(new k(qVar, taskCompletionSource, taskCompletionSource, new g(iVar, taskCompletionSource, taskCompletionSource)));
            return taskCompletionSource.getTask();
        }
        Object[] objArr = new Object[0];
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", ic.g.c(gVar.f14444a, "Play Store app is either not installed or not the official version", objArr));
        }
        Locale locale = Locale.getDefault();
        HashMap map = jc.a.f15678a;
        if (map.containsKey(-1)) {
            str = ((String) map.get(-1)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) jc.a.f15679b.get(-1)) + ")";
        } else {
            str = "";
        }
        return Tasks.forException(new a(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, str), null, null)));
    }
}
