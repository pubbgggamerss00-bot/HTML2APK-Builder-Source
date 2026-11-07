package okhttp3;

import java.io.IOException;

/* loaded from: classes2.dex */
public interface Callback {
    void a(Call call, Response response) throws IOException;

    void c(Call call, IOException iOException);
}
