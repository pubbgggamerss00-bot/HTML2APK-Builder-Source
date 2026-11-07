package d3;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.util.VisibleForTesting;
import d3.a.c;
import d3.e;
import e3.r;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a<O extends c> {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0045a<?, O> f12710a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12711b;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @VisibleForTesting
    /* renamed from: d3.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0045a<T extends e, O> extends d<T, O> {
        @Deprecated
        public T a(Context context, Looper looper, com.google.android.gms.common.internal.c cVar, O o6, e.a aVar, e.b bVar) {
            return (T) b(context, looper, cVar, o6, (r) aVar, (r) bVar);
        }

        public e b(Context context, Looper looper, com.google.android.gms.common.internal.c cVar, Object obj, r rVar, r rVar2) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b<C> {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface c {

        /* renamed from: a, reason: collision with root package name */
        public static final C0047c f12712a = new C0047c();

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        /* renamed from: d3.a$c$a, reason: collision with other inner class name */
        public interface InterfaceC0046a extends c {
            Account b();
        }

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public interface b extends c {
            GoogleSignInAccount a();
        }

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        /* renamed from: d3.a$c$c, reason: collision with other inner class name */
        public static final class C0047c implements c {
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @VisibleForTesting
    public static abstract class d<T, O> {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface e {
        Set<Scope> b();

        void connect(b.c cVar);

        void disconnect();

        void disconnect(String str);

        c3.d[] getAvailableFeatures();

        String getEndpointPackageName();

        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(com.google.android.gms.common.internal.h hVar, Set<Scope> set);

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(b.e eVar);

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @VisibleForTesting
    public static final class f<C extends e> extends b<C> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends e> a(String str, AbstractC0045a<C, O> abstractC0045a, f<C> fVar) {
        this.f12711b = str;
        this.f12710a = abstractC0045a;
    }
}
