package okhttp3.internal.platform.android;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;
import okhttp3.OkHttpClient;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2;
import qg.k0;

/* loaded from: classes2.dex */
public final class AndroidLog {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidLog f19775a = new AndroidLog();

    /* renamed from: b, reason: collision with root package name */
    public static final CopyOnWriteArraySet<Logger> f19776b = new CopyOnWriteArraySet<>();

    /* renamed from: c, reason: collision with root package name */
    public static final Map<String, String> f19777c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = OkHttpClient.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(OkHttpClient.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(Http2.class.getName(), "okhttp.Http2");
        linkedHashMap.put(TaskRunner.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f19777c = k0.j(linkedHashMap);
    }

    private AndroidLog() {
    }
}
