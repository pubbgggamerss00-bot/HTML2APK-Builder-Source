package bc;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static b f4207b;

    /* renamed from: a, reason: collision with root package name */
    public final Object f4208a = new Object();

    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b bVar = b.this;
            C0054b c0054b = (C0054b) message.obj;
            synchronized (bVar.f4208a) {
                try {
                    if (c0054b == null || c0054b == null) {
                        c0054b.getClass();
                        throw null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    /* renamed from: bc.b$b, reason: collision with other inner class name */
    public static class C0054b {
    }

    public b() {
        new Handler(Looper.getMainLooper(), new a());
    }

    public static b a() {
        if (f4207b == null) {
            f4207b = new b();
        }
        return f4207b;
    }
}
