package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1296a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f1297b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f1298c = false;

    public static void a(Object obj) throws IOException {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e6) {
                throw new RuntimeException(e6);
            }
        }
    }

    public void b() {
    }
}
