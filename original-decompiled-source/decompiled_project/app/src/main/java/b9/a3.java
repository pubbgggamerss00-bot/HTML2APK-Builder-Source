package b9;

import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.LruCache;
import java.io.Closeable;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class a3 implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final File f3729a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f3730b;

    /* renamed from: c, reason: collision with root package name */
    public final ph.k1 f3731c;

    /* renamed from: d, reason: collision with root package name */
    public ParcelFileDescriptor f3732d;

    /* renamed from: e, reason: collision with root package name */
    public PdfRenderer f3733e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f3734f;

    /* renamed from: g, reason: collision with root package name */
    public final a f3735g;

    public static final class a extends LruCache<Integer, Bitmap> {
        @Override // android.util.LruCache
        public final int sizeOf(Integer num, Bitmap bitmap) {
            num.intValue();
            Bitmap value = bitmap;
            kotlin.jvm.internal.r.e(value, "value");
            return value.getAllocationByteCount();
        }
    }

    public a3(File file) {
        kotlin.jvm.internal.r.e(file, "file");
        this.f3729a = file;
        ExecutorService executor = Executors.newSingleThreadExecutor();
        this.f3730b = executor;
        kotlin.jvm.internal.r.d(executor, "executor");
        this.f3731c = new ph.k1(executor);
        this.f3735g = new a(16777216);
    }

    public static final Bitmap h(a3 a3Var, int i10, int i11) {
        if (a3Var.f3734f) {
            return null;
        }
        try {
            PdfRenderer pdfRenderer = a3Var.f3733e;
            if (pdfRenderer == null) {
                ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(a3Var.f3729a, 268435456);
                a3Var.f3732d = parcelFileDescriptorOpen;
                PdfRenderer pdfRenderer2 = new PdfRenderer(parcelFileDescriptorOpen);
                a3Var.f3733e = pdfRenderer2;
                pdfRenderer = pdfRenderer2;
            }
            PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(i10);
            try {
                float height = pageOpenPage.getHeight();
                int width = pageOpenPage.getWidth();
                if (width < 1) {
                    width = 1;
                }
                float f10 = height / width;
                if (i11 * i11 * f10 > 4000000.0f) {
                    i11 = (int) Math.sqrt(4000000.0f / f10);
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11, jh.j.m(gh.a.b(i11 * f10), 1, i11 * 4), Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.eraseColor(-1);
                pageOpenPage.render(bitmapCreateBitmap, null, null, 1);
                ch.a.a(pageOpenPage, null);
                return bitmapCreateBitmap;
            } finally {
            }
        } catch (Exception e10) {
            Log.w("PdfThumbnails", "Cannot render page " + i10, e10);
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        l(false);
    }

    public final void l(final boolean z10) {
        if (this.f3734f) {
            return;
        }
        this.f3734f = true;
        this.f3730b.execute(new Runnable() { // from class: b9.z2
            @Override // java.lang.Runnable
            public final void run() {
                a3 a3Var = this.f4192a;
                try {
                    PdfRenderer pdfRenderer = a3Var.f3733e;
                    if (pdfRenderer != null) {
                        pdfRenderer.close();
                        pg.f0 f0Var = pg.f0.f21461a;
                    }
                } catch (Throwable th2) {
                    pg.q.a(th2);
                }
                try {
                    ParcelFileDescriptor parcelFileDescriptor = a3Var.f3732d;
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                        pg.f0 f0Var2 = pg.f0.f21461a;
                    }
                } catch (Throwable th3) {
                    pg.q.a(th3);
                }
                a3Var.f3735g.evictAll();
                if (z10) {
                    a3Var.f3729a.delete();
                }
            }
        });
        this.f3730b.shutdown();
    }

    public final Object p(int i10, vg.i iVar) {
        Bitmap bitmap = this.f3735g.get(new Integer(i10));
        if (bitmap != null) {
            return bitmap;
        }
        if (this.f3734f) {
            return null;
        }
        return ph.h.e(this.f3731c, new b3(this, i10, null), iVar);
    }
}
