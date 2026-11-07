package w2;

import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.LruCache;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final File f14972a;

    /* renamed from: d, reason: collision with root package name */
    public ParcelFileDescriptor f14975d;

    /* renamed from: e, reason: collision with root package name */
    public PdfRenderer f14976e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f14977f;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f14973b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f14974c = Executors.newSingleThreadExecutor();

    /* renamed from: g, reason: collision with root package name */
    public final a f14978g = new a(16777216);

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a extends LruCache<Integer, Bitmap> {
        @Override // android.util.LruCache
        public final int sizeOf(Integer num, Bitmap bitmap) {
            num.intValue();
            Bitmap bitmap2 = bitmap;
            kotlin.jvm.internal.j.e("value", bitmap2);
            return bitmap2.getAllocationByteCount();
        }
    }

    public q0(File file) {
        this.f14972a = file;
    }
}
