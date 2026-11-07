package g;

import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import w.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class f {
    public static final c s = new c(new d());

    /* renamed from: t, reason: collision with root package name */
    public static final int f13078t = -100;

    /* renamed from: u, reason: collision with root package name */
    public static q0.g f13079u = null;

    /* renamed from: v, reason: collision with root package name */
    public static q0.g f13080v = null;

    /* renamed from: w, reason: collision with root package name */
    public static Boolean f13081w = null;

    /* renamed from: x, reason: collision with root package name */
    public static boolean f13082x = false;

    /* renamed from: y, reason: collision with root package name */
    public static final w.b<WeakReference<f>> f13083y = new w.b<>(0);

    /* renamed from: z, reason: collision with root package name */
    public static final Object f13084z = new Object();
    public static final Object A = new Object();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c implements Executor {
        public final Object s = new Object();

        /* renamed from: t, reason: collision with root package name */
        public final ArrayDeque f13085t = new ArrayDeque();

        /* renamed from: u, reason: collision with root package name */
        public final d f13086u;

        /* renamed from: v, reason: collision with root package name */
        public Runnable f13087v;

        public c(d dVar) {
            this.f13086u = dVar;
        }

        public final void a() {
            synchronized (this.s) {
                try {
                    Runnable runnable = (Runnable) this.f13085t.poll();
                    this.f13087v = runnable;
                    if (runnable != null) {
                        this.f13086u.execute(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            synchronized (this.s) {
                try {
                    this.f13085t.add(new androidx.camera.camera2.interop.d(6, this, runnable));
                    if (this.f13087v == null) {
                        a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class d implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    public static boolean i(Context context) {
        if (f13081w == null) {
            try {
                int i6 = AppLocalesMetadataHolderService.s;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), AppLocalesMetadataHolderService.a.a() | 128).metaData;
                if (bundle != null) {
                    f13081w = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f13081w = Boolean.FALSE;
            }
        }
        return f13081w.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void m(f fVar) {
        synchronized (f13084z) {
            try {
                w.b<WeakReference<f>> bVar = f13083y;
                bVar.getClass();
                b.a aVar = new b.a();
                while (aVar.hasNext()) {
                    f fVar2 = (f) ((WeakReference) aVar.next()).get();
                    if (fVar2 == fVar || fVar2 == null) {
                        aVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public abstract <T extends View> T d(int i6);

    public Context e() {
        return null;
    }

    public int f() {
        return -100;
    }

    public abstract void g();

    public abstract void h();

    public abstract void j();

    public abstract void k();

    public abstract void l();

    public abstract boolean n(int i6);

    public abstract void o(int i6);

    public abstract void p(View view);

    public abstract void q(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void r(CharSequence charSequence);
}
