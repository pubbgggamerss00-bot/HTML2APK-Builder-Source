package w4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static b f15085b;

    /* renamed from: a, reason: collision with root package name */
    public final Object f15086a = new Object();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b bVar = b.this;
            C0100b c0100b = (C0100b) message.obj;
            synchronized (bVar.f15086a) {
                try {
                    if (c0100b == null || c0100b == null) {
                        c0100b.getClass();
                        throw null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: w4.b$b, reason: collision with other inner class name */
    public static class C0100b {
    }

    public b() {
        new Handler(Looper.getMainLooper(), new a());
    }

    public static b a() {
        if (f15085b == null) {
            f15085b = new b();
        }
        return f15085b;
    }
}
