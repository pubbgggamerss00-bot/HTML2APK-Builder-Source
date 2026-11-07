package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Trace;
import androidx.emoji2.text.d;
import androidx.emoji2.text.g;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r3.a0;
import r3.b0;
import r3.u;
import v3.k;
import v3.l;

/* loaded from: classes.dex */
public final class g extends d.c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f2233d = new a();

    public static class a {
    }

    public static class b implements d.h {

        /* renamed from: a, reason: collision with root package name */
        public final Context f2234a;

        /* renamed from: b, reason: collision with root package name */
        public final v3.e f2235b;

        /* renamed from: c, reason: collision with root package name */
        public final a f2236c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f2237d = new Object();

        /* renamed from: e, reason: collision with root package name */
        public Handler f2238e;

        /* renamed from: f, reason: collision with root package name */
        public ThreadPoolExecutor f2239f;

        /* renamed from: g, reason: collision with root package name */
        public ThreadPoolExecutor f2240g;

        /* renamed from: h, reason: collision with root package name */
        public d.i f2241h;

        public b(Context context, v3.e eVar) {
            x3.e.a(context, "Context cannot be null");
            this.f2234a = context.getApplicationContext();
            this.f2235b = eVar;
            this.f2236c = g.f2233d;
        }

        @Override // androidx.emoji2.text.d.h
        public final void a(d.i iVar) {
            synchronized (this.f2237d) {
                this.f2241h = iVar;
            }
            synchronized (this.f2237d) {
                try {
                    if (this.f2241h == null) {
                        return;
                    }
                    if (this.f2239f == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new x4.a("emojiCompat"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.f2240g = threadPoolExecutor;
                        this.f2239f = threadPoolExecutor;
                    }
                    this.f2239f.execute(new Runnable() { // from class: x4.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            g.b bVar = this.f32065a;
                            synchronized (bVar.f2237d) {
                                try {
                                    if (bVar.f2241h == null) {
                                        return;
                                    }
                                    try {
                                        v3.l lVarC = bVar.c();
                                        int i10 = lVarC.f30598f;
                                        if (i10 == 2) {
                                            synchronized (bVar.f2237d) {
                                            }
                                        }
                                        if (i10 != 0) {
                                            throw new RuntimeException("fetchFonts result is not OK. (" + i10 + ")");
                                        }
                                        try {
                                            int i11 = u3.i.f29248a;
                                            Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                            g.a aVar = bVar.f2236c;
                                            Context context = bVar.f2234a;
                                            aVar.getClass();
                                            v3.l[] lVarArr = {lVarC};
                                            a0 a0Var = u.f23169a;
                                            Trace.beginSection(m6.a.c("TypefaceCompat.createFromFontInfo"));
                                            try {
                                                Typeface typefaceB = u.f23169a.b(context, lVarArr, 0);
                                                Trace.endSection();
                                                MappedByteBuffer mappedByteBufferD = b0.d(bVar.f2234a, lVarC.f30593a);
                                                if (mappedByteBufferD == null || typefaceB == null) {
                                                    throw new RuntimeException("Unable to open file.");
                                                }
                                                try {
                                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                                    androidx.emoji2.text.h hVar = new androidx.emoji2.text.h(typefaceB, i.a(mappedByteBufferD));
                                                    Trace.endSection();
                                                    synchronized (bVar.f2237d) {
                                                        try {
                                                            d.i iVar2 = bVar.f2241h;
                                                            if (iVar2 != null) {
                                                                iVar2.b(hVar);
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                    bVar.b();
                                                } finally {
                                                    int i12 = u3.i.f29248a;
                                                }
                                            } finally {
                                                Trace.endSection();
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    } catch (Throwable th3) {
                                        synchronized (bVar.f2237d) {
                                            try {
                                                d.i iVar3 = bVar.f2241h;
                                                if (iVar3 != null) {
                                                    iVar3.a(th3);
                                                }
                                                bVar.b();
                                            } finally {
                                            }
                                        }
                                    }
                                } finally {
                                }
                            }
                        }
                    });
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void b() {
            synchronized (this.f2237d) {
                try {
                    this.f2241h = null;
                    Handler handler = this.f2238e;
                    if (handler != null) {
                        handler.removeCallbacks(null);
                    }
                    this.f2238e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f2240g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f2239f = null;
                    this.f2240g = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final l c() {
            try {
                a aVar = this.f2236c;
                Context context = this.f2234a;
                v3.e eVar = this.f2235b;
                aVar.getClass();
                Object[] objArr = {eVar};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                k kVarA = v3.d.a(context, Collections.unmodifiableList(arrayList));
                int i10 = kVarA.f30591a;
                if (i10 != 0) {
                    throw new RuntimeException(ad.b.b(i10, "fetchFonts failed (", ")"));
                }
                l[] lVarArr = kVarA.f30592b.get(0);
                if (lVarArr == null || lVarArr.length == 0) {
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                return lVarArr[0];
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }
    }
}
