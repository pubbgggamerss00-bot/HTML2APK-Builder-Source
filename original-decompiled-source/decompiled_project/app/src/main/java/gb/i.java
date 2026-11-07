package gb;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.internal.identity_credentials.zzh;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements q {

    /* renamed from: a, reason: collision with root package name */
    public final Object f11913a;

    public /* synthetic */ i(fb.c cVar) {
        this.f11913a = cVar;
    }

    @Override // com.google.android.gms.common.api.internal.q
    public void accept(Object obj, Object obj2) throws RemoteException {
        fb.c cVar = (fb.c) this.f11913a;
        d dVar = (d) obj;
        ((b) dVar.getService()).s(new f((TaskCompletionSource) obj2), cVar, zzh.zza(dVar.getContext()));
    }

    public i(g1.d dVar) {
        this.f11913a = new WeakReference(dVar);
    }
}
