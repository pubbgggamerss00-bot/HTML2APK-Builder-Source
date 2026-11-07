package dc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class u extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IBinder f7849b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f7850c;

    public u(w wVar, IBinder iBinder) {
        this.f7850c = wVar;
        this.f7849b = iBinder;
    }

    @Override // dc.o
    public final void a() throws RemoteException {
        h fVar;
        x xVar = this.f7850c.f7852a;
        int i10 = g.f7832a;
        IBinder iBinder = this.f7849b;
        if (iBinder == null) {
            fVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            fVar = iInterfaceQueryLocalInterface instanceof h ? (h) iInterfaceQueryLocalInterface : new f(iBinder);
        }
        xVar.f7866m = fVar;
        n nVar = xVar.f7855b;
        int i11 = 0;
        nVar.c("linkToDeath", new Object[0]);
        try {
            xVar.f7866m.asBinder().linkToDeath(xVar.f7863j, 0);
        } catch (RemoteException e10) {
            nVar.b(e10, "linkToDeath failed", new Object[0]);
        }
        xVar.f7860g = false;
        ArrayList arrayList = xVar.f7857d;
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((Runnable) obj).run();
        }
        xVar.f7857d.clear();
    }
}
