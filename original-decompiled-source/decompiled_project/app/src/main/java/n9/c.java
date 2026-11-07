package n9;

import android.os.Handler;
import android.os.Looper;
import e9.w0;
import kotlin.jvm.internal.s;
import pg.k;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f18645a = w0.a(k.f21467b, a.f18646a);

    public static final class a extends s implements eh.a<Handler> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f18646a = new a(0);

        @Override // eh.a
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }
}
