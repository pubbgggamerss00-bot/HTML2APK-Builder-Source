package m;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import z4.g;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final z4.a f17134a;

    public g(c cVar) {
        this.f17134a = new z4.a(cVar);
    }

    public final KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        this.f17134a.f34744a.getClass();
        if (keyListener instanceof z4.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new z4.e(keyListener);
    }

    public final void b(boolean z10) {
        z4.g gVar = this.f17134a.f34744a.f34746b;
        if (gVar.f34765c != z10) {
            if (gVar.f34764b != null) {
                androidx.emoji2.text.d dVarA = androidx.emoji2.text.d.a();
                g.a aVar = gVar.f34764b;
                dVarA.getClass();
                x3.e.a(aVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = dVarA.f2199a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    dVarA.f2200b.remove(aVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            gVar.f34765c = z10;
            if (z10) {
                z4.g.a(gVar.f34763a, androidx.emoji2.text.d.a().c());
            }
        }
    }
}
