package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f990j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile g f991k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f992a;

    /* renamed from: b, reason: collision with root package name */
    public final w.b f993b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f994c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f995d;

    /* renamed from: e, reason: collision with root package name */
    public final a f996e;

    /* renamed from: f, reason: collision with root package name */
    public final h f997f;

    /* renamed from: g, reason: collision with root package name */
    public final d f998g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.emoji2.text.e f999i;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a extends b {

        /* renamed from: b, reason: collision with root package name */
        public volatile l f1000b;

        /* renamed from: c, reason: collision with root package name */
        public volatile o f1001c;
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final g f1002a;

        public b(g gVar) {
            this.f1002a = gVar;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final h f1003a;

        /* renamed from: b, reason: collision with root package name */
        public int f1004b = 0;

        /* renamed from: c, reason: collision with root package name */
        public final androidx.emoji2.text.e f1005c = new androidx.emoji2.text.e();

        public c(h hVar) {
            this.f1003a = hVar;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class d implements j {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface e {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: androidx.emoji2.text.g$g, reason: collision with other inner class name */
    public static class RunnableC0013g implements Runnable {
        public final ArrayList s;

        /* renamed from: t, reason: collision with root package name */
        public final int f1006t;

        public RunnableC0013g(List list, int i6, Throwable th) {
            androidx.work.j.e("initCallbacks cannot be null", list);
            this.s = new ArrayList(list);
            this.f1006t = i6;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.s;
            int size = arrayList.size();
            int i6 = 0;
            if (this.f1006t != 1) {
                while (i6 < size) {
                    ((f) arrayList.get(i6)).getClass();
                    i6++;
                }
            } else {
                while (i6 < size) {
                    ((f) arrayList.get(i6)).a();
                    i6++;
                }
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface h {
        void a(i iVar);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class i {
        public abstract void a(Throwable th);

        public abstract void b(o oVar);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface j {
    }

    public g(EmojiCompatInitializer.a aVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f992a = reentrantReadWriteLock;
        this.f994c = 3;
        h hVar = aVar.f1003a;
        this.f997f = hVar;
        int i6 = aVar.f1004b;
        this.h = i6;
        this.f999i = aVar.f1005c;
        this.f995d = new Handler(Looper.getMainLooper());
        this.f993b = new w.b(0);
        this.f998g = new d();
        a aVar2 = new a(this);
        this.f996e = aVar2;
        reentrantReadWriteLock.writeLock().lock();
        if (i6 == 0) {
            try {
                this.f994c = 0;
            } catch (Throwable th) {
                this.f992a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                hVar.a(new androidx.emoji2.text.f(aVar2));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static g a() {
        g gVar;
        synchronized (f990j) {
            gVar = f991k;
            androidx.work.j.f("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", gVar != null);
        }
        return gVar;
    }

    public final int b() {
        this.f992a.readLock().lock();
        try {
            return this.f994c;
        } finally {
            this.f992a.readLock().unlock();
        }
    }

    public final void c() {
        androidx.work.j.f("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", this.h == 1);
        if (b() == 1) {
            return;
        }
        this.f992a.writeLock().lock();
        try {
            if (this.f994c == 0) {
                return;
            }
            this.f994c = 0;
            this.f992a.writeLock().unlock();
            a aVar = this.f996e;
            g gVar = aVar.f1002a;
            try {
                gVar.f997f.a(new androidx.emoji2.text.f(aVar));
            } catch (Throwable th) {
                gVar.d(th);
            }
        } finally {
            this.f992a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f992a.writeLock().lock();
        try {
            this.f994c = 2;
            arrayList.addAll(this.f993b);
            this.f993b.clear();
            this.f992a.writeLock().unlock();
            this.f995d.post(new RunnableC0013g(arrayList, this.f994c, th));
        } catch (Throwable th2) {
            this.f992a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0092 A[Catch: all -> 0x0085, TRY_ENTER, TryCatch #0 {all -> 0x0085, blocks: (B:32:0x005d, B:35:0x0062, B:37:0x0066, B:39:0x0073, B:46:0x0092, B:48:0x009c, B:50:0x009f, B:52:0x00a2, B:54:0x00b2, B:55:0x00b5), top: B:87:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:32:0x005d, B:35:0x0062, B:37:0x0066, B:39:0x0073, B:46:0x0092, B:48:0x009c, B:50:0x009f, B:52:0x00a2, B:54:0x00b2, B:55:0x00b5), top: B:87:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c4 A[Catch: all -> 0x00f7, TRY_ENTER, TryCatch #1 {all -> 0x00f7, blocks: (B:59:0x00c4, B:62:0x00cc, B:44:0x0088), top: B:89:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence e(CharSequence charSequence, int i6, int i7) throws Throwable {
        Throwable th;
        CharSequence charSequence2;
        int i8;
        int i9;
        m[] mVarArr;
        androidx.work.j.f("Not initialized yet", b() == 1);
        if (i6 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i7 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        androidx.work.j.a("start should be <= than end", i6 <= i7);
        s sVar = null;
        if (charSequence == null) {
            return null;
        }
        androidx.work.j.a("start should be < than charSequence length", i6 <= charSequence.length());
        androidx.work.j.a("end should be < than charSequence length", i7 <= charSequence.length());
        if (charSequence.length() == 0 || i6 == i7) {
            return charSequence;
        }
        l lVar = this.f996e.f1000b;
        lVar.getClass();
        boolean z6 = charSequence instanceof p;
        if (z6) {
            ((p) charSequence).a();
        }
        if (z6) {
            sVar = new s((Spannable) charSequence);
            if (sVar != null) {
            }
            i8 = i6;
            i9 = i7;
            if (i8 == i9) {
            }
            ((p) charSequence2).b();
            return charSequence2;
        }
        try {
            if (!(charSequence instanceof Spannable)) {
                if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i6 - 1, i7 + 1, m.class) <= i7) {
                    sVar = new s();
                    sVar.s = false;
                    sVar.f1048t = new SpannableString(charSequence);
                }
                if (sVar != null) {
                    while (i < r5) {
                    }
                }
                i8 = i6;
                i9 = i7;
                if (i8 == i9) {
                    charSequence2 = charSequence;
                    if (!z6) {
                    }
                }
                ((p) charSequence2).b();
                return charSequence2;
            }
            try {
                sVar = new s((Spannable) charSequence);
                if (sVar != null && (mVarArr = (m[]) sVar.f1048t.getSpans(i6, i7, m.class)) != null && mVarArr.length > 0) {
                    for (m mVar : mVarArr) {
                        int spanStart = sVar.f1048t.getSpanStart(mVar);
                        int spanEnd = sVar.f1048t.getSpanEnd(mVar);
                        if (spanStart != i7) {
                            sVar.removeSpan(mVar);
                        }
                        i6 = Math.min(spanStart, i6);
                        i7 = Math.max(spanEnd, i7);
                    }
                }
                i8 = i6;
                i9 = i7;
                if (i8 == i9 || i8 >= charSequence.length()) {
                    charSequence2 = charSequence;
                    if (!z6) {
                        return charSequence2;
                    }
                } else {
                    charSequence2 = charSequence;
                    try {
                        s sVar2 = (s) lVar.c(charSequence2, i8, i9, Integer.MAX_VALUE, false, new l.a(sVar, lVar.f1012a));
                        if (sVar2 != null) {
                            Spannable spannable = sVar2.f1048t;
                            if (z6) {
                                ((p) charSequence2).b();
                            }
                            return spannable;
                        }
                        if (!z6) {
                            return charSequence2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        if (!z6) {
                        }
                    }
                }
                ((p) charSequence2).b();
                return charSequence2;
            } catch (Throwable th3) {
                th = th3;
                charSequence2 = charSequence;
                th = th;
                if (!z6) {
                }
            }
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
        }
        if (!z6) {
            throw th;
        }
        ((p) charSequence2).b();
        throw th;
    }

    public final void f(f fVar) {
        androidx.work.j.e("initCallback cannot be null", fVar);
        this.f992a.writeLock().lock();
        try {
            if (this.f994c == 1 || this.f994c == 2) {
                this.f995d.post(new RunnableC0013g(Arrays.asList(fVar), this.f994c, null));
            } else {
                this.f993b.add(fVar);
            }
            this.f992a.writeLock().unlock();
        } catch (Throwable th) {
            this.f992a.writeLock().unlock();
            throw th;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class f {
        public void a() {
        }
    }
}
