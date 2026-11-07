package d7;

import android.app.Application;
import android.content.Context;

/* loaded from: classes.dex */
public final class r {
    static {
        kotlin.jvm.internal.r.d(t6.s.f("ProcessUtils"), "tagWithPrefix(\"ProcessUtils\")");
    }

    public static final boolean a(Context context, androidx.work.a configuration) {
        kotlin.jvm.internal.r.e(context, "context");
        kotlin.jvm.internal.r.e(configuration, "configuration");
        String processName = Application.getProcessName();
        kotlin.jvm.internal.r.d(processName, "getProcessName()");
        return processName.equals(context.getApplicationInfo().processName);
    }
}
