package okhttp3.internal.connection;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class RouteException extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final IOException f19512a;

    /* renamed from: b, reason: collision with root package name */
    public IOException f19513b;

    public RouteException(IOException iOException) {
        super(iOException);
        this.f19512a = iOException;
        this.f19513b = iOException;
    }
}
