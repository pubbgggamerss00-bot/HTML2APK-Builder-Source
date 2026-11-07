package oa;

import android.os.Bundle;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* loaded from: classes2.dex */
public final /* synthetic */ class t implements SuccessContinuation {

    /* renamed from: a, reason: collision with root package name */
    public static final t f19109a = new t();

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        Bundle bundle = (Bundle) obj;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? Tasks.forResult(bundle) : Tasks.forResult(null);
    }
}
