package androidx.emoji2.text;

import androidx.emoji2.text.g;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i extends g.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g.i f1010a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f1011b;

    public i(g.i iVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f1010a = iVar;
        this.f1011b = threadPoolExecutor;
    }

    @Override // androidx.emoji2.text.g.i
    public final void a(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f1011b;
        try {
            this.f1010a.a(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // androidx.emoji2.text.g.i
    public final void b(o oVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f1011b;
        try {
            this.f1010a.b(oVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
