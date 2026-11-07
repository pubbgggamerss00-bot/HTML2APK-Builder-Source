package na;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements q {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ ma.g f18650a;

    @Override // com.google.android.gms.common.api.internal.q
    public final void accept(Object obj, Object obj2) throws RemoteException {
        ((d) ((l) obj).getService()).r(this.f18650a, new k((TaskCompletionSource) obj2));
    }
}
