package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import x4.m;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f2197j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile d f2198k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f2199a;

    /* renamed from: b, reason: collision with root package name */
    public final p.b f2200b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f2201c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f2202d;

    /* renamed from: e, reason: collision with root package name */
    public final a f2203e;

    /* renamed from: f, reason: collision with root package name */
    public final h f2204f;

    /* renamed from: g, reason: collision with root package name */
    public final C0029d f2205g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2206h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.emoji2.text.b f2207i;

    public static final class a extends b {

        /* renamed from: b, reason: collision with root package name */
        public volatile androidx.emoji2.text.f f2208b;

        /* renamed from: c, reason: collision with root package name */
        public volatile androidx.emoji2.text.h f2209c;
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final d f2210a;

        public b(d dVar) {
            this.f2210a = dVar;
        }
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final h f2211a;

        /* renamed from: b, reason: collision with root package name */
        public int f2212b = 0;

        /* renamed from: c, reason: collision with root package name */
        public final androidx.emoji2.text.b f2213c = new androidx.emoji2.text.b();

        public c(h hVar) {
            this.f2211a = hVar;
        }
    }

    /* renamed from: androidx.emoji2.text.d$d, reason: collision with other inner class name */
    public static class C0029d implements j {
    }

    public interface e {
    }

    public static abstract class f {
        public void a() {
        }

        public void b() {
        }
    }

    public static class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f2214a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2215b;

        public g(List list, int i10, Throwable th2) {
            x3.e.a(list, "initCallbacks cannot be null");
            this.f2214a = new ArrayList(list);
            this.f2215b = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f2214a;
            int size = arrayList.size();
            int i10 = 0;
            if (this.f2215b != 1) {
                while (i10 < size) {
                    ((f) arrayList.get(i10)).a();
                    i10++;
                }
            } else {
                while (i10 < size) {
                    ((f) arrayList.get(i10)).b();
                    i10++;
                }
            }
        }
    }

    public interface h {
        void a(i iVar);
    }

    public static abstract class i {
        public abstract void a(Throwable th2);

        public abstract void b(androidx.emoji2.text.h hVar);
    }

    public interface j {
    }

    public d(EmojiCompatInitializer.a aVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f2199a = reentrantReadWriteLock;
        this.f2201c = 3;
        h hVar = aVar.f2211a;
        this.f2204f = hVar;
        int i10 = aVar.f2212b;
        this.f2206h = i10;
        this.f2207i = aVar.f2213c;
        this.f2202d = new Handler(Looper.getMainLooper());
        this.f2200b = new p.b(0);
        this.f2205g = new C0029d();
        a aVar2 = new a(this);
        this.f2203e = aVar2;
        reentrantReadWriteLock.writeLock().lock();
        if (i10 == 0) {
            try {
                this.f2201c = 0;
            } catch (Throwable th2) {
                this.f2199a.writeLock().unlock();
                throw th2;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                hVar.a(new androidx.emoji2.text.c(aVar2));
            } catch (Throwable th3) {
                f(th3);
            }
        }
    }

    public static d a() {
        d dVar;
        synchronized (f2197j) {
            try {
                dVar = f2198k;
                if (!(dVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return dVar;
    }

    public static boolean d() {
        return f2198k != null;
    }

    public final int b(CharSequence charSequence, int i10) {
        if (!(c() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        x3.e.a(charSequence, "charSequence cannot be null");
        androidx.emoji2.text.f fVar = this.f2203e.f2208b;
        fVar.getClass();
        if (i10 < 0 || i10 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            x4.g[] gVarArr = (x4.g[]) spanned.getSpans(i10, i10 + 1, x4.g.class);
            if (gVarArr.length > 0) {
                return spanned.getSpanStart(gVarArr[0]);
            }
        }
        return ((f.c) fVar.c(charSequence, Math.max(0, i10 - 16), Math.min(charSequence.length(), i10 + 16), Integer.MAX_VALUE, true, new f.c(i10))).f2224b;
    }

    public final int c() {
        this.f2199a.readLock().lock();
        try {
            return this.f2201c;
        } finally {
            this.f2199a.readLock().unlock();
        }
    }

    public final void e() {
        if (!(this.f2206h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (c() == 1) {
            return;
        }
        this.f2199a.writeLock().lock();
        try {
            if (this.f2201c == 0) {
                return;
            }
            this.f2201c = 0;
            this.f2199a.writeLock().unlock();
            a aVar = this.f2203e;
            d dVar = aVar.f2210a;
            try {
                dVar.f2204f.a(new androidx.emoji2.text.c(aVar));
            } catch (Throwable th2) {
                dVar.f(th2);
            }
        } finally {
            this.f2199a.writeLock().unlock();
        }
    }

    public final void f(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f2199a.writeLock().lock();
        try {
            this.f2201c = 2;
            arrayList.addAll(this.f2200b);
            this.f2200b.clear();
            this.f2199a.writeLock().unlock();
            this.f2202d.post(new g(arrayList, this.f2201c, th2));
        } catch (Throwable th3) {
            this.f2199a.writeLock().unlock();
            throw th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c A[Catch: all -> 0x007f, TRY_ENTER, TryCatch #2 {all -> 0x007f, blocks: (B:38:0x0057, B:41:0x005c, B:43:0x0060, B:45:0x006d, B:52:0x008c, B:54:0x0096, B:56:0x0099, B:58:0x009c, B:60:0x00ac, B:61:0x00af), top: B:105:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c A[Catch: all -> 0x007f, TryCatch #2 {all -> 0x007f, blocks: (B:38:0x0057, B:41:0x005c, B:43:0x0060, B:45:0x006d, B:52:0x008c, B:54:0x0096, B:56:0x0099, B:58:0x009c, B:60:0x00ac, B:61:0x00af), top: B:105:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00be A[Catch: all -> 0x00f0, TRY_ENTER, TryCatch #0 {all -> 0x00f0, blocks: (B:65:0x00be, B:68:0x00c6, B:50:0x0082), top: B:101:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence g(int i10, int i11, int i12, CharSequence charSequence) {
        CharSequence charSequence2;
        Throwable th2;
        int i13;
        int i14;
        x4.g[] gVarArr;
        if (!(c() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        if (!(i10 <= i11)) {
            throw new IllegalArgumentException("start should be <= than end");
        }
        m mVar = null;
        if (charSequence == null) {
            return null;
        }
        if (!(i10 <= charSequence.length())) {
            throw new IllegalArgumentException("start should be < than charSequence length");
        }
        if (!(i11 <= charSequence.length())) {
            throw new IllegalArgumentException("end should be < than charSequence length");
        }
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        boolean z10 = i12 == 1;
        androidx.emoji2.text.f fVar = this.f2203e.f2208b;
        fVar.getClass();
        boolean z11 = charSequence instanceof x4.j;
        if (z11) {
            ((x4.j) charSequence).a();
        }
        if (z11) {
            mVar = new m((Spannable) charSequence);
            if (mVar != null) {
            }
            i13 = i10;
            i14 = i11;
            if (i13 == i14) {
            }
            ((x4.j) charSequence2).b();
            return charSequence2;
        }
        try {
            if (!(charSequence instanceof Spannable)) {
                if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i10 - 1, i11 + 1, x4.g.class) <= i11) {
                    mVar = new m();
                    mVar.f32075a = false;
                    mVar.f32076b = new SpannableString(charSequence);
                }
                if (mVar != null) {
                    while (i < r3) {
                    }
                }
                i13 = i10;
                i14 = i11;
                if (i13 == i14) {
                    charSequence2 = charSequence;
                    if (!z11) {
                    }
                }
                ((x4.j) charSequence2).b();
                return charSequence2;
            }
            try {
                mVar = new m((Spannable) charSequence);
                if (mVar != null && (gVarArr = (x4.g[]) mVar.f32076b.getSpans(i10, i11, x4.g.class)) != null && gVarArr.length > 0) {
                    for (x4.g gVar : gVarArr) {
                        int spanStart = mVar.f32076b.getSpanStart(gVar);
                        int spanEnd = mVar.f32076b.getSpanEnd(gVar);
                        if (spanStart != i11) {
                            mVar.removeSpan(gVar);
                        }
                        i10 = Math.min(spanStart, i10);
                        i11 = Math.max(spanEnd, i11);
                    }
                }
                i13 = i10;
                i14 = i11;
                if (i13 == i14 || i13 >= charSequence.length()) {
                    charSequence2 = charSequence;
                    if (!z11) {
                        return charSequence2;
                    }
                } else {
                    charSequence2 = charSequence;
                    try {
                        m mVar2 = (m) fVar.c(charSequence2, i13, i14, Integer.MAX_VALUE, z10, new f.a(mVar, fVar.f2218a));
                        if (mVar2 != null) {
                            Spannable spannable = mVar2.f32076b;
                            if (z11) {
                                ((x4.j) charSequence2).b();
                            }
                            return spannable;
                        }
                        if (!z11) {
                            return charSequence2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th2 = th;
                        if (!z11) {
                        }
                    }
                }
                ((x4.j) charSequence2).b();
                return charSequence2;
            } catch (Throwable th4) {
                th = th4;
                charSequence2 = charSequence;
                th2 = th;
                if (!z11) {
                }
            }
        } catch (Throwable th5) {
            th2 = th5;
            charSequence2 = charSequence;
        }
        if (!z11) {
            throw th2;
        }
        ((x4.j) charSequence2).b();
        throw th2;
    }

    public final void h(f fVar) {
        x3.e.a(fVar, "initCallback cannot be null");
        this.f2199a.writeLock().lock();
        try {
            if (this.f2201c == 1 || this.f2201c == 2) {
                this.f2202d.post(new g(Arrays.asList(fVar), this.f2201c, null));
            } else {
                this.f2200b.add(fVar);
            }
            this.f2199a.writeLock().unlock();
        } catch (Throwable th2) {
            this.f2199a.writeLock().unlock();
            throw th2;
        }
    }

    public final void i(EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        a aVar = this.f2203e;
        aVar.getClass();
        Bundle bundle = editorInfo.extras;
        y4.b bVar = aVar.f2209c.f2242a;
        int iA = bVar.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? bVar.f33936b.getInt(iA + bVar.f33935a) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
