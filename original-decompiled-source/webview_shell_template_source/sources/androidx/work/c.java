package androidx.work;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f1756a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new androidx.work.b(false));

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f1757b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new androidx.work.b(true));

    /* renamed from: c, reason: collision with root package name */
    public final s f1758c;

    /* renamed from: d, reason: collision with root package name */
    public final j f1759d;

    /* renamed from: e, reason: collision with root package name */
    public final j2.a f1760e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1761f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1762g;
    public final int h;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface b {
        c a();
    }

    public c(a aVar) {
        String str = t.f1855a;
        this.f1758c = new s();
        this.f1759d = new j();
        this.f1760e = new j2.a();
        this.f1761f = 4;
        this.f1762g = Integer.MAX_VALUE;
        this.h = 20;
    }
}
