package na;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements q {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ ma.a f18648a;

    @Override // com.google.android.gms.common.api.internal.q
    public final void accept(Object obj, Object obj2) throws RemoteException {
        ((d) ((l) obj).getService()).p(this.f18648a, new i((TaskCompletionSource) obj2));
    }
}
