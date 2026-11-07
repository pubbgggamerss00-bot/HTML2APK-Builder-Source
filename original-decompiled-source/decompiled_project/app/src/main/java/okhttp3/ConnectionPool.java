package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.r;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealConnectionPool;

/* loaded from: classes2.dex */
public final class ConnectionPool {

    /* renamed from: a, reason: collision with root package name */
    public final RealConnectionPool f19207a;

    public ConnectionPool() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        r.e(timeUnit, "timeUnit");
        this.f19207a = new RealConnectionPool(TaskRunner.f19421i);
    }
}
