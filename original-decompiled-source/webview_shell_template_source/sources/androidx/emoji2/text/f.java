package androidx.emoji2.text;

import android.os.Build;
import androidx.emoji2.text.g;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f extends g.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g.a f989a;

    public f(g.a aVar) {
        this.f989a = aVar;
    }

    @Override // androidx.emoji2.text.g.i
    public final void a(Throwable th) {
        this.f989a.f1002a.d(th);
    }

    @Override // androidx.emoji2.text.g.i
    public final void b(o oVar) {
        g.a aVar = this.f989a;
        aVar.f1001c = oVar;
        o oVar2 = aVar.f1001c;
        g gVar = aVar.f1002a;
        aVar.f1000b = new l(oVar2, gVar.f998g, gVar.f999i, Build.VERSION.SDK_INT >= 34 ? j.a() : k.a());
        g gVar2 = aVar.f1002a;
        gVar2.getClass();
        ArrayList arrayList = new ArrayList();
        gVar2.f992a.writeLock().lock();
        try {
            gVar2.f994c = 1;
            arrayList.addAll(gVar2.f993b);
            gVar2.f993b.clear();
            gVar2.f992a.writeLock().unlock();
            gVar2.f995d.post(new g.RunnableC0013g(arrayList, gVar2.f994c, null));
        } catch (Throwable th) {
            gVar2.f992a.writeLock().unlock();
            throw th;
        }
    }
}
