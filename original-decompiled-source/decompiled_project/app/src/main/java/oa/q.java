package oa;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* loaded from: classes2.dex */
public final /* synthetic */ class q implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public static final q f19105a = new q();

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) throws IOException {
        if (task.isSuccessful()) {
            return (Bundle) task.getResult();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String strValueOf = String.valueOf(task.getException());
            StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
            sb.append("Error making request: ");
            sb.append(strValueOf);
            Log.d("Rpc", sb.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
    }
}
