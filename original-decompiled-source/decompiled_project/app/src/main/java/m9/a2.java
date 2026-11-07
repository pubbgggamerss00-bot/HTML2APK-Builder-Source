package m9;

import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.LruCache;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public final File f17725a;

    /* renamed from: d, reason: collision with root package name */
    public ParcelFileDescriptor f17728d;

    /* renamed from: e, reason: collision with root package name */
    public PdfRenderer f17729e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f17730f;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f17726b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f17727c = Executors.newSingleThreadExecutor();

    /* renamed from: g, reason: collision with root package name */
    public final a f17731g = new a(16777216);

    public static final class a extends LruCache<Integer, Bitmap> {
        @Override // android.util.LruCache
        public final int sizeOf(Integer num, Bitmap bitmap) {
            num.intValue();
            Bitmap value = bitmap;
            kotlin.jvm.internal.r.e(value, "value");
            return value.getAllocationByteCount();
        }
    }

    public a2(File file) {
        this.f17725a = file;
    }
}
