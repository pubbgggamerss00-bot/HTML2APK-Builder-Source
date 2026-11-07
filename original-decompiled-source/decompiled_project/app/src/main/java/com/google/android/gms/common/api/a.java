package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.b;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class a<O extends d> {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0063a f5914a;

    /* renamed from: b, reason: collision with root package name */
    public final g f5915b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5916c;

    /* renamed from: com.google.android.gms.common.api.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0063a<T extends f, O> extends e<T, O> {
        @Deprecated
        public T buildClient(Context context, Looper looper, com.google.android.gms.common.internal.d dVar, O o10, h.a aVar, h.b bVar) {
            return (T) buildClient(context, looper, dVar, (com.google.android.gms.common.internal.d) o10, (com.google.android.gms.common.api.internal.f) aVar, (com.google.android.gms.common.api.internal.n) bVar);
        }

        public T buildClient(Context context, Looper looper, com.google.android.gms.common.internal.d dVar, O o10, com.google.android.gms.common.api.internal.f fVar, com.google.android.gms.common.api.internal.n nVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c<C extends b> {
    }

    public interface d {

        /* renamed from: i, reason: collision with root package name */
        public static final c f5917i = new c();

        /* renamed from: com.google.android.gms.common.api.a$d$a, reason: collision with other inner class name */
        public interface InterfaceC0064a extends d {
            Account c();
        }

        public interface b extends d {
            GoogleSignInAccount b();
        }

        public static final class c implements d {
        }
    }

    public static abstract class e<T extends b, O> {
        public static final int API_PRIORITY_GAMES = 1;
        public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
        public static final int API_PRIORITY_PLUS = 2;

        public List<Scope> getImpliedScopes(O o10) {
            return Collections.EMPTY_LIST;
        }

        public int getPriority() {
            return Integer.MAX_VALUE;
        }
    }

    public interface f extends b {
        void connect(b.c cVar);

        void disconnect();

        void disconnect(String str);

        pa.c[] getAvailableFeatures();

        String getEndpointPackageName();

        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(com.google.android.gms.common.internal.j jVar, Set<Scope> set);

        Set<Scope> getScopesForConnectionlessNonSignIn();

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(b.e eVar);

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    public static final class g<C extends f> extends c<C> {
    }

    public <C extends f> a(String str, AbstractC0063a<C, O> abstractC0063a, g<C> gVar) {
        this.f5916c = str;
        this.f5914a = abstractC0063a;
        this.f5915b = gVar;
    }
}
