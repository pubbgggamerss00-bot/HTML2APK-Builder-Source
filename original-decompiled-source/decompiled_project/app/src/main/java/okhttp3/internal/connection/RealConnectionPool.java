package okhttp3.internal.connection;

import b.o;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.r;
import okhttp3.Address;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.platform.Platform;
import pg.f0;

/* loaded from: classes2.dex */
public final class RealConnectionPool {

    /* renamed from: a, reason: collision with root package name */
    public final long f19506a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskQueue f19507b;

    /* renamed from: c, reason: collision with root package name */
    public final RealConnectionPool$cleanupTask$1 f19508c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentLinkedQueue<RealConnection> f19509d;

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [okhttp3.internal.connection.RealConnectionPool$cleanupTask$1] */
    public RealConnectionPool(TaskRunner taskRunner) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        r.e(taskRunner, "taskRunner");
        r.e(timeUnit, "timeUnit");
        this.f19506a = timeUnit.toNanos(5L);
        this.f19507b = taskRunner.e();
        final String strA = o.a(new StringBuilder(), Util.f19399g, " ConnectionPool");
        this.f19508c = new Task(strA) { // from class: okhttp3.internal.connection.RealConnectionPool$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public final long a() {
                RealConnectionPool realConnectionPool = this.f19510e;
                long jNanoTime = System.nanoTime();
                Iterator<RealConnection> it = realConnectionPool.f19509d.iterator();
                int i10 = 0;
                long j10 = Long.MIN_VALUE;
                RealConnection realConnection = null;
                int i11 = 0;
                while (it.hasNext()) {
                    RealConnection connection = it.next();
                    r.d(connection, "connection");
                    synchronized (connection) {
                        if (realConnectionPool.b(connection, jNanoTime) > 0) {
                            i11++;
                        } else {
                            i10++;
                            long j11 = jNanoTime - connection.f19500q;
                            if (j11 > j10) {
                                realConnection = connection;
                                j10 = j11;
                            }
                            f0 f0Var = f0.f21461a;
                        }
                    }
                }
                long j12 = realConnectionPool.f19506a;
                if (j10 < j12 && i10 <= 5) {
                    if (i10 > 0) {
                        return j12 - j10;
                    }
                    if (i11 > 0) {
                        return j12;
                    }
                    return -1L;
                }
                r.b(realConnection);
                synchronized (realConnection) {
                    if (!realConnection.f19499p.isEmpty()) {
                        return 0L;
                    }
                    if (realConnection.f19500q + j10 != jNanoTime) {
                        return 0L;
                    }
                    realConnection.f19493j = true;
                    realConnectionPool.f19509d.remove(realConnection);
                    Socket socket = realConnection.f19487d;
                    r.b(socket);
                    Util.d(socket);
                    if (realConnectionPool.f19509d.isEmpty()) {
                        realConnectionPool.f19507b.a();
                    }
                    return 0L;
                }
            }
        };
        this.f19509d = new ConcurrentLinkedQueue<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Address address, RealCall realCall, ArrayList arrayList, boolean z10) {
        Iterator<RealConnection> it = this.f19509d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            RealConnection connection = it.next();
            r.d(connection, "connection");
            synchronized (connection) {
                if (z10) {
                    try {
                        if (connection.f19490g != null) {
                            if (connection.h(address, arrayList)) {
                                realCall.b(connection);
                                return true;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else if (connection.h(address, arrayList)) {
                }
                f0 f0Var = f0.f21461a;
            }
        }
    }

    public final int b(RealConnection realConnection, long j10) {
        byte[] bArr = Util.f19393a;
        ArrayList arrayList = realConnection.f19499p;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                String str = "A connection to " + realConnection.f19485b.f19382a.f19157h + " was leaked. Did you forget to close a response body?";
                Platform.f19768a.getClass();
                Platform.f19769b.j(((RealCall.CallReference) reference).f19483a, str);
                arrayList.remove(i10);
                realConnection.f19493j = true;
                if (arrayList.isEmpty()) {
                    realConnection.f19500q = j10 - this.f19506a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
