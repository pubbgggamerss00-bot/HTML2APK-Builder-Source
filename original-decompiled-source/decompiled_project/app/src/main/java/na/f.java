package na;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements q {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ ma.c f18649a;

    @Override // com.google.android.gms.common.api.internal.q
    public final void accept(Object obj, Object obj2) throws RemoteException {
        ((d) ((l) obj).getService()).d(this.f18649a, new j((TaskCompletionSource) obj2));
    }
}
