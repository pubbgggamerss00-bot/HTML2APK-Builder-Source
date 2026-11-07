package l5;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ya.b f16727a = new ya.b();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f16728b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f16729c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f16730d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                androidx.documentfile.provider.a.a(autoCloseable);
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }
}
