package androidx.emoji2.text;

import androidx.emoji2.text.d;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class e extends d.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d.i f2216a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f2217b;

    public e(d.i iVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f2216a = iVar;
        this.f2217b = threadPoolExecutor;
    }

    @Override // androidx.emoji2.text.d.i
    public final void a(Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.f2217b;
        try {
            this.f2216a.a(th2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // androidx.emoji2.text.d.i
    public final void b(h hVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f2217b;
        try {
            this.f2216a.b(hVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
