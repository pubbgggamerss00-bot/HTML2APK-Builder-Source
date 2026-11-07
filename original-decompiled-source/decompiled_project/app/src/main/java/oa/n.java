package oa;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public abstract class n<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f19098a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource<T> f19099b = new TaskCompletionSource<>();

    /* renamed from: c, reason: collision with root package name */
    public final int f19100c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f19101d;

    public n(int i10, Bundle bundle) {
        this.f19098a = i10;
        this.f19101d = bundle;
    }

    public abstract void a(Bundle bundle);

    public final void b(m mVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(mVar);
            StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 14);
            sb.append("Failing ");
            sb.append(strValueOf);
            sb.append(" with ");
            sb.append(strValueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f19099b.setException(mVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(this.f19100c);
        sb.append(" id=");
        sb.append(this.f19098a);
        sb.append(" oneWay=false}");
        return sb.toString();
    }
}
