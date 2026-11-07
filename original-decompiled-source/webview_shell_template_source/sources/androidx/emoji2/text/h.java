package androidx.emoji2.text;

import android.os.Handler;
import androidx.activity.ComponentActivity;
import androidx.core.content.FileProvider;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.g;
import androidx.emoji2.text.n;
import java.io.File;
import java.util.concurrent.ThreadPoolExecutor;
import m5.d;
import m5.d.b;
import w2.y;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f1007t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1008u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f1009v;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i6) {
        this.s = i6;
        this.f1007t = obj;
        this.f1008u = obj2;
        this.f1009v = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                EmojiCompatInitializer.b bVar = (EmojiCompatInitializer.b) this.f1007t;
                g.i iVar = (g.i) this.f1008u;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f1009v;
                try {
                    n nVarA = d.a(bVar.f985a);
                    if (nVarA == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    n.b bVar2 = (n.b) nVarA.f1003a;
                    synchronized (bVar2.f1031d) {
                        bVar2.f1033f = threadPoolExecutor;
                    }
                    nVarA.f1003a.a(new i(iVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    iVar.a(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            default:
                final ComponentActivity componentActivity = (ComponentActivity) this.f1007t;
                String str = (String) this.f1008u;
                File file = (File) this.f1009v;
                Handler handler = y.f15051a;
                try {
                    File file2 = new File(componentActivity.getCacheDir(), "pdf_share");
                    d.b bVar3 = new m5.d(file2, m5.e.f13900t).new b();
                    while (true) {
                        boolean z6 = true;
                        while (bVar3.hasNext()) {
                            File next = bVar3.next();
                            if ((next.delete() || !next.exists()) && z6) {
                                break;
                            } else {
                                z6 = false;
                            }
                        }
                        file2.mkdirs();
                        File file3 = new File(file2, y.b(str));
                        m5.f.i(file, file3);
                        handler.post(new androidx.camera.core.processing.j(componentActivity, FileProvider.getUriForFile(componentActivity, componentActivity.getPackageName() + ".fileprovider", file3), file3, 3));
                        return;
                        break;
                    }
                } catch (Exception e6) {
                    handler.post(new Runnable() { // from class: w2.x
                        @Override // java.lang.Runnable
                        public final void run() {
                            y.a(componentActivity, e6);
                        }
                    });
                    return;
                }
                break;
        }
    }
}
