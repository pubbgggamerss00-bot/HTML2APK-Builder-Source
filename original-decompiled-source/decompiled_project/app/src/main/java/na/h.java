package na;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.n;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class h extends com.google.android.gms.common.api.g<a.d.c> {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.android.gms.common.api.a<a.d.c> f18651a = new com.google.android.gms.common.api.a<>("RestoreCredential.API", new a(), new a.g());

    public static final class a extends a.AbstractC0063a<l, a.d.c> {
        @Override // com.google.android.gms.common.api.a.AbstractC0063a
        public final a.f buildClient(Context context, Looper looper, com.google.android.gms.common.internal.d commonSettings, a.d.c cVar, com.google.android.gms.common.api.internal.f connectedListener, n connectionFailedListener) {
            a.d.c apiOptions = cVar;
            r.e(context, "context");
            r.e(looper, "looper");
            r.e(commonSettings, "commonSettings");
            r.e(apiOptions, "apiOptions");
            r.e(connectedListener, "connectedListener");
            r.e(connectionFailedListener, "connectionFailedListener");
            return new l(context, looper, 381, commonSettings, connectedListener, connectionFailedListener);
        }
    }
}
