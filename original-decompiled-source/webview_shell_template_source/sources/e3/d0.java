package e3;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class d0<T> extends w {

    /* renamed from: b, reason: collision with root package name */
    public final v3.f<T> f12873b;

    public d0(v3.f fVar) {
        super(4);
        this.f12873b = fVar;
    }

    @Override // e3.g0
    public final void a(Status status) {
        this.f12873b.a(new d3.b(status));
    }

    @Override // e3.g0
    public final void b(Exception exc) {
        this.f12873b.a(exc);
    }

    @Override // e3.g0
    public final void c(r<?> rVar) throws DeadObjectException {
        try {
            h(rVar);
        } catch (DeadObjectException e6) {
            a(g0.e(e6));
            throw e6;
        } catch (RemoteException e7) {
            a(g0.e(e7));
        } catch (RuntimeException e8) {
            this.f12873b.a(e8);
        }
    }

    public abstract void h(r<?> rVar);
}
