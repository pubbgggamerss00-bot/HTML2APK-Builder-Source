package okhttp3;

import okhttp3.internal.connection.RealCall;

/* loaded from: classes2.dex */
public interface Call extends Cloneable {

    public interface Factory {
        RealCall a(Request request);
    }

    void cancel();

    boolean isCanceled();
}
