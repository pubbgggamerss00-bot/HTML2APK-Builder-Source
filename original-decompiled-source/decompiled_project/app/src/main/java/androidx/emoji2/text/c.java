package androidx.emoji2.text;

import android.os.Build;
import androidx.emoji2.text.d;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c extends d.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d.a f2196a;

    public c(d.a aVar) {
        this.f2196a = aVar;
    }

    @Override // androidx.emoji2.text.d.i
    public final void a(Throwable th2) {
        this.f2196a.f2210a.f(th2);
    }

    @Override // androidx.emoji2.text.d.i
    public final void b(h hVar) {
        d.a aVar = this.f2196a;
        aVar.f2209c = hVar;
        h hVar2 = aVar.f2209c;
        d dVar = aVar.f2210a;
        aVar.f2208b = new f(hVar2, dVar.f2205g, dVar.f2207i, Build.VERSION.SDK_INT >= 34 ? x4.e.a() : x4.f.a());
        d dVar2 = aVar.f2210a;
        dVar2.getClass();
        ArrayList arrayList = new ArrayList();
        dVar2.f2199a.writeLock().lock();
        try {
            dVar2.f2201c = 1;
            arrayList.addAll(dVar2.f2200b);
            dVar2.f2200b.clear();
            dVar2.f2199a.writeLock().unlock();
            dVar2.f2202d.post(new d.g(arrayList, dVar2.f2201c, null));
        } catch (Throwable th2) {
            dVar2.f2199a.writeLock().unlock();
            throw th2;
        }
    }
}
