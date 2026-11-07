package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class StreamResetException extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final ErrorCode f19737a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamResetException(ErrorCode errorCode) {
        super("stream was reset: " + errorCode);
        r.e(errorCode, "errorCode");
        this.f19737a = errorCode;
    }
}
