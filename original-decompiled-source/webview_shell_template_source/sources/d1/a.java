package d1;

import android.os.Looper;
import android.view.Choreographer;
import androidx.camera.core.processing.p;
import java.util.ArrayList;
import w.g;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
    public static final ThreadLocal<a> f12665i = new ThreadLocal<>();

    /* renamed from: e, reason: collision with root package name */
    public final d f12670e;
    public c h;

    /* renamed from: a, reason: collision with root package name */
    public final g<b, Long> f12666a = new g<>();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f12667b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final C0043a f12668c = new C0043a();

    /* renamed from: d, reason: collision with root package name */
    public final p f12669d = new p(6, this);

    /* renamed from: f, reason: collision with root package name */
    public boolean f12671f = false;

    /* renamed from: g, reason: collision with root package name */
    public float f12672g = 1.0f;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: d1.a$a, reason: collision with other inner class name */
    public class C0043a {
        public C0043a() {
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface b {
        boolean a(long j6);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class c {

        /* renamed from: a, reason: collision with root package name */
        public d1.b f12674a;

        public c() {
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final Choreographer f12676a = Choreographer.getInstance();

        /* renamed from: b, reason: collision with root package name */
        public final Looper f12677b = Looper.myLooper();
    }

    public a(d dVar) {
        this.f12670e = dVar;
    }
}
