package okhttp3.internal.ws;

import c0.g0;
import java.io.Closeable;
import java.util.List;
import okhttp3.Protocol;
import okhttp3.WebSocket;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.ws.WebSocketReader;

/* loaded from: classes2.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final List<Protocol> f19810a;

    public static final class Close {
    }

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Message {
    }

    public static abstract class Streams implements Closeable {
    }

    public final class WriterTask extends Task {
        public WriterTask() {
            throw null;
        }

        @Override // okhttp3.internal.concurrent.Task
        public final long a() {
            throw null;
        }
    }

    static {
        new Companion(0);
        f19810a = g0.c(Protocol.HTTP_1_1);
    }
}
