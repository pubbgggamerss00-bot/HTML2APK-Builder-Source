package gb;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.identity_credentials.zze;
import com.google.android.gms.internal.identity_credentials.zzh;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import fb.e0;
import fb.m;
import gb.e;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class e extends com.google.android.gms.common.api.g<a.d.c> {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.android.gms.common.api.a<a.d.c> f11907a = new com.google.android.gms.common.api.a<>("IdentityCredentials.API", new a(), new a.g());

    public static final class a extends a.AbstractC0063a<d, a.d.c> {
        @Override // com.google.android.gms.common.api.a.AbstractC0063a
        public final a.f buildClient(Context context, Looper looper, com.google.android.gms.common.internal.d commonSettings, a.d.c cVar, com.google.android.gms.common.api.internal.f connectedListener, n connectionFailedListener) {
            a.d.c apiOptions = cVar;
            r.e(context, "context");
            r.e(looper, "looper");
            r.e(commonSettings, "commonSettings");
            r.e(apiOptions, "apiOptions");
            r.e(connectedListener, "connectedListener");
            r.e(connectionFailedListener, "connectionFailedListener");
            return new d(context, looper, 352, commonSettings, connectedListener, connectionFailedListener);
        }
    }

    public static final class b extends gb.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TaskCompletionSource<fb.k> f11908a;

        public b(TaskCompletionSource<fb.k> taskCompletionSource) {
            this.f11908a = taskCompletionSource;
        }

        @Override // gb.c, gb.a
        public final void o(Status status, fb.k kVar) {
            r.e(status, "status");
            v.a(status, kVar, this.f11908a);
        }
    }

    public static final class c extends gb.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TaskCompletionSource<e0> f11909a;

        public c(TaskCompletionSource<e0> taskCompletionSource) {
            this.f11909a = taskCompletionSource;
        }

        @Override // gb.c, gb.a
        public final void l(Status status, e0 e0Var) {
            r.e(status, "status");
            v.a(status, e0Var, this.f11909a);
        }
    }

    public final Task<fb.k> a(m request) {
        r.e(request, "request");
        u.a aVarA = u.a();
        aVarA.f6058c = new pa.c[]{zze.zzf};
        aVarA.f6056a = new h(request);
        aVarA.f6059d = 32704;
        Task taskDoWrite = doWrite(aVarA.a());
        r.d(taskDoWrite, "doWrite(...)");
        return taskDoWrite;
    }

    public final Task<e0> b(final GetCredentialRequest request) {
        r.e(request, "request");
        u.a aVarA = u.a();
        aVarA.f6058c = new pa.c[]{zze.zza};
        aVarA.f6056a = new q() { // from class: gb.k
            @Override // com.google.android.gms.common.api.internal.q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                d dVar = (d) obj;
                e.c cVar = new e.c((TaskCompletionSource) obj2);
                ((b) dVar.getService()).F(cVar, request, zzh.zza(dVar.getContext()));
            }
        };
        aVarA.f6059d = 32701;
        Task taskDoRead = doRead(aVarA.a());
        r.d(taskDoRead, "doRead(...)");
        return taskDoRead;
    }
}
